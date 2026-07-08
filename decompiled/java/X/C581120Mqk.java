package X;

import android.graphics.Bitmap;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0Mqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581120Mqk implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Boolean> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
            case 2:
                subscribe$2(this, interfaceC2329309At);
                break;
        }
    }

    public C581120Mqk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C581120Mqk c581120Mqk, InterfaceC2329309At interfaceC2329309At) {
        boolean z;
        String currentUserID = ((InterfaceC1457290o1f) c581120Mqk.l0).getCurrentUserID();
        if (!C523410Kfr.LIZIZ) {
            z = false;
        } else {
            z = ((Keva) C523410Kfr.LIZ.getValue()).getBoolean(C08F1.LIZIZ(currentUserID), true);
            C523410Kfr.LIZIZ = z;
        }
        interfaceC2329309At.onSuccess(Boolean.valueOf(z));
    }

    public static final void subscribe$1(C581120Mqk c581120Mqk, InterfaceC2329309At interfaceC2329309At) {
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        ((C576610MjT) c581120Mqk.l0).getCameraApiComponent().St2().LJLJL(180, 320, new InterfaceC2173471A4j() { // from class: X.0Mjh
            @Override // X.InterfaceC2173471A4j
            public final void LIZ(int i, Bitmap bitmap) {
                if (i == 0) {
                    c11kt.onSuccess(bitmap);
                }
            }
        });
    }

    public static final void subscribe$2(C581120Mqk c581120Mqk, InterfaceC2329309At interfaceC2329309At) {
        interfaceC2329309At.onSuccess(((C259800zU) c581120Mqk.l0).element);
    }
}
