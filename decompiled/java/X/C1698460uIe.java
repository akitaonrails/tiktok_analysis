package X;

import android.graphics.drawable.Animatable;
import com.ss.android.ugc.tools.infosticker.repository.internal.GifEntranceBannerController;

/* JADX INFO: renamed from: X.0uIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698460uIe extends C1320700kTM {
    public final int $t;
    public Object l0;

    public static final void LIZLLL$0(C1698460uIe c1698460uIe, String str, Throwable th) {
    }

    public static final void LJFF$0(C1698460uIe c1698460uIe, Object obj, String str) {
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZJ(Object obj, String str) {
        if (this.$t != 0) {
            super.LIZJ(obj, str);
        } else {
            LIZJ$0(this, obj, str);
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        if (1 - this.$t != 0) {
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
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        if (1 - this.$t != 0) {
            super.LJFF(obj, str);
        } else {
            LJFF$0(this, obj, str);
        }
    }

    public C1698460uIe(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZJ$0(C1698460uIe c1698460uIe, Object obj, String str) {
        ((C1642680sqg) c1698460uIe.l0).LIZLLL((InterfaceC1330440kj4) obj);
    }

    public static final void LJ$0(C1698460uIe c1698460uIe, String str, Object obj, Animatable animatable) {
        ((C1642680sqg) c1698460uIe.l0).LIZLLL((InterfaceC1330440kj4) obj);
    }

    public static final void LJ$1(C1698460uIe c1698460uIe, String str, Object obj, Animatable animatable) {
        if (((GifEntranceBannerController) c1698460uIe.l0).LJIIJ) {
            if (animatable != null) {
                animatable.stop();
            }
        } else {
            if (animatable == null) {
                return;
            }
            animatable.start();
        }
    }
}
