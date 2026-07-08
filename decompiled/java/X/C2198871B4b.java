package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS281S0000000_34;

/* JADX INFO: renamed from: X.1B4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198871B4b {
    public static void LIZJ(C1B4F c1b4f, LinkShareIntentModel linkShareIntentModel) {
        int value;
        String str;
        EnumC2198891B4d enumC2198891B4d;
        int i;
        String str2;
        int size;
        List<String> list;
        if (c1b4f.LIZ == -4) {
            value = EnumC1255700imW.TEMPORAL_DENY.getValue();
        } else {
            value = EnumC1255700imW.GRANTED.getValue();
        }
        if (c1b4f.LIZ == 0) {
            str = "success";
        } else {
            str = "fail";
        }
        if (linkShareIntentModel != null) {
            enumC2198891B4d = linkShareIntentModel.option;
        } else {
            enumC2198891B4d = null;
        }
        if (enumC2198891B4d == EnumC2198891B4d.VIDEO) {
            i = 2;
        } else {
            i = 1;
        }
        C2198841B3y c2198841B3y = C2198841B3y.LIZ;
        if (linkShareIntentModel == null || (str2 = linkShareIntentModel.clientKey) == null) {
            str2 = "";
        }
        if (linkShareIntentModel != null && (list = linkShareIntentModel.mediaUriPaths) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        Integer numValueOf = Integer.valueOf(value);
        c2198841B3y.getClass();
        C2198841B3y.LIZLLL("link_share", str, c1b4f, str2, "", "", i, size, numValueOf, "link_share");
    }

    public static void LJ(Map map, boolean z) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("shoot_way", "link_share");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_photo");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (C298260Bma.LIZ()) {
            ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZ(c2344009Gk.LIZ);
        } else {
            C20684815ws.LJIILLIIL("shoot", c2344009Gk.LIZ);
        }
    }

    public static void LIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("share_from", str);
        if (str2 != null) {
            c2344009Gk.LJFF("share_from_dsp", str2);
        }
        if (str3 != null) {
            c2344009Gk.LJFF("entity_uri", str3);
        }
        C20684815ws.LJIILLIIL("copyright_block_popup", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2, List list) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("launch_method", "link_share");
        c2344009Gk.LJFF("channel", str2);
        c2344009Gk.LJFF("click_actions", str);
        c2344009Gk.LJFF("sharing_channels", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS281S0000000_34.get$arr$(20), 30));
        C20684815ws.LJIILLIIL("tiktok_link_share_page_click", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("share_from", str);
        if (str2 != null) {
            c2344009Gk.LJFF("share_from_dsp", str2);
        }
        if (str3 != null) {
            c2344009Gk.LJFF("entity_uri", str3);
        }
        if (str4 != null) {
            c2344009Gk.LJFF("fail_reason", str4);
        }
        C20684815ws.LJIILLIIL("fail_popup", c2344009Gk.LIZ);
    }
}
