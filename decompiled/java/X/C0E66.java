package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;
import com.ss.ugc.android.editor.components.base.api.IAlbumService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E66, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E66 implements C0E7V, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C19EG LL;
    public final C1DRG LLILLJJLI;
    public final C19A3 LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1307));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1308));
    public final C1664740tQG LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664740tQG LLJI;
    public final C1664750tQH LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E66.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E66.class, "epLegacyApi", "getEpLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0E66.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0E66.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0E66.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0E66.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    @Override // X.C0E7V
    public final void LJFF() {
        C358780E4u c358780E4uXJ2;
        C0EY2 c0ey2LJIIIZ = LJIIIZ();
        VideoPublishEditModel editModel = c0ey2LJIIIZ != null ? c0ey2LJIIIZ.getEditModel() : null;
        C0E48 c0e48LJII = LJII();
        if (c0e48LJII == null) {
            return;
        }
        if (editModel != null) {
            C20684815ws.LJIILLIIL("click_edit_add_material", C361680EFy.LJFF(-1L, editModel, c0e48LJII, new Pair(-1, -1)).LIZ);
        }
        c0e48LJII.LLFII().LJI().getModel();
        C361680EFy.LJLJI("enter_add_video_time", String.valueOf(System.currentTimeMillis()));
        c0e48LJII.getPlayer().pause(false);
        C0EC7 c0ec7LJIIIIZZ = LJIIIIZZ();
        int iLJFF = (c0ec7LJIIIIZZ == null || (c358780E4uXJ2 = c0ec7LJIIIIZZ.xJ2()) == null) ? 0 : c358780E4uXJ2.LJFF();
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            Integer numValueOf = Integer.valueOf(iLJFF);
            AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 1309);
            c0e48LJII.S7().LIZIZ(Boolean.TRUE, "is_showing_album_page", false);
            IAlbumService iAlbumService = (IAlbumService) C0E6J.LIZ.getValue();
            if (iAlbumService != null) {
                iAlbumService.startSelectMediaWithInsertIndex(c19eg, c0e48LJII, 3001, new C0LJQ(35, null, C0E6K.ADD, false, false, 0, false, false, 1012), numValueOf, awS549S0100000_5);
            }
        }
    }

    public final C0E48 LJII() {
        return (C0E48) this.LLILZ.getValue();
    }

    public final C0EC7 LJIIIIZZ() {
        return (C0EC7) this.LLIZ.getValue(this, LLJILJIL[1]);
    }

    public final C0EY2 LJIIIZ() {
        return (C0EY2) this.LLILZLL.getValue(this, LLJILJIL[0]);
    }

    @Override // X.C0E7V
    public final void LIZIZ() {
        VideoPublishEditModel editModel;
        C0E48 c0e48LJII;
        C0E48 c0e48LJII2 = LJII();
        if (c0e48LJII2 != null) {
            if (((Boolean) c0e48LJII2.S7().LIZJ("event_open_audio_record", Boolean.FALSE)).booleanValue()) {
                return;
            }
        }
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "TTTrackRouter", "recordActivityViewModel.startCompileDelay");
        C0EY2 c0ey2LJIIIZ = LJIIIZ();
        if (c0ey2LJIIIZ == null || (editModel = c0ey2LJIIIZ.getEditModel()) == null || (c0e48LJII = LJII()) == null) {
            return;
        }
        ((AudioRecordActivityViewModel) this.LLILZIL.getValue()).AQ2(1000L, editModel, c0e48LJII);
    }

    @Override // X.C0E7V
    public final void LIZJ() {
        C0E48 c0e48LJII;
        C0E2C c0e2cLIZIZ;
        C0E48 c0e48LJII2 = LJII();
        if ((c0e48LJII2 == null || (c0e2cLIZIZ = C0EB5.LIZIZ(c0e48LJII2, (C0EB6) this.LLJI.getValue(this, LLJILJIL[4]))) == null || !c0e2cLIZIZ.LIZ) && (c0e48LJII = LJII()) != null) {
            c0e48LJII.S7().LIZIZ("click_sound_track", "event_click_add_music", false);
        }
    }

    @Override // X.C0E7V
    public final void LJI() {
        C355570Dwp effectController;
        C361270EEj c361270EEjLIZIZ;
        C0EY2 c0ey2LJIIIZ = LJIIIZ();
        VideoPublishEditModel editModel = c0ey2LJIIIZ != null ? c0ey2LJIIIZ.getEditModel() : null;
        if (editModel != null) {
            C361680EFy.LJJIJIIJI(editModel, LJII(), Boolean.TRUE, "effect_panel");
        }
        C0EC7 c0ec7LJIIIIZZ = LJIIIIZZ();
        if (c0ec7LJIIIIZZ != null && (effectController = c0ec7LJIIIIZZ.getEffectController()) != null && (c361270EEjLIZIZ = effectController.LIZIZ()) != null) {
            C0E48 c0e48LJII = LJII();
            if (c0e48LJII == null) {
                return;
            } else {
                C375820EoO.LIZ(this.LLILLL, c0e48LJII, C0ET8.class, new C360020E9o(c0e48LJII, "effect_panel", c361270EEjLIZIZ, 8), 16);
            }
        }
        C0E48 c0e48LJII2 = LJII();
        if (c0e48LJII2 != null) {
            C350870DpF.LJI(c0e48LJII2).setExtra("enter_add_effect_time", String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.C0E7V
    public final void LIZ(NLETrackSlot nLETrackSlot) {
        VecNLETrackSPtr tracks;
        C0E48 c0e48LJII = LJII();
        if (c0e48LJII != null && (tracks = C350870DpF.LJI(c0e48LJII).getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
                if (slots != null) {
                    Iterator<NLETrackSlot> it3 = slots.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.LJFF(it3.next().getUUID(), nLETrackSlot.getUUID())) {
                            C0E48 c0e48LJII2 = LJII();
                            if (c0e48LJII2 != null) {
                                c0e48LJII2.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, null, false, 0, 254), "select_slot_event", false);
                            }
                            C0EJ3 c0ej3 = (C0EJ3) this.LLJ.getValue(this, LLJILJIL[3]);
                            if (c0ej3 != null) {
                                c0ej3.LA0(nLETrackSlot);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.C0E7V
    public final boolean LIZLLL(C0E67 c0e67) {
        boolean z;
        VideoPublishEditModel editModel;
        C358780E4u c358780E4uXJ2;
        C366860EZw c366860EZw;
        C366860EZw c366860EZw2;
        long duration;
        C358780E4u c358780E4uXJ22;
        C0E48 c0e48LJII = LJII();
        if (c0e48LJII == null) {
            return false;
        }
        c0e48LJII.getPlayer().pause(false);
        NLETrackSlot nLETrackSlot = c0e67.LIZ;
        NLETrackSlot nLETrackSlot2 = c0e67.LIZIZ;
        if (!C352250DrT.LJIILIIL(nLETrackSlot) && !C352250DrT.LJIILIIL(nLETrackSlot2)) {
            c0e48LJII.LLFII().LJJL(nLETrackSlot, nLETrackSlot2);
            C0EC7 c0ec7LJIIIIZZ = LJIIIIZZ();
            if (c0ec7LJIIIIZZ != null && (c358780E4uXJ22 = c0ec7LJIIIIZZ.xJ2()) != null && c358780E4uXJ22.LJIJJ("video_transition")) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c0e48LJII.S7().LIZIZ(Unit.LIZ, "update_transition_select", false);
            } else {
                C0EC7 c0ec7LJIIIIZZ2 = LJIIIIZZ();
                if (c0ec7LJIIIIZZ2 != null && (c358780E4uXJ2 = c0ec7LJIIIIZZ2.xJ2()) != null && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_transition_guide", true, false) && (c366860EZw = (C366860EZw) c358780E4uXJ2.LLJJLIIIJLLLLLLLZ.getValue()) != null && !c366860EZw.i3() && (c366860EZw2 = (C366860EZw) c358780E4uXJ2.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
                    c366860EZw2.E3(true);
                }
                C1664750tQH c1664750tQH = this.LLIZLLLIL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
                ((C0E5S) c1664750tQH.getValue(this, interfaceC2217461BqaArr[2])).w6(null, false, false);
                C0EY2 c0ey2LJIIIZ = LJIIIZ();
                if (c0ey2LJIIIZ != null && (editModel = c0ey2LJIIIZ.getEditModel()) != null) {
                    C0LAB c0labLJFF = C361680EFy.LJFF(-1L, editModel, c0e48LJII, new Pair(-1, -1));
                    c0labLJFF.LJ("music_id", editModel.getMusicId());
                    c0labLJFF.LJ("enter_from", editModel.getEnterFrom());
                    c0labLJFF.LIZ(1, "is_editor_pro");
                    C20684815ws.LJIILLIIL("choose_transition", c0labLJFF.LIZ);
                }
                InterfaceC359940E9g interfaceC359940E9gAZ0 = ((C0EGY) this.LLJIJIL.getValue(this, interfaceC2217461BqaArr[5])).AZ0();
                if (interfaceC359940E9gAZ0 != null) {
                    interfaceC359940E9gAZ0.LJIILL();
                }
            }
            NLETrack trackBySlot = C350870DpF.LJI(c0e48LJII).getTrackBySlot(nLETrackSlot);
            if (trackBySlot != null) {
                long[] jArr = new long[2];
                int i = C349360Dmo.LIZJ;
                C350670Dov.LIZIZ(trackBySlot, nLETrackSlot, jArr);
                long j = jArr[1];
                NLESegmentTransition endTransition = nLETrackSlot.getEndTransition();
                if (endTransition != null) {
                    duration = endTransition.getDuration();
                } else {
                    duration = 0;
                }
                c0e48LJII.getPlayer().LJIJI(j - (duration / ((long) 2)), C351110Dpd.LIZ);
            }
            return true;
        }
        new C377260Eqi(c0e48LJII).LIZ();
        C19EG c19eg = this.LL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131850034);
        creativeToastBuilder.isTuxToast(true);
        C1390380mHk.LIZ(c19eg, 5012, creativeToastBuilder);
        return false;
    }

    @Override // X.C0E7V
    public final void LJ(NLETrackSlot nLETrackSlot) {
        C0E48 c0e48LJII = LJII();
        if (c0e48LJII != null) {
            c0e48LJII.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, null, false, 0, 254), "select_slot_event", false);
        }
        InterfaceC359940E9g interfaceC359940E9gAZ0 = ((C0EGY) this.LLJIJIL.getValue(this, LLJILJIL[5])).AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            interfaceC359940E9gAZ0.LIZIZ();
        }
    }

    public C0E66(C19A3 c19a3, C1DRG c1drg, C19EG c19eg) {
        this.LL = c19eg;
        this.LLILLJJLI = c1drg;
        this.LLILLL = c19a3;
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, C0EC7.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, C0E5S.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, C0EJ3.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, C0EB6.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, C0EGY.class, null);
    }
}
