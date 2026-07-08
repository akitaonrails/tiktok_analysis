package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.logic.EditVideoAnimFuncItemController;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EF9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EF9 implements C0EIO {
    public final C19EG LL;
    public final Lifecycle LLILLJJLI;
    public final C0EGY LLILLL;
    public final InterfaceC362350EIn LLILZ;
    public final VideoPublishEditModel LLILZIL;
    public final C0E48 LLILZLL;
    public final InterfaceC359850E8x LLIZ;
    public final C0EIE LLIZLLLIL = C0EIE.VIDEO_ANIMATION_EDIT;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1347));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1622));

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
        return ((EditVideoAnimFuncItemController) this.LLJI.getValue()).LJII();
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLIZLLLIL;
    }

    public final boolean LIZ(List<String> list) {
        if (this.LLIZ == null || !list.contains("bottom_item_edit_video_anim") || ((EditVideoAnimFuncItemController) this.LLJI.getValue()).LJII()) {
            return false;
        }
        EditVideoAnimFuncItemController editVideoAnimFuncItemController = (EditVideoAnimFuncItemController) this.LLJI.getValue();
        InterfaceC359850E8x interfaceC359850E8x = this.LLIZ;
        editVideoAnimFuncItemController.getClass();
        if (interfaceC359850E8x.LJII("bottom_item_root_edit", "bottom_item_edit_video_anim") != -1) {
            editVideoAnimFuncItemController.LIZ();
            C361970EHb c361970EHbLJI = editVideoAnimFuncItemController.LJI();
            c361970EHbLJI.LIZIZ(editVideoAnimFuncItemController.LIZLLL(), "key_lottie_anim");
            c361970EHbLJI.LIZIZ(editVideoAnimFuncItemController.LIZJ(), "key_view_anim");
            C361980EHc c361980EHcLIZ = c361970EHbLJI.LIZ();
            String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
            Keva keva = editVideoAnimFuncItemController.LLILZIL;
            if (keva != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ep_edit_video_anim_guide_show_");
                sbLIZ.append(currentUserID);
                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
            }
            VideoPublishEditModel videoPublishEditModel = editVideoAnimFuncItemController.LLJILJIL;
            if (videoPublishEditModel != null) {
                C0EFE c0efe = C0EFE.LIZ;
                C0E48 c0e48 = editVideoAnimFuncItemController.LLJILJILJ;
                c0efe.getClass();
                C0EFE.LIZIZ(videoPublishEditModel, c0e48, true);
            }
            interfaceC359850E8x.LIZJ("bottom_item_edit_video_anim", c361980EHcLIZ, true);
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

    public C0EF9(C19EG c19eg, Lifecycle lifecycle, VideoPublishEditModel videoPublishEditModel, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn, C0E48 c0e48) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = c0egy;
        this.LLILZ = interfaceC362350EIn;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = c0e48;
        this.LLIZ = c0egy.B20();
    }
}
