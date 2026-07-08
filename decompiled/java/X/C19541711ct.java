package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.text.a0;
import lgo.a;

/* JADX INFO: renamed from: X.11ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19541711ct extends AbstractC2255721DQs<InterfaceC19753012Qe> implements InterfaceC19753012Qe, InterfaceC19547311dn, C0FF5, InterfaceC379610EuV {
    public static final C19543711dD LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final C1DRG LL;
    public Function1<? super Boolean, Unit> LLIZLLLIL;
    public Function2<? super Integer, ? super String, Unit> LLJ;
    public C19538011cI LLJI;
    public boolean LLJIJIL;
    public C19536311c1 LLJILJIL;
    public final InterfaceC19753012Qe LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZ = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753012Qe.class, null);
    public final InterfaceC497601wk LLIZ = C2296808zG.LIZIZ();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 207));

    /* JADX WARN: Type inference failed for: r0v7, types: [X.11dD] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19541711ct.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19541711ct.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new C2217381BqS(C19541711ct.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0)};
        LLJILLL = new Object() { // from class: X.11dD
        };
        LLJJI = 8;
    }

    private final void G2() {
        C19536311c1 c19536311c1 = this.LLJILJIL;
        if (c19536311c1 != null) {
            LLLII(c19536311c1, c19536311c1.LJ, null);
            String str = c19536311c1.LJ;
            if (str != null && !a0.LJJIIZI(str, "_stream_1024_temp", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c19536311c1.LJ);
                sbLIZ.append("_stream_1024_temp");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists()) {
                    c0vsj.delete();
                }
            }
            play();
            this.LLJILJIL = null;
        }
    }

    private final InterfaceC1418580n1E Z1() {
        return (InterfaceC1418580n1E) this.LLILZIL.getValue(this, LLJJ[1]);
    }

    private final C19536511c3 w2() {
        return (C19536511c3) this.LLJILJILJ.getValue();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJJ[0]);
    }

    public final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue();
    }

    public final InterfaceC19753012Qe o2() {
        return (InterfaceC19753012Qe) this.LLILZLL.getValue(this, LLJJ[2]);
    }

    @Override // X.InterfaceC19547311dn
    public void pause() {
        C23250099c.LIZLLL(this.LLIZ, null, null, new C319800CgE(this, null), 3);
    }

    @Override // X.InterfaceC19547311dn
    public void play() {
        C23250099c.LIZLLL(this.LLIZ, null, null, new C319810CgF(this, null), 3);
    }

    @Override // X.InterfaceC19753012Qe
    public void bl2() {
        C19536511c3 c19536511c3W2 = w2();
        c19536511c3W2.getClass();
        if (C256060A1s.LIZ()) {
            c19536511c3W2.LIZ().LIZ();
        }
    }

    @Override // X.InterfaceC19753012Qe
    public void dF1() {
        List<AVChallenge> challenges;
        AVChallenge challenge;
        float voiceVolume = Z1().Ie2() ? LJJJLIIL().getVoiceVolume() : 0.0f;
        InterfaceC1455860nzM interfaceC1455860nzMX1 = X1();
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AudioEffectParam veAudioEffectParam = videoPublishEditModelLJJJLIIL.getVeAudioEffectParam();
        if (veAudioEffectParam != null && (challenge = veAudioEffectParam.getChallenge()) != null) {
            videoPublishEditModelLJJJLIIL.removeAudioEffectChallengeFromTitleAndStruct(challenge);
            linkedHashSet.add(challenge);
        }
        AudioEffectParam veAudioEffectParam2 = videoPublishEditModelLJJJLIIL.getVeAudioEffectParam();
        if (veAudioEffectParam2 != null && (challenges = veAudioEffectParam2.getChallenges()) != null) {
            for (AVChallenge aVChallenge : challenges) {
                videoPublishEditModelLJJJLIIL.removeAudioEffectChallengeFromTitleAndStruct(aVChallenge);
                linkedHashSet.add(aVChallenge);
            }
        }
        C0CHQ.LIZ().getPublishService().LJJJJZ();
        C857950XlB.LJFF(videoPublishEditModelLJJJLIIL, linkedHashSet);
        C1446160nji.LIZLLL(videoPublishEditModelLJJJLIIL);
        C352320Dra.LIZLLL(interfaceC1455860nzMX1, voiceVolume);
        VoiceConversionModel voiceConversionModel = videoPublishEditModelLJJJLIIL.creativeModel.voiceConversionModel;
        C13BV c13bv = C13BV.INSTANCE;
        voiceConversionModel.vcMultiRecordPathList = c13bv;
        voiceConversionModel.hasDubVoiceConversion = false;
        voiceConversionModel.vcMultiOriginPathList = c13bv;
        voiceConversionModel.hasOriginVoiceConversion = false;
        videoPublishEditModelLJJJLIIL.setVeAudioEffectParam(null);
        videoPublishEditModelLJJJLIIL.creativeModel.voiceConversionModel.hasStyleConversion = false;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_svc_cache_clear_on_cleareffect", true, true)) {
            C19546111db.LIZ.getClass();
            Keva keva = SpeakerCenter.LIZ;
            keva.storeString("effectPath", "");
            keva.storeString("uploadId", "");
            keva.storeString("restoreSpeakerId", "");
            StreamVoiceConversionModel streamVoiceConversionModel = LJJJLIIL().creativeModel.streamVoiceConversionModel;
            streamVoiceConversionModel.vcVoiceId = "";
            streamVoiceConversionModel.vcVoiceName = "";
            streamVoiceConversionModel.vcEffectId = "";
            streamVoiceConversionModel.vcSegmentEffectIdFromMap.clear();
            streamVoiceConversionModel.vcEffectSpeakerId = "";
            streamVoiceConversionModel.vcEffectName = "";
            streamVoiceConversionModel.vcHasApply = false;
            streamVoiceConversionModel.vcShootingEffectId = "";
            streamVoiceConversionModel.vcShootingEffectIdFrom = "";
            streamVoiceConversionModel.isSVCSelected = false;
            this.LLJILJIL = null;
        }
        C19536511c3 c19536511c3W2 = w2();
        c19536511c3W2.getClass();
        if (C256060A1s.LIZ()) {
            c19536511c3W2.LIZ().LIZ();
        }
    }

    @Override // X.InterfaceC19753012Qe
    public void mV0() {
        C19536511c3 c19536511c3W2 = w2();
        c19536511c3W2.getClass();
        if (C256060A1s.LIZ()) {
            c19536511c3W2.LIZ().LIZ();
            ((C19547411do) C19548411dy.LIZ()).LJI(true);
            ((C19547411do) C19548411dy.LIZ()).LJI(false);
        }
    }

    @Override // X.InterfaceC19753012Qe
    public boolean o5() {
        return w2().LIZ().LJIIL.get();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJILJIL = null;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        this.LLJIJIL = true;
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLJIJIL = false;
        G2();
    }

    @Override // X.InterfaceC19753012Qe
    public C19537911cH pC0() {
        return (C19537911cH) w2().LJIIJJI.getValue();
    }

    @Override // X.InterfaceC19547311dn
    public INLEPlayer w0() {
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        INLEMediaSession iNLEMediaSession;
        AbstractC1452680nuE abstractC1452680nuEGc = X1().gc();
        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ() : null;
        if (!(interfaceC1452170ntPLJJ instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) == null || (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) == null || (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) == null) {
            return null;
        }
        return iNLEMediaSession.getPlayerApi();
    }

    public InterfaceC19753012Qe W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19541711ct(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC19753012Qe
    public void D8(AtomicBoolean atomicBoolean) {
        w2().LIZ().LJIIL = atomicBoolean;
    }

    @Override // X.InterfaceC19753012Qe
    public void G81(C19538011cI c19538011cI) {
        if (this.LLJI == null) {
            this.LLJI = c19538011cI;
        }
    }

    @Override // X.InterfaceC19753012Qe
    public void HY0(C19536311c1 c19536311c1) {
        RunnableC19546811di runnableC19546811di;
        C19536511c3 c19536511c3W2 = w2();
        c19536511c3W2.getClass();
        if (C256060A1s.LIZ()) {
            C19546311dd c19546311ddLIZ = c19536511c3W2.LIZ();
            C23250099c.LIZLLL(c19546311ddLIZ.LJIIIIZZ, null, null, new C1219290hpn(c19546311ddLIZ, null), 3);
            if (c19536311c1 != null) {
                c19546311ddLIZ.LJ = c19536311c1.LIZJ;
                C19546111db c19546111db = C19546111db.LIZ;
                VideoPublishEditModel videoPublishEditModel = c19546311ddLIZ.LIZ;
                c19546111db.getClass();
                if (!C19546111db.LJIIL(c19536311c1, videoPublishEditModel) && (runnableC19546811di = c19546311ddLIZ.LJIJ) != null) {
                    C201955140j.LIZIZ("VoiceConversionStream", "out side fast cancel change effect");
                    c19546311ddLIZ.LJIIZILJ.removeCallbacks(runnableC19546811di);
                    return;
                }
                return;
            }
            RunnableC19546811di runnableC19546811di2 = c19546311ddLIZ.LJIJ;
            if (runnableC19546811di2 == null) {
                return;
            }
            C201955140j.LIZIZ("VoiceConversionStream", "out side fast cancel , real cancel");
            c19546311ddLIZ.LJIIZILJ.removeCallbacks(runnableC19546811di2);
        }
    }

    @Override // X.InterfaceC19753012Qe
    public void YB(Function2<? super Integer, ? super String, Unit> function2) {
        this.LLJ = function2;
    }

    @Override // X.InterfaceC19753012Qe
    public void eU1(Function1<? super Boolean, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    @Override // X.InterfaceC19753012Qe
    public void oT(String str) {
        w2().LIZLLL(str);
    }

    @Override // X.InterfaceC19547311dn
    public void Q1(int i, String str) {
        C23250099c.LIZLLL(this.LLIZ, null, null, new C319790CgD(this, i, str, null), 3);
    }

    @Override // X.InterfaceC19753012Qe
    public String SY0(List<C19536311c1> list, InterfaceC1219340hps interfaceC1219340hps) {
        return w2().LIZJ(list, interfaceC1219340hps);
    }

    @Override // X.InterfaceC19753012Qe
    public void WG2(List<C19536311c1> list, final InterfaceC1219270hpl interfaceC1219270hpl) {
        final C19536511c3 c19536511c3W2 = w2();
        c19536511c3W2.getClass();
        if (C0C1I.LIZ()) {
            C19529711ax c19529711ax = c19536511c3W2.LJIJI;
            if (c19529711ax != null) {
                c19529711ax.LIZLLL();
            }
            C19529711ax c19529711axLIZ = C19536411c2.LIZ(c19536511c3W2.LIZIZ, list, c19536511c3W2.LIZJ);
            c19529711axLIZ.LJFF.LIZ = new InterfaceC1210670hbt() { // from class: X.11bX
                @Override // X.InterfaceC1210670hbt
                public final void LIZIZ(InterfaceC19526611aS interfaceC19526611aS, String str, int i, Boolean bool) {
                }

                @Override // X.InterfaceC1210670hbt
                public final void LIZ(boolean z, C19530211b2 c19530211b2, InterfaceC19526511aR interfaceC19526511aR) {
                    C1524805y2.LIZIZ(0L, new C19532811bS(z, interfaceC1219270hpl, c19536511c3W2, c19530211b2, interfaceC19526511aR));
                }
            };
            if (((Boolean) C0BP3.LIZ.getValue()).booleanValue()) {
                a.LIZIZ.LIZ().LIZJ(c19536511c3W2.LJI, "VoiceChanger#prefetchVoiceChange2", new AwS573S0100000_29(c19529711axLIZ, 783));
            }
            c19536511c3W2.LJIJI = c19529711axLIZ;
            if (interfaceC1219270hpl != null) {
                interfaceC1219270hpl.onStart();
            }
            ((AbstractC19524211a4) c19536511c3W2.LJIILLIIL.getValue()).LJJIJIL(c19529711axLIZ, (C11ZU) c19536511c3W2.LJIIZILJ.getValue());
            return;
        }
        C19536811c6 c19536811c6 = (C19536811c6) c19536511c3W2.LJIIJ.getValue();
        Context context = c19536511c3W2.LIZIZ;
        C1461720o8o c1461720o8o = new C1461720o8o(c19536511c3W2.LIZJ);
        c19536811c6.getClass();
        C19536911c7 c19536911c7 = new C19536911c7(context, list, c1461720o8o);
        c19536811c6.LIZJ = c19536911c7;
        c19536911c7.LJIIIZ = c19536811c6.LIZIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1219260hpk(interfaceC1219270hpl, c19536511c3W2, "exportAndUpload", null), 3);
    }

    @Override // X.InterfaceC19753012Qe
    public void by2(InterfaceC1455860nzM interfaceC1455860nzM, Effect effect) {
        C352320Dra.LJ(interfaceC1455860nzM, effect);
    }

    @Override // X.InterfaceC19753012Qe
    public void FZ1(C19536311c1 c19536311c1, InterfaceC1455860nzM interfaceC1455860nzM, Function2<? super Effect, ? super AudioEffectParam, Unit> function2) {
        float voiceVolume;
        if (Z1().Ie2()) {
            voiceVolume = LJJJLIIL().getVoiceVolume();
        } else {
            voiceVolume = 0.0f;
        }
        C352320Dra.LIZIZ(c19536311c1, voiceVolume, interfaceC1455860nzM, function2);
    }

    @Override // X.C0FF5
    public void LLLII(C19536311c1 c19536311c1, String str, Function2<? super Effect, ? super AudioEffectParam, Unit> function2) {
        C23250099c.LIZLLL(this.LLIZ, null, null, new C19541811cu(str, this, c19536311c1, function2, null), 3);
    }
}
