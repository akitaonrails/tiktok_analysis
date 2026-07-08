package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestPatchNameSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0aVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937730aVf {
    public static void LIZ() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            if (C936720aU2.LIZ() && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null) {
                interfaceC954180awCLLJLL.LJJ(C2097608Jq.LJIIJ(new Pair("rc", 1)), true);
            }
            boolean zLIZ = C917890Zzf.LIZ(false);
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 != null) {
                interfaceC954180awCLLJLL2.LJJ(C2097608Jq.LJIIJ(new Pair("as", Integer.valueOf(zLIZ ? 1 : 0))), true);
            }
            if (C917880Zze.LIZ()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("p", LinkMicMultiGuestPatchNameSetting.INSTANCE.getValue());
                InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL3 != null) {
                    interfaceC954180awCLLJLL3.LJJIIZI("lp", linkedHashMap, true);
                }
            } else if (LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_all_layout_corner_opt") == 1) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("p", "corner");
                InterfaceC954180awC interfaceC954180awCLLJLL4 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL4 != null) {
                    interfaceC954180awCLLJLL4.LJJIIZI("lp", linkedHashMap2, true);
                }
            } else {
                C939550aYb.LJFF();
            }
            C1ACJ.LIZLLL();
            C937750aVh.LIZJ();
        }
    }
}
