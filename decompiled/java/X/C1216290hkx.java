package X;

import com.ss.android.ugc.aweme.compliance.api.model.Organization;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216290hkx {
    public static final DonationStickerModel LIZ(Organization organization) {
        String string;
        String string2;
        String str = organization.name;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = organization.iconUrl;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = organization.donateLink;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = organization.orgId;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = organization.orgType;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = organization.fundraiserId;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = organization.fundraiserGoalDesc;
        if (str8 == null || (string = a0.LJLIIIL(str8).toString()) == null) {
            string = "";
        }
        String str9 = organization.fundraiserOwnerId;
        if (str9 != null && (string2 = a0.LJLIIIL(str9).toString()) != null) {
            str2 = string2;
        }
        return new DonationStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.DONATION, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), true, false, str, str3, str4, "", str5, str6, str7, str2, string, 0, -1.0f, false, false);
    }
}
