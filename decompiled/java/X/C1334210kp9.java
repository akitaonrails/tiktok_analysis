package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECImageService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334210kp9 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("ec_biz_scene", "ec_biz_from", "ec_biz_order");

    public static final void LJ(Image image, Map<String, String> map) {
        List<String> urls = image.getUrls();
        if (urls != null && !urls.isEmpty()) {
            Iterator<String> it2 = urls.iterator();
            while (it2.hasNext()) {
                C1066210dqt.LIZJ(it2.next(), "native", map);
            }
        }
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, int i) {
        String str6 = str5;
        String str7 = str4;
        if ((i & 16) != 0) {
            str7 = null;
        }
        if ((i & 256) != 0) {
            str6 = null;
        }
        if (str.length() != 0 && ECImageService.LIZIZ().LIZ()) {
            try {
                LJFF(str, str2, str3, null, str7, false, false, null, str6, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZ(Image image, EnumC1769850w9n enumC1769850w9n, EnumC1769850w9n enumC1769850w9n2, String str, Integer num, Integer num2, int i) {
        Integer num3 = num;
        String str2 = str;
        EnumC1769850w9n enumC1769850w9n3 = enumC1769850w9n2;
        Integer num4 = null;
        if ((i & 4) != 0) {
            enumC1769850w9n3 = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 64) == 0) {
            num4 = num2;
        }
        Map map = null;
        if (enumC1769850w9n != null && !Intrinsics.LJFF(enumC1769850w9n.getValue(), image.getLocalImageScene())) {
            image.setLocalImageScene(enumC1769850w9n.getValue());
            List<String> urls = image.getUrls();
            if (urls != null && !urls.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (String str3 : urls) {
                    LIZIZ(str3, enumC1769850w9n, str2, num3, false, false, num4, map);
                    arrayList.add(str3);
                    map = null;
                }
                image.setUrls(arrayList);
            }
        }
        if (enumC1769850w9n3 != null && !Intrinsics.LJFF(enumC1769850w9n3.getValue(), image.getLocalThumbImageScene())) {
            image.setLocalThumbImageScene(enumC1769850w9n3.getValue());
            List<String> thumbUrls = image.getThumbUrls();
            if (thumbUrls != null && !thumbUrls.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (String str4 : thumbUrls) {
                    LIZIZ(str4, enumC1769850w9n3, str2, num3, false, false, num4, null);
                    arrayList2.add(str4);
                }
                image.setThumbUrls(arrayList2);
            }
        }
    }

    public static final void LIZIZ(String str, EnumC1769850w9n enumC1769850w9n, String str2, Integer num, boolean z, boolean z2, Integer num2, Map map) {
        String string;
        if (str.length() == 0 || !ECImageService.LIZIZ().LIZ()) {
            return;
        }
        try {
            String value = enumC1769850w9n.getValue();
            if (num != null) {
                string = num.toString();
            } else {
                string = null;
            }
            LJFF(str, value, null, str2, string, z, z2, num2, null, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJFF(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, Integer num, String str6, Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C770702zh.LIZIZ(str2)) {
            linkedHashMap.put("ec_biz_scene", str2);
        }
        if (C770702zh.LIZIZ(str3)) {
            linkedHashMap.put("page_name", str3);
        }
        if (C770702zh.LIZIZ(str4)) {
            linkedHashMap.put("ec_biz_from", str4);
        }
        if (C770702zh.LIZIZ(str5)) {
            linkedHashMap.put("ec_biz_order", str5);
        }
        if (C770702zh.LIZIZ(str6)) {
            linkedHashMap.put("data_source", str6);
        }
        if (z) {
            linkedHashMap.put("biz_is_first", "1");
        }
        if (z2) {
            linkedHashMap.put("biz_is_fake", "1");
        }
        if (num != null) {
            linkedHashMap.put("biz_cover_init_index", String.valueOf(num));
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C1066210dqt.LIZJ(str, "native", linkedHashMap);
    }
}
