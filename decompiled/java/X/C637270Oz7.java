package X;

import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637270Oz7 implements InterfaceC20677715vj {
    public final ProfileBannerInfoModel LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C637270Oz7) && Intrinsics.LJFF(this.LIZ, ((C637270Oz7) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileBannerOutreachRecordCacheKey(bannerInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20677715vj
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC20654715s1.PROFILE_BANNER.getTypeName());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ.bannerKey);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ.strategyKey);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C637270Oz7(ProfileBannerInfoModel profileBannerInfoModel) {
        this.LIZ = profileBannerInfoModel;
    }
}
