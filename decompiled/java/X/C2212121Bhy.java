package X;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1Bhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212121Bhy implements InterfaceC1031140cwK {
    public final C2212111Bhx LIZ;
    public final ExecutorService LIZIZ = C2212231Bi9.LJFF;

    public final void LIZ() {
        this.LIZ.LIZ();
    }

    public C2212121Bhy(Context context) {
        this.LIZ = new C2212111Bhx(context);
    }

    public final int LIZIZ(String str) {
        C2212111Bhx c2212111Bhx = this.LIZ;
        if (str == null) {
            c2212111Bhx.getClass();
            return 0;
        }
        return c2212111Bhx.LIZ.getInt(str, 0);
    }

    public final String LIZLLL(String str) {
        return this.LIZ.LIZ.getString(str, "");
    }

    public final long LIZJ(String str, long j) {
        return this.LIZ.LIZ.getLong(str, j);
    }

    public final InterfaceC1031140cwK LJ(int i, String str) {
        C2212111Bhx c2212111Bhx = this.LIZ;
        if (str == null) {
            c2212111Bhx.getClass();
            return this;
        }
        c2212111Bhx.LIZIZ.putInt(str, i);
        return this;
    }

    public final InterfaceC1031140cwK LJFF(long j, String str) {
        this.LIZ.LIZJ(j, str);
        return this;
    }

    public final InterfaceC1031140cwK LJI(String str, String str2) {
        this.LIZ.LIZIZ.putString(str, str2);
        return this;
    }
}
