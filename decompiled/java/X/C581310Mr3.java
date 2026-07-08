package X;

import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: X.0Mr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581310Mr3 extends C1320700kTM {
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

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, obj, str);
                break;
            case 1:
                LJFF$1(this, obj, str);
                break;
            default:
                super.LJFF(obj, str);
                break;
        }
    }

    public C581310Mr3(InterfaceC529900KqK interfaceC529900KqK, int i) {
        this.$t = i;
        this.l0 = interfaceC529900KqK;
    }

    public static final void LJFF$0(C581310Mr3 c581310Mr3, Object obj, String str) {
        ((InterfaceC529900KqK) c581310Mr3.l0).LIZIZ();
    }

    public static final void LJFF$1(C581310Mr3 c581310Mr3, Object obj, String str) {
        ((InterfaceC529900KqK) c581310Mr3.l0).LIZIZ();
    }

    public static final void LJ$0(C581310Mr3 c581310Mr3, String str, Object obj, Animatable animatable) {
        ((InterfaceC529900KqK) c581310Mr3.l0).LIZ();
    }

    public static final void LJ$1(C581310Mr3 c581310Mr3, String str, Object obj, Animatable animatable) {
        ((InterfaceC529900KqK) c581310Mr3.l0).LIZ();
    }
}
