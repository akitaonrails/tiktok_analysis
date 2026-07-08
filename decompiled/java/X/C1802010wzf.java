package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802010wzf {
    public final String LIZ;
    public final CharSequence LIZJ;
    public final long LJ;
    public final boolean LJFF;
    public final EnumC992990bwn LJI;
    public final int LIZIZ = R.drawable.cn0;
    public final int LIZLLL = R.raw.icon_chevron_right_ltr;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1802010wzf)) {
            return false;
        }
        C1802010wzf c1802010wzf = (C1802010wzf) obj;
        return Intrinsics.LJFF(this.LIZ, c1802010wzf.LIZ) && this.LIZIZ == c1802010wzf.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1802010wzf.LIZJ) && this.LIZLLL == c1802010wzf.LIZLLL && this.LJ == c1802010wzf.LJ && this.LJFF == c1802010wzf.LJFF && this.LJI == c1802010wzf.LJI;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisOperationBannerModel(iconUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconPlaceholderRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", title=");
        sbLIZ.append((Object) this.LIZJ);
        sbLIZ.append(", accessoryIconRes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", persistUntilDismissed=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1802010wzf(String str, CharSequence charSequence, long j, boolean z, EnumC992990bwn enumC992990bwn) {
        this.LIZ = str;
        this.LIZJ = charSequence;
        this.LJ = j;
        this.LJFF = z;
        this.LJI = enumC992990bwn;
    }
}
