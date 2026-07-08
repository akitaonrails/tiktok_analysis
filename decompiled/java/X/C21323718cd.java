package X;

import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import com.tiktok.myna.render.render.MynaTemplateProtocolConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21323718cd {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(Object obj) {
        C21325918cz c21325918cz;
        String strLJ;
        MynaTemplateProtocolConfig config;
        String targetSDKVersion;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = BuildConfig.VERSION_NAME;
        linkedHashMap.put("myna_version", BuildConfig.VERSION_NAME);
        if (!(obj instanceof C21325918cz)) {
            if (!(obj instanceof C21326518d5) && !(obj instanceof AbstractC21333318eB)) {
                if (obj instanceof InterfaceC21323818ce) {
                    InterfaceC21323818ce interfaceC21323818ce = (InterfaceC21323818ce) obj;
                    linkedHashMap.put("biz", interfaceC21323818ce.bizName());
                    linkedHashMap.put("template_name", interfaceC21323818ce.LIZ());
                    linkedHashMap.put("template_url", interfaceC21323818ce.LIZIZ());
                }
            } else if (obj instanceof C21326518d5) {
                c21325918cz = ((C21326518d5) obj).LIZ;
            } else if (obj instanceof AbstractC21333318eB) {
                c21325918cz = ((AbstractC21333318eB) obj).LL;
            }
            return linkedHashMap;
        }
        c21325918cz = (C21325918cz) obj;
        if (c21325918cz != null) {
            MynaTemplateProtocol mynaTemplateProtocol = c21325918cz.LJII;
            if (mynaTemplateProtocol != null && (config = mynaTemplateProtocol.getConfig()) != null && (targetSDKVersion = config.getTargetSDKVersion()) != null) {
                str = targetSDKVersion;
            }
            linkedHashMap.put("target_sdk_version", str);
            linkedHashMap.put("biz", c21325918cz.LIZ.LIZIZ);
            C1774720wHe c1774720wHe = c21325918cz.LIZIZ;
            if (c1774720wHe != null) {
                linkedHashMap.put("template_url", c1774720wHe.LIZ);
                linkedHashMap.put("template_name", C1942607jE.LIZ(c1774720wHe.LIZ));
                String str2 = c1774720wHe.LJ;
                if (str2 != null) {
                    linkedHashMap.put("template_from", str2);
                }
                Long l = c1774720wHe.LIZLLL;
                if (l != null) {
                    linkedHashMap.put("gecko_version", Long.valueOf(l.longValue()));
                }
                C1168270gVV.LIZ.getClass();
                InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get(c21325918cz.LIZ.LIZIZ);
                if (interfaceC1168310gVZ != null && (strLJ = interfaceC1168310gVZ.LJ(c1774720wHe.LIZ)) != null) {
                    linkedHashMap.put("gecko_channel", strLJ);
                    return linkedHashMap;
                }
            }
        }
        return linkedHashMap;
    }
}
