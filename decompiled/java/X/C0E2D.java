package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentImage;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.jvm.internal.AwS132S0201000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E2D, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E2D implements InterfaceC359180E6i, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1282));
    public final C1664740tQG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664740tQG LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E2D.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E2D.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0E2D.class, "epLegacyApi", "getEpLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0E2D.class, "consoleBar", "getConsoleBar()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0E2D.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0E2D.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0E2D.class, "textNewApi", "getTextNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0E2D.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/info/EditorProInfoStickerApi;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
    }

    public final C0E48 LIZLLL() {
        return (C0E48) this.LLILLJJLI.getValue();
    }

    public final C0EY2 LJIIJ() {
        return (C0EY2) this.LLILLL.getValue(this, LLJIJIL[0]);
    }

    @Override // X.InterfaceC359180E6i
    public final boolean LIZ() {
        C0E2C c0e2cLIZIZ;
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        C0EY2 c0ey2LJIIJ = LJIIJ();
        VideoPublishEditModel editModel = c0ey2LJIIJ != null ? c0ey2LJIIJ.getEditModel() : null;
        boolean z = (editModel == null || (creativeModel = editModel.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) ? false : true;
        C0E48 c0e48LIZLLL = LIZLLL();
        return c0e48LIZLLL != null && (c0e2cLIZIZ = C0EB5.LIZIZ(c0e48LIZLLL, (C0EB6) this.LLIZLLLIL.getValue(this, LLJIJIL[5]))) != null && c0e2cLIZIZ.LIZ && Intrinsics.LJFF(c0e2cLIZIZ.LIZJ, "video_anim_panel") && C351230Dpp.LJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC359180E6i
    public final NLETimeSpaceNode LIZIZ() {
        InterfaceC351610DqR interfaceC351610DqROg;
        MutableLiveData<NLETimeSpaceNode> mutableLiveDataLJJJJL;
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL == null || (interfaceC351610DqROg = c0e48LIZLLL.og()) == null || (mutableLiveDataLJJJJL = interfaceC351610DqROg.LJJJJL()) == null) {
            return null;
        }
        return mutableLiveDataLJJJJL.getValue();
    }

    @Override // X.InterfaceC359180E6i
    public final boolean LJ() {
        C0E2C c0e2cLIZIZ;
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL != null && (c0e2cLIZIZ = C0EB5.LIZIZ(c0e48LIZLLL, (C0EB6) this.LLIZLLLIL.getValue(this, LLJIJIL[5]))) != null) {
            if (!c0e2cLIZIZ.LIZ) {
                return !C1867607Te.LIZ(c0e2cLIZIZ.LIZJ);
            }
            if (!C13LP.LJJJJ(c0e2cLIZIZ.LIZJ, C1697810uHb.LJIIJJI("volume_panel", "adjust_range_panel", "sound_adjust_panel", "customize_cutout_panel", "adjust_opacity_panel", "mask_panel"))) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC359180E6i
    public final void LJI() {
        InterfaceC351610DqR interfaceC351610DqROg;
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL == null || (interfaceC351610DqROg = c0e48LIZLLL.og()) == null) {
            return;
        }
        interfaceC351610DqROg.LLF(C351220Dpo.LLLLLLJ((long) (C360610EBv.LIZIZ / C360610EBv.LIZJ())));
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0E2D(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C0E5S.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, C0EC7.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC360800ECo.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, C0EGY.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, C0EB6.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, C0EJ3.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC363820EOe.class, null);
    }

    @Override // X.InterfaceC359180E6i
    public final void LIZJ(NLETimeSpaceNode nLETimeSpaceNode) {
        InterfaceC351610DqR interfaceC351610DqROg;
        MutableLiveData<NLETimeSpaceNode> mutableLiveDataLJJJJL;
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL != null && (interfaceC351610DqROg = c0e48LIZLLL.og()) != null && (mutableLiveDataLJJJJL = interfaceC351610DqROg.LJJJJL()) != null) {
            mutableLiveDataLJJJJL.setValue(nLETimeSpaceNode);
        }
    }

    @Override // X.InterfaceC359180E6i
    public final String getInfoStickerAssetInfo(String str) {
        INLEMediaSession iNLEMediaSessionF1;
        INLEStickerRuntime stickerApi;
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL != null && (iNLEMediaSessionF1 = c0e48LIZLLL.f1()) != null && (stickerApi = iNLEMediaSessionF1.getStickerApi()) != null) {
            return stickerApi.getInfoStickerAssetInfo(str);
        }
        return null;
    }

    @Override // X.InterfaceC359180E6i
    public final void LJFF(boolean z, boolean z2) {
        VideoPublishEditModel editModel;
        float f;
        String str;
        boolean z3;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0ELJ c0elj;
        if (z2) {
            C0EY2 c0ey2LJIIJ = LJIIJ();
            if (c0ey2LJIIJ != null && (liveDataZu2 = c0ey2LJIIJ.zu2()) != null && (value = liveDataZu2.getValue()) != null && (c0elj = value.LJ) != null && c0elj.getChangeBanMusicMode() != null) {
                z3 = false;
            } else {
                z3 = true;
            }
            C0E48 c0e48LIZLLL = LIZLLL();
            if (c0e48LIZLLL != null && (interfaceC351350Dq1LLFII = c0e48LIZLLL.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LLIIZ(z, z3, EnumC356070Dxd.DONE);
            }
        }
        C0EY2 c0ey2LJIIJ2 = LJIIJ();
        if (c0ey2LJIIJ2 != null && (editModel = c0ey2LJIIJ2.getEditModel()) != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            editModel.setVoiceVolume(f);
            C0E48 c0e48LIZLLL2 = LIZLLL();
            if (c0e48LIZLLL2 != null) {
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, editModel, c0e48LIZLLL2, new Pair(-1, -1));
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                c0labLJFF.LJ("to_status", str);
                C20684815ws.LJIILLIIL("mute_original_sound", c0labLJFF.LIZ);
            }
        }
    }

    @Override // X.InterfaceC359180E6i
    public final void onMainTrackMoveSlot(NLETrackSlot nLETrackSlot, int i, int i2) {
        VideoPublishEditModel editModel;
        String str;
        NLENode nLENode;
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL == null) {
            return;
        }
        if (i != i2 && (nLENode = (NLENode) C13LP.LJJJLZIJ(i2, c0e48LIZLLL.Rn().getSortedSlots())) != null) {
            nLENode.setExtra("is_editorpro_adjust_video_order", "1");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0e48LIZLLL.LLFII().LJJIIJZLJL(nLETrackSlot, i, i2, EnumC356070Dxd.DONE);
        C1664740tQG c1664740tQG = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C0EJ3 c0ej3 = (C0EJ3) c1664740tQG.getValue(this, interfaceC2217461BqaArr[6]);
        if (c0ej3 != null) {
            c0ej3.Rc();
        }
        InterfaceC363820EOe interfaceC363820EOe = (InterfaceC363820EOe) this.LLJI.getValue(this, interfaceC2217461BqaArr[7]);
        if (interfaceC363820EOe != null) {
            interfaceC363820EOe.L51(null);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(jCurrentTimeMillis2, "acc_advanced_edit_move_video_clip_duration");
        C20684815ws.LJIILLIIL("acc_advanced_edit_move_video_clip_duration", c0lab.LIZ);
        C0EY2 c0ey2LJIIJ = LJIIJ();
        if (c0ey2LJIIJ != null && (editModel = c0ey2LJIIJ.getEditModel()) != null) {
            int i3 = i + 1;
            String strValueOf = String.valueOf(i3);
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, editModel, c0e48LIZLLL, new Pair(-1, -1));
            c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e48LIZLLL));
            c0labLJFF.LJ("material_location", strValueOf);
            C20684815ws.LJIILLIIL("long_press_material", c0labLJFF.LIZ);
            String strValueOf2 = String.valueOf(i3);
            int i4 = i2 - i;
            C0LAB c0labLJFF2 = C361680EFy.LJFF(-1L, editModel, c0e48LIZLLL, new Pair(-1, -1));
            c0labLJFF2.LJ("track_type", C361680EFy.LJIL(c0e48LIZLLL));
            c0labLJFF2.LJ("material_location", strValueOf2);
            if (i4 > 0) {
                str = "right";
            } else if (i4 < 0) {
                str = "left";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJFF2.LJ("action_type", str);
            C20684815ws.LJIILLIIL("move_material", c0labLJFF2.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb  */
    @Override // X.InterfaceC359180E6i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(long r26, com.bytedance.ies.nle.editor_jni.NLETrackSlot r28, long r29, long r31) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E2D.LJIIIIZZ(long, com.bytedance.ies.nle.editor_jni.NLETrackSlot, long, long):void");
    }

    @Override // X.InterfaceC359180E6i
    public final void LJIIIZ(long j, NLETrackSlot nLETrackSlot, int i, long j2) {
        C0EY2 c0ey2LJIIJ;
        VideoPublishEditModel editModel;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL != null && (interfaceC351350Dq1LLFII = c0e48LIZLLL.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LLFZ(nLETrackSlot, j, j2, i, EnumC356070Dxd.DONE);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(jCurrentTimeMillis2, "acc_advanced_edit_trim_video_clip_duration");
        C20684815ws.LJIILLIIL("acc_advanced_edit_trim_video_clip_duration", c0lab.LIZ);
        if (C346680DiU.LIZIZ(nLETrackSlot) || NLESegmentImage.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
            nLETrackSlot.setExtra("is_editorpro_trim_video_length", "1");
        }
        C354270Duj.LIZ(0L, new AwS132S0201000_5(i, nLETrackSlot, this, 10));
        C0EB7.LIZIZ((InterfaceC360800ECo) this.LLILZLL.getValue(this, LLJIJIL[3]), true, false);
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null && (c0ey2LJIIJ = LJIIJ()) != null && (editModel = c0ey2LJIIJ.getEditModel()) != null) {
            C361680EFy.LJJJJZI(nLESegmentVideoDynamicCast.getTimeClipEnd() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), j2, editModel, LIZLLL(), "trim");
        }
    }

    @Override // X.InterfaceC359180E6i
    public final void LJII(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL != null) {
            c0e48LIZLLL.S7().LIZIZ(new C357120DzK(i, i2, nLETrackSlot, j, j2, j3, z), "track_slot_move_event", false);
        }
    }
}
