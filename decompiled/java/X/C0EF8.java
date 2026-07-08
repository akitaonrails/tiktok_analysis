package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.portrait.matting.MattingFuncItemController;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EF8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EF8 implements C0EIO {
    public final C19EG LL;
    public final Lifecycle LLILLJJLI;
    public final C0EGY LLILLL;
    public final VideoPublishEditModel LLILZ;
    public final InterfaceC362350EIn LLILZIL;
    public final C0E48 LLILZLL;
    public final InterfaceC359850E8x LLIZLLLIL;
    public final C0EIE LLIZ = C0EIE.CUTOUT;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1627));

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
        C0E0S.LIZ.getClass();
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = C0E0S.LJI;
        if (keva == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ep_video_cutout_guide_show_");
        sbLIZ.append(currentUserID);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // X.C0EIO
    public final C0EIE getType() {
        return this.LLIZ;
    }

    public final boolean LIZ(List<String> list) {
        boolean mainTrack;
        String creationId;
        String str;
        NLETrack nLETrackPt;
        String str2 = "bottom_item_edit_cutout";
        if ((!list.contains("bottom_item_edit_cutout") && !list.contains("bottom_item_overlay_edit_cutout")) || !C354090DuR.LJIIJJI()) {
            return false;
        }
        C0E48 c0e48 = this.LLILZLL;
        NLETrackSlot nLETrackSlotLLLLLLIL = null;
        if (c0e48 != null) {
            nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
        }
        C0E48 c0e482 = this.LLILZLL;
        if (c0e482 != null && (nLETrackPt = c0e482.Pt()) != null) {
            mainTrack = nLETrackPt.getMainTrack();
        } else {
            mainTrack = false;
        }
        MattingFuncItemController mattingFuncItemController = (MattingFuncItemController) this.LLJ.getValue();
        mattingFuncItemController.LLJILJIL = nLETrackSlotLLLLLLIL;
        mattingFuncItemController.LLJILLL = mainTrack;
        InterfaceC359850E8x interfaceC359850E8x = this.LLIZLLLIL;
        MattingFuncItemController mattingFuncItemController2 = (MattingFuncItemController) this.LLJ.getValue();
        if (!mattingFuncItemController2.LLJILLL ? !(interfaceC359850E8x == null || interfaceC359850E8x.LJ("bottom_item_overlay_edit_cutout") == null) : !(interfaceC359850E8x != null && interfaceC359850E8x.LJII("bottom_item_root_edit", "bottom_item_edit_cutout") == -1)) {
            mattingFuncItemController2.LIZ();
            C361970EHb c361970EHbLJI = mattingFuncItemController2.LJI(mattingFuncItemController2.LLJILLL);
            c361970EHbLJI.LIZIZ(mattingFuncItemController2.LIZLLL(), "key_lottie_anim");
            c361970EHbLJI.LIZIZ(mattingFuncItemController2.LIZJ(), "key_view_anim");
            C361980EHc c361980EHcLIZ = c361970EHbLJI.LIZ();
            C0EI4 c0ei4 = C0EI4.LIZ;
            VideoPublishEditModel videoPublishEditModel = mattingFuncItemController2.LLJILJILJ;
            if (videoPublishEditModel == null || (creationId = videoPublishEditModel.getCreationId()) == null) {
                creationId = "";
            }
            boolean z = mattingFuncItemController2.LLJILLL;
            c0ei4.getClass();
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobShowCutoutHint createId = ");
            sbLIZ.append(creationId);
            sbLIZ.append(" isMainTrack = ");
            sbLIZ.append(z);
            C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            C0LAB c0lab = new C0LAB();
            String str3 = "main";
            if (z) {
                str = "main";
            } else {
                str = "pip";
            }
            c0lab.LJ("enter_from", str);
            if (!z) {
                str3 = "pip";
            }
            c0lab.LJ("enter_from", str3);
            c0lab.LJ("creation_id", creationId);
            C20684815ws.LJIILLIIL("show_cutout_animation_hint", c0lab.LIZ);
            if (interfaceC359850E8x != null) {
                if (!mattingFuncItemController2.LLJILLL) {
                    str2 = "bottom_item_overlay_edit_cutout";
                }
                interfaceC359850E8x.LIZJ(str2, c361980EHcLIZ, true);
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

    public C0EF8(C19EG c19eg, Lifecycle lifecycle, VideoPublishEditModel videoPublishEditModel, C0EGY c0egy, InterfaceC362350EIn interfaceC362350EIn, C0E48 c0e48) {
        this.LL = c19eg;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = c0egy;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = interfaceC362350EIn;
        this.LLILZLL = c0e48;
        this.LLIZLLLIL = c0egy.B20();
    }
}
