package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.filter.logic.EditFilterFuncItemController;
import com.ss.android.ugc.gamora.editorpro.guide.logic.BaseFuncItemGuideController;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EFB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFB implements C0EIO {
    public final C19EG LL;
    public final Lifecycle LLILLJJLI;
    public final C0EGY LLILLL;
    public final InterfaceC362350EIn LLILZ;
    public final VideoPublishEditModel LLILZIL;
    public final C0E48 LLILZLL;
    public final C0EIE LLIZ = C0EIE.FILTER_EDIT;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1625));

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
        Keva keva = ((BaseFuncItemGuideController) this.LLIZLLLIL.getValue()).LLILZIL;
        if (keva != null) {
            return keva.getBoolean("ep_edit_filter_guide_show", false);
        }
        return false;
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLIZ;
    }

    public final boolean LIZ(List<String> list) {
        Keva keva;
        if (!list.contains("bottom_item_edit_filter") || ((keva = ((BaseFuncItemGuideController) this.LLIZLLLIL.getValue()).LLILZIL) != null && keva.getBoolean("ep_edit_filter_guide_show", false))) {
            return false;
        }
        EditFilterFuncItemController editFilterFuncItemController = (EditFilterFuncItemController) this.LLIZLLLIL.getValue();
        InterfaceC359850E8x interfaceC359850E8xB20 = this.LLILLL.B20();
        editFilterFuncItemController.getClass();
        if (interfaceC359850E8xB20 == null || interfaceC359850E8xB20.LJII("bottom_item_root_edit", "bottom_item_edit_filter") != -1) {
            editFilterFuncItemController.LIZ();
            C361970EHb c361970EHbLJI = editFilterFuncItemController.LJI();
            c361970EHbLJI.LIZIZ(editFilterFuncItemController.LIZLLL(), "key_lottie_anim");
            c361970EHbLJI.LIZIZ(editFilterFuncItemController.LIZJ(), "key_view_anim");
            C361980EHc c361980EHcLIZ = c361970EHbLJI.LIZ();
            Keva keva2 = editFilterFuncItemController.LLILZIL;
            if (keva2 != null) {
                keva2.storeBoolean("ep_edit_filter_guide_show", true);
            }
            VideoPublishEditModel videoPublishEditModel = editFilterFuncItemController.LLJILJILJ;
            if (videoPublishEditModel != null) {
                C362710EJx c362710EJx = C362710EJx.LIZ;
                C0E48 c0e48 = editFilterFuncItemController.LLJILLL;
                c362710EJx.getClass();
                C362710EJx.LIZIZ(videoPublishEditModel, c0e48, "editorpro_edit");
            }
            if (interfaceC359850E8xB20 != null) {
                interfaceC359850E8xB20.LIZJ("bottom_item_edit_filter", c361980EHcLIZ, true);
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

    public C0EFB(C19EG c19eg, Lifecycle lifecycle, VideoPublishEditModel videoPublishEditModel, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn, C0E48 c0e48) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = c0egy;
        this.LLILZ = interfaceC362350EIn;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = c0e48;
    }
}
