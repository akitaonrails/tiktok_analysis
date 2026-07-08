package X;

import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: X.0bnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987310bnd extends C1320700kTM {
    public final int $t;
    public Object l0;

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

    public C987310bnd(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJ$0(C987310bnd c987310bnd, String str, Object obj, Animatable animatable) {
        ((C932410aN5) c987310bnd.l0).LLJJJJJIL = animatable;
    }

    public static final void LJ$1(C987310bnd c987310bnd, String str, Object obj, Animatable animatable) {
        ((C932450aN9) c987310bnd.l0).LIZIZ = animatable;
    }
}
