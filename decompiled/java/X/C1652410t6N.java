package X;

import Y.AObjectS241S0100000_8;
import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicStreamDownloadService;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.monitor.music.MusicMonitorTaskQueueService;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.MusicInfoAndEffectUseCount;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import lth.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0t6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1652410t6N extends AbstractC2255721DQs<InterfaceC1624370sN9> implements InterfaceC1624370sN9, InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public boolean LLJ;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public C1652480t6U LLJJIJI;
    public Effect LLJJIJIIJIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(279));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(281));
    public final C1652410t6N LLILZIL = this;
    public final C01GW LLILZLL = C1449630npJ.LIZ(this, InterfaceC1628590sTx.class);
    public final C01GW LLIZ = C1449630npJ.LIZ(this, q.class);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(278));
    public final C01GW LLJIJIL = C1449630npJ.LIZ(this, InterfaceC1648570t0B.class);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650190t2n.class, null);
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(280));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1652410t6N.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1652410t6N.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CommonCameraApiComponent;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public boolean O3(Effect effect) {
        return true;
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

    private final boolean G2() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    private final q getStickerApiComponent() {
        return (q) this.LLIZ.getValue();
    }

    private final InterfaceC1650190t2n o2() {
        return (InterfaceC1650190t2n) this.LLJILJIL.getValue(this, LLJJIJIL[1]);
    }

    public final LruCache<String, C1652610t6h> T2() {
        return (LruCache) this.LLILLL.getValue();
    }

    public final void W1() {
        C1652480t6U c1652480t6U = this.LLJJIJI;
        if (c1652480t6U != null) {
            ((InterfaceC1652580t6e) c1652480t6U.LJI.getValue()).LIZ(null, true);
        }
        this.LLJILJILJ = true;
        w2().Ez2(false);
    }

    @Override // X.InterfaceC1624370sN9
    /* JADX INFO: renamed from: c3, reason: merged with bridge method [inline-methods] */
    public MutableLiveData<C1652610t6h> IT0() {
        return (MutableLiveData) this.LLJJIII.getValue();
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJIJIL.getValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZLLLIL.getValue(this, LLJJIJIL[0]);
    }

    public final LruCache<String, AVMusic> i3() {
        return (LruCache) this.LLILZ.getValue();
    }

    public final InterfaceC1628590sTx w2() {
        return (InterfaceC1628590sTx) this.LLILZLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X1() {
        /*
            r4 = this;
            androidx.lifecycle.MutableLiveData r0 = r4.IT0()
            java.lang.Object r1 = r0.getValue()
            X.0t6h r1 = (X.C1652610t6h) r1
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L40
            boolean r0 = r4.B3()
            if (r0 != 0) goto L3d
            boolean r0 = r4.v3()
            if (r0 != 0) goto L3d
            kotlin.Pair<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long> r0 = r1.LJI
        L1c:
            if (r0 == 0) goto L40
            java.lang.Object r1 = r0.getFirst()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1
        L24:
            r4.LLJILJILJ = r2
            X.0t6U r0 = r4.LLJJIJI
            if (r0 == 0) goto L35
            X.01GW r0 = r0.LJI
            java.lang.Object r0 = r0.getValue()
            X.0t6e r0 = (X.InterfaceC1652580t6e) r0
            r0.LIZ(r1, r2)
        L35:
            X.0sTx r0 = r4.w2()
            r0.Ez2(r3)
            return
        L3d:
            kotlin.Pair<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long> r0 = r1.LJII
            goto L1c
        L40:
            r1 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1652410t6N.X1():void");
    }

    private final void q3() {
        if (getShortVideoContext().recordPresetResource != null && (!TextUtils.isEmpty(getShortVideoContext().recordPresetResource.getMusicId()) || getShortVideoContext().recordPresetResource.getMusicModel() != null)) {
            TC2(true);
        }
        if (getShortVideoContext().getMusicPath() == null || MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel) == null) {
            return;
        }
        TC2(true);
    }

    public final boolean B3() {
        return getShortVideoContext().shootMode == 14;
    }

    @Override // X.InterfaceC1624370sN9
    public MusicModel Qt0() {
        C1652610t6h value = IT0().getValue();
        if (value == null) {
            return null;
        }
        Pair<? extends MusicModel, Long> pair = (B3() || v3()) ? value.LJII : value.LJI;
        if (pair != null) {
            return pair.getFirst();
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (!((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2() || ((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) {
            if (!getShortVideoContext().LJJJJLL() && !getShortVideoContext().LJJLL() && !getShortVideoContext().LJJJJZ()) {
                q stickerApiComponent = getStickerApiComponent();
                final AwS639S0100000_25 awS639S0100000_25 = new AwS639S0100000_25(this, 77);
                stickerApiComponent.sk(new InterfaceC1622080sJS(awS639S0100000_25) { // from class: X.0sKd
                    public final Function2<Effect, AbstractC1627380sS0, Unit> LL;

                    @Override // X.InterfaceC1622080sJS
                    public final int getPriority() {
                        return C1623350sLV.LIZ();
                    }

                    {
                        this.LL = awS639S0100000_25;
                    }

                    @Override // X.InterfaceC1622080sJS
                    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
                        C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
                        if (abstractC1627380sS0 instanceof C1627370sRz) {
                            C1627370sRz c1627370sRz = (C1627370sRz) abstractC1627380sS0;
                            if (c1627370sRz.LIZJ != EnumC1448980noG.RECOVER) {
                                this.LL.invoke(c1627370sRz.LIZ, abstractC1627380sS0);
                            }
                            return c1623370sLXLIZ;
                        }
                        if (abstractC1627380sS0 instanceof C1627360sRy) {
                            this.LL.invoke(((C1627360sRy) abstractC1627380sS0).LIZ, abstractC1627380sS0);
                            return c1623370sLXLIZ;
                        }
                        throw new C1954807lC();
                    }
                });
            }
            this.LLJJIJI = new C1652480t6U((C19EG) C1664590tQ1.LJII(this), AFwS311S0000000_25.get$arr$(29), new AwS674S0100000_25(this, 24), new AwS622S0100000_8(this, 28), new AwS569S0100000_25(this, 543));
            IT0().observe(this, new AObjectS246S0100000_25(this, 419));
            getStickerApiComponent().C0().LJII().LIZ().observe(this, new AObserverS227S0100000_25(this, 50));
            LiveEvent<Unit> liveEventSb0 = getRecordControlApi().sb0();
            Lifecycle.State state = Lifecycle.State.CREATED;
            liveEventSb0.LJII(this, state, new AObjectS246S0100000_25(this, 420));
            getRecordControlApi().cJ0().LJII(this, state, new AObjectS246S0100000_25(this, 421));
            getRecordControlApi().lC2().LIZ(this, new AObjectS241S0100000_8(this, 49));
            o2().xF1().LIZ(this, new InterfaceC1441305kZ() { // from class: X.08yT
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    C1458370o3P.LIZ.getClass();
                    C1458370o3P.LJJII();
                    if (C2291808yS.LIZ()) {
                        C2288608xw.LIZ.getClass();
                        C2288608xw.LIZLLL();
                    }
                }
            });
            q3();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C1652480t6U c1652480t6U = this.LLJJIJI;
        if (c1652480t6U != null) {
            ((InterfaceC1652580t6e) c1652480t6U.LJI.getValue()).stop();
        }
        C1652480t6U c1652480t6U2 = this.LLJJIJI;
        if (c1652480t6U2 != null) {
            ((InterfaceC1652580t6e) c1652480t6U2.LJI.getValue()).onDestroy();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C1652480t6U c1652480t6U = this.LLJJIJI;
        if (c1652480t6U != null) {
            ((InterfaceC1652580t6e) c1652480t6U.LJI.getValue()).pause();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLJ = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        this.LLJ = true;
        C1652480t6U c1652480t6U = this.LLJJIJI;
        if (c1652480t6U != null) {
            ((InterfaceC1652580t6e) c1652480t6U.LJI.getValue()).pause();
        }
    }

    public final boolean v3() {
        return getShortVideoContext().shootMode == 18;
    }

    @Override // X.InterfaceC1624370sN9
    public boolean Du1() {
        return this.LLJILLL;
    }

    public final boolean H2() {
        return this.LLILLJJLI;
    }

    public C1652410t6N Z1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    @Override // X.InterfaceC1624370sN9
    public boolean kx() {
        return this.LLJJI;
    }

    private final boolean E3(Effect effect) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        C1446130njf.LIZ.getClass();
        JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
        if (jSONObjectLJIIIZ == null || (jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("tool_music")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("required_lyric_formats")) == null || jSONArrayOptJSONArray.length() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1624370sN9
    public Long Em2(String str) {
        RecommendMusic recommendMusic;
        List<MusicInfoAndEffectUseCount> musicList;
        MusicInfoAndEffectUseCount musicInfoAndEffectUseCount;
        List<SimpleMusic> list;
        SimpleMusic simpleMusic;
        Music music;
        C1652610t6h c1652610t6h = T2().get(str);
        if (c1652610t6h != null && (list = c1652610t6h.LIZIZ) != null && (simpleMusic = (SimpleMusic) C13LP.LJJJLL(list)) != null && (music = simpleMusic.musicModel) != null) {
            return Long.valueOf(music.getId());
        }
        C1652610t6h c1652610t6h2 = T2().get(str);
        if (c1652610t6h2 != null && (recommendMusic = c1652610t6h2.LIZ) != null && (musicList = recommendMusic.getMusicList()) != null && (musicInfoAndEffectUseCount = (MusicInfoAndEffectUseCount) C13LP.LJJJLL(musicList)) != null) {
            return Long.valueOf(musicInfoAndEffectUseCount.musicId);
        }
        AVMusic aVMusic = i3().get(str);
        if (aVMusic != null) {
            return Long.valueOf(aVMusic.id);
        }
        return null;
    }

    public boolean H3(AbstractC1627380sS0 abstractC1627380sS0) {
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            return true;
        }
        if (abstractC1627380sS0 instanceof C1627360sRy) {
            return false;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1624370sN9
    public void TC2(boolean z) {
        this.LLJILLL = z;
        if (z) {
            this.LLJJ = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W2(com.ss.android.ugc.effectmanager.effect.model.Effect r24) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1652410t6N.W2(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    @Override // X.InterfaceC1624370sN9
    public void ZS0(boolean z) {
        this.LLJJ = z;
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    public final void m3(Pair<? extends MusicModel, Long> pair) {
        String musicId;
        if (pair == null || pair.getFirst() == null || getShortVideoContext().LJI().size() > 0) {
            return;
        }
        CameraLayoutModel cameraLayoutModel = getShortVideoContext().creativeModel.cameraLayoutModel;
        if ((cameraLayoutModel != null && C0L5H.LIZIZ(cameraLayoutModel) > 0) || this.LLJILLL) {
            return;
        }
        MusicModel first = pair.getFirst();
        if (first != null && (musicId = first.getMusicId()) != null) {
            C1652750t6v c1652750t6v = C1652750t6v.LIZ;
            String creationId = getShortVideoContext().getCreationId();
            c1652750t6v.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("music_id", musicId);
            c0lab.LJ("creation_id", creationId);
            C20684815ws.LJIILLIIL("show_music_popup", c0lab.LIZ);
        }
        X1();
    }

    @Override // X.InterfaceC1624370sN9
    public void ya2(boolean z) {
        this.LLJJI = z;
    }

    public C1652410t6N(C1DRG c1drg, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
    }

    public final void o4(MusicModel musicModel, String str) {
        String str2;
        List<String> musicIds;
        FaceStickerBean faceStickerBeanJr = getStickerApiComponent().jr();
        if (faceStickerBeanJr != null && (musicIds = faceStickerBeanJr.getMusicIds()) != null && musicIds.contains(musicModel.getMusicId())) {
            str2 = "prop_music_soft_bind";
        } else {
            str2 = "prop_music_recommended";
        }
        AVMusic aVMusicTransformMusicModel = o.LJI.transformMusicModel(musicModel);
        if (aVMusicTransformMusicModel != null) {
            aVMusicTransformMusicModel.setMusicPriority(-1);
        }
        w2().Hs0(true);
        w2().Ez2(false);
        w2().us(false, str2, aVMusicTransformMusicModel, str);
        w2().sn(C1421090n5H.LIZ(Boolean.FALSE, str2, aVMusicTransformMusicModel, str, null, true, null, -1L, LivePreviewCTASmartDisplayManager.DEFAULT, false));
        C1452640nuA.LJII(aVMusicTransformMusicModel, false, getShortVideoContext().creativeModel.musicBuzModel);
        getShortVideoContext().LJJLIIIJILLIZJL(str2);
        if (C545630Lab.LIZ()) {
            ((MusicMonitorTaskQueueService) ServiceManager.get().getService(MusicMonitorTaskQueueService.class)).LIZJ(new C571280Mas(getShortVideoContext()));
        }
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    public final void Q3(final AVMusic aVMusic, final double d, final String str) {
        o.LJI.LJ("effect_recommend", C0CHQ.LIZ, aVMusic, 6, false, new InterfaceC1416880myU() { // from class: X.0t6Y
            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str2) {
            }

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
            public final void LIZIZ(String str2, MusicWaveBean musicWaveBean) {
                this.LIZ.e4(aVMusic, str2, d, str);
            }
        }, false);
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

    public final void z4(final AVMusic aVMusic, final double d, final String str) {
        IMusicStreamDownloadService iMusicStreamDownloadService = (IMusicStreamDownloadService) PluggableExtentionKt.pluggableSpi$default(IMusicStreamDownloadService.class, false, false, false, 14, null);
        if (iMusicStreamDownloadService != null) {
            iMusicStreamDownloadService.LIZ(aVMusic, false, true, new AbstractC1661230tKb() { // from class: X.0t6f
            }, new InterfaceC202048143y() { // from class: X.0t6a
                @Override // X.InterfaceC202048143y
                public final void LIZ(int i, String str2) {
                }

                @Override // X.InterfaceC202048143y
                public final void LJJJLIIL(String str2) {
                }

                @Override // X.InterfaceC202048143y
                public final void LIZIZ() {
                    this.LIZ.Q3(aVMusic, d, str);
                }

                @Override // X.InterfaceC202048143y
                public final void LIZJ(String str2, boolean z) {
                    this.LIZ.e4(aVMusic, str2, d, str);
                }
            }, C1662170tM7.LIZ().startPlayProgress, C1662170tM7.LIZ().netLevelThreshold);
        } else {
            Q3(aVMusic, d, str);
        }
    }

    public final void e4(AVMusic aVMusic, String str, double d, String str2) {
        InterfaceC1628590sTx interfaceC1628590sTxW2;
        C385670FAf<Boolean> c385670FAfGx;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_add_music_for_effect", true, true) && (interfaceC1628590sTxW2 = w2()) != null && (c385670FAfGx = interfaceC1628590sTxW2.Gx()) != null && Intrinsics.LJFF(c385670FAfGx.LIZJ(), Boolean.TRUE)) {
            return;
        }
        int i = ((int) d) * LSPassThroughRecordSizeConfig.DEFAULT;
        aVMusic.setMusicStart(i);
        aVMusic.setPreviewStartTime(((float) d) * 1000.0f);
        aVMusic.setMusicStartFromCut(i);
        aVMusic.setMusicPriority(-1);
        aVMusic.setTrimPointRecommended(true);
        w2().us(false, "prop_music_tool_music", aVMusic, str);
        w2().sn(C1421090n5H.LIZ(Boolean.FALSE, "prop_music_tool_music", aVMusic, str, null, true, null, -1L, LivePreviewCTASmartDisplayManager.DEFAULT, false));
        C1452640nuA.LJII(aVMusic, getShortVideoContext().isPhotoMvMode, getShortVideoContext().creativeModel.musicBuzModel);
        getShortVideoContext().cameraComponentModel.mMusicStart = aVMusic.getMusicStart();
        i3().put(str2, aVMusic);
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
