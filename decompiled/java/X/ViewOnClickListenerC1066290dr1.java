package X;

import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.landpage.embedded.behavior.EmbeddedLandingPageBehavior;
import com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1066290dr1 implements InterfaceC1037610d6l, View.OnClickListener, Handler.Callback, InterfaceC1066340dr6 {
    public static final float LLJILJIL = C418440Gaw.LIZIZ(14);
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final C1037740d6y LL;
    public final InterfaceC1037610d6l LLILLJJLI;
    public C16G0 LLILLL;
    public C21578619ce LLILZ;
    public RadiusLayout LLILZIL;
    public C1066370dr9 LLILZLL;
    public FrameLayout LLIZ;
    public final int[] LLIZLLLIL = new int[2];
    public final BPEAHandler LLJ = new BPEAHandler(Looper.getMainLooper(), this);
    public final C1066320dr4 LLJI = new AbstractC1177930gl5() { // from class: X.0dr4
        @Override // X.AbstractC1177930gl5
        public final void LIZJ(View view, float f) {
            this.LIZ.LJIIIZ(Math.max(0.0f, f));
        }

        @Override // X.AbstractC1177930gl5
        public final void LIZLLL(int i, View view) {
            if (i == 5) {
                this.LIZ.LIZIZ("full_screen_topdown_slide");
            }
        }
    };
    public final C1066330dr5 LLJIJIL = new C16BM() { // from class: X.0dr5
        @Override // X.C16BM
        public final void LIZ(float f) {
            this.LIZ.LJIIIZ(Math.max(0.0f, f));
        }

        @Override // X.C16BM
        public final void LIZIZ(int i) {
            if (i == 4) {
                this.LIZ.LIZIZ("full_screen_slide");
            }
        }
    };

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // X.InterfaceC1037610d6l
    public final boolean LIZ() {
        boolean zLIZ = this.LLILLJJLI.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expand ");
        sbLIZ.append(zLIZ ? "success" : "failed");
        C2188811AlT.LIZIZ(sbLIZ);
        if (zLIZ) {
            LJI(true);
        }
        return zLIZ;
    }

    @Override // X.InterfaceC1037610d6l
    public final boolean LIZLLL() {
        boolean zLIZLLL = this.LLILLJJLI.LIZLLL();
        if (zLIZLLL) {
            LJIIIIZZ();
        }
        return zLIZLLL;
    }

    public final EmbeddedLandingPageBehavior<?> LJII() {
        View childAt;
        ViewGroup.LayoutParams layoutParams;
        C16G1 c16g1;
        C16BC c16bc;
        C16G0 c16g0 = this.LLILLL;
        if (c16g0 == null || (childAt = c16g0.getChildAt(0)) == null || (layoutParams = childAt.getLayoutParams()) == null || !(layoutParams instanceof C16G1) || (c16g1 = (C16G1) layoutParams) == null || (c16bc = c16g1.LIZ) == null || !(c16bc instanceof EmbeddedLandingPageBehavior)) {
            return null;
        }
        return (EmbeddedLandingPageBehavior) c16bc;
    }

    public final void LJIIIIZZ() {
        SwipeToScrollDownBehavior<T> swipeToScrollDownBehavior;
        BottomSheetBehavior<T> bottomSheetBehavior;
        C16G0 c16g0 = this.LLILLL;
        if (c16g0 != null) {
            c16g0.setClickable(false);
        }
        C16G0 c16g02 = this.LLILLL;
        if (c16g02 != null) {
            C786410Ut5.LLILZLL(c16g02, 8);
        }
        C16G0 c16g03 = this.LLILLL;
        if (c16g03 != null) {
            c16g03.setBackgroundColor(0);
        }
        C16G0 c16g04 = this.LLILLL;
        if (c16g04 != null) {
            C786410Ut5.Z7(c16g04, null);
        }
        EmbeddedLandingPageBehavior<?> embeddedLandingPageBehaviorLJII = LJII();
        if (embeddedLandingPageBehaviorLJII != null && (bottomSheetBehavior = embeddedLandingPageBehaviorLJII.LIZIZ) != 0) {
            bottomSheetBehavior.removeBottomSheetCallback(this.LLJI);
            if (bottomSheetBehavior.getState() != 5) {
                bottomSheetBehavior.setState(5);
            }
        }
        EmbeddedLandingPageBehavior<?> embeddedLandingPageBehaviorLJII2 = LJII();
        if (embeddedLandingPageBehaviorLJII2 != null && (swipeToScrollDownBehavior = embeddedLandingPageBehaviorLJII2.LIZ) != 0) {
            ((ArrayList) swipeToScrollDownBehavior.LJII).remove(this.LLJIJIL);
        }
        this.LLJ.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC1037610d6l
    public final Fragment getFragment() {
        return this.LLILLJJLI.getFragment();
    }

    @Override // X.InterfaceC1037610d6l
    public final String getUrl() {
        return this.LLILLJJLI.getUrl();
    }

    @Override // X.InterfaceC1037610d6l
    public final boolean remove() {
        ViewParent parent;
        boolean zRemove = this.LLILLJJLI.remove();
        if (zRemove) {
            C16G0 c16g0 = this.LLILLL;
            if (c16g0 != null && (parent = c16g0.getParent()) != null) {
                C786410Ut5.LJJJLZIJ(c16g0, (ViewGroup) parent);
            }
            this.LLILLL = null;
            this.LLILZIL = null;
            this.LLIZ = null;
            this.LLJ.removeCallbacksAndMessages(null);
        }
        return zRemove;
    }

    public final void LJFF() {
        EmbeddedLandingPageBehavior<?> embeddedLandingPageBehaviorLJII = LJII();
        if (embeddedLandingPageBehaviorLJII == null) {
            return;
        }
        if (embeddedLandingPageBehaviorLJII.LIZIZ.getState() == 3) {
            embeddedLandingPageBehaviorLJII.LIZLLL = true;
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        C786410Ut5.LJLJLJ(this.LLJ, messageObtain, 16L);
    }

    @Override // X.InterfaceC1037610d6l
    public final boolean LIZIZ(String str) {
        boolean zLIZIZ = this.LLILLJJLI.LIZIZ(str);
        if (zLIZIZ) {
            LJIIIIZZ();
        }
        return zLIZIZ;
    }

    public final void LJI(boolean z) {
        BottomSheetBehavior<T> bottomSheetBehavior;
        if (z) {
            this.LLJ.removeMessages(1);
        }
        C16G0 c16g0 = this.LLILLL;
        if (c16g0 == null) {
            return;
        }
        c16g0.getLocationOnScreen(this.LLIZLLLIL);
        if (this.LLIZLLLIL[0] == 0) {
            EmbeddedLandingPageBehavior<?> embeddedLandingPageBehaviorLJII = LJII();
            if (embeddedLandingPageBehaviorLJII != null && (bottomSheetBehavior = embeddedLandingPageBehaviorLJII.LIZIZ) != 0) {
                if (bottomSheetBehavior.getState() != 2) {
                    bottomSheetBehavior.setState(3);
                    bottomSheetBehavior.setFitToContents(true);
                    LJFF();
                    return;
                }
            } else {
                return;
            }
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        C786410Ut5.LJLJLJ(this.LLJ, messageObtain, 16L);
    }

    public final void LJIIIZ(float f) {
        RadiusLayout radiusLayout;
        C1066370dr9 c1066370dr9;
        FrameLayout frameLayout;
        float f2;
        int i;
        boolean z;
        ViewOnClickListenerC1066290dr1 viewOnClickListenerC1066290dr1;
        C16G0 c16g0 = this.LLILLL;
        if (c16g0 == null || (radiusLayout = this.LLILZIL) == null || (c1066370dr9 = this.LLILZLL) == null || (frameLayout = this.LLIZ) == null) {
            return;
        }
        int iArgb = 0;
        if (f == 1.0f) {
            f2 = 0.0f;
        } else {
            f2 = LLJILJIL;
        }
        C786410Ut5.LLZZ(radiusLayout, 0);
        radiusLayout.setRadius(f2);
        if (f == 1.0f) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLLZIL(c1066370dr9, i);
        C786410Ut5.LJZ(0, frameLayout);
        C786410Ut5.LLILZLL(c16g0, 0);
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        c16g0.setClickable(z2);
        if (z2) {
            viewOnClickListenerC1066290dr1 = this;
        } else {
            viewOnClickListenerC1066290dr1 = null;
        }
        C786410Ut5.Z7(c16g0, viewOnClickListenerC1066290dr1);
        if (f != 1.0f && c16g0.isAttachedToWindow()) {
            iArgb = Color.argb((int) (((double) (f * 255)) * 0.5d), 0, 0, 0);
        }
        c16g0.setBackgroundColor(iArgb);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            LJFF();
            return true;
        }
        LJI(false);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0dr4] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0dr5] */
    public ViewOnClickListenerC1066290dr1(C1037740d6y c1037740d6y, C1038180d7g c1038180d7g) {
        this.LL = c1037740d6y;
        this.LLILLJJLI = c1038180d7g;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1037610d6l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.widget.FrameLayout r15, androidx.fragment.app.FragmentManager r16) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1066290dr1.LIZJ(android.widget.FrameLayout, androidx.fragment.app.FragmentManager):boolean");
    }

    @Override // X.InterfaceC1066340dr6
    public final void LJ(View view, boolean z) {
        if (Intrinsics.LJFF(view, this.LLIZ) && !z) {
            LIZLLL();
        }
    }
}
