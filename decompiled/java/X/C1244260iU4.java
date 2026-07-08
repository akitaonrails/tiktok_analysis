package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244260iU4 extends AbstractC20694715yT {
    public final String LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final C419910GdJ LLJILLL;
    public final Object LLJJ;
    public final PushItem LLJJI;
    public final boolean LLJJIII;
    public final EnumC1216700hlc LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final boolean LLJJJ;

    @Override // X.AbstractC20694715yT
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1244260iU4)) {
            return false;
        }
        C1244260iU4 c1244260iU4 = (C1244260iU4) obj;
        return Intrinsics.LJFF(this.LLJ, c1244260iU4.LLJ) && this.LLJI == c1244260iU4.LLJI && this.LLJIJIL == c1244260iU4.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1244260iU4.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1244260iU4.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1244260iU4.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1244260iU4.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1244260iU4.LLJJI) && this.LLJJIII == c1244260iU4.LLJJIII && this.LLJJIJI == c1244260iU4.LLJJIJI && this.LLJJIJIIJIL == c1244260iU4.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c1244260iU4.LLJJIJIL) && this.LLJJJ == c1244260iU4.LLJJJ;
    }

    public final int hashCode() {
        String str = this.LLJ;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31;
        C419910GdJ c419910GdJ = this.LLJILLL;
        int iHashCode2 = (iHashCode + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        Object obj = this.LLJJ;
        int iHashCode3 = (((((((((iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + this.LLJJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + this.LLJJIJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31;
        String str2 = this.LLJJIJIL;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJJ);
    }

    public final String toString() {
        return "SystemPushSettingsItem(label=" + this.LLJ + ", showArrow=" + this.LLJI + ", showAlertBadge=" + this.LLJIJIL + ", uniqueId=" + this.LLJILJIL + ", title=" + this.LLJILJILJ + ", icon=" + this.LLJILLL + ", tag=" + this.LLJJ + ", payload=" + this.LLJJI + ", visibility=" + this.LLJJIII + ", cellVariant=" + this.LLJJIJI + ", divider=" + this.LLJJIJIIJIL + ", subTitle=" + this.LLJJIJIL + ", enable=" + this.LLJJJ + ')';
    }

    @Override // X.AbstractC20694715yT, X.AbstractC19293010ds
    public final boolean LIZ() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC20694715yT
    public final PushItem LIZIZ() {
        return this.LLJJI;
    }

    @Override // X.AbstractC20694715yT
    public final String getUniqueId() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC20694715yT
    public final AbstractC20694715yT LIZLLL(Function1 function1, boolean z) {
        String str = this.LLJ;
        boolean z2 = this.LLJI;
        boolean z3 = this.LLJIJIL;
        String str2 = this.LLJILJIL;
        String str3 = this.LLJILJILJ;
        C419910GdJ c419910GdJ = this.LLJILLL;
        Object obj = this.LLJJ;
        PushItem pushItem = this.LLJJI;
        return new C1244260iU4(c419910GdJ, this.LLJJIJI, pushItem, obj, str, str2, str3, this.LLJJIJIL, z2, z3, !z, this.LLJJIJIIJIL, this.LLJJJ);
    }

    public C1244260iU4(C419910GdJ c419910GdJ, EnumC1216700hlc enumC1216700hlc, PushItem pushItem, Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(str2, z3, z4, obj, pushItem);
        this.LLJ = str;
        this.LLJI = z;
        this.LLJIJIL = z2;
        this.LLJILJIL = str2;
        this.LLJILJILJ = str3;
        this.LLJILLL = c419910GdJ;
        this.LLJJ = obj;
        this.LLJJI = pushItem;
        this.LLJJIII = z3;
        this.LLJJIJI = enumC1216700hlc;
        this.LLJJIJIIJIL = z4;
        this.LLJJIJIL = str4;
        this.LLJJJ = z5;
    }
}
