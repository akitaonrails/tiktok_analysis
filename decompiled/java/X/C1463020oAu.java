package X;

import Y.ACallableS427S0100000_22;
import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import Y.AObserverS225S0100000_22;
import android.app.Activity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MusicSyncData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateInsertMediaService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointGetVideoFrameManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS139S0110000_22;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS59S0310000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0oAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463020oAu extends AbstractC1463010oAt implements InterfaceC1463240oBG {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLLLL;
    public static final int LLLLLLLLLL;
    public final C19A3 LLLIIIL;
    public final int LLLIIL;
    public final InterfaceC1419190n2D LLLIILIL;
    public volatile boolean LLLIL;
    public int LLLILZ;
    public Pair<Long, Long> LLLILZJ;
    public final InterfaceC1731706qJ LLLILZLLLI;
    public final InterfaceC1731706qJ LLLIZZ;
    public final InterfaceC1731706qJ LLLJ;
    public final InterfaceC1731706qJ LLLJIL;
    public final InterfaceC1731706qJ LLLJL;
    public final InterfaceC1731706qJ LLLL;
    public final InterfaceC1731706qJ LLLLII;
    public final InterfaceC1731706qJ LLLLIIIILLL;
    public final InterfaceC1731706qJ LLLLIIL;
    public final C01GW LLLLIILL;
    public final InterfaceC1731706qJ LLLLIILLL;
    public final InterfaceC1731706qJ LLLLIL;
    public final InterfaceC1731706qJ LLLLILI;
    public final InterfaceC1731706qJ LLLLJ;
    public C1463050oAx LLLLJI;
    public final InterfaceC1731706qJ LLLLL;
    public final InterfaceC1731706qJ LLLLLIL;
    public final InterfaceC377040EqM LLLLLILLIL;
    public final C01GW LLLLLJIL;
    public C557050Lt1 LLLLLJLJLL;
    public MutableLiveData<Boolean> LLLLLL;
    public C560530Lyd<Boolean> LLLLLLIL;
    public final MutableLiveData<Boolean> LLLLLLJ;
    public final MutableLiveData<Unit> LLLLLLL;

    @Override // X.InterfaceC1419190n2D
    public void fN() {
        this.LLJ = true;
        h8();
    }

    public void ma(int i) {
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1463020oAu.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1463020oAu.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1463020oAu.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1463020oAu.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1463020oAu.class, "editAudioRecordApi", "getEditAudioRecordApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1463020oAu.class, "editToolBarApi", "getEditToolBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1463020oAu.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1463020oAu.class, "silentAutoCaptionApi", "getSilentAutoCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/SilentAutoCaptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1463020oAu.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1463020oAu.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1463020oAu.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1463020oAu.class, "mixEditingOperationApi", "getMixEditingOperationApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialOperationApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C1463020oAu.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C1463020oAu.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C1463020oAu.class, "audioEditApi", "getAudioEditApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0);
        c09r3.getClass();
        LLLLLLLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15};
        LLLLLLLLLL = 8;
    }

    private final InterfaceC1461350o8D E3() {
        return (InterfaceC1461350o8D) this.LLLJ.getValue(this, LLLLLLLLL[2]);
    }

    private final InterfaceC1413540mt6 I9() {
        return (InterfaceC1413540mt6) this.LLLLIL.getValue(this, LLLLLLLLL[10]);
    }

    private final InterfaceC1455730nz9 J8() {
        return (InterfaceC1455730nz9) this.LLLJL.getValue(this, LLLLLLLLL[4]);
    }

    private final InterfaceC1413600mtC J9() {
        return (InterfaceC1413600mtC) this.LLLLILI.getValue(this, LLLLLLLLL[11]);
    }

    private final InterfaceC1417050myl P8() {
        return (InterfaceC1417050myl) this.LLLLJ.getValue(this, LLLLLLLLL[12]);
    }

    private final InterfaceC1455620nyy P9() {
        return (InterfaceC1455620nyy) this.LLLLIIIILLL.getValue(this, LLLLLLLLL[7]);
    }

    private final InterfaceC1457250o1b T8() {
        return (InterfaceC1457250o1b) this.LLLJIL.getValue(this, LLLLLLLLL[3]);
    }

    private final InterfaceC1455500nym a9() {
        return (InterfaceC1455500nym) this.LLLIZZ.getValue(this, LLLLLLLLL[1]);
    }

    private final void h8() {
        InterfaceC1456910o13 interfaceC1456910o13J9;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        if (u4.LJIIIIZZ(getEditModel()) && this.LLJ) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = getEditModel().getMultiEditVideoRecordData();
            if (multiEditVideoRecordData2 != null && (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                    if (multiEditVideoSegmentRecordData.musicSyncData == null) {
                        Pair pair = new Pair(Long.valueOf(multiEditVideoSegmentRecordData.getStartTime()), Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()));
                        multiEditVideoSegmentRecordData.setStartTime(0L);
                        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                        multiEditVideoSegmentRecordData.setEndTime(timeUnit.toMillis(multiEditVideoSegmentRecordData.videoLength));
                        multiEditVideoSegmentRecordData.musicSyncData = new MusicSyncData(((Number) pair.getFirst()).longValue(), ((Number) pair.getSecond()).longValue(), timeUnit.toMillis(multiEditVideoSegmentRecordData.videoLength));
                    }
                }
            }
            C1463000oAs c1463000oAsI3 = i3();
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1463000oAs.LLJLLIL;
            c1463000oAsI3.LJIILL(false);
            if (getEditModel().mIsFromDraft) {
                C1416110mxF.LJIIIZ(getEditModel().creativeModel.autoCutModel, -1, null, -1, null, null, null, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), null);
                N5();
                InterfaceC1460000o62 interfaceC1460000o62Q9 = q9();
                if (interfaceC1460000o62Q9 != null) {
                    interfaceC1460000o62Q9.rm(15, true);
                }
            }
        }
        C1463000oAs.LJIJJ(i3(), false, this.LLLILZJ, false, false, 12);
        if (this.LLJ) {
            this.LLJ = false;
            getEditModel().setEditMusicSyncMode(false);
            this.LLLLLLIL.LJIIJ(Boolean.FALSE);
            if (C0EYG.LIZ(getEditModel()) && (interfaceC1456910o13J9 = j9()) != null && interfaceC1456910o13J9.sj1()) {
                InterfaceC1456910o13 interfaceC1456910o13J92 = j9();
                if (interfaceC1456910o13J92 != null) {
                    interfaceC1456910o13J92.n80();
                }
                InterfaceC1456910o13 interfaceC1456910o13J93 = j9();
                if (interfaceC1456910o13J93 != null) {
                    InterfaceC1452170ntP interfaceC1452170ntP = this.LLJILJILJ;
                    interfaceC1456910o13J93.Dt1(interfaceC1452170ntP != null ? C352130DrH.LIZ(interfaceC1452170ntP) : null);
                }
            }
            EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT2 = T2();
            editAdjustClipsBottomViewModelT2.getClass();
            editAdjustClipsBottomViewModelT2.setStateImmediate(new AwS41S0010000_29(false, 23));
            getEditModel().setVoiceVolume(1.0f);
            Ba(false);
        }
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT22 = T2();
        editAdjustClipsBottomViewModelT22.getClass();
        editAdjustClipsBottomViewModelT22.setStateImmediate(AFwS273S0000000_29.get$arr$(133));
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT23 = T2();
        InterfaceC19767412Vs interfaceC19767412Vs = this.LLJILLL;
        editAdjustClipsBottomViewModelT23.oR2(interfaceC19767412Vs != null ? interfaceC19767412Vs.getSelectedTime() : 0.0f);
    }

    private final InterfaceC1456910o13 j9() {
        return (InterfaceC1456910o13) this.LLLLIILLL.getValue(this, LLLLLLLLL[9]);
    }

    private final InterfaceC1461660o8i n9() {
        return (InterfaceC1461660o8i) this.LLLLIILL.getValue();
    }

    private final InterfaceC1460000o62 q9() {
        return (InterfaceC1460000o62) this.LLLL.getValue(this, LLLLLLLLL[5]);
    }

    private final InterfaceC19753512Qj u8() {
        return (InterfaceC19753512Qj) this.LLLLLIL.getValue(this, LLLLLLLLL[14]);
    }

    @Override // X.InterfaceC1419190n2D
    public void II1() {
        if (((Boolean) C273010Amx.LIZ.getValue()).booleanValue()) {
            I7();
        }
    }

    @Override // X.InterfaceC1463240oBG
    public void LLLLLLJ() {
        this.LLLLLLIL.LJIIJ(Boolean.TRUE);
    }

    @Override // X.AbstractC1463010oAt
    public void M5() {
        C1463050oAx c1463050oAx = this.LLLLJI;
        if (c1463050oAx == null) {
            c1463050oAx = null;
        }
        c1463050oAx.getClass();
        AbstractC1463010oAt.LLLII.getClass();
        C1463170oB9.LIZ("recoverMusicSyncMode");
        c1463050oAx.LJII().LJ(null, false);
    }

    @Override // X.AbstractC1463010oAt
    public void R5() {
        C1664590tQ1.LIZJ(this, new AwS601S0100000_22(this, 206));
        C1664600tQ2.LIZJ(this, AFwS261S0000000_22.get$arr$(122));
        C1DRG c1drgLJIIIIZZ = C1664600tQ2.LJIIIIZZ(this);
        if (c1drgLJIIIIZZ != null) {
            this.LLLLJI = (C1463050oAx) c1drgLJIIIIZZ.LJII(C1463050oAx.class, null);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.InterfaceC1419190n2D
    public void Uu2() {
        C557050Lt1 c557050Lt1 = this.LLLLLJLJLL;
        if (c557050Lt1 != null) {
            c557050Lt1.LIZ(false, true);
        }
    }

    @Override // X.AbstractC1463010oAt
    public String W2() {
        C1463050oAx c1463050oAx = this.LLLLJI;
        if (c1463050oAx == null) {
            c1463050oAx = null;
        }
        AVMusic aVMusic = c1463050oAx.LJFF;
        if (aVMusic != null) {
            return aVMusic.path;
        }
        return null;
    }

    @Override // X.AbstractC1463010oAt
    public boolean W7() {
        C1463050oAx c1463050oAx = this.LLLLJI;
        if (c1463050oAx == null) {
            c1463050oAx = null;
        }
        return c1463050oAx.LJ;
    }

    public final InterfaceC1453200nv4 c9() {
        return (InterfaceC1453200nv4) this.LLLLL.getValue(this, LLLLLLLLL[13]);
    }

    public final void pa() {
        C0CNO.LIZLLL(0L, new AwS566S0100000_22(this, 303));
    }

    public final InterfaceC1418580n1E t9() {
        return (InterfaceC1418580n1E) this.LLLILZLLLI.getValue(this, LLLLLLLLL[0]);
    }

    @Override // X.C12VU
    public boolean uV0() {
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "cancelDefaultMusicSync");
        C1463050oAx c1463050oAx = this.LLLLJI;
        if (c1463050oAx == null) {
            c1463050oAx = null;
        }
        if (!c1463050oAx.LJIIL) {
            return false;
        }
        C1463030oAv c1463030oAvLJII = c1463050oAx.LJII();
        c1463030oAvLJII.LJIIJJI = true;
        AnonymousClass0956 anonymousClass0956 = c1463030oAvLJII.LJIIJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c1463050oAx.LJIIJ(null);
        c1463050oAx.LJIIL = false;
        y8().LIZ();
        this.LLLLLLL.setValue(Unit.LIZ);
        return true;
    }

    public final InterfaceC377540ErA w9() {
        return (InterfaceC377540ErA) this.LLLLII.getValue(this, LLLLLLLLL[6]);
    }

    public final C386820FEq y8() {
        return (C386820FEq) this.LLLLLJIL.getValue();
    }

    @Override // X.C12VU
    public void yD1() {
        AlertDialogC1397820mTk alertDialogC1397820mTk;
        C1463050oAx c1463050oAx = this.LLLLJI;
        if (c1463050oAx == null) {
            c1463050oAx = null;
        }
        c1463050oAx.getClass();
        AbstractC1463010oAt.LLLII.getClass();
        C1463170oB9.LIZ("startSmartMusicSync");
        StickPointGetVideoFrameManager stickPointGetVideoFrameManagerLJIIIZ = c1463050oAx.LJIIIZ();
        List<VideoSegment> listLJIIIIZZ = c1463050oAx.LJIIIIZZ();
        stickPointGetVideoFrameManagerLJIIIZ.LJIIJ = false;
        InterfaceC1463540oBk interfaceC1463540oBk = stickPointGetVideoFrameManagerLJIIIZ.LJFF;
        if (interfaceC1463540oBk != null) {
            interfaceC1463540oBk.onStart();
        }
        if (C580130Mp9.LIZ(listLJIIIIZZ)) {
            stickPointGetVideoFrameManagerLJIIIZ.LIZ(true, false, false);
        } else {
            InterfaceC1452170ntP interfaceC1452170ntP = stickPointGetVideoFrameManagerLJIIIZ.LIZ;
            if (interfaceC1452170ntP == null) {
                stickPointGetVideoFrameManagerLJIIIZ.LIZ(false, false, false);
            } else {
                stickPointGetVideoFrameManagerLJIIIZ.LJIIJ = true;
                interfaceC1452170ntP.cancelGenVideoFrame(stickPointGetVideoFrameManagerLJIIIZ.LIZLLL);
                stickPointGetVideoFrameManagerLJIIIZ.LJIIL.removeCallbacksAndMessages(null);
                stickPointGetVideoFrameManagerLJIIIZ.LJIIJ = false;
                stickPointGetVideoFrameManagerLJIIIZ.LJIIIZ = 0.0f;
                ArrayList arrayList = (ArrayList) listLJIIIIZZ;
                stickPointGetVideoFrameManagerLJIIIZ.LJIIIIZZ = 1.0f / arrayList.size();
                stickPointGetVideoFrameManagerLJIIIZ.LIZIZ = 0;
                stickPointGetVideoFrameManagerLJIIIZ.LJ = arrayList;
                VideoSegment videoSegment = (VideoSegment) ListProtector.get(arrayList, 0);
                stickPointGetVideoFrameManagerLJIIIZ.LIZJ = videoSegment;
                stickPointGetVideoFrameManagerLJIIIZ.LIZLLL = videoSegment.videoIndex;
                Activity activity = stickPointGetVideoFrameManagerLJIIIZ.LJII;
                if (activity != null && !activity.isFinishing() && (alertDialogC1397820mTk = stickPointGetVideoFrameManagerLJIIIZ.LJI) != null && !alertDialogC1397820mTk.isShowing()) {
                    try {
                        AlertDialogC1397820mTk alertDialogC1397820mTk2 = stickPointGetVideoFrameManagerLJIIIZ.LJI;
                        alertDialogC1397820mTk2.show();
                        C785410UrT.LIZIZ(alertDialogC1397820mTk2);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(alertDialogC1397820mTk2);
                        C816490W1f.LIZ(alertDialogC1397820mTk2);
                        AlertDialogC1397820mTk alertDialogC1397820mTk3 = stickPointGetVideoFrameManagerLJIIIZ.LJI;
                        if (alertDialogC1397820mTk3 != null && alertDialogC1397820mTk3.isShowing()) {
                            stickPointGetVideoFrameManagerLJIIIZ.LJI.LIZ(0);
                        }
                        C194353111z.LIZ.LIZIZ(1012, C0MVY.SHOW, C0LD3.PROGRESS_WITH_MESSAGE, C0LEP.CLOSE_VISIBLE);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (!stickPointGetVideoFrameManagerLJIIIZ.LJIIJ) {
                    stickPointGetVideoFrameManagerLJIIIZ.LIZ.Nf(stickPointGetVideoFrameManagerLJIIIZ.LIZLLL, new C1463270oBJ(stickPointGetVideoFrameManagerLJIIIZ));
                }
            }
        }
        C1463170oB9 c1463170oB9 = AbstractC1463010oAt.LLLII;
        VideoPublishEditModel editModel = getEditModel();
        AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(121);
        c1463170oB9.getClass();
        C1463170oB9.LIZIZ(editModel, "apply_smart_sync", aFwS261S0000000_22);
    }

    public final InterfaceC1455850nzL z8() {
        return (InterfaceC1455850nzL) this.LLLLIIL.getValue(this, LLLLLLLLL[8]);
    }

    private final boolean V9() {
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETimeSpaceNode nLETimeSpaceNode;
        long jLIZIZ = H4().LIZIZ();
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJILJILJ;
        Long lValueOf = (interfaceC1452170ntP == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) == null || (mainTrack = nLEModelLIZ.getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(sortedSlots)) == null) ? null : Long.valueOf(nLETimeSpaceNode.getEndTime());
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isCurPlayProgressExceedFirstStickPoint: curPlayProgress = ");
        sbLIZ.append(jLIZIZ);
        sbLIZ.append(", firstStickPoint = ");
        sbLIZ.append(lValueOf);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        return lValueOf != null && jLIZIZ > lValueOf.longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.AbstractC1463010oAt
    public boolean C1() {
        return E3().C1();
    }

    @Override // X.AbstractC1463010oAt
    public void LLJJJJ() {
        InterfaceC1455730nz9 interfaceC1455730nz9J8 = J8();
        if (interfaceC1455730nz9J8 != null) {
            interfaceC1455730nz9J8.LLJJJJ();
        }
    }

    @Override // X.AbstractC1463010oAt
    public void N5() {
        InterfaceC1460000o62 interfaceC1460000o62Q9 = q9();
        if (interfaceC1460000o62Q9 != null) {
            interfaceC1460000o62Q9.refresh();
        }
    }

    @Override // X.AbstractC1463010oAt
    public void P5() {
        InterfaceC1455500nym interfaceC1455500nymA9 = a9();
        if (interfaceC1455500nymA9 != null) {
            interfaceC1455500nymA9.aH(true);
        }
    }

    @Override // X.AbstractC1463010oAt
    public void Qh() {
        InterfaceC1455500nym interfaceC1455500nymA9 = a9();
        if (interfaceC1455500nymA9 != null) {
            interfaceC1455500nymA9.Qh();
        }
        InterfaceC19753512Qj interfaceC19753512QjU8 = u8();
        if (interfaceC19753512QjU8 != null) {
            interfaceC19753512QjU8.SS1();
        }
    }

    @Override // X.AbstractC1463010oAt
    public void U4() {
        E3().U4();
    }

    @Override // X.InterfaceC1419190n2D
    public void UZ1() {
        i3().LJIILL(true);
    }

    @Override // X.AbstractC1463010oAt
    public void Xi() {
        InterfaceC1413540mt6 interfaceC1413540mt6I9;
        C385670FAf<Pair<Boolean, AVMusic>> c385670FAfGs0;
        super.Xi();
        if (C1444820nhY.LIZIZ) {
            selectNonNullSubscribe(T2(), new C2217381BqS() { // from class: X.0oBj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((EditAdjustClipsBottomViewState) obj).getRestoreMusicSyncEvent();
                }
            }, new C1765020w20(), new AwS636S0100000_22(this, 12));
            C013C c013c = new C013C();
            if (C1430550nKX.LIZLLL(getEditModel()) && (interfaceC1413540mt6I9 = I9()) != null && (c385670FAfGs0 = interfaceC1413540mt6I9.gs0()) != null) {
                c385670FAfGs0.LIZ(this, new AObjectS305S0200000_22(c013c, this, 5));
            }
            B3().rV().observe(this, new AObjectS245S0100000_22(this, 64));
            o4().Zq().LJ(this, new AObjectS245S0100000_22(this, 65));
            if (getEditModel().creativeModel.editModel.enableSkipStickPointRes) {
                C537720L7a.LIZ.observe(this, new AObserverS225S0100000_22(this, 46));
            }
        }
    }

    @Override // X.InterfaceC1419190n2D
    public void ar2() {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        InterfaceC1413600mtC interfaceC1413600mtCJ9 = J9();
        if (interfaceC1413600mtCJ9 != null) {
            interfaceC1413600mtCJ9.Qd();
        } else {
            InterfaceC1417050myl interfaceC1417050mylP8 = P8();
            if (interfaceC1417050mylP8 != null) {
                interfaceC1417050mylP8.Qd();
            }
        }
        if (u4.LJIIIIZZ(getEditModel()) && this.LLJ) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = getEditModel().getMultiEditVideoRecordData();
            if (multiEditVideoRecordData2 != null && (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                    if (multiEditVideoSegmentRecordData.musicSyncData == null) {
                        Pair pair = new Pair(Long.valueOf(multiEditVideoSegmentRecordData.getStartTime()), Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()));
                        multiEditVideoSegmentRecordData.setStartTime(0L);
                        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                        multiEditVideoSegmentRecordData.setEndTime(timeUnit.toMillis(multiEditVideoSegmentRecordData.videoLength));
                        multiEditVideoSegmentRecordData.musicSyncData = new MusicSyncData(((Number) pair.getFirst()).longValue(), ((Number) pair.getSecond()).longValue(), timeUnit.toMillis(multiEditVideoSegmentRecordData.videoLength));
                    }
                }
            }
            C1463000oAs c1463000oAsI3 = i3();
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1463000oAs.LLJLLIL;
            c1463000oAsI3.LJIILL(false);
        }
        C1463000oAs.LJIJJ(i3(), false, this.LLLILZJ, false, false, 12);
    }

    @Override // X.AbstractC1463010oAt
    public boolean c0() {
        return n9().c0();
    }

    @Override // X.InterfaceC1419190n2D
    public void fb2() {
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT2 = T2();
        editAdjustClipsBottomViewModelT2.getClass();
        editAdjustClipsBottomViewModelT2.setState(AFwS273S0000000_29.get$arr$(135));
    }

    @Override // X.InterfaceC1419190n2D
    public void gy() {
        C1463000oAs c1463000oAsI3 = i3();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1463000oAs.LLJLLIL;
        c1463000oAsI3.LJIILL(false);
    }

    @Override // X.AbstractC1463010oAt
    public void m6() {
        if (getEditModel().creativeModel.editModel.enableSkipStickPointRes) {
            oa(null, "");
            C1452640nuA.LJII(null, false, getEditModel().creativeModel.musicBuzModel);
            C537720L7a.LIZ.setValue(null);
            C537720L7a.LIZIZ.setValue(C13BV.INSTANCE);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C201955140j.LIZJ(C20102213l6.LIZIZ, "LazyLoadStickerPointResources onPause, set isInitStickPointCanceled = true");
        C557050Lt1 c557050Lt1 = this.LLLLLJLJLL;
        if (c557050Lt1 != null) {
            c557050Lt1.LIZ(false, true);
        }
    }

    public final void p8() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        InterfaceC1452170ntP value = B3().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null) {
            return;
        }
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(model.deepClone());
        boolean z = true;
        boolean z2 = false;
        if (nLEModelDynamicCast != null) {
            VecNLETrackSPtr tracks = nLEModelDynamicCast.getTracks();
            if (tracks != null) {
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (NLETrackType.VIDEO == nLETrack.getTrackType()) {
                        arrayList.add(nLETrack);
                    }
                }
                ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
                }
                for (NLETrackSlot nLETrackSlot : arrayList2) {
                    ITemplateInsertMediaService iTemplateInsertMediaService = (ITemplateInsertMediaService) C0EWF.LIZ.getValue();
                    if (iTemplateInsertMediaService != null) {
                        iTemplateInsertMediaService.LIZ(nLETrackSlot);
                    }
                }
            }
            VecNLETrackSPtr tracks2 = nLEModelDynamicCast.getTracks();
            if (tracks2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (NLETrack nLETrack2 : tracks2) {
                    if (nLETrack2.getTrackType() == NLETrackType.VIDEO) {
                        arrayList3.add(nLETrack2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList4);
                }
                if (arrayList4.isEmpty()) {
                    z = false;
                    z2 = z;
                } else {
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        NLESegment mainSegment = ((NLETrackSlot) it4.next()).getMainSegment();
                        NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) (mainSegment != null ? mainSegment.getResource() : null));
                        if (nLEResourceAVDynamicCast != null && nLEResourceAVDynamicCast.getHasAudio()) {
                            break;
                        }
                    }
                    z = false;
                    z2 = z;
                }
            }
        }
        getEditModel().creativeModel.importModel.isFastImport = z2;
        AudioRecorderParam veAudioRecorderParam = getEditModel().getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            veAudioRecorderParam.setHasOriginalSound(z2);
        }
    }

    @Override // X.AbstractC1463010oAt
    public void u1() {
        E3().u1();
    }

    @Override // X.InterfaceC1419190n2D
    public LiveEvent<Boolean> N50() {
        return this.LLLLLLIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1419190n2D
    public LiveData<Boolean> nz2() {
        return this.LLLLLLJ;
    }

    public InterfaceC1419190n2D r8() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1419190n2D
    public LiveData<Boolean> rJ0() {
        return this.LLLLLL;
    }

    @Override // X.InterfaceC1419190n2D
    public LiveData<Unit> xO() {
        return this.LLLLLLL;
    }

    @Override // X.AbstractC1463010oAt
    public int z4() {
        return this.LLLILZ;
    }

    private final void Ba(boolean z) {
        float f;
        if (getEditModel().getVeAudioRecorderParam() == null) {
            getEditModel().setVeAudioRecorderParam(new AudioRecorderParam());
        }
        AudioRecorderParam veAudioRecorderParam = getEditModel().getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            veAudioRecorderParam.setHasOriginalSound(getEditModel().hasOriginalSound(false));
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            veAudioRecorderParam.setVoiceVolume(f);
            if (veAudioRecorderParam.getNeedOriginalSound()) {
                veAudioRecorderParam.setMuteByAudioCopyright(false);
            }
        }
        if (z) {
            InterfaceC1418580n1E interfaceC1418580n1ET9 = t9();
            if (interfaceC1418580n1ET9 != null) {
                interfaceC1418580n1ET9.Hr1(false, false, true);
            }
            InterfaceC1418580n1E interfaceC1418580n1ET92 = t9();
            if (interfaceC1418580n1ET92 != null) {
                interfaceC1418580n1ET92.A10(1.0f);
            }
        } else {
            InterfaceC1418580n1E interfaceC1418580n1ET93 = t9();
            if (interfaceC1418580n1ET93 != null) {
                interfaceC1418580n1ET93.N81(1.0f);
            }
            InterfaceC1418580n1E interfaceC1418580n1ET94 = t9();
            if (interfaceC1418580n1ET94 != null) {
                interfaceC1418580n1ET94.Hr1(true, false, true);
            }
        }
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJILJILJ;
        if (interfaceC1452170ntP != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null) {
                C347200DjK.LIZ(c348100DkmLIZIZ.LIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // X.InterfaceC1419190n2D
    public void G61(boolean z) {
        this.LLJ = z;
        getEditModel().creativeModel.soundSyncModel.soundSyncFrom = "trim_page";
        C1463000oAs c1463000oAsI3 = i3();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1463000oAs.LLJLLIL;
        c1463000oAsI3.LJIILL(false);
    }

    @Override // X.InterfaceC1463240oBG
    public void L(int i) {
        this.LLLILZ = i;
    }

    @Override // X.InterfaceC1463240oBG
    public void LJJJ(List<Integer> list) {
        C1463000oAs c1463000oAsI3 = i3();
        c1463000oAsI3.getClass();
        int size = list.size();
        List<MultiEditVideoSegmentRecordData> list2 = c1463000oAsI3.LIZLLL().segmentDataList;
        if (list2 != null && list2.size() == size) {
            List listLLIIII = C13LP.LLIIII(list2);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(ListProtector.get(listLLIIII, it2.next().intValue()));
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) obj;
                    multiEditVideoSegmentRecordData.videoKey = i;
                    arrayList2.add(multiEditVideoSegmentRecordData);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c1463000oAsI3.LIZLLL().setThreadSafeSegmentDataList(arrayList2);
        }
        ArrayList<TimeSpeedModelExtension> arrayList3 = c1463000oAsI3.LLJJIII;
        if (arrayList3 != null && arrayList3.size() == size) {
            List listLLIIII2 = C13LP.LLIIII(arrayList3);
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Integer> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList4.add(ListProtector.get(listLLIIII2, it3.next().intValue()));
            }
            c1463000oAsI3.LLJJIII = new ArrayList<>(arrayList4);
        }
        List<VideoSegment> listLJII = c1463000oAsI3.LJII();
        if (C19719512Dh.LJI(listLJII) && listLJII != null && listLJII.size() == size) {
            List listLLIIII3 = C13LP.LLIIII(listLJII);
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Integer> it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList5.add(ListProtector.get(listLLIIII3, it4.next().intValue()));
            }
            ArrayList arrayList6 = new ArrayList(arrayList5);
            listLJII.clear();
            listLJII.addAll(arrayList6);
        }
        List<AutoCutMediaModel> list3 = c1463000oAsI3.LJFF().creativeModel.autoCutModel.mediaList;
        if (list3.size() == size) {
            List listLLIIII4 = C13LP.LLIIII(list3);
            AutoCutModel autoCutModel = c1463000oAsI3.LJFF().creativeModel.autoCutModel;
            ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Integer> it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList7.add(ListProtector.get(listLLIIII4, it5.next().intValue()));
            }
            autoCutModel.mediaList = new ArrayList(arrayList7);
        }
        ArrayList<ImportVideoInfo> importInfoList = c1463000oAsI3.LJFF().getImportInfoList();
        if (importInfoList != null && importInfoList.size() == size) {
            List listLLIIII5 = C13LP.LLIIII(importInfoList);
            VideoPublishEditModel videoPublishEditModelLJFF = c1463000oAsI3.LJFF();
            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Integer> it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList8.add(ListProtector.get(listLLIIII5, it6.next().intValue()));
            }
            videoPublishEditModelLJFF.setImportInfoList(new ArrayList<>(arrayList8));
        }
    }

    @Override // X.InterfaceC1463240oBG
    public void LLJLIL(List<? extends VideoSegment> list) {
        C1463170oB9 c1463170oB9 = AbstractC1463010oAt.LLLII;
        VideoPublishEditModel editModel = getEditModel();
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 205);
        c1463170oB9.getClass();
        C1463170oB9.LIZIZ(editModel, "smart_sync_cancel", awS601S0100000_22);
    }

    @Override // X.AbstractC1463010oAt
    public void LLLLZI(boolean z) {
        InterfaceC1418580n1E interfaceC1418580n1ET9 = t9();
        if (interfaceC1418580n1ET9 != null) {
            interfaceC1418580n1ET9.uB1(z);
        }
    }

    @Override // X.C12VU
    public void Lu2(boolean z) {
        String musicId;
        String strLJFF;
        Cut2EditTransferModel cut2EditTransferModel;
        List<AVMusic> musicList;
        if (this.LLJ == z) {
            return;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel);
        if (z) {
            this.LLLILZJ = F4();
            if (aVMusicExtractAVMusic == null) {
                AVMusic aVMusic = this.LLJJ;
                if ((aVMusic != null || ((cut2EditTransferModel = c3().LJ) != null && (musicList = cut2EditTransferModel.getMusicList()) != null && (aVMusic = (AVMusic) C13LP.LJJJLZIJ(0, musicList)) != null)) && (strLJFF = C1444820nhY.LJFF(aVMusic)) != null) {
                    ra(strLJFF, aVMusic, false);
                    uV0();
                    InterfaceC1453200nv4 interfaceC1453200nv4C9 = c9();
                    if (interfaceC1453200nv4C9 != null) {
                        interfaceC1453200nv4C9.vU(false);
                    }
                    C1463050oAx c1463050oAx = this.LLLLJI;
                    if (c1463050oAx == null) {
                        c1463050oAx = null;
                    }
                    C1463050oAx.LJIIJJI(c1463050oAx, aVMusic, 0, false, false, 0L, null, null, 510);
                    aVMusicExtractAVMusic = aVMusic;
                } else {
                    tH0(false, null);
                }
            } else {
                uV0();
                InterfaceC1453200nv4 interfaceC1453200nv4C92 = c9();
                if (interfaceC1453200nv4C92 != null) {
                    interfaceC1453200nv4C92.vU(false);
                }
                C1463050oAx c1463050oAx2 = this.LLLLJI;
                if (c1463050oAx2 == null) {
                    c1463050oAx2 = null;
                }
                C1463050oAx.LJIIJJI(c1463050oAx2, aVMusicExtractAVMusic, getEditModel().getMMusicStart(), false, false, 0L, null, null, 508);
            }
            getEditModel().creativeModel.musicBuzModel.stickPointStrategy = Boolean.valueOf(C1428520nHG.LJJLIIIJILLIZJL(getEditModel()));
        } else {
            this.LLJJ = MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel);
            ra(null, null, false);
        }
        VideoPublishEditModel editModel = getEditModel();
        if (aVMusicExtractAVMusic != null) {
            musicId = aVMusicExtractAVMusic.getMusicId();
        } else {
            musicId = null;
        }
        C0EMB.LIZ(editModel, z, musicId, null, null, null);
    }

    @Override // X.AbstractC1463010oAt
    public void P6(int i) {
        T8().LLLL(i);
    }

    @Override // X.AbstractC1463010oAt
    public void Tj(int i) {
        InterfaceC1455500nym interfaceC1455500nymA9 = a9();
        if (interfaceC1455500nymA9 != null) {
            interfaceC1455500nymA9.Tj(i);
        }
    }

    @Override // X.AbstractC1463010oAt
    public void W6(int i) {
        InterfaceC1455500nym interfaceC1455500nymA9 = a9();
        if (interfaceC1455500nymA9 != null) {
            interfaceC1455500nymA9.LLLL(i);
        }
    }

    @Override // X.C12VU
    public void Z10(boolean z) {
        this.LLJ = z;
    }

    @Override // X.AbstractC1463010oAt
    public void a92(boolean z) {
        E3().a92(z);
    }

    public final boolean da(boolean z) {
        if (!z || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_sound_sync_not_replay", true, false) || V9()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1463010oAt
    public void l0(Pair<Integer, Integer> pair) {
        E3().l0(pair);
    }

    @Override // X.AbstractC1463010oAt
    public void n5(InterfaceC1452170ntP interfaceC1452170ntP) {
        T9(interfaceC1452170ntP, true);
    }

    public final void o8(Function0<Unit> function0) {
        if (!this.LLJI) {
            AbstractC1463010oAt.LLLII.getClass();
            C1463170oB9.LIZ("deleteTimeEffect before apply musicSync");
            i3().LIZJ();
            this.LLJILJIL = true;
        }
        InterfaceC1453200nv4 interfaceC1453200nv4C9 = c9();
        if (interfaceC1453200nv4C9 != null) {
            interfaceC1453200nv4C9.vU(false);
        }
        function0.invoke();
    }

    @Override // X.InterfaceC1463240oBG
    public void LLLZI(boolean z, boolean z2) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAdjustClipsLogicComponent onMusicSyncStart: showLoading = ");
        sbLIZ.append(z);
        sbLIZ.append(", isDefault = ");
        sbLIZ.append(z2);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            y8().LIZLLL(getEditModel(), this.LLLLLILLIL);
        }
        this.LLLLLL.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T9(X.InterfaceC1452170ntP r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1463020oAu.T9(X.0ntP, boolean):void");
    }

    @Override // X.InterfaceC1463240oBG
    public void a(List<? extends VideoSegment> list, boolean z) {
        C0CNO.LIZLLL(0L, new AwS139S0110000_22(this, z, 2));
    }

    public final void oa(AVMusic aVMusic, String str) {
        if (u.LJIJI(str, "EDITOR_PRO", false)) {
            return;
        }
        this.LLJIJIL = false;
        if (aVMusic == null) {
            uV0();
            if (this.LLJ) {
                P5();
                InterfaceC1453200nv4 interfaceC1453200nv4C9 = c9();
                if (interfaceC1453200nv4C9 != null) {
                    interfaceC1453200nv4C9.vU(false);
                }
                C1463050oAx c1463050oAx = this.LLLLJI;
                if (c1463050oAx == null) {
                    c1463050oAx = null;
                }
                C1463050oAx.LJIIJJI(c1463050oAx, null, 0, false, false, 0L, null, null, 510);
                h8();
                if (!this.LLJI) {
                    H2();
                }
                L7();
                return;
            }
            return;
        }
        if (this.LLJ) {
            uV0();
            o8(new AwS423S0200000_22(this, aVMusic, 26));
        } else {
            C15O7.LIZIZ(new ACallableS427S0100000_22(aVMusic, 2), C823050WQl.LIZLLL(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // X.InterfaceC1419190n2D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tG1(boolean r9, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r8.LLJ
            if (r0 != r9) goto L5
            return
        L5:
            r3 = 0
            r5 = 0
            if (r9 == 0) goto L74
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.getEditModel()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r2 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            if (r2 != 0) goto L67
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r2 = r8.LLJJ
            if (r2 != 0) goto L31
            X.0oBg r0 = r8.c3()
            com.ss.android.ugc.aweme.edit.Cut2EditTransferModel r0 = r0.LJ
            if (r0 == 0) goto L55
            java.util.List r0 = r0.getMusicList()
            if (r0 == 0) goto L55
            java.lang.Object r2 = X.C13LP.LJJJLZIJ(r3, r0)
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r2 = (com.ss.android.ugc.aweme.creative.model.music.AVMusic) r2
            if (r2 == 0) goto L55
        L31:
            java.lang.String r0 = X.C1444820nhY.LJFF(r2)
            if (r2 == 0) goto L55
            if (r0 == 0) goto L55
            r8.ra(r0, r2, r3)
            r8.uV0()
            kotlin.jvm.internal.AwS266S0300000_22 r1 = new kotlin.jvm.internal.AwS266S0300000_22
            r0 = 6
            r1.<init>(r8, r2, r10, r0)
            r8.o8(r1)
        L48:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.getEditModel()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.SoundSyncModel r1 = r0.soundSyncModel
            java.lang.String r0 = "video_edit_page"
            r1.soundSyncFrom = r0
            return
        L55:
            X.0FEq r2 = r8.y8()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r8.getEditModel()
            X.0EqM r0 = r8.LLLLLILLIL
            r2.LIZLLL(r1, r0)
            r0 = 1
            r8.tH0(r0, r10)
            goto L48
        L67:
            r8.uV0()
            kotlin.jvm.internal.AwS266S0300000_22 r1 = new kotlin.jvm.internal.AwS266S0300000_22
            r0 = 7
            r1.<init>(r8, r2, r10, r0)
            r8.o8(r1)
            goto L48
        L74:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.getEditModel()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            r8.LLJJ = r0
            r8.h8()
            r8.H2()
            r8.L7()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.invoke(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r8.getEditModel()
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r8.LLJJ
            if (r0 == 0) goto La2
            java.lang.String r4 = r0.getMusicId()
        L9c:
            r6 = r5
            r7 = r5
            X.C0EMB.LIZ(r2, r3, r4, r5, r6, r7)
            return
        La2:
            r4 = r5
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1463020oAu.tG1(boolean, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    @Override // X.C12VU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tH0(final boolean r36, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1463020oAu.tH0(boolean, kotlin.jvm.functions.Function1):void");
    }

    @Override // X.AbstractC1463010oAt
    public void v1(int i, boolean z) {
        E3().v1(i, z);
    }

    public C1463020oAu(C1DRG c1drg, C19A3 c19a3, int i) {
        super(c1drg, c19a3, i);
        this.LLLIIIL = c19a3;
        this.LLLIIL = i;
        this.LLLIILIL = this;
        this.LLLILZ = -1;
        this.LLLILZLLLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
        this.LLLIZZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455500nym.class, null);
        this.LLLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
        this.LLLJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1457250o1b.class, null);
        this.LLLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455730nz9.class, null);
        this.LLLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLLLII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLLLIIIILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455620nyy.class, null);
        this.LLLLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.LLLLIILL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 302));
        this.LLLLIILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
        this.LLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
        this.LLLLILI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413600mtC.class, null);
        this.LLLLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
        this.LLLLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
        this.LLLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19753512Qj.class, null);
        this.LLLLLILLIL = new InterfaceC377040EqM() { // from class: X.0oBF
            @Override // X.InterfaceC377040EqM
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC377040EqM
            public final void LIZ() {
                this.LIZ.y8().LIZ();
                this.LIZ.LLLLLLJ.setValue(Boolean.FALSE);
            }
        };
        this.LLLLLJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 301));
        this.LLLLLL = new MutableLiveData<>();
        this.LLLLLLIL = new C560530Lyd<>();
        this.LLLLLLJ = new MutableLiveData<>();
        this.LLLLLLL = new MutableLiveData<>();
    }

    public static final void Z7(C1463020oAu c1463020oAu, boolean z, boolean z2) {
        boolean z3;
        float selectedTime;
        AudioRecorderParam veAudioRecorderParam;
        InterfaceC1452170ntP interfaceC1452170ntP;
        C1463000oAs c1463000oAsI3 = c1463020oAu.i3();
        if (z && c1463020oAu.getEditModel().getEditorProModel().isAdvancedEditDraft()) {
            z3 = false;
        } else {
            z3 = true;
        }
        C1463000oAs.LJIJJ(c1463000oAsI3, true, null, z3, z2, 2);
        if (!c1463020oAu.LLJ) {
            c1463020oAu.LLJ = true;
            c1463020oAu.getEditModel().setEditMusicSyncMode(true);
            EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT2 = c1463020oAu.T2();
            editAdjustClipsBottomViewModelT2.getClass();
            editAdjustClipsBottomViewModelT2.setStateImmediate(new AwS41S0010000_29(true, 23));
            if (!z) {
                c1463020oAu.Ba(true);
            }
        }
        if (u4.LJIIIIZZ(c1463020oAu.getEditModel()) && (veAudioRecorderParam = c1463020oAu.getEditModel().getVeAudioRecorderParam()) != null && veAudioRecorderParam.getNeedOriginalSound() && (interfaceC1452170ntP = c1463020oAu.LLJILJILJ) != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ != null) {
                C347200DjK.LIZ(c348100DkmLIZIZ.LIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT22 = c1463020oAu.T2();
        editAdjustClipsBottomViewModelT22.getClass();
        editAdjustClipsBottomViewModelT22.setStateImmediate(AFwS273S0000000_29.get$arr$(133));
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT23 = c1463020oAu.T2();
        InterfaceC19767412Vs interfaceC19767412Vs = c1463020oAu.LLJILLL;
        if (interfaceC19767412Vs != null) {
            selectedTime = interfaceC19767412Vs.getSelectedTime();
        } else {
            selectedTime = 0.0f;
        }
        editAdjustClipsBottomViewModelT23.oR2(selectedTime);
    }

    @Override // X.InterfaceC1419190n2D
    public void M9(AVMusic aVMusic, boolean z, Function1<? super Boolean, Unit> function1) {
        boolean zUV0 = uV0();
        if (!this.LLJ && !zUV0) {
            function1.invoke(Boolean.TRUE);
            return;
        }
        T9(this.LLJILJILJ, false);
        if (aVMusic == null) {
            C1463050oAx c1463050oAx = this.LLLLJI;
            if (c1463050oAx == null) {
                c1463050oAx = null;
            }
            C1463050oAx.LJIIJJI(c1463050oAx, null, 0, false, false, 0L, null, null, 510);
            h8();
            if (!this.LLJI) {
                H2();
            }
            L7();
            function1.invoke(Boolean.TRUE);
            return;
        }
        o8(new AwS59S0310000_22(this, (C1463020oAu) aVMusic, (AVMusic) z, (boolean) function1, (Function1<? super Boolean, Unit>) 1));
    }

    public final void ra(String str, AVMusic aVMusic, boolean z) {
        C1454900nxo c1454900nxoLIZ;
        C1452640nuA.LJII(aVMusic, false, getEditModel().creativeModel.musicBuzModel);
        if (C0MT6.LIZ()) {
            o4().Rq(str, aVMusic, true, false, false, z, -1L, false, true, "", false, null);
            return;
        }
        if (str != null && str.length() != 0) {
            c1454900nxoLIZ = C1421090n5H.LIZ(Boolean.FALSE, "edit_page_list", aVMusic, str, null, true, null, -1L, LivePreviewCTASmartDisplayManager.DEFAULT, false);
        } else {
            c1454900nxoLIZ = C1421090n5H.LIZ(Boolean.TRUE, null, null, null, null, true, null, -1L, LivePreviewCTASmartDisplayManager.DEFAULT, false);
        }
        o4().hr(c1454900nxoLIZ);
    }

    @Override // X.InterfaceC1463240oBG
    public void LLILLL(boolean z, boolean z2, boolean z3, boolean z4) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAdjustClipsLogicComponent onMusicSyncFinish: success = ");
        sbLIZ.append(z);
        sbLIZ.append(", showLoading = ");
        sbLIZ.append(z2);
        sbLIZ.append(", isDefault = ");
        sbLIZ.append(z4);
        sbLIZ.append(", replayVideo = ");
        sbLIZ.append(z3);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        C0CNO.LIZLLL(0L, new C1463070oAz(z2, this, z4, z, z3));
    }
}
