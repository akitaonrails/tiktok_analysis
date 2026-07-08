package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.EditSmartTrimFuncItemController;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EFC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFC implements C0EIO {
    public final C19EG LL;
    public final Lifecycle LLILLJJLI;
    public final C0EGY LLILLL;
    public final InterfaceC362350EIn LLILZ;
    public final C0EIE LLILZIL = C0EIE.SMART_TRIM_EDIT;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1619));

    @Override // X.C0EIO
    public final boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLJJ() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLIILIL() {
        return false;
    }

    @Override // X.C0EIO
    public final boolean LLLLLLL() {
        return ((EditSmartTrimFuncItemController) this.LLILZLL.getValue()).LJII();
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLILZIL;
    }

    public final boolean LIZ(List<String> list) {
        if (!list.contains("bottom_item_edit_smart_trim") || ((EditSmartTrimFuncItemController) this.LLILZLL.getValue()).LJII()) {
            return false;
        }
        InterfaceC359850E8x interfaceC359850E8xB20 = this.LLILLL.B20();
        EditSmartTrimFuncItemController editSmartTrimFuncItemController = (EditSmartTrimFuncItemController) this.LLILZLL.getValue();
        editSmartTrimFuncItemController.getClass();
        if (interfaceC359850E8xB20 == null || interfaceC359850E8xB20.LJII("bottom_item_root_edit", "bottom_item_edit_smart_trim") != -1) {
            editSmartTrimFuncItemController.LIZ();
            C361970EHb c361970EHbLJI = editSmartTrimFuncItemController.LJI();
            c361970EHbLJI.LIZIZ(editSmartTrimFuncItemController.LIZLLL(), "key_lottie_anim");
            c361970EHbLJI.LIZIZ(editSmartTrimFuncItemController.LIZJ(), "key_view_anim");
            C361980EHc c361980EHcLIZ = c361970EHbLJI.LIZ();
            String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
            Keva keva = editSmartTrimFuncItemController.LLILZIL;
            if (keva != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ep_edit_smart_trim_guide_show_");
                sbLIZ.append(currentUserID);
                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
            }
            if (interfaceC359850E8xB20 != null) {
                interfaceC359850E8xB20.LIZJ("bottom_item_edit_smart_trim", c361980EHcLIZ, true);
                return true;
            }
        }
        return true;
    }

    @Override // X.C0EIO
    public final boolean LLLZZIL(List<String> list) {
        return LIZ(list);
    }

    @Override // X.C0EIO
    public final boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        return LIZ(list);
    }

    public C0EFC(C19EG c19eg, Lifecycle lifecycle, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = c0egy;
        this.LLILZ = interfaceC362350EIn;
    }
}
