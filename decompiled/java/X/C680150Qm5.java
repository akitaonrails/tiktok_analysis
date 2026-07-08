package X;

import com.lynx.tasm.TemplateBundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680150Qm5 {
    public static boolean LIZ;
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doPreDecodeByCategory:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Boolean> map = LIZIZ;
        Object obj = ((LinkedHashMap) map).get(str);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool)) {
            return;
        }
        map.put(str, bool);
        List list = (List) ((Map) C1204504nT.LIZIZ.getValue()).get(str);
        if (list != null && !list.isEmpty()) {
            LIZIZ(list, true);
        }
    }

    public static void LIZ(List list, boolean z) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C683880Qs6.LIZ((String) it2.next(), null, new AbstractC1536860q60() { // from class: X.0Qm3
                    @Override // X.AbstractC1536860q60
                    public final void LIZIZ() {
                        C680150Qm5.LIZLLL("pre_code_cache_post", "");
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZ(String str) {
                        C680150Qm5.LIZLLL("pre_code_cache_error", str);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZJ(String str) {
                        C680150Qm5.LIZLLL("pre_decode_error", str);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LIZLLL(TemplateBundle templateBundle) {
                        C680150Qm5.LIZLLL("pre_decode_success", "");
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LJ(String str) {
                        C680150Qm5.LIZLLL("preload_error", str);
                    }

                    @Override // X.AbstractC1536860q60
                    public final void LJI(byte[] bArr, C1533790q13 c1533790q13, C1532310pyf c1532310pyf) {
                        C680150Qm5.LIZLLL("preload_success", "");
                    }
                }, z, AFwS241S0000000_10.get$arr$(532), 10);
            }
        }
    }

    public static void LIZIZ(List list, boolean z) {
        if (z) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01RN(list, null), 3);
        } else {
            LIZ(list, true);
        }
    }

    public static void LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene_");
        sbLIZ.append(str);
        sbLIZ.append("; error_");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
