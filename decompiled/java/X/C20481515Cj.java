package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: renamed from: X.15Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20481515Cj {
    public final Context LIZ;
    public final EndIncentiveSettlementFragmentV2 LIZIZ;
    public final ScrollView LIZJ;
    public final LinearLayout LIZLLL;
    public final C20480815Cc LJ;
    public int LJII;
    public Function1<? super Boolean, Unit> LJIIIZ;
    public boolean LJIIJ;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public final List<InterfaceC20482815Cw> LJI = new ArrayList();
    public EnumC1321560kUk LJIIIIZZ = EnumC1321560kUk.IDLE;

    public final void LIZ() {
        Iterator<InterfaceC20482815Cw> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            it2.next().release();
        }
        ((ArrayList) this.LJI).clear();
        C786410Ut5.LJJJJJL(this.LIZLLL);
        this.LJII = 0;
    }

    public final void LJ() {
        View childAt;
        if (this.LJII >= ((ArrayList) this.LJI).size()) {
            LIZLLL(true);
            return;
        }
        InterfaceC20482815Cw interfaceC20482815Cw = (InterfaceC20482815Cw) ListProtector.get(this.LJI, this.LJII);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Playing animation for component ");
        sbLIZ.append(this.LJII + 1);
        sbLIZ.append('/');
        sbLIZ.append(((ArrayList) this.LJI).size());
        sbLIZ.append(": ");
        sbLIZ.append(interfaceC20482815Cw.getContainerType().LIZ);
        C20441214yg.LIZIZ("WeakContainerAnimationManager", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LJII;
        if (i < ((ArrayList) this.LJI).size() && (childAt = this.LIZLLL.getChildAt(i)) != null) {
            int top = childAt.getTop() - this.LIZLLL.getPaddingTop();
            int bottom = childAt.getBottom() + this.LIZLLL.getPaddingBottom();
            int scrollY = this.LIZJ.getScrollY();
            int scrollY2 = (this.LIZJ.getScrollY() + this.LIZJ.getHeight()) - this.LIZJ.getPaddingBottom();
            boolean z = top < scrollY;
            boolean z2 = bottom > scrollY2;
            if (z) {
                int iLJ = C13LZ.LJ(top, 0, this.LIZLLL.getHeight() - this.LIZJ.getHeight());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Scrolling to component ");
                sbLIZ2.append(i);
                sbLIZ2.append(" at position ");
                sbLIZ2.append(iLJ);
                C20441214yg.LIZIZ("WeakContainerAnimationManager", C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZJ.smoothScrollTo(0, iLJ);
            } else if (z2) {
                top = bottom - (this.LIZJ.getHeight() - this.LIZJ.getPaddingBottom());
                int iLJ2 = C13LZ.LJ(top, 0, this.LIZLLL.getHeight() - this.LIZJ.getHeight());
                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                sbLIZ22.append("Scrolling to component ");
                sbLIZ22.append(i);
                sbLIZ22.append(" at position ");
                sbLIZ22.append(iLJ2);
                C20441214yg.LIZIZ("WeakContainerAnimationManager", C2188811AlT.LIZIZ(sbLIZ22));
                this.LIZJ.smoothScrollTo(0, iLJ2);
            }
        }
        LIZJ(this.LJII, interfaceC20482815Cw);
        interfaceC20482815Cw.LJ(new AwS432S0200000_31(this, interfaceC20482815Cw, 107));
    }

    public final void LIZIZ(boolean z) {
        String str;
        if (z) {
            this.LIZJ.setOnTouchListener(new View.OnTouchListener() { // from class: X.15Cz
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        } else {
            this.LIZJ.setOnTouchListener(null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scroll ");
        if (z) {
            str = "locked";
        } else {
            str = "unlocked";
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("WeakContainerAnimationManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(boolean z) {
        C20441214yg.LIZIZ("WeakContainerAnimationManager", "All weak container animations completed");
        this.LJIIIIZZ = EnumC1321560kUk.COMPLETED;
        LIZIZ(false);
        if (!this.LJIIJ) {
            Function1<? super Boolean, Unit> function1 = this.LJIIIZ;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z));
            }
            this.LJIIJ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[weak-complete] all components finished -> emit natural=");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("WeakContainerAnimationManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZJ(int i, InterfaceC20482815Cw interfaceC20482815Cw) {
        int width;
        try {
            View childAt = this.LIZLLL.getChildAt(i);
            C20480815Cc c20480815Cc = this.LJ;
            if (c20480815Cc != null) {
                String str = interfaceC20482815Cw.getContainerType().LIZ;
                if (childAt != null && !c20480815Cc.LIZIZ.contains(str)) {
                    float f = c20480815Cc.LIZ;
                    if (childAt.getVisibility() == 0) {
                        if (childAt.getLocalVisibleRect(new Rect()) && (width = childAt.getWidth() * childAt.getHeight()) > 0 && (r3.width() * r3.height()) / width >= f) {
                            c20480815Cc.LIZIZ.add(str);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C20481515Cj(Context context, EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2, ScrollView scrollView, LinearLayout linearLayout, C20480815Cc c20480815Cc) {
        this.LIZ = context;
        this.LIZIZ = endIncentiveSettlementFragmentV2;
        this.LIZJ = scrollView;
        this.LIZLLL = linearLayout;
        this.LJ = c20480815Cc;
    }
}
