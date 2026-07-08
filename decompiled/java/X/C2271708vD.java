package X;

import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08vD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$downloadAudio$2$1", f = "TTSPanelUIComponent.kt", l = {1128}, m = "invokeSuspend")
public final class C2271708vD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11Y7 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ReadTextEffectBean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C013C LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2271708vD(C11Y7 c11y7, String str, ReadTextEffectBean readTextEffectBean, String str2, int i, C013C c013c, InterfaceC1364105Vn<? super C2271708vD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11y7;
        this.LLILLL = str;
        this.LLILZ = readTextEffectBean;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2271708vD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.downloadAudio$2$1");
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
            ITTSService iTTSServiceY7 = this.LLILLJJLI.y7();
            if (iTTSServiceY7 != null) {
                String str = this.LLILLL;
                String str2 = this.LLILZ.mSpeaker.streamTTSSpkID;
                String str3 = this.LLILZIL;
                CreativeInfo creativeInfo = this.LLILLJJLI.LJJJLIIL().getCreativeInfo();
                boolean zLIZJ = C386350FCv.LIZJ(this.LLILZ.effect);
                final C11Y7 c11y7 = this.LLILLJJLI;
                final String str4 = this.LLILZIL;
                final int i2 = this.LLILZLL;
                final ReadTextEffectBean readTextEffectBean = this.LLILZ;
                final String str5 = this.LLILLL;
                final C013C c013c = this.LLIZ;
                ITTSCallback iTTSCallback = new ITTSCallback() { // from class: X.09Ss
                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onStreamTTSPlayFinish() {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onConnectToServerSuc() {
                        c238400w22.element = System.currentTimeMillis();
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onCancel(int i3) {
                        c11y7.q9(str5, str4, readTextEffectBean);
                        C2376309Sv c2376309Sv = C2376309Sv.LIZ;
                        String str6 = readTextEffectBean.mSpeaker.streamTTSSpkID;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j = jCurrentTimeMillis;
                        long j2 = c238400w2.element - j;
                        long j3 = c238400w22.element - j;
                        int length = str4.length();
                        c2376309Sv.getClass();
                        C2376309Sv.LIZIZ(i3, str6, 0, jCurrentTimeMillis2 - j, j2, j3, 2, length, 0, 0, null, -5);
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFirstAudioReceived(SAMICoreTtsResult sAMICoreTtsResult) {
                        C11Y7.LLLLLZL.getClass();
                        String str6 = C11Y7.LLLLZI;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onFirstAudioRecived firstAudio：");
                        sbLIZ.append(sAMICoreTtsResult);
                        sbLIZ.append(" , startTTSSuc:");
                        sbLIZ.append(c013c.element);
                        sbLIZ.append(",reqText:");
                        sbLIZ.append(str4);
                        sbLIZ.append(", speakid:");
                        sbLIZ.append(str5);
                        C201955140j.LIZIZ(str6, C2188811AlT.LIZIZ(sbLIZ));
                        if (!c013c.element) {
                            c11y7.w9(str4);
                            c013c.element = true;
                            c238400w2.element = System.currentTimeMillis();
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onSuccess(int i3, File file, String str6, SAMICoreServerEvent sAMICoreServerEvent) {
                        c11y7.I9(i3, str4, i2, readTextEffectBean, file, jCurrentTimeMillis);
                        int iLIZIZ = C141Q.LIZIZ(-1, file.getAbsolutePath());
                        C2376309Sv c2376309Sv = C2376309Sv.LIZ;
                        String str7 = str5;
                        String str8 = str4;
                        long j = c238400w2.element;
                        long j2 = jCurrentTimeMillis;
                        long j3 = c238400w22.element;
                        c2376309Sv.getClass();
                        C2376309Sv.LIZ(i3, 0, str7, str6, str8, iLIZIZ, j, j2, j3, sAMICoreServerEvent);
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFailure(int i3, int i4, String str6, String str7, SAMICoreServerEvent sAMICoreServerEvent) {
                        Integer numValueOf;
                        int i5 = i4;
                        if (i3 == 1 && sAMICoreServerEvent != null) {
                            i5 = sAMICoreServerEvent.statusCode;
                        }
                        c11y7.t9(str4, i5, str6, str7, i2, readTextEffectBean);
                        C2376309Sv c2376309Sv = C2376309Sv.LIZ;
                        String str8 = str5;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j = jCurrentTimeMillis;
                        long j2 = jCurrentTimeMillis2 - j;
                        long j3 = c238400w2.element - j;
                        long j4 = c238400w22.element - j;
                        int length = str4.length();
                        String str9 = null;
                        if (sAMICoreServerEvent != null) {
                            str9 = sAMICoreServerEvent.taskId;
                            numValueOf = Integer.valueOf(sAMICoreServerEvent.statusCode);
                        } else {
                            numValueOf = null;
                        }
                        c2376309Sv.getClass();
                        C2376309Sv.LIZIZ(i3, str8, 0, j2, j3, j4, 2, length, 0, 0, str9, numValueOf);
                        C11Y7.LLLLLZL.getClass();
                        String str10 = C11Y7.LLLLZI;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("speakid : ");
                        sbLIZ.append(str5);
                        sbLIZ.append(" onFailure file cost ");
                        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        C201955140j.LIZIZ(str10, C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
                this.LL = 1;
                if (iTTSServiceY7.fetchTTSAudioFile(str, str2, str3, creativeInfo, zLIZJ, true, iTTSCallback, (InterfaceC1364105Vn<? super Unit>) this) == objLJFF) {
                    C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.downloadAudio$2$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.downloadAudio$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
