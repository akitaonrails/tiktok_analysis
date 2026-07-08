package X;

import com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2;
import com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardBaseProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0igL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251870igL implements InterfaceC1891350zJl {
    public final UserProfileGuideDataV2 LL;
    public final GuideCardBaseProtocol LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1251870igL)) {
            return false;
        }
        C1251870igL c1251870igL = (C1251870igL) obj;
        return Intrinsics.LJFF(this.LL, c1251870igL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1251870igL.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        UserProfileGuideDataV2 userProfileGuideDataV2 = this.LL;
        int iHashCode = (userProfileGuideDataV2 == null ? 0 : userProfileGuideDataV2.hashCode()) * 31;
        GuideCardBaseProtocol guideCardBaseProtocol = this.LLILLJJLI;
        return iHashCode + (guideCardBaseProtocol != null ? guideCardBaseProtocol.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideCardItem(userGuideCardDataV2=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", protocol=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String name;
        C1251870igL c1251870igL;
        UserProfileGuideDataV2 userProfileGuideDataV2;
        String name2 = null;
        if ((interfaceC1891350zJl instanceof C1251870igL) && (c1251870igL = (C1251870igL) interfaceC1891350zJl) != null && (userProfileGuideDataV2 = c1251870igL.LL) != null) {
            name = userProfileGuideDataV2.getName();
        } else {
            name = null;
        }
        UserProfileGuideDataV2 userProfileGuideDataV22 = this.LL;
        if (userProfileGuideDataV22 != null) {
            name2 = userProfileGuideDataV22.getName();
        }
        return Intrinsics.LJFF(name, name2);
    }

    public C1251870igL(UserProfileGuideDataV2 userProfileGuideDataV2, GuideCardBaseProtocol guideCardBaseProtocol) {
        this.LL = userProfileGuideDataV2;
        this.LLILLJJLI = guideCardBaseProtocol;
    }
}
