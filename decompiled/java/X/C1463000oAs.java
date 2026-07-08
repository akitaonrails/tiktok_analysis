package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.EditAdjustClipsState;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditTrimState;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VEEditor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.0oAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463000oAs implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public float LLILZIL;
    public final C01GW LLILZLL;
    public float LLIZ;
    public boolean LLIZLLLIL;
    public InterfaceC1452170ntP LLJ;
    public C1462980oAq LLJI;
    public Pair<Integer, Integer> LLJIJIL;
    public MultiEditVideoRecordData LLJILJIL;
    public MultiEditVideoRecordData LLJILJILJ;
    public MultiEditVideoRecordData LLJILLL;
    public ArrayList<TimeSpeedModelExtension> LLJJ;
    public ArrayList<TimeSpeedModelExtension> LLJJI;
    public ArrayList<TimeSpeedModelExtension> LLJJIII;
    public final C1664750tQH LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;
    public final C1664750tQH LLJJIJIL;
    public final C1664740tQG LLJJJ;
    public final C1664750tQH LLJJJIL;
    public final C1664750tQH LLJJJJ;
    public final C1664750tQH LLJJJJJIL;
    public final C1664750tQH LLJJJJLIIL;
    public final C1664740tQG LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public Pair<Long, Long> LLJL;
    public Pair<Long, Long> LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1463000oAs.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1463000oAs.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1463000oAs.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1463000oAs.class, "editAdjustModel", "getEditAdjustModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1463000oAs.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1463000oAs.class, "musicSyncController", "getMusicSyncController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditMusicSyncController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1463000oAs.class, "videoImageMixedPresenter", "getVideoImageMixedPresenter()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/videoimagemixed/VideoImageMixedPresenter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1463000oAs.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1463000oAs.class, "cutVideoSpeedViewModel", "getCutVideoSpeedViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoSpeedViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1463000oAs.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1463000oAs.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
    }

    public final C1463500oBg LJ() {
        return (C1463500oBg) this.LLJJIJIIJIL.getValue(this, LLJLLIL[3]);
    }

    public final VideoPublishEditModel LJFF() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue(this, LLJLLIL[2]);
    }

    public final InterfaceC1456910o13 LJI() {
        return (InterfaceC1456910o13) this.LLJJL.getValue(this, LLJLLIL[10]);
    }

    public final List<VideoSegment> LJII() {
        return (List) this.LLILZLL.getValue();
    }

    public final C1463050oAx LJIIIZ() {
        return (C1463050oAx) this.LLJJJ.getValue(this, LLJLLIL[5]);
    }

    public final InterfaceC1463550oBl LJIIJ() {
        return (InterfaceC1463550oBl) this.LLJJJJLIIL.getValue(this, LLJLLIL[9]);
    }

    public final C574160MfW LJIIL() {
        return (C574160MfW) this.LLJJJIL.getValue(this, LLJLLIL[6]);
    }

    public final void LIZJ() {
        String uuid;
        if (C1428520nHG.LJJIJIIJIL(LJFF())) {
            AbstractC1463010oAt.LLLII.getClass();
            C1463170oB9.LIZ("real deleteTimeEffect");
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLJ;
            if (interfaceC1452170ntP != null) {
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
                if (c348100DkmLIZIZ == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                EffectPointModel timeEffect = LJFF().getTimeEffect();
                if (timeEffect == null || (uuid = timeEffect.getUuid()) == null || !C123100dR.LIZ(uuid)) {
                    return;
                }
                c348100DkmLIZIZ.LIZLLL().P5();
            }
        }
    }

    public final MultiEditVideoRecordData LIZLLL() {
        MultiEditVideoRecordData curMultiEditVideoRecordData;
        if (!LJFF().getAILivePhotoModel().LJII()) {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = LJ().LIZLLL;
            if (multiEditVideoStatusRecordData != null) {
                curMultiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            }
            MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
            multiEditVideoRecordData.segmentDataList = C13BV.INSTANCE;
            return multiEditVideoRecordData;
        }
        curMultiEditVideoRecordData = LJFF().getCurMultiEditVideoRecordData();
        if (curMultiEditVideoRecordData != null) {
            return curMultiEditVideoRecordData;
        }
        MultiEditVideoRecordData multiEditVideoRecordData2 = new MultiEditVideoRecordData();
        multiEditVideoRecordData2.segmentDataList = C13BV.INSTANCE;
        return multiEditVideoRecordData2;
    }

    public final long LJIIIIZZ() {
        return Math.min(LJIIJJI(), C536240L1i.LIZ());
    }

    public final long LJIIJJI() {
        List<MultiEditVideoSegmentRecordData> list = LIZLLL().segmentDataList;
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (multiEditVideoSegmentRecordData.enable) {
                arrayList.add(multiEditVideoSegmentRecordData);
            }
        }
        Iterator it2 = arrayList.iterator();
        long endTime = 0;
        while (it2.hasNext()) {
            endTime += (long) ((int) ((r4.getEndTime() - r4.getStartTime()) / ((MultiEditVideoSegmentRecordData) it2.next()).getVideoSpeed()));
        }
        return endTime;
    }

    public final void LJIILIIL() {
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        EditAdjustClipsState editAdjustClipsState;
        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = LJFF().getMultiEditVideoRecordData();
        if (multiEditVideoRecordData2 == null || multiEditVideoRecordData2.curMultiEditVideoRecordData == null || C580130Mp9.LIZ(multiEditVideoRecordData2.curMultiEditVideoRecordData.segmentDataList)) {
            return;
        }
        this.LLJLILLLLZIIL = multiEditVideoRecordData2.isMultiEditRetake;
        ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoRecordData2.originalSegments;
        if (arrayList != null) {
            ArrayList<TimeSpeedModelExtension> arrayList2 = multiEditVideoRecordData2.editSegments;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>(arrayList);
            }
            this.LLJJIII = arrayList2;
            ArrayList<TimeSpeedModelExtension> arrayList3 = multiEditVideoRecordData2.restoreSegments;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList<>(this.LLJJIII);
            }
            this.LLJJ = arrayList3;
            ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoRecordData2.singleRestoreSegments;
            if (arrayList4 == null) {
                arrayList4 = new ArrayList<>(this.LLJJ);
            }
            this.LLJJI = arrayList4;
            if (multiEditVideoRecordData2.segmentSizeChange) {
                this.LLJJI = this.LLJJIII;
            }
        }
        MultiEditVideoRecordData multiEditVideoRecordData3 = multiEditVideoRecordData2.restoreMultiEditVideoRecordData;
        if (multiEditVideoRecordData3 == null) {
            this.LLJILJIL = C383300F1c.LIZIZ(multiEditVideoRecordData2.curMultiEditVideoRecordData, null);
        } else {
            this.LLJILJIL = multiEditVideoRecordData3;
        }
        MultiEditVideoRecordData multiEditVideoRecordData4 = multiEditVideoRecordData2.singleRestoreMultiEditRecordData;
        if (multiEditVideoRecordData4 == null) {
            this.LLJILLL = C383300F1c.LIZIZ(multiEditVideoRecordData2.curMultiEditVideoRecordData, null);
        } else {
            this.LLJILLL = multiEditVideoRecordData4;
        }
        this.LLJILJILJ = C383300F1c.LIZIZ(LIZLLL(), null);
        if (!LJFF().mIsFromDraft || (multiEditVideoRecordData = LJFF().getMultiEditVideoRecordData()) == null || (editAdjustClipsState = multiEditVideoRecordData.adjustClipsState) == null) {
            return;
        }
        Pair<Long, Long> lastEditBoundary = editAdjustClipsState.getLastEditBoundary();
        if (lastEditBoundary != null) {
            Long first = lastEditBoundary.getFirst();
            Long second = lastEditBoundary.getSecond();
            if (first != null && second != null) {
                this.LLJL = new Pair<>(first, second);
            }
        }
        Pair<Long, Long> viewBoundary = editAdjustClipsState.getViewBoundary();
        if (viewBoundary != null) {
            Long first2 = viewBoundary.getFirst();
            Long second2 = viewBoundary.getSecond();
            if (first2 == null || second2 == null) {
                return;
            }
            this.LLJLIL = new Pair<>(first2, second2);
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1463000oAs(C1DRG c1drg) {
        this.LL = c1drg;
        C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLILLJJLI = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1418580n1E.class), InterfaceC1418580n1E.class);
        this.LLILZIL = 1.0f;
        this.LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        this.LLIZ = -1.0f;
        this.LLJJIJI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(c1drg, C1463500oBg.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(c1drg, CutMultiVideoViewModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(c1drg, C1463050oAx.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(c1drg, C574160MfW.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, EditAdjustClipsBottomViewModel.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(c1drg, CutVideoSpeedViewModel.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, InterfaceC1463550oBl.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1456910o13.class, null);
        this.LLJJLIIIJLLLLLLLZ = 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[LOOP:1: B:28:0x005f->B:30:0x0065, LOOP_END] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r9) {
        /*
            r8 = this;
            X.0ntP r0 = r8.LLJ
            if (r0 == 0) goto La1
            com.bytedance.ies.nle.editor_jni.NLEModel r3 = X.C352130DrH.LIZ(r0)
            if (r3 == 0) goto La1
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r3.getMainTrack()
            r4 = 0
            if (r0 == 0) goto L6f
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.getSlots()
            if (r0 == 0) goto L6f
            java.util.Iterator r7 = r0.iterator()
        L1b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r6 = r7.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r6 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r6
            if (r9 == 0) goto L53
            if (r6 == 0) goto L1b
            com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr r0 = r6.getVideoAnims()
            if (r0 == 0) goto L1b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L3a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r0 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r0
            boolean r0 = X.C351220Dpo.LLJJJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3a
            r5.add(r1)
            goto L3a
        L53:
            if (r6 == 0) goto L1b
            com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr r5 = r6.getVideoAnims()
            if (r5 == 0) goto L1b
        L5b:
            java.util.Iterator r1 = r5.iterator()
        L5f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLEVideoAnimation r0 = (com.bytedance.ies.nle.editor_jni.NLEVideoAnimation) r0
            r6.removeVideoAnim(r0)
            goto L5f
        L6f:
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r0 = r3.getTracks()
            java.util.Iterator r2 = r0.iterator()
        L77:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            boolean r0 = X.C351220Dpo.LLLLILI(r0)
            if (r0 == 0) goto L77
            r4 = r1
        L8b:
            com.bytedance.ies.nle.editor_jni.NLETrack r4 = (com.bytedance.ies.nle.editor_jni.NLETrack) r4
            if (r4 == 0) goto La1
            r4.clearSlot()
            X.0DqH r0 = X.C351510DqH.LIZ
            com.bytedance.ies.nle.editor_jni.NLETrackType r1 = com.bytedance.ies.nle.editor_jni.NLETrackType.EFFECT
            r0.getClass()
            java.lang.String r0 = ""
            X.C351510DqH.LJIIJJI(r3, r1, r0)
            X.C351510DqH.LJIIIIZZ(r3)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1463000oAs.LIZIZ(boolean):void");
    }

    public final void LJIILL(boolean z) {
        CanvasVideoData canvasVideoData;
        Collection<? extends VideoSegment> collectionLJFF;
        List<VideoSegment> listLJII = LJII();
        if (C19719512Dh.LJI(listLJII) && listLJII != null) {
            listLJII.clear();
            if (z && !LJFF().getAILivePhotoModel().LJII() && LJFF().getCanvasVideoData() != null && (canvasVideoData = LJFF().getCanvasVideoData()) != null && (!((ArrayList) C574800MgY.LJFF(canvasVideoData)).isEmpty())) {
                CanvasVideoData canvasVideoData2 = LJFF().getCanvasVideoData();
                if (canvasVideoData2 != null) {
                    collectionLJFF = C574800MgY.LJFF(canvasVideoData2);
                } else {
                    collectionLJFF = C13BV.INSTANCE;
                }
                listLJII.addAll(collectionLJFF);
            } else {
                C0F1Z.LIZ.getClass();
                MultiEditVideoRecordData multiEditVideoRecordDataLIZLLL = C0F1Z.LIZIZ;
                if (LJFF().getAILivePhotoModel().LJII() && LJFF().getCurMultiEditVideoRecordData() != null) {
                    multiEditVideoRecordDataLIZLLL = LJFF().getCurMultiEditVideoRecordData();
                } else {
                    List<MultiEditVideoSegmentRecordData> list = LIZLLL().segmentDataList;
                    if ((list != null && !list.isEmpty()) || multiEditVideoRecordDataLIZLLL == null) {
                        multiEditVideoRecordDataLIZLLL = LIZLLL();
                    }
                }
                listLJII.addAll(C574800MgY.LJ(multiEditVideoRecordDataLIZLLL));
            }
        }
        LJIILIIL();
    }

    public final void LJIJ(Pair<Long, Long> pair) {
        float videoSpeed;
        if (this.LLIZLLLIL) {
            return;
        }
        Integer editState = ((EditAdjustClipsBottomViewModel) this.LLJJJJ.getValue(this, LLJLLIL[7])).nR2().getEditState();
        if (editState != null && editState.intValue() == 2) {
            if (!C1462990oAr.LIZ(LJ())) {
                LJIJI(this.LLJLL, (int) pair.getFirst().longValue(), (int) (pair.getSecond().longValue() - pair.getFirst().longValue()));
            }
        } else {
            if (LJ().LIZIZ) {
                videoSpeed = 1.0f;
            } else {
                videoSpeed = ((MultiEditVideoSegmentRecordData) ListProtector.get(LIZLLL().segmentDataList, 0)).getVideoSpeed();
            }
            LJIILLIIL((int) (pair.getFirst().floatValue() / videoSpeed), (int) (pair.getSecond().floatValue() / videoSpeed));
        }
    }

    public final void LJIJJLI(Pair<Long, Long> pair) {
        MultiEditTrimState multiEditTrimStateCopy;
        Pair<Long, Long> pair2 = pair;
        if (pair2 == null) {
            pair2 = this.LLJL;
        }
        if (pair2 != null) {
            if (!this.LLIZLLLIL) {
                long jLJIIJJI = LJIIJJI();
                if (pair2.getFirst().longValue() == 0 && pair2.getSecond().longValue() == jLJIIJJI) {
                    MultiEditVideoStatusRecordData multiEditVideoRecordData = LJFF().getMultiEditVideoRecordData();
                    if (multiEditVideoRecordData != null && multiEditVideoRecordData.editSegments != null) {
                        multiEditVideoRecordData.editCutSegments = new ArrayList<>(multiEditVideoRecordData.editSegments);
                    }
                } else {
                    C574800MgY.LJIIIIZZ(LIZLLL(), pair2.getFirst().longValue(), pair2.getSecond().longValue());
                    MultiEditVideoStatusRecordData multiEditVideoRecordData2 = LJFF().getMultiEditVideoRecordData();
                    if (multiEditVideoRecordData2 != null) {
                        long jLongValue = pair2.getFirst().longValue();
                        long jLongValue2 = pair2.getSecond().longValue();
                        ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoRecordData2.editSegments;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            int duration = 0;
                            for (TimeSpeedModelExtension timeSpeedModelExtension : multiEditVideoRecordData2.editSegments) {
                                arrayList2.add(Integer.valueOf(duration));
                                duration += timeSpeedModelExtension.getDuration();
                                arrayList3.add(Integer.valueOf(duration));
                            }
                            int size = arrayList3.size();
                            int size2 = arrayList3.size();
                            int i = 0;
                            while (true) {
                                if (i < size2) {
                                    if (((Number) ListProtector.get(arrayList3, i)).intValue() >= jLongValue) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                } else {
                                    i = 0;
                                    break;
                                }
                            }
                            int size3 = arrayList2.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i2 = size3 - 1;
                                    if (((Number) ListProtector.get(arrayList2, size3)).intValue() > jLongValue2) {
                                        if (i2 < 0) {
                                            break;
                                        } else {
                                            size3 = i2;
                                        }
                                    } else {
                                        size = size3;
                                        break;
                                    }
                                }
                            }
                            if (size <= multiEditVideoRecordData2.editSegments.size() - 1) {
                                size++;
                            }
                            multiEditVideoRecordData2.editCutSegments = new ArrayList<>(multiEditVideoRecordData2.editSegments.subList(i, size));
                        }
                    }
                }
                C1462980oAq c1462980oAq = this.LLJI;
                if ((c1462980oAq instanceof C1462980oAq) && c1462980oAq != null) {
                    c1462980oAq.LIZIZ(null, false, true);
                }
            } else {
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : LIZLLL().segmentDataList) {
                    MultiEditTrimState multiEditTrimState = multiEditVideoSegmentRecordData.multiEditTrimState;
                    if (multiEditTrimState != null) {
                        multiEditTrimStateCopy = multiEditTrimState.copy(multiEditVideoSegmentRecordData.enable, multiEditTrimState.startTime, multiEditTrimState.endTime);
                    } else {
                        multiEditTrimStateCopy = null;
                    }
                    multiEditVideoSegmentRecordData.multiEditTrimState = multiEditTrimStateCopy;
                }
            }
        }
        long endTime = 0;
        LIZLLL().startTime = 0L;
        List<MultiEditVideoSegmentRecordData> list = LIZLLL().segmentDataList;
        ArrayList<MultiEditVideoSegmentRecordData> arrayList4 = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : list) {
            if (multiEditVideoSegmentRecordData2.enable) {
                arrayList4.add(multiEditVideoSegmentRecordData2);
            }
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 : arrayList4) {
            endTime += multiEditVideoSegmentRecordData3.getEndTime() - multiEditVideoSegmentRecordData3.getStartTime();
        }
        LIZLLL().endTime = endTime;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[PHI: r5
      0x00ec: PHI (r5v3 com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData) = 
      (r5v1 com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData)
      (r5v5 com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData)
      (r5v5 com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData)
     binds: [B:49:0x00e8, B:7:0x0036, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034 A[PHI: r5
      0x0034: PHI (r5v5 com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData) = 
      (r5v1 com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData)
      (r5v6 com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData)
     binds: [B:49:0x00e8, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1463000oAs.LIZ(boolean, boolean):void");
    }

    public final void LJIILJJIL(Function0 function0, boolean z) {
        long jLongValue;
        ArrayList<TimeSpeedModelExtension> arrayList;
        Pair<Long, Long> pair;
        if (z) {
            ArrayList<TimeSpeedModelExtension> arrayList2 = null;
            if (this.LLJL == null) {
                if (function0 != null) {
                    pair = (Pair) function0.invoke();
                } else {
                    pair = null;
                }
                this.LLJL = pair;
            }
            Pair<Long, Long> pair2 = this.LLJL;
            Pair<Long, Long> pair3 = this.LLJLIL;
            long jLongValue2 = 0;
            if (!this.LLIZLLLIL) {
                if (LJ().LIZIZ) {
                    C574800MgY.LJIIIZ(LIZLLL(), LJII());
                } else {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C13LP.LJJJLZIJ(0, LIZLLL().segmentDataList);
                    if (multiEditVideoSegmentRecordData != null) {
                        multiEditVideoSegmentRecordData.setStartTime(0L);
                        multiEditVideoSegmentRecordData.setEndTime(multiEditVideoSegmentRecordData.videoLength / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    }
                }
                C1462980oAq c1462980oAq = this.LLJI;
                if ((c1462980oAq instanceof C1462980oAq) && c1462980oAq != null) {
                    c1462980oAq.LIZIZ(pair2, true, true);
                }
            }
            if (!this.LLJLILLLLZIIL) {
                MultiEditVideoRecordData multiEditVideoRecordDataLIZLLL = LIZLLL();
                MultiEditVideoRecordData multiEditVideoRecordData = this.LLJILJIL;
                if (multiEditVideoRecordData == null) {
                    multiEditVideoRecordData = null;
                }
                C383300F1c.LIZIZ(multiEditVideoRecordDataLIZLLL, multiEditVideoRecordData);
                ArrayList<TimeSpeedModelExtension> arrayList3 = this.LLJJIII;
                if (arrayList3 != null) {
                    arrayList = new ArrayList<>(arrayList3);
                } else {
                    arrayList = null;
                }
                this.LLJJ = arrayList;
                MultiEditVideoStatusRecordData multiEditVideoRecordData2 = LJFF().getMultiEditVideoRecordData();
                if (multiEditVideoRecordData2 != null) {
                    ArrayList<TimeSpeedModelExtension> arrayList4 = this.LLJJIII;
                    if (arrayList4 != null) {
                        arrayList2 = new ArrayList<>(arrayList4);
                    }
                    multiEditVideoRecordData2.editSegments = arrayList2;
                }
            }
            if (!this.LLIZLLLIL && pair3 != null) {
                jLongValue = pair3.getFirst().longValue();
            } else {
                jLongValue = 0;
            }
            if (!this.LLIZLLLIL && pair3 != null) {
                jLongValue2 = pair3.getSecond().longValue() - pair3.getFirst().longValue();
            }
            JediViewModel jediViewModel = (JediViewModel) this.LLJJJJ.getValue(this, LLJLLIL[7]);
            LJII().size();
            C1463610oBr c1463610oBr = new C1463610oBr(jLongValue, jLongValue2);
            jediViewModel.getClass();
            jediViewModel.setStateImmediate(new AwS608S0100000_29(c1463610oBr, 220));
            if (pair2 != null) {
                LJIJ(pair2);
            }
        }
    }

    public final void LJIILLIIL(int i, int i2) {
        int duration;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJ;
        if (interfaceC1452170ntP != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null) {
                if (c348100DkmLIZIZ.LJFF().LJJJJ() != null && LIZLLL().musicDuration > 0) {
                    if (i2 <= 0) {
                        duration = (int) LJIIIIZZ();
                    } else {
                        duration = i2;
                    }
                    InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLJ;
                    if (interfaceC1452170ntP2 != null && i2 > interfaceC1452170ntP2.getDuration()) {
                        duration = interfaceC1452170ntP2.getDuration();
                    }
                    int i3 = duration - i;
                    if (i3 > LIZLLL().musicDuration) {
                        i3 = LIZLLL().musicDuration;
                    }
                    InterfaceC1452170ntP interfaceC1452170ntP3 = this.LLJ;
                    if (interfaceC1452170ntP3 != null) {
                        C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntP3);
                        if (c348100DkmLIZIZ2 != null) {
                            C347660Dk4 c347660Dk4LJJJJ = c348100DkmLIZIZ2.LJFF().LJJJJ();
                            if (c347660Dk4LJJJJ != null) {
                                c347660Dk4LJJJJ.LIZLLL = LIZLLL().musicTrimIn;
                                c347660Dk4LJJJJ.LJ = LIZLLL().musicTrimIn + i3;
                                c347660Dk4LJJJJ.LJFF = i;
                                c347660Dk4LJJJJ.LJIJJLI = false;
                                c347660Dk4LJJJJ.LJI = -2L;
                                c348100DkmLIZIZ2.LJFF().LJJJJLL(c347660Dk4LJJJJ);
                                return;
                            }
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LJIL(float f, int i) {
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C13LP.LJJJLZIJ(i, LIZLLL().segmentDataList);
        if (multiEditVideoSegmentRecordData != null) {
            multiEditVideoSegmentRecordData.scale = f;
        }
    }

    public final void LJIJI(int i, int i2, int i3) {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJ;
        if (interfaceC1452170ntP != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null) {
                if (c348100DkmLIZIZ.LJFF().LJJJJ() != null && LIZLLL().musicDuration > 0) {
                    this.LLJLL = i;
                    int i4 = i + LIZLLL().musicTrimIn;
                    if (i4 > LIZLLL().musicDuration) {
                        i4 %= LIZLLL().musicDuration;
                    }
                    InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLJ;
                    if (interfaceC1452170ntP2 != null) {
                        C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntP2);
                        if (c348100DkmLIZIZ2 != null) {
                            C347660Dk4 c347660Dk4LJJJJ = c348100DkmLIZIZ2.LJFF().LJJJJ();
                            if (c347660Dk4LJJJJ != null) {
                                c347660Dk4LJJJJ.LIZLLL = i4;
                                c347660Dk4LJJJJ.LJ = i4 + i3;
                                c347660Dk4LJJJJ.LJFF = i2;
                                c347660Dk4LJJJJ.LJIJJLI = false;
                                c348100DkmLIZIZ2.LJFF().LJJJJLL(c347660Dk4LJJJJ);
                                return;
                            }
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    return;
                }
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static void LJIJJ(C1463000oAs c1463000oAs, boolean z, Pair pair, boolean z2, boolean z3, int i) {
        long j;
        Pair pair2 = null;
        if ((i & 2) != 0) {
            pair = null;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        c1463000oAs.getClass();
        C1463170oB9 c1463170oB9 = AbstractC1463010oAt.LLLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchMode,current:");
        sbLIZ.append(c1463000oAs.LLIZLLLIL);
        sbLIZ.append(",target:");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1463170oB9.getClass();
        C1463170oB9.LIZ(strLIZIZ);
        c1463000oAs.LLIZLLLIL = z;
        Iterator<VideoSegment> it2 = c1463000oAs.LJII().iterator();
        while (it2.hasNext()) {
            it2.next().isStickPointMode = c1463000oAs.LLIZLLLIL;
        }
        C574800MgY.LJIIIZ(c1463000oAs.LIZLLL(), c1463000oAs.LJII());
        if (!z) {
            Iterator<MultiEditVideoSegmentRecordData> it3 = c1463000oAs.LIZLLL().segmentDataList.iterator();
            while (it3.hasNext()) {
                it3.next().setVideoSpeed(1.0f);
            }
        }
        c1463000oAs.LJIIL().LIZIZ = z;
        c1463000oAs.LJIIL().LIZIZ(c1463000oAs.LJII());
        long jLIZ = 0;
        if (z) {
            C1462980oAq c1462980oAq = c1463000oAs.LLJI;
            if ((c1462980oAq instanceof C1462980oAq) && c1462980oAq != null) {
                c1462980oAq.LIZIZ(null, false, z2);
            }
            if (c1463000oAs.LJFF().mIsFromDraft && !c1463000oAs.LLILLL) {
                c1463000oAs.LLILLL = true;
            } else {
                c1463000oAs.LIZIZ(true);
            }
            if (z3) {
                c1463000oAs.LJIIJ().LIZLLL(0L, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, true);
                return;
            }
            return;
        }
        List<MultiEditVideoSegmentRecordData> list = c1463000oAs.LIZLLL().segmentDataList;
        if (list != null) {
            long j2 = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                if (multiEditVideoSegmentRecordData != null) {
                    j = multiEditVideoSegmentRecordData.videoLength;
                } else {
                    j = 0;
                }
                j2 += j;
            }
            jLIZ = C352310DrZ.LIZ(j2);
        }
        if (pair != null) {
            pair2 = new Pair(pair.getFirst(), Long.valueOf(Math.max(((Number) pair.getSecond()).longValue(), jLIZ)));
        }
        C1462980oAq c1462980oAq2 = c1463000oAs.LLJI;
        if ((c1462980oAq2 instanceof C1462980oAq) && c1462980oAq2 != null) {
            c1462980oAq2.LIZIZ(pair2, false, true);
        }
        c1463000oAs.LIZIZ(false);
        if (!z3) {
            return;
        }
        c1463000oAs.LJIIJ().LIZLLL(-1L, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, true);
    }
}
