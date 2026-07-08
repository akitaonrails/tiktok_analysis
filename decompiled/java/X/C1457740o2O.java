package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS36S0300000_3;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMusic;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.property.CanvasDurationConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.VeMusicStreamTimeoutOpt;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewMusicParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS101S0210000_22;
import kotlin.jvm.internal.AwS136S1100000_22;
import kotlin.jvm.internal.AwS137S1200000_22;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o2O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457740o2O extends AbstractC2255721DQs<InterfaceC1413540mt6> implements InterfaceC1413540mt6, InterfaceC379610EuV, InterfaceC1166920gTK {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLII;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final C1457740o2O LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final h0<String> LLJJL;
    public final h0<Boolean> LLJJLIIIJLLLLLLLZ;
    public final h0<TextUtils.TruncateAt> LLJL;
    public final h0<Boolean> LLJLIL;
    public final h0<Boolean> LLJLILLLLZIIL;
    public final h0<Boolean> LLJLL;
    public final h0<Integer> LLJLLIL;
    public final h0<Boolean> LLJLLL;
    public final h0<Pair<Boolean, Function0<Unit>>> LLJZ;
    public final C01GW LLJZIJLIL;
    public AVMusic LLL;
    public final h0<Boolean> LLLF;
    public final long LLLFF;
    public final C01GW LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;
    public InterfaceC366450EYh LLLIIIL;
    public final C1457760o2Q LLLIIL;
    public C1457830o2X LLLIILIL;
    public final C1458080o2w LLLIL;
    public C11NJ LLLILZ;
    public final h0<Pair<Boolean, AVMusic>> LLLILZJ;
    public boolean LLLILZLLLI;
    public AVMusic LLLIZZ;
    public boolean LLLJ;
    public long LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;

    @Override // X.InterfaceC1413540mt6
    public void YN1() {
        this.LLLL = true;
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

    public final void i3() {
        lz(null);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1457740o2O.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1457740o2O.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1457740o2O.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1457740o2O.class, "imageVideoSeparateModeSwitchApi", "getImageVideoSeparateModeSwitchApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageVideoSeparateModeSwitchApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1457740o2O.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1457740o2O.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1457740o2O.class, "changeAvatarApi", "getChangeAvatarApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/changeavatar/ChangeAvatarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1457740o2O.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1457740o2O.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1457740o2O.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1457740o2O.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1457740o2O.class, "replaceManager", "getReplaceManager()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C1457740o2O.class, "editMusicStreamPlaybackApi", "getEditMusicStreamPlaybackApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicStreamPlaybackApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C1457740o2O.class, "memeAudioComponent", "getMemeAudioComponent()Lcom/ss/android/ugc/gamora/editor/audioservice/service/memeaudio/MemeAudioApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C1457740o2O.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(C1457740o2O.class, "taskScheduler", "getTaskScheduler()Lcom/ss/android/ugc/aweme/creative/taskscheduler/scheduler/ITaskScheduler;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS17 = new C2217381BqS(C1457740o2O.class, "rememberLastSelectMusicApi", "getRememberLastSelectMusicApi()Lcom/ss/android/ugc/gamora/editor/music/RememberLastSelectMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS18 = new C2217381BqS(C1457740o2O.class, "recentMusicAddApi", "getRecentMusicAddApi()Lcom/ss/android/ugc/aweme/tools/music/music/recent/components/RecentMusicAddApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS19 = new C2217381BqS(C1457740o2O.class, "memeSongStickerApi", "getMemeSongStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/memesong/MemeSongStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS20 = new C2217381BqS(C1457740o2O.class, "memeAudioApiComponent", "getMemeAudioApiComponent()Lcom/ss/android/ugc/gamora/editor/audioservice/service/memeaudio/MemeAudioApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS21 = new C2217381BqS(C1457740o2O.class, "mixEditingMaterialApi", "getMixEditingMaterialApi()Lcom/ss/android/ugc/gamora/editor/mixediting/VideoMixEditingAssetsApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS22 = new C2217381BqS(C1457740o2O.class, "autoCutPreloadApi", "getAutoCutPreloadApi()Lcom/ss/android/ugc/aweme/autocut/AutoCutPreloadingApi;", 0);
        c09r3.getClass();
        LLLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16, c2217381BqS17, c2217381BqS18, c2217381BqS19, c2217381BqS20, c2217381BqS21, c2217381BqS22};
    }

    private final InterfaceC1415760mwg C5() {
        return (InterfaceC1415760mwg) this.LLLIIII.getValue(this, LLLLII[20]);
    }

    private final InterfaceC1461650o8h F4() {
        return (InterfaceC1461650o8h) this.LLJJIJIL.getValue();
    }

    private final InterfaceC1459480o5C H5() {
        return (InterfaceC1459480o5C) this.LLJJJJLIIL.getValue(this, LLLLII[16]);
    }

    private final InterfaceC1457960o2k K4() {
        return (InterfaceC1457960o2k) this.LLJJIJIIJIL.getValue(this, LLLLII[12]);
    }

    private final void L6() {
        this.LLLIL.LJI.observe(this, new AObjectS245S0100000_22(this, 157));
    }

    private final InterfaceC1459020o4S M5() {
        return (InterfaceC1459020o4S) this.LLJJIJI.getValue(this, LLLLII[11]);
    }

    private final AbstractC214814194y N5() {
        return (AbstractC214814194y) this.LLJ.getValue(this, LLLLII[2]);
    }

    private final InterfaceC1417110myr O3() {
        return (InterfaceC1417110myr) this.LLLIIIIL.getValue(this, LLLLII[21]);
    }

    private final CanvasDurationConfig Q3() {
        return (CanvasDurationConfig) this.LLJZIJLIL.getValue();
    }

    private final InterfaceC524270KhF R5() {
        return (InterfaceC524270KhF) this.LLJJJJJIL.getValue(this, LLLLII[15]);
    }

    private final InterfaceC1455610nyx T4() {
        return (InterfaceC1455610nyx) this.LLJILJIL.getValue(this, LLLLII[5]);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean d6() {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457740o2O.d6():boolean");
    }

    private final InterfaceC1457660o2G e4() {
        return (InterfaceC1457660o2G) this.LLJILJILJ.getValue(this, LLLLII[6]);
    }

    private final InterfaceC391240FVq k5() {
        return (InterfaceC391240FVq) this.LLJJJ.getValue();
    }

    private final InterfaceC1455850nzL o4() {
        return (InterfaceC1455850nzL) this.LLJJJJ.getValue(this, LLLLII[14]);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o7() {
        /*
            r6 = this;
            com.bytedance.als.h0<java.lang.String> r0 = r6.LLJJL
            java.lang.Object r1 = r0.LIZJ()
            X.19EG r0 = r6.getActivity()
            r4 = 2131848742(0x7f116e26, float:1.9330998E38)
            java.lang.String r0 = r0.getString(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = 0
            if (r0 != 0) goto L9b
            X.1DRG r1 = r6.getDiContainer()
            java.lang.Class<X.0ETY> r0 = X.C0ETY.class
            r5 = 0
            java.lang.Object r1 = r1.LJII(r0, r5)
            X.0ETY r1 = (X.C0ETY) r1
            java.lang.Class<X.0o2W> r0 = X.InterfaceC1457820o2W.class
            X.05YF r0 = r1.MY1(r0)
            if (r0 == 0) goto L9b
            X.0o2W r0 = r6.t5()
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r5 = r0.Vf()
        L37:
            r2 = 1
            if (r5 != 0) goto L5e
            X.0o2W r0 = r6.t5()
            if (r0 == 0) goto L9b
            boolean r0 = r0.Ye2()
            if (r0 != r2) goto L9b
            X.0mwg r0 = r6.C5()
            if (r0 == 0) goto L5e
            androidx.lifecycle.LiveData r0 = r0.Gn0()
            if (r0 == 0) goto L5e
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L9b
        L5e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.n5()
            boolean r0 = X.C1403860mdU.LIZ(r0, r2)
            if (r0 == 0) goto L9b
            com.bytedance.als.h0<java.lang.String> r2 = r6.LLJJL
            X.19EG r1 = r6.getActivity()
            r0 = 2131837155(0x7f1140e3, float:1.9307497E38)
            java.lang.String r0 = r1.getString(r0)
            r2.LJII(r0)
            com.bytedance.als.h0<java.lang.Boolean> r1 = r6.LLJLIL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LJII(r0)
        L7f:
            com.bytedance.als.h0<android.text.TextUtils$TruncateAt> r1 = r6.LLJL
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            r1.LJII(r0)
            com.bytedance.als.h0<java.lang.Integer> r1 = r6.LLJLLIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.LJII(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.n5()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r0 = r0.audioCopyrightDetectModel
            r0.setCopyrightClaimShowing(r3)
            return
        L9b:
            com.bytedance.als.h0<java.lang.String> r0 = r6.LLJJL
            java.lang.Object r1 = r0.LIZJ()
            X.19EG r0 = r6.getActivity()
            java.lang.String r0 = r0.getString(r4)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L7f
            com.bytedance.als.h0<java.lang.String> r2 = r6.LLJJL
            X.19EG r1 = r6.getActivity()
            r0 = 2131848068(0x7f116b84, float:1.9329631E38)
            java.lang.String r0 = r1.getString(r0)
            r2.LJII(r0)
            com.bytedance.als.h0<java.lang.Boolean> r1 = r6.LLJLIL
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.LJII(r0)
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457740o2O.o7():void");
    }

    private final InterfaceC1457820o2W t5() {
        return (InterfaceC1457820o2W) this.LLLII.getValue(this, LLLLII[19]);
    }

    private final void u7() {
        View view = this.LLILLJJLI.mView;
        if (view != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131821428);
            creativeToastBuilder.duration(3000L);
            C1390380mHk.LIZLLL(view, 3008, creativeToastBuilder);
        }
    }

    private final InterfaceC1457820o2W v5() {
        return (InterfaceC1457820o2W) this.LLJJJIL.getValue(this, LLLLII[13]);
    }

    private final InterfaceC1457990o2n x5() {
        return (InterfaceC1457990o2n) this.LLLI.getValue(this, LLLLII[18]);
    }

    public final InterfaceC1454960nxu D5() {
        return (InterfaceC1454960nxu) this.LLJJ.getValue(this, LLLLII[8]);
    }

    public final InterfaceC1453610nvj E5() {
        return (InterfaceC1453610nvj) this.LLLFZ.getValue(this, LLLLII[17]);
    }

    public final IMusicEditService H4() {
        return (IMusicEditService) this.LLLFFI.getValue();
    }

    @Override // X.InterfaceC1413540mt6
    public void LJ() {
        this.LLJJL.LJII(getActivity().getString(R.string.txr));
        this.LLJLLIL.LJII(1);
        this.LLJLIL.LJII(Boolean.FALSE);
    }

    @Override // X.InterfaceC1413540mt6
    public void LJIIL() {
        this.LLJJL.LJII(getActivity().getString(2131848068));
        this.LLJLLIL.LJII(0);
    }

    @Override // X.InterfaceC1413540mt6
    public boolean Mc2() {
        Integer numLIZJ = this.LLJLLIL.LIZJ();
        return numLIZJ != null && numLIZJ.intValue() == 1;
    }

    public final InterfaceC1455860nzM O4() {
        return (InterfaceC1455860nzM) this.LLJIJIL.getValue(this, LLLLII[4]);
    }

    @Override // X.InterfaceC1413540mt6
    public void Ok2() {
        MutableLiveData<C1457940o2i<C1458010o2p>> mutableLiveData = this.LLLIL.LJI;
        AObjectS245S0100000_22 aObjectS245S0100000_22 = new AObjectS245S0100000_22(this, 153);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            mutableLiveData.observe(this, aObjectS245S0100000_22);
        } else {
            C15O7.LJIIIIZZ.execute(new ARunnableS36S0300000_3(mutableLiveData, this, aObjectS245S0100000_22, 2));
        }
    }

    public final InterfaceC1461350o8D P4() {
        return (InterfaceC1461350o8D) this.LLJJIII.getValue(this, LLLLII[10]);
    }

    public final void S5() {
        if (B3("video_capsule_recommend")) {
            Ok2();
        }
    }

    public final void W1() {
        C1457940o2i<C1458010o2p> value = this.LLLIL.LJI.getValue();
        if ((value != null ? value.LIZ : null) == EnumC1457770o2R.LOADING) {
            this.LLLIL.LIZ();
        }
        this.LLLILZ.dispose();
        this.LLLIL.LJ = null;
    }

    public final InterfaceC377540ErA Z4() {
        return (InterfaceC377540ErA) this.LLJJI.getValue(this, LLLLII[9]);
    }

    public final InterfaceC578500MmW d5() {
        return (InterfaceC578500MmW) this.LLJI.getValue(this, LLLLII[3]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLLLII[1]);
    }

    public final VideoPublishEditModel n5() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLLLII[0]);
    }

    public final InterfaceC1453420nvQ z4() {
        return (InterfaceC1453420nvQ) this.LLJILLL.getValue(this, LLLLII[7]);
    }

    private final boolean H2() {
        return n5().isStickPointMode() || n5().isLinkShareWithPresetMusic();
    }

    private final boolean I7() {
        ForwardMusic forwardMusicLIZIZ;
        String musicId;
        DMMediaModel dMMediaModel;
        VideoPublishEditModel videoPublishEditModelN5 = n5();
        if (!videoPublishEditModelN5.isDuet() && videoPublishEditModelN5.getStitchParams() == null) {
            return (C1444940nhk.LJFF(videoPublishEditModelN5.getCanvasVideoData()) || C1444940nhk.LJIIL(videoPublishEditModelN5.getCanvasVideoData())) ? (!C1444940nhk.LJIILIIL(videoPublishEditModelN5.getCanvasVideoData()) || (forwardMusicLIZIZ = C1444940nhk.LIZIZ(videoPublishEditModelN5.getCanvasVideoData())) == null || (musicId = forwardMusicLIZIZ.getMusicId()) == null || musicId.length() == 0) ? false : true : ((videoPublishEditModelN5.isEnterFromDM() && (dMMediaModel = videoPublishEditModelN5.creativeModel.dmMediaModel) != null && dMMediaModel.type == 2) || videoPublishEditModelN5.isEnterFromDM()) ? false : true;
        }
        return false;
    }

    private final boolean K6() {
        return (!u4.LJLL(n5()) || C1428470nHB.LLIIIILZ(n5()) || C0C64.LJIILLIIL().LJIJ(31744, 0, "story_auto_music_show_capsule", true) == 2) ? false : true;
    }

    private final boolean T2() {
        return (H2() || n5().isMvThemeVideoType() || C1444940nhk.LJIIJ(n5().getCanvasVideoData())) && !n5().isCurrentAutoCutMode();
    }

    private final void U5() {
        if (C2292008yU.LIZ()) {
            C1403010mc7.LIZ.getMusicService().al();
            C2275708vr.LJI(C1428470nHB.LJIILL(n5()), C1428470nHB.LJIILIIL(n5()), n5().getCreationId());
        }
        D5().Zq().LJ(this, new AObjectS245S0100000_22(this, 154));
        IMusicEditService iMusicEditServiceH4 = H4();
        if (iMusicEditServiceH4 != null) {
            iMusicEditServiceH4.LJIIJJI(n5());
        }
        if (d6()) {
            return;
        }
        if (C1430550nKX.LIZ(n5())) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(n5().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic != null) {
                if (C0MT6.LIZ()) {
                    D5().fr(aVMusicExtractAVMusic.getMusicId(), n5().getMusicOrigin());
                }
                this.LLLIZZ = aVMusicExtractAVMusic;
                lz(aVMusicExtractAVMusic);
            }
            C1457800o2U.LIZ(this.LLLFF, n5(), true);
            this.LLLILZJ.LJII(new Pair<>(Boolean.TRUE, null));
            return;
        }
        int iLJFF = C1456980o1A.LJFF(n5());
        if (iLJFF == 0) {
            this.LLLILZJ.LJII(new Pair<>(Boolean.TRUE, null));
            o2();
            return;
        }
        String str = "video_capsule_recommend";
        if (iLJFF != 1) {
            if (iLJFF == 2) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_recommend_music_disable_aed", true, false)) {
                    m3("video_capsule_recommend", false);
                    return;
                } else {
                    m3("video_capsule_recommend", true);
                    return;
                }
            }
            return;
        }
        if (C1430550nKX.LIZLLL(n5())) {
            str = "sync_page_recommend";
        } else if (n5().creativeModel.changeAvatarModel.isFromChangeAvatar) {
            str = "profile_photo";
        } else if (!C1430550nKX.LIZJ(n5())) {
            str = "slideshow_rec";
        }
        m3(str, false);
    }

    private final boolean W2() {
        return !n5().isPhotoMvMode() && T2();
    }

    private final boolean X1() {
        VideoPublishEditModel videoPublishEditModelN5 = n5();
        if (videoPublishEditModelN5 != null && C1428470nHB.LJJZZI(videoPublishEditModelN5)) {
            return true;
        }
        VideoPublishEditModel videoPublishEditModelN52 = n5();
        if (videoPublishEditModelN52 != null && C1428470nHB.LJLIIL(videoPublishEditModelN52)) {
            return true;
        }
        VideoPublishEditModel videoPublishEditModelN53 = n5();
        return videoPublishEditModelN53 != null && C1428470nHB.LJZI(videoPublishEditModelN53);
    }

    private final void Z1() {
        if (I7() || !C1403850mdT.LJIIL(n5()) || MusicBeanUtilKt.extractAVMusic(n5().creativeModel.musicBuzModel) == null) {
            return;
        }
        C1402660mbY c1402660mbY = C1402660mbY.LIZ;
        VideoPublishEditModel videoPublishEditModelN5 = n5();
        c1402660mbY.getClass();
        C1402660mbY.LIZ(videoPublishEditModelN5);
    }

    private final void o2() {
        if (!C565160MEo.LIZJ(n5()) || n5().getAILivePhotoModel().musicMobParams == null) {
            return;
        }
        n5().getAILivePhotoModel().musicMobParams = null;
    }

    private final void y7() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        InterfaceC1455860nzM interfaceC1455860nzMO4;
        LiveData<InterfaceC1452170ntP> liveDataG2;
        InterfaceC1452170ntP value2;
        NLEModel nLEModelLIZ2;
        if (n5().getEditMusicSyncMode()) {
            if (C992440bvu.LIZ() != EnumC992430bvt.NO_MATCH.ordinal() && (interfaceC1455860nzMO4 = O4()) != null && (liveDataG2 = interfaceC1455860nzMO4.g()) != null && (value2 = liveDataG2.getValue()) != null && (nLEModelLIZ2 = C352130DrH.LIZ(value2)) != null) {
                k7(nLEModelLIZ2);
            }
            n5().setEditMusicSyncMode(false);
            InterfaceC1455860nzM interfaceC1455860nzMO42 = O4();
            if (interfaceC1455860nzMO42 != null && (liveDataG = interfaceC1455860nzMO42.g()) != null && (value = liveDataG.getValue()) != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null) {
                mainTrack.removeExtraWithKey("ep_stick_point_switch");
                mainTrack.removeExtraWithKey("stick_point_on_off_key");
            }
            C1389880mGw c1389880mGw = new C1389880mGw(getActivity());
            c1389880mGw.LJIIIIZZ(2131850360);
            c1389880mGw.LIZLLL(2000L);
            c1389880mGw.LJIIJ();
        }
    }

    public final void Ev() {
        lg();
        InterfaceC1457820o2W interfaceC1457820o2WV5 = v5();
        if (interfaceC1457820o2WV5 != null) {
            interfaceC1457820o2WV5.mX("capsule");
        }
        y7();
        C1452640nuA.LJII(null, false, n5().creativeModel.musicBuzModel);
        D5().lr(true);
        InterfaceC1459020o4S interfaceC1459020o4SM5 = M5();
        if (interfaceC1459020o4SM5 != null) {
            interfaceC1459020o4SM5.CK(false);
        }
        InterfaceC1457990o2n interfaceC1457990o2nX5 = x5();
        if (interfaceC1457990o2nX5 != null) {
            interfaceC1457990o2nX5.E31();
        }
        InterfaceC1415760mwg interfaceC1415760mwgC5 = C5();
        if (interfaceC1415760mwgC5 != null) {
            interfaceC1415760mwgC5.W82(null, "music_clear_from_capsule");
        }
        InterfaceC1417110myr interfaceC1417110myrO3 = O3();
        if (interfaceC1417110myrO3 != null) {
            interfaceC1417110myrO3.Ev();
        }
        InterfaceC366450EYh interfaceC366450EYh = this.LLLIIIL;
        if (interfaceC366450EYh != null) {
            interfaceC366450EYh.yS(false);
        }
    }

    public final void G2() {
        T4().Ws(8);
    }

    public final void J6() {
        InterfaceC1457960o2k interfaceC1457960o2kK4;
        C385670FAf<Boolean> c385670FAfTe0;
        C385670FAf<EnumC1457970o2l> c385670FAfP11;
        InterfaceC1457960o2k interfaceC1457960o2kK42 = K4();
        if (interfaceC1457960o2kK42 != null && (c385670FAfP11 = interfaceC1457960o2kK42.P11()) != null) {
            c385670FAfP11.LIZ(this, new AObjectS245S0100000_22(this, 155));
        }
        if (!((VeMusicStreamTimeoutOpt.VeMusicStreamTimeoutOptConfig) VeMusicStreamTimeoutOpt.LIZIZ.getValue()).isEnable || (interfaceC1457960o2kK4 = K4()) == null || (c385670FAfTe0 = interfaceC1457960o2kK4.Te0()) == null) {
            return;
        }
        c385670FAfTe0.LIZ(this, new AObjectS245S0100000_22(this, 156));
    }

    @Override // X.InterfaceC1413540mt6
    public void KP0() {
        MusicObject musicObject = n5().creativeModel.musicBuzModel.music;
        if (this.LLLJIL != 0) {
            if (musicObject == null) {
                return;
            }
            if (System.currentTimeMillis() - this.LLLJIL > 800) {
                q3(musicObject);
            }
        } else if (musicObject == null) {
            return;
        }
        this.LLLJIL = System.currentTimeMillis();
    }

    public final void P6() {
        InterfaceC1459480o5C interfaceC1459480o5CH5;
        if (C568750MSj.LIZIZ(n5())) {
            u7();
            return;
        }
        if (C12DO.LIZ() && (interfaceC1459480o5CH5 = H5()) != null) {
            interfaceC1459480o5CH5.i21();
        }
        C1457830o2X c1457830o2X = this.LLLIILIL;
        if (c1457830o2X != null) {
            c1457830o2X.LLLII(true);
        }
    }

    public final void S6() {
        if (C568750MSj.LIZIZ(n5())) {
            u7();
        } else {
            T4().Ws(1);
        }
    }

    public final void W6() {
        C1457830o2X c1457830o2X;
        if (n5().creativeModel.musicBuzModel.music == null || (c1457830o2X = this.LLLIILIL) == null || !c1457830o2X.isVisible()) {
            return;
        }
        this.LLLJIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1413540mt6
    public void eH2() {
        if (MusicBeanUtilKt.extractAVMusic(n5().creativeModel.musicBuzModel) != null) {
            this.LLJLIL.LJII(Boolean.valueOf(!W2()));
        }
    }

    @Override // X.InterfaceC1413540mt6
    public void lg() {
        C1457830o2X c1457830o2X;
        MusicObject musicObject = n5().creativeModel.musicBuzModel.music;
        if (this.LLLJIL != 0 && (c1457830o2X = this.LLLIILIL) != null && c1457830o2X.isVisible() && musicObject != null && System.currentTimeMillis() - this.LLLJIL > 800 && !n5().creativeModel.onThisDayData.getShouldSkipMusicEnd()) {
            q3(musicObject);
        }
        this.LLLL = false;
        this.LLLJIL = 0L;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        View viewFindViewById;
        LiveData<VEPreviewMusicParams> liveDataML;
        LiveEvent<Pair<EnumC377550ErB, Float>> liveEventOn0;
        super.onCreate();
        if (!I7()) {
            Z1();
            return;
        }
        if (this.LLILZ) {
            this.LLLIILIL = new C1457830o2X(getDiContainer(), this.LLLIIL);
            this.LLJJL.LJII(getActivity().getString(2131848068));
            this.LLJL.LJII(TextUtils.TruncateAt.MIDDLE);
            this.LLJLIL.LJII(Boolean.FALSE);
            this.LLJLL.LJII(Boolean.valueOf(!H2()));
            C1457830o2X c1457830o2X = this.LLLIILIL;
            if (c1457830o2X != null) {
                this.LLILLJJLI.add(this.LLILLL, c1457830o2X, "StoryChooseMusicScene");
            }
            if (!this.LLILZIL) {
                ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS601S0100000_22(this, 406));
            }
            InterfaceC377540ErA interfaceC377540ErAZ4 = Z4();
            if (interfaceC377540ErAZ4 != null && (liveEventOn0 = interfaceC377540ErAZ4.on0()) != null) {
                liveEventOn0.LIZ(this, new AObjectS245S0100000_22(this, 159));
            }
        } else {
            C1457830o2X c1457830o2X2 = this.LLLIILIL;
            if (c1457830o2X2 != null) {
                this.LLILLJJLI.add(this.LLILLL, c1457830o2X2, "StoryChooseMusicScene");
            }
        }
        InterfaceC1455860nzM interfaceC1455860nzMO4 = O4();
        if (interfaceC1455860nzMO4 != null && (liveDataML = interfaceC1455860nzMO4.mL()) != null) {
            liveDataML.observe(this, new AObjectS245S0100000_22(this, 160));
        }
        U5();
        if (C298150BmP.LIZIZ()) {
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1457960o2k.class, new AwS601S0100000_22(this, 407));
            } else {
                J6();
            }
        }
        if (K6() && (viewFindViewById = this.LLILLJJLI.findViewById(this.LLILLL)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        if (this.LLILZIL) {
            if (C365940EWi.LIZLLL(n5())) {
                C1457830o2X c1457830o2X3 = this.LLLIILIL;
                if (c1457830o2X3 != null) {
                    this.LLILLJJLI.hide(c1457830o2X3);
                }
                C01TT.LIZLLL(new AwS566S0100000_22(this, 598));
            }
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS601S0100000_22(this, 408));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        IAnotherMusicService iAnotherMusicService;
        IContentUnderstandingService iContentUnderstandingService;
        super.onDestroy();
        if (C1452450ntr.LIZ() && !C2292008yU.LIZ() && (iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null)) != null) {
            iContentUnderstandingService.LIZ(C2253208sE.LIZ);
        }
        if (!C2292008yU.LIZ() || (iAnotherMusicService = (IAnotherMusicService) PluggableExtentionKt.pluggableSpi$default(IAnotherMusicService.class, false, false, false, 14, null)) == null || iAnotherMusicService.dl() == null) {
            return;
        }
        C1458410o3T.LJIIJ(n5().getCreationId());
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        lg();
        super.onPause();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        boolean z;
        Integer value;
        super.onResume();
        C1458080o2w c1458080o2w = this.LLLIL;
        synchronized (c1458080o2w) {
            z = c1458080o2w.LIZ;
        }
        if (!z) {
            if (n5().creativeModel.editModel.enableSkipStickPointRes && (value = C537720L7a.LIZ.getValue()) != null && value.intValue() == 0) {
                LJ();
            } else {
                lz(null);
            }
        }
        W6();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        W1();
    }

    public final void w2() {
        if (!C362370EIp.LIZIZ(n5()) || !C362370EIp.LIZJ(n5())) {
            o7();
            return;
        }
        if (C0C1H.LIZ() == 2) {
            this.LLJJL.LJII(getActivity().getString(2131837708));
            this.LLJL.LJII(TextUtils.TruncateAt.MARQUEE);
            this.LLJLIL.LJII(Boolean.FALSE);
            this.LLJLLIL.LJII(4);
            n5().creativeModel.audioCopyrightDetectModel.setCopyrightClaimShowing(true);
            return;
        }
        if (C0C1H.LIZ() == 1) {
            o7();
            return;
        }
        this.LLJJL.LJII(getActivity().getString(2131846188));
        this.LLJL.LJII(TextUtils.TruncateAt.MARQUEE);
        this.LLJLIL.LJII(Boolean.FALSE);
        this.LLJLLIL.LJII(2);
        n5().creativeModel.audioCopyrightDetectModel.setCopyrightClaimShowing(true);
    }

    public h0<Pair<Boolean, AVMusic>> E3() {
        return this.LLLILZJ;
    }

    public C1457740o2O H3() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1413540mt6
    public AVMusic SI1() {
        return this.LLLIZZ;
    }

    @Override // X.InterfaceC1413540mt6
    public boolean W5() {
        return this.LLLILZLLLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.InterfaceC1413540mt6
    public /* bridge */ /* synthetic */ C385670FAf gs0() {
        return this.LLLILZJ;
    }

    private final boolean B3(String str) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "recommend_music_disable_capsule_loading", true, false) || X1()) {
            return true;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -717715428) {
            return iHashCode != 523124326 ? true : true;
        }
        if (!str.equals("profile_photo")) {
            return true;
        }
        return false;
    }

    private final void T6(int i) {
        InterfaceC1461650o8h interfaceC1461650o8hF4 = F4();
        if (interfaceC1461650o8hF4 != null) {
            interfaceC1461650o8hF4.l0(new Pair<>(Integer.valueOf(i), Integer.valueOf(i)));
        }
        InterfaceC1457660o2G interfaceC1457660o2GE4 = e4();
        if (interfaceC1457660o2GE4 != null) {
            interfaceC1457660o2GE4.LJJJJJ(i);
        }
    }

    private final void d7(int i) {
        List<StickerModel> listLLLILZLLLI;
        InterfaceC391240FVq interfaceC391240FVqK5;
        InterfaceC391240FVq interfaceC391240FVqK52 = k5();
        if (interfaceC391240FVqK52 != null && (listLLLILZLLLI = interfaceC391240FVqK52.LLLILZLLLI(EnumC1466150oFx.TEXT)) != null && !listLLLILZLLLI.isEmpty() && (interfaceC391240FVqK5 = k5()) != null) {
            interfaceC391240FVqK5.rd(i, EnumC1466150oFx.TEXT);
        }
    }

    private final void k7(NLEModel nLEModel) {
        VecNLETrackSlotSPtr sortedSlots;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
            int i = 0;
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                int i2 = i + 1;
                NLEStyCrop crop = null;
                if (i >= 0) {
                    NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                    NLETrackSlot nLETrackSlot3 = new NLETrackSlot();
                    NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
                    nLESegmentVideo.setCanvasStyle(nLESegmentVideoDynamicCast.getCanvasStyle());
                    nLESegmentVideo.setTimeClipStart(0L);
                    if (nLESegmentVideoDynamicCast.getResource() != null) {
                        nLESegmentVideo.setAVFile(NLEResourceAV.dynamicCast(nLESegmentVideoDynamicCast.getResource().deepClone()));
                        nLESegmentVideo.setTimeClipEnd(nLESegmentVideo.getTimeClipStart() + nLESegmentVideoDynamicCast.getResource().getDuration());
                    }
                    C351220Dpo.LLLLLJLJLL(nLESegmentVideo);
                    NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
                    if (nLESegmentVideoDynamicCast2 != null) {
                        crop = nLESegmentVideoDynamicCast2.getCrop();
                    }
                    nLESegmentVideo.setCrop(crop);
                    if (C351220Dpo.LJJLIIIJJI(nLESegmentVideoDynamicCast).length() > 0) {
                        nLESegmentVideo.setExtra("ep_origin_media_path", C351220Dpo.LJJLIIIJJI(nLESegmentVideoDynamicCast));
                    }
                    nLETrackSlot3.setMainSegment(nLESegmentVideo);
                    nLETrackSlot3.setScale(nLETrackSlot2.getScale());
                    nLETrackSlot3.setTransformX(nLETrackSlot2.getTransformX());
                    nLETrackSlot3.setTransformY(nLETrackSlot2.getTransformY());
                    nLETrackSlot3.setRotation(nLETrackSlot2.getRotation());
                    C351220Dpo.LLLLLILLIL(nLETrackSlot3, C351220Dpo.LJJLIIIJLLLLLLLZ(nLETrackSlot2));
                    for (String str : nLETrackSlot2.getExtraKeys()) {
                        if (!Intrinsics.LJFF(str, "ep_curve_speed_resource_id")) {
                            nLETrackSlot3.setExtra(str, nLETrackSlot2.getExtra(str));
                        }
                    }
                    nLEModel.getMainTrack().removeSlot(nLETrackSlot2);
                    nLEModel.getMainTrack().addSlotAtIndex(nLETrackSlot3, i);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static final void m6(C1457740o2O c1457740o2O) {
        c1457740o2O.LLLILZJ.LJII(new Pair<>(Boolean.TRUE, null));
    }

    private final void q3(MusicObject musicObject) {
        boolean z;
        String id;
        String str;
        int position;
        String strLIZIZ = C1412490mrP.LIZIZ(n5());
        FlowDataMusicInfo flowDataMusicInfo = n5().getCreativeFlowData().getFlowDataMusicInfo();
        int i = 0;
        if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto()) {
            z = true;
        } else {
            z = false;
        }
        if (C1428470nHB.LLIIIJ(n5()) && z) {
            strLIZIZ = "slideshow_rec";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("music_selected_from", strLIZIZ);
        c0lab.LIZ(C1428470nHB.LJLIL(n5()), "is_music_from_auto_edit");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(n5()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(n5()));
        c0lab.LJ("shoot_way", n5().mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("creation_id", n5().getCreationId());
        c0lab.LJ("music_id", MusicBeanUtilKt.getMusicId(musicObject));
        MatchedSoundInfo matchedSoundInfo = musicObject.matchedSongInfo;
        if (matchedSoundInfo != null) {
            id = matchedSoundInfo.getId();
        } else {
            id = null;
        }
        c0lab.LJ("meta_song_id", id);
        c0lab.LIZ(musicObject.isPgc ? 1 : 0, "is_pgc");
        if (z) {
            str = "auto";
        } else {
            str = "manual";
        }
        c0lab.LJ("music_selected_method", str);
        FlowDataMusicInfo flowDataMusicInfo2 = n5().getCreativeFlowData().getFlowDataMusicInfo();
        if (flowDataMusicInfo2 != null) {
            position = flowDataMusicInfo2.getPosition();
        } else {
            position = 1;
        }
        c0lab.LIZ(position, "music_show_rank");
        c0lab.LIZ(musicObject.duration, "music_duration");
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLLJIL, "play_duration");
        c0lab.LIZ(0, "is_from_edit_page_panel");
        c0lab.LJ("music_log_id", C1412490mrP.LJFF(n5()));
        if (this.LLLJL || this.LLLL) {
            i = 1;
        }
        c0lab.LIZ(i, "is_from_auto_edit");
        if (C1428470nHB.LJLIL(n5()) == 1) {
            c0lab.LJ("mix_request_id", n5().creativeModel.mixEditingModel.requestId);
        }
        C565300MFc.LIZ(n5(), c0lab);
        C20684815ws.LJIILLIIL("music_play_end", c0lab.LIZ);
    }

    private final void v3(final String str) {
        this.LLLILZJ.LJII(new Pair<>(Boolean.TRUE, null));
        C1403010mc7.LIZ.getMusicService().requestMusic(str, new InterfaceC1416890myV(this) { // from class: X.0o0y
            public final /* synthetic */ C1457740o2O LIZIZ;

            @Override // X.InterfaceC1416890myV
            public final void LIZIZ(Exception exc) {
                C201962140q c201962140q = C201962140q.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Forward music request failed, musicId=");
                sbLIZ.append(str);
                C201955140j.LJII(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1416890myV
            public final void LIZLLL(final AVMusic aVMusic) {
                if (aVMusic == null) {
                    C201962140q c201962140q = C201962140q.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Forward music request succeeded but AVMusic is null, musicId=");
                    sbLIZ.append(str);
                    C201955140j.LJII(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                IAnotherMusicService musicService = C1403010mc7.LIZ.getMusicService();
                C19EG activity = this.LIZIZ.getActivity();
                final C1457740o2O c1457740o2O = this.LIZIZ;
                musicService.LJ("forward_music", activity, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0o0x
                    @Override // X.InterfaceC1416880myU
                    public final void LIZJ(boolean z) {
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void onProgress(int i) {
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void LIZ(Integer num, String str2) {
                        C201962140q c201962140q2 = C201962140q.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Forward music download failed, errCode=");
                        sbLIZ2.append(num);
                        sbLIZ2.append(", errMsg=");
                        sbLIZ2.append(str2);
                        C201955140j.LJII(c201962140q2, C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    @Override // X.InterfaceC1416880myU
                    public final void LIZIZ(String str2, MusicWaveBean musicWaveBean) {
                        AVMusic aVMusic2 = aVMusic;
                        aVMusic2.path = str2;
                        C01TT.LIZLLL(new AwS137S1200000_22(aVMusic2, str2, c1457740o2O, 3));
                    }
                }, false);
            }

            {
                this.LIZIZ = this;
            }
        });
    }

    public final void N6(InterfaceC1455610nyx interfaceC1455610nyx) {
        InterfaceC1460000o62 interfaceC1460000o62;
        LiveData<Boolean> liveDataV82;
        interfaceC1455610nyx.x8().observe(N5(), new AObjectS245S0100000_22(this, 158));
        if ((interfaceC1455610nyx instanceof InterfaceC1460000o62) && (interfaceC1460000o62 = (InterfaceC1460000o62) interfaceC1455610nyx) != null && (liveDataV82 = interfaceC1460000o62.v82()) != null) {
            getLifecycleOwner();
            liveDataV82.observe(this, new AObserverS225S0100000_22(this, 90));
        }
    }

    @Override // X.InterfaceC1413540mt6
    public void OA(boolean z) {
        if (z) {
            this.LLJJL.LJII(getActivity().getString(R.string.txr));
        } else {
            this.LLJJL.LJII(getActivity().getString(2131848068));
        }
        this.LLJLLIL.LJII(1);
        this.LLJLIL.LJII(Boolean.FALSE);
    }

    @Override // X.InterfaceC1413540mt6
    public void Wx1(boolean z) {
        if ((!C1428470nHB.LJLJI(n5()) || z) && !this.LLLILZ.LLILLJJLI) {
            this.LLLILZ.dispose();
        }
    }

    @Override // X.InterfaceC1413540mt6
    public void YO1(boolean z) {
        C1457830o2X c1457830o2X = this.LLLIILIL;
        if (c1457830o2X != null) {
            c1457830o2X.LLLII(z);
        }
    }

    public final void Z7(int i) {
        InterfaceC1452170ntP value;
        VideoFileInfo videoFileInfo;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        LiveData<InterfaceC1452170ntP> liveDataG;
        Integer numValueOf;
        int i2 = i;
        if (i2 == 0 || (C1444940nhk.LJII(n5().getCanvasVideoData()) && !C1444940nhk.LJIIJ(n5().getCanvasVideoData()))) {
            i2 = Q3().defaultDuration;
        }
        int i3 = Q3().minDuration;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = Q3().maxDuration;
        if (i2 > i4) {
            i2 = i4;
        }
        InterfaceC1455860nzM interfaceC1455860nzMO4 = O4();
        if (interfaceC1455860nzMO4 != null && (liveDataG = interfaceC1455860nzMO4.g()) != null) {
            value = liveDataG.getValue();
            if (value != null && (numValueOf = Integer.valueOf(value.mo51if())) != null && numValueOf.intValue() == i2) {
                return;
            }
        } else {
            value = null;
        }
        EditVideoSegment editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(n5().getPreviewInfo().getVideoList());
        if (editVideoSegment != null) {
            videoFileInfo = editVideoSegment.getVideoFileInfo();
        } else {
            videoFileInfo = null;
        }
        EditVideoSegment editVideoSegment2 = (EditVideoSegment) C13LP.LJJJLL(n5().getPreviewInfo().getVideoList());
        if (videoFileInfo != null && editVideoSegment2 != null) {
            n5().setPreviewInfo(new C538330L9j(videoFileInfo.getWidth(), videoFileInfo.getHeight(), 12).LIZ(new EditVideoSegment(editVideoSegment2.getVideoPath(), null, new VideoFileInfo(videoFileInfo.getWidth(), videoFileInfo.getHeight(), i2, 30, 0, 0, 0, 0, 0.0f, 496, null))));
            n5().setVideoLength(i2);
            if (value != null) {
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.trimOut = i2;
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
                if (c348100DkmLIZIZ != null) {
                    NLEEditor nLEEditor = c348100DkmLIZIZ.LIZ;
                    NLEModel model = nLEEditor.getModel();
                    if (model != null && (mainTrack = model.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null) {
                        nLETrackSlot.setStartTime(((long) vEClipTimelineParam.trimIn) * 1000);
                        nLETrackSlot.setEndTime(((long) vEClipTimelineParam.trimOut) * 1000);
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            nLESegmentVideoDynamicCast.setTimeClipStart(((long) vEClipTimelineParam.trimIn) * 1000);
                            nLESegmentVideoDynamicCast.setTimeClipEnd(((long) vEClipTimelineParam.trimOut) * 1000);
                            nLESegmentVideoDynamicCast.setSpeed((float) vEClipTimelineParam.speed);
                        }
                        nLEEditor.commit();
                    }
                    if (((Boolean) C265320AaY.LIZ.getValue()).booleanValue()) {
                        W7(nLEEditor, i2);
                    }
                    T6(i2);
                    d7(i2);
                    D5().mr();
                    value.Rf(-1, VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                    value.play();
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    @Override // X.InterfaceC1413540mt6
    public void is0(boolean z) {
        this.LLJLILLLLZIIL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1413540mt6
    public void lA(boolean z) {
        this.LLLJ = z;
    }

    @Override // X.InterfaceC1413540mt6
    public void lz(AVMusic aVMusic) {
        boolean z;
        C1456960o18 stripMusicModel;
        if (aVMusic == null) {
            aVMusic = MusicBeanUtilKt.extractAVMusic(n5().creativeModel.musicBuzModel);
        }
        if (C362370EIp.LIZIZ(n5()) && C362370EIp.LIZJ(n5()) && C0C1H.LIZ() != 1) {
            z = true;
        } else {
            z = false;
        }
        if (aVMusic == null || z || ((stripMusicModel = aVMusic.getStripMusicModel()) != null && stripMusicModel.getStrippedMusic())) {
            w2();
            return;
        }
        n5().creativeModel.audioCopyrightDetectModel.setCopyrightClaimShowing(false);
        String str = n5().creativeModel.musicBuzModel.musicOrigin;
        if (Intrinsics.LJFF(str, "single_song")) {
            this.LLL = aVMusic;
        }
        c3(aVMusic, str);
    }

    public void n7(boolean z) {
        this.LLLILZLLLI = z;
    }

    public void s7(AVMusic aVMusic) {
        this.LLLIZZ = aVMusic;
    }

    @Override // X.InterfaceC1413540mt6
    public void wi1(boolean z) {
        this.LLLJL = z;
    }

    private final void W7(NLEEditor nLEEditor, int i) {
        VecNLETrackSPtr tracks;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        long j = ((long) i) * 1000;
        NLEModel model = nLEEditor.getModel();
        if (model != null && (tracks = model.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (C351220Dpo.LLLFF(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2) || C351220Dpo.LLILLL(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr sortedSlots = ((NLETrack) it2.next()).getSortedSlots();
                if (sortedSlots != null) {
                    for (NLETrackSlot nLETrackSlot : sortedSlots) {
                        if (nLETrackSlot.getEndTime() < j && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
                            long endTime = j - nLETrackSlot.getEndTime();
                            nLETrackSlot.setEndTime(j);
                            nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipEnd() + endTime);
                        }
                    }
                }
            }
        }
        nLEEditor.commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[EDGE_INSN: B:73:0x005c->B:21:0x005c BREAK  A[LOOP:1: B:14:0x0045->B:76:?], EDGE_INSN: B:74:0x005c->B:21:0x005c BREAK  A[LOOP:1: B:14:0x0045->B:76:?]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c3(com.ss.android.ugc.aweme.creative.model.music.AVMusic r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457740o2O.c3(com.ss.android.ugc.aweme.creative.model.music.AVMusic, java.lang.String):void");
    }

    private final void m3(String str, boolean z) {
        Integer num;
        L6();
        HashMap<String, Integer> extraShareOptions = n5().getCreativeFlowData().getExtraShareOptions();
        if ((extraShareOptions == null || (num = extraShareOptions.get("tiktok_videokit_disable_music_selection")) == null || num.intValue() != 1) && !C1428470nHB.LLIIIJ(n5())) {
            VideoPublishEditModel videoPublishEditModelN5 = n5();
            if (!Intrinsics.LJFF("l8_music_edit_cml", videoPublishEditModelN5.mShootWay) && !Intrinsics.LJFF("l8_import", videoPublishEditModelN5.mShootWay)) {
                QS1(str, z);
            }
        }
        if (z) {
            C201955140j.LJIILJJIL(C1457980o2m.LIZIZ, "JDW: AUTO MUSIC: musicActivityDetected start loader");
            C1456980o1A.LIZJ(n5(), new AwS601S0100000_22(this, 405));
        } else {
            S5();
        }
    }

    public final void L7(boolean z, C1457830o2X c1457830o2X) {
        if (z) {
            this.LLILLJJLI.show(c1457830o2X);
            W6();
        }
        this.LLJZ.LJII(new Pair<>(Boolean.valueOf(z), new AwS101S0210000_22(z, this, c1457830o2X, 4)));
    }

    @Override // X.InterfaceC1413540mt6
    public void QS1(final String str, boolean z) {
        long duration;
        boolean z2;
        boolean z3;
        NLEModel nLEModelLIZ;
        boolean z4;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        LiveData<InterfaceC1452170ntP> liveDataG2;
        InterfaceC1452170ntP value2;
        C1458080o2w c1458080o2w = this.LLLIL;
        Context contextP3 = C786410Ut5.P3(getActivity());
        VideoPublishEditModel videoPublishEditModelN5 = n5();
        InterfaceC1455860nzM interfaceC1455860nzMO4 = O4();
        if (interfaceC1455860nzMO4 != null && (liveDataG2 = interfaceC1455860nzMO4.g()) != null && (value2 = liveDataG2.getValue()) != null) {
            duration = value2.getDuration();
        } else {
            duration = 0;
        }
        c1458080o2w.LJ(contextP3, videoPublishEditModelN5, duration, getActivity());
        this.LLLIL.LJ = new AwS136S1100000_22(this, str, 5);
        boolean zBooleanValue = false;
        if (!(O4() instanceof InterfaceC1451050nrb) && !(O4() instanceof InterfaceC572860MdQ)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1458080o2w c1458080o2w2 = this.LLLIL;
        VideoPublishEditModel videoPublishEditModelN52 = n5();
        final VideoPublishEditModel videoPublishEditModelN53 = n5();
        final long j = this.LLLFF;
        final AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 597);
        InterfaceC1455230nyL interfaceC1455230nyL = new InterfaceC1455230nyL(videoPublishEditModelN53, str, j, awS566S0100000_22) { // from class: X.0o2V
            public final VideoPublishEditModel LIZ;
            public final String LIZIZ;
            public final long LIZJ;
            public final Function0<C0EZ1> LIZLLL;

            @Override // X.InterfaceC1455230nyL
            public final MusicBuzModel LIZIZ() {
                return this.LIZ.creativeModel.musicBuzModel;
            }

            @Override // X.InterfaceC1455230nyL
            public final void LIZ(AVMusic aVMusic) {
                C1452640nuA.LJII(aVMusic, false, this.LIZ.creativeModel.musicBuzModel);
                this.LIZ.setMusicOrigin(this.LIZIZ);
                C1457800o2U.LIZ(this.LIZJ, this.LIZ, true);
                C0EZ1 c0ez1Invoke = this.LIZLLL.invoke();
                if (c0ez1Invoke != null) {
                    c0ez1Invoke.kK1(aVMusic);
                }
            }

            {
                this.LIZ = videoPublishEditModelN53;
                this.LIZIZ = str;
                this.LIZJ = j;
                this.LIZLLL = awS566S0100000_22;
            }
        };
        C202045143v c202045143v = C202045143v.LIZ;
        VideoPublishEditModel videoPublishEditModelN54 = n5();
        c202045143v.getClass();
        if (C202045143v.LIZ(videoPublishEditModelN54) && C298220BmW.LIZ() && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C1430550nKX.LIZLLL(n5())) {
            zBooleanValue = ((Boolean) C0B9X.LIZ.getValue()).booleanValue();
        } else if ((C202045143v.LIZ(n5()) && ((C298150BmP.LIZ() == 1 || C298150BmP.LIZ() == 3) && !z2)) || ((C280940Azk.LIZ() == 1 || C280940Azk.LIZ() == 3) && z2)) {
            zBooleanValue = true;
        }
        InterfaceC1455860nzM interfaceC1455860nzMO42 = O4();
        if (interfaceC1455860nzMO42 != null && (liveDataG = interfaceC1455860nzMO42.g()) != null && (value = liveDataG.getValue()) != null) {
            nLEModelLIZ = C352130DrH.LIZ(value);
        } else {
            nLEModelLIZ = null;
        }
        C11JN c11jnLJI = C1458080o2w.LJI(c1458080o2w2, videoPublishEditModelN52, interfaceC1455230nyL, z, z3, zBooleanValue, nLEModelLIZ, 136);
        n5();
        C09JN<AVMusic> c09jn = new C09JN<AVMusic>() { // from class: X.0o2j
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(AVMusic aVMusic) {
                C1C7U.LIZ("LoadMusicOnNext@b05b.accept");
                C1C7U.LIZIZ("LoadMusicOnNext@b05b.accept");
            }
        };
        final VideoPublishEditModel videoPublishEditModelN55 = n5();
        final long j2 = this.LLLFF;
        InterfaceC420801kM interfaceC420801kMLJJLL = c11jnLJI.LJJLL(c09jn, new C09JN<Throwable>(j2, videoPublishEditModelN55) { // from class: X.0o2h
            public final VideoPublishEditModel LL;
            public final long LLILLJJLI;

            @Override // X.C09JN
            public final void accept(Throwable th) {
                C1C7U.LIZ("LoadMusicOnError@a30e.accept");
                C1457800o2U.LIZ(this.LLILLJJLI, this.LL, false);
                C1C7U.LIZIZ("LoadMusicOnError@a30e.accept");
            }

            {
                this.LL = videoPublishEditModelN55;
                this.LLILLJJLI = j2;
            }
        });
        if (this.LLLILZ.LLILLJJLI) {
            this.LLLILZ = new C11NJ();
        }
        this.LLLILZ.LIZ(interfaceC420801kMLJJLL);
        C1458080o2w c1458080o2w3 = this.LLLIL;
        synchronized (c1458080o2w3) {
            z4 = c1458080o2w3.LIZ;
        }
        if (z4) {
            if (B3(str)) {
                LJ();
                return;
            }
            return;
        }
        w2();
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    public static final void u6(C1457740o2O c1457740o2O, boolean z, String str) {
        if (C1428470nHB.LJJJJZI(c1457740o2O.n5())) {
            str = C1412490mrP.LIZIZ(c1457740o2O.n5());
        }
        c1457740o2O.m3(str, z);
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

    public C1457740o2O(C1DRG c1drg, C19A3 c19a3, int i, boolean z, boolean z2, boolean z3) {
        InterfaceC366450EYh interfaceC366450EYh;
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = z3;
        this.LLILZLL = this;
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578500MmW.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457660o2G.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1459020o4S.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457960o2k.class, null);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 595));
        this.LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 596));
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457820o2W.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC524270KhF.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1459480o5C.class, null);
        h0<String> h0Var = new h0<>("");
        this.LLJJL = h0Var;
        Boolean bool = Boolean.TRUE;
        h0<Boolean> h0Var2 = new h0<>(bool);
        this.LLJJLIIIJLLLLLLLZ = h0Var2;
        h0<TextUtils.TruncateAt> h0Var3 = new h0<>(TextUtils.TruncateAt.MIDDLE);
        this.LLJL = h0Var3;
        Boolean bool2 = Boolean.FALSE;
        h0<Boolean> h0Var4 = new h0<>(bool2);
        this.LLJLIL = h0Var4;
        h0<Boolean> h0Var5 = new h0<>(bool2);
        this.LLJLILLLLZIIL = h0Var5;
        h0<Boolean> h0Var6 = new h0<>(bool);
        this.LLJLL = h0Var6;
        h0<Integer> h0Var7 = new h0<>(0);
        this.LLJLLIL = h0Var7;
        h0<Boolean> h0Var8 = new h0<>(bool2);
        this.LLJLLL = h0Var8;
        h0<Pair<Boolean, Function0<Unit>>> h0Var9 = new h0<>(null);
        this.LLJZ = h0Var9;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 686));
        h0<Boolean> h0Var10 = new h0<>(Boolean.valueOf(z2));
        this.LLLF = h0Var10;
        this.LLLFF = System.currentTimeMillis();
        this.LLLFFI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(214));
        this.LLLFZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453610nvj.class, null);
        this.LLLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457990o2n.class, null);
        this.LLLII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457820o2W.class, null);
        this.LLLIIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1415760mwg.class, null);
        this.LLLIIIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417110myr.class, null);
        C1DRG diContainer = getDiContainer();
        if (diContainer != null) {
            interfaceC366450EYh = (InterfaceC366450EYh) diContainer.LJIIL(null, InterfaceC366450EYh.class);
        } else {
            interfaceC366450EYh = null;
        }
        this.LLLIIIL = interfaceC366450EYh;
        C1457760o2Q c1457760o2Q = new C1457760o2Q();
        c1457760o2Q.LIZ = h0Var;
        c1457760o2Q.LIZJ = h0Var3;
        c1457760o2Q.LIZIZ = h0Var2;
        c1457760o2Q.LIZLLL = h0Var4;
        c1457760o2Q.LJ = h0Var5;
        c1457760o2Q.LJFF = h0Var6;
        c1457760o2Q.LJI = h0Var8;
        c1457760o2Q.LJIIJ = new C1457900o2e(this);
        c1457760o2Q.LJIIJJI = new AwS566S0100000_22(this, 599);
        new C1457910o2f(this);
        new C1457920o2g(this);
        c1457760o2Q.LJII = h0Var7;
        c1457760o2Q.LJIIIIZZ = h0Var9;
        c1457760o2Q.LJIIIZ = h0Var10;
        c1457760o2Q.LJIIL = new AwS566S0100000_22(this, 594);
        c1457760o2Q.LJIILIIL = new C1457870o2b(this);
        this.LLLIIL = c1457760o2Q;
        this.LLLIL = new C1458080o2w();
        this.LLLILZ = new C11NJ();
        this.LLLILZJ = new h0<>(new Pair(bool2, null));
        this.LLLJ = true;
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

    public /* synthetic */ C1457740o2O(C1DRG c1drg, C19A3 c19a3, int i, boolean z, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1drg, c19a3, i, z, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3);
    }

    public <S extends C004I, A, B, C, D, E> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C11EA.LIZJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, interfaceC1685430txd);
    }
}
