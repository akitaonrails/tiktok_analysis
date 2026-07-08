package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227920i3i extends C1226750i1p {
    public final BaseSharePackage LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final EnumC1226770i1r LJIIIIZZ;
    public final C0N0C LJIIIZ;

    public C1227920i3i() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227920i3i)) {
            return false;
        }
        C1227920i3i c1227920i3i = (C1227920i3i) obj;
        return Intrinsics.LJFF(this.LJFF, c1227920i3i.LJFF) && this.LJI == c1227920i3i.LJI && this.LJII == c1227920i3i.LJII && this.LJIIIIZZ == c1227920i3i.LJIIIIZZ && this.LJIIIZ == c1227920i3i.LJIIIZ;
    }

    public final int hashCode() {
        BaseSharePackage baseSharePackage = this.LJFF;
        int iHashCode = (((((baseSharePackage == null ? 0 : baseSharePackage.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        EnumC1226770i1r enumC1226770i1r = this.LJIIIIZZ;
        int iHashCode2 = (iHashCode + (enumC1226770i1r == null ? 0 : enumC1226770i1r.hashCode())) * 31;
        C0N0C c0n0c = this.LJIIIZ;
        return iHashCode2 + (c0n0c != null ? c0n0c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateGroupToShareHeaderProtocolConfig(sharePackage=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", defaultEnable=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", defaultVisible=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dynamicBehavior=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", dynamicCondition=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1226750i1p
    public final boolean LIZ() {
        return this.LJI;
    }

    @Override // X.C1226750i1p
    public final boolean LIZIZ() {
        return this.LJII;
    }

    @Override // X.C1226750i1p
    public final EnumC1226770i1r LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C1226750i1p
    public final C0N0C LIZLLL() {
        return this.LJIIIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1227920i3i(BaseSharePackage baseSharePackage, int i) {
        boolean z;
        boolean z2;
        BaseSharePackage baseSharePackage2 = (i & 1) != 0 ? null : baseSharePackage;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(baseSharePackage2, z, z2, null, null);
    }

    public C1227920i3i(BaseSharePackage baseSharePackage, boolean z, boolean z2, EnumC1226770i1r enumC1226770i1r, C0N0C c0n0c) {
        super("id_header_create_group_to_share", z, z2, enumC1226770i1r, c0n0c);
        this.LJFF = baseSharePackage;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = enumC1226770i1r;
        this.LJIIIZ = c0n0c;
    }
}
