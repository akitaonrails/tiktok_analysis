package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11jh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19583911jh {
    public static final C1777680wMQ LIZIZ(Map<String, String> map) {
        boolean z;
        Integer numLJIIJJI;
        int iIntValue = 0;
        if (!map.containsKey("donation_sticker_type") && !map.containsKey("donation_display_style")) {
            z = false;
        } else {
            z = true;
        }
        String str = map.get("donation_sticker_type");
        if (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) {
            String str2 = map.get("donation_display_style");
            if (str2 != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str2);
            } else {
                numLJIIJJI = null;
            }
        }
        boolean zLIZJ = LIZJ(map.get("is_dynamic_render"));
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else if (zLIZJ && C306530Bzv.LIZ()) {
            iIntValue = 1;
        }
        return new C1777680wMQ(iIntValue, !z, zLIZJ);
    }

    public static final boolean LIZJ(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        if (!Intrinsics.LJFF(lowerCase, "true") && !Intrinsics.LJFF(lowerCase, "1")) {
            return false;
        }
        return true;
    }

    public static final int LIZLLL(DonationStickerModel donationStickerModel) {
        return C19578711ir.LIZ(donationStickerModel.getDisplayStyle(), donationStickerModel.isDynamicRender());
    }

    public static final DonationStickerModel LIZ(InteractStickerStruct interactStickerStruct, int i, int i2) {
        String string;
        float fFloatValue;
        Float fLJIIIIZZ;
        String str = "";
        DonationStickerModel donationStickerModel = new DonationStickerModel(C1466240oG6.LIZ(interactStickerStruct, EnumC1466150oFx.DONATION, i, i2), true, false, "", "", "", "", "", "", "", "", "", 0, -1.0f, false, false);
        try {
            HashMap map = (HashMap) C19598511m3.LIZ().LJIIIIZZ(interactStickerStruct.getAttr(), new TypeToken<HashMap<String, String>>() { // from class: X.11ji
            }.getType());
            C1777680wMQ c1777680wMQLIZIZ = LIZIZ(map);
            String str2 = (String) map.getOrDefault("donation_name", "");
            String str3 = (String) map.get("icon_uri");
            if ((str3 == null || !(!a0.LJJJIL(str3))) && (((str3 = (String) map.get("donation_icon_url")) == null || !(!a0.LJJJIL(str3))) && ((str3 = (String) map.get("icon")) == null || !(!a0.LJJJIL(str3))))) {
                str3 = "";
            }
            String str4 = (String) map.getOrDefault("donation_url", "");
            String str5 = (String) map.getOrDefault("add_anchor_time", "");
            String str6 = (String) map.getOrDefault("organization_id", "");
            String str7 = (String) map.getOrDefault("organization_type", "");
            String str8 = (String) map.get("fundraiser_id");
            if (str8 == null) {
                str8 = "";
            }
            String str9 = (String) map.get("fundraiser_owner_id");
            if (str9 == null || (string = a0.LJLIIIL(str9).toString()) == null) {
                string = "";
            }
            String str10 = (String) map.get("fundraiser_goal_desc");
            if (str10 != null) {
                str = str10;
            }
            int i3 = c1777680wMQLIZIZ.LIZ;
            String str11 = (String) map.get("donation_initial_transform_scale");
            if (str11 != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str11)) != null && fLJIIIIZZ.floatValue() > 0.0f) {
                fFloatValue = fLJIIIIZZ.floatValue();
            } else {
                fFloatValue = -1.0f;
            }
            donationStickerModel = donationStickerModel.copy(donationStickerModel.baseStickerModel, donationStickerModel.visible, donationStickerModel.clickable, str2, str3, str4, str5, str6, str7, str8, string, str, i3, fFloatValue, c1777680wMQLIZIZ.LIZIZ, LIZJ((String) map.get("is_dynamic_render")));
            return donationStickerModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return donationStickerModel;
        }
    }
}
