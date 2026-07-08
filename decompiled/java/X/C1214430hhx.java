package X;

import com.ss.android.ugc.profile.business.profile.edit.IProfileEditLinkAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214430hhx implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final IProfileEditLinkAbility LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1214430hhx)) {
            return false;
        }
        C1214430hhx c1214430hhx = (C1214430hhx) obj;
        return this.LL == c1214430hhx.LL && Intrinsics.LJFF(this.LLILLJJLI, c1214430hhx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1214430hhx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1214430hhx.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        IProfileEditLinkAbility iProfileEditLinkAbility = this.LLILZ;
        return iHashCode2 + (iProfileEditLinkAbility != null ? iProfileEditLinkAbility.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileEditSocialLinkItem(appEnum=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", appName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", ability=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1214430hhx(int i, String str, String str2, IProfileEditLinkAbility iProfileEditLinkAbility) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = iProfileEditLinkAbility;
    }
}
