package X;

import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;

/* JADX INFO: renamed from: X.0iWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245830iWb {
    public final EnumC338580DPc LIZ;
    public final C1245860iWe LIZIZ;
    public final boolean LIZJ;
    public final EnumC338600DPe LIZLLL;
    public final String LJ;
    public final SchoolMutualStruct LJFF;
    public final boolean LJI;

    public C1245830iWb(EnumC338580DPc enumC338580DPc, C1245860iWe c1245860iWe, boolean z, EnumC338600DPe enumC338600DPe, String str, SchoolMutualStruct schoolMutualStruct, boolean z2) {
        this.LIZ = enumC338580DPc;
        this.LIZIZ = c1245860iWe;
        this.LIZJ = z;
        this.LIZLLL = enumC338600DPe;
        this.LJ = str;
        this.LJFF = schoolMutualStruct;
        this.LJI = z2;
    }

    public /* synthetic */ C1245830iWb(EnumC338580DPc enumC338580DPc, C1245860iWe c1245860iWe, boolean z, EnumC338600DPe enumC338600DPe, String str, SchoolMutualStruct schoolMutualStruct, boolean z2, int i) {
        this(enumC338580DPc, c1245860iWe, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : enumC338600DPe, (i & 16) != 0 ? null : str, (i & 32) == 0 ? schoolMutualStruct : null, (i & 64) != 0 ? false : z2);
    }
}
