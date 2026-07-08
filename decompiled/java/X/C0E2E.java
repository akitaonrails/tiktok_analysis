package X;

import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.MapStrSwingKeyFramesPtr;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.core.api.params.MaskParam;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E2E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E2E implements InterfaceC379610EuV, InterfaceC373530Ekh {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C19EG LL;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 797));
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E2E.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E2E.class, "keyFrameAPI", "getKeyFrameAPI()Lcom/ss/ugc/android/editor/core/api/IKeyFrameApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0E2E.class, "fullScreenApi", "getFullScreenApi()Lcom/ss/android/ugc/gamora/editorpro/framework/fullscreen/EditorProFullScreenApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0E2E.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0E2E.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.InterfaceC373530Ekh
    public final int getPriority() {
        return 0;
    }

    public static final VideoPublishEditModel LIZIZ() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final C0E48 LIZJ() {
        return (C0E48) this.LLILZ.getValue();
    }

    public final C0ENB LIZLLL() {
        return (C0ENB) this.LLILZLL.getValue(this, LLJI[1]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC373530Ekh
    public final boolean LIZ(C0E2F c0e2f) {
        NLETrackType trackType;
        boolean z;
        NLETrack nLETrackPt;
        String str;
        C0E2C c0e2cLIZIZ;
        C0E2C c0e2cLIZIZ2;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        Float fLJIIIIZZ;
        C0E2C c0e2cLIZIZ3;
        int size;
        int size2;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        MaskParam maskParamLJJJJ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        MaskParam maskParamLJJLIIIJJI;
        C0E48 c0e48LIZJ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII3;
        MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtrSwingKeyframesOfType;
        Collection<NLEKeyframe> collectionValues;
        MapStrSwingKeyFramesPtr mapStrSwingKeyFramesPtrSwingKeyframesOfType2;
        Collection<NLEKeyframe> collectionValues2;
        LiveData<C0E6I> liveDataLLLIIIL;
        boolean z2;
        NLECommit head;
        String description;
        C0E1X c0e1x;
        C0E1X c0e1x2;
        NLECommit head2;
        C0E48 c0e48LIZJ2 = LIZJ();
        boolean z3 = false;
        if (c0e48LIZJ2 == null) {
            return false;
        }
        if (Intrinsics.LJFF(c0e2f, C0E2M.LIZ)) {
            VideoPublishEditModel videoPublishEditModelLIZIZ = LIZIZ();
            if (videoPublishEditModelLIZIZ != null) {
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLIZIZ, c0e48LIZJ2, new Pair(-1, -1));
                c0labLJFF.LIZIZ(c0e48LIZJ2.getPlayer().qq(), "duration");
                C20684815ws.LJIILLIIL("editor_pro_long_video_toast", c0labLJFF.LIZ);
            }
            return true;
        }
        C0E6I value = null;
        description = null;
        String description2 = null;
        value = null;
        if (Intrinsics.LJFF(c0e2f, C0E2L.LIZ)) {
            NLEBranch branch = c0e48LIZJ2.LLFII().LJI().getBranch();
            if (branch != null && (head2 = branch.getHead()) != null) {
                description2 = head2.getDescription();
            }
            c0e48LIZJ2.Bo().LIZIZ(true);
            VideoPublishEditModel videoPublishEditModelLIZIZ2 = LIZIZ();
            if (videoPublishEditModelLIZIZ2 != null) {
                if (description2 != null && description2.length() != 0 && (c0e1x2 = (C0E1X) C051R.LIZ(description2, C0E1X.class)) != null && (Intrinsics.LJFF(c0e1x2.LIZ, C0E1V.CHANGE_CURVE_SPEED.getNameId()) || Intrinsics.LJFF(c0e1x2.LIZ, C0E1V.CHANGE_CURVE_SPEED_EDIT.getNameId()))) {
                    z3 = true;
                }
                C361680EFy.LJJJIL(videoPublishEditModelLIZIZ2, c0e48LIZJ2, true, z3);
            }
            return true;
        }
        if (Intrinsics.LJFF(c0e2f, C0E2N.LIZ)) {
            c0e48LIZJ2.Bo().LJI();
            VideoPublishEditModel videoPublishEditModelLIZIZ3 = LIZIZ();
            if (videoPublishEditModelLIZIZ3 != null) {
                NLEBranch branch2 = c0e48LIZJ2.LLFII().LJI().getBranch();
                if (branch2 != null && (head = branch2.getHead()) != null && (description = head.getDescription()) != null && description.length() != 0 && (c0e1x = (C0E1X) C051R.LIZ(description, C0E1X.class)) != null && (Intrinsics.LJFF(c0e1x.LIZ, C0E1V.CHANGE_CURVE_SPEED.getNameId()) || Intrinsics.LJFF(c0e1x.LIZ, C0E1V.CHANGE_CURVE_SPEED_EDIT.getNameId()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C361680EFy.LJJJIL(videoPublishEditModelLIZIZ3, c0e48LIZJ2, false, z2);
            }
            return true;
        }
        if (Intrinsics.LJFF(c0e2f, C0E2J.LIZ)) {
            C0E5S c0e5s = (C0E5S) this.LLILZIL.getValue(this, LLJI[0]);
            if (c0e5s != null && (liveDataLLLIIIL = c0e5s.LLLIIIL()) != null) {
                value = liveDataLLLIIIL.getValue();
            }
            if (value != C0E6I.IDLE) {
                return true;
            }
            c0e48LIZJ2.S7().LIZIZ(Boolean.TRUE, "is_playing_in_full_screen", false);
            c0e48LIZJ2.getPlayer().LLIL(false);
            VideoPublishEditModel videoPublishEditModelLIZIZ4 = LIZIZ();
            if (videoPublishEditModelLIZIZ4 != null) {
                C361680EFy.LJJIJIL(videoPublishEditModelLIZIZ4, c0e48LIZJ2, true);
            }
            return true;
        }
        if (Intrinsics.LJFF(c0e2f, C0E2I.LIZ)) {
            c0e48LIZJ2.S7().LIZIZ(Boolean.FALSE, "is_playing_in_full_screen", false);
            c0e48LIZJ2.getPlayer().pause(false);
            c0e48LIZJ2.getPlayer().LJJIIZ(null);
            C0E2C c0e2c = (C0E2C) c0e48LIZJ2.S7().LIZJ("panel_bounce_event", null);
            if (c0e2c != null && c0e2c.LIZ && Intrinsics.LJFF(c0e2c.LIZJ, "video_transition")) {
                c0e48LIZJ2.getPlayer().LJIJJLI();
            }
            VideoPublishEditModel videoPublishEditModelLIZIZ5 = LIZIZ();
            if (videoPublishEditModelLIZIZ5 != null) {
                C361680EFy.LJJIJIL(videoPublishEditModelLIZIZ5, c0e48LIZJ2, false);
            }
            return true;
        }
        if (Intrinsics.LJFF(c0e2f, C0E2H.LIZ)) {
            InterfaceC362600EJm interfaceC362600EJm = (InterfaceC362600EJm) this.LLIZ.getValue(this, LLJI[2]);
            if (interfaceC362600EJm != null) {
                interfaceC362600EJm.uy2(true);
            }
            VideoPublishEditModel videoPublishEditModelLIZIZ6 = LIZIZ();
            if (videoPublishEditModelLIZIZ6 != null) {
                C20684815ws.LJIILLIIL("click_screen_preview", C361680EFy.LJFF(-1L, videoPublishEditModelLIZIZ6, c0e48LIZJ2, new Pair(-1, -1)).LIZ);
            }
            return true;
        }
        if (!Intrinsics.LJFF(c0e2f, C0E2G.LIZ) && !Intrinsics.LJFF(c0e2f, C0E2K.LIZ)) {
            throw new C1954807lC();
        }
        NLETrackSlot nLETrackSlotLLLLLLIL3 = c0e48LIZJ2.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL3 != null && C352250DrT.LJIILIIL(nLETrackSlotLLLLLLIL3)) {
            new C377260Eqi(c0e48LIZJ2).LIZ();
            C19EG c19eg = this.LL;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131850034);
            creativeToastBuilder.isTuxToast(true);
            C1390380mHk.LIZ(c19eg, 5012, creativeToastBuilder);
            return true;
        }
        c0e48LIZJ2.getPlayer().pause(false);
        NLETrackSlot nLETrackSlotAh = c0e48LIZJ2.og().Ah(C351220Dpo.LLLLLLJ(c0e48LIZJ2.getPlayer().Jh()));
        List<NLEKeyframe> listLLJI = c0e48LIZJ2.og().LLJI(C351220Dpo.LLLLLLJ(c0e48LIZJ2.getPlayer().Jh()));
        NLETrackType nLETrackType = NLETrackType.AUDIO;
        NLETrack nLETrackPt2 = c0e48LIZJ2.Pt();
        if (nLETrackPt2 != null) {
            trackType = nLETrackPt2.getTrackType();
        } else {
            trackType = null;
        }
        if (nLETrackType == trackType) {
            z = true;
        } else {
            z = false;
        }
        NLETrack nLETrackPt3 = c0e48LIZJ2.Pt();
        if (nLETrackPt3 != null) {
            nLETrackPt3.getTrackType();
        }
        NLETrackSlot nLETrackSlotLLLLLLIL4 = c0e48LIZJ2.LLLLLLIL();
        long jLLLLLLJ = C351220Dpo.LLLLLLJ(c0e48LIZJ2.getPlayer().Jh());
        if (LIZLLL().xZ1() && listLLJI != null && !listLLJI.isEmpty()) {
            if (nLETrackSlotLLLLLLIL4 != null && (mapStrSwingKeyFramesPtrSwingKeyframesOfType2 = nLETrackSlotLLLLLLIL4.swingKeyframesOfType(NLEKeyframeType.Mask)) != null && (collectionValues2 = mapStrSwingKeyFramesPtrSwingKeyframesOfType2.values()) != null) {
                size = collectionValues2.size();
            } else {
                size = 0;
            }
            LIZLLL().yB0(C351220Dpo.LLLLLLJ(c0e48LIZJ2.getPlayer().Jh()));
            if (nLETrackSlotLLLLLLIL4 != null && (mapStrSwingKeyFramesPtrSwingKeyframesOfType = nLETrackSlotLLLLLLIL4.swingKeyframesOfType(NLEKeyframeType.Mask)) != null && (collectionValues = mapStrSwingKeyFramesPtrSwingKeyframesOfType.values()) != null) {
                size2 = collectionValues.size();
            } else {
                size2 = 0;
            }
            if (size > 1 && size2 <= 1) {
                NLETrackSlot nLETrackSlotLLLLLLIL5 = c0e48LIZJ2.LLLLLLIL();
                C0E48 c0e48LIZJ3 = LIZJ();
                if (c0e48LIZJ3 != null && (interfaceC351350Dq1LLFII = c0e48LIZJ3.LLFII()) != null && (maskParamLJJJJ = interfaceC351350Dq1LLFII.LJJJJ(nLETrackSlotLLLLLLIL5)) != null) {
                    for (String str2 : C1697810uHb.LJIIJJI("line", "mirror", "circle", "text", "rectangle")) {
                        C0E48 c0e48LIZJ4 = LIZJ();
                        if (c0e48LIZJ4 != null && (interfaceC351350Dq1LLFII2 = c0e48LIZJ4.LLFII()) != null && (maskParamLJJLIIIJJI = interfaceC351350Dq1LLFII2.LJJLIIIJJI(nLETrackSlotLLLLLLIL5, str2)) != null && (c0e48LIZJ = LIZJ()) != null && (interfaceC351350Dq1LLFII3 = c0e48LIZJ.LLFII()) != null) {
                            Float f = maskParamLJJJJ.maskCenterX;
                            if (f == null) {
                                f = maskParamLJJLIIIJJI.maskCenterX;
                            }
                            Float f2 = maskParamLJJJJ.maskCenterY;
                            if (f2 == null) {
                                f2 = maskParamLJJLIIIJJI.maskCenterY;
                            }
                            Float f3 = maskParamLJJJJ.maskRotate;
                            if (f3 == null) {
                                f3 = maskParamLJJLIIIJJI.maskRotate;
                            }
                            Float f4 = maskParamLJJJJ.maskFeather;
                            if (f4 == null) {
                                f4 = maskParamLJJLIIIJJI.maskFeather;
                            }
                            interfaceC351350Dq1LLFII3.LJIIL(nLETrackSlotLLLLLLIL5, MaskParam.LIZ(maskParamLJJLIIIJJI, f, f2, f3, null, null, f4, null, null, 15331));
                        }
                    }
                }
            }
            C350870DpF.LIZ(c0e48LIZJ2, false);
            LJ(jLLLLLLJ);
            C350870DpF.LIZJ(c0e48LIZJ2, C051R.LIZIZ(new C0E1X(C0E1V.DELETE_KEY_FRAME.getNameId(), null, null, null, null, 30)));
        } else if (nLETrackSlotAh != null) {
            c0e48LIZJ2.og().LJJIIJ(nLETrackSlotAh);
            C350870DpF.LIZ(c0e48LIZJ2, false);
            LJ(jLLLLLLJ);
            C350870DpF.LIZJ(c0e48LIZJ2, C051R.LIZIZ(new C0E1X(C0E1V.DELETE_KEY_FRAME.getNameId(), null, null, null, null, 30)));
        } else {
            if (LIZLLL().xZ1()) {
                C0E48 c0e48LIZJ5 = LIZJ();
                if (c0e48LIZJ5 != null && (c0e2cLIZIZ3 = C0EB5.LIZIZ(c0e48LIZJ5, (C0EB6) this.LLJ.getValue(this, LLJI[4]))) != null && c0e2cLIZIZ3.LIZ && Intrinsics.LJFF(c0e2cLIZIZ3.LIZJ, "mask_panel")) {
                    c0e48LIZJ2.og().Xb(NLEKeyframeType.Mask, true);
                } else {
                    C0E48 c0e48LIZJ6 = LIZJ();
                    if (c0e48LIZJ6 != null && (c0e2cLIZIZ2 = C0EB5.LIZIZ(c0e48LIZJ6, (C0EB6) this.LLJ.getValue(this, LLJI[4]))) != null && c0e2cLIZIZ2.LIZ && Intrinsics.LJFF(c0e2cLIZIZ2.LIZJ, "volume_panel")) {
                        NLETrack nLETrackPt4 = c0e48LIZJ2.Pt();
                        if (nLETrackPt4 != null && C351220Dpo.LLILL(nLETrackPt4) && !C351220Dpo.LLIIIJ(c0e48LIZJ2.LLLLLLIL()) && !C351220Dpo.LLF(c0e48LIZJ2.LLLLLLIL()) && (nLETrackSlotLLLLLLIL = c0e48LIZJ2.LLLLLLIL()) != null && nLETrackSlotLLLLLLIL.hasExtra("volume_before_enhance") && (nLETrackSlotLLLLLLIL2 = c0e48LIZJ2.LLLLLLIL()) != null && nLETrackSlotLLLLLLIL2.hasExtra("volume_enhance_rate") && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlotLLLLLLIL2.getExtra("volume_enhance_rate"))) != null) {
                            float fFloatValue = fLJIIIIZZ.floatValue();
                            if (fFloatValue != 0.0f) {
                                float fLJJLJLI = C351220Dpo.LJJLJLI(nLETrackSlotLLLLLLIL2) / fFloatValue;
                                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlotLLLLLLIL2.getMainSegment());
                                if (nLESegmentAudioDynamicCast != null) {
                                    nLESegmentAudioDynamicCast.setVolume(fLJJLJLI);
                                }
                                nLETrackSlotLLLLLLIL2.removeExtraWithKey("volume_before_enhance");
                                nLETrackSlotLLLLLLIL2.removeExtraWithKey("volume_enhance_rate");
                            }
                        }
                        c0e48LIZJ2.og().Xb(NLEKeyframeType.Volume, true);
                    } else {
                        C0E48 c0e48LIZJ7 = LIZJ();
                        if (c0e48LIZJ7 != null && (c0e2cLIZIZ = C0EB5.LIZIZ(c0e48LIZJ7, (C0EB6) this.LLJ.getValue(this, LLJI[4]))) != null && c0e2cLIZIZ.LIZ && Intrinsics.LJFF(c0e2cLIZIZ.LIZJ, "adjust_opacity_panel")) {
                            c0e48LIZJ2.og().Xb(NLEKeyframeType.Alpha, true);
                        } else {
                            NLEKeyframeType nLEKeyframeType = NLEKeyframeType.Video;
                            if (z) {
                                nLEKeyframeType = NLEKeyframeType.Volume;
                            }
                            c0e48LIZJ2.og().Xb(nLEKeyframeType, true);
                        }
                    }
                }
            } else {
                c0e48LIZJ2.og().LLIILII(true);
            }
            if (C289200BVe.LIZ(LIZIZ(), null) && (nLETrackPt = c0e48LIZJ2.Pt()) != null) {
                if (C351220Dpo.LLLFF(nLETrackPt)) {
                    str = "music";
                } else if (C351220Dpo.LLILL(nLETrackPt)) {
                    str = "audio_record";
                } else if (C351220Dpo.LLLILZLLLI(nLETrackPt)) {
                    str = "sound_effect";
                }
                C375820EoO.LIZ(this.LLILLJJLI, c0e48LIZJ2, C364930ESl.class, new C0E2O(c0e48LIZJ2, str), 16);
            }
            C350870DpF.LIZJ(c0e48LIZJ2, C051R.LIZIZ(new C0E1X(C0E1V.ADD_KEY_FRAME.getNameId(), null, null, null, null, 30)));
            LJ(jLLLLLLJ);
        }
        c0e48LIZJ2.og().LJJLJ().setValue(new C375830EoP<>(Boolean.TRUE));
        C0E48 c0e48LIZJ8 = LIZJ();
        if (c0e48LIZJ8 != null) {
            boolean zLJIIJ = c0e48LIZJ8.og().LJIIJ(c0e48LIZJ8.LLLLLLIL());
            if (LIZLLL().Ah(C351220Dpo.LLLLLLJ(c0e48LIZJ8.getPlayer().Jh())) != null) {
                z3 = true;
            }
            ((InterfaceC360800ECo) this.LLIZLLLIL.getValue(this, LLJI[3])).zB(zLJIIJ, z3);
        }
        return true;
    }

    public final void LJ(long j) {
        C0E48 c0e48LIZJ = LIZJ();
        if (c0e48LIZJ == null) {
            return;
        }
        long[] jArr = new long[2];
        c0e48LIZJ.Bq(jArr);
        long j2 = jArr[0];
        long j3 = jArr[1];
        if (j2 >= j) {
            c0e48LIZJ.getPlayer().LJIJI(j2 + ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
            return;
        }
        if (j >= j3) {
            if (C351220Dpo.LLLLLLL(j) == c0e48LIZJ.getPlayer().qq() && j - j3 <= 1000) {
                c0e48LIZJ.getPlayer().LJIJI(j, C351110Dpd.LIZ);
                return;
            } else {
                c0e48LIZJ.getPlayer().LJIJI(j3 - ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
                return;
            }
        }
        c0e48LIZJ.getPlayer().LJIJI(j, C351110Dpd.LIZ);
    }

    public C0E2E(C372480Ej0 c372480Ej0, C1DRG c1drg, C19EG c19eg) {
        this.LL = c19eg;
        this.LLILLJJLI = c372480Ej0;
        this.LLILLL = c1drg;
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, C0E5S.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C0ENB.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC362600EJm.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, InterfaceC360800ECo.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, C0EB6.class, null);
    }
}
