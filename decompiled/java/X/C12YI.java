package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.ur.creative.CardActionReportData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12YI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YI implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onViewDetachedFromWindow$0(C12YI c12yi, View view) {
    }

    public static final void onViewDetachedFromWindow$1(C12YI c12yi, View view) {
    }

    public static final void onViewDetachedFromWindow$2(C12YI c12yi, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$0(C12YI c12yi, View view) {
        View view2;
        int screenWidth;
        ((View) c12yi.l0).removeOnAttachStateChangeListener(c12yi);
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null && (screenWidth = ScreenUtils.getScreenWidth(((View) c12yi.l1).getContext())) > 0) {
            if (view2.getWidth() > 0) {
                ((Function1) c12yi.l2).invoke(Float.valueOf(view2.getWidth() / screenWidth));
            } else {
                C1591860rWi.LIZ(view2, new C01A5(screenWidth, view2, (Function1) c12yi.l2));
            }
        }
    }

    public static final void onViewAttachedToWindow$1(C12YI c12yi, View view) {
        ((View) c12yi.l0).removeOnAttachStateChangeListener(c12yi);
        if (Intrinsics.LJFF(((C19721212Dy) c12yi.l1).LLJ, (C19720512Dr) c12yi.l2) && ((C19721212Dy) c12yi.l1).LLILLJJLI.getVisibility() == 0) {
            ((C19721212Dy) c12yi.l1).S5((C19720512Dr) c12yi.l2, EnumC2193181AsW.SHOW, null);
        }
    }

    public static final void onViewAttachedToWindow$2(C12YI c12yi, View view) {
        ((View) c12yi.l0).removeOnAttachStateChangeListener(c12yi);
        if (!((C12E8) c12yi.l1).LIZ && ((C12E6) c12yi.l2).LL.getVisibility() == 0 && !((C12E6) c12yi.l2).LLIZLLLIL.equals(((C12E8) c12yi.l1).LIZJ)) {
            C12E7 c12e7 = C12E7.LIZ;
            C12E8 c12e8 = (C12E8) c12yi.l1;
            C12EA c12ea = C12EA.SHOW;
            c12e7.getClass();
            C12E7.LIZLLL(c12e8, c12ea);
            EnumC2193121AsQ enumC2193121AsQ = EnumC2193121AsQ.SHOW;
            C12E8 c12e82 = (C12E8) c12yi.l1;
            C12E7.LIZ(null, enumC2193121AsQ, new CardActionReportData(c12e82.LJI, c12e82.LJIIJJI, c12e82.LJIILIIL, c12e82.LJIILJJIL));
        }
        C12E6 c12e6 = (C12E6) c12yi.l2;
        String str = ((C12E8) c12yi.l1).LIZJ;
        if (str == null) {
            str = "";
        }
        c12e6.LLIZLLLIL = str;
    }

    public C12YI(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
