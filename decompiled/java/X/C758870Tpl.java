package X;

import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Tpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758870Tpl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, String str, OrganizationModel organizationModel) {
        String str2;
        String str3;
        String str4;
        HashMap map = new HashMap();
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str2);
        if (organizationModel == null || (str3 = organizationModel.name) == null) {
            str3 = "";
        }
        map.put("NGO_name", str3);
        map.put("position", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_donation_icon_show");
        c474500IjALIZ.LJJIIZI(map);
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).enableDonationPercentService()) {
            str4 = "percent";
        } else {
            str4 = "tiltify";
        }
        c474500IjALIZ.LJJII(str4, "powered_by");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIJIL();
        c474500IjALIZ.LIZ();
    }
}
