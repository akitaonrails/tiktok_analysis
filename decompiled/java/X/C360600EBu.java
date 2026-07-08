package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.ui.AudioRecordFragment;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360600EBu extends C0EH9 {
    public final C0EGH LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final String[] LLJJIJIIJIL;

    public static final VideoPublishEditModel LJIIZILJ() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final void LJIILJJIL() {
        LJIIL(new AudioRecordFragment());
        VideoPublishEditModel videoPublishEditModelLJIIZILJ = LJIIZILJ();
        if (videoPublishEditModelLJIIZILJ != null) {
            C0LAB c0labLIZIZ = C1402900mbw.LIZIZ(videoPublishEditModelLJIIZILJ);
            c0labLIZIZ.LJ("is_editor_pro", "1");
            C20684815ws.LJIILLIIL("click_dub", c0labLIZIZ.LIZ);
        }
    }

    public final void LJIJ() {
        C0EU3 c0eu3 = C0EU3.LIZ;
        C0E48 c0e48LJIIJ = LJIIJ();
        c0eu3.getClass();
        C0EU3.LIZ(c0e48LJIIJ, "click_ep_audio_list");
        C0E48 c0e48LJIIJ2 = LJIIJ();
        if (c0e48LJIIJ2 != null) {
            c0e48LJIIJ2.S7().LIZIZ(Unit.LIZ, "event_click_replace_music", false);
        }
        VideoPublishEditModel videoPublishEditModelLJIIZILJ = LJIIZILJ();
        if (videoPublishEditModelLJIIZILJ != null) {
            C361680EFy.LJJJI("replace_sound", videoPublishEditModelLJIIZILJ, LJIIJ(), null, false, false, null, null, 1016);
        }
    }

    public final void LJIILLIIL() {
        C0E48 c0e48LJIIJ;
        String enterFrom;
        NLETrack nLETrackLIZLLL;
        VideoPublishEditModel videoPublishEditModelLJIIZILJ = LJIIZILJ();
        String str = "";
        if (videoPublishEditModelLJIIZILJ != null) {
            C0E48 c0e48LJIIJ2 = LJIIJ();
            C0E48 c0e48LJIIJ3 = LJIIJ();
            String extra = (c0e48LJIIJ3 == null || (nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48LJIIJ3)) == null) ? null : nLETrackLIZLLL.getExtra("ep_audio_music_id");
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJIIZILJ, c0e48LJIIJ2, new Pair(-1, -1));
            if (extra == null) {
                extra = "";
            }
            c0labLJFF.LJ("music_id", extra);
            c0labLJFF.LIZ(1, "is_editor_pro");
            C20684815ws.LJIILLIIL("click_sound_effect_entrance", c0labLJFF.LIZ);
        }
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            Activity activityLJIIIZ = LJIIIZ();
            VideoPublishEditModel videoPublishEditModelLJIIZILJ2 = LJIIZILJ();
            if (videoPublishEditModelLJIIZILJ2 != null && (enterFrom = videoPublishEditModelLJIIZILJ2.getEnterFrom()) != null) {
                str = enterFrom;
            }
            C0XPD.LIZIZ(activityLJIIIZ, "video_edit_page", str, null, new C0FXF(this, 1));
            return;
        }
        C0E48 c0e48LJIIJ4 = LJIIJ();
        if (c0e48LJIIJ4 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJIIJ4);
            if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
                long jLJII = C351220Dpo.LJII(nLEModelLJI);
                C0E48 c0e48LJIIJ5 = LJIIJ();
                if ((jLJII - ((c0e48LJIIJ5 != null ? c0e48LJIIJ5.getPlayer().Jh() : 0L) * 1000)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < ((Number) C0E5G.LIZIZ(EnumC357850E1f.IMPORT_LIMIT, 100)).intValue()) {
                    Activity activityLJIIIZ2 = LJIIIZ();
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131827574);
                    C1390380mHk.LIZ(activityLJIIIZ2, 6007, creativeToastBuilder);
                    return;
                }
            }
            if (this.LL != null && (c0e48LJIIJ = LJIIJ()) != null) {
                C375820EoO.LIZ(this.LL, c0e48LJIIJ, C373040Eju.class, null, 24);
            }
            nLEModelLJI.setExtra("enter_sound_effect_time", String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // X.C0EHG
    public final boolean LJ(C361980EHc c361980EHc) {
        return C13LQ.LJIILLIIL(c361980EHc.LJI, this.LLJJIJIIJIL);
    }

    @Override // X.C0E96, X.C0EHG
    public final boolean LJII(C361980EHc c361980EHc) {
        if (TextUtils.equals(c361980EHc.LJI, "bottom_item_root_sound")) {
            return true;
        }
        return false;
    }

    public final void LJIILL(String str) {
        C0EU3 c0eu3 = C0EU3.LIZ;
        C0E48 c0e48LJIIJ = LJIIJ();
        c0eu3.getClass();
        C0EU3.LIZ(c0e48LJIIJ, "click_ep_audio_list");
        C0E48 c0e48LJIIJ2 = LJIIJ();
        if (c0e48LJIIJ2 != null) {
            c0e48LJIIJ2.S7().LIZIZ(str, "event_click_add_music", false);
        }
        C0E48 c0e48LJIIJ3 = LJIIJ();
        if (c0e48LJIIJ3 != null) {
            C350870DpF.LJI(c0e48LJIIJ3).setExtra("enter_select_music_time", String.valueOf(System.currentTimeMillis()));
        }
    }

    public C360600EBu(C19A3 c19a3, C1DRG c1drg, C0EGH c0egh) {
        super(c19a3, c1drg, R.id.gcw);
        this.LLJILJIL = c0egh;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1552));
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1553));
        this.LLJJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(394));
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(c1drg, 1558));
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(c1drg, 1555));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(c1drg, 1556));
        c0egh.LJ = new AwS584S0100000_5(this, 1098);
        this.LLJJIJIIJIL = new String[]{"bottom_item_root_sound", "bottom_item_root_sound_sync", "bottom_item_sound_voiceover", "bottom_item_sound_add_sound", "bottom_item_sound_voice_clone", "bottom_item_bgm_edit_delete", "bottom_item_bgm_edit_volume", "bottom_item_sound_replace_sound", "bottom_item_bgm_edit_sound_beats", "bottom_item_bgm_edit_audio_fade", "bottom_item_bgm_edit_adjust", "bottom_item_bgm_edit_lyric", "bottom_item_sound_sound_effect", "bottom_item_sound_effect_edit_copy", "bottom_item_sound_effect_edit_volume", "bottom_item_sound_effect_edit_delete", "bottom_item_voiceover_edit_copy", "bottom_item_voiceover_edit_delete", "bottom_item_voiceover_edit_volume", "bottom_item_voiceover_edit_reduce_noise", "bottom_item_voiceover_edit_split", "bottom_item_voiceover_edit_voice_effect"};
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05c0  */
    @Override // X.C0EHG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C361980EHc r19, android.view.View r20, java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 2624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360600EBu.LIZJ(X.0EHc, android.view.View, java.util.Map):void");
    }
}
