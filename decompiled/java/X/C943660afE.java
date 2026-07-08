package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0afE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943660afE {
    public static final ConcurrentHashMap<String, InterfaceC943940afg> LIZ = new ConcurrentHashMap<>();

    @InterfaceC1294060jmO
    public static final void LIZIZ() {
        for (Map.Entry<String, InterfaceC943940afg> entry : LIZ.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clear tag = ");
            sbLIZ.append(entry.getValue().tag());
            sbLIZ.append(", dialog = ");
            sbLIZ.append(entry.getValue());
            C20441214yg.LJIIIZ("CoHostDialogManager", C2188811AlT.LIZIZ(sbLIZ));
            entry.getValue().dismiss();
        }
        LIZ.clear();
    }

    public static final InteractDialogFragmentBaseContract$AbsView LIZJ() {
        InterfaceC980100bc0 interfaceC980100bc0OR;
        InterfaceC943940afg interfaceC943940afg = LIZ.get("LinkDialog");
        if (!(interfaceC943940afg instanceof C957760b1y)) {
            return null;
        }
        InterfaceC957770b1z interfaceC957770b1z = ((C957760b1y) interfaceC943940afg).LIZIZ;
        if (!(interfaceC957770b1z instanceof LinkDialog) || (interfaceC980100bc0OR = ((LinkDialog) interfaceC957770b1z).OR()) == null) {
            return null;
        }
        return interfaceC980100bc0OR.LIZLLL();
    }

    public static final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss tag = ");
        sbLIZ.append(str);
        sbLIZ.append(", dialog = ");
        ConcurrentHashMap<String, InterfaceC943940afg> concurrentHashMap = LIZ;
        sbLIZ.append(concurrentHashMap.get(str));
        C20441214yg.LJIIIZ("CoHostDialogManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC943940afg interfaceC943940afg = concurrentHashMap.get(str);
        if (interfaceC943940afg != null) {
            interfaceC943940afg.dismiss();
        }
        concurrentHashMap.remove(str);
    }

    public static final boolean LIZLLL(String str) {
        InterfaceC943940afg interfaceC943940afg = LIZ.get(str);
        if (interfaceC943940afg == null || !interfaceC943940afg.isVisible()) {
            return false;
        }
        return true;
    }

    public static final void LJ(InterfaceC943940afg interfaceC943940afg) {
        ConcurrentHashMap<String, InterfaceC943940afg> concurrentHashMap = LIZ;
        InterfaceC943940afg interfaceC943940afg2 = concurrentHashMap.get(interfaceC943940afg.tag());
        if (interfaceC943940afg2 != null) {
            interfaceC943940afg2.dismiss();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add tag = ");
        sbLIZ.append(interfaceC943940afg.tag());
        sbLIZ.append(", dialog = ");
        sbLIZ.append(interfaceC943940afg);
        C20441214yg.LJIIIZ("CoHostDialogManager", C2188811AlT.LIZIZ(sbLIZ));
        concurrentHashMap.put(interfaceC943940afg.tag(), interfaceC943940afg);
        interfaceC943940afg.LIZ(new AwS559S0100000_15(interfaceC943940afg, 1165));
        interfaceC943940afg.show();
    }
}
