package X;

import Y.AObjectS246S0100000_25;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import gro.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS4S1400100_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0t6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1652790t6z extends AbstractC2255721DQs<InterfaceC1652470t6T> implements InterfaceC1652470t6T, InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public boolean LLJI;
    public Function0<Unit> LLJJI;
    public long LLJJIJIL;
    public final C1652790t6z LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final ShortVideoContext LLILZLL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1624370sN9.class, null);
    public final int LLJ = 1;
    public final Map<Integer, Boolean> LLJIJIL = new LinkedHashMap();
    public int LLJILJIL = -1;
    public int LLJILJILJ = -1;
    public boolean LLJILLL = true;
    public final C1663390tO5 LLJJ = new C1663390tO5(new InterfaceC1652830t73() { // from class: X.0t70
        @Override // X.InterfaceC1464200oCo
        public final void onCallback(int i, int i2, float f, String str) {
            if (i == VEInfo.TE_INFO_TRACK_PLAY_EOF) {
                C01TT.LIZLLL(new AwS569S0100000_25(this.LL, 540));
            }
        }
    }, new AwS569S0100000_25(this, 541));
    public final InterfaceC2183551Acz LLJJIII = new InterfaceC2183551Acz() { // from class: X.0t72
        @Override // X.InterfaceC2183551Acz
        public final void onDone(int i) {
            Function0<Unit> function0 = this.LIZ.LLJJI;
            if (function0 != null) {
                function0.invoke();
            }
            this.LIZ.LLJJI = null;
        }
    };
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 538));
    public final C1652810t71 LLJJIJIIJIL = new InterfaceC2253851DJn() { // from class: X.0t71
        @Override // X.InterfaceC2253851DJn
        public final void LIZIZ(int i) {
        }

        @Override // X.InterfaceC2253851DJn
        public final void LIZ(int i) {
            C01TT.LIZLLL(new AwS569S0100000_25(this.LIZ, 539));
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1652790t6z.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1652790t6z.class, "recordControlCoreComponent", "getRecordControlCoreComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1652790t6z.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1652790t6z.class, "recommendMusicApiComponent", "getRecommendMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/recommend/RecommendMusicApiComponent;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    private final boolean Z1(int i) {
        return i >= 0;
    }

    public boolean c3() {
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

    private final InterfaceC1648570t0B W2() {
        return (InterfaceC1648570t0B) this.LLILZIL.getValue(this, LLJJJ[1]);
    }

    private final void lg() {
        MusicObject musicObject = this.LLILZLL.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            if (this.LLJJIJIL > 0 && System.currentTimeMillis() - this.LLJJIJIL > 800) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("music_selected_from", "prop_music_recommended");
                c0lab.LJ("content_source", "shoot");
                c0lab.LJ("content_type", this.LLILZLL.LJ().getContentType());
                c0lab.LJ("shoot_way", this.LLILZLL.shootWay);
                c0lab.LJ("enter_from", "video_shoot_page");
                c0lab.LJ("creation_id", this.LLILZLL.getCreationId());
                String musicId = MusicBeanUtilKt.getMusicId(musicObject);
                if (musicId == null) {
                    musicId = "";
                }
                c0lab.LJ("music_id", musicId);
                MatchedSoundInfo matchedSoundInfo = musicObject.matchedSongInfo;
                c0lab.LJ("meta_song_id", matchedSoundInfo != null ? matchedSoundInfo.getId() : null);
                c0lab.LIZ(musicObject.isPgc ? 1 : 0, "is_pgc");
                c0lab.LJ("music_selected_method", "auto");
                c0lab.LIZ(1, "music_show_rank");
                c0lab.LIZ(musicObject.duration, "music_duration");
                c0lab.LIZIZ(System.currentTimeMillis() - this.LLJJIJIL, "play_duration");
                c0lab.LIZ(0, "is_from_edit_page_panel");
                ShortVideoContext shortVideoContext = this.LLILZLL;
                c0lab.LJ("music_log_id", C1412490mrP.LJ(shortVideoContext, shortVideoContext.LJIIJJI()));
                c0lab.LIZ(0, "is_from_auto_edit");
                C20684815ws.LJIILLIIL("music_play_end", c0lab.LIZ);
            }
            this.LLJJIJIL = 0L;
        }
    }

    private final void o2() {
        if (this.LLJILJILJ != -1) {
            a aVar = getCameraApiComponent().u92().LIZIZ().LIZIZ.LJJIZ;
            if (aVar != null) {
                aVar.removeTrackFilter(this.LLJILJILJ);
            }
            this.LLJILJILJ = -1;
        }
    }

    public final boolean G2() {
        return ((Boolean) this.LLJJIJI.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1652470t6T
    public boolean OE2() {
        boolean z;
        Iterator<Boolean> it2 = this.LLJIJIL.values().iterator();
        while (true) {
            while (it2.hasNext()) {
                z = z && !it2.next().booleanValue();
            }
            return z;
        }
    }

    public final InterfaceC1624370sN9 T2() {
        return (InterfaceC1624370sN9) this.LLIZLLLIL.getValue(this, LLJJJ[3]);
    }

    @Override // X.InterfaceC1652470t6T
    public void TY1() {
        if (Intrinsics.LJFF(this.LLILZLL.shootWay, "single_song") && c3() && C0CIU.LIZ() && Z1(this.LLJILJIL)) {
            int i = this.LLJILJIL;
            this.LLJILJIL = -1;
            getCameraApiComponent().VE(i, this.LLJ);
            getCameraApiComponent().lo1(this.LLJ, i);
            lg();
        }
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLILZ.getValue(this, LLJJJ[0]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLIZ.getValue(this, LLJJJ[2]);
    }

    private final void W1() {
        o2();
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LLILZLL.creativeModel.musicBuzModel);
        VERecorder vERecorderLIZIZ = getCameraApiComponent().u92().LIZIZ();
        float fLJFF = C1485020okO.LJFF(aVMusicExtractAVMusic != null ? aVMusicExtractAVMusic.getMusicVolumeInfo() : null);
        float f = C1458340o3M.LIZ;
        if (!C1485020okO.LIZLLL(Float.valueOf(fLJFF)) || !C1485020okO.LIZLLL(Float.valueOf(f))) {
            if (aVMusicExtractAVMusic != null) {
                aVMusicExtractAVMusic.getMusicVolumeInfo();
                aVMusicExtractAVMusic.getMusicId();
                return;
            }
            return;
        }
        VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
        vEAudioLoudnessBalanceFilter.targetLoudness = f;
        vEAudioLoudnessBalanceFilter.peakLoudness = 1.0E-6d;
        vEAudioLoudnessBalanceFilter.avgLoudness = fLJFF;
        vEAudioLoudnessBalanceFilter.isOnLine = false;
        vEAudioLoudnessBalanceFilter.isBGM = true;
        this.LLJILJILJ = vERecorderLIZIZ.LIZIZ.LJJIZ.addTrackFilter(1, this.LLJILJIL, vEAudioLoudnessBalanceFilter, 0, Integer.MAX_VALUE);
        if (aVMusicExtractAVMusic != null) {
            aVMusicExtractAVMusic.getMusicVolumeInfo();
            aVMusicExtractAVMusic.getMusicId();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        LiveEvent<Boolean> liveEventXP0;
        super.onCreate();
        this.LLJILJIL = -1;
        if (G2()) {
            return;
        }
        getCameraApiComponent().St2().K0(this.LLJJIJIIJIL);
        getCameraApiComponent().St2().getMediaController().N5(this.LLJJIII);
        W2().me2().LIZ(this, new AObjectS246S0100000_25(this, 415));
        q stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (liveEventXP0 = stickerApiComponent.xP0()) != null) {
            liveEventXP0.LIZ(this, new AObjectS246S0100000_25(this, 416));
        }
        q stickerApiComponent2 = getStickerApiComponent();
        if (stickerApiComponent2 == null || (liveEventMa2 = stickerApiComponent2.Ma2()) == null) {
            return;
        }
        liveEventMa2.LIZ(this, new AObjectS246S0100000_25(this, 417));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getCameraApiComponent().St2().N0(this.LLJJIJIIJIL);
        getCameraApiComponent().St2().ih(this.LLJJ);
        getCameraApiComponent().St2().getMediaController().D5(this.LLJJIII);
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        lg();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
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

    public final ShortVideoContext getShortVideoContext() {
        return this.LLILZLL;
    }

    public final boolean i3() {
        return this.LLILLJJLI;
    }

    public C1652790t6z w2() {
        return this.LLILLL;
    }

    private final Integer H2(String str) {
        VEUtils.VEAudioFileInfo audioFileInfo;
        if (str == null || (audioFileInfo = VEUtils.getAudioFileInfo(str)) == null) {
            return null;
        }
        return Integer.valueOf(audioFileInfo.duration);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    public boolean m3(Effect effect) {
        ShortVideoContext shortVideoContext = this.LLILZLL;
        if ((C579480Mo6.LIZ(shortVideoContext) || C1624570sNT.LIZLLL(effect)) && !shortVideoContext.LJJLL() && !shortVideoContext.LJJJJLL()) {
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            if (!cameraComponentModel.isRetakeMode && !cameraComponentModel.isEditorProRecordMode && !C0CHQ.LIZ().getAccountService().LIZ()) {
                if (C539900LFk.LJI(shortVideoContext)) {
                    CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
                    if (cameraLayoutModel != null && C0L5H.LIZIZ(cameraLayoutModel) > 0) {
                        return false;
                    }
                } else if (shortVideoContext.LJII() > 0) {
                    return false;
                }
                if (!C1624200sMs.LJIILIIL(effect) && !C1624200sMs.LJIIIIZZ(effect)) {
                    if (effect != null) {
                        C1665200tR0.LIZ.getClass();
                        if (C1665200tR0.LIZJ(effect)) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0t71] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0t70] */
    public C1652790t6z(C1DRG c1drg, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC1652470t6T
    public boolean NW(Effect effect, boolean z) {
        if ((!z && !m3(effect)) || !Z1(this.LLJILJIL)) {
            return false;
        }
        int i = this.LLJILJIL;
        this.LLJILJIL = -1;
        o2();
        getCameraApiComponent().VE(i, this.LLJ);
        getCameraApiComponent().lo1(this.LLJ, i);
        lg();
        return true;
    }

    @Override // X.InterfaceC1652470t6T
    public boolean kc2(Effect effect, boolean z) {
        Effect effectLLILIL;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        if ((!z && !m3(effect)) || getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) < 0) {
            return false;
        }
        if (!Z1(this.LLJILJIL)) {
            String musicPath = this.LLILZLL.getMusicPath();
            ShortVideoContext shortVideoContext = this.LLILZLL;
            long j = shortVideoContext.cameraComponentModel.mMusicStart;
            Long lValueOf = Long.valueOf(shortVideoContext.LJIILIIL());
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null) {
                effectLLILIL = interfaceC1624480sNKC0.LLILIL();
            } else {
                effectLLILIL = null;
            }
            oF0(musicPath, j, lValueOf, effectLLILIL, AFwS214S0000000_25.get$arr$(276));
            return false;
        }
        boolean zLIZLLL = C1624570sNT.LIZLLL(effect);
        if (!zLIZLLL && this.LLJILLL) {
            getCameraApiComponent().Hi2(this.LLJILJIL, this.LLJ, 0L);
            this.LLJILLL = false;
        }
        getCameraApiComponent().CT(this.LLJILJIL, this.LLJ, zLIZLLL);
        return true;
    }

    @Override // X.InterfaceC1652470t6T
    public boolean oo0(Effect effect, boolean z) {
        Effect effectLLILIL;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        if (!z && !m3(effect)) {
            return false;
        }
        if (!Z1(this.LLJILJIL)) {
            String musicPath = this.LLILZLL.getMusicPath();
            ShortVideoContext shortVideoContext = this.LLILZLL;
            long j = shortVideoContext.cameraComponentModel.mMusicStart;
            Long lValueOf = Long.valueOf(shortVideoContext.LJIILIIL());
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null) {
                effectLLILIL = interfaceC1624480sNKC0.LLILIL();
            } else {
                effectLLILIL = null;
            }
            oF0(musicPath, j, lValueOf, effectLLILIL, AFwS214S0000000_25.get$arr$(276));
            return false;
        }
        getCameraApiComponent().Hi2(this.LLJILJIL, this.LLJ, 0L);
        getCameraApiComponent().CT(this.LLJILJIL, this.LLJ, C1624570sNT.LIZLLL(effect));
        this.LLJILLL = false;
        return true;
    }

    @Override // X.InterfaceC1652470t6T
    public boolean rZ0(Effect effect, boolean z) {
        if ((!z && !m3(effect)) || !Z1(this.LLJILJIL)) {
            return false;
        }
        getCameraApiComponent().VE(this.LLJILJIL, this.LLJ);
        lg();
        return true;
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    @Override // X.InterfaceC1652470t6T
    public void zh0(int i, boolean z) {
        this.LLJIJIL.put(Integer.valueOf(i), Boolean.valueOf(z));
    }

    private final Pair<Integer, Integer> X1(int i, Integer num, String str) {
        Integer numH2 = H2(str);
        if (num == null) {
            if (numH2 == null) {
                return new Pair<>(-1, -1);
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(numH2.intValue() - i));
        }
        if (numH2 == null) {
            return new Pair<>(Integer.valueOf(i), num);
        }
        if (num.intValue() + i <= numH2.intValue()) {
            return new Pair<>(Integer.valueOf(i), num);
        }
        return new Pair<>(0, Integer.valueOf(Math.min(num.intValue(), numH2.intValue())));
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

    @Override // X.InterfaceC1652470t6T
    public void oF0(String str, long j, Long l, Effect effect, Function0<Unit> function0) {
        boolean z;
        Effect effectLLILIL;
        InterfaceC1624370sN9 interfaceC1624370sN9T2;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        if (getLifecycle().getCurrentState().compareTo(Lifecycle.State.STARTED) < 0) {
            return;
        }
        if (!getCameraApiComponent().fU1()) {
            this.LLJJI = new AwS4S1400100_25(this, str, j, l, effect, function0, 0);
            return;
        }
        if (Intrinsics.LJFF(this.LLILZLL.shootWay, "single_song") && C0CIU.LIZ() && (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_dont_play_music_without_permission", true, true) ? c3() : !c3()) && !C533930Kwp.LIZIZ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})) {
            z = true;
        } else {
            z = false;
        }
        q stickerApiComponent = getStickerApiComponent();
        Integer numValueOf = null;
        if (stickerApiComponent != null && (interfaceC1624480sNKC0 = stickerApiComponent.C0()) != null) {
            effectLLILIL = interfaceC1624480sNKC0.LLILIL();
        } else {
            effectLLILIL = null;
        }
        boolean zLIZLLL = C1624570sNT.LIZLLL(effectLLILIL);
        if ((effectLLILIL == null || ((interfaceC1624370sN9T2 = T2()) != null && interfaceC1624370sN9T2.Du1())) && !z && !zLIZLLL) {
            rZ0(effect, false);
            return;
        }
        if (!TextUtils.isEmpty(str) && m3(effect)) {
            if (Z1(this.LLJILJIL)) {
                NW(effect, false);
            }
            int i = (int) j;
            if (l != null) {
                numValueOf = Integer.valueOf((int) l.longValue());
            }
            Pair<Integer, Integer> pairX1 = X1(i, numValueOf, str);
            int iIntValue = pairX1.getFirst().intValue();
            int iIntValue2 = pairX1.getSecond().intValue();
            if (iIntValue2 > 0 && iIntValue >= 0) {
                C2254451DLv c2254451DLv = new C2254451DLv();
                c2254451DLv.LIZ(str);
                c2254451DLv.LIZLLL();
                c2254451DLv.LJ(iIntValue);
                c2254451DLv.LJFF(iIntValue + iIntValue2);
                C1D40 c1d40 = C1D40.External;
                VETrackParams vETrackParams = c2254451DLv.LIZ;
                vETrackParams.trackPriority = c1d40;
                int iWn1 = getCameraApiComponent().wn1(this.LLJ, vETrackParams);
                if (!Z1(iWn1)) {
                    return;
                }
                this.LLJILJIL = iWn1;
                if (C1458330o3L.LIZ()) {
                    W1();
                }
                getCameraApiComponent().CT(iWn1, this.LLJ, zLIZLLL);
                this.LLJILLL = false;
                lg();
                this.LLJJIJIL = System.currentTimeMillis();
                function0.invoke();
                return;
            }
            return;
        }
        rZ0(effect, false);
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
