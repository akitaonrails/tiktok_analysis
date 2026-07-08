package X;

import java.util.List;

/* JADX INFO: renamed from: X.0KRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517630KRt {
    public final C0KM0 LIZ;
    public final C0KQW LIZIZ;
    public final List<C0KQD> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C0KTZ LJFF;
    public final String LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C517630KRt(C0KM0 c0km0, C0KQW c0kqw, List<? extends C0KQD> list, String str, String str2, C0KTZ c0ktz, String str3) {
        this.LIZ = c0km0;
        this.LIZIZ = c0kqw;
        this.LIZJ = list;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = c0ktz;
        this.LJI = str3;
    }

    public C517630KRt(C0KM0 c0km0, C0KQW c0kqw, List list, String str, String str2, C0KTZ c0ktz, String str3, int i) {
        this(c0km0, (i & 2) != 0 ? null : c0kqw, (i & 4) != 0 ? C13BV.INSTANCE : list, str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? C0KTZ.UNKNOWN : c0ktz, (i & 64) == 0 ? str3 : "");
    }
}
