package X;

/* JADX INFO: renamed from: X.161d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C207071161d {
    public final EnumC114900c7 LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C207071161d(EnumC114900c7 enumC114900c7, boolean z, int i) {
        boolean z2;
        enumC114900c7 = (i & 1) != 0 ? EnumC114900c7.CLA_COMMON_LOG : enumC114900c7;
        z = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = (i & 8) != 0;
        this.LIZ = enumC114900c7;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
