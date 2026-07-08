package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0lrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373930lrD {
    public static final C1373930lrD LIZ = new C1373930lrD();

    public static void LIZ(Bundle bundle, SharePackage sharePackage) {
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        String string;
        Bundle bundle5;
        String string2 = null;
        if (sharePackage != null && (bundle5 = sharePackage.extras) != null) {
            string2 = bundle5.getString("now_type");
        }
        String str = "";
        if (string2 == null) {
            string2 = "";
        }
        C786410Ut5.LJJJI("now_type", string2, bundle);
        if (sharePackage != null && (bundle4 = sharePackage.extras) != null && (string = bundle4.getString("download_method")) != null) {
            str = string;
        }
        C786410Ut5.LJJJI("download_method", str, bundle);
        if (C1EE2.LIZIZ.LIZLLL() && sharePackage != null && (bundle3 = sharePackage.extras) != null && bundle3.containsKey("is_enter_graphic_detail")) {
            bundle.putInt("is_enter_graphic_detail", sharePackage.extras.getInt("is_enter_graphic_detail", 0));
        }
        C1376270luz c1376270luz = C1376270luz.LIZ;
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            bundle2.getString("download_method");
        }
        c1376270luz.getClass();
        C1376010luZ.LIZ.getClass();
        C1376010luZ.LJJIFFI = bundle;
    }

    public static final void LIZIZ(C1371590lnR c1371590lnR, String str) {
        List<InterfaceC1369790lkX> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", str);
        if (c1371590lnR != null && (list = c1371590lnR.LIZ) != null) {
            int i = 0;
            for (InterfaceC1369790lkX interfaceC1369790lkX : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    linkedHashMap.put(interfaceC1369790lkX.key(), Integer.valueOf(i));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("share_platform_sort_result", linkedHashMap);
        }
    }
}
