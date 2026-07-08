package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FOG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FOG {
    public final C539960LFq LIZ;
    public final C19A3 LIZIZ;
    public final int LIZJ;
    public final EnumC371580EhY LIZLLL;
    public final EnumC1642750sqn LJ;
    public final InterfaceC540980LJo<Boolean> LJFF;

    public C0FOG() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FOG)) {
            return false;
        }
        C0FOG c0fog = (C0FOG) obj;
        return Intrinsics.LJFF(this.LIZ, c0fog.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fog.LIZIZ) && this.LIZJ == c0fog.LIZJ && this.LIZLLL == c0fog.LIZLLL && this.LJ == c0fog.LJ && Intrinsics.LJFF(this.LJFF, c0fog.LJFF) && Intrinsics.LJFF(null, null);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        InterfaceC540980LJo<Boolean> interfaceC540980LJo = this.LJFF;
        return (iHashCode + (interfaceC540980LJo == null ? 0 : interfaceC540980LJo.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickAlsComponentParams(builder=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", parentScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slotId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", defaultVisibility=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", attachOption=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", attachTiming=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", attachAllowTiming=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FOG(C539960LFq c539960LFq, MvChoosePhotoScene mvChoosePhotoScene, EnumC371580EhY enumC371580EhY) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        this.LIZ = c539960LFq;
        this.LIZIZ = mvChoosePhotoScene;
        this.LIZJ = R.id.drg;
        this.LIZLLL = enumC371580EhY;
        this.LJ = enumC1642750sqn;
        this.LJFF = null;
    }
}
