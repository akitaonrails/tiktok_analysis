package X;

import Y.AObjectS246S0100000_25;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0t6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652420t6O extends AbstractC2255721DQs<InterfaceC1650730t3f> implements InterfaceC1166920gTK, InterfaceC1650730t3f, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C1652440t6Q LLILLL = new C1652440t6Q(0);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1621970sJH.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647280sy6.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final C560530Lyd<Unit> LLJILJIL = new C560530Lyd<>();
    public final C560530Lyd<Unit> LLJILJILJ = new C560530Lyd<>();
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 157));

    public C1652420t6O W1() {
        return this;
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

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfCP1;
        super.onCreate();
        C1650840t3q c1650840t3q = new C1650840t3q(getActivity(), getCameraApi(), getStickerApiComponent(), this, getShortVideoContext());
        this.LL.add(R.id.sz5, new C1654280t9O(this.LLILLL, ((InterfaceC1647890sz5) getDiContainer().LJII(a.class, null)).sK0()), "FTCRecordChooseMusicScene");
        this.LLILLL.LJIIJ.LIZ(this, new AObjectS246S0100000_25(c1650840t3q, 53));
        this.LLILLL.LIZ.LIZ(this, new AObjectS246S0100000_25(this, 54));
        getCameraApi().bu2().LIZ(this, new AObjectS246S0100000_25(this, 55));
        X1().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 56));
        getRecordControlApi().xk1().LJ(this, new AObjectS246S0100000_25(this, 57));
        getRecordControlApi().zx2().LIZ(this, new AObjectS246S0100000_25(this, 58));
        InterfaceC1621970sJH recordModeApi = getRecordModeApi();
        if (recordModeApi != null && (c385670FAfCP1 = recordModeApi.CP1()) != null) {
            c385670FAfCP1.LIZ(this, new AObjectS246S0100000_25(this, 59));
        }
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS246S0100000_25(this, 60));
        H2();
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1652420t6O.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1652420t6O.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1652420t6O.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1652420t6O.class, "recordModeApi", "getRecordModeApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1652420t6O.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1652420t6O.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/aweme/ftc/bottom/FTCBottomTabApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1652420t6O.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1652420t6O.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJJI = 8;
    }

    private final InterfaceC1647280sy6 X1() {
        return (InterfaceC1647280sy6) this.LLJ.getValue(this, LLJJ[5]);
    }

    private final InterfaceC1650230t2r getCameraApi() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLJJ[1]);
    }

    private final InterfaceC1621970sJH getRecordModeApi() {
        return (InterfaceC1621970sJH) this.LLIZ.getValue(this, LLJJ[3]);
    }

    private final C1652450t6R o2() {
        return (C1652450t6R) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC1650730t3f
    public void P3() {
        this.LLILLL.LJ.LJIIJ(null);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILZ.getValue(this, LLJJ[0]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLJI.getValue(this, LLJJ[6]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZLL.getValue(this, LLJJ[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJIJIL.getValue(this, LLJJ[7]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLIZLLLIL.getValue(this, LLJJ[4]);
    }

    @Override // X.InterfaceC1650730t3f
    public void l5() {
        this.LLILLL.LJIIIZ.LJIIJ(null);
    }

    @Override // X.InterfaceC1650730t3f
    public void xt() {
        this.LLILLL.LJIIIIZZ.LJIIJ(null);
    }

    private final void H2() {
        AVMusic aVMusicExtractAVMusic;
        if (getShortVideoContext().LJJLL() || TextUtils.equals(getShortVideoContext().shootWay, "upload_anchor") || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) == null) {
            return;
        }
        Z1().pauseEffectAudio(true);
        Z1().Qa(false);
        L62(aVMusicExtractAVMusic);
        Yj(false);
        W2();
        T2(getShortVideoContext().shootWay, aVMusicExtractAVMusic);
    }

    private final void W2() {
        AVMusic aVMusicExtractAVMusic;
        if (getShortVideoContext() != null && getShortVideoContext().LJJIJLIJ()) {
            Bundle bundleLIZIZ = C565520MFy.LIZIZ(this.LL);
            if (bundleLIZIZ == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            if (C1624200sMs.LJIIIIZZ((Effect) bundleLIZIZ.getParcelable("first_sticker"))) {
                return;
            }
            getShortVideoContext().LJJLIIIJLJLI();
            nv(1);
            InterfaceC1648870t0f interfaceC1648870t0f = (InterfaceC1648870t0f) getDiContainer().LJII(InterfaceC1648870t0f.class, null);
            interfaceC1648870t0f.setNeedNoTouchListener(true);
            interfaceC1648870t0f.getNoBlockTouchEvent().LIZ(this, new AObjectS246S0100000_25(this, 61));
            if ((Intrinsics.LJFF("prop_reuse", getShortVideoContext().shootWay) || Intrinsics.LJFF("prop_page", getShortVideoContext().shootWay)) && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) != null) {
                Bundle bundleLIZIZ2 = C565520MFy.LIZIZ(this.LL);
                if (bundleLIZIZ2 == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                Effect effect = (Effect) bundleLIZIZ2.getParcelable("first_sticker");
                if (effect == null) {
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
    }

    private final InterfaceC2254081DKk Z1() {
        return getCameraApi().St2();
    }

    @Override // X.InterfaceC1650730t3f
    public void Jn() {
        C1452640nuA.LJII(null, false, getShortVideoContext().creativeModel.musicBuzModel);
        Z1().Qa(true);
        Z1().pauseEffectAudio(false);
        Z1().setMusicPath("");
        Z1().vh(0L, 0L, -1L, -1, "", false);
        Z1().E4(false);
        getStickerApiComponent().e62();
        getShortVideoContext().LJJLIIIJ(0);
        getShortVideoContext().cameraComponentModel.mMusicStart = 0;
        getShortVideoContext().cameraComponentModel.mWorkspace.wQ();
        getShortVideoContext().cameraComponentModel.mMusicPath = null;
        C1622510sK9.LIZIZ(getStickerApiComponent(), C1DPV.LIZIZ.LIZIZ(C1DPW.FTC_AUDIO_RECORD_OPEN_CANCEL_MUSIC, null));
        this.LLJILJILJ.LJIIJ(Unit.LIZ);
        if (getShortVideoContext().cameraComponentModel.mDurationSwitchable) {
            return;
        }
        getRecordControlApi().l72(getShortVideoContext().cameraComponentModel.mCurrentDurationMode, false);
    }

    @Override // X.InterfaceC1650730t3f
    public void uX1() {
        L62(MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel));
        y5(false);
    }

    public C560530Lyd<Unit> G2() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1650730t3f
    public /* bridge */ /* synthetic */ LiveEvent Vk() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1650730t3f
    public /* bridge */ /* synthetic */ LiveEvent Wv() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.C11DL
    public /* bridge */ /* synthetic */ InterfaceC874803bO getReceiver() {
        getReceiver();
        return this;
    }

    public C560530Lyd<Unit> w2() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1650730t3f
    public void L62(AVMusic aVMusic) {
        this.LLILLL.LJI.LJIIJ(aVMusic);
    }

    @Override // X.InterfaceC1650730t3f
    public void Yj(boolean z) {
        this.LLILLL.LJFF.LJII(Boolean.valueOf(z));
    }

    public <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 getState(VM1 vm1) {
        return (S1) C1170060gYO.LIZ(this, vm1);
    }

    @Override // X.InterfaceC1650730t3f
    public void nv(Integer num) {
        this.LLILLL.LJIIIIZZ.LJIIJ(num);
    }

    public final void setEnable(boolean z) {
        if (!getShortVideoContext().LJJLL() && !getShortVideoContext().LJJIFFI()) {
            if (getShortVideoContext().LJJJJLL()) {
                z = false;
            }
            y5(z);
            Yj(z);
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
            if (z) {
                if (aVMusicExtractAVMusic == null) {
                    L62(null);
                    return;
                }
                return;
            } else {
                if (aVMusicExtractAVMusic == null || !getShortVideoContext().LJJJJZI()) {
                    return;
                }
                L62(aVMusicExtractAVMusic);
                return;
            }
        }
        Y7(Boolean.FALSE, null, null);
    }

    @Override // X.InterfaceC1650730t3f
    public void sn(C1454900nxo c1454900nxo) {
        long j;
        long jLIZ;
        long jMin;
        long jLongValue;
        BackgroundVideo backgroundVideo;
        EnumC1649480t1e enumC1649480t1eLIZ;
        BackgroundVideo backgroundVideo2;
        final C1652450t6R c1652450t6RO2 = o2();
        c1652450t6RO2.getClass();
        if (c1454900nxo.LIZ) {
            if (!c1652450t6RO2.LIZIZ.isFinishing()) {
                C1443960ngA.LIZIZ(c1652450t6RO2.LJ);
                BackgroundVideo backgroundVideo3 = c1652450t6RO2.LJ.cameraComponentModel.curBackgroundVideo;
                if (backgroundVideo3 != null) {
                    long maxDuration = backgroundVideo3.getMaxDuration();
                    if (maxDuration > 0 && (backgroundVideo2 = c1652450t6RO2.LJ.cameraComponentModel.curBackgroundVideo) != null && !backgroundVideo2.isMultiBgVideo()) {
                        ShortVideoContext shortVideoContext = c1652450t6RO2.LJ;
                        shortVideoContext.LJJLIIIJJI(Math.min(shortVideoContext.cameraComponentModel.mMaxDuration, maxDuration));
                    }
                }
                c1652450t6RO2.LIZJ.ht1(new C531060KsC(c1652450t6RO2.LJ.cameraComponentModel.mMaxDuration));
                c1652450t6RO2.LIZLLL.Jn();
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(c1454900nxo.LIZLLL) || c1652450t6RO2.LIZIZ.isFinishing()) {
            return;
        }
        String str = c1454900nxo.LIZLLL;
        AVMusic aVMusic = c1454900nxo.LIZJ;
        String str2 = c1454900nxo.LIZIZ;
        ShortVideoContext shortVideoContext2 = c1652450t6RO2.LJ;
        if (shortVideoContext2.cameraComponentModel.mCurrentDurationMode) {
            j = C1652450t6R.LJI;
        } else {
            j = 15000;
        }
        if (C1443960ngA.LJIIJJI(shortVideoContext2.stitchContext.stitchParams)) {
            C443120HZe<Long, Long, Long> c443120HZeLIZ = C1444030ngH.LIZ(c1652450t6RO2.LJ.stitchContext.stitchParams, str, aVMusic, j);
            jLIZ = c443120HZeLIZ.getFirst().longValue();
            jMin = c443120HZeLIZ.getSecond().longValue();
            jLongValue = c443120HZeLIZ.getThird().longValue();
        } else {
            if (aVMusic != null && !TextUtils.isEmpty(str)) {
                jLIZ = C579120MnW.LIZ(aVMusic, str);
                jMin = Math.min(jLIZ, j);
            } else {
                jLIZ = 0;
                jMin = j;
            }
            BackgroundVideo backgroundVideo4 = c1652450t6RO2.LJ.cameraComponentModel.curBackgroundVideo;
            if (backgroundVideo4 != null) {
                long maxDuration2 = backgroundVideo4.getMaxDuration();
                if (maxDuration2 > 0 && (backgroundVideo = c1652450t6RO2.LJ.cameraComponentModel.curBackgroundVideo) != null && !backgroundVideo.isMultiBgVideo()) {
                    jMin = Math.min(jMin, maxDuration2);
                }
            }
            jLongValue = jMin;
        }
        c1652450t6RO2.LJ.LJJLIIIJILLIZJL(str2);
        ShortVideoContext shortVideoContext3 = c1652450t6RO2.LJ;
        shortVideoContext3.cameraComponentModel.mMusicPath = str;
        shortVideoContext3.LJJLIIIJJI(jMin);
        C15R5.LJFF(c1652450t6RO2.LJ.cameraComponentModel.mMusicPath, new C15RH() { // from class: X.0t6Z
            @Override // X.C15RH
            public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
                c1652450t6RO2.LJ.musicWaveBean = C15R5.LIZIZ(aVMusicWaveBean);
            }
        });
        c1652450t6RO2.LIZLLL.qt(aVMusic, str);
        if (aVMusic != null) {
            if (aVMusic.getShootDuration() <= j && Math.abs(aVMusic.getShootDuration() - aVMusic.getDuration()) < 1000) {
                InterfaceC1649500t1g interfaceC1649500t1g = (InterfaceC1649500t1g) c1652450t6RO2.LJFF.getValue();
                if (interfaceC1649500t1g != null) {
                    interfaceC1649500t1g.Dw(false);
                }
            } else {
                InterfaceC1649500t1g interfaceC1649500t1g2 = (InterfaceC1649500t1g) c1652450t6RO2.LJFF.getValue();
                if (interfaceC1649500t1g2 != null) {
                    interfaceC1649500t1g2.Dw(true);
                }
            }
        }
        if (c1652450t6RO2.LJ.LJJJJLL()) {
            enumC1649480t1eLIZ = C1649470t1d.LIZ(new C1649470t1d(), j, jLongValue);
        } else {
            enumC1649480t1eLIZ = C1649470t1d.LIZ(new C1649470t1d(), j, jLIZ);
        }
        if (enumC1649480t1eLIZ == EnumC1649480t1e.MUSIC && c1454900nxo.LJFF) {
            c1652450t6RO2.LIZLLL.nv(1);
        }
        c1652450t6RO2.LIZJ.ht1(new C531060KsC(jLongValue));
    }

    @Override // X.InterfaceC1650730t3f
    public void y5(boolean z) {
        this.LLILLL.LJII.LJII(Boolean.valueOf(z));
    }

    public C1652420t6O(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }

    private final void T2(String str, AVMusic aVMusic) {
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

    @Override // X.InterfaceC1650730t3f
    public void Dm(float f, float f2) {
        this.LLILLL.LIZLLL.LJII(new Pair<>(Float.valueOf(f), Float.valueOf(f2)));
    }

    @Override // X.InterfaceC1650730t3f
    public void qt(AVMusic aVMusic, String str) {
        C1452640nuA.LJII(aVMusic, false, getShortVideoContext().creativeModel.musicBuzModel);
        if (aVMusic != null) {
            boolean zLJJJJZI = getShortVideoContext().LJJJJZI();
            Z1().pauseEffectAudio(true);
            getShortVideoContext().cameraComponentModel.mWorkspace.MC(str);
            getShortVideoContext().cameraComponentModel.mMusicPath = str;
            Z1().setMusicPath(str);
            Z1().vh(0L, 0L, -1L, -1, str, false);
            Z1().E4(true);
            Z1().Qa(false);
            getStickerApiComponent().Es2(true);
            if (!zLJJJJZI) {
                Z1().uh(getActivity(), getCameraApi().OA2().getAudioRecorderInterface());
            }
            int duration = aVMusic.getDuration();
            if (duration > 0) {
                getShortVideoContext().LJJLIIIJ(duration);
            }
            if (!getShortVideoContext().LJJJJLL()) {
                getShortVideoContext().cameraComponentModel.mMusicStart = 0;
            }
            getShortVideoContext().mMusicStrongBeatUrl = aVMusic.strongBeatUrl;
            C1622510sK9.LIZIZ(getStickerApiComponent(), C1DPV.LIZIZ.LIZIZ(C1DPW.FTC_AUDIO_RECORD_OPEN_CHOOSE_MUSIC, null));
            this.LLJILJIL.LJIIJ(Unit.LIZ);
        } else {
            this.LLJILJILJ.LJIIJ(Unit.LIZ);
        }
        if (!getShortVideoContext().cameraComponentModel.mDurationSwitchable) {
            getRecordControlApi().l72(getShortVideoContext().cameraComponentModel.mCurrentDurationMode, false);
        }
    }

    @Override // X.C11E9
    public <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public <M1 extends C11E5<S1, PROP1>, PROP1 extends C004I, S1 extends C004I, R> R withSubstate(C11E5<S1, PROP1> c11e5, Function1<? super PROP1, ? extends R> function1) {
        return (R) C1171740gb6.LJIIIIZZ(c11e5, function1);
    }

    @Override // X.InterfaceC1650730t3f
    public void Y7(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            this.LLILLL.LIZ.LJII(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            this.LLILLL.LIZJ.LJII(Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool3 != null) {
            this.LLILLL.LIZIZ.LJII(Boolean.valueOf(bool3.booleanValue()));
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

    @Override // X.InterfaceC1650730t3f
    public void us(boolean z, String str, AVMusic aVMusic, String str2) {
        if (z) {
            L62(null);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            L62(aVMusic);
            P3();
        }
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
