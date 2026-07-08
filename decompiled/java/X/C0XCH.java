package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XCH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCH {
    public C0XDM LIZ;
    public final InterfaceC844530XBb LIZJ;
    public int LIZIZ = 36;
    public final Map<String, String> LIZLLL = new ConcurrentHashMap();
    public final Map<String, String> LJ = new ConcurrentHashMap();

    public C0XCH(InterfaceC844530XBb interfaceC844530XBb) {
        this.LIZJ = interfaceC844530XBb;
    }

    public static void LIZJ(boolean z, Map map, Map map2) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry != null) {
                            String str = (String) entry.getKey();
                            String str2 = (String) entry.getValue();
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (!z || !map2.containsKey(str))) {
                                map2.put(str, str2);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final String LIZ(Context context, StringBuilder sb, boolean z, C0XDP c0xdp) {
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return string;
        }
        Uri uri = UriProtector.parse(string);
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZIZ);
        LIZIZ(context, z, linkedHashMap, c0xdp);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!queryParameterNames.contains(str) && !TextUtils.isEmpty(str2)) {
                builderBuildUpon.appendQueryParameter(str, (String) entry.getValue());
            }
        }
        sb.delete(0, sb.length());
        sb.append(builderBuildUpon.build().toString());
        this.LIZIZ = linkedHashMap.size();
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(54:4|(1:6)|7|201|8|(1:10)|(1:14)|15|(1:18)|19|(1:21)|22|(1:24)(2:142|(1:144))|25|(20:27|(2:29|(1:31))(2:136|(2:138|(1:140))(1:141))|32|(1:34)|35|(1:37)(2:132|(1:134)(14:135|39|(1:41)(13:128|(1:130)|131|44|(1:46)(2:124|(1:126)(1:127))|47|(1:49)(7:121|(1:123)|52|(1:54)(2:117|(1:119)(1:120))|55|(1:57)(2:113|(1:115)(1:116))|58)|(1:51)|52|(0)(0)|55|(0)(0)|58)|(1:43)(1:131)|44|(0)(0)|47|(0)(0)|(0)|52|(0)(0)|55|(0)(0)|58))|38|39|(0)(0)|(0)(0)|44|(0)(0)|47|(0)(0)|(0)|52|(0)(0)|55|(0)(0)|58)|(29:(0)|(1:81)|82|(5:85|(1:87)(1:110)|88|(1:90)(1:109)|(1:93))|94|(1:96)|97|(1:100)|101|(1:103)|104|(1:106)(1:108)|107|205|145|(1:149)|150|153|(1:155)|156|(1:158)|203|159|(4:161|(4:163|207|164|(3:166|(4:169|(3:210|171|(1:216)(3:212|175|217))(1:214)|213|167)|209))|178|(1:182))|183|186|(6:188|(1:190)|191|(1:193)|194|(2:196|(1:198)))|199|200)(1:62)|63|(1:65)|66|(1:68)|69|(1:71)|72|(1:74)|75|(1:77)|(2:79|81)|82|(5:85|(0)(0)|88|(0)(0)|(1:93))|94|(0)|97|(1:100)|101|(0)|104|(0)(0)|107|205|145|(2:147|149)|150|153|(0)|156|(0)|203|159|(0)|183|186|(0)|199|200) */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b5, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0347, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0348, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C844830XCf.LIZLLL(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ec A[Catch: Exception -> 0x0347, TryCatch #1 {Exception -> 0x0347, blocks: (B:159:0x02e8, B:161:0x02ec, B:163:0x02f7, B:177:0x0332, B:178:0x0335, B:180:0x0339, B:182:0x033f, B:183:0x0342, B:164:0x02f9, B:166:0x02ff, B:167:0x0307, B:169:0x030d, B:171:0x0315, B:173:0x0327, B:175:0x032d), top: B:203:0x02e8, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r12, boolean r13, java.util.Map r14, X.C0XDP r15) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XCH.LIZIZ(android.content.Context, boolean, java.util.Map, X.0XDP):void");
    }
}
