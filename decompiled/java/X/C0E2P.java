package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS170S0200000_5;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E2P, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E2P extends C0ETX<C0E2T, C0EBH, C0E2U, C0EBL> implements C0E2T {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public final C19A3 LLJJJJJIL;
    public final Activity LLJJJJLIIL;
    public final C1DRG LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public float LLJZIJLIL;
    public long LLL;
    public boolean LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E2P.class, "canvasApi", "getCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E2P.class, "volumePanelDataApi", "getVolumePanelDataApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/volume/VolumePanelDataApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0E2P.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLLFFI = 8;
    }

    private final C0E2O J6() {
        return (C0E2O) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final C354040DuM R5() {
        return (C354040DuM) this.LLJLLIL.getValue();
    }

    private final C0EBB m6() {
        return (C0EBB) this.LLJLL.getValue();
    }

    @Override // ge.i
    public Function0<C0EBH> E3() {
        return new AwS549S0100000_5(this, 749);
    }

    public final InterfaceC355120Dw6 K6() {
        return (InterfaceC355120Dw6) this.LLJLIL.getValue(this, LLLFF[1]);
    }

    public final InterfaceC362230EIb S5() {
        return (InterfaceC362230EIb) this.LLJL.getValue(this, LLLFF[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0E2U> o2() {
        return AFwS191S0000000_5.get$arr$(212);
    }

    public final C0E5S u6() {
        return (C0E5S) this.LLJLILLLLZIIL.getValue(this, LLLFF[2]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EBL> w2() {
        return new AwS549S0100000_5(this, 748);
    }

    private final void N6() {
        if (Intrinsics.LJFF(L6(), "music")) {
            C0E2R c0e2rT4 = T4();
            if (c0e2rT4 != null) {
                c0e2rT4.zs2(false);
            }
            i3(AFwS234S0000000_5.get$arr$(329));
            return;
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || !C351220Dpo.LLLILZ(c0e48F4)) {
            C0E2R c0e2rT42 = T4();
            if (c0e2rT42 != null) {
                c0e2rT42.zs2(true);
            }
            i3(AFwS234S0000000_5.get$arr$(331));
            return;
        }
        C0E2R c0e2rT43 = T4();
        if (c0e2rT43 != null) {
            c0e2rT43.zs2(false);
        }
        i3(AFwS234S0000000_5.get$arr$(330));
    }

    private final void P6() {
        LiveEvent<Unit> liveEventGs1;
        LiveEvent<Unit> liveEventL72;
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        InterfaceC351610DqR interfaceC351610DqROg;
        MutableLiveData<C375830EoP<Boolean>> mutableLiveDataLJJLJ;
        MutableLiveData mutableLiveDataLIZ;
        InterfaceC355120Dw6 interfaceC355120Dw6K6 = K6();
        if (interfaceC355120Dw6K6 == null) {
            return;
        }
        MutableLiveData<C351080Dpa> slotSelectChangedEvent = interfaceC355120Dw6K6.getSlotSelectChangedEvent();
        if (slotSelectChangedEvent != null) {
            slotSelectChangedEvent.observe(this, new AObserverS170S0200000_5(this, interfaceC355120Dw6K6, 10));
        }
        LiveData<C357250DzX> volumeKeyframe = interfaceC355120Dw6K6.getVolumeKeyframe();
        if (volumeKeyframe != null) {
            volumeKeyframe.observe(this, new AObserverS170S0200000_5(this, interfaceC355120Dw6K6, 11));
        }
        if (C351230Dpp.LIZIZ()) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (mutableLiveDataLIZ = c0e48F4.S7().LIZ("video_position_event")) != null) {
                mutableLiveDataLIZ.observe(this, new AObserverS170S0200000_5(this, interfaceC355120Dw6K6, 12));
            }
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null && (interfaceC351610DqROg = c0e48F42.og()) != null && (mutableLiveDataLJJLJ = interfaceC351610DqROg.LJJLJ()) != null) {
                mutableLiveDataLJJLJ.observe(this, new AObserverS170S0200000_5(this, interfaceC355120Dw6K6, 13));
            }
            InterfaceC357900E1k interfaceC357900E1kH4 = H4();
            if (interfaceC357900E1kH4 != null && (liveEventEb1 = interfaceC357900E1kH4.eb1()) != null) {
                liveEventEb1.LIZ(this, new AObjectS240S0100000_5(this, 115));
            }
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null && (liveEventL72 = c0etqP4.L72()) != null) {
            liveEventL72.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 116));
        }
        C0ETQ c0etqP42 = P4();
        if (c0etqP42 == null || (liveEventGs1 = c0etqP42.Gs1()) == null) {
            return;
        }
        liveEventGs1.LIZ(this, new AObjectS240S0100000_5(this, 117));
    }

    private final boolean T6() {
        return !Intrinsics.LJFF(L6(), "sound_effect");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int d6() {
        /*
            r4 = this;
            X.0E48 r0 = r4.F4()
            if (r0 == 0) goto L71
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r0)
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.getMainTrack()
            if (r0 == 0) goto L5f
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.getSlots()
            if (r0 == 0) goto L5f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            boolean r0 = X.C351220Dpo.LLI(r0)
            if (r0 == 0) goto L1f
            r3.add(r1)
            goto L1f
        L36:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r3.iterator()
        L3f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r0.getMainSegment()
            if (r0 == 0) goto L3f
            float r0 = X.C351220Dpo.LJLLLL(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            if (r0 == 0) goto L3f
            r2.add(r0)
            goto L3f
        L5f:
            r1 = 0
            goto L6b
        L61:
            java.lang.Float r0 = X.C13LP.LJJLIIJ(r2)
            if (r0 == 0) goto L5f
            float r1 = r0.floatValue()
        L6b:
            r0 = 100
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            return r0
        L71:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E2P.d6():int");
    }

    private final void k7() {
        if (System.currentTimeMillis() - this.LLL < 500) {
            return;
        }
        Activity activity = this.LLJJJJLIIL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131833434);
        C1390380mHk.LIZ(activity, 3026, creativeToastBuilder);
        this.LLL = System.currentTimeMillis();
    }

    public final void E5() {
        if (W6(L6())) {
            C0E2R c0e2rT4 = T4();
            if (c0e2rT4 != null) {
                c0e2rT4.TC(false);
            }
            C0E2R c0e2rT42 = T4();
            if (c0e2rT42 != null) {
                c0e2rT42.cD(0.4f);
                return;
            }
            return;
        }
        C0E2R c0e2rT43 = T4();
        if (c0e2rT43 != null) {
            c0e2rT43.TC(true);
        }
        C0E2R c0e2rT44 = T4();
        if (c0e2rT44 != null) {
            c0e2rT44.cD(1.0f);
        }
    }

    public final void H5() {
        C0E48 c0e48F4;
        NLEEditor nLEEditorLJI;
        if (!C0E2B.LIZ() || (c0e48F4 = F4()) == null || (nLEEditorLJI = c0e48F4.LLFII().LJI()) == null) {
            return;
        }
        C350410DoV.LIZLLL(nLEEditorLJI, true, O4(), true, true);
    }

    public final String L6() {
        C0E2O c0e2oJ6 = J6();
        if (c0e2oJ6 != null) {
            return c0e2oJ6.LLIZLLLIL;
        }
        return null;
    }

    public final void N5() {
        int iLIZ;
        if (Intrinsics.LJFF(L6(), "music") && (iLIZ = C273400Ana.LIZ(d6())) > 0) {
            InterfaceC355120Dw6 interfaceC355120Dw6K6 = K6();
            int currentVolumeIntensity = (int) ((interfaceC355120Dw6K6 != null ? interfaceC355120Dw6K6.getCurrentVolumeIntensity() : 0.0f) * 100);
            if (1 > currentVolumeIntensity || currentVolumeIntensity >= iLIZ) {
                iLIZ = currentVolumeIntensity;
            }
            if (iLIZ != currentVolumeIntensity) {
                InterfaceC355120Dw6 interfaceC355120Dw6K62 = K6();
                if (interfaceC355120Dw6K62 != null) {
                    interfaceC355120Dw6K62.changeVolume(iLIZ / 100.0f, EnumC356070Dxd.COMMIT);
                }
                i3(new AwS20S0001000_5(iLIZ, 20));
            }
        }
    }

    @Override // X.C0ETX
    public String O4() {
        C0E1X c0e1x;
        InterfaceC355120Dw6 interfaceC355120Dw6K6 = K6();
        float currentVolumeIntensity = interfaceC355120Dw6K6 != null ? interfaceC355120Dw6K6.getCurrentVolumeIntensity() : 0.0f;
        if (this.LLJZ) {
            c0e1x = new C0E1X(C0E1V.APPLY_TO_ALL.getNameId(), null, null, null, null, 30);
        } else {
            float f = 100;
            c0e1x = new C0E1X(C0E1V.CHANGE_VOLUME.getNameId(), String.valueOf(this.LLJZIJLIL * f), String.valueOf(currentVolumeIntensity * f), null, null, 24);
        }
        return C2292508yZ.LIZJ(c0e1x);
    }

    @Override // X.C0ETX
    public boolean d5() {
        NLETrack nLETrackPt;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot slotByIndex;
        NLESegment mainSegment;
        VecNLETrackSlotSPtr slots2;
        VecNLETrackSlotSPtr slots3;
        NLESegmentAudio nLESegmentAudio;
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
            player.pause(true);
        }
        String strL6 = L6();
        if (strL6 != null) {
            int iHashCode = strL6.hashCode();
            if (iHashCode != -1477447462) {
                if (iHashCode != 112202875) {
                    if (iHashCode == 1182494401 && strL6.equals("sound_effect")) {
                        float currentVolumeIntensity = K6().getCurrentVolumeIntensity();
                        C0EBB c0ebbM6 = m6();
                        if (c0ebbM6 != null) {
                            c0ebbM6.LIZLLL(currentVolumeIntensity);
                        }
                        this.LLJZ = true;
                        this.LLLF = true;
                        H5();
                        return true;
                    }
                } else if (strL6.equals("video")) {
                    C0E48 c0e48F42 = F4();
                    if (c0e48F42 != null && (nLETrackPt = c0e48F42.Pt()) != null) {
                        C0E48 c0e48F43 = F4();
                        if (c0e48F43 != null && (nLETrackSlotLLLLLLIL = c0e48F43.LLLLLLIL()) != null && C351220Dpo.LLI(nLETrackSlotLLLLLLIL)) {
                            float currentVolumeIntensity2 = K6().getCurrentVolumeIntensity();
                            if (!Boolean.parseBoolean(nLETrackPt.getExtra("is_maintrack_mute")) && currentVolumeIntensity2 == 0.0f) {
                                nLETrackPt.setExtra("is_maintrack_mute", "true");
                            }
                            C0E48 c0e48F44 = F4();
                            if (c0e48F44 != null) {
                                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48F44);
                                C351510DqH.LIZ.getClass();
                                NLETrack mainTrack2 = nLEModelLJI.getMainTrack();
                                if (mainTrack2 != null && (slots3 = mainTrack2.getSlots()) != null) {
                                    for (NLETrackSlot nLETrackSlot : slots3) {
                                        if (C351220Dpo.LLI(nLETrackSlot) && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment())) != null) {
                                            nLESegmentAudio.setVolume(currentVolumeIntensity2);
                                        }
                                    }
                                }
                                NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModelLJI);
                                if (nLETrackLIZ != null && (slots2 = nLETrackLIZ.getSlots()) != null) {
                                    int i = 0;
                                    for (NLETrackSlot nLETrackSlot2 : slots2) {
                                        int i2 = i + 1;
                                        if (i < 0) {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                        NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment());
                                        if (nLESegmentAudio2 != null) {
                                            nLESegmentAudio2.setVolume(currentVolumeIntensity2);
                                        }
                                        i = i2;
                                    }
                                }
                                C347000Dj0 c347000Dj0 = C350110Do1.LIZJ;
                                C346780Die.LIZ(nLEModelLJI);
                                c347000Dj0.getClass();
                                NLETrack nLETrackLIZ2 = C346960Diw.LIZ(nLEModelLJI);
                                if (nLETrackLIZ2 != null && (mainTrack = nLEModelLJI.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
                                    for (NLETrackSlot nLETrackSlot3 : slots) {
                                        NLETrackSlot nLETrackSlotLIZ = C347000Dj0.LIZ(nLETrackLIZ2, nLETrackSlot3);
                                        if (nLETrackSlotLIZ != null) {
                                            int iLIZJ = C350110Do1.LIZJ(nLEModelLJI, nLETrackSlot3);
                                            NLETrack nLETrackLIZ3 = C346780Die.LIZ(nLEModelLJI);
                                            if (nLETrackLIZ3 != null && (slotByIndex = nLETrackLIZ3.getSlotByIndex(iLIZJ)) != null && (mainSegment = slotByIndex.getMainSegment()) != null) {
                                                C351220Dpo.LLLLLL(mainSegment, 0.0f);
                                            }
                                            C351220Dpo.LLLLLL(nLETrackSlotLIZ.getMainSegment(), currentVolumeIntensity2);
                                        }
                                    }
                                }
                            }
                            C0E48 c0e48F45 = F4();
                            if (c0e48F45 != null) {
                                C350870DpF.LIZ(c0e48F45, false);
                                VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
                                if (videoPublishEditModelLJJJLIIL != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append((int) (currentVolumeIntensity2 * 100));
                                    sbLIZ.append('%');
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F45, new Pair(-1, -1));
                                    c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e48F45));
                                    c0labLJFF.LJ("volume", strLIZIZ);
                                    C20684815ws.LJIILLIIL("click_volume_apply_to_all", c0labLJFF.LIZ);
                                }
                            }
                            this.LLJZ = true;
                            this.LLLF = true;
                            H5();
                            return true;
                        }
                        k7();
                    }
                    return false;
                }
            } else if (strL6.equals("audio_record")) {
                float currentVolumeIntensity3 = K6().getCurrentVolumeIntensity();
                C354040DuM c354040DuMR5 = R5();
                if (c354040DuMR5 != null) {
                    C0E48 c0e48 = c354040DuMR5.LIZ;
                    if (c0e48 != null) {
                        List listLIZ = C348850Dlz.LIZ(C350870DpF.LJI(c0e48));
                        ArrayList<NLETrackSlot> arrayList = new ArrayList();
                        Iterator it2 = ((ArrayList) listLIZ).iterator();
                        while (it2.hasNext()) {
                            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList);
                        }
                        for (NLETrackSlot nLETrackSlot4 : arrayList) {
                            if (nLETrackSlot4.hasExtra("volume_enhance_rate")) {
                                nLETrackSlot4.setExtra("volume_before_enhance", String.valueOf(currentVolumeIntensity3));
                                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot4.getExtra("volume_enhance_rate"));
                                float fFloatValue = (fLJIIIIZZ != null ? fLJIIIIZZ.floatValue() : 1.0f) * currentVolumeIntensity3;
                                NLESegmentAudio nLESegmentAudio3 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot4.getMainSegment());
                                if (nLESegmentAudio3 != null) {
                                    nLESegmentAudio3.setVolume(fFloatValue);
                                }
                            } else {
                                NLESegmentAudio nLESegmentAudio4 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot4.getMainSegment());
                                if (nLESegmentAudio4 != null) {
                                    nLESegmentAudio4.setVolume(currentVolumeIntensity3);
                                }
                            }
                        }
                    }
                    C0E48 c0e482 = c354040DuMR5.LIZ;
                    if (c0e482 != null) {
                        C350870DpF.LIZ(c0e482, false);
                    }
                }
                this.LLJZ = true;
                this.LLLF = true;
                H5();
            }
        }
        return true;
    }

    @Override // X.C0ETX
    public void k5() {
        C0E2R c0e2rT4 = T4();
        if (c0e2rT4 != null) {
            c0e2rT4.Ra2(T6());
        }
    }

    public final void n7() {
        if (Intrinsics.LJFF(L6(), "music")) {
            i3(new AwS20S0001000_5(C273400Ana.LIZ(d6()), 22));
        }
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        Float fValueOf;
        super.onCreate();
        C0E5S c0e5sU6 = u6();
        if (c0e5sU6 != null) {
            c0e5sU6.yV(AFwS234S0000000_5.get$arr$(332));
        }
        C0E2R c0e2rT4 = T4();
        if (c0e2rT4 != null) {
            c0e2rT4.ob1(true);
        }
        InterfaceC355120Dw6 interfaceC355120Dw6K6 = K6();
        if (interfaceC355120Dw6K6 != null && (fValueOf = Float.valueOf(interfaceC355120Dw6K6.getCurrentVolumeIntensity())) != null) {
            float fFloatValue = fValueOf.floatValue();
            this.LLJZIJLIL = fFloatValue;
            i3(new AwS20S0001000_5((int) (fFloatValue * 100), 21));
        }
        MutableLiveData<C350390DoT> volumeUpdate = K6().getVolumeUpdate();
        if (volumeUpdate != null) {
            volumeUpdate.setValue(new C350390DoT());
        }
        P6();
        N6();
        E5();
        n7();
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJL;
    }

    private final List<NLETrackSlot> U5(NLEModel nLEModel) {
        List<NLETrack> listLJFF = C349930Dnj.LJFF(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) listLJFF).iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    private final boolean W6(String str) {
        C0E48 c0e48F4;
        boolean zIsEmpty;
        ?? arrayList;
        VecNLETrackSlotSPtr slots;
        if (str == null || a0.LJJJIL(str) || (c0e48F4 = F4()) == null) {
            return false;
        }
        NLETrack nLETrackPt = c0e48F4.Pt();
        if (nLETrackPt != null && nLETrackPt.getMainTrack()) {
            NLETrack nLETrackPt2 = c0e48F4.Pt();
            if (nLETrackPt2 != null && (slots = nLETrackPt2.getSlots()) != null) {
                arrayList = new ArrayList();
                for (NLETrackSlot nLETrackSlot : slots) {
                    NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                    if ((!nLETrackSlot2.getKeyframes().isEmpty()) && C351220Dpo.LLI(nLETrackSlot2)) {
                        arrayList.add(nLETrackSlot);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            zIsEmpty = arrayList.isEmpty();
        } else if (Intrinsics.LJFF(str, "audio_record")) {
            List listLIZ = C348850Dlz.LIZ(C350870DpF.LJI(c0e48F4));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ((ArrayList) listLIZ).iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!((NLETrackSlot) obj).getKeyframes().isEmpty()) {
                    arrayList3.add(obj);
                }
            }
            zIsEmpty = arrayList3.isEmpty();
        } else {
            if (!Intrinsics.LJFF(str, "sound_effect")) {
                return false;
            }
            List listLIZJ = C348850Dlz.LIZJ(C350870DpF.LJI(c0e48F4));
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = ((ArrayList) listLIZJ).iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList4);
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (!((NLETrackSlot) obj2).getKeyframes().isEmpty()) {
                    arrayList5.add(obj2);
                }
            }
            zIsEmpty = arrayList5.isEmpty();
        }
        return !zIsEmpty;
    }

    public final void M5(int i) {
        int iLIZ;
        float fLJLLLL;
        NLESegment mainSegment;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            List<NLETrackSlot> listU5 = U5(C350870DpF.LJI(c0e48F4));
            if (listU5.isEmpty() || (iLIZ = C273400Ana.LIZ(i)) <= 0) {
                return;
            }
            float f = iLIZ / 100.0f;
            for (NLETrackSlot nLETrackSlot : listU5) {
                NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
                if (mainSegment2 != null) {
                    fLJLLLL = C351220Dpo.LJLLLL(mainSegment2);
                } else {
                    fLJLLLL = 0.0f;
                }
                int i2 = (int) (fLJLLLL * 100);
                if (1 <= i2 && i2 < iLIZ && (mainSegment = nLETrackSlot.getMainSegment()) != null) {
                    C351220Dpo.LLLLLL(mainSegment, f);
                }
            }
        }
    }

    public final void S6(float f) {
        C0E48 c0e48F4;
        C0E48 c0e48F42;
        C0E55 player;
        InterfaceC351610DqR interfaceC351610DqROg;
        NLETrackType nLETrackTypeLJIIIIZZ;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrack nLETrackPt;
        InterfaceC351610DqR interfaceC351610DqROg2;
        InterfaceC355120Dw6 interfaceC355120Dw6K6 = K6();
        if (interfaceC355120Dw6K6 != null) {
            interfaceC355120Dw6K6.changeVolume(f, EnumC356070Dxd.COMMIT);
        }
        H5();
        C0E48 c0e48F43 = F4();
        if ((c0e48F43 == null || (interfaceC351610DqROg2 = c0e48F43.og()) == null || !interfaceC351610DqROg2.X5()) && (((c0e48F4 = F4()) == null || (interfaceC351610DqROg = c0e48F4.og()) == null || !interfaceC351610DqROg.yv(NLEKeyframeType.Volume)) && (c0e48F42 = F4()) != null && (player = c0e48F42.getPlayer()) != null)) {
            player.LJIJJ();
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null) {
            C0E48 c0e48F44 = F4();
            String extra = null;
            if (c0e48F44 != null && (nLETrackPt = c0e48F44.Pt()) != null) {
                nLETrackTypeLJIIIIZZ = C350870DpF.LJIIIIZZ(nLETrackPt);
            } else {
                nLETrackTypeLJIIIIZZ = null;
            }
            String str = "";
            if (nLETrackTypeLJIIIIZZ == NLETrackType.AUDIO) {
                C0E48 c0e48F45 = F4();
                if (c0e48F45 != null && (nLETrackSlotLLLLLLIL = c0e48F45.LLLLLLIL()) != null) {
                    extra = nLETrackSlotLLLLLLIL.getExtra("ep_audio_music_id");
                }
                C0E48 c0e48F46 = F4();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((int) (f * 100));
                sbLIZ.append('%');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (c0e48F46 != null) {
                    C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F46, new Pair(-1, -1));
                    c0labLJFF.LJ("volume", strLIZIZ);
                    if (extra != null) {
                        str = extra;
                    }
                    c0labLJFF.LJ("sound_effect_id", str);
                    c0labLJFF.LIZ(C361680EFy.LJJII(c0e48F46) ? 1 : 0, "is_editorpro_keyframe");
                    c0labLJFF.LJ("sound_type", "sound_effect");
                    C20684815ws.LJIILLIIL("click_sound_volume_change", c0labLJFF.LIZ);
                    return;
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((int) (f * 100));
            sbLIZ2.append('%');
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C0E48 c0e48F47 = F4();
            if (c0e48F47 == null) {
                return;
            }
            C0LAB c0labLJFF2 = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F47, new Pair(-1, -1));
            c0labLJFF2.LJ("track_type", C361680EFy.LJIL(c0e48F47));
            c0labLJFF2.LJ("volume", strLIZIZ2);
            c0labLJFF2.LJ("music_id", "");
            c0labLJFF2.LIZ(C361680EFy.LJJII(c0e48F47) ? 1 : 0, "is_editorpro_keyframe");
            C20684815ws.LJIILLIIL("click_cut_volume_change", c0labLJFF2.LIZ);
        }
    }

    public final int d7(int i) {
        if (Intrinsics.LJFF(L6(), "music")) {
            return C273400Ana.LIZIZ(i, d6());
        }
        return i;
    }

    @Override // X.C0ETX
    public void t5(boolean z) {
        NLEResType type;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48F4;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        NLETrackSlot nLETrackSlotLLLLLLIL3;
        NLESegment mainSegment;
        NLETrackSlot nLETrackSlotLLLLLLIL4;
        long j;
        C0E48 c0e48F42;
        NLETrackSlot nLETrackSlotLLLLLLIL5;
        NLETrackSlot nLETrackSlotLLLLLLIL6;
        NLESegment mainSegment2;
        NLETrackType nLETrackTypeLJIIIIZZ;
        String str;
        String extra;
        NLETrackSlot nLETrackSlotLLLLLLIL7;
        NLETrack nLETrackPt;
        float currentVolumeIntensity = K6().getCurrentVolumeIntensity();
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        NLEResType type2 = null;
        if (videoPublishEditModelLJJJLIIL != null) {
            C0E48 c0e48F43 = F4();
            if (c0e48F43 != null && (nLETrackPt = c0e48F43.Pt()) != null) {
                nLETrackTypeLJIIIIZZ = C350870DpF.LJIIIIZZ(nLETrackPt);
            } else {
                nLETrackTypeLJIIIIZZ = null;
            }
            if (nLETrackTypeLJIIIIZZ == NLETrackType.AUDIO) {
                C0E48 c0e48F44 = F4();
                if (c0e48F44 != null && (nLETrackSlotLLLLLLIL7 = c0e48F44.LLLLLLIL()) != null) {
                    extra = nLETrackSlotLLLLLLIL7.getExtra("ep_audio_music_id");
                } else {
                    extra = null;
                }
                C0E48 c0e48F45 = F4();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((int) (100 * currentVolumeIntensity));
                sbLIZ.append('%');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (c0e48F45 != null) {
                    C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F45, new Pair(-1, -1));
                    c0labLJFF.LJ("volume", strLIZIZ);
                    if (extra == null) {
                        extra = "";
                    }
                    c0labLJFF.LJ("sound_effect_id", extra);
                    c0labLJFF.LIZ(C361680EFy.LJJII(c0e48F45) ? 1 : 0, "is_editorpro_keyframe");
                    c0labLJFF.LJ("sound_type", "sound_effect");
                    c0labLJFF.LJ("sound_type", "sound_effect");
                    C20684815ws.LJIILLIIL("save_sound_volume", c0labLJFF.LIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((int) (100 * currentVolumeIntensity));
                sbLIZ2.append('%');
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                boolean z2 = this.LLLF;
                C0E48 c0e48F46 = F4();
                if (c0e48F46 != null) {
                    C0LAB c0labLJFF2 = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F46, new Pair(-1, -1));
                    c0labLJFF2.LJ("track_type", C361680EFy.LJIL(c0e48F46));
                    c0labLJFF2.LJ("volume", strLIZIZ2);
                    if (z2) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c0labLJFF2.LJ("apply_status", str);
                    c0labLJFF2.LIZ(C361680EFy.LJJII(c0e48F46) ? 1 : 0, "is_editorpro_keyframe");
                    C20684815ws.LJIILLIIL("save_cut_volume", c0labLJFF2.LIZ);
                }
            }
        }
        C0E48 c0e48F47 = F4();
        if (c0e48F47 != null && (nLETrackSlotLLLLLLIL6 = c0e48F47.LLLLLLIL()) != null && (mainSegment2 = nLETrackSlotLLLLLLIL6.getMainSegment()) != null) {
            type = mainSegment2.getType();
        } else {
            type = null;
        }
        long j2 = 0;
        if (type == NLEResType.AUDIO) {
            if (currentVolumeIntensity != this.LLJZIJLIL && (c0e48F42 = F4()) != null && (nLETrackSlotLLLLLLIL5 = c0e48F42.LLLLLLIL()) != null) {
                nLETrackSlotLLLLLLIL5.setExtra("is_editorpro_adjust_music_volume", "1");
            }
            C0E48 c0e48F48 = F4();
            if (c0e48F48 != null && (nLETrackSlotLLLLLLIL4 = c0e48F48.LLLLLLIL()) != null) {
                long jLJIJJ = C361680EFy.LJIJJ(nLETrackSlotLLLLLLIL4, "adjust_music_volume_duration");
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0E2O c0e2oJ6 = J6();
                if (c0e2oJ6 != null) {
                    j = c0e2oJ6.LLIZ;
                } else {
                    j = 0;
                }
                C361680EFy.LJLILLLLZI(nLETrackSlotLLLLLLIL4, "adjust_music_volume_duration", String.valueOf(jLJIJJ + (jCurrentTimeMillis - j)));
            }
        }
        C0E48 c0e48F49 = F4();
        if (c0e48F49 != null && (nLETrackSlotLLLLLLIL3 = c0e48F49.LLLLLLIL()) != null && (mainSegment = nLETrackSlotLLLLLLIL3.getMainSegment()) != null) {
            type2 = mainSegment.getType();
        }
        if (type2 == NLEResType.VIDEO) {
            if (currentVolumeIntensity != this.LLJZIJLIL && (c0e48F4 = F4()) != null && (nLETrackSlotLLLLLLIL2 = c0e48F4.LLLLLLIL()) != null) {
                nLETrackSlotLLLLLLIL2.setExtra("is_editorpro_adjust_video_volume", "1");
            }
            C0E48 c0e48F410 = F4();
            if (c0e48F410 != null && (nLETrackSlotLLLLLLIL = c0e48F410.LLLLLLIL()) != null) {
                long jLJIJJ2 = C361680EFy.LJIJJ(nLETrackSlotLLLLLLIL, "adjust_video_volume_duration");
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C0E2O c0e2oJ62 = J6();
                if (c0e2oJ62 != null) {
                    j2 = c0e2oJ62.LLIZ;
                }
                C361680EFy.LJLILLLLZI(nLETrackSlotLLLLLLIL, "adjust_video_volume_duration", String.valueOf(jLJIJJ2 + (jCurrentTimeMillis2 - j2)));
            }
        }
        super.t5(z);
    }

    public C0E2P(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = c19a3;
        this.LLJJJJLIIL = activity;
        this.LLJJL = c1drg;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 750));
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC355120Dw6.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLJLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(213));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 747));
        this.LLJLLL = true;
    }
}
