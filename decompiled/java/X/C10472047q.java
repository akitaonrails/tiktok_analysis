package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.047q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10472047q {
    public static final String LIZIZ(BrandInfo brandInfo) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (brandInfo.prefix != null) {
            arrayList.add("seller_logo");
        }
        List<StoreLabel> list = brandInfo.brandLabels;
        if (list != null) {
            Iterator<StoreLabel> it2 = list.iterator();
            while (it2.hasNext()) {
                StoreOfficialLabel storeOfficialLabel = it2.next().officialLabel;
                if (storeOfficialLabel != null && (str = storeOfficialLabel.labelTypeStr) != null) {
                    arrayList.add(str);
                }
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62);
    }

    public static final void LIZJ(C957403oi c957403oi, String str, Map<String, ? extends Object> map) {
        Object obj;
        if (map != null && (obj = map.get(str)) != null) {
            c957403oi.LIZLLL(str, obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        if (r23.LIZ((java.lang.String) r11.getKey()) == false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183 A[Catch: Exception -> 0x028d, TryCatch #0 {Exception -> 0x028d, blocks: (B:3:0x000c, B:5:0x001e, B:10:0x0033, B:13:0x003c, B:15:0x0043, B:19:0x0057, B:21:0x0061, B:22:0x0069, B:25:0x007f, B:27:0x00a4, B:31:0x00b8, B:33:0x00c2, B:34:0x00ca, B:37:0x00e0, B:39:0x00e8, B:41:0x00ee, B:43:0x00f4, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:50:0x0109, B:51:0x010c, B:52:0x0114, B:54:0x011e, B:57:0x012a, B:59:0x0134, B:62:0x0140, B:64:0x0146, B:66:0x0150, B:72:0x0168, B:74:0x0174, B:76:0x0183, B:77:0x0190, B:79:0x019a, B:81:0x01a4, B:83:0x01ae, B:85:0x01ba, B:87:0x01c0, B:89:0x01d0, B:90:0x01dc, B:92:0x01e3, B:96:0x01f7, B:99:0x0203, B:101:0x020d, B:103:0x0216, B:104:0x0220, B:106:0x0229, B:108:0x0234, B:111:0x0240, B:114:0x024c, B:116:0x0250, B:118:0x025b, B:120:0x025f, B:123:0x026c, B:128:0x0281, B:130:0x0285, B:125:0x0276, B:36:0x00d1, B:24:0x0070), top: B:135:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.util.Map<java.lang.String, java.lang.Object> r21, boolean r22, X.C957403oi r23, boolean r24, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r25) {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10472047q.LIZ(java.util.Map, boolean, X.03oi, boolean, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):void");
    }
}
