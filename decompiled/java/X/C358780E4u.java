package X;

import Y.AObserverS170S0200000_5;
import Y.AObserverS209S0100000_5;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import com.ss.ugc.android.editor.track.TrackShowType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS134S0400000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS41S0500000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0E4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358780E4u extends C0E54 implements InterfaceC497601wk, C0ETV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final CoroutineContext LLJJIJIIJIL;
    public final C1664740tQG LLJJIJIL;
    public final C1664740tQG LLJJJ;
    public final C1664740tQG LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C1664740tQG LLJJJJJIL;
    public final C1664740tQG LLJJJJLIIL;
    public final C1664740tQG LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public AwS584S0100000_5 LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C358780E4u.class, "textNewApi", "getTextNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C358780E4u.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/info/EditorProInfoStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C358780E4u.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C358780E4u.class, "epAIResultPanelApi", "getEpAIResultPanelApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/shared/results/EditorProAIGCResultsPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C358780E4u.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C358780E4u.class, "previewApi", "getPreviewApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C358780E4u.class, "voiceBeautyApi", "getVoiceBeautyApi()Lcom/ss/android/ugc/gamora/editor/voicebeauty/IEditAudioVoiceBeautyComponent;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    @Override // X.C0E54, X.C0E9K
    public final void LIZIZ() {
    }

    public static final VideoPublishEditModel LJIJI() {
        if (!C364210EPr.LIZIZ) {
            return null;
        }
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    @Override // X.C0E54
    public final void LJIIIZ() {
        C0E5R c0e5r = new C0E5R() { // from class: X.0E5Q
            @Override // X.C0E5R, X.C0EHU
            public final void LIZ(boolean z) {
                InterfaceC359850E8x interfaceC359850E8x;
                C361980EHc c361980EHcLJ;
                List<C0EHX> list;
                String str;
                NLETrack mainTrack;
                VecNLETrackSlotSPtr sortedSlots;
                NLENode nLENode;
                C361980EHc c361980EHc;
                C0E48 c0e48LIZLLL = this.LIZ.LIZLLL();
                if (c0e48LIZLLL == null) {
                    return;
                }
                this.LIZ.LJI().w6(null, false, z);
                C358780E4u c358780E4u = this.LIZ;
                if (c358780E4u.LLJLILLLLZIIL) {
                    c358780E4u.LJI().da0(TrackShowType.VIDEOEFFECT);
                    return;
                }
                if (c358780E4u.LLJLLIL) {
                    c358780E4u.LJI().da0(TrackShowType.AUDIO);
                    return;
                }
                c358780E4u.LJI().da0(TrackShowType.NORMAL);
                this.LIZ.getClass();
                c0e48LIZLLL.S7().LIZIZ(Unit.LIZ, "check_effect_func_event", false);
                if (!C301700Bs8.LIZ() || (interfaceC359850E8x = (InterfaceC359850E8x) this.LIZ.LLILZLL.getValue()) == null || (c361980EHcLJ = interfaceC359850E8x.LJ("bottom_item_root_edit")) == null || (list = c361980EHcLJ.LIZ) == null) {
                    return;
                }
                ArrayList<C0EHX> arrayList = (ArrayList) list;
                if (arrayList.isEmpty()) {
                    return;
                }
                for (C0EHX c0ehx : arrayList) {
                    if ((c0ehx instanceof C361980EHc) && (c361980EHc = (C361980EHc) c0ehx) != null) {
                        str = c361980EHc.LJI;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "bottom_item_edit_cutout")) {
                        List<C0EHX> list2 = c361980EHcLJ.LIZ;
                        if (list2 == null || ((ArrayList) list2).size() != 2 || (mainTrack = C350870DpF.LJI(c0e48LIZLLL).getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || (nLENode = (NLENode) C13LP.LJJJLZIJ(0, sortedSlots)) == null) {
                            return;
                        }
                        nLENode.setExtra("slot_extra_customize_from_editor_tab", "false");
                        return;
                    }
                }
            }

            @Override // X.C0E5R, X.C0EHU
            public final void LIZJ(C361980EHc c361980EHc) {
                InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
                if (Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_edit_background")) {
                    C0E48 c0e48LIZLLL = this.LIZ.LIZLLL();
                    if (c0e48LIZLLL != null && (interfaceC351350Dq1LLFII = c0e48LIZLLL.LLFII()) != null) {
                        interfaceC351350Dq1LLFII.LJLLJ(null, EnumC356070Dxd.DONE, null);
                    }
                    C358780E4u c358780E4u = this.LIZ;
                    C361230EEf.LIZ(c358780E4u.LL, null, (InterfaceC359850E8x) c358780E4u.LLILZLL.getValue());
                }
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.C0E5R, X.C0EHU
            public final void LIZLLL(C361980EHc c361980EHc) {
                C0E48 c0e48LIZLLL = this.LIZ.LIZLLL();
                if (c0e48LIZLLL == null) {
                }
                String str = c361980EHc.LJI;
                Objects.requireNonNull(str);
                switch (str.hashCode()) {
                    case -537412131:
                        if (str.equals("bottom_item_root_filter")) {
                            c0e48LIZLLL.getPlayer().pause(false);
                        }
                        break;
                    case -515611784:
                        if (str.equals("bottom_item_root_sticker")) {
                            c0e48LIZLLL.getPlayer().pause(false);
                        }
                        break;
                    case -459287747:
                        if (str.equals("bottom_item_root_effects")) {
                            c0e48LIZLLL.getPlayer().pause(false);
                        }
                        break;
                    case -143690230:
                        if (str.equals("bottom_item_root_sound")) {
                            c0e48LIZLLL.getPlayer().pause(false);
                            VideoPublishEditModel videoPublishEditModelLJIJI = C358780E4u.LJIJI();
                            if (videoPublishEditModelLJIJI != null) {
                                C0EC5.LJFF(videoPublishEditModelLJIJI, c0e48LIZLLL, "click_button");
                            }
                        }
                        break;
                    case 283352715:
                        if (str.equals("bottom_item_root_overlay") && C357540E0a.LJIIL(c0e48LIZLLL)) {
                            c0e48LIZLLL.getPlayer().pause(false);
                            VideoPublishEditModel videoPublishEditModelLJIJI2 = C358780E4u.LJIJI();
                            if (videoPublishEditModelLJIJI2 != null) {
                                C20684815ws.LJIILLIIL("click_overlay_tab", C361680EFy.LJFF(-1L, videoPublishEditModelLJIJI2, c0e48LIZLLL, new Pair(-1, -1)).LIZ);
                            }
                            break;
                        }
                        break;
                    case 2073146799:
                        if (str.equals("bottom_item_root_edit")) {
                            c0e48LIZLLL.getPlayer().pause(false);
                            this.LIZ.LJI().NT0();
                            this.LIZ.LJI().da0(TrackShowType.NORMAL);
                        }
                        break;
                    case 2073595090:
                        if (str.equals("bottom_item_root_text")) {
                            c0e48LIZLLL.getPlayer().pause(false);
                            VideoPublishEditModel videoPublishEditModelLJIJI3 = C358780E4u.LJIJI();
                            if (videoPublishEditModelLJIJI3 != null) {
                                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJIJI3, c0e48LIZLLL, new Pair(-1, -1));
                                c0labLJFF.LJ("enter_method", "click_button");
                                C20684815ws.LJIILLIIL("click_text_tab", c0labLJFF.LIZ);
                            }
                        }
                        break;
                }
            }

            @Override // X.C0EHU
            public final void LJ(C361980EHc c361980EHc) {
                String str;
                if (c361980EHc != null) {
                    str = c361980EHc.LJI;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, "bottom_item_root_edit")) {
                    this.LIZ.LJI().w6(null, false, false);
                }
            }
        };
        InterfaceC359940E9g interfaceC359940E9g = (InterfaceC359940E9g) this.LLIZ.getValue();
        if (interfaceC359940E9g != null) {
            interfaceC359940E9g.LIZJ(c0e5r);
        }
    }

    public final C0EB6 LJIJ() {
        return (C0EB6) this.LLJJJJJIL.getValue(this, LLLFF[4]);
    }

    @Override // X.C0E5F, X.C0E9K
    public final void onShow() {
        InterfaceC358800E4w interfaceC358800E4w;
        C0E2A c0e2a = (C0E2A) this.LLJZIJLIL.getValue();
        C0E48 c0e48Invoke = c0e2a.LIZJ.invoke();
        if (c0e48Invoke != null) {
            c0e48Invoke.Bo().LIZLLL(c0e2a.LJII);
        }
        C128Y c128y = this.LLILLJJLI;
        if (!(c128y instanceof InterfaceC358800E4w) || (interfaceC358800E4w = (InterfaceC358800E4w) c128y) == null) {
            return;
        }
        interfaceC358800E4w.LLILLIZIL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0Dn2, X.0Dn6] */
    @Override // X.C0E54
    public final void LJIIJJI() {
        MutableLiveData mutableLiveDataLIZLLL;
        super.LJIIJJI();
        C358790E4v c358790E4v = (C358790E4v) this.LLLF.getValue();
        C0E48 c0e48Invoke = c358790E4v.LIZLLL.invoke();
        if (c0e48Invoke != null) {
            C0EB6 c0eb6Invoke = c358790E4v.LJFF.invoke();
            LiveData<C357250DzX> liveDataLa = c0e48Invoke.la();
            if (liveDataLa != null) {
                liveDataLa.observe(c358790E4v.LIZ, new Observer() { // from class: X.04jp
                    @Override // androidx.lifecycle.Observer
                    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                    }
                });
            }
            MutableLiveData mutableLiveDataLIZ = c0e48Invoke.S7().LIZ("selected_audio_track_slot");
            if (mutableLiveDataLIZ != null) {
                mutableLiveDataLIZ.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 140));
            }
            MutableLiveData mutableLiveDataLIZ2 = c0e48Invoke.S7().LIZ("IS_ACTIVE_TRACKPANEL");
            if (mutableLiveDataLIZ2 != null) {
                mutableLiveDataLIZ2.observe(c358790E4v.LIZ, new AObserverS170S0200000_5(c358790E4v, c0e48Invoke, 22));
            }
            LiveData<Boolean> liveDataLJI = c0eb6Invoke != null ? c0eb6Invoke.LJI() : c0e48Invoke.S7().LIZ("is_bottom_panel_showing");
            if (liveDataLJI != null) {
                liveDataLJI.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 141));
            }
            MutableLiveData mutableLiveDataLIZ3 = c0e48Invoke.S7().LIZ("event_START_audio_record");
            if (mutableLiveDataLIZ3 != null) {
                mutableLiveDataLIZ3.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 144));
            }
            MutableLiveData mutableLiveDataLIZ4 = c0e48Invoke.S7().LIZ("select_slot_event");
            if (mutableLiveDataLIZ4 != null) {
                mutableLiveDataLIZ4.observe(c358790E4v.LIZ, new AObserverS170S0200000_5(c358790E4v, c0e48Invoke, 23));
            }
            MutableLiveData mutableLiveDataLIZ5 = c0e48Invoke.S7().LIZ("set_Track_active");
            if (mutableLiveDataLIZ5 != null) {
                mutableLiveDataLIZ5.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 145));
            }
            MutableLiveData mutableLiveDataLIZ6 = c0e48Invoke.S7().LIZ("selected_nle_track");
            if (mutableLiveDataLIZ6 != null) {
                mutableLiveDataLIZ6.observe(c358790E4v.LIZ, new Observer() { // from class: X.0Dw1
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        NLETrack nLETrack = ((C351100Dpc) obj).LIZ;
                        if (nLETrack != null) {
                            nLETrack.getTrackType();
                        }
                    }
                });
            }
            MutableLiveData mutableLiveDataLIZ7 = c0e48Invoke.S7().LIZ("selected_nle_track_slot");
            if (mutableLiveDataLIZ7 != null) {
                mutableLiveDataLIZ7.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 146));
            }
            MutableLiveData mutableLiveDataLIZ8 = c0e48Invoke.S7().LIZ("switch_track_style");
            if (mutableLiveDataLIZ8 != null) {
                mutableLiveDataLIZ8.observe(c358790E4v.LIZ, new AObserverS170S0200000_5(c358790E4v, c0e48Invoke, 24));
            }
            MutableLiveData mutableLiveDataLIZ9 = c0e48Invoke.S7().LIZ("track_slot_move_event");
            if (mutableLiveDataLIZ9 != null) {
                mutableLiveDataLIZ9.observe(c358790E4v.LIZ, new AObserverS170S0200000_5(c358790E4v, c0e48Invoke, 25));
            }
            MutableLiveData mutableLiveDataLIZ10 = c0e48Invoke.S7().LIZ("track_slot_clip_event");
            if (mutableLiveDataLIZ10 != null) {
                mutableLiveDataLIZ10.observe(c358790E4v.LIZ, new AObserverS170S0200000_5(c358790E4v, c0e48Invoke, 26));
            }
            MutableLiveData mutableLiveDataLIZ11 = c0e48Invoke.S7().LIZ("select_slot_and_seek_to_start");
            if (mutableLiveDataLIZ11 != null) {
                mutableLiveDataLIZ11.observe(c358790E4v.LIZ, new AObserverS170S0200000_5(c358790E4v, c0e48Invoke, 27));
            }
            MutableLiveData mutableLiveDataLIZ12 = c0e48Invoke.S7().LIZ("seek_to_slot_start");
            if (mutableLiveDataLIZ12 != null) {
                mutableLiveDataLIZ12.observe(c358790E4v.LIZ, new AObserverS170S0200000_5(c358790E4v, c0e48Invoke, 28));
            }
            MutableLiveData mutableLiveDataLIZ13 = c0e48Invoke.S7().LIZ("move_track_to_position");
            if (mutableLiveDataLIZ13 != null) {
                mutableLiveDataLIZ13.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 147));
            }
            C0E55 player = c0e48Invoke.getPlayer();
            if (player != null && (mutableLiveDataLIZLLL = player.LIZLLL()) != null) {
                mutableLiveDataLIZLLL.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 148));
            }
            MutableLiveData mutableLiveDataLIZ14 = c0e48Invoke.S7().LIZ("main_track_slot_move_event");
            if (mutableLiveDataLIZ14 != null) {
                mutableLiveDataLIZ14.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 149));
            }
            MutableLiveData mutableLiveDataLIZ15 = c0e48Invoke.S7().LIZ("panel_bounce_event");
            if (mutableLiveDataLIZ15 != null) {
                mutableLiveDataLIZ15.observe(c358790E4v.LIZ, new AObserverS170S0200000_5(c358790E4v, c0e48Invoke, 29));
            }
            C350150Do5.LIZIZ(c358790E4v.LIZ.mView).LLILLJJLI.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 138));
            C350150Do5.LIZIZ(c358790E4v.LIZ.mView).LLILLL.observe(c358790E4v.LIZ, new AObserverS209S0100000_5(c358790E4v, 139));
            final C1DRG c1drg = c358790E4v.LIZIZ;
            ?? r2 = new AbstractC349500Dn2(c1drg) { // from class: X.0Dn6
                public static final /* synthetic */ int LJ = 0;

                @Override // X.AbstractC349500Dn2
                public final boolean LIZIZ(C0E48 c0e48, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, NLEModel nLEModel) {
                    return C349570Dn9.LIZ(c0e48, nLETrackSlot, nLETrackSlot2, nLEModel);
                }
            };
            r2.LIZLLL.addAll(C348600Dla.LIZIZ());
            r2.LIZ("adjust_video_order", new AbstractC349610DnD(c1drg) { // from class: X.0Dmy
                @Override // X.InterfaceC349480Dn0
                public final void LIZ(NLEModel nLEModel, Map<String, ? extends ArrayList<NLETrackSlot>> map, ArrayList<C349470Dmz> arrayList) {
                    C349470Dmz c349470Dmz;
                    NLETrackSlot nLETrackSlot;
                    NLETrackSlot nLETrackSlot2;
                    Pair<Integer, Integer> pair;
                    NLENode nLENodeDeepClone;
                    NLETrack next;
                    IntRange intRangeLJIILJJIL;
                    int size;
                    IntRange intRangeLJIILJJIL2;
                    VecNLETrackSlotSPtr slots;
                    if (!arrayList.isEmpty() && (nLETrackSlot = (c349470Dmz = (C349470Dmz) ListProtector.get(arrayList, 0)).LIZIZ) != null && (nLETrackSlot2 = c349470Dmz.LIZ) != null && (pair = c349470Dmz.LIZJ) != null) {
                        int iIntValue = pair.getFirst().intValue();
                        Pair<Integer, Integer> pair2 = c349470Dmz.LIZJ;
                        if (pair2 != null) {
                            int iIntValue2 = pair2.getSecond().intValue();
                            C0E48 c0e48LJ = LJ();
                            if (c0e48LJ != null) {
                                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJ);
                                ArrayList<NLETrackSlot> arrayList2 = new ArrayList<>();
                                Iterator<NLETrack> it2 = nLEModelLJI.getTracks().iterator();
                                while (true) {
                                    nLENodeDeepClone = null;
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        NLETrack nLETrack = next;
                                        if (!nLETrack.getMainTrack() && nLETrack.getResourceType() == NLEResType.SUBTITLE_STICKER) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                NLETrack nLETrack2 = next;
                                if (nLETrack2 != null) {
                                    nLENodeDeepClone = nLETrack2.deepClone(true);
                                }
                                NLETrack nLETrackDynamicCast = NLETrack.dynamicCast(nLENodeDeepClone);
                                VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
                                ArrayList arrayList3 = new ArrayList();
                                for (NLETrack nLETrack3 : tracks) {
                                    if (C351220Dpo.LLLIIL(nLETrack3)) {
                                        arrayList3.add(nLETrack3);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    arrayList4.add(NLETrack.dynamicCast(((NLENode) it3.next()).deepClone(true)));
                                }
                                C351510DqH c351510DqH = C351510DqH.LIZ;
                                NLETrack mainTrack = nLEModel.getMainTrack();
                                c351510DqH.getClass();
                                long jLJJIJ = C351510DqH.LJJIJ(mainTrack, nLETrackSlot2) - C351510DqH.LJJIJ(nLEModelLJI.getMainTrack(), nLETrackSlot);
                                long startTime = nLETrackSlot.getStartTime() - nLETrackSlot2.getStartTime();
                                ArrayList<NLETrackSlot> arrayList5 = (ArrayList) ((LinkedHashMap) map).get(nLETrackSlot.getUUID());
                                if (arrayList5 != null) {
                                    for (NLETrackSlot nLETrackSlot3 : arrayList5) {
                                        nLETrackSlot3.setStartTime(nLETrackSlot3.getStartTime() + startTime);
                                        nLETrackSlot3.setEndTime(nLETrackSlot3.getEndTime() + startTime);
                                        arrayList2.add(nLETrackSlot3);
                                        if (nLETrackSlot3.getMainSegment().getType() == NLEResType.TEXT_STICKER) {
                                            C0EVZ.LIZ.LIZIZ(nLETrackSlot3, LJ());
                                        }
                                        NLETrackSlot nLETrackSlotLJL = C351220Dpo.LJL(nLEModel, nLETrackSlot3.getUUID());
                                        if (nLETrackSlotLJL != null) {
                                            C351510DqH c351510DqH2 = C351510DqH.LIZ;
                                            NLETrack mainTrack2 = nLEModel.getMainTrack();
                                            c351510DqH2.getClass();
                                            LJIIIZ(-jLJJIJ, nLETrackSlot3, nLETrackSlotLJL.getStartTime() - (nLETrackSlot2.getStartTime() + C351510DqH.LJJIJ(mainTrack2, nLETrackSlot2)), nLETrackSlot);
                                        }
                                    }
                                }
                                AwS41S0500000_5 awS41S0500000_5 = new AwS41S0500000_5(nLEModelLJI, nLEModel, (NLEModel) this, (C349460Dmy) arrayList2, (ArrayList<NLETrackSlot>) map, (Map<String, ? extends ArrayList<NLETrackSlot>>) 9);
                                if (iIntValue > iIntValue2) {
                                    intRangeLJIILJJIL = new IntRange(iIntValue2 + 1, iIntValue);
                                } else {
                                    intRangeLJIILJJIL = C13LZ.LJIILJJIL(iIntValue, iIntValue2);
                                }
                                NLETrack mainTrack3 = nLEModelLJI.getMainTrack();
                                if (mainTrack3 != null && (slots = mainTrack3.getSlots()) != null) {
                                    size = slots.size();
                                } else {
                                    size = 0;
                                }
                                if (iIntValue > iIntValue2) {
                                    intRangeLJIILJJIL2 = C13LZ.LJIILJJIL(iIntValue + 1, size);
                                } else {
                                    intRangeLJIILJJIL2 = C13LZ.LJIILJJIL(iIntValue2 + 1, size);
                                }
                                awS41S0500000_5.invoke(intRangeLJIILJJIL);
                                awS41S0500000_5.invoke(intRangeLJIILJJIL2);
                                LIZIZ(map, arrayList2, nLETrackDynamicCast, arrayList4, false);
                            }
                        }
                    }
                }
            });
            r2.LIZ("delete_video", new AbstractC349610DnD(c1drg) { // from class: X.0Dmw
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0166  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0203  */
                /* JADX WARN: Type inference failed for: r24v0, types: [X.0Dmw, X.0DnD] */
                /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
                @Override // X.InterfaceC349480Dn0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(com.bytedance.ies.nle.editor_jni.NLEModel r25, java.util.Map<java.lang.String, ? extends java.util.ArrayList<com.bytedance.ies.nle.editor_jni.NLETrackSlot>> r26, java.util.ArrayList<X.C349470Dmz> r27) {
                    /*
                        Method dump skipped, instruction units count: 574
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C349440Dmw.LIZ(com.bytedance.ies.nle.editor_jni.NLEModel, java.util.Map, java.util.ArrayList):void");
                }
            });
            r2.LIZ("add_video", new AbstractC349610DnD(c1drg) { // from class: X.0Dmx
                @Override // X.InterfaceC349480Dn0
                public final void LIZ(NLEModel nLEModel, Map<String, ? extends ArrayList<NLETrackSlot>> map, ArrayList<C349470Dmz> arrayList) {
                    NLENode nLENodeDeepClone;
                    NLETrack next;
                    long measuredEndTime;
                    long measuredStartTime;
                    long measuredEndTime2;
                    Pair<Integer, Integer> pair;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    ArrayList<NLETrackSlot> arrayList2 = new ArrayList<>();
                    ArrayList arrayList3 = new ArrayList();
                    C0E48 c0e48LJ = LJ();
                    if (c0e48LJ != null) {
                        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJ);
                        Iterator<NLETrack> it2 = nLEModelLJI.getTracks().iterator();
                        while (true) {
                            nLENodeDeepClone = null;
                            if (it2.hasNext()) {
                                next = it2.next();
                                NLETrack nLETrack = next;
                                if (!nLETrack.getMainTrack() && nLETrack.getResourceType() == NLEResType.SUBTITLE_STICKER) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        NLETrack nLETrack2 = next;
                        if (nLETrack2 != null) {
                            nLENodeDeepClone = nLETrack2.deepClone(true);
                        }
                        NLETrack nLETrackDynamicCast = NLETrack.dynamicCast(nLENodeDeepClone);
                        VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
                        ArrayList arrayList4 = new ArrayList();
                        for (NLETrack nLETrack3 : tracks) {
                            if (C351220Dpo.LLLIIL(nLETrack3)) {
                                arrayList4.add(nLETrack3);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(NLETrack.dynamicCast(((NLENode) it3.next()).deepClone(true)));
                        }
                        List<NLETrack> listLJJJLL = C351220Dpo.LJJJLL(nLEModelLJI);
                        List<NLETrack> listLJJIIZ = C351220Dpo.LJJIIZ(nLEModelLJI);
                        NLETrack mainTrack = nLEModel.getMainTrack();
                        if (mainTrack != null) {
                            measuredEndTime = mainTrack.getMeasuredEndTime() - mainTrack.getMeasuredStartTime();
                        } else {
                            measuredEndTime = 0;
                        }
                        NLETrack mainTrack2 = nLEModelLJI.getMainTrack();
                        if (mainTrack2 != null) {
                            measuredStartTime = mainTrack2.getMeasuredStartTime();
                        } else {
                            measuredStartTime = 0;
                        }
                        NLETrack mainTrack3 = nLEModelLJI.getMainTrack();
                        if (mainTrack3 != null) {
                            measuredEndTime2 = mainTrack3.getMeasuredEndTime();
                        } else {
                            measuredEndTime2 = 0;
                        }
                        Iterator it4 = ((LinkedHashMap) map).values().iterator();
                        while (it4.hasNext()) {
                            arrayList3.addAll((ArrayList) it4.next());
                        }
                        C349470Dmz c349470Dmz = (C349470Dmz) C13LP.LJJLIIIJL(arrayList);
                        if (c349470Dmz != null && (pair = c349470Dmz.LIZJ) != null) {
                            int iIntValue = pair.getSecond().intValue() + 1;
                            LIZLLL(iIntValue, nLEModel, map);
                            int size = nLEModelLJI.getMainTrack().getSlots().size();
                            Iterator<C349470Dmz> it5 = arrayList.iterator();
                            long duration = 0;
                            while (it5.hasNext()) {
                                NLETrackSlot nLETrackSlot = it5.next().LIZIZ;
                                if (nLETrackSlot != null) {
                                    duration += nLETrackSlot.getDuration();
                                } else {
                                    return;
                                }
                            }
                            LJFF(C13LZ.LJIILJJIL(iIntValue, size), duration, arrayList2, map, null);
                            if (mainTrack != null) {
                                Iterator it6 = ((ArrayList) listLJJJLL).iterator();
                                while (it6.hasNext()) {
                                    for (NLETrackSlot nLETrackSlot2 : ((NLETrack) it6.next()).getSlots()) {
                                        if (nLETrackSlot2.getDuration() == measuredEndTime) {
                                            nLETrackSlot2.setStartTime(measuredStartTime);
                                            nLETrackSlot2.setEndTime(measuredEndTime2);
                                        }
                                    }
                                }
                                Iterator<NLETrack> it7 = listLJJIIZ.iterator();
                                while (it7.hasNext()) {
                                    for (NLETrackSlot nLETrackSlot3 : it7.next().getSlots()) {
                                        if (nLETrackSlot3.getDuration() == measuredEndTime) {
                                            nLETrackSlot3.setStartTime(measuredStartTime);
                                            nLETrackSlot3.setEndTime(measuredEndTime2);
                                        }
                                    }
                                }
                            }
                            LIZIZ(map, arrayList2, nLETrackDynamicCast, arrayList5, false);
                        }
                    }
                }
            });
            r2.LIZ("clip_video", new C349590DnB(c1drg, r2));
            r2.LIZ("speed_video", new C349630DnF(c1drg));
            r2.LIZ("transition", new AbstractC349610DnD(c1drg) { // from class: X.0DnC
                public final ArrayList<NLETrackSlot> LLILZ = new ArrayList<>();

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC349480Dn0
                public final void LIZ(NLEModel nLEModel, Map<String, ? extends ArrayList<NLETrackSlot>> map, ArrayList<C349470Dmz> arrayList) {
                    C0E48 c0e48LJ;
                    NLETrack next;
                    NLENode nLENodeDeepClone;
                    C0EJ3 c0ej3;
                    NLETrackSlot nLETrackSlot;
                    C0E48 c0e48LJ2;
                    int slotIndex;
                    NLETrackSlot slotByIndex;
                    NLETrack mainTrack;
                    NLETrackSlot slotByIndex2;
                    ArrayList<NLETrackSlot> arrayList2;
                    C0E48 c0e48LJ3;
                    VecNLETrackSlotSPtr slots;
                    if (arrayList.isEmpty() || (c0e48LJ = LJ()) == null) {
                        return;
                    }
                    int size = 0;
                    this.LLILLL = false;
                    this.LLILZ.clear();
                    NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJ);
                    Iterator<NLETrack> it2 = nLEModelLJI.getTracks().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            NLETrack nLETrack = next;
                            if (!nLETrack.getMainTrack() && nLETrack.getResourceType() == NLEResType.SUBTITLE_STICKER) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrack nLETrack2 = next;
                    if (nLETrack2 != null) {
                        nLENodeDeepClone = nLETrack2.deepClone(true);
                    } else {
                        nLENodeDeepClone = null;
                    }
                    NLETrack nLETrackDynamicCast = NLETrack.dynamicCast(nLENodeDeepClone);
                    VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
                    ArrayList arrayList3 = new ArrayList();
                    for (NLETrack nLETrack3 : tracks) {
                        if (C351220Dpo.LLLIIL(nLETrack3)) {
                            arrayList3.add(nLETrack3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(NLETrack.dynamicCast(((NLENode) it3.next()).deepClone(true)));
                    }
                    for (C349470Dmz c349470Dmz : arrayList) {
                        NLETrackSlot nLETrackSlot2 = c349470Dmz.LIZIZ;
                        if (nLETrackSlot2 != null && (nLETrackSlot = c349470Dmz.LIZ) != null && (c0e48LJ2 = LJ()) != null) {
                            NLEModel nLEModelLJI2 = C350870DpF.LJI(c0e48LJ2);
                            long duration = nLETrackSlot.getDuration();
                            C351510DqH.LIZ.getClass();
                            long jLJJIIZI = (duration - C351510DqH.LJJIIZI(nLETrackSlot)) - (nLETrackSlot2.getDuration() - C351510DqH.LJJIIZI(nLETrackSlot2));
                            if (jLJJIIZI != 0) {
                                NLETrack mainTrack2 = nLEModelLJI2.getMainTrack();
                                if (mainTrack2 != null) {
                                    slotIndex = mainTrack2.getSlotIndex(nLETrackSlot2);
                                } else {
                                    slotIndex = -1;
                                }
                                NLETrack mainTrack3 = nLEModelLJI2.getMainTrack();
                                if (mainTrack3 != null && (slots = mainTrack3.getSlots()) != null) {
                                    size = slots.size();
                                }
                                if (slotIndex != -1) {
                                    LJFF(C13LZ.LJIILJJIL(slotIndex + 1, size), ((long) 2) * jLJJIIZI, this.LLILZ, map, null);
                                } else {
                                    slotIndex = -1;
                                }
                                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                                ArrayList<NLETrackSlot> arrayList5 = (ArrayList) linkedHashMap.get(nLETrackSlot2.getUUID());
                                if (arrayList5 != null) {
                                    for (NLETrackSlot nLETrackSlot3 : arrayList5) {
                                        NLETrackSlot nLETrackSlotLJL = C351220Dpo.LJL(nLEModel, nLETrackSlot3.getUUID());
                                        if (nLETrackSlotLJL != null) {
                                            long startTime = nLETrackSlot.getStartTime();
                                            C351510DqH.LIZ.getClass();
                                            long jLJJIIZI2 = (startTime + C351510DqH.LJJIIZI(nLETrackSlot)) - nLETrackSlotLJL.getEndTime();
                                            if ((!((Boolean) C257060A5o.LIZ.getValue()).booleanValue() || nLETrackSlot.getDuration() != nLETrackSlot2.getDuration()) && (c0e48LJ3 = LJ()) != null) {
                                                if (jLJJIIZI < 0) {
                                                    long duration2 = (nLETrackSlot3.getDuration() + jLJJIIZI2) - 100000;
                                                    long j = -jLJJIIZI;
                                                    if (jLJJIIZI2 + 1 <= j && j <= duration2) {
                                                        long j2 = j - jLJJIIZI2;
                                                        long duration3 = nLETrackSlot3.getDuration() - j2;
                                                        c0e48LJ3.LLFII().LLJ(nLETrackSlot3, 0L, duration3, EnumC356070Dxd.NONE);
                                                        nLETrackSlot3.setDuration(duration3);
                                                        AbstractC349610DnD.LJIIIIZZ(this, nLETrackSlot3, nLETrackSlot2, j2, false, 16);
                                                    } else if (j > duration2) {
                                                        NLETrack trackBySlot = C350870DpF.LJI(c0e48LJ3).getTrackBySlot(nLETrackSlot3);
                                                        if (trackBySlot != null) {
                                                            trackBySlot.removeSlot(nLETrackSlot3);
                                                        }
                                                        AbstractC349610DnD.LJIIIIZZ(this, nLETrackSlot3, nLETrackSlot2, 0L, true, 12);
                                                    }
                                                } else {
                                                    if (C351220Dpo.LLJJL(nLETrackSlot3)) {
                                                        C350640Dos.LIZ(nLETrackSlot3, nLETrackSlot2);
                                                    }
                                                    if (C351220Dpo.LLLIIIIL(nLETrackSlot3)) {
                                                        C350640Dos.LIZ(nLETrackSlot3, nLETrackSlot2);
                                                    }
                                                    AbstractC349610DnD.LJIIIIZZ(this, nLETrackSlot3, nLETrackSlot2, 0L, false, 28);
                                                }
                                            }
                                            this.LLILZ.add(nLETrackSlot3);
                                        }
                                    }
                                }
                                int i = slotIndex + 1;
                                NLETrack mainTrack4 = nLEModelLJI2.getMainTrack();
                                if (mainTrack4 != null && (slotByIndex = mainTrack4.getSlotByIndex(i)) != null && (mainTrack = nLEModel.getMainTrack()) != null && (slotByIndex2 = mainTrack.getSlotByIndex(i)) != null && (arrayList2 = (ArrayList) linkedHashMap.get(slotByIndex.getUUID())) != null) {
                                    for (NLETrackSlot nLETrackSlot4 : arrayList2) {
                                        NLETrackSlot nLETrackSlotLJL2 = C351220Dpo.LJL(nLEModel, nLETrackSlot4.getUUID());
                                        if (nLETrackSlotLJL2 != null) {
                                            long startTime2 = slotByIndex2.getStartTime();
                                            C351510DqH c351510DqH = C351510DqH.LIZ;
                                            NLETrack mainTrack5 = nLEModel.getMainTrack();
                                            c351510DqH.getClass();
                                            LJIIIZ(-jLJJIIZI, nLETrackSlot4, nLETrackSlotLJL2.getStartTime() - (startTime2 + C351510DqH.LJJIJ(mainTrack5, slotByIndex2)), slotByIndex);
                                            this.LLILZ.add(nLETrackSlot4);
                                        }
                                    }
                                }
                            }
                        }
                        size = 0;
                    }
                    LIZIZ(map, this.LLILZ, nLETrackDynamicCast, arrayList4, size);
                    if (this.LLILLL && (c0ej3 = (C0EJ3) this.LL.LJIIL(null, C0EJ3.class)) != null) {
                        c0ej3.Rc();
                    }
                }
            });
            r2.LIZ("replace", new AbstractC349610DnD(c1drg) { // from class: X.0Dn5
                @Override // X.InterfaceC349480Dn0
                public final void LIZ(NLEModel nLEModel, Map<String, ? extends ArrayList<NLETrackSlot>> map, ArrayList<C349470Dmz> arrayList) {
                    C349470Dmz c349470Dmz;
                    NLETrackSlot nLETrackSlot;
                    NLETrackSlot nLETrackSlot2;
                    NLEResType type;
                    long endTime;
                    NLEResType type2;
                    C0E48 c0e48LJ = LJ();
                    if (c0e48LJ == null || arrayList.isEmpty() || (nLETrackSlot = (c349470Dmz = (C349470Dmz) ListProtector.get(arrayList, 0)).LIZIZ) == null || (nLETrackSlot2 = c349470Dmz.LIZ) == null) {
                        return;
                    }
                    ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
                    NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJ);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    ArrayList<NLETrackSlot> arrayList3 = (ArrayList) linkedHashMap.get(nLETrackSlot.getUUID());
                    if (arrayList3 != null) {
                        for (NLETrackSlot nLETrackSlot3 : arrayList3) {
                            if (C351220Dpo.LLLLIL(nLETrackSlot3)) {
                                long startTime = nLETrackSlot2.getStartTime();
                                C351510DqH.LIZ.getClass();
                                endTime = startTime + C351510DqH.LJJIIZI(nLETrackSlot2);
                            } else {
                                endTime = nLETrackSlot2.getEndTime();
                            }
                            LJII(nLETrackSlot3, nLETrackSlot2, nLETrackSlot, nLETrackSlot.getDuration() - nLETrackSlot2.getDuration(), endTime - nLETrackSlot3.getEndTime());
                            arrayList2.add(nLETrackSlot3);
                            NLESegment mainSegment = nLETrackSlot3.getMainSegment();
                            if (mainSegment != null) {
                                type2 = mainSegment.getType();
                            } else {
                                type2 = null;
                            }
                            if (type2 == NLEResType.TEXT_STICKER) {
                                C0EVZ.LIZ.LIZIZ(nLETrackSlot3, c0e48LJ);
                            }
                            LJIIJ(nLETrackSlot3, nLETrackSlot);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        for (NLETrackSlot nLETrackSlot4 : arrayList2) {
                            if (C349550Dn7.LJI(nLETrackSlot4) || C385050F7v.LJIIIZ(nLETrackSlot4)) {
                                ArrayList<NLETrackSlot> arrayList4 = new ArrayList();
                                ArrayList<NLETrackSlot> arrayList5 = (ArrayList) linkedHashMap.get(nLETrackSlot.getUUID());
                                if (arrayList5 != null) {
                                    for (NLETrackSlot nLETrackSlot5 : arrayList5) {
                                        if (!C349570Dn9.LIZ(c0e48LJ, nLETrackSlot5, nLETrackSlot, nLEModelLJI)) {
                                            arrayList4.add(nLETrackSlot5);
                                        }
                                    }
                                }
                                for (NLETrackSlot nLETrackSlot6 : arrayList4) {
                                    long duration = (nLETrackSlot2.getDuration() - nLETrackSlot.getDuration()) - (nLETrackSlot2.getEndTime() - nLETrackSlot6.getStartTime());
                                    if (duration > 0) {
                                        nLETrackSlot6.setStartTime(nLETrackSlot6.getStartTime() - duration);
                                        nLETrackSlot6.setEndTime(nLETrackSlot6.getEndTime() - duration);
                                        NLESegment mainSegment2 = nLETrackSlot6.getMainSegment();
                                        if (mainSegment2 != null) {
                                            type = mainSegment2.getType();
                                        } else {
                                            type = null;
                                        }
                                        if (type == NLEResType.TEXT_STICKER) {
                                            C0EVZ.LIZ.LIZIZ(nLETrackSlot6, c0e48LJ);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int slotIndex = c0e48LJ.Rn().getSlotIndex(nLETrackSlot);
                    int size = c0e48LJ.Rn().getSlots().size();
                    if (slotIndex != -1 && slotIndex != size - 1) {
                        LJFF(C13LZ.LJIILJJIL(slotIndex + 1, size), nLETrackSlot.getDuration() - nLETrackSlot2.getDuration(), null, map, null);
                    }
                }
            });
            r2.LIZ("stick_point", new C349630DnF(c1drg) { // from class: X.0DnA
                @Override // X.C349630DnF, X.InterfaceC349480Dn0
                public final void LIZ(NLEModel nLEModel, Map<String, ? extends ArrayList<NLETrackSlot>> map, ArrayList<C349470Dmz> arrayList) {
                    C349580DnA c349580DnA;
                    C0E48 c0e48LJ;
                    NLETrackSlot nLETrackSlot;
                    NLESegmentVideo nLESegmentVideo;
                    int i;
                    VecNLETrackSlotSPtr sortedSlots;
                    NLENode nLENode;
                    ArrayList<NLETrackSlot> arrayList2;
                    long endTime;
                    if (arrayList.isEmpty() || (c0e48LJ = (c349580DnA = this).LJ()) == null) {
                        return;
                    }
                    for (C349470Dmz c349470Dmz : arrayList) {
                        NLETrackSlot nLETrackSlot2 = c349470Dmz.LIZIZ;
                        if (nLETrackSlot2 != null) {
                            ArrayList arrayList3 = null;
                            NLESegmentVideo nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment());
                            if (nLESegmentVideo2 != null && (nLETrackSlot = c349470Dmz.LIZ) != null && (nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment())) != null) {
                                if (nLESegmentVideo2.getAbsSpeed() != nLESegmentVideo.getAbsSpeed()) {
                                    c349580DnA.LJIIJJI(map, nLETrackSlot2, nLESegmentVideo2, nLESegmentVideo, nLETrackSlot, null);
                                }
                                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                                ArrayList<NLETrackSlot> arrayList4 = (ArrayList) linkedHashMap.get(nLETrackSlot.getUUID());
                                if (arrayList4 != null) {
                                    for (NLETrackSlot nLETrackSlot3 : arrayList4) {
                                        NLETrackSlot nLETrackSlotLJL = C351220Dpo.LJL(nLEModel, nLETrackSlot3.getUUID());
                                        if (nLETrackSlotLJL != null) {
                                            if (C351220Dpo.LLLLIL(nLETrackSlot3)) {
                                                long startTime = nLETrackSlot.getStartTime();
                                                C351510DqH.LIZ.getClass();
                                                endTime = startTime + C351510DqH.LJJIIZI(nLETrackSlot);
                                            } else {
                                                endTime = nLETrackSlot.getEndTime();
                                            }
                                            c349580DnA = c349580DnA;
                                            c349580DnA.LJII(nLETrackSlot3, nLETrackSlot, nLETrackSlot2, nLETrackSlot2.getDuration() - nLETrackSlot.getDuration(), endTime - nLETrackSlotLJL.getEndTime());
                                            c349580DnA.LJIIJ(nLETrackSlot3, nLETrackSlot2);
                                        }
                                    }
                                }
                                long duration = nLETrackSlot.getDuration();
                                C351510DqH.LIZ.getClass();
                                long jLJJIIZI = (duration - C351510DqH.LJJIIZI(nLETrackSlot)) - (nLETrackSlot2.getDuration() - C351510DqH.LJJIIZI(nLETrackSlot2));
                                if (jLJJIIZI != 0) {
                                    long jLJJIIZI2 = C351510DqH.LJJIIZI(nLETrackSlot) + nLETrackSlot.getStartTime();
                                    ArrayList arrayList5 = (ArrayList) linkedHashMap.get(nLETrackSlot.getUUID());
                                    if (arrayList5 != null) {
                                        arrayList3 = new ArrayList();
                                        for (Object obj : arrayList5) {
                                            if (C351220Dpo.LLLLIL((NLETrackSlot) obj)) {
                                                arrayList3.add(obj);
                                            }
                                        }
                                    }
                                    C0E48 c0e48LJ2 = c349580DnA.LJ();
                                    if (c0e48LJ2 != null) {
                                        Keva keva = C350660Dou.LIZ;
                                        C350660Dou.LIZLLL(arrayList3, nLETrackSlot2, jLJJIIZI2, jLJJIIZI, C350870DpF.LJI(c0e48LJ2), c0e48LJ2.LLFII().LJI());
                                    }
                                }
                                VecNLETrackSlotSPtr sortedSlots2 = c0e48LJ.Rn().getSortedSlots();
                                int iIndexOf = sortedSlots2.indexOf(nLETrackSlot2);
                                if (iIndexOf != -1 && (i = iIndexOf + 1) >= 0 && i < sortedSlots2.size()) {
                                    IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(i, sortedSlots2.size());
                                    long duration2 = nLETrackSlot.getDuration();
                                    C351510DqH.LIZ.getClass();
                                    long duration3 = ((nLETrackSlot2.getDuration() - nLETrackSlot.getDuration()) + (duration2 - C351510DqH.LJJIJIIJI(nLETrackSlot))) - (nLETrackSlot2.getDuration() - C351510DqH.LJJIJIIJI(nLETrackSlot2));
                                    int i2 = intRangeLJIILJJIL.LL;
                                    int i3 = intRangeLJIILJJIL.LLILLJJLI;
                                    if (i2 <= i3) {
                                        while (true) {
                                            NLETrack mainTrack = nLEModel.getMainTrack();
                                            if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLENode = (NLENode) C13LP.LJJJLZIJ(i2, sortedSlots)) != null && (arrayList2 = (ArrayList) linkedHashMap.get(nLENode.getUUID())) != null) {
                                                for (NLETrackSlot nLETrackSlot4 : arrayList2) {
                                                    nLETrackSlot4.setStartTime(nLETrackSlot4.getStartTime() + duration3);
                                                    nLETrackSlot4.setEndTime(nLETrackSlot4.getEndTime() + duration3);
                                                    C350640Dos.LIZLLL(C350870DpF.LJI(c0e48LJ), nLETrackSlot4);
                                                }
                                            }
                                            if (i2 != i3) {
                                                i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            });
            TrackLinkageManagerProvider.Companion.getClass();
            ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
            ((TrackLinkageManagerProvider) C364210EPr.LIZIZ(TrackLinkageManagerProvider.class)).setBusinessTrackLinkageManager(r2);
        }
    }

    @Override // X.C0E54
    public final boolean LJIIL() {
        C0E48 c0e48LIZLLL;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        InterfaceC351610DqR interfaceC351610DqROg;
        VideoPublishEditModel videoPublishEditModelLJIJI = LJIJI();
        if (videoPublishEditModelLJIJI != null && C1416310mxZ.LJJJJZI(videoPublishEditModelLJIJI)) {
            return false;
        }
        C363500EMy.LIZ.getClass();
        if (C363500EMy.LJIIJ) {
            return false;
        }
        InterfaceC377410Eqx interfaceC377410Eqx = (InterfaceC377410Eqx) this.LLJJJJ.getValue(this, LLLFF[3]);
        if (interfaceC377410Eqx != null && interfaceC377410Eqx.LJLILLLLZI()) {
            return false;
        }
        C0E48 c0e48LIZLLL2 = LIZLLL();
        C0E2C c0e2cLIZIZ = c0e48LIZLLL2 != null ? C0EB5.LIZIZ(c0e48LIZLLL2, LJIJ()) : null;
        List listLJIIJJI = C1697810uHb.LJIIJJI("volume_panel", "adjust_opacity_panel", "mask_panel");
        C0E48 c0e48LIZLLL3 = LIZLLL();
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48LIZLLL3 != null ? c0e48LIZLLL3.LLLLLLIL() : null;
        C0E48 c0e48LIZLLL4 = LIZLLL();
        boolean zLJJLIIIJL = (c0e48LIZLLL4 == null || (interfaceC351610DqROg = c0e48LIZLLL4.og()) == null) ? false : interfaceC351610DqROg.LJJLIIIJL();
        if (c0e2cLIZIZ == null) {
            return super.LJIIL();
        }
        if (c0e2cLIZIZ.LIZ) {
            return !(Intrinsics.LJFF(c0e2cLIZIZ.LIZJ, "mask_panel") && ((c0e48LIZLLL = LIZLLL()) == null || (interfaceC351350Dq1LLFII = c0e48LIZLLL.LLFII()) == null || interfaceC351350Dq1LLFII.LJJJJ(nLETrackSlotLLLLLLIL) == null)) && C13LP.LJJJJ(c0e2cLIZIZ.LIZJ, listLJIIJJI) && zLJJLIIIJL;
        }
        if (C1867607Te.LIZ(c0e2cLIZIZ.LIZJ)) {
            return false;
        }
        return zLJJLIIIJL;
    }

    @Override // X.C0E54, X.C0E9K
    public final void onDestroy() {
        InterfaceC358800E4w interfaceC358800E4w;
        super.onDestroy();
        C371410EhH.LIZJ(AFwS221S0000000_31.get$arr$(523));
        C128Y c128y = this.LLILLJJLI;
        if ((c128y instanceof InterfaceC358800E4w) && (interfaceC358800E4w = (InterfaceC358800E4w) c128y) != null) {
            interfaceC358800E4w.LJLJL(this);
        }
        C2296808zG.LIZJ(this, null);
    }

    @Override // X.C0E54, X.C0E9K
    public final void onHide() {
        InterfaceC358800E4w interfaceC358800E4w;
        super.onHide();
        C0E2A c0e2a = (C0E2A) this.LLJZIJLIL.getValue();
        C0E48 c0e48Invoke = c0e2a.LIZJ.invoke();
        if (c0e48Invoke != null) {
            c0e48Invoke.Bo().LIZJ(c0e2a.LJII);
        }
        C128Y c128y = this.LLILLJJLI;
        if (!(c128y instanceof InterfaceC358800E4w) || (interfaceC358800E4w = (InterfaceC358800E4w) c128y) == null) {
            return;
        }
        interfaceC358800E4w.LJLJL(this);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C0E54
    public final void LJIIJ(boolean z) {
        C0E48 c0e48LIZLLL;
        MutableLiveData mutableLiveDataLIZ;
        if (z && (c0e48LIZLLL = LIZLLL()) != null && (mutableLiveDataLIZ = c0e48LIZLLL.S7().LIZ("selected_track_slot_event")) != null) {
            mutableLiveDataLIZ.observe(this.LLILLJJLI, new AObserverS209S0100000_5(this, 142));
        }
    }

    public final boolean LJIJJ(String str) {
        C0E2C c0e2cLIZIZ;
        C0E48 c0e48LIZLLL = LIZLLL();
        if (c0e48LIZLLL != null && (c0e2cLIZIZ = C0EB5.LIZIZ(c0e48LIZLLL, LJIJ())) != null && c0e2cLIZIZ.LIZ && Intrinsics.LJFF(c0e2cLIZIZ.LIZJ, str)) {
            return true;
        }
        return false;
    }

    public C358780E4u(C372480Ej0 c372480Ej0, C1DRG c1drg, C19GS c19gs) {
        super(c372480Ej0, c1drg, c19gs);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJIJIIJIL = C2107308Nj.LIZ.plus(C2296908zH.LIZ());
        this.LLJJIJIL = C1664770tQJ.LIZIZ(this.LLILLL, C0EJ3.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(this.LLILLL, InterfaceC363820EOe.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(this.LLILLL, InterfaceC377540ErA.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(this.LLILLL, InterfaceC377410Eqx.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(this.LLILLL, C0EB6.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(this.LLILLL, InterfaceC361710EGb.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(this.LLILLL, C0E53.class, null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(307));
        this.LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(c372480Ej0, 1096));
        this.LLJZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(304));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS406S0200000_5(c19gs, this, 106));
        this.LLL = C452501pT.LIZIZ(new AwS249S0300000_5(c19gs, c372480Ej0, this, 20));
        this.LLLF = C452501pT.LIZIZ(new AwS134S0400000_5(c19gs, c372480Ej0, c1drg, this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0253 A[PHI: r2
      0x0253: PHI (r2v9 X.0Et4) = (r2v22 X.0Et4), (r2v23 X.0Et4), (r2v24 X.0Et4), (r2v6 X.0Et4) binds: [B:111:0x0230, B:124:0x0250, B:113:0x0236, B:117:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033d  */
    @Override // X.C0ETV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLLLIL(int r28, int r29, android.content.Intent r30) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358780E4u.LLLLLIL(int, int, android.content.Intent):boolean");
    }
}
