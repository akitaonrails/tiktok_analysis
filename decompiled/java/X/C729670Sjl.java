package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Sjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729670Sjl {
    public final long LIZ;
    public final boolean LIZIZ;
    public final List<C728820SiO> LIZJ;

    public final C729680Sjm LIZ(String str, boolean z) {
        AbstractC316870CbV c316640Cb8;
        if (this.LIZIZ) {
            c316640Cb8 = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Long.valueOf(this.LIZ), this.LIZJ, 1);
        } else {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            List<C728820SiO> list = this.LIZJ;
            c317290CcB.getClass();
            c316640Cb8 = new C316640Cb8(list);
        }
        return new C729680Sjm(str, c316640Cb8, z);
    }

    public C729670Sjl(long j, boolean z, List<C728820SiO> list) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = list;
    }
}
