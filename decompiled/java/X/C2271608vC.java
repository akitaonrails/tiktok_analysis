package X;

import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import njp.a;

/* JADX INFO: renamed from: X.08vC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$readTextWithOutUI$4$1$1", f = "TTSPanelUIComponent.kt", l = {2538}, m = "invokeSuspend")
public final class C2271608vC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ TextStickerData LLILZ;
    public final /* synthetic */ C11Y7 LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Effect LLIZLLLIL;
    public final /* synthetic */ SpeakerCenter.KevaSpeakerBean LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ CoroutineExceptionHandler LLJIJIL;
    public final /* synthetic */ C013C LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2271608vC(C259800zU<String> c259800zU, C259800zU<String> c259800zU2, TextStickerData textStickerData, C11Y7 c11y7, String str, String str2, Effect effect, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, long j, CoroutineExceptionHandler coroutineExceptionHandler, C013C c013c, InterfaceC1364105Vn<? super C2271608vC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = textStickerData;
        this.LLILZIL = c11y7;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = effect;
        this.LLJ = kevaSpeakerBean;
        this.LLJI = j;
        this.LLJIJIL = coroutineExceptionHandler;
        this.LLJILJIL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2271608vC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        boolean zLIZJ;
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.readTextWithOutUI$4$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = System.currentTimeMillis();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final C238400w2 c238400w22 = new C238400w2();
            c238400w22.element = System.currentTimeMillis();
            C11Y7.LLLLLZL.getClass();
            String str = C11Y7.LLLLZI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("readTextWithOutUI speaker:");
            sbLIZ.append(this.LLILLJJLI.element);
            sbLIZ.append(", streamSpeak:");
            sbLIZ.append(this.LLILLL.element);
            sbLIZ.append(" baseStickerModel?.id:");
            TextStickerData textStickerData = this.LLILZ;
            if (textStickerData != null) {
                numLJ = C2286608xc.LJ(textStickerData.getIdInNewEngine());
            } else {
                numLJ = null;
            }
            sbLIZ.append(numLJ);
            C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            ITTSService iTTSServiceY7 = this.LLILZIL.y7();
            if (iTTSServiceY7 != null) {
                String str2 = this.LLILZLL;
                String str3 = this.LLILLL.element;
                String str4 = this.LLIZ;
                CreativeInfo creativeInfo = this.LLILZIL.LJJJLIIL().getCreativeInfo();
                Effect effect = this.LLIZLLLIL;
                if (effect != null) {
                    zLIZJ = C386350FCv.LIZJ(effect);
                } else {
                    zLIZJ = false;
                }
                final C11Y7 c11y7 = this.LLILZIL;
                final String str5 = this.LLIZ;
                final String str6 = this.LLILZLL;
                final C259800zU<String> c259800zU = this.LLILLL;
                final SpeakerCenter.KevaSpeakerBean kevaSpeakerBean = this.LLJ;
                final TextStickerData textStickerData2 = this.LLILZ;
                final long j = this.LLJI;
                final CoroutineExceptionHandler coroutineExceptionHandler = this.LLJIJIL;
                final C013C c013c = this.LLJILJIL;
                ITTSCallback iTTSCallback = new ITTSCallback() { // from class: X.09Su
                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onStreamTTSPlayFinish() {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onConnectToServerSuc() {
                        c238400w22.element = System.currentTimeMillis();
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onCancel(int i2) {
                        C2376309Sv c2376309Sv = C2376309Sv.LIZ;
                        String str7 = str6;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j2 = jCurrentTimeMillis;
                        long j3 = c238400w2.element - j2;
                        long j4 = c238400w22.element - j2;
                        int length = str5.length();
                        c2376309Sv.getClass();
                        C2376309Sv.LIZIZ(i2, str7, 0, jCurrentTimeMillis2 - j2, j3, j4, 2, length, 0, 0, null, -5);
                        c11y7.LLLLLL.LJIIIZ(Unit.LIZ);
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFirstAudioReceived(SAMICoreTtsResult sAMICoreTtsResult) {
                        C11Y7.LLLLLZL.getClass();
                        String str7 = C11Y7.LLLLZI;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onFirstAudioRecived firstAudio2：");
                        sbLIZ2.append(sAMICoreTtsResult);
                        sbLIZ2.append(" , startTTSSuc:");
                        sbLIZ2.append(c013c.element);
                        sbLIZ2.append(",reqText:");
                        sbLIZ2.append(str5);
                        sbLIZ2.append(", speakid:");
                        sbLIZ2.append(str6);
                        C201955140j.LIZIZ(str7, C2188811AlT.LIZIZ(sbLIZ2));
                        if (!c013c.element) {
                            c11y7.w9(str5);
                            c013c.element = true;
                            c238400w2.element = System.currentTimeMillis();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onSuccess(int i2, File file, String str7, SAMICoreServerEvent sAMICoreServerEvent) {
                        C11Y7.P9(c11y7, i2, str5, file, str6, c259800zU.element, kevaSpeakerBean, textStickerData2, j, coroutineExceptionHandler, null);
                        int iLIZIZ = C141Q.LIZIZ(-1, file.getAbsolutePath());
                        C2376309Sv c2376309Sv = C2376309Sv.LIZ;
                        String str8 = str6;
                        String str9 = str5;
                        long j2 = c238400w2.element;
                        long j3 = jCurrentTimeMillis;
                        long j4 = c238400w22.element;
                        c2376309Sv.getClass();
                        C2376309Sv.LIZ(i2, 0, str8, str7, str9, iLIZIZ, j2, j3, j4, sAMICoreServerEvent);
                        c11y7.LLLLLL.LJIIIZ(Unit.LIZ);
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFailure(int i2, int i3, String str7, String str8, SAMICoreServerEvent sAMICoreServerEvent) {
                        Integer numValueOf;
                        c11y7.J9(str5, str6, i3, str7, str8);
                        C2376309Sv c2376309Sv = C2376309Sv.LIZ;
                        String str9 = str6;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j2 = jCurrentTimeMillis;
                        long j3 = jCurrentTimeMillis2 - j2;
                        long j4 = c238400w2.element - j2;
                        long j5 = c238400w22.element - j2;
                        int length = str5.length();
                        String str10 = null;
                        if (sAMICoreServerEvent != null) {
                            str10 = sAMICoreServerEvent.taskId;
                            numValueOf = Integer.valueOf(sAMICoreServerEvent.statusCode);
                        } else {
                            numValueOf = null;
                        }
                        c2376309Sv.getClass();
                        C2376309Sv.LIZIZ(i2, str9, 0, j3, j4, j5, 2, length, 0, 0, str10, numValueOf);
                        c11y7.LLLLLL.LJIIIZ(Unit.LIZ);
                    }
                };
                this.LL = 1;
                if (iTTSServiceY7.fetchTTSAudioFile(str2, str3, str4, creativeInfo, zLIZJ, true, iTTSCallback, (InterfaceC1364105Vn<? super Unit>) this) == objLJFF) {
                    C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.readTextWithOutUI$4$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.readTextWithOutUI$4$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
