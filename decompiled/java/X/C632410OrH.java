package X;

import com.ss.android.ugc.aweme.dsp.experiment.MusicArtistCertificationConfig;
import com.ss.android.ugc.aweme.profile.model.ClaimStatus;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632410OrH {
    public static final MusicArtistCertificationConfig LIZ = new MusicArtistCertificationConfig(null, null, null, null, 15, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(587));

    public static MusicArtistCertificationConfig LIZJ() {
        return (MusicArtistCertificationConfig) LIZIZ.getValue();
    }

    public static String LIZ(EnumC632420OrI enumC632420OrI, ClaimStatus claimStatus) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ().landingUrl);
        sbLIZ.append("&enter_from=");
        sbLIZ.append(enumC632420OrI.getFrom());
        sbLIZ.append("&user_status=");
        sbLIZ.append(claimStatus.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(EnumC632420OrI enumC632420OrI, User user) {
        MusicTabClaimInfo musicTabClaimInfo;
        int value;
        MusicTabInfo musicTabInfo = user.getMusicTabInfo();
        if (musicTabInfo != null) {
            musicTabClaimInfo = musicTabInfo.musicTabClaimInfo;
        } else {
            musicTabClaimInfo = null;
        }
        if (user.getShowArtistPlaylist() == 1) {
            value = ClaimStatus.APPROVED.getValue();
        } else if (musicTabClaimInfo != null) {
            value = musicTabClaimInfo.status;
        } else {
            value = ClaimStatus.UNCLAIMED.getValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ().statusUrl);
        sbLIZ.append("&enter_from=");
        sbLIZ.append(enumC632420OrI.getFrom());
        sbLIZ.append("&user_status=");
        sbLIZ.append(value);
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        if (musicTabClaimInfo != null) {
            String str = musicTabClaimInfo.titleKey;
            if (str != null && str.length() > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("&starling_key_title=");
                sbLIZ2.append(musicTabClaimInfo.titleKey);
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
            String str2 = musicTabClaimInfo.descKey;
            if (str2 != null && str2.length() > 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("&starling_key_description=");
                sbLIZ3.append(musicTabClaimInfo.descKey);
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return sb.toString();
    }
}
