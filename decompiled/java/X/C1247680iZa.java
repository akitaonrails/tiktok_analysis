package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247680iZa implements InterfaceC1891350zJl {
    public final EnumC1262450ixP LL;
    public final IMUser LLILLJJLI;
    public final MufPageTrackInfo LLILLL;
    public final String LLILZ;
    public final int LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1247680iZa)) {
            return false;
        }
        C1247680iZa c1247680iZa = (C1247680iZa) obj;
        return this.LL == c1247680iZa.LL && Intrinsics.LJFF(this.LLILLJJLI, c1247680iZa.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1247680iZa.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1247680iZa.LLILZ) && this.LLILZIL == c1247680iZa.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        MufPageTrackInfo mufPageTrackInfo = this.LLILLL;
        return ((((iHashCode + (mufPageTrackInfo == null ? 0 : mufPageTrackInfo.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MufSearchItem(scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", imUser=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", trackInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", aliasPermissionType=");
        sbLIZ.append(this.LLILZIL);
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

    public C1247680iZa(EnumC1262450ixP enumC1262450ixP, IMUser iMUser, MufPageTrackInfo mufPageTrackInfo, String str, int i) {
        this.LL = enumC1262450ixP;
        this.LLILLJJLI = iMUser;
        this.LLILLL = mufPageTrackInfo;
        this.LLILZ = str;
        this.LLILZIL = i;
    }
}
