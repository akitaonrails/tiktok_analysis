package X;

import Y.AObjectS392S0100000_17;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099390eiP {
    public static final C2268791DrB LJIIZILJ = new C2268791DrB(0.28f, 0.0f, 0.43f, 1.0f);
    public static final C2268791DrB LJIJ = new C2268791DrB(0.57f, 0.0f, 0.7f, 1.0f);
    public static final C2268791DrB LJIJI = new C2268791DrB(0.53f, 0.0f, 0.83f, 1.0f);
    public final C1099580eii LIZ;
    public final View LIZIZ;
    public final C21415018rM LIZJ;
    public final C21415018rM LIZLLL;
    public final C1106510ett LJ;
    public final View LJFF;
    public final View LJI;
    public final C1324720kZq LJII;
    public final C429740GtA LJIIIIZZ;
    public final View LJIIIZ;
    public final View LJIIJ;
    public final View LJIIJJI;
    public final Context LJIIL;
    public final Function0<Unit> LJIILIIL;
    public int LJIILJJIL;
    public AnimatorSet LJIILL;
    public boolean LJIILLIIL;

    public final void LIZ(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i == 8) {
                    C500260Jjc.LJIILLIIL(this.LJ);
                    C1106510ett c1106510ett = this.LJ;
                    if (c1106510ett != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1106510ett);
                        c1106510ett.setAlpha(0.3f);
                        return;
                    }
                    return;
                }
                return;
            }
            C500260Jjc.LLFFF(this.LJ);
            C1106510ett c1106510ett2 = this.LJ;
            if (c1106510ett2 == null) {
                return;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1106510ett2);
            c1106510ett2.setAlpha(0.0f);
            return;
        }
        C500260Jjc.LLFFF(this.LJ);
        C1106510ett c1106510ett3 = this.LJ;
        if (c1106510ett3 == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1106510ett3);
        c1106510ett3.setAlpha(0.3f);
    }

    public final void LIZJ(int i) {
        GradientDrawable gradientDrawable;
        View view = this.LJFF;
        Drawable background = null;
        if (view != null) {
            background = view.getBackground();
        }
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setColor(i);
            View view2 = this.LJFF;
            if (view2 != null) {
                view2.setBackground(gradientDrawable);
            }
        }
    }

    public static void LIZIZ(long j, BorderInfo borderInfo, BorderInfo borderInfo2, boolean z) {
        String str;
        String str2;
        String str3;
        if (z) {
            str = "livesdk_live_profile_animation_guide_click";
        } else {
            str = "livesdk_live_profile_animation_guide_show";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        if (UserService.getInstance().user().getCurrentUserId() == j) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LJJII("anchor", "object_user_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "object_user_id");
        if (Intrinsics.LJFF(borderInfo, borderInfo2)) {
            str3 = "replace";
        } else {
            str3 = "new";
        }
        c474500IjALIZ.LJJII(str3, "animation_type");
        c474500IjALIZ.LIZ();
    }

    public static final Layout LIZLLL(String str, C1099390eiP c1099390eiP, int i, int i2, int i3) {
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(str);
        c444830HcP.LJIILJJIL(C20736316Cj.LIZIZ(R.attr.c9i, c1099390eiP.LIZLLL.getContext()));
        c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
        c444830HcP.LJII(72);
        c444830HcP.LJIIL(1.0f, 1.0f, 2.0f, C20736316Cj.LIZJ(R.attr.euj, c1099390eiP.LIZLLL));
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LJ = i;
        c444840HcQ.LJFF = i2;
        c444830HcP.LJIIIZ(1);
        c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
        return C444830HcP.LIZJ(c444830HcP, 0.0f, false, Collections.singletonList(new Pair(Integer.valueOf(i3), Integer.valueOf(i3))), 27);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x06de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r22, long r23, com.bytedance.android.livesdk.model.BorderInfo r25, com.bytedance.android.livesdk.model.BorderInfo r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 1860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1099390eiP.LJ(java.lang.String, long, com.bytedance.android.livesdk.model.BorderInfo, com.bytedance.android.livesdk.model.BorderInfo, kotlin.jvm.functions.Function0):void");
    }

    public C1099390eiP(C1099580eii c1099580eii, View view, C21415018rM c21415018rM, C21415018rM c21415018rM2, C1106510ett c1106510ett, View view2, C1099610eil c1099610eil, C1324720kZq c1324720kZq, C429740GtA c429740GtA, View view3, View view4, View view5, Context context, AObjectS392S0100000_17 aObjectS392S0100000_17) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        this.LIZ = c1099580eii;
        this.LIZIZ = view;
        this.LIZJ = c21415018rM;
        this.LIZLLL = c21415018rM2;
        this.LJ = c1106510ett;
        this.LJFF = view2;
        this.LJI = c1099610eil;
        this.LJII = c1324720kZq;
        this.LJIIIIZZ = c429740GtA;
        this.LJIIIZ = view3;
        this.LJIIJ = view4;
        this.LJIIJJI = view5;
        this.LJIIL = context;
        this.LJIILIIL = aObjectS392S0100000_17;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        this.LJIILJJIL = i;
    }
}
