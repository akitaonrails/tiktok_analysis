package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0YBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870250YBz implements C0Y5R {
    public final C0YEI LIZ;
    public final C869650Y9r LIZIZ;
    public final C870430YCr LIZJ;
    public final C0YBI LIZLLL;
    public final C873830YPt LJ;
    public final /* synthetic */ C0YDJ LJFF;

    @Override // X.C0Y5R
    public final C0Y5P LIZLLL() {
        return new C0Y5P(this.LJFF.LIZ, this.LIZ, this.LIZIZ);
    }

    @Override // X.C0Y5R, X.C0YCZ
    public final C869650Y9r LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C0Y5R, X.C0YCZ
    public final C0Y9J LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C0Y5R
    public final InterfaceC869500Y9c LIZJ() {
        return this.LIZ;
    }

    @Override // X.C0Y5R
    public final C873830YPt LJ() {
        return this.LJ;
    }

    @Override // X.C0Y5R, X.C0YCZ
    public final C870430YCr getProxy() {
        return this.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0YEL] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0YC0] */
    public C870250YBz(C0YDJ c0ydj) {
        this.LJFF = c0ydj;
        final C0YEI c0yei = new C0YEI(c0ydj.LIZ);
        this.LIZ = c0yei;
        C0YEM c0yem = c0ydj.LIZ;
        this.LIZIZ = new C869650Y9r(c0yem);
        this.LIZJ = new C870430YCr(c0yem);
        this.LIZLLL = new C0YBI(c0ydj.LIZ);
        ?? r2 = new C0YC1() { // from class: X.0YC0
            @Override // X.C0YC1
            public final C07WR LIZ(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("imsdk_");
                sbLIZ.append(str);
                sbLIZ.append("messaging");
                return new C0YBY(false, u.LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ)));
            }
        };
        final InterfaceC870750YDx interfaceC870750YDxLJ = c0ydj.LIZ.LJ();
        this.LJ = new C873830YPt(r2, new InterfaceC873840YPu(c0yei, interfaceC870750YDxLJ) { // from class: X.0YEL
            public final InterfaceC869500Y9c LIZ;
            public final InterfaceC870750YDx LIZIZ;
            public final C0YEV LIZJ;

            @Override // X.InterfaceC873840YPu
            public final boolean LIZ(String str) {
                C0YEV c0yev = this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("encryption_should_force_default_password_");
                sbLIZ.append(str);
                boolean z = c0yev.getBoolean(C2188811AlT.LIZIZ(sbLIZ));
                if (!z) {
                    return this.LIZ.LJJLIIIJJI(str);
                }
                return z;
            }

            @Override // X.InterfaceC873840YPu
            public final int LIZIZ(String str) {
                int iLIZIZ = this.LIZ.LIZIZ(str);
                C0YEV c0yev = this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("KEYSTORE_FAILURE_COUNT_");
                sbLIZ.append(str);
                int i = c0yev.getInt(C2188811AlT.LIZIZ(sbLIZ));
                if (iLIZIZ < i) {
                    return i;
                }
                return iLIZIZ;
            }

            @Override // X.InterfaceC873840YPu
            public final void LJ(String str) {
                this.LIZ.LJJIJLIJ(str);
                C0YEV c0yev = this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("encryption_should_force_default_password_");
                sbLIZ.append(str);
                c0yev.putBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
            }

            @Override // X.InterfaceC873840YPu
            public final String LJFF(String str) {
                C0YEV c0yev = this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("user_db_key_");
                sbLIZ.append(str);
                String string = c0yev.getString(C2188811AlT.LIZIZ(sbLIZ), "");
                if (string.length() == 0) {
                    String strLJJJJ = this.LIZ.LJJJJ(str);
                    if (strLJJJJ == null) {
                        return "";
                    }
                    return strLJJJJ;
                }
                return string;
            }

            {
                this.LIZ = c0yei;
                this.LIZIZ = interfaceC870750YDxLJ;
                this.LIZJ = interfaceC870750YDxLJ.LIZIZ().LIZJ("imsdk_encryption");
            }

            @Override // X.InterfaceC873840YPu
            public final void LIZJ(int i, String str) {
                this.LIZ.LIZJ(i, str);
                C0YEV c0yev = this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("KEYSTORE_FAILURE_COUNT_");
                sbLIZ.append(str);
                c0yev.putInt(C2188811AlT.LIZIZ(sbLIZ), i);
            }

            @Override // X.InterfaceC873840YPu
            public final void LIZLLL(String str, String str2) {
                this.LIZ.LJIILIIL(str, str2);
                C0YEV c0yev = this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("user_db_key_");
                sbLIZ.append(str);
                c0yev.putString(C2188811AlT.LIZIZ(sbLIZ), str2);
            }
        }, c0ydj.LIZ);
    }
}
