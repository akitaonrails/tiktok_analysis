package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionTextFragment;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F5C, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5C {
    public final InlineCaptionFragment LIZ;
    public final C0F5L LIZIZ;

    public final C0F5K LIZ() {
        return this.LIZ.xT();
    }

    public final void LIZLLL() {
        C201955140j.LIZJ(C563650M8t.LIZIZ, "InlineCaptionFragment -> click delete");
        C1397580mTM c1397580mTM = new C1397580mTM(this.LIZ.requireActivity());
        c1397580mTM.LIZ(2131828399);
        C985403tE.LIZ(c1397580mTM, new AwS584S0100000_5(this, 874));
        new C1397510mTF(c1397580mTM).LIZLLL();
        LIZIZ(Boolean.TRUE, "click_auto_subtitle_delete_all", LIZ().LIZIZ() ? "bulk_edit_select_mode" : "bulk_edit_panel");
    }

    public C0F5C(C0F5L c0f5l, InlineCaptionFragment inlineCaptionFragment) {
        this.LIZ = inlineCaptionFragment;
        this.LIZIZ = c0f5l;
    }

    public final void LIZIZ(Boolean bool, String str, String str2) {
        VideoPublishEditModel videoPublishEditModelZS = this.LIZ.ZS();
        if (videoPublishEditModelZS != null) {
            C0LAB c0labLJJI = u4.LJJI(videoPublishEditModelZS, 1, 4);
            if (bool != null) {
                c0labLJJI.LIZ(bool.booleanValue() ? 1 : 0, "is_select_all");
            }
            if (str2 != null) {
                c0labLJJI.LJ("click_from", str2);
            }
            c0labLJJI.LJ("click", "delete");
            C20684815ws.LJIILLIIL(str, c0labLJJI.LIZ);
        }
    }

    public final void LIZJ(int i, int i2, String str) {
        C0E55 player;
        C0E48 c0e48 = this.LIZ.LL;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.pause(false);
        }
        LIZ().LJI.LJIILLIIL = true;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineCaptionFragment -> showEditCaptionText -> showPosition = ");
        sbLIZ.append(i);
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        VideoPublishEditModel videoPublishEditModelZS = this.LIZ.ZS();
        if (videoPublishEditModelZS != null) {
            C1402610mbT.LJJIJIIJI(1, videoPublishEditModelZS, str, this.LIZ.sT().vQ2(LIZ().LJI.LIZ), null);
        }
        C0EU3 c0eu3 = C0EU3.LIZ;
        C0E48 c0e482 = this.LIZ.LL;
        c0eu3.getClass();
        C0EU3.LIZIZ(c0e482, "inline_caption_text");
        C362580EJk c362580EJk = this.LIZ.LLLLIILLL;
        if (c362580EJk != null) {
            InlineCaptionTextFragment inlineCaptionTextFragment = new InlineCaptionTextFragment(this.LIZ.ZS(), i / 2, i2, str, this.LIZ.sT().vQ2(LIZ().LJI.LIZ), this.LIZ.LLLIIII);
            inlineCaptionTextFragment.LLJJIJI = true;
            inlineCaptionTextFragment.LLJJI = false;
            c362580EJk.LIZJ(inlineCaptionTextFragment);
        }
    }
}
