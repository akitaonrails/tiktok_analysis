package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam;
import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11YS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11YS extends AbstractC2255721DQs<InterfaceC391390FWf> implements InterfaceC391390FWf, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C11YW LLILLL;
    public final C1457240o1a LLILZ;
    public long LLJILJILJ;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC391390FWf LLILZLL = this;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 430));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 604));
    public final List<ReadTextEffectBean> LLJ = new ArrayList();
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 605));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(200));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(258));
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C11YS.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C11YS.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final InterfaceC1455850nzL G2() {
        return (InterfaceC1455850nzL) this.LLILZIL.getValue(this, LLJJ[0]);
    }

    private final InterfaceC1455860nzM H2() {
        return (InterfaceC1455860nzM) this.LLJILLL.getValue(this, LLJJ[1]);
    }

    @Override // X.InterfaceC391390FWf
    public void Gn() {
        this.LLILLL.Gn();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJI.getValue();
    }

    public final InterfaceC1635390sev T2() {
        return (InterfaceC1635390sev) this.LLIZLLLIL.getValue();
    }

    public final TextToSpeechApi X1() {
        return (TextToSpeechApi) this.LLJILJIL.getValue();
    }

    public final CreativeInfo o2() {
        return (CreativeInfo) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC391390FWf
    public void pauseVideo() {
        this.LLILLL.pauseVideo();
    }

    public final C11NJ w2() {
        return (C11NJ) this.LLJIJIL.getValue();
    }

    private final C0FVT W2() {
        C385670FAf<InterfaceC1461660o8i> c385670FAfAT;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ;
        InterfaceC1455850nzL interfaceC1455850nzLG2 = G2();
        if (interfaceC1455850nzLG2 == null || (c385670FAfAT = interfaceC1455850nzLG2.AT()) == null || (interfaceC1461660o8iLIZJ = c385670FAfAT.LIZJ()) == null) {
            return null;
        }
        return interfaceC1461660o8iLIZJ.kR();
    }

    @Override // X.InterfaceC391390FWf
    public void o() {
        w2().LJ();
    }

    public InterfaceC391390FWf Z1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    @Override // X.InterfaceC391390FWf
    public void IQ(C11FI<TTSAudioParam, TextStickerData> c11fi) {
        TTSAudioParam tTSAudioParamLIZ = c11fi.LIZ();
        if (tTSAudioParamLIZ.nleUuid.length() > 0) {
            this.LLILLL.In(tTSAudioParamLIZ.nleUuid);
        }
    }

    @Override // X.InterfaceC391390FWf
    public void Jo1(C11FI<TTSAudioParam, TextStickerData> c11fi) {
        long duration;
        TTSAudioParam tTSAudioParamLIZ = c11fi.LIZ();
        if (tTSAudioParamLIZ.nleUuid.length() > 0) {
            this.LLILLL.In(tTSAudioParamLIZ.nleUuid);
        }
        if (tTSAudioParamLIZ.audioTrackFilePath != null) {
            AbstractC1452680nuE abstractC1452680nuEGc = H2().gc();
            if (abstractC1452680nuEGc != null) {
                duration = abstractC1452680nuEGc.LJJ().getDuration();
            } else {
                duration = -2;
            }
            int i = tTSAudioParamLIZ.audioTrackDuration;
            int i2 = tTSAudioParamLIZ.startTime;
            if (duration >= i + i2) {
                duration = ((long) i) + ((long) i2);
            }
            C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
            c347650Dk3.LIZIZ = tTSAudioParamLIZ.audioTrackFilePath;
            c347650Dk3.LIZLLL = 0L;
            c347650Dk3.LJ = tTSAudioParamLIZ.audioTrackDuration;
            c347650Dk3.LJFF = tTSAudioParamLIZ.startTime;
            c347650Dk3.LJI = duration;
            c347650Dk3.LJIIIZ = 0.0f;
            this.LLILLL.Hn(c347650Dk3);
            String str = c347650Dk3.LIZJ;
            if (str == null) {
                str = "";
            }
            tTSAudioParamLIZ.nleUuid = str;
            tTSAudioParamLIZ.hasReadTextAudio = true;
        }
        c11fi.LIZIZ(tTSAudioParamLIZ);
        i3(c11fi);
    }

    @Override // X.InterfaceC391390FWf
    public void Vh0(C11FI<TTSAudioParam, TextStickerData> c11fi) {
        long duration;
        TTSAudioParam tTSAudioParamLIZ = c11fi.LIZ();
        if (tTSAudioParamLIZ.nleUuid.length() > 0) {
            this.LLILLL.In(tTSAudioParamLIZ.nleUuid);
        }
        if (tTSAudioParamLIZ.audioTrackFilePath != null) {
            AbstractC1452680nuE abstractC1452680nuEGc = H2().gc();
            if (abstractC1452680nuEGc != null) {
                duration = abstractC1452680nuEGc.LJJ().getDuration();
            } else {
                duration = -2;
            }
            int i = tTSAudioParamLIZ.audioTrackDuration;
            int i2 = tTSAudioParamLIZ.startTime;
            if (duration >= i + i2) {
                duration = ((long) i) + ((long) i2);
            }
            C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
            c347650Dk3.LIZIZ = tTSAudioParamLIZ.audioTrackFilePath;
            c347650Dk3.LIZLLL = 0L;
            c347650Dk3.LJ = tTSAudioParamLIZ.audioTrackDuration;
            c347650Dk3.LJFF = tTSAudioParamLIZ.startTime;
            c347650Dk3.LJI = duration;
            float f = C0FM8.LIZ * 1.0f;
            c347650Dk3.LJIIIZ = f;
            this.LLILLL.Hn(c347650Dk3);
            String str = c347650Dk3.LIZJ;
            if (str == null) {
                str = "";
            }
            tTSAudioParamLIZ.nleUuid = str;
            tTSAudioParamLIZ.hasReadTextAudio = true;
            C11Y7.LLLLLZL.getClass();
            String str2 = C11Y7.LLLLZI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addTtsAudioTrack-->filePath:");
            sbLIZ.append(tTSAudioParamLIZ.audioTrackFilePath);
            sbLIZ.append(" timeClipStart:0 timeClipEnd:");
            sbLIZ.append(tTSAudioParamLIZ.audioTrackDuration);
            C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addTtsAudioTrack-->startTime:");
            sbLIZ2.append(tTSAudioParamLIZ.startTime);
            sbLIZ2.append(" endTime:");
            sbLIZ2.append(duration);
            sbLIZ2.append(" volume:");
            sbLIZ2.append(f);
            sbLIZ2.append(" nleUuid:");
            sbLIZ2.append(c347650Dk3.LIZJ);
            C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        c11fi.LIZIZ(tTSAudioParamLIZ);
        i3(c11fi);
    }

    public final void i3(C11FI<TTSAudioParam, TextStickerData> c11fi) {
        C0FWP c0fwpRi;
        C0FVT c0fvtW2 = W2();
        if (c0fvtW2 != null && (c0fwpRi = c0fvtW2.Ri()) != null) {
            c0fwpRi.LJIILL(C0F7U.LJ(c11fi.W(), null, 3));
        }
    }

    public final void W1(ReadTextEffectBean readTextEffectBean, C11FI<TTSAudioParam, TextStickerData> c11fi) {
        if (readTextEffectBean != null) {
            TTSAudioParam tTSAudioParamLIZ = c11fi.LIZ();
            List<String> challenge = readTextEffectBean.effect.getChallenge();
            if (challenge != null) {
                Iterator<String> it2 = challenge.iterator();
                while (it2.hasNext()) {
                    tTSAudioParamLIZ.ttsHashTagIds.add(it2.next());
                }
            }
            c11fi.LIZIZ(tTSAudioParamLIZ);
            C386350FCv.LIZ(C372650EjH.LIZIZ(this.LL), LJJJLIIL(), readTextEffectBean.effect);
        }
    }

    public C11YS(C19A3 c19a3, C1DRG c1drg, C11YW c11yw, C1457240o1a c1457240o1a) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = c11yw;
        this.LLILZ = c1457240o1a;
    }

    @Override // X.InterfaceC391390FWf
    public void Ix1(C11FI<TTSAudioParam, TextStickerData> c11fi, String str, String str2, C11YV c11yv) {
        if (C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C11YR(str2, this, str, c11fi, c11yv, null), 3);
        }
    }

    public final void c3(final CreativeInfo creativeInfo, final C11FI<TTSAudioParam, TextStickerData> c11fi, final String str, final String str2, final C11YV c11yv) {
        final TTSAudioParam tTSAudioParamLIZ = c11fi.LIZ();
        w2().LIZ(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.11YN
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<TTSAudioParam> c09aj) {
                C1C7U.LIZ("TextToSpeechComponent@c530.saveAudioToFile$saveDataObservable$1");
                C0VSJ c0vsjLIZ = C2279808wW.LIZ(creativeInfo, str2, "");
                if (c0vsjLIZ != null && c0vsjLIZ.exists()) {
                    int iLIZIZ = C141Q.LIZIZ(-1, c0vsjLIZ.getAbsolutePath());
                    TTSAudioParam tTSAudioParam = tTSAudioParamLIZ;
                    tTSAudioParam.audioTrackDuration = iLIZIZ;
                    tTSAudioParam.audioTrackFilePath = c0vsjLIZ.getAbsolutePath();
                    tTSAudioParamLIZ.audioPathList.add(c0vsjLIZ.getAbsolutePath());
                    tTSAudioParamLIZ.audioText = str;
                    if (!c09aj.isDisposed()) {
                        c09aj.onNext(tTSAudioParamLIZ);
                        c09aj.onComplete();
                    }
                } else {
                    c09aj.tryOnError(new IllegalStateException("File not exists"));
                }
                C1C7U.LIZIZ("TextToSpeechComponent@c530.saveAudioToFile$saveDataObservable$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.11YU
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("TextToSpeechComponent@c530.saveAudioToFile$saveDataObservable$2");
                c11fi.LIZIZ(tTSAudioParamLIZ);
                this.i3(c11fi);
                c11yv.LIZIZ(c11fi);
                C1C7U.LIZIZ("TextToSpeechComponent@c530.saveAudioToFile$saveDataObservable$2");
            }
        }));
    }
}
