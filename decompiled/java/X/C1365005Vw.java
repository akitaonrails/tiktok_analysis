package X;

import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl$fetchBatchTtsAudio$1$deferredResult$1", f = "TtsReuseServiceImpl.kt", l = {120}, m = "invokeSuspend")
public final class C1365005Vw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TtsReuseModel LLILLJJLI;
    public final /* synthetic */ TtsReuseServiceImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365005Vw(TtsReuseModel ttsReuseModel, TtsReuseServiceImpl ttsReuseServiceImpl, InterfaceC1364105Vn<? super C1365005Vw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ttsReuseModel;
        this.LLILLL = ttsReuseServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365005Vw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("TtsReuseServiceImpl@25ea.fetchBatchTtsAudio$1$deferredResult$1");
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
            String str3 = this.LLILLJJLI.textStr;
            boolean zBooleanValue = false;
            if (str3 == null || str3.length() == 0 || (((str = this.LLILLJJLI.speakerId) == null || str.length() == 0) && ((str2 = this.LLILLJJLI.streamSpeakerId) == null || str2.length() == 0))) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchBatchTtsAudio$1$deferredResult$1");
                return unit;
            }
            TtsReuseServiceImpl ttsReuseServiceImpl = this.LLILLL;
            TtsReuseModel ttsReuseModel = this.LLILLJJLI;
            String str4 = ttsReuseModel.textStr;
            if (str4 != null) {
                String str5 = ttsReuseModel.speakerId;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                String str7 = ttsReuseModel.streamSpeakerId;
                if (str7 != null) {
                    str6 = str7;
                }
                Boolean boolIsVoiceClone = ttsReuseModel.isVoiceClone();
                if (boolIsVoiceClone != null) {
                    zBooleanValue = boolIsVoiceClone.booleanValue();
                }
                this.LL = 1;
                if (ttsReuseServiceImpl.fetchTtsAudioFile(str4, str5, str6, zBooleanValue, this) == objLJFF) {
                    C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchBatchTtsAudio$1$deferredResult$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchBatchTtsAudio$1$deferredResult$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
