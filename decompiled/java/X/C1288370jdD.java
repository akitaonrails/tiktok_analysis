package X;

import com.lynx.canvas.Krypton;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0jdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1288370jdD {
    public static void LIZ(String str) {
        Iterator<Map.Entry<String, InterfaceC1288380jdE>> it2 = Krypton.LIZIZ().LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1288380jdE value = it2.next().getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Krypton]");
            sbLIZ.append("EffectDownloaderHelper");
            value.d(C2188811AlT.LIZIZ(sbLIZ), str);
        }
    }

    public static void LIZIZ(String str, String str2) {
        Iterator<Map.Entry<String, InterfaceC1288380jdE>> it2 = Krypton.LIZIZ().LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1288380jdE value = it2.next().getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Krypton]");
            sbLIZ.append(str);
            value.e(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LIZJ(String str, String str2) {
        Iterator<Map.Entry<String, InterfaceC1288380jdE>> it2 = Krypton.LIZIZ().LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1288380jdE value = it2.next().getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Krypton]");
            sbLIZ.append(str);
            value.i(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public static void LIZLLL(String str, String str2) {
        Iterator<Map.Entry<String, InterfaceC1288380jdE>> it2 = Krypton.LIZIZ().LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1288380jdE value = it2.next().getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Krypton]");
            sbLIZ.append(str);
            value.w(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }
}
