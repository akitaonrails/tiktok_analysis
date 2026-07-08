package X;

import android.graphics.drawable.Animatable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.16I0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16I0 extends C1320700kTM {
    public final int $t;
    public Object l0;

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        if (this.$t != 0) {
            super.LIZLLL(str, th);
        } else {
            LIZLLL$0(this, str, th);
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, obj, animatable);
                break;
            case 1:
                LJ$1(this, str, obj, animatable);
                break;
            case 2:
                LJ$2(this, str, obj, animatable);
                break;
            case 3:
                LJ$3(this, str, obj, animatable);
                break;
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    public C16I0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZLLL$0(C16I0 c16i0, String str, Throwable th) {
        String message;
        C165Y c165y = (C165Y) c16i0.l0;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        c165y.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guide view show fail: ");
        if (message == null) {
            message = "";
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJ$0(C16I0 c16i0, String str, Object obj, Animatable animatable) {
        AwemeRawAd awemeRawAd;
        try {
            C165Y c165y = (C165Y) c16i0.l0;
            if (c165y.LLJI) {
                if (animatable != null && (animatable instanceof AnimatedDrawable2)) {
                    c165y.LLJIJIL = true;
                    Aweme aweme = c165y.LLILZ;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
                    c1022820ciuLIZLLL.LIZJ("interactive_gesture", "refer");
                    c1022820ciuLIZLLL.LJII();
                    C165Y c165y2 = (C165Y) c16i0.l0;
                    c165y2.LLIZ = (AnimatedDrawable2) animatable;
                    c165y2.LJIIIZ((AnimatedDrawable2) animatable);
                    return;
                }
                c165y.LJI();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C2344809Gs.LJI(th);
            C165Y c165y3 = (C165Y) c16i0.l0;
            String message = th.getMessage();
            c165y3.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guide view show fail: ");
            if (message == null) {
                message = "";
            }
            sbLIZ.append(message);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJ$1(C16I0 c16i0, String str, Object obj, Animatable animatable) {
        ((AbstractC20697215ys) c16i0.l0).LLILZIL = true;
    }

    public static final void LJ$2(C16I0 c16i0, String str, Object obj, Animatable animatable) {
        ((C15C6) c16i0.l0).LLIZ = animatable;
    }

    public static final void LJ$3(C16I0 c16i0, String str, Object obj, Animatable animatable) {
        ((C15C5) c16i0.l0).LLIZLLLIL = animatable;
    }
}
