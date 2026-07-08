package X;

import com.ss.android.vesdk.VEConfigCenter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208751BcX {
    public static final C2208751BcX LIZ = new C2208751BcX();
    public static boolean LIZIZ;

    public static void LIZ() {
        C2216191BoX.LIZ.getClass();
        C2216191BoX.LIZIZ().getClass();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_enable_ab_key_setup_optimization", true, false)) {
            Map<String, Object> mapLIZJ = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ.LIZJ();
            VEConfigCenter vEConfigCenter = VEConfigCenter.getInstance();
            for (Map.Entry entry : ((HashMap) mapLIZJ).entrySet()) {
                vEConfigCenter.updateValue((String) entry.getKey(), entry.getValue());
            }
            return;
        }
        C2208671BcP c2208671BcP = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZIZ;
        c2208671BcP.getClass();
        HashMap map = new HashMap();
        for (Map.Entry entry2 : ((HashMap) C2208671BcP.LIZLLL()).entrySet()) {
            map.put(entry2.getKey(), c2208671BcP.LIZ((InterfaceC2208731BcV) entry2.getValue()).getFirst());
        }
        VEConfigCenter vEConfigCenter2 = VEConfigCenter.getInstance();
        for (Map.Entry entry3 : map.entrySet()) {
            ((String) entry3.getKey()).equals("ve_enable_set_preview_surface_priority");
            vEConfigCenter2.updateValue((String) entry3.getKey(), entry3.getValue());
        }
    }
}
