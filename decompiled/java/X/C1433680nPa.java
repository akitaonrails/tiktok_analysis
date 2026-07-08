package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;

/* JADX INFO: renamed from: X.0nPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433680nPa {
    public SynthetiseResult LIZ = new SynthetiseResult();
    public C1433230nOr LIZIZ = new C1433700nPc().LIZ();
    public String LIZJ = "";
    public Throwable LIZLLL;

    public final C1433670nPZ LIZ() {
        C1433670nPZ c1433670nPZ = this.LIZLLL != null ? new C1433670nPZ(this.LIZLLL, this.LIZ) : new C1433670nPZ(this.LIZJ, this.LIZ);
        c1433670nPZ.setCancelCause(this.LIZIZ);
        return c1433670nPZ;
    }
}
