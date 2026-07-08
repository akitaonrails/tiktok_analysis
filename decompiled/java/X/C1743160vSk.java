package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerType;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743160vSk {
    public static final C1743160vSk LIZ = new C1743160vSk();
    public static final List<String> LIZIZ = new ArrayList();

    public static void LIZ(BannerFrame bannerFrame, String str, int i, PageFinder pageFinder, String str2, String str3) {
        String str4;
        boolean z;
        Object obj;
        Object c098200Yq;
        int iIntValue;
        String str5;
        String str6;
        String str7;
        Image image;
        List<String> urls;
        String str8 = str3;
        if (Intrinsics.LJFF(str2, "auction")) {
            str4 = "auction";
        } else {
            str4 = "trends";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", str4);
        linkedHashMap.put("item_order", String.valueOf(i));
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("enter_method", str8);
        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
        if (iECommerceMallService != null && iECommerceMallService.hitTopTabExpExperiment()) {
            z = true;
        } else {
            z = false;
        }
        String str9 = "homepage_mall";
        if (z) {
            obj = "homepage_mall";
        } else {
            obj = "mall";
        }
        linkedHashMap.put("enter_from", obj);
        linkedHashMap.put("entrance_type", "banner");
        String str10 = bannerFrame.extra;
        if (str10 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str10);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        if (Intrinsics.LJFF(str, "tiktokec_banner_show")) {
            Object objLJJJLL = linkedHashMap.get("banner_id");
            if (objLJJJLL == null && ((image = bannerFrame.darkImage) == null || (urls = image.getUrls()) == null || (objLJJJLL = C13LP.LJJJLL(urls)) == null)) {
                return;
            }
            ArrayList arrayList = (ArrayList) LIZIZ;
            if (arrayList.contains(objLJJJLL)) {
                return;
            } else {
                arrayList.add(objLJJJLL);
            }
        } else {
            linkedHashMap.put("action_type", "click");
        }
        C1743180vSm c1743180vSm = new Object() { // from class: X.0vSm
        };
        Integer num = bannerFrame.bannerType;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c1743180vSm.getClass();
        LIZ.getClass();
        if (Intrinsics.LJFF(str2, "auction")) {
            str5 = "b17128";
        } else {
            str5 = "b90718";
        }
        if (Intrinsics.LJFF(str2, "auction")) {
            str6 = "c59698";
        } else {
            str6 = "c48128";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a2270.");
        sbLIZ.append(str5);
        sbLIZ.append('.');
        sbLIZ.append(str6);
        sbLIZ.append(".d0");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(str, "tiktokec_banner_show")) {
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZIZ(pageFinder, "tiktokec_banner_show", strLIZIZ, linkedHashMap);
        } else {
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZIZ(pageFinder, "tiktokec_banner_click", strLIZIZ, linkedHashMap);
        }
        if (iIntValue == BannerType.ChannelBannerFrameType_Live.getValue()) {
            if (Intrinsics.LJFF(str2, "auction")) {
                str7 = "auction_banner";
            } else {
                str7 = "trends_banner";
            }
            IECommerceMallService iECommerceMallService2 = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
            if (iECommerceMallService2 == null || !iECommerceMallService2.hitTopTabExpExperiment()) {
                str9 = "mall";
            }
            linkedHashMap.put("enter_from_merge", str9);
            linkedHashMap.put("enter_method", str7);
            linkedHashMap.put("action_type", "click");
            if (Intrinsics.LJFF(str, "tiktokec_banner_show")) {
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZIZ(pageFinder, "livesdk_live_show", strLIZIZ, linkedHashMap);
                return;
            }
            return;
        }
        if (iIntValue == BannerType.ChannelBannerFrameType_Shop.getValue()) {
            Object obj2 = linkedHashMap.get("page_name");
            if (obj2 == null) {
                obj2 = "";
            }
            linkedHashMap.put("source_previous_page", obj2);
            if (Intrinsics.LJFF(str, "tiktokec_banner_show")) {
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZIZ(pageFinder, "tiktokec_shop_entrance_show", strLIZIZ, linkedHashMap);
                return;
            } else {
                linkedHashMap.put("click_area", "banner");
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZIZ(pageFinder, "tiktokec_shop_entrance_click", strLIZIZ, linkedHashMap);
                return;
            }
        }
        if (iIntValue == BannerType.ChannelBannerFrameType_H5.getValue()) {
            return;
        }
        BannerType.ChannelBannerFrameType_Unknown.getValue();
    }
}
