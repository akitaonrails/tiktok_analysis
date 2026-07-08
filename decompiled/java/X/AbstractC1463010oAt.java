package X;

import Y.AObjectS245S0100000_22;
import Y.ARunnableS91S0200000_22;
import Y.AUListenerS0S0201001_22;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.EditAdjustClipsState;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS108S0110000_22;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS139S0110000_22;
import kotlin.jvm.internal.AwS18S0002000_29;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import pyl.s;

/* JADX INFO: renamed from: X.0oAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1463010oAt extends AbstractC1664710tQD<InterfaceC1419190n2D> implements InterfaceC1419190n2D, InterfaceC379610EuV, InterfaceC1166920gTK {
    public static final C1463170oB9 LLLII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public static final int LLLIIIIL;
    public final C1DRG LLILLL;
    public final C19A3 LLILZ;
    public final int LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC1452170ntP LLJILJILJ;
    public InterfaceC19767412Vs LLJILLL;
    public AVMusic LLJJ;
    public volatile boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public C1463500oBg LLJLILLLLZIIL;
    public EditAdjustClipsBottomViewModel LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public InterfaceC1463550oBl LLJLLL;
    public CutMultiVideoViewModel LLJZ;
    public VideoEditViewModel LLJZIJLIL;
    public CutVideoSpeedViewModel LLL;
    public C12VT LLLF;
    public final C1463180oBA LLLFF;
    public final C560530Lyd<Unit> LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public final C01GW LLLI;

    public abstract /* synthetic */ boolean C1();

    public final void I7() {
        ArrayList<ImportVideoInfo> importInfoList;
        ArrayList<ImportVideoInfo> arrayListO31 = o31(true, true);
        if (getEditModel().getImportInfoList() == null) {
            getEditModel().setImportInfoList(new ArrayList<>());
        } else if ((!arrayListO31.isEmpty()) && (importInfoList = getEditModel().getImportInfoList()) != null) {
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            while (it2.hasNext()) {
                it2.next();
                it2.remove();
            }
        }
        if (true ^ arrayListO31.isEmpty()) {
            Iterator<ImportVideoInfo> it3 = arrayListO31.iterator();
            while (it3.hasNext()) {
                ArrayList<ImportVideoInfo> importInfoList2 = getEditModel().getImportInfoList();
                if (importInfoList2 != null) {
                    importInfoList2.add(it3.next());
                }
            }
        }
        if (C1463450oBb.LIZ()) {
            return;
        }
        C1416310mxZ.LJJII(getEditModel());
    }

    public abstract /* synthetic */ void LLJJJJ();

    public abstract void LLLLZI(boolean z);

    public void M5() {
    }

    public void N5() {
    }

    public abstract /* synthetic */ void P5();

    public abstract /* synthetic */ void P6(int i);

    public abstract /* synthetic */ void Qh();

    public abstract void R5();

    public void S5() {
    }

    public abstract /* synthetic */ void Tj(int i);

    public void U4() {
    }

    public String W2() {
        return null;
    }

    public abstract /* synthetic */ void W6(int i);

    public boolean W7() {
        return false;
    }

    public abstract /* synthetic */ void a92(boolean z);

    public boolean c0() {
        return false;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public InterfaceC960503pD getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public abstract /* synthetic */ void l0(Pair<Integer, Integer> pair);

    public void m6() {
    }

    public void n5(InterfaceC1452170ntP interfaceC1452170ntP) {
    }

    public abstract /* synthetic */ void u1();

    public abstract /* synthetic */ void v1(int i, boolean z);

    public int z4() {
        return -1;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1463010oAt.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AbstractC1463010oAt.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(AbstractC1463010oAt.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0), new C2217381BqS(AbstractC1463010oAt.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(AbstractC1463010oAt.class, "editNavApi", "getEditNavApi()Lcom/ss/android/ugc/gamora/editor/nav/EditNavigationApi;", 0), new C2217381BqS(AbstractC1463010oAt.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(AbstractC1463010oAt.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0), new C2217381BqS(AbstractC1463010oAt.class, "reuseSurfaceApi", "getReuseSurfaceApi()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0), new C2217381BqS(AbstractC1463010oAt.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C2217381BqS(AbstractC1463010oAt.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0)};
        LLLII = new C1463170oB9();
        LLLIIIIL = 8;
    }

    private final boolean O3() {
        Pair<Long, Long> pair;
        if (this.LLJ == this.LLJJJ) {
            C1463000oAs c1463000oAsI3 = i3();
            Pair<Long, Long> pairF4 = F4();
            MultiEditVideoRecordData multiEditVideoRecordDataLIZLLL = c1463000oAsI3.LIZLLL();
            MultiEditVideoRecordData multiEditVideoRecordData = c1463000oAsI3.LLJILJIL;
            if (multiEditVideoRecordData == null) {
                multiEditVideoRecordData = null;
            }
            if (multiEditVideoRecordDataLIZLLL.isEqualWithDeleteStatus(multiEditVideoRecordData) && ((pair = c1463000oAsI3.LLJL) == null || Intrinsics.LJFF(pair, pairF4))) {
                return false;
            }
        }
        return true;
    }

    private final Handler e4() {
        return (Handler) this.LLLI.getValue();
    }

    private final InterfaceC376040Eok m3() {
        return (InterfaceC376040Eok) this.LLJL.getValue(this, LLLIIII[6]);
    }

    public final InterfaceC1455860nzM B3() {
        return (InterfaceC1455860nzM) this.LLJJJJ.getValue(this, LLLIIII[1]);
    }

    public final void D5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_type", "sound_sync");
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        String creationId = getEditModel().getCreationId();
        if (creationId == null) {
            creationId = "";
        }
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(getEditModel()));
        InterfaceC1452170ntP value = B3().g().getValue();
        c0lab.LIZ(value != null ? value.getDuration() : 0, "content_duration_ms");
        c0lab.LIZ(getEditModel().getVideoCount(), "video_cnt");
        c0lab.LIZ(getEditModel().getPhotoCount(), "pic_cnt");
        c0lab.LJ("sync_mode", this.LLJ ? "sync_on" : "sync_off");
        c0lab.LIZ(C1403850mdT.LJIIIIZZ(getEditModel()), "is_multi_content");
        c0lab.LJ("mix_type", C1403470mcr.LJ(getEditModel()));
        c0lab.LJ("enter_from", "video_sync_page");
        C1402840mbq c1402840mbqLIZLLL = C1B46.LIZLLL(getEditModel());
        if (c1402840mbqLIZLLL != null) {
            c0lab.LJ("sdk_name", c1402840mbqLIZLLL.getSdkNameForServer());
            c0lab.LJ("sdk_version", c1402840mbqLIZLLL.mSdkVersion);
        }
        C20684815ws.LJIILLIIL("enter_clip_edit_page", c0lab.LIZ);
    }

    public final void E5() {
        if (this.LLJJI) {
            return;
        }
        this.LLJJI = true;
        if (!this.LLJJIII) {
            VideoEditViewModel videoEditViewModel = this.LLJZIJLIL;
            if (videoEditViewModel == null) {
                videoEditViewModel = null;
            }
            videoEditViewModel.JQ2(c3().LIZIZ ? 1 : 0);
        }
        VideoEditViewModel videoEditViewModel2 = this.LLJZIJLIL;
        if (videoEditViewModel2 == null) {
            videoEditViewModel2 = null;
        }
        MutableLiveData<Float> mutableLiveData = videoEditViewModel2.LLJJ;
        C12VT c12vt = this.LLLF;
        if (c12vt == null) {
            c12vt = null;
        }
        mutableLiveData.observe(c12vt, new AObjectS245S0100000_22(this, 58));
        VideoEditViewModel videoEditViewModel3 = this.LLJZIJLIL;
        if (videoEditViewModel3 == null) {
            videoEditViewModel3 = null;
        }
        MutableLiveData<Integer> mutableLiveData2 = videoEditViewModel3.LLILLJJLI;
        C12VT c12vt2 = this.LLLF;
        if (c12vt2 == null) {
            c12vt2 = null;
        }
        mutableLiveData2.observe(c12vt2, new AObjectS245S0100000_22(this, 59));
        VideoEditViewModel videoEditViewModel4 = this.LLJZIJLIL;
        if (videoEditViewModel4 == null) {
            videoEditViewModel4 = null;
        }
        videoEditViewModel4.LLJI.observe(this, new AObjectS245S0100000_22(this, 60));
        VideoEditViewModel videoEditViewModel5 = this.LLJZIJLIL;
        if (videoEditViewModel5 == null) {
            videoEditViewModel5 = null;
        }
        videoEditViewModel5.LLIZLLLIL.observe(this, new AObjectS245S0100000_22(this, 61));
        VideoEditViewModel videoEditViewModel6 = this.LLJZIJLIL;
        if (videoEditViewModel6 == null) {
            videoEditViewModel6 = null;
        }
        videoEditViewModel6.LLJIJIL.observe(this, new AObjectS245S0100000_22(this, 62));
        VideoEditViewModel videoEditViewModel7 = this.LLJZIJLIL;
        (videoEditViewModel7 != null ? videoEditViewModel7 : null).LLJILLL.observe(this, new AObjectS245S0100000_22(this, 63));
        BaseJediViewModel.iR2(T2(), this, new C2217381BqS() { // from class: X.0oBi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getSeekDoneEvent();
            }
        }, new AwS601S0100000_22(this, 200));
    }

    public final Pair<Long, Long> F4() {
        C0WIY<Long, Long> playBoundary;
        InterfaceC19767412Vs interfaceC19767412Vs = this.LLJILLL;
        if (interfaceC19767412Vs == null || (playBoundary = interfaceC19767412Vs.getPlayBoundary()) == null) {
            return new Pair<>(0L, Long.valueOf(i3().LJIIIIZZ()));
        }
        Long l = playBoundary.LIZ;
        Long lValueOf = Long.valueOf(l != null ? l.longValue() : 0L);
        Long l2 = playBoundary.LIZIZ;
        return new Pair<>(lValueOf, Long.valueOf(l2 != null ? l2.longValue() : i3().LJIIIIZZ()));
    }

    public final InterfaceC1463550oBl H4() {
        InterfaceC1463550oBl interfaceC1463550oBl = this.LLJLLL;
        if (interfaceC1463550oBl != null) {
            return interfaceC1463550oBl;
        }
        return null;
    }

    public final InterfaceC1452360nti K4() {
        return (InterfaceC1452360nti) this.LLJLIL.getValue(this, LLLIIII[7]);
    }

    public final AbstractC214814194y O4() {
        return (AbstractC214814194y) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLIIII[5]);
    }

    @Override // X.C12VU
    public List<VideoSegment> R8() {
        return (List) this.LLILZLL.getValue();
    }

    public final EditAdjustClipsBottomViewModel T2() {
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModel = this.LLJLL;
        if (editAdjustClipsBottomViewModel != null) {
            return editAdjustClipsBottomViewModel;
        }
        return null;
    }

    public final C386930FFb T4() {
        return (C386930FFb) this.LLIZ.getValue();
    }

    public final C1463500oBg c3() {
        C1463500oBg c1463500oBg = this.LLJLILLLLZIIL;
        if (c1463500oBg != null) {
            return c1463500oBg;
        }
        return null;
    }

    public final InterfaceC19753012Qe d5() {
        return (InterfaceC19753012Qe) this.LLLFZ.getValue(this, LLLIIII[9]);
    }

    public final void d6() {
        String[] strArrAf;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJILJILJ;
        if (interfaceC1452170ntP == null || (strArrAf = interfaceC1452170ntP.af()) == null) {
            return;
        }
        String str = (String) C13LQ.LJJIFFI(strArrAf);
        boolean z = str != null && C2286708xd.LIZJ(str) && C2286708xd.LJIIL(str) > 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetResIfNeeded:");
        sbLIZ.append(z);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C1462980oAq c1462980oAq = i3().LLJI;
            if (!(c1462980oAq instanceof C1462980oAq) || c1462980oAq == null) {
                return;
            }
            c1462980oAq.LIZIZ(null, true, true);
        }
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJJIL.getValue(this, LLLIIII[0]);
    }

    public final C1463000oAs i3() {
        return (C1463000oAs) this.LLIZLLLIL.getValue();
    }

    public final InterfaceC1454960nxu o4() {
        return (InterfaceC1454960nxu) this.LLJLLIL.getValue(this, LLLIIII[8]);
    }

    public final InterfaceC1453430nvR q3() {
        return (InterfaceC1453430nvR) this.LLJJJJJIL.getValue(this, LLLIIII[2]);
    }

    public final InterfaceC2180241AUk v3() {
        return (InterfaceC2180241AUk) this.LLJJL.getValue(this, LLLIIII[4]);
    }

    public final void w2() {
        EffectPointModel timeEffect;
        InterfaceC1452170ntP interfaceC1452170ntP;
        if (this.LLJILJIL) {
            C1463000oAs c1463000oAsI3 = i3();
            if (C1428520nHG.LJJIJIIJIL(c1463000oAsI3.LJFF()) && (timeEffect = c1463000oAsI3.LJFF().getTimeEffect()) != null) {
                LLLII.getClass();
                C1463170oB9.LIZ("real addTimeEffect");
                int startPoint = timeEffect.getStartPoint();
                int endPoint = timeEffect.getEndPoint() - timeEffect.getStartPoint();
                InterfaceC1452170ntP interfaceC1452170ntP2 = c1463000oAsI3.LLJ;
                if (interfaceC1452170ntP2 != null) {
                    C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP2);
                    if (c348100DkmLIZIZ == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (Intrinsics.LJFF(timeEffect.getKey(), "2")) {
                        timeEffect.setUuid(c348100DkmLIZIZ.LIZLLL().LJJIZ(C347570Djv.LIZ(startPoint, endPoint)));
                    } else if (Intrinsics.LJFF(timeEffect.getKey(), "3")) {
                        timeEffect.setUuid(c348100DkmLIZIZ.LIZLLL().LJJIZ(C347570Djv.LIZIZ(startPoint, endPoint)));
                    }
                    interfaceC1452170ntP2.Rf(interfaceC1452170ntP2.getDuration(), VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                }
                if (c1463000oAsI3.LLIZLLLIL && (interfaceC1452170ntP = c1463000oAsI3.LLJ) != null) {
                    interfaceC1452170ntP.removeAllVideoSound();
                }
            }
            this.LLJILJIL = false;
        }
        U5();
    }

    private final void U5() {
        InterfaceC1452170ntP interfaceC1452170ntP;
        if (!getEditModel().getEditorProModel().isAdvancedEditDraft() || (interfaceC1452170ntP = this.LLJILJILJ) == null) {
            return;
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        if (c348100DkmLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        for (NLETrackSlot nLETrackSlot : c348100DkmLIZIZ.LIZ.getModel().getMainTrack().getSortedSlots()) {
            C786410Ut5.L3(C1664590tQ1.LJII(this));
            C357540E0a.LJJIJIIJIL(nLETrackSlot, true);
        }
        c348100DkmLIZIZ.LIZ.commit();
    }

    public final void H2() {
        InterfaceC1456910o13 interfaceC1456910o13LJI;
        int i;
        C1463000oAs c1463000oAsI3 = i3();
        Pair<Long, Long> pairF4 = F4();
        InterfaceC19767412Vs interfaceC19767412Vs = this.LLJILLL;
        Long lValueOf = Long.valueOf(interfaceC19767412Vs != null ? interfaceC19767412Vs.getLeftSeekingValue() : 0L);
        InterfaceC19767412Vs interfaceC19767412Vs2 = this.LLJILLL;
        Pair<Long, Long> pair = new Pair<>(lValueOf, Long.valueOf(interfaceC19767412Vs2 != null ? interfaceC19767412Vs2.getRightSeekingValue() : 0L));
        c1463000oAsI3.getClass();
        C1463170oB9 c1463170oB9 = LLLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveWork,isMusicSyncMode:");
        sbLIZ.append(c1463000oAsI3.LLIZLLLIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1463170oB9.getClass();
        C1463170oB9.LIZ(strLIZIZ);
        c1463000oAsI3.LLJLILLLLZIIL = false;
        c1463000oAsI3.LLJL = pairF4;
        c1463000oAsI3.LLJLIL = pair;
        ArrayList<TimeSpeedModelExtension> arrayList = c1463000oAsI3.LLJJIII;
        c1463000oAsI3.LLJJ = arrayList != null ? new ArrayList<>(arrayList) : null;
        if (c1463000oAsI3.LJFF().getEditorProModel().isAdvancedEditDraft()) {
            InterfaceC1452170ntP interfaceC1452170ntP = c1463000oAsI3.LLJ;
            if (interfaceC1452170ntP != null) {
                C0F1Z c0f1z = C0F1Z.LIZ;
                ArrayList<TimeSpeedModelExtension> arrayList2 = c1463000oAsI3.LLJJIII;
                c0f1z.getClass();
                C0F1Z.LJIIIIZZ = arrayList2;
                List<MultiEditVideoSegmentRecordData> list = c1463000oAsI3.LIZLLL().segmentDataList;
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
                if (c348100DkmLIZIZ == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                c1463000oAsI3.LLJJIII = C0F1Z.LIZIZ(c348100DkmLIZIZ.LIZ.getModel().getMainTrack(), list);
            }
            MultiEditVideoStatusRecordData multiEditVideoRecordData = c1463000oAsI3.LJFF().getMultiEditVideoRecordData();
            if (multiEditVideoRecordData != null) {
                ArrayList<TimeSpeedModelExtension> arrayList3 = c1463000oAsI3.LLJJIII;
                multiEditVideoRecordData.editSegments = arrayList3 != null ? new ArrayList<>(arrayList3) : null;
            }
        }
        c1463000oAsI3.LJIJJLI(pairF4);
        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = c1463000oAsI3.LJFF().getMultiEditVideoRecordData();
        if (multiEditVideoRecordData2 != null) {
            multiEditVideoRecordData2.isMultiEditRetake = false;
        }
        MultiEditVideoStatusRecordData multiEditVideoRecordData3 = c1463000oAsI3.LJFF().getMultiEditVideoRecordData();
        if (multiEditVideoRecordData3 != null) {
            multiEditVideoRecordData3.adjustClipsState = new EditAdjustClipsState(c1463000oAsI3.LLJL, pair);
        }
        if (c1463000oAsI3.LJFF().mIsFromDraft) {
            c1463000oAsI3.LJFF().getFromCut();
        }
        c1463000oAsI3.LJFF().setPreviewInfo(new C554830LpR(c1463000oAsI3.LJFF().getPreviewInfo().getPreviewWidth(), c1463000oAsI3.LJFF().getPreviewInfo().getPreviewHeight(), true, c1463000oAsI3.LJFF().getPreviewInfo().getReverseAudioArray(), c1463000oAsI3.LJFF().getPreviewInfo().getReverseVideoArray(), 12).LIZ(c1463000oAsI3.LIZLLL()));
        if (c1463000oAsI3.LJFF().getFromCut()) {
            VideoPublishEditModel videoPublishEditModelLJFF = c1463000oAsI3.LJFF();
            List<EditVideoSegment> videoList = c1463000oAsI3.LJFF().getPreviewInfo().getVideoList();
            if ((videoList instanceof Collection) && videoList.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (EditVideoSegment editVideoSegment : videoList) {
                    C533730KwV c533730KwV = C533730KwV.LIZ;
                    String videoPath = editVideoSegment.getVideoPath();
                    c533730KwV.getClass();
                    if (C533730KwV.LJIIJ(videoPath) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            videoPublishEditModelLJFF.setPhotoCount(i);
            c1463000oAsI3.LJFF().setVideoCount(c1463000oAsI3.LJFF().getPreviewInfo().getVideoList().size() - c1463000oAsI3.LJFF().getPhotoCount());
        }
        if (C0EYG.LIZ(c1463000oAsI3.LJFF()) && (interfaceC1456910o13LJI = c1463000oAsI3.LJI()) != null && interfaceC1456910o13LJI.sj1()) {
            InterfaceC1456910o13 interfaceC1456910o13LJI2 = c1463000oAsI3.LJI();
            if (interfaceC1456910o13LJI2 != null) {
                interfaceC1456910o13LJI2.n80();
            }
            InterfaceC1456910o13 interfaceC1456910o13LJI3 = c1463000oAsI3.LJI();
            if (interfaceC1456910o13LJI3 != null) {
                InterfaceC1452170ntP interfaceC1452170ntP2 = c1463000oAsI3.LLJ;
                interfaceC1456910o13LJI3.Dt1(interfaceC1452170ntP2 != null ? C352130DrH.LIZ(interfaceC1452170ntP2) : null);
            }
        }
        w2();
        C1463000oAs c1463000oAsI32 = i3();
        InterfaceC1452170ntP interfaceC1452170ntP3 = this.LLJILJILJ;
        c1463000oAsI32.LJIILLIIL(0, interfaceC1452170ntP3 != null ? interfaceC1452170ntP3.getDuration() : -1);
        if (!this.LLJIJIL) {
            InterfaceC1452170ntP interfaceC1452170ntP4 = this.LLJILJILJ;
            if (interfaceC1452170ntP4 != null) {
                int duration = interfaceC1452170ntP4.getDuration();
                getEditModel().setVideoLength(duration);
                P6(duration);
                W6(duration);
                Tj(duration);
                l0(new Pair<>(Integer.valueOf(interfaceC1452170ntP4.mo51if()), Integer.valueOf(duration)));
                v1(duration, true);
            }
            N5();
            Qh();
            u1();
        }
        this.LLLFFI.LJIIJ(Unit.LIZ);
        if (getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            H4().LIZLLL(-1L, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, true);
        }
        this.LLJIJIL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K6() {
        /*
            r5 = this;
            X.0oAs r2 = r5.i3()
            r1 = 0
            r0 = 1
            r2.LIZ(r1, r0)
            boolean r1 = r5.LLJ
            boolean r0 = r5.LLJJJ
            if (r1 == r0) goto L39
            r5.Lu2(r0)
            if (r0 != 0) goto L17
        L14:
            r5.w2()
        L17:
            X.0oAs r2 = r5.i3()
            X.0ntP r0 = r5.LLJILJILJ
            if (r0 == 0) goto L37
            int r1 = r0.getDuration()
        L23:
            r0 = 0
            r2.LJIILLIIL(r0, r1)
            r5.N5()
            X.0oBl r4 = r5.H4()
            r2 = -1
            com.ss.android.vesdk.VEEditor$SEEK_MODE r1 = com.ss.android.vesdk.VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek
            r0 = 1
            r4.LIZLLL(r2, r1, r0)
            return
        L37:
            r1 = -1
            goto L23
        L39:
            boolean r0 = r5.LLJ
            if (r0 == 0) goto L14
            r5.M5()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1463010oAt.K6():void");
    }

    public final void L7() {
        MultiEditVideoRecordData multiEditVideoRecordData;
        getEditModel().copyMultiEditMusicInfo();
        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = getEditModel().getMultiEditVideoRecordData();
        if (multiEditVideoRecordData2 == null || (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) == null) {
            return;
        }
        if (this.LLJ && multiEditVideoRecordData.musicPath == null) {
            multiEditVideoRecordData.musicPath = W2();
        }
        multiEditVideoRecordData.musicDuration = C141Q.LIZIZ(getEditModel().getCurMusicServerLength(), multiEditVideoRecordData.musicPath);
    }

    public void Xi() {
        LiveEvent<Unit> liveEventDu1;
        C0ETY c0ety;
        Class<InterfaceC376040Eok> cls;
        AwS601S0100000_22 awS601S0100000_22;
        B3().g().observe(this, new AObjectS245S0100000_22(this, 54));
        B3().oG2().observe(this, new AObjectS245S0100000_22(this, 55));
        BaseJediViewModel.iR2(T2(), this, new C2217381BqS() { // from class: X.0oBf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getScale();
            }
        }, new AwS601S0100000_22(this, 204));
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) this.LLILLL.LJII(C0ETY.class, null)).Sd(InterfaceC376040Eok.class, new AwS601S0100000_22(this, 203));
            return;
        }
        C1DRG c1drg = this.LLILLL;
        VideoPublishEditModel editModel = getEditModel();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
            c0ety = (C0ETY) c1drg.LJII(C0ETY.class, null);
            cls = InterfaceC376040Eok.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 201);
        } else {
            if (!C365940EWi.LIZLLL(editModel)) {
                InterfaceC376040Eok interfaceC376040Eok = (InterfaceC376040Eok) ((C05YF) c1drg.LJIIL(null, InterfaceC376040Eok.class));
                if (interfaceC376040Eok == null || (liveEventDu1 = interfaceC376040Eok.du1()) == null) {
                    return;
                }
                liveEventDu1.LIZ(this, new AObjectS245S0100000_22(this, 57));
                return;
            }
            c0ety = (C0ETY) c1drg.LJII(C0ETY.class, null);
            cls = InterfaceC376040Eok.class;
            awS601S0100000_22 = new AwS601S0100000_22(this, 202);
        }
        c0ety.Sd(cls, awS601S0100000_22);
    }

    @Override // X.C12VU
    public void Z91() {
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewStateNR2 = T2().nR2();
        L6(new AwS423S0200000_22(this, editAdjustClipsBottomViewStateNR2, 22));
        C579640MoM c579640MoM = C579640MoM.LIZ;
        int currentEditIndex = editAdjustClipsBottomViewStateNR2.getCurrentEditIndex();
        c579640MoM.getClass();
        C0LAB c0labLIZ = C579640MoM.LIZ();
        c0labLIZ.LJ("order", String.valueOf(currentEditIndex + 1));
        C20684815ws.LJIILLIIL("reshoot_video_section", c0labLIZ.LIZ);
    }

    @Override // X.C12VU
    public void aQ2() {
        int currentEditOriginIndex = T2().nR2().getCurrentEditOriginIndex();
        VideoEditViewModel videoEditViewModel = this.LLJZIJLIL;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(videoEditViewModel.zQ2(), currentEditOriginIndex);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LLJZ;
        (cutMultiVideoViewModel != null ? cutMultiVideoViewModel : null).LLIZ.setValue(videoSegment);
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT2 = T2();
        editAdjustClipsBottomViewModelT2.getClass();
        editAdjustClipsBottomViewModelT2.setStateImmediate(new AwS135S0101000_29(currentEditOriginIndex, videoSegment, 4));
    }

    public void k5() {
        C1DRG c1drgLJIIIIZZ = C1664600tQ2.LJIIIIZZ(this);
        if (c1drgLJIIIIZZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        S6((C1463500oBg) c1drgLJIIIIZZ.LJII(C1463500oBg.class, null));
        N6((EditAdjustClipsBottomViewModel) c1drgLJIIIIZZ.LJII(EditAdjustClipsBottomViewModel.class, null));
        this.LLJZ = (CutMultiVideoViewModel) c1drgLJIIIIZZ.LJII(CutMultiVideoViewModel.class, null);
        this.LLJZIJLIL = (VideoEditViewModel) c1drgLJIIIIZZ.LJII(VideoEditViewModel.class, null);
        this.LLL = (CutVideoSpeedViewModel) c1drgLJIIIIZZ.LJII(CutVideoSpeedViewModel.class, null);
        o7((InterfaceC1463550oBl) c1drgLJIIIIZZ.LJII(InterfaceC1463550oBl.class, null));
    }

    @Override // X.C12VU
    public void le2() {
        if (C1462990oAr.LIZ(c3())) {
            O4().finish();
        } else {
            B3().vK2();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        R5();
        k5();
        Xi();
        i3().LJIILIIL();
    }

    @Override // X.AbstractC1664710tQD, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C386930FFb c386930FFbT4 = T4();
        c386930FFbT4.LIZ.evictAll();
        ((ArrayList) c386930FFbT4.LIZIZ).clear();
        m6();
    }

    @Override // X.InterfaceC1419190n2D
    public void pW1() {
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        if (!getEditModel().isMultiVideoEdit() || !getEditModel().isRetakeVideo() || getEditModel().getMultiEditVideoRecordData() == null || (multiEditVideoRecordData = getEditModel().getMultiEditVideoRecordData()) == null) {
            return;
        }
        this.LLJJIII = !multiEditVideoRecordData.segmentSizeChange && multiEditVideoRecordData.currentEditIndex >= 0;
        ET(false, new AwS423S0200000_22(this, multiEditVideoRecordData, 24));
    }

    public final InterfaceC1452170ntP H3() {
        return this.LLJILJILJ;
    }

    public final boolean LJLILLLLZI() {
        return this.LLJI;
    }

    public final boolean P4() {
        return this.LLJILJIL;
    }

    public final AVMusic Q3() {
        return this.LLJJ;
    }

    public final InterfaceC19767412Vs Z4() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.InterfaceC1419190n2D
    public LiveEvent<Unit> ko2() {
        return this.LLLFFI;
    }

    public final boolean v5() {
        return this.LLJ;
    }

    public final boolean x5() {
        return this.LLJIJIL;
    }

    public static final InterfaceC1461350o8D E3(AbstractC1463010oAt abstractC1463010oAt) {
        return (InterfaceC1461350o8D) abstractC1463010oAt.LLJJJJLIIL.getValue(abstractC1463010oAt, LLLIIII[3]);
    }

    private final void G2(final Function0<Unit> function0) {
        final boolean zLJFF;
        final boolean z;
        final boolean zHasRecord = getEditModel().hasRecord();
        EffectPointModel timeEffect = getEditModel().getTimeEffect();
        if (timeEffect == null) {
            zLJFF = false;
        } else {
            zLJFF = Intrinsics.LJFF(timeEffect.getKey(), "1");
        }
        final boolean zC0 = c0();
        if (!getEditModel().creativeModel.voiceConversionModel.hasDubVoiceConversion && !getEditModel().creativeModel.voiceConversionModel.hasOriginVoiceConversion) {
            z = false;
        } else {
            z = true;
        }
        if (!zLJFF && !zHasRecord && !zC0 && !z) {
            function0.invoke();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (zLJFF) {
            arrayList.add(C1664590tQ1.LJII(this).getString(2131825212));
        }
        if (zHasRecord) {
            arrayList.add(C1664590tQ1.LJII(this).getString(2131825213));
        }
        if (zC0) {
            arrayList.add(C1664590tQ1.LJII(this).getString(2131825214));
        }
        if (z) {
            arrayList.add(C1664590tQ1.LJII(this).getString(2131826991));
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        C21566919al c21566919al = new C21566919al(C1664590tQ1.LJII(this));
        c21566919al.LIZJ = C1664590tQ1.LJII(this).getString(2131825215, strLJJLIIIJ);
        c21566919al.LJII(R.string.f1_, null, false);
        c21566919al.LJIIJ(R.string.fte, new DialogInterface.OnClickListener() { // from class: X.0oB6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                InterfaceC19753012Qe interfaceC19753012QeD5;
                if (zLJFF) {
                    this.P5();
                }
                if (zC0) {
                    this.U4();
                }
                if (this.getEditModel().isDisableOriginalSound()) {
                    this.getEditModel().resetVolume();
                }
                if (z && (interfaceC19753012QeD5 = this.d5()) != null) {
                    interfaceC19753012QeD5.dF1();
                }
                if (zHasRecord) {
                    AudioRecorderParam veAudioRecorderParam = this.getEditModel().getVeAudioRecorderParam();
                    if (veAudioRecorderParam != null) {
                        AbstractC1463010oAt abstractC1463010oAt = this;
                        veAudioRecorderParam.setNeedDel(true);
                        C1453010nul.LIZ(abstractC1463010oAt.B3(), veAudioRecorderParam);
                    }
                    this.LLJJJJ();
                }
                function0.invoke();
            }
        }, false);
        new C21566519ah(c21566919al).LIZLLL();
    }

    private final void L6(Function0<Unit> function0) {
        if ((C1428520nHG.LJJJJI(getEditModel()) || C1()) && !u4.LJIIIIZZ(getEditModel())) {
            C1463210oBD c1463210oBD = C1463210oBD.LIZ;
            Activity activityLJII = C1664590tQ1.LJII(this);
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(function0, (Function0<Boolean>) 296);
            c1463210oBD.getClass();
            C1463210oBD.LIZ(activityLJII, awS566S0100000_22);
            return;
        }
        function0.invoke();
    }

    @Override // X.InterfaceC1419190n2D
    public void LJJJJLL(boolean z) {
        H5(z, new AwS108S0110000_22(this, z, 3));
    }

    public final void N6(EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModel) {
        this.LLJLL = editAdjustClipsBottomViewModel;
    }

    @Override // X.C12VU
    public void NU0(InterfaceC19767412Vs interfaceC19767412Vs) {
        this.LLJILLL = interfaceC19767412Vs;
    }

    public final void S6(C1463500oBg c1463500oBg) {
        this.LLJLILLLLZIIL = c1463500oBg;
    }

    public final void T6(InterfaceC1452170ntP interfaceC1452170ntP) {
        this.LLJILJILJ = interfaceC1452170ntP;
    }

    @Override // X.C12VU
    public void ax1(boolean z) {
        float currentSpeed;
        CutVideoSpeedViewModel cutVideoSpeedViewModel = null;
        if (z) {
            CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.LLL;
            if (cutVideoSpeedViewModel2 == null) {
                cutVideoSpeedViewModel2 = null;
            }
            InterfaceC19767412Vs interfaceC19767412Vs = this.LLJILLL;
            if (interfaceC19767412Vs != null) {
                currentSpeed = interfaceC19767412Vs.getCurrentSpeed();
            } else {
                currentSpeed = 1.0f;
            }
            cutVideoSpeedViewModel2.lR2(s.fromValue(currentSpeed));
        }
        CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.LLL;
        if (cutVideoSpeedViewModel3 != null) {
            cutVideoSpeedViewModel = cutVideoSpeedViewModel3;
        }
        cutVideoSpeedViewModel.setVisible(z);
    }

    public final void d7(AVMusic aVMusic) {
        this.LLJJ = aVMusic;
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0oBh] */
    @Override // X.C12VU
    public void k10(final List<? extends VideoSegment> list) {
        int size;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = c3().LIZLLL;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list2 = multiEditVideoRecordData.segmentDataList) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        int i = 0;
        for (VideoSegment videoSegment : list) {
            int i2 = i + 1;
            if (i >= 0) {
                videoSegment.videoIndex = i + size;
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1463000oAs c1463000oAsI3 = i3();
        c1463000oAsI3.getClass();
        C1463170oB9 c1463170oB9 = LLLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insertVideoList,size:");
        sbLIZ.append(list.size());
        sbLIZ.append(",isMusicSyncMode:");
        sbLIZ.append(c1463000oAsI3.LLIZLLLIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1463170oB9.getClass();
        C1463170oB9.LIZ(strLIZIZ);
        C1462980oAq c1462980oAq = c1463000oAsI3.LLJI;
        if (c1462980oAq != null && C1462990oAr.LIZ(c1462980oAq.LIZIZ)) {
            MultiEditVideoRecordData multiEditVideoRecordDataLIZLLL = c1462980oAq.LIZLLL();
            if (!list.isEmpty()) {
                if (multiEditVideoRecordDataLIZLLL.segmentDataList == null) {
                    multiEditVideoRecordDataLIZLLL.setThreadSafeSegmentDataList(new ArrayList());
                }
                for (VideoSegment videoSegment2 : list) {
                    List<MultiEditVideoSegmentRecordData> list3 = multiEditVideoRecordDataLIZLLL.segmentDataList;
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
                    multiEditVideoSegmentRecordData.videoPath = videoSegment2.LJFF(false);
                    multiEditVideoSegmentRecordData.width = videoSegment2.width;
                    multiEditVideoSegmentRecordData.height = videoSegment2.height;
                    multiEditVideoSegmentRecordData.setVideoSpeed(videoSegment2.LJI());
                    multiEditVideoSegmentRecordData.rotate = videoSegment2.rotate;
                    multiEditVideoSegmentRecordData.videoLength = videoSegment2.duration * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    multiEditVideoSegmentRecordData.setStartTime(videoSegment2.LJII());
                    multiEditVideoSegmentRecordData.setEndTime(videoSegment2.LIZLLL());
                    multiEditVideoSegmentRecordData.enable = !videoSegment2.isDeleted;
                    multiEditVideoSegmentRecordData.videoKey = videoSegment2.videoIndex;
                    list3.add(multiEditVideoSegmentRecordData);
                }
            }
        }
        if (c1463000oAsI3.LLIZLLLIL) {
            final C1463050oAx c1463050oAxLJIIIZ = c1463000oAsI3.LJIIIZ();
            if (c1463050oAxLJIIIZ != null) {
                final int size2 = c1463000oAsI3.LIZLLL().segmentDataList.size();
                final C1463030oAv c1463030oAvLJII = c1463050oAxLJIIIZ.LJII();
                final ?? r3 = new InterfaceC358010E1v() { // from class: X.0oBh
                    @Override // X.InterfaceC358010E1v
                    public final void onFailed() {
                    }

                    @Override // X.InterfaceC358010E1v
                    public final void LIZ(int i3) {
                        c1463050oAxLJIIIZ.LIZIZ.LLILLL(true, true, true, false);
                        c1463050oAxLJIIIZ.LIZIZ.LLLLLLJ();
                    }
                };
                if (c1463030oAvLJII.LIZ != null && !C580130Mp9.LIZ(list)) {
                    C15O7.LIZJ(new Callable() { // from class: X.0Mgb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1C7U.LIZ("StickPointVideoPresenter@671e.addVideoList$1");
                            int size3 = size2 - list.size();
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (VideoSegment videoSegment3 : list) {
                                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                                String strLJFF = videoSegment3.LJFF(false);
                                strLJFF.toString();
                                vEClipSourceParam.clipFilePath = strLJFF;
                                vEClipSourceParam.clipWidth = videoSegment3.width;
                                vEClipSourceParam.clipHeight = videoSegment3.height;
                                arrayList.add(vEClipSourceParam);
                                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                                vEClipTimelineParam.speed = s.NORMAL.value();
                                vEClipTimelineParam.trimIn = 0;
                                vEClipTimelineParam.trimOut = (int) videoSegment3.duration;
                                arrayList2.add(vEClipTimelineParam);
                            }
                            int iGg = c1463030oAvLJII.LIZ.gg(size3, arrayList, arrayList2);
                            if (iGg >= 0 && (iGg = c1463030oAvLJII.LIZ.updateAlgorithmFromNormal()) >= 0) {
                                iGg = c1463030oAvLJII.LIZ.genRandomSolve();
                            }
                            Integer numValueOf = Integer.valueOf(iGg);
                            C1C7U.LIZIZ("StickPointVideoPresenter@671e.addVideoList$1");
                            return numValueOf;
                        }
                    }).LJ(new InterfaceC2385309Wh() { // from class: X.0oB7
                        @Override // X.InterfaceC2385309Wh
                        public final Object then(C15O7<Integer> c15o7) {
                            C1C7U.LIZ("StickPointVideoPresenter@671e.addVideoList$2");
                            if (c15o7 != null && c15o7.LJIIL() != null) {
                                if (c15o7.LJIIL().intValue() == 0) {
                                    c1463030oAvLJII.LJI(1, size2 - list.size(), false);
                                    InterfaceC358010E1v interfaceC358010E1v = r3;
                                    if (interfaceC358010E1v != null) {
                                        interfaceC358010E1v.LIZ(c15o7.LJIIL().intValue());
                                    }
                                } else {
                                    InterfaceC358010E1v interfaceC358010E1v2 = r3;
                                    if (interfaceC358010E1v2 != null) {
                                        interfaceC358010E1v2.onFailed();
                                    }
                                }
                            } else {
                                InterfaceC358010E1v interfaceC358010E1v3 = r3;
                                if (interfaceC358010E1v3 != null) {
                                    interfaceC358010E1v3.onFailed();
                                }
                            }
                            C1C7U.LIZIZ("StickPointVideoPresenter@671e.addVideoList$2");
                            return null;
                        }
                    }, C15O7.LJIIIIZZ, null);
                }
            }
        } else {
            C1462980oAq c1462980oAq2 = c1463000oAsI3.LLJI;
            if (c1462980oAq2 != null) {
                int size3 = c1463000oAsI3.LIZLLL().segmentDataList.size();
                if (!list.isEmpty() && C1462990oAr.LIZ(c1462980oAq2.LIZIZ)) {
                    int size4 = list.size();
                    ArrayList arrayList = new ArrayList(size4);
                    ArrayList arrayList2 = new ArrayList(size4);
                    for (VideoSegment videoSegment3 : list) {
                        VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                        vEClipSourceParam.clipFilePath = videoSegment3.LJFF(false);
                        vEClipSourceParam.clipWidth = videoSegment3.width;
                        vEClipSourceParam.clipHeight = videoSegment3.height;
                        arrayList.add(vEClipSourceParam);
                        VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                        vEClipTimelineParam.speed = s.NORMAL.value();
                        vEClipTimelineParam.trimIn = 0;
                        vEClipTimelineParam.trimOut = (int) videoSegment3.duration;
                        arrayList2.add(vEClipTimelineParam);
                    }
                    c1462980oAq2.LIZ.gg(size3 - list.size(), arrayList, arrayList2);
                    InterfaceC1452170ntP interfaceC1452170ntP = c1462980oAq2.LIZ;
                    interfaceC1452170ntP.Rf(interfaceC1452170ntP.getDuration(), VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                }
            }
        }
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT2 = T2();
        editAdjustClipsBottomViewModelT2.getClass();
        editAdjustClipsBottomViewModelT2.setStateImmediate(new AwS608S0100000_29(list, (List<SingleImageData>) 222));
    }

    public final void k7(boolean z) {
        this.LLJ = z;
    }

    public final void n7(boolean z) {
        this.LLJI = z;
    }

    public final void o7(InterfaceC1463550oBl interfaceC1463550oBl) {
        this.LLJLLL = interfaceC1463550oBl;
    }

    public final void s7(boolean z) {
        this.LLJIJIL = z;
    }

    public final void t5(InterfaceC1452170ntP interfaceC1452170ntP) {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            C786410Ut5.LJJZZIII(e4(), new ARunnableS91S0200000_22(this, interfaceC1452170ntP, 11));
        } else {
            n5(interfaceC1452170ntP);
        }
    }

    public final void u7(boolean z) {
        this.LLJILJIL = z;
    }

    public final void y7(InterfaceC19767412Vs interfaceC19767412Vs) {
        this.LLJILLL = interfaceC19767412Vs;
    }

    private final void H5(boolean z, Function1<? super Boolean, Unit> function1) {
        boolean zO3 = O3();
        if (!z && zO3) {
            C1463210oBD c1463210oBD = C1463210oBD.LIZ;
            Activity activityLJII = C1664590tQ1.LJII(this);
            AwS139S0110000_22 awS139S0110000_22 = new AwS139S0110000_22((Function1) function1, (Function1<? super Boolean, Unit>) zO3, true);
            c1463210oBD.getClass();
            C1463210oBD.LIZ(activityLJII, awS139S0110000_22);
            return;
        }
        function1.invoke(Boolean.valueOf(zO3));
    }

    private final void u6(boolean z, int i) {
        if (C1462990oAr.LIZ(c3())) {
            if (this.LLJ) {
                return;
            }
            LLLLZI(!z);
            return;
        }
        if (z) {
            long jLIZLLL = 0;
            int i2 = 0;
            for (VideoSegment videoSegment : R8()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    VideoSegment videoSegment2 = videoSegment;
                    if (!videoSegment2.isDeleted && i2 < i) {
                        jLIZLLL += videoSegment2.LIZLLL() - videoSegment2.LJII();
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            VideoSegment videoSegment3 = (VideoSegment) ListProtector.get(R8(), i);
            i3().LJIJI((int) jLIZLLL, 0, (int) (videoSegment3.LIZLLL() - videoSegment3.LJII()));
            return;
        }
        i3().LJIILLIIL(0, -1);
    }

    @Override // X.InterfaceC1419190n2D
    public void ET(boolean z, Function0<Unit> function0) {
        G2(new AwS423S0200000_22(this, (AbstractC1463010oAt) function0, (Function0<Unit>) 23));
    }

    @Override // X.C12VU
    public void Z52(int i, int i2) {
        float selectedTime;
        float f;
        float musicVolume;
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(R8(), i2);
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.LLL;
        if (cutVideoSpeedViewModel == null) {
            cutVideoSpeedViewModel = null;
        }
        cutVideoSpeedViewModel.lR2(s.fromValue(videoSegment.LJI()));
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT2 = T2();
        editAdjustClipsBottomViewModelT2.getClass();
        editAdjustClipsBottomViewModelT2.setStateImmediate(new AwS18S0002000_29(i, i2, 0));
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModelT22 = T2();
        InterfaceC19767412Vs interfaceC19767412Vs = this.LLJILLL;
        if (interfaceC19767412Vs != null) {
            selectedTime = interfaceC19767412Vs.getSelectedTime();
        } else {
            selectedTime = 0.0f;
        }
        editAdjustClipsBottomViewModelT22.oR2(selectedTime);
        C1463000oAs c1463000oAsI3 = i3();
        c1463000oAsI3.getClass();
        C1463170oB9 c1463170oB9 = LLLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switch2SingleEdit,index:");
        sbLIZ.append(i);
        sbLIZ.append(",originIndex:");
        sbLIZ.append(i2);
        sbLIZ.append(",isMusicSyncMode:");
        sbLIZ.append(c1463000oAsI3.LLIZLLLIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1463170oB9.getClass();
        C1463170oB9.LIZ(strLIZIZ);
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C13LP.LJJJLZIJ(i2, c1463000oAsI3.LIZLLL().segmentDataList);
        if (multiEditVideoSegmentRecordData != null) {
            f = multiEditVideoSegmentRecordData.scale;
        } else {
            f = 0.0f;
        }
        c1463000oAsI3.LLJJLIIIJLLLLLLLZ = f;
        c1463000oAsI3.LLJIJIL = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        VideoSegment videoSegment2 = (VideoSegment) ListProtector.get(c1463000oAsI3.LJII(), i2);
        float fLJI = 1.0f;
        if (c1463000oAsI3.LLIZLLLIL) {
            c1463000oAsI3.LJIIL().LIZJ(videoSegment2, true);
            C1463050oAx c1463050oAxLJIIIZ = c1463000oAsI3.LJIIIZ();
            if (c1463050oAxLJIIIZ != null) {
                c1463050oAxLJIIIZ.LJII().LJII = i2;
                VideoPublishEditModel videoPublishEditModel = c1463050oAxLJIIIZ.LJIIJ;
                if (videoPublishEditModel != null) {
                    musicVolume = videoPublishEditModel.getMusicVolume();
                } else {
                    musicVolume = 1.0f;
                }
                c1463050oAxLJIIIZ.LJII().LIZIZ(musicVolume);
            }
        }
        if (videoSegment2.LJI() != 0.0f) {
            fLJI = videoSegment2.LJI();
        }
        C1462980oAq c1462980oAq = c1463000oAsI3.LLJI;
        if (c1462980oAq != null) {
            c1462980oAq.LJFF = i2;
            if (C1462990oAr.LIZ(c1462980oAq.LIZIZ)) {
                if (C301400Bre.LIZ()) {
                    C1463750oC5 c1463750oC5LIZJ = C1462980oAq.LIZJ(c1462980oAq.LIZLLL(), true, c1462980oAq.LIZLLL, c1462980oAq.LJ, i2);
                    C1463700oC0.LIZ(c1463750oC5LIZJ, videoSegment2);
                    c1462980oAq.LJII = c1463750oC5LIZJ;
                    c1462980oAq.LIZ.Lf(c1463750oC5LIZJ, false);
                    c1462980oAq.LJ((int) (videoSegment2.LJII() * videoSegment2.LJI()), (int) (videoSegment2.LIZLLL() * videoSegment2.LJI()));
                } else {
                    VETimelineParams vETimelineParamsLIZLLL = C574800MgY.LIZLLL(c1462980oAq.LIZLLL());
                    C574790MgX.LIZLLL(vETimelineParamsLIZLLL, i2, videoSegment2);
                    c1462980oAq.LJI = vETimelineParamsLIZLLL;
                    c1462980oAq.LIZ.cf(vETimelineParamsLIZLLL, (int) videoSegment2.LJII(), (int) videoSegment2.LIZLLL());
                }
            } else {
                C1463750oC5 c1463750oC5LIZJ2 = C1462980oAq.LIZJ(c1462980oAq.LIZLLL(), false, c1462980oAq.LIZLLL, c1462980oAq.LJ, i2);
                C1463700oC0.LIZ(c1463750oC5LIZJ2, videoSegment2);
                c1462980oAq.LJII = c1463750oC5LIZJ2;
                c1462980oAq.LIZ.Lf(c1463750oC5LIZJ2, false);
                c1462980oAq.LJ((int) (videoSegment2.LJII() * videoSegment2.LJI()), (int) (videoSegment2.LIZLLL() * videoSegment2.LJI()));
            }
        }
        c1463000oAsI3.LJIIJ().LIZLLL((long) (videoSegment2.LJII() / fLJI), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, true);
        u6(true, i2);
    }

    @Override // X.C12VU
    public void lY(final int i, final int i2) {
        float f;
        float f2;
        float f3;
        C1463670oBx c1463670oBx;
        VecNLETrackSPtr tracks;
        NLETrack next;
        VecNLETrackSlotSPtr sortedSlots;
        this.LLJJIJI = true;
        final C1463000oAs c1463000oAsI3 = i3();
        final Pair<Long, Long> pairF4 = F4();
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(c1463000oAsI3.LJII(), i);
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C13LP.LJJJLZIJ(i, c1463000oAsI3.LIZLLL().segmentDataList);
        int i3 = 0;
        if (multiEditVideoSegmentRecordData != null) {
            if (multiEditVideoSegmentRecordData.scale == 0.0f) {
                multiEditVideoSegmentRecordData.scale = c1463000oAsI3.LLILZIL;
            }
            f = multiEditVideoSegmentRecordData.scale;
        } else {
            f = c1463000oAsI3.LLILZIL;
        }
        int i4 = videoSegment.width;
        int i5 = videoSegment.height;
        C817403Hg c817403Hg = new C817403Hg();
        c817403Hg.element = f;
        if (i2 % 180 == 0) {
            f2 = (i4 * f) / i5;
        } else {
            c817403Hg.element = (i4 * f) / i5;
            f2 = f;
        }
        c1463000oAsI3.LLIZ = f2;
        if (C301400Bre.LIZ()) {
            long jLIZIZ = c1463000oAsI3.LJIIJ().LIZIZ();
            ((CutMultiVideoViewModel) c1463000oAsI3.LLJJIJIL.getValue(c1463000oAsI3, C1463000oAs.LLJLLIL[4])).LLILZLL.setValue(null);
            float f4 = 1.0f;
            if (c1463000oAsI3.LLJ != null) {
                f3 = C1453180nv2.LIZJ / r6.getInitSize().width;
            } else {
                f3 = 1.0f;
            }
            if (!C1431760nMU.LIZ(-1.0f, c1463000oAsI3.LLIZ, 1.0E-5f) && !C1431760nMU.LIZ(c1463000oAsI3.LLIZ, f3, 1.0E-5f)) {
                c1463000oAsI3.LLIZ = f3;
            }
            int i6 = (i2 + 90) % 360;
            if (i6 % 180 != 0) {
                f4 = (i4 * 1.0f) / i5;
            }
            C1462980oAq c1462980oAq = c1463000oAsI3.LLJI;
            if (c1462980oAq != null) {
                if (!c1462980oAq.LIZIZ.LIZIZ) {
                    ((MultiEditVideoSegmentRecordData) ListProtector.get(c1462980oAq.LIZLLL().segmentDataList, i)).scale = f4;
                }
                if (!C1462990oAr.LIZ(c1462980oAq.LIZIZ)) {
                    C1463750oC5 c1463750oC5LIZJ = c1462980oAq.LJII;
                    if (c1463750oC5LIZJ == null) {
                        c1463750oC5LIZJ = C1462980oAq.LIZJ(c1462980oAq.LIZLLL(), false, c1462980oAq.LIZLLL, c1462980oAq.LJ, i);
                    }
                    float[] fArr = c1463750oC5LIZJ.LJIIJJI;
                    if (fArr != null) {
                        fArr[0] = f4;
                    }
                }
                InterfaceC1452170ntP interfaceC1452170ntP = c1462980oAq.LIZ;
                if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null && (tracks = c1463670oBx.LIZJ().getTracks()) != null) {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.getMainTrack()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrack nLETrack = next;
                    if (nLETrack != null && (sortedSlots = nLETrack.getSortedSlots()) != null) {
                        Iterator<NLETrackSlot> it3 = sortedSlots.iterator();
                        while (it3.hasNext()) {
                            it3.next().setScale(f4);
                        }
                    }
                }
            }
            c1463000oAsI3.LJIL(f4, i);
            C1462980oAq c1462980oAq2 = c1463000oAsI3.LLJI;
            if (c1462980oAq2 != null) {
                c1462980oAq2.LJFF(i, i6);
            }
            C1462980oAq c1462980oAq3 = c1463000oAsI3.LLJI;
            if (c1462980oAq3 != null) {
                c1462980oAq3.LJ((int) pairF4.getFirst().longValue(), (int) pairF4.getSecond().longValue());
            }
            c1463000oAsI3.LJIIJ().LIZLLL(jLIZIZ, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, true);
        } else {
            float f5 = f2 - c817403Hg.element;
            InterfaceC1452170ntP interfaceC1452170ntP2 = c1463000oAsI3.LLJ;
            if (interfaceC1452170ntP2 != null) {
                i3 = ((interfaceC1452170ntP2.getInitSize().height / 2) - (C1453180nv2.LIZLLL / 2)) - C1453180nv2.LIZIZ;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0201001_22(f5, i3, c1463000oAsI3, c817403Hg, 0));
            final float f6 = f;
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0oB0
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    float f7;
                    InterfaceC1452170ntP interfaceC1452170ntP3;
                    super.onAnimationEnd(animator);
                    long jLIZIZ2 = c1463000oAsI3.LJIIJ().LIZIZ();
                    C1463000oAs c1463000oAs = c1463000oAsI3;
                    ((CutMultiVideoViewModel) c1463000oAs.LLJJIJIL.getValue(c1463000oAs, C1463000oAs.LLJLLIL[4])).LLILZLL.setValue(null);
                    if (c1463000oAsI3.LLJ != null) {
                        f7 = C1453180nv2.LIZJ / r0.getInitSize().width;
                    } else {
                        f7 = 1.0f;
                    }
                    if (!C1431760nMU.LIZ(-1.0f, c1463000oAsI3.LLIZ, 1.0E-5f) && !C1431760nMU.LIZ(c1463000oAsI3.LLIZ, f7, 1.0E-5f)) {
                        C1463000oAs c1463000oAs2 = c1463000oAsI3;
                        c1463000oAs2.LJIL((f6 * f7) / c1463000oAs2.LLIZ, i);
                        c1463000oAsI3.LLIZ = f7;
                    }
                    int i7 = (i2 + 90) % 360;
                    InterfaceC1452170ntP interfaceC1452170ntP4 = c1463000oAsI3.LLJ;
                    if (interfaceC1452170ntP4 != null) {
                        interfaceC1452170ntP4.stop();
                    }
                    C1462980oAq c1462980oAq4 = c1463000oAsI3.LLJI;
                    if (c1462980oAq4 != null) {
                        c1462980oAq4.LJFF(i, i7);
                    }
                    C1463000oAs c1463000oAs3 = c1463000oAsI3;
                    c1463000oAs3.getClass();
                    if (C1453180nv2.LIZLLL > 0 && C1453180nv2.LIZJ > 0 && C1453180nv2.LIZ >= 0 && C1453180nv2.LIZIZ >= 0 && (interfaceC1452170ntP3 = c1463000oAs3.LLJ) != null) {
                        interfaceC1452170ntP3.setDisplayPos(C1453180nv2.LIZ, C1453180nv2.LIZIZ, C1453180nv2.LIZJ, C1453180nv2.LIZLLL);
                    }
                    C1462980oAq c1462980oAq5 = c1463000oAsI3.LLJI;
                    if (c1462980oAq5 != null) {
                        c1462980oAq5.LJ((int) pairF4.getFirst().longValue(), (int) pairF4.getSecond().longValue());
                    }
                    c1463000oAsI3.LJIIJ().LIZLLL(jLIZIZ2, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, true);
                }
            });
            valueAnimatorOfFloat.start();
        }
        C1463170oB9 c1463170oB9 = LLLII;
        VideoPublishEditModel editModel = getEditModel();
        c1463170oB9.getClass();
        C1463170oB9.LIZIZ(editModel, "spin_canvas", null);
    }

    @Override // X.InterfaceC1419190n2D
    public ArrayList<ImportVideoInfo> o31(boolean z, boolean z2) {
        boolean z3;
        Object next;
        int iLIZIZ;
        boolean z4;
        int iLIZJ;
        int iLJ;
        long jLongValue;
        List<VideoSegment> listLJII = i3().LJII();
        ArrayList<VideoSegment> arrayList = new ArrayList();
        Iterator<VideoSegment> it2 = listLJII.iterator();
        while (true) {
            z3 = true;
            if (!it2.hasNext()) {
                break;
            }
            VideoSegment next2 = it2.next();
            if (true ^ next2.isDeleted) {
                arrayList.add(next2);
            }
        }
        if (z) {
            B3().g().getValue();
            C536270L1l.LIZ(arrayList);
        }
        ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>();
        Iterable importInfoList = getEditModel().getImportInfoList();
        if (importInfoList == null) {
            importInfoList = C13BV.INSTANCE;
        }
        for (VideoSegment videoSegment : arrayList) {
            Iterator it3 = importInfoList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (TextUtils.equals(((ImportVideoInfo) next).getRealImportPath(), videoSegment.LJFF(false))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ImportVideoInfo importVideoInfo = (ImportVideoInfo) next;
            if (importVideoInfo != null) {
                int i = videoSegment.width;
                int i2 = videoSegment.height;
                int bitRate = importVideoInfo.getBitRate();
                int encodeId = importVideoInfo.getEncodeId();
                String strLJFF = videoSegment.LJFF(z3);
                strLJFF.toString();
                long j = videoSegment.duration;
                long jLIZLLL = videoSegment.LIZLLL() - videoSegment.LJII();
                String str = videoSegment.mDescription;
                String str2 = videoSegment.mMusicId;
                int originFps = importVideoInfo.getOriginFps();
                float fLJI = videoSegment.LJI();
                String strLJFF2 = videoSegment.LJFF(false);
                strLJFF2.toString();
                String originImportPath = importVideoInfo.getOriginImportPath();
                boolean z5 = videoSegment.fastImportDependHW;
                String hypicDescription = importVideoInfo.getHypicDescription();
                AIGCInfo aigcInfo = importVideoInfo.getAigcInfo();
                Long lValueOf = Long.valueOf(importVideoInfo.getDate());
                if (lValueOf.longValue() != 0) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = videoSegment.date;
                }
                arrayList2.add(new ImportVideoInfo(i, i2, bitRate, encodeId, strLJFF, j, jLIZLLL, str, str2, originFps, fLJI, strLJFF2, originImportPath, z5, hypicDescription, aigcInfo, jLongValue));
            } else {
                if (C298040BmE.LIZ()) {
                    C2356009La c2356009La = C2356009La.LIZ;
                    String strLJFF3 = videoSegment.LJFF(true);
                    c2356009La.getClass();
                    VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(strLJFF3);
                    if (vEVideoFileInfoLIZ != null) {
                        videoSegment.videoInfo = vEVideoFileInfoLIZ;
                    }
                }
                int i3 = videoSegment.width;
                int i4 = videoSegment.height;
                if (z2) {
                    iLIZIZ = videoSegment.LIZIZ();
                    iLIZJ = videoSegment.LIZJ();
                    z4 = true;
                } else {
                    iLIZIZ = 0;
                    z4 = true;
                    iLIZJ = 0;
                }
                String strLJFF4 = videoSegment.LJFF(z4);
                strLJFF4.toString();
                long j2 = videoSegment.duration;
                long jLIZLLL2 = videoSegment.LIZLLL() - videoSegment.LJII();
                String str3 = videoSegment.mDescription;
                String str4 = videoSegment.mMusicId;
                if (z2) {
                    iLJ = videoSegment.LJ();
                } else {
                    iLJ = 0;
                }
                float fLJI2 = videoSegment.LJI();
                String strLJFF5 = videoSegment.LJFF(false);
                strLJFF5.toString();
                arrayList2.add(new ImportVideoInfo(i3, i4, iLIZIZ, iLIZJ, strLJFF4, j2, jLIZLLL2, str3, str4, iLJ, fLJI2, strLJFF5, videoSegment.originPath, videoSegment.fastImportDependHW, null, videoSegment.aigcInfo, videoSegment.date));
            }
            z3 = true;
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0E1v, X.0oBO] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0oBL] */
    @Override // X.C12VU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void vW0(boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1463010oAt.vW0(boolean, boolean):void");
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0oBA] */
    public AbstractC1463010oAt(C1DRG c1drg, C19A3 c19a3, int i) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c19a3;
        this.LLILZIL = i;
        this.LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 298));
        this.LLIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(136));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 297));
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453430nvR.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC2180241AUk.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC376040Eok.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.LLJLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
        this.LLLFF = new InterfaceC362610EJn() { // from class: X.0oBA
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                if (i2 != 4) {
                    return false;
                }
                Integer editState = this.LL.T2().nR2().getEditState();
                if (editState != null && editState.intValue() == 2) {
                    CutMultiVideoViewModel cutMultiVideoViewModel = this.LL.LLJZ;
                    if (cutMultiVideoViewModel == null) {
                        cutMultiVideoViewModel = null;
                    }
                    cutMultiVideoViewModel.LLJ.setValue(null);
                    return true;
                }
                this.LL.LJJJJLL(false);
                return true;
            }
        };
        this.LLLFFI = new C560530Lyd<>();
        this.LLLFZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19753012Qe.class, null);
        this.LLLI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(137));
    }

    public final void C5(boolean z, boolean z2, long j) {
        String str;
        if (z) {
            str = "click_trim_complete";
        } else {
            str = "click_trim_cancel";
        }
        C1463170oB9 c1463170oB9 = LLLII;
        VideoPublishEditModel editModel = getEditModel();
        C1463060oAy c1463060oAy = new C1463060oAy(this, z2, j);
        c1463170oB9.getClass();
        C1463170oB9.LIZIZ(editModel, str, c1463060oAy);
    }

    @Override // X.C12VU
    public void HJ2(Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, boolean z) {
        C1463000oAs c1463000oAsI3 = i3();
        Pair<Long, Long> pairF4 = F4();
        c1463000oAsI3.getClass();
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        int iIntValue3 = pair2.getFirst().intValue();
        int iIntValue4 = pair2.getSecond().intValue();
        C1463170oB9 c1463170oB9 = LLLII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("swapVideo,originIndex:[");
        sbLIZ.append(iIntValue);
        sbLIZ.append(',');
        sbLIZ.append(iIntValue2);
        sbLIZ.append("],visibleIndex:[");
        sbLIZ.append(iIntValue3);
        sbLIZ.append(',');
        sbLIZ.append(iIntValue4);
        sbLIZ.append("],isMusicSyncMode:");
        sbLIZ.append(c1463000oAsI3.LLIZLLLIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1463170oB9.getClass();
        C1463170oB9.LIZ(strLIZIZ);
        ArrayList<TimeSpeedModelExtension> arrayList = c1463000oAsI3.LLJJIII;
        if (arrayList != null) {
            C1463700oC0.LIZJ(iIntValue3, iIntValue4, arrayList);
        }
        List<MultiEditVideoSegmentRecordData> list = c1463000oAsI3.LIZLLL().segmentDataList;
        if (list != null) {
            C1463700oC0.LIZJ(iIntValue, iIntValue2, list);
            int i = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    multiEditVideoSegmentRecordData.videoKey = i;
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (c1463000oAsI3.LLIZLLLIL) {
            C1463050oAx c1463050oAxLJIIIZ = c1463000oAsI3.LJIIIZ();
            if (c1463050oAxLJIIIZ != null) {
                C1463030oAv c1463030oAvLJII = c1463050oAxLJIIIZ.LJII();
                c1463030oAvLJII.getClass();
                InterfaceC1452170ntP interfaceC1452170ntP = c1463030oAvLJII.LIZ;
                if (interfaceC1452170ntP != null && c1463030oAvLJII.LIZIZ >= 0 && interfaceC1452170ntP.fg(iIntValue, iIntValue2) >= 0 && interfaceC1452170ntP.updateAlgorithmFromNormal() >= 0 && interfaceC1452170ntP.genRandomSolve() == 0) {
                    c1463030oAvLJII.LJI(3, iIntValue2, false);
                }
            }
        } else {
            C1462980oAq c1462980oAq = c1463000oAsI3.LLJI;
            if (c1462980oAq != null) {
                c1463000oAsI3.LJII();
                if (C1462990oAr.LIZ(c1462980oAq.LIZIZ)) {
                    c1462980oAq.LIZ.fg(iIntValue, iIntValue2);
                } else {
                    c1462980oAq.LIZIZ(null, false, true);
                }
            }
            C1462980oAq c1462980oAq2 = c1463000oAsI3.LLJI;
            if (c1462980oAq2 != null) {
                c1462980oAq2.LJ((int) pairF4.getFirst().longValue(), (int) pairF4.getSecond().longValue());
            }
        }
        c1463000oAsI3.LJIIJ().LIZLLL(0L, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, true);
    }

    @Override // X.C11E9
    public <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, R> R withState(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C1171740gb6.LIZLLL(vm1, vm2, function2);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, Function2<? super PROP1, ? super PROP2, ? extends R> function2) {
        return (R) C1171740gb6.LJII(c11e5, c11e52, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LIZJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, InterfaceC1631620sYq<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC1631620sYq) {
        return (R) C1171740gb6.LJI(c11e5, c11e52, c11e53, interfaceC1631620sYq);
    }

    public static /* synthetic */ void J6(AbstractC1463010oAt abstractC1463010oAt, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = -1;
            }
            abstractC1463010oAt.u6(z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveMusicPlay");
    }

    @Override // X.C11E9
    public <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC1631630sYr<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LIZIZ(vm1, vm2, vm3, vm4, interfaceC1631630sYr);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, InterfaceC1631630sYr<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC1631630sYr) {
        return (R) C1171740gb6.LJFF(c11e5, c11e52, c11e53, c11e54, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I, VM2 extends JediViewModel<S2>, S2 extends C004I, VM3 extends JediViewModel<S3>, S3 extends C004I, VM4 extends JediViewModel<S4>, S4 extends C004I, VM5 extends JediViewModel<S5>, S5 extends C004I, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC1685420txc<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LIZ(vm1, vm2, vm3, vm4, vm5, interfaceC1685420txc);
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, M2 extends C11E5<S2, PROP2>, PROP2 extends C004I, S2 extends C004I, M3 extends C11E5<S3, PROP3>, PROP3 extends C004I, S3 extends C004I, M4 extends C11E5<S4, PROP4>, PROP4 extends C004I, S4 extends C004I, M5 extends C11E5<S5, PROP5>, PROP5 extends C004I, S5 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, C11E5<S2, PROP2> c11e52, C11E5<S3, PROP3> c11e53, C11E5<S4, PROP4> c11e54, C11E5<S5, PROP5> c11e55, InterfaceC1685420txc<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC1685420txc) {
        return (R) C1171740gb6.LJ(c11e5, c11e52, c11e53, c11e54, c11e55, interfaceC1685420txc);
    }

    @Override // X.C11E9
    public <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
