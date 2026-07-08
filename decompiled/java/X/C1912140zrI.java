package X;

import Y.ACListenerS162S0100000_28;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912140zrI extends FrameLayout implements InterfaceC1912220zrQ, InterfaceC1912230zrR {
    public final View LL;
    public final FrameLayout LLILLJJLI;
    public final AbstractC1912160zrK LLILLL;

    private final void setPendantType(int i) {
    }

    private final boolean getCollapsing() {
        AbstractC1912160zrK abstractC1912160zrK = this.LLILLL;
        if (abstractC1912160zrK != null) {
            return abstractC1912160zrK.LLJILLL;
        }
        return false;
    }

    public final boolean getClosed() {
        AbstractC1912160zrK abstractC1912160zrK = this.LLILLL;
        if (abstractC1912160zrK != null) {
            return abstractC1912160zrK.LLJIJIL;
        }
        return false;
    }

    public final boolean getCollapsed() {
        AbstractC1912160zrK abstractC1912160zrK = this.LLILLL;
        if (abstractC1912160zrK != null) {
            return abstractC1912160zrK.LLJILJIL;
        }
        return false;
    }

    @Override // X.InterfaceC1912230zrR
    public boolean getTimeLimitState() {
        InterfaceC1912230zrR interfaceC1912230zrR;
        InterfaceC1912220zrQ interfaceC1912220zrQ = this.LLILLL;
        if (!(interfaceC1912220zrQ instanceof InterfaceC1912230zrR) || (interfaceC1912230zrR = (InterfaceC1912230zrR) interfaceC1912220zrQ) == null) {
            return false;
        }
        return interfaceC1912230zrR.getTimeLimitState();
    }

    public final FrameLayout getContent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1912220zrQ
    public final void LIZ(C1911990zr3 c1911990zr3) {
        AbstractC1912160zrK abstractC1912160zrK = this.LLILLL;
        if (abstractC1912160zrK != null) {
            abstractC1912160zrK.LIZ(c1911990zr3);
        }
    }

    public final void LIZIZ(Function0<Unit> function0) {
        AbstractC1912160zrK abstractC1912160zrK = this.LLILLL;
        if (abstractC1912160zrK != null) {
            abstractC1912160zrK.LIZJ(function0);
        }
    }

    @Override // X.InterfaceC1912230zrR
    public void setTimeLimitState(boolean z) {
        InterfaceC1912230zrR interfaceC1912230zrR;
        InterfaceC1912220zrQ interfaceC1912220zrQ = this.LLILLL;
        if ((interfaceC1912220zrQ instanceof InterfaceC1912230zrR) && (interfaceC1912230zrR = (InterfaceC1912230zrR) interfaceC1912220zrQ) != null) {
            interfaceC1912230zrR.setTimeLimitState(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1912140zrI(int i, final C1912000zr4 c1912000zr4, final Context context) {
        super(context, null, 0);
        AbstractC1912160zrK c1912150zrJ = null;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.act, this, true);
        this.LL = viewTd;
        final FrameLayout frameLayout = (FrameLayout) viewTd.findViewById(R.id.q8c);
        this.LLILLJJLI = frameLayout;
        final SmartImageView smartImageView = (SmartImageView) frameLayout.findViewById(R.id.c0q);
        final SmartImageView smartImageView2 = (SmartImageView) frameLayout.findViewById(R.id.vm1);
        C450750Hlx c450750Hlx = (C450750Hlx) frameLayout.findViewById(R.id.c0r);
        C450750Hlx c450750Hlx2 = (C450750Hlx) frameLayout.findViewById(R.id.vm4);
        final View viewFindViewById = frameLayout.findViewById(R.id.e1v);
        final RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.dbz);
        AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(678);
        setPendantType(i);
        c1912000zr4.LJ = aFwS217S0000000_28;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c1912150zrJ = new C1912150zrJ(context, frameLayout, c450750Hlx, c450750Hlx2, viewFindViewById, relativeLayout, c1912000zr4);
                }
            } else {
                c1912150zrJ = new AbstractC1912190zrN(context, frameLayout, smartImageView, smartImageView2, viewFindViewById, relativeLayout, c1912000zr4) { // from class: X.0zrP
                    @Override // X.AbstractC1912160zrK
                    public final void LIZIZ() {
                    }

                    @Override // X.AbstractC1912190zrN
                    public final void LJII(C1331670kl3 c1331670kl3) {
                        c1331670kl3.LIZLLL = true;
                        c1331670kl3.LJIL = Bitmap.Config.ARGB_8888;
                    }
                };
            }
        } else {
            c1912150zrJ = new AbstractC1912190zrN(context, frameLayout, smartImageView, smartImageView2, viewFindViewById, relativeLayout, c1912000zr4) { // from class: X.0zrO
                public List<String> LLJJIII;
                public List<String> LLJJIJI;
                public final ValueAnimator LLJJIJIIJIL;

                @Override // X.AbstractC1912160zrK
                public final void LIZIZ() {
                    ValueAnimator valueAnimator = this.LLJJIJIIJIL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                }

                @Override // X.AbstractC1912190zrN, X.InterfaceC1912220zrQ
                public final void LIZ(C1911990zr3 c1911990zr3) {
                    super.LIZ(c1911990zr3);
                    List<String> list = c1911990zr3.LJFF;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    this.LLJJIII = list;
                    List<String> list2 = c1911990zr3.LJI;
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    this.LLJJIJI = list2;
                    List<String> list3 = null;
                    if (list == null) {
                        list = null;
                    }
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        C1331660kl2.LJIIIZ(it2.next()).LJIILIIL();
                    }
                    List<String> list4 = this.LLJJIJI;
                    if (list4 != null) {
                        list3 = list4;
                    }
                    Iterator<String> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        C1331660kl2.LJIIIZ(it3.next()).LJIILIIL();
                    }
                }

                {
                    SmartImageView smartImageView3 = (SmartImageView) frameLayout.findViewById(R.id.c0t);
                    SmartImageView smartImageView4 = (SmartImageView) frameLayout.findViewById(R.id.vm7);
                    C786410Ut5.Q8(smartImageView3, new ACListenerS162S0100000_28(c1912000zr4, 157));
                    C786410Ut5.Q8(smartImageView4, new ACListenerS162S0100000_28(c1912000zr4, 158));
                    this.LLJJIJIIJIL = ValueAnimator.ofInt(0);
                }
            };
        }
        this.LLILLL = c1912150zrJ;
    }
}
