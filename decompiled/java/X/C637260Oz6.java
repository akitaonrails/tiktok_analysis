package X;

import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.profilebanner.data.EventParam;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Oz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637260Oz6 {
    public static final C637260Oz6 LIZ = new C637260Oz6();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(677));

    public static void LIZJ(ProfileBannerInfoModel profileBannerInfoModel) {
        IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) LIZIZ.getValue();
        if (iOutreachFrequency != null) {
            C637270Oz7 c637270Oz7 = new C637270Oz7(profileBannerInfoModel);
            String typeName = EnumC20654715s1.PROFILE_BANNER.getTypeName();
            String str = profileBannerInfoModel.bannerKey;
            if (str == null) {
                str = "";
            }
            iOutreachFrequency.LJ(c637270Oz7, new OutreachInfo(typeName, str, null));
        }
    }

    public static void LIZ(final ProfileBannerInfoModel profileBannerInfoModel, final String str, final String str2, final boolean z) {
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0Oz5
            public final void LIZ() {
                List<EventParam> list;
                EventParam next;
                ProfileBannerInfoModel profileBannerInfoModel2 = profileBannerInfoModel;
                if (profileBannerInfoModel2 != null && (list = profileBannerInfoModel2.eventParams) != null) {
                    Iterator<EventParam> it2 = list.iterator();
                    while (true) {
                        next = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        EventParam eventParam = next;
                        Integer num = eventParam.type;
                        if (num != null && num.intValue() == 5 && C123100dR.LIZ(eventParam.event)) {
                            break;
                        }
                    }
                    EventParam eventParam2 = next;
                    if (eventParam2 != null) {
                        String str3 = str;
                        String str4 = str2;
                        boolean z2 = z;
                        Map<String, String> map = eventParam2.bizParams;
                        if (C19719512Dh.LJII(map) && map != null) {
                            map.put("block_type", str3);
                            map.put("block_detail_reason", str4);
                            map.put("is_show", String.valueOf(z2));
                        }
                        C20684815ws.LJIILLIIL(eventParam2.event, eventParam2.bizParams);
                        return;
                    }
                }
                C20684815ws.LJIILLIIL("profile_banner_mobile_block_funnel", C2097608Jq.LJIIJ(new Pair("block_type", str), new Pair("block_detail_reason", str2), new Pair("is_show", String.valueOf(z))));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ProfileBannerReporter@6c03.recordBlockFunnel$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ProfileBannerReporter@6c03.recordBlockFunnel$1");
            }
        });
        int i = C637280Oz8.LIZ;
    }
}
