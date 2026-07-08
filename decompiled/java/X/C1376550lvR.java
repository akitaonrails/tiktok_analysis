package X;

import com.ss.android.ugc.sdk.experiment.ChannelShareMethodModel;

/* JADX INFO: renamed from: X.0lvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376550lvR {
    public static final ChannelShareMethodModel LIZ = new ChannelShareMethodModel(EnumC1376430lvF.INTENT_SHARE.getNum(), EnumC1376430lvF.INTENT_SHARE.getNum(), EnumC1376430lvF.INTENT_SHARE.getNum(), EnumC1376430lvF.INTENT_SHARE.getNum(), EnumC1376430lvF.INTENT_SHARE.getNum());

    public static ChannelShareMethodModel LIZIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ChannelShareMethodModel channelShareMethodModel = LIZ;
        ChannelShareMethodModel channelShareMethodModel2 = (ChannelShareMethodModel) c0c64LJIILLIIL.LJJII(ChannelShareMethodModel.class, channelShareMethodModel, "ug_channel_share_method_setting", true);
        return channelShareMethodModel2 != null ? channelShareMethodModel2 : channelShareMethodModel;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int LIZ(String str) {
        switch (str.hashCode()) {
            case -1436108013:
                if (str.equals("messenger")) {
                    return LIZIZ().messenger;
                }
                break;
            case 28903346:
                if (str.equals("instagram")) {
                    return LIZIZ().instagram;
                }
                break;
            case 497130182:
                if (str.equals("facebook")) {
                    return LIZIZ().facebook;
                }
                break;
            case 1620810375:
                if (str.equals("facebook_lite")) {
                    return LIZIZ().facebookLite;
                }
                break;
            case 1934780818:
                if (str.equals("whatsapp")) {
                    return LIZIZ().whatsapp;
                }
                break;
        }
        return EnumC1376430lvF.INTENT_SHARE.getNum();
    }
}
