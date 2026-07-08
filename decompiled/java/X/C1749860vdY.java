package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749860vdY implements AttachUserData {
    public static final C1749860vdY LIZ = new C1749860vdY();

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        C1749880vda c1749880vda;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PageMonitor.LIZ.getClass();
        InterfaceC1748810vbr interfaceC1748810vbr = (InterfaceC1748810vbr) C13LP.LJJJLL(PageMonitor.LJFF);
        if (interfaceC1748810vbr == null || (c1749880vda = PageMonitor.LIZLLL.get(interfaceC1748810vbr)) == null) {
            return linkedHashMap;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("latest_product_id", String.valueOf(C1748730vbj.LIZIZ(interfaceC1748810vbr, "lib_track_builtin_lane_business").get((Object) "product_id")));
        String str = c1749880vda.LIZJ.get("log_id");
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("log_id", str);
        pairArr[2] = new Pair("page_name", c1749880vda.LIZ);
        return C2097608Jq.LJIIJ(pairArr);
    }
}
