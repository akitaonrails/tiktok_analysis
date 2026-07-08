package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Qvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686150Qvl {
    public final C0XI4 LIZ;

    public final String LIZJ() {
        return this.LIZ.LJFF();
    }

    public C686150Qvl(String str) {
        this.LIZ = new C0XI4(str);
    }

    public final void LIZ(int i, String str) {
        this.LIZ.LIZIZ(i, str);
        C686160Qvm c686160Qvm = C19724912Fj.LIZLLL().LIZ;
        if (c686160Qvm.LIZ == null) {
            c686160Qvm.LIZ = new ArrayList<>();
        }
        c686160Qvm.LIZ.add(str);
    }

    public final void LIZIZ(String str, String str2) {
        this.LIZ.LJ(str, str2);
        C686160Qvm c686160Qvm = C19724912Fj.LIZLLL().LIZ;
        if (c686160Qvm.LIZJ == null) {
            c686160Qvm.LIZJ = new ArrayList<>();
        }
        c686160Qvm.LIZJ.add(str);
    }
}
