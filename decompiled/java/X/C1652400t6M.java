package X;

import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.AObserverS227S0100000_25;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.refine.ICreativeRefineService;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService;
import com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicController;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS140S1200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0t6M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1652400t6M extends AbstractC2255721DQs<InterfaceC1628590sTx> implements InterfaceC1166920gTK, InterfaceC1628590sTx, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C1458930o4J LLILLL;
    public final InterfaceC1731706qJ LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public RecordChooseMusicController LLJJI;
    public AVMusic LLJJIII;
    public final C560530Lyd<Unit> LLJJIJI;
    public final C560530Lyd<Unit> LLJJIJIIJIL;
    public final h0<Boolean> LLJJIJIL;
    public final C385670FAf<Boolean> LLJJJ;
    public Pair<? extends Effect, Boolean> LLJJJIL;
    public AVMusic LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public Integer LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C385670FAf<Pair<AVMusic, String>> LLJL;
    public final C385670FAf<Boolean> LLJLIL;
    public final InterfaceC1652370t6J LLJLILLLLZIIL;

    private final boolean w2() {
        return true;
    }

    public boolean E5() {
        return false;
    }

    public C1652400t6M G2() {
        return this;
    }

    public boolean P4() {
        return false;
    }

    public boolean T4() {
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

    public void n5() {
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        z4();
        D5(new RecordChooseMusicController(this.LLILLJJLI, this.LL, getActivity(), T2(), getStickerApiComponent(this), this, getShortVideoContext(), C1447800nmM.LIZIZ(this.LL), E3(), c3()));
        registerObservers();
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1652400t6M.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1652400t6M.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1652400t6M.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1652400t6M.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1652400t6M.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1652400t6M.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1652400t6M.class, "recentMusicApi", "getRecentMusicApi()Lcom/ss/android/ugc/aweme/tools/music/music/recent/components/RecentMusicAddApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1652400t6M.class, "musicPlayApiComponent", "getMusicPlayApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/play/MusicPlayApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1652400t6M.class, "musicCutComponent", "getMusicCutComponent()Lcom/ss/android/ugc/gamora/recorder/musiccut/MusicCutApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1652400t6M.class, "singleSongMusicLoadApi", "getSingleSongMusicLoadApi()Lcom/ss/android/ugc/gamora/recorder/choosemusic/SingleSongMusicLoadComponentApi;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
    }

    private final InterfaceC1453610nvj E3() {
        return (InterfaceC1453610nvj) this.LLJI.getValue(this, LLJLL[6]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.LLIZ.getValue(this, LLJLL[3]);
    }

    private final C1649860t2G i3() {
        return (C1649860t2G) this.LLJJJJLIIL.getValue();
    }

    public final InterfaceC1652470t6T B3() {
        return (InterfaceC1652470t6T) this.LLJIJIL.getValue(this, LLJLL[7]);
    }

    public final InterfaceC1624370sN9 H3() {
        return (InterfaceC1624370sN9) this.LLJILLL.getValue();
    }

    public final RecordChooseMusicController O3() {
        RecordChooseMusicController recordChooseMusicController = this.LLJJI;
        if (recordChooseMusicController != null) {
            return recordChooseMusicController;
        }
        return null;
    }

    @Override // X.InterfaceC1628590sTx
    public void P3() {
        this.LLILLL.LJ.LJIIJ(null);
    }

    public final e0 T2() {
        return (e0) this.LLILZIL.getValue(this, LLJLL[1]);
    }

    public final C1458920o4I e4() {
        return (C1458920o4I) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILZ.getValue(this, LLJLL[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJ.getValue(this, LLJLL[5]);
    }

    public final InterfaceC577340Mke getSingleSongMusicLoadApi() {
        return (InterfaceC577340Mke) this.LLJILJILJ.getValue(this, LLJLL[9]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0 iq() {
        return (com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0) this.LLILZLL.getValue(this, LLJLL[2]);
    }

    @Override // X.InterfaceC1628590sTx
    public void l5() {
        this.LLILLL.LJIILIIL.LJIIJ(null);
    }

    @Override // X.InterfaceC1628590sTx
    public LiveEvent<Boolean> pz0() {
        return this.LLILLL.LJII;
    }

    public void registerObservers() {
        q stickerApiComponent;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLIZ;
        LiveEvent<Boolean> liveEventDN1;
        LiveData<Boolean> liveDataJ41;
        C385670FAf<Boolean> c385670FAfUU;
        this.LLILLL.LJIILJJIL.LIZ(this, new AObjectS246S0100000_25(this, 400));
        T2().bu2().LIZ(this, new AObjectS246S0100000_25(this, 401));
        iq().xk1().LJ(this, new AObjectS246S0100000_25(this, 402));
        iq().zx2().LIZ(this, new AObjectS246S0100000_25(this, 403));
        getRecordModeApi().CP1().LIZ(this, new AObjectS246S0100000_25(this, 404));
        this.LLILLL.LJIIIIZZ.LIZ(this, new AObjectS246S0100000_25(this, 405));
        this.LLILLL.LJIIIZ.LIZ(this, new AObjectS246S0100000_25(this, 406));
        this.LLILLL.LJIILLIIL.LIZ(this, new AObjectS246S0100000_25(this, 407));
        T2().St2().K0(new InterfaceC2253851DJn() { // from class: X.0t6X
            @Override // X.InterfaceC2253851DJn
            public final void LIZIZ(int i) {
            }

            @Override // X.InterfaceC2253851DJn
            public final void LIZ(int i) {
                C01TT.LIZLLL(new AwS569S0100000_25(this.LIZ, 532));
            }
        });
        if (M5()) {
            C1661180tKW.LIZ.getClass();
            C1661180tKW.LIZJ.LIZ(this, new AObjectS246S0100000_25(this, 397));
            InterfaceC577340Mke singleSongMusicLoadApi = getSingleSongMusicLoadApi();
            if (singleSongMusicLoadApi != null && (c385670FAfUU = singleSongMusicLoadApi.uU()) != null) {
                c385670FAfUU.LIZ(this, new AObjectS246S0100000_25(this, 398));
            }
        }
        q stickerApiComponent2 = getStickerApiComponent(this);
        if (stickerApiComponent2 != null && (liveDataJ41 = stickerApiComponent2.j41()) != null) {
            liveDataJ41.observe(this, new AObserverS227S0100000_25(this, 48));
        }
        q stickerApiComponent3 = getStickerApiComponent(this);
        if (stickerApiComponent3 != null && (liveEventDN1 = stickerApiComponent3.dN1()) != null) {
            liveEventDN1.LIZ(this, new AObjectS246S0100000_25(this, 399));
        }
        C578010Mlj.LIZ = false;
        if (C1399570mWZ.LIZ() && (stickerApiComponent = getStickerApiComponent(this)) != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLIZ = interfaceC1625470sOvLJII.LIZ()) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS227S0100000_25(this, 49));
        }
        v5();
        H4();
    }

    public final InterfaceC1652770t6x v3() {
        return (InterfaceC1652770t6x) this.LLJILJIL.getValue(this, LLJLL[8]);
    }

    @Override // X.InterfaceC1628590sTx
    public void xt() {
        this.LLILLL.LJIIL.LJIIJ(null);
    }

    @Override // X.InterfaceC1628590sTx
    public String zl1() {
        String musicId;
        AVMusic aVMusic = this.LLJJIII;
        if (aVMusic == null || (musicId = aVMusic.getMusicId()) == null || !M5()) {
            return null;
        }
        return musicId;
    }

    private final long H2() {
        BackgroundVideo backgroundVideo = getShortVideoContext().cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo != null) {
            return backgroundVideo.getMaxDuration();
        }
        return 0L;
    }

    private final void H4() {
        MusicContent musicContent;
        if (getShortVideoContext().LJJLL() || TextUtils.equals(getShortVideoContext().shootWay, "upload_anchor")) {
            return;
        }
        if (Intrinsics.LJFF("anchor_combine_tts", getShortVideoContext().shootWay)) {
            getShortVideoContext().creativeModel.musicBuzModel.cancelAbleInShoot = true;
        }
        getShortVideoContext().creativeModel.musicBuzModel.isBestMatch = false;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            Bundle bundleLIZIZ = C565520MFy.LIZIZ(this.LL);
            if (k5(bundleLIZIZ != null ? (Effect) bundleLIZIZ.getParcelable("first_sticker") : null, aVMusicExtractAVMusic)) {
                C1452640nuA.LJII(null, false, getShortVideoContext().creativeModel.musicBuzModel);
                InterfaceC1624370sN9 interfaceC1624370sN9H3 = H3();
                if (interfaceC1624370sN9H3 != null) {
                    interfaceC1624370sN9H3.TC2(false);
                    return;
                }
                return;
            }
            if (M5()) {
                this.LLJJIII = aVMusicExtractAVMusic;
            }
            FO1(aVMusicExtractAVMusic, getShortVideoContext().LJIIJJI());
            H5();
            e0 e0VarT2 = T2();
            if ((e0VarT2 instanceof e0) && e0VarT2 != null) {
                Boolean bool = Boolean.TRUE;
                e0VarT2.Mu0(bool, bool);
            }
            d5(getShortVideoContext().shootWay, aVMusicExtractAVMusic);
            if (getShortVideoContext().greenScreenKitConfig == null || (musicContent = getShortVideoContext().shareContext.mMusicContent) == null || !Intrinsics.LJFF(musicContent.musicId, aVMusicExtractAVMusic.getMusicId())) {
                return;
            }
            qt(aVMusicExtractAVMusic, aVMusicExtractAVMusic.path);
        }
    }

    private final void H5() {
        AVMusic aVMusicExtractAVMusic;
        Bundle bundleLIZIZ;
        Effect effect;
        String string;
        EditEffectAnchorManager data;
        if (getShortVideoContext() != null && getShortVideoContext().LJJIJLIJ()) {
            Bundle bundleLIZIZ2 = C565520MFy.LIZIZ(this.LL);
            Effect effect2 = bundleLIZIZ2 != null ? (Effect) bundleLIZIZ2.getParcelable("first_sticker") : null;
            boolean z = (C545820Lau.LIZIZ(this.LL) == null || bundleLIZIZ2 == null || (string = bundleLIZIZ2.getString("extra_edit_effect_uid")) == null || (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string)) == null) ? false : !data.isEditProp();
            if (C1624200sMs.LJIIIIZZ(effect2)) {
                return;
            }
            getShortVideoContext().LJJLIIIJLJLI();
            if (!z) {
                nv(1);
            }
            n5();
            if ((!Intrinsics.LJFF("prop_reuse", getShortVideoContext().shootWay) && !Intrinsics.LJFF("prop_page", getShortVideoContext().shootWay)) || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) == null || (bundleLIZIZ = C565520MFy.LIZIZ(this.LL)) == null || (effect = (Effect) bundleLIZIZ.getParcelable("first_sticker")) == null) {
                return;
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
            c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("music_id", aVMusicExtractAVMusic.getMusicId());
            c0lab.LJ("prop_id", effect.getEffectId());
            c0lab.LJ("group_id", EnumC584350Mvx.INSTANCE.getVideoId());
            C20684815ws.LJIILLIIL("prop_music_show", c0lab.LIZ);
        }
    }

    private final boolean K4() {
        BackgroundVideo backgroundVideo = getShortVideoContext().cameraComponentModel.curBackgroundVideo;
        return (backgroundVideo == null || backgroundVideo.isMultiBgVideo()) ? false : true;
    }

    private final boolean O4() {
        BackgroundVideo backgroundVideo = getShortVideoContext().cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo != null) {
            return backgroundVideo.isDefaultBgVideo();
        }
        return false;
    }

    private final void z4() {
        if (!C1647240sy2.LIZ().unifyPreloadTasks && C563640M8s.LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C527830Kmz(null), 3);
        }
        F4();
    }

    public final void C5() {
        AVMusic aVMusicExtractAVMusic;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_reset_shoot_tab_ui_after_choose_music", true, false) && !getShortVideoContext().LJJJJLL()) {
            Integer num = this.LLJJL;
            if (num != null) {
                this.LLJJL = null;
                if (num.intValue() != 10 && num.intValue() != 11 && num.intValue() != 18) {
                    return;
                }
                String bottomTabTag = C0CHQ.LIZ().LJJJJJ().getBottomTabTag(num.intValue(), getShortVideoContext());
                String string = getActivity().getString(C0CHQ.LIZ().LJJJJJ().getTabNameResId(num.intValue(), getShortVideoContext()));
                C201962140q c201962140q = C201962140q.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resetShootTabUI restore-->recoverShootMode:");
                sbLIZ.append(num);
                sbLIZ.append(" oldBottomTabName:");
                sbLIZ.append(string);
                C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
                IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
                if (iBottomTabChangeService != null) {
                    if (bottomTabTag == null) {
                        bottomTabTag = "";
                    }
                    iBottomTabChangeService.LJ(new C1646670sx7(bottomTabTag, string, null));
                }
            }
            if (getShortVideoContext().shootMode == 8 || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) == null) {
                return;
            }
            if (C1458070o2v.LJ(getShortVideoContext().creativeModel.musicBuzModel) && (getShortVideoContext().shootMode == 10 || getShortVideoContext().shootMode == 11)) {
                return;
            }
            if (!(C1458070o2v.LJ(getShortVideoContext().creativeModel.musicBuzModel) && aVMusicExtractAVMusic.isUnlimitedMusic()) && getShortVideoContext().cameraComponentModel.mMaxDuration < C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(!getShortVideoContext().cameraComponentModel.mCurrentDurationMode, getShortVideoContext())) {
                if (getShortVideoContext().shootMode == 10 || getShortVideoContext().shootMode == 11 || getShortVideoContext().shootMode == 18) {
                    String bottomTabTag2 = C0CHQ.LIZ().LJJJJJ().getBottomTabTag(getShortVideoContext().shootMode, getShortVideoContext());
                    long j = getShortVideoContext().cameraComponentModel.mMaxDuration;
                    long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    long j3 = ((int) (j / j2)) == 59 ? 60L : getShortVideoContext().cameraComponentModel.mMaxDuration / j2;
                    this.LLJJL = Integer.valueOf(getShortVideoContext().shootMode);
                    C201962140q c201962140q2 = C201962140q.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("resetShootTabUI update-->bottomTabTag:");
                    sbLIZ2.append(bottomTabTag2);
                    sbLIZ2.append(" maxDurationValue:");
                    sbLIZ2.append(j3);
                    sbLIZ2.append(" shootMode:");
                    sbLIZ2.append(getShortVideoContext().shootMode);
                    C201955140j.LIZJ(c201962140q2, C2188811AlT.LIZIZ(sbLIZ2));
                    IBottomTabChangeService iBottomTabChangeService2 = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
                    if (iBottomTabChangeService2 != null) {
                        iBottomTabChangeService2.LJ(new C1646670sx7(bottomTabTag2 != null ? bottomTabTag2 : "", getActivity().getString(2131845836, Long.valueOf(j3)), new C1646680sx8(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)))));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1628590sTx
    public void Ev() {
        C1443960ngA.LIZIZ(getShortVideoContext());
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "remove_music_preview", true, true)) {
            ld2();
        }
        if (!O4()) {
            long jH2 = H2();
            if (jH2 > 0 && K4()) {
                getShortVideoContext().LJJLIIIJJI(Math.min(getShortVideoContext().cameraComponentModel.mMaxDuration, jH2));
            }
        }
        iq().ht1(new C531060KsC(getShortVideoContext().cameraComponentModel.mMaxDuration));
        Jn();
        FO1(null, null);
        InterfaceC1624370sN9 interfaceC1624370sN9H3 = H3();
        if (interfaceC1624370sN9H3 != null) {
            interfaceC1624370sN9H3.TC2(false);
        }
        C5();
    }

    public final void F4() {
        AVMusic aVMusicExtractAVMusic;
        C5();
        if (C13LQ.LJJIJIIJI(getShortVideoContext().shootWay, new String[]{"single_song", "followup_square", "prop_page", "anchor_combine_prop"}) < 0 || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) == null) {
            return;
        }
        if (C1458070o2v.LIZIZ()) {
            if (C1652380t6K.LIZ(getShortVideoContext())) {
                T2().pw0().isLoopSwitchOnByMusic = true;
            } else {
                T2().pw0().isLoopSwitchOnByMusic = false;
            }
            T2().pw0().maxMusicLoopDuration = C1442040nd4.LIZ(getShortVideoContext(), 0, null);
            getShortVideoContext().creativeModel.musicBuzModel.originalMusicStartFromFollowup = aVMusicExtractAVMusic.getMusicStart();
            getShortVideoContext().creativeModel.musicBuzModel.originalMusicEndFromFollowup = aVMusicExtractAVMusic.getMusicEndTime();
        }
        if (C1452500ntw.LIZ()) {
            getShortVideoContext().creativeModel.musicBuzModel.originalMusicStartFromFollowup = aVMusicExtractAVMusic.getMusicStart();
            getShortVideoContext().creativeModel.musicBuzModel.originalMusicEndFromFollowup = aVMusicExtractAVMusic.getMusicEndTime();
        }
    }

    @Override // X.InterfaceC1628590sTx
    public void Jn() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        Effect effectLLILIL;
        q stickerApiComponent = getStickerApiComponent(this);
        if (stickerApiComponent != null && (effectLLILIL = stickerApiComponent.C0().LLILIL()) != null && C1624200sMs.LJIILIIL(effectLLILIL)) {
            W2().LJLL();
        }
        InterfaceC1652470t6T interfaceC1652470t6TB3 = B3();
        if (interfaceC1652470t6TB3 != null) {
            q stickerApiComponent2 = getStickerApiComponent(this);
            interfaceC1652470t6TB3.NW((stickerApiComponent2 == null || (interfaceC1624480sNKC0 = stickerApiComponent2.C0()) == null) ? null : interfaceC1624480sNKC0.LLILIL(), false);
        }
        C1452640nuA.LJII(null, false, getShortVideoContext().creativeModel.musicBuzModel);
        W2().setMusicPath("");
        W2().vh(0L, 0L, -1L, -1, "", false);
        W2().E4(false);
        q stickerApiComponent3 = getStickerApiComponent(this);
        if (stickerApiComponent3 != null) {
            stickerApiComponent3.e62();
        }
        getShortVideoContext().LJJLIIIJ(0);
        getShortVideoContext().cameraComponentModel.mMusicStart = 0;
        this.LLJJJJ = null;
        getShortVideoContext().cameraComponentModel.mWorkspace.wQ();
        getShortVideoContext().cameraComponentModel.mMusicPath = null;
        getShortVideoContext().musicWaveBean = null;
        q stickerApiComponent4 = getStickerApiComponent(this);
        if (stickerApiComponent4 != null) {
            C1622510sK9.LIZIZ(stickerApiComponent4, C1DPV.LIZIZ.LIZIZ(C1DPW.AUDIO_RECORD_OPEN_CANCEL_MUSIC, null));
        }
        this.LLJJIJIIJIL.LJIIJ(Unit.LIZ);
        if (!getShortVideoContext().cameraComponentModel.mDurationSwitchable) {
            iq().l72(getShortVideoContext().cameraComponentModel.mCurrentDurationMode, false);
        }
        e0 e0VarT2 = T2();
        if ((e0VarT2 instanceof e0) && e0VarT2 != null) {
            Boolean bool = Boolean.FALSE;
            e0VarT2.Mu0(bool, bool);
        }
        Hs0(false);
    }

    public final boolean M5() {
        ShootExtraData shootExtraData;
        return C298080BmI.LIZ() && (shootExtraData = getShortVideoContext().creativeFlowData.getShootExtraData()) != null && Intrinsics.LJFF(shootExtraData.getDownloadMusicInBackground(), Boolean.TRUE);
    }

    @Override // X.InterfaceC1628590sTx
    public InterfaceC20500415Jq N0() {
        return O3().LIZ();
    }

    public final Scene Q3() {
        return e4();
    }

    @Override // X.InterfaceC1628590sTx
    public boolean Sh2() {
        return getShortVideoContext().cameraComponentModel.mWorkspace.getMusicPath() != null;
    }

    @Override // X.InterfaceC1628590sTx
    public void U1() {
        InterfaceC1459070o4X interfaceC1459070o4X = O3().LLJJIJIIJIL;
        if (interfaceC1459070o4X != null) {
            interfaceC1459070o4X.U1();
        }
    }

    public final InterfaceC2254081DKk W2() {
        return T2().St2();
    }

    public final void Z1() {
        InterfaceC21363518j3 interfaceC21363518j3Wt2;
        q stickerApiComponent = getStickerApiComponent(this);
        if (stickerApiComponent == null || (interfaceC21363518j3Wt2 = stickerApiComponent.wt2()) == null) {
            return;
        }
        interfaceC21363518j3Wt2.LJIIIIZZ();
    }

    @Override // X.InterfaceC1628590sTx
    public int ZR() {
        return C1442040nd4.LIZ(getShortVideoContext(), 0, null);
    }

    @Override // X.InterfaceC1628590sTx
    public boolean isMusicLoop() {
        return C1458070o2v.LJ(getShortVideoContext().creativeModel.musicBuzModel);
    }

    @Override // X.InterfaceC1628590sTx
    public void ld2() {
        W2().LJLL();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        IMusicExternalService iMusicExternalService;
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        super.onDestroy();
        RecordChooseMusicController recordChooseMusicControllerO3 = O3();
        recordChooseMusicControllerO3.LIZ().LJIIIZ();
        recordChooseMusicControllerO3.LLJJJ = false;
        if ((((Boolean) C283520B9i.LIZ.getValue()).booleanValue() || C298150BmP.LIZIZ()) && (iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null)) != null && (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) != null) {
            interfaceC1662290tMJLIZJ.LJIIIIZZ();
        }
        C1654360t9W.LIZ = false;
        C578010Mlj.LIZ = false;
        this.LLJJL = null;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        RecordChooseMusicController recordChooseMusicControllerO3 = O3();
        recordChooseMusicControllerO3.LIZ().LJIIIZ();
        recordChooseMusicControllerO3.LLJJJ = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (getShortVideoContext().LJJJJZI()) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic == null) {
                return;
            }
            if (aVMusicExtractAVMusic.isLocalMusic()) {
                if (!C2486109oh.LIZLLL(C1664590tQ1.LJIIIZ(this), getShortVideoContext().cameraComponentModel.mWorkspace.getMusicPath())) {
                    FO1(null, null);
                    C1452640nuA.LJ(getShortVideoContext().creativeModel.musicBuzModel);
                    i3().LIZ(C1421090n5H.LIZ(Boolean.TRUE, null, null, null, null, true, null, -1L, LivePreviewCTASmartDisplayManager.DEFAULT, false));
                }
            }
        }
        O3().LJII();
    }

    @Override // X.InterfaceC1628590sTx
    public void qP0() {
        e0 e0VarT2 = T2();
        if (!(e0VarT2 instanceof e0) || e0VarT2 == null) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        e0VarT2.Mu0(bool, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, X.0no1] */
    public final void v5() {
        AVMusic aVMusicExtractAVMusic;
        h0 h0VarP7;
        C560530Lyd bottomTabIndexChangeEvent;
        C560530Lyd bottomTabIndexChangeEvent2;
        C560530Lyd bottomTabIndexChangeEvent3;
        C560530Lyd bottomTabIndexChangeEvent4;
        T tLJI = 0;
        tLJI = 0;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_reset_shoot_tab_ui_after_choose_music", true, false)) {
            C259800zU c259800zU = new C259800zU();
            IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
            c259800zU.element = (iBottomTabChangeService == null || (bottomTabIndexChangeEvent4 = iBottomTabChangeService.getBottomTabIndexChangeEvent()) == null) ? 0 : bottomTabIndexChangeEvent4.LJI();
            IBottomTabChangeService iBottomTabChangeService2 = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
            if (iBottomTabChangeService2 != null && (bottomTabIndexChangeEvent3 = iBottomTabChangeService2.getBottomTabIndexChangeEvent()) != null) {
                bottomTabIndexChangeEvent3.LJII(this, Lifecycle.State.CREATED, new AObjectS306S0200000_25(this, (C1652400t6M) c259800zU, (C259800zU<Object>) 13));
            }
        }
        if (C1458070o2v.LIZIZ()) {
            this.LLJJJJJIL = true;
            C259800zU c259800zU2 = new C259800zU();
            IBottomTabChangeService iBottomTabChangeService3 = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
            if (iBottomTabChangeService3 != null && (bottomTabIndexChangeEvent2 = iBottomTabChangeService3.getBottomTabIndexChangeEvent()) != null) {
                tLJI = bottomTabIndexChangeEvent2.LJI();
            }
            c259800zU2.element = tLJI;
            IBottomTabChangeService iBottomTabChangeService4 = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
            if (iBottomTabChangeService4 != null && (bottomTabIndexChangeEvent = iBottomTabChangeService4.getBottomTabIndexChangeEvent()) != null) {
                bottomTabIndexChangeEvent.LJII(this, Lifecycle.State.CREATED, new AObjectS306S0200000_25(this, (C1652400t6M) c259800zU2, (C259800zU<Object>) 14));
            }
        }
        if (C1458070o2v.LJFF()) {
            if (!Intrinsics.LJFF(getShortVideoContext().shootWay, "draft_again")) {
                C1452640nuA c1452640nuA = C1452640nuA.LIZ;
                MusicBuzModel musicBuzModel = getShortVideoContext().creativeModel.musicBuzModel;
                int iLIZLLL = C1458070o2v.LIZLLL();
                c1452640nuA.getClass();
                C1452640nuA.LJIIIZ(musicBuzModel, true, iLIZLLL);
            }
            iq().me2().LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 393));
            IBottomTabChangeService iBottomTabChangeService5 = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
            if (iBottomTabChangeService5 != null && (h0VarP7 = iBottomTabChangeService5.P7()) != null) {
                h0VarP7.LIZ(this, new AObjectS246S0100000_25(this, 394));
            }
        }
        if (C1399570mWZ.LIZ() || !C1458070o2v.LIZIZ()) {
            return;
        }
        if (C13LQ.LJJIJIIJI(getShortVideoContext().shootWay, new String[]{"single_song", "followup_square", "prop_page"}) < 0 || getShortVideoContext().mIsFromDraft || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) == null) {
            return;
        }
        if (Intrinsics.LJFF(aVMusicExtractAVMusic.getMusicSelectedFrom(), "single_song") || Intrinsics.LJFF(aVMusicExtractAVMusic.getMusicSelectedFrom(), "prop_auto")) {
            final long jLIZ = C579120MnW.LIZ(aVMusicExtractAVMusic, getShortVideoContext().getMusicPath());
            final C259800zU c259800zU3 = new C259800zU();
            c259800zU3.element = EnumC1448830no1.NONE;
            final C118300cf c118300cf = new C118300cf();
            LiveEvent<C1448290nn9> liveEventEP = iq().EP();
            Lifecycle.State state = Lifecycle.State.CREATED;
            liveEventEP.LJII(this, state, new AObjectS246S0100000_25(c259800zU3, 395));
            iq().cJ0().LJII(this, state, new AObjectS246S0100000_25(c118300cf, 396));
            final C013C c013c = new C013C();
            iq().xk1().LIZ(this, new InterfaceC1441305kZ() { // from class: X.0t26
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    C1649650t1v c1649650t1v = (C1649650t1v) obj;
                    AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(this.LL.getShortVideoContext().creativeModel.musicBuzModel);
                    if (aVMusicExtractAVMusic2 != null) {
                        if (!Intrinsics.LJFF(aVMusicExtractAVMusic2.getMusicSelectedFrom(), "single_song") && !Intrinsics.LJFF(aVMusicExtractAVMusic2.getMusicSelectedFrom(), "prop_auto")) {
                            return;
                        }
                        if ((c259800zU3.element != EnumC1448830no1.CLICK && c118300cf.element <= 0) || c1649650t1v == null) {
                            return;
                        }
                        long j = c1649650t1v.LIZIZ;
                        if (j <= 0 || j < jLIZ) {
                            return;
                        }
                        C013C c013c2 = c013c;
                        if (c013c2.element) {
                            return;
                        }
                        c013c2.element = true;
                        this.LL.iq().Db2("from singlesong music");
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1628590sTx
    public boolean vd1() {
        return Intrinsics.LJFF(Gx().LIZJ(), Boolean.TRUE);
    }

    public final void x5() {
        if (MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel) == null || TextUtils.isEmpty(getShortVideoContext().cameraComponentModel.mMusicPath)) {
            return;
        }
        i3().LIZ(C1421090n5H.LIZ(Boolean.FALSE, getShortVideoContext().LJIIJJI(), MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel), getShortVideoContext().cameraComponentModel.mMusicPath, null, false, null, -1L, LivePreviewCTASmartDisplayManager.DEFAULT, false));
    }

    @Override // X.InterfaceC1628590sTx
    public C385670FAf<Boolean> Gx() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1628590sTx
    public /* bridge */ /* synthetic */ LiveEvent Vk() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1628590sTx
    public C385670FAf<Pair<AVMusic, String>> Vz1() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1628590sTx
    public /* bridge */ /* synthetic */ LiveEvent Wv() {
        return this.LLJJIJI;
    }

    public InterfaceC1652370t6J c3() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        G2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    public C560530Lyd<Unit> m3() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC1628590sTx
    public Pair<Effect, Boolean> mF0() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1628590sTx
    public AVMusic mr0() {
        return this.LLJJJJ;
    }

    public final C1458930o4J o4() {
        return this.LLILLL;
    }

    public C560530Lyd<Unit> q3() {
        return this.LLJJIJIIJIL;
    }

    public C385670FAf<Boolean> sK0() {
        return this.LLJLIL;
    }

    public static final q getStickerApiComponent(C1652400t6M c1652400t6M) {
        return (q) c1652400t6M.LLIZLLLIL.getValue(c1652400t6M, LLJLL[4]);
    }

    private final void o2(boolean z) {
        this.LLILLL.LJIILL.LJII(Boolean.valueOf(z));
    }

    public final void D5(RecordChooseMusicController recordChooseMusicController) {
        this.LLJJI = recordChooseMusicController;
    }

    @Override // X.InterfaceC1628590sTx
    public void Ez2(boolean z) {
        this.LLILLL.LJII.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1628590sTx
    public void Hs0(boolean z) {
        this.LLILLL.LJIIJ.LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1628590sTx
    public void JC1(boolean z) {
        AVMusic aVMusicExtractAVMusic;
        if (!getShortVideoContext().cameraComponentModel.LJII() && !C1443960ngA.LIZJ(getShortVideoContext())) {
            if (z) {
                aVMusicExtractAVMusic = getShortVideoContext().musicBeforeRetake;
            } else {
                aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
            }
            FO1(aVMusicExtractAVMusic, null);
        } else {
            FO1(null, null);
            o2(false);
        }
        y5(false);
        Yj(false);
    }

    @Override // X.InterfaceC1628590sTx
    public void Yj(boolean z) {
        this.LLILLL.LJFF.LJII(Boolean.valueOf(z));
    }

    public final void Z4(boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", "video");
        c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
        c0lab.LJ("music_id", getShortVideoContext().getMusicId());
        c0lab.LJFF("play_status", z);
        C20684815ws.LJIILLIIL("click_play_music", c0lab.LIZ);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    @Override // X.InterfaceC1628590sTx
    public void hE(boolean z) {
        this.LLJJIJIL.LJII(Boolean.valueOf(z));
    }

    public void mQ0(boolean z) {
        W2().t1();
    }

    @Override // X.InterfaceC1628590sTx
    public void nc1(boolean z) {
        boolean zLJI = MethodIDManager.LJI(72053);
        if (getShortVideoContext().cameraComponentModel.isEditorProRecordMode && getShortVideoContext().cameraComponentModel.editorProRecordEnableMusic && C537970L7z.LIZLLL(getShortVideoContext().creativeModel.editorProSchemeModel)) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BLOCK reason=ep-mode-music-locked enableMob=");
            sbLIZ.append(z);
            C1426005i6.LIZJ(c1398350mUb, "Anchor.Record.MusicPanelGuard", C2188811AlT.LIZIZ(sbLIZ));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        InterfaceC1652470t6T interfaceC1652470t6TB3 = B3();
        if (interfaceC1652470t6TB3 != null) {
            interfaceC1652470t6TB3.rZ0(null, true);
        }
        if (C19744312Mv.LIZ()) {
            O3().LIZLLL(z);
        } else {
            O3().LJ(C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_MUSIC_CHOICE_OPEN_PANEL, EnumC1641610sox.PAGE_INVISIBLE));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1628590sTx
    public void nv(Integer num) {
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) C13LP.LJJJLL(getShortVideoContext().creativeModel.stickerModel.addYoursStickerExtras);
        if (addYoursStickerExtras != null && addYoursStickerExtras.getAutoEnterStickerEdit()) {
            return;
        }
        if (C1443960ngA.LJI(getShortVideoContext()) && ((Boolean) C275650ArD.LIZ.getValue()).booleanValue()) {
            return;
        }
        this.LLILLL.LJIIL.LJIIJ(num);
    }

    @Override // X.InterfaceC1628590sTx
    public void oV(Pair<? extends Effect, Boolean> pair) {
        this.LLJJJIL = pair;
    }

    @Override // X.InterfaceC1628590sTx
    public void sn(C1454900nxo c1454900nxo) {
        i3().LIZ(c1454900nxo);
        C5();
    }

    public final void t5(String str) {
        Long lValueOf;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        Effect effectLLILIL = null;
        if (getShortVideoContext().shootMode != 2) {
            lValueOf = Long.valueOf(getShortVideoContext().LJIILIIL());
        } else {
            lValueOf = null;
        }
        InterfaceC1652470t6T interfaceC1652470t6TB3 = B3();
        if (interfaceC1652470t6TB3 != null) {
            long j = getShortVideoContext().cameraComponentModel.mMusicStart;
            q stickerApiComponent = getStickerApiComponent(this);
            if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null) {
                effectLLILIL = interfaceC1624480sNKC0.LLILIL();
            }
            interfaceC1652470t6TB3.oF0(str, j, lValueOf, effectLLILIL, AFwS214S0000000_25.get$arr$(276));
        }
    }

    @Override // X.InterfaceC1628590sTx
    public void y5(boolean z) {
        this.LLILLL.LJIIJJI.LJII(Boolean.valueOf(z));
    }

    public C1652400t6M(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        C1458930o4J c1458930o4J = new C1458930o4J(0);
        this.LLILLL = c1458930o4J;
        this.LLILZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453610nvj.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652470t6T.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652770t6x.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577340Mke.class, null);
        this.LLJILLL = C1449630npJ.LIZIZ(this, InterfaceC1624370sN9.class);
        this.LLJJ = true;
        this.LLJJIJI = new C560530Lyd<>();
        this.LLJJIJIIJIL = new C560530Lyd<>();
        Boolean bool = Boolean.FALSE;
        h0<Boolean> h0Var = new h0<>(bool);
        this.LLJJIJIL = h0Var;
        this.LLJJJ = h0Var;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 529));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 531));
        this.LLJL = c1458930o4J.LJI;
        this.LLJLIL = new C538770LBb(bool);
    }

    private final void d5(String str, AVMusic aVMusic) {
        AVChallenge aVChallenge;
        String str2;
        if (aVMusic == null) {
            return;
        }
        List<AVChallenge> list = C1443030nef.LJII().LIZ;
        if (TextUtils.equals(str, "challenge") && !C086I.LIZIZ(list) && C13LP.LJJJLL(list) != null && (aVChallenge = (AVChallenge) C13LP.LJJJLL(list)) != null && aVChallenge.isCommerce) {
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("shoot_way", str);
            AVChallenge aVChallenge2 = (AVChallenge) ListProtector.get(list, 0);
            String str3 = "";
            if (aVChallenge2 == null || (str2 = aVChallenge2.cid) == null) {
                str2 = "";
            }
            c543670LTx.LIZ.put("challenge_id", str2);
            String mid = aVMusic.getMid();
            if (mid != null) {
                str3 = mid;
            }
            c543670LTx.LIZ.put("sticker_id", str3);
            C1637890six.LJ("autoselected_music_monitor", 0, c543670LTx.LJ());
        }
    }

    private final boolean k5(Effect effect, AVMusic aVMusic) {
        if ((effect != null && effect.isBusiness() && !aVMusic.isCommerceMusic()) || (((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getAccountType() == 3 && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt() && !aVMusic.isCommerceMusic())) {
            return true;
        }
        return false;
    }

    public static final void setEnable(C1652400t6M c1652400t6M, boolean z) {
        if (c1652400t6M.getShortVideoContext().LJJJJLL() || c1652400t6M.getShortVideoContext().LJJJJZ() || c1652400t6M.getShortVideoContext().cameraComponentModel.isEditorProRecordMode || c1652400t6M.getShortVideoContext().LJJIJL()) {
            z = false;
        }
        c1652400t6M.y5(z);
        c1652400t6M.Yj(z);
        if (!c1652400t6M.getShortVideoContext().LJJJJL() && !c1652400t6M.getShortVideoContext().isDuetMode && !c1652400t6M.getShortVideoContext().LJJLL() && !c1652400t6M.getShortVideoContext().LJJIFFI()) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(c1652400t6M.getShortVideoContext().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic == null && c1652400t6M.getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
                c1652400t6M.Y7(Boolean.FALSE, null, null);
                return;
            }
            if (z) {
                if (aVMusicExtractAVMusic == null) {
                    c1652400t6M.FO1(null, null);
                    return;
                }
                return;
            } else {
                if (aVMusicExtractAVMusic == null || !c1652400t6M.getShortVideoContext().LJJJJZI()) {
                    return;
                }
                c1652400t6M.FO1(aVMusicExtractAVMusic, c1652400t6M.getShortVideoContext().LJIIJJI());
                return;
            }
        }
        c1652400t6M.Y7(Boolean.FALSE, null, null);
    }

    @Override // X.InterfaceC1628590sTx
    public void Dm(float f, float f2) {
        this.LLILLL.LIZLLL.LJII(new Pair<>(Float.valueOf(f), Float.valueOf(f2)));
    }

    @Override // X.InterfaceC1628590sTx
    public void FO1(AVMusic aVMusic, String str) {
        this.LLJJJJ = aVMusic;
        this.LLILLL.LJI.LJII(new Pair<>(aVMusic, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    @Override // X.InterfaceC1628590sTx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void qt(com.ss.android.ugc.aweme.creative.model.music.AVMusic r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1652400t6M.qt(com.ss.android.ugc.aweme.creative.model.music.AVMusic, java.lang.String):void");
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    @Override // X.InterfaceC1628590sTx
    public void Y7(Boolean bool, Boolean bool2, Boolean bool3) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            h0<Boolean> h0Var = this.LLILLL.LIZ;
            if (zBooleanValue && w2()) {
                z2 = true;
            } else {
                z2 = false;
            }
            h0Var.LJII(Boolean.valueOf(z2));
        }
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            h0<Boolean> h0Var2 = this.LLILLL.LIZJ;
            if (zBooleanValue2 && w2()) {
                z = true;
            } else {
                z = false;
            }
            h0Var2.LJII(Boolean.valueOf(z));
        }
        if (bool3 != null) {
            boolean zBooleanValue3 = bool3.booleanValue();
            h0<Boolean> h0Var3 = this.LLILLL.LIZIZ;
            if (!zBooleanValue3 || !w2()) {
                z3 = false;
            }
            h0Var3.LJII(Boolean.valueOf(z3));
        }
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

    @Override // X.InterfaceC1628590sTx
    public void us(boolean z, String str, AVMusic aVMusic, String str2) {
        Function2<AVMusic, Function0<Unit>, Unit> function2;
        if (z) {
            FO1(null, null);
            ICreativeRefineService iCreativeRefineService = (ICreativeRefineService) PluggableExtentionKt.pluggableSpi$default(ICreativeRefineService.class, false, false, false, 14, null);
            if (iCreativeRefineService != null) {
                iCreativeRefineService.LIZ(false);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        AwS140S1200000_25 awS140S1200000_25 = new AwS140S1200000_25(this, aVMusic, str, 2);
        if (aVMusic != null) {
            AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(awS140S1200000_25, 530);
            WeakReference<Function2<AVMusic, Function0<Unit>, Unit>> weakReference = C1652570t6d.LIZ;
            if (weakReference != null && (function2 = weakReference.get()) != null) {
                function2.invoke(aVMusic, awS569S0100000_25);
                return;
            } else {
                awS569S0100000_25.invoke();
                return;
            }
        }
        awS140S1200000_25.invoke();
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
