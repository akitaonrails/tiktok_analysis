package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.09TM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TM extends C09AY implements InterfaceC1631620sYq<String, SpeakerCenter.KevaSpeakerBean, Effect, Unit> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ C11Y7 LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CoroutineExceptionHandler LLILZIL;
    public final /* synthetic */ TextStickerData LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09TM(C259800zU c259800zU, C11Y7 c11y7, C259800zU c259800zU2, String str, C19775512Yv c19775512Yv, TextStickerData textStickerData, long j) {
        super(3);
        this.LL = c259800zU;
        this.LLILLJJLI = c11y7;
        this.LLILLL = c259800zU2;
        this.LLILZ = str;
        this.LLILZIL = c19775512Yv;
        this.LLILZLL = textStickerData;
        this.LLIZ = j;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, SpeakerCenter.KevaSpeakerBean kevaSpeakerBean, Effect effect) {
        ITTSService iTTSServiceY7;
        String str2 = str;
        SpeakerCenter.KevaSpeakerBean kevaSpeakerBean2 = kevaSpeakerBean;
        Effect effect2 = effect;
        C013C c013c = new C013C();
        String str3 = this.LL.element;
        if (str3 == null || str3.length() == 0) {
            this.LL.element = C09TA.LIZ(str2);
        }
        String str4 = C09TA.LIZ;
        if (C09TA.LIZIZ(this.LL.element) == 1 && (iTTSServiceY7 = this.LLILLJJLI.y7()) != null) {
            iTTSServiceY7.initAudioSDKHandler(this.LLILLJJLI.LJJJLIIL().getCreativeInfo());
        }
        this.LLILLJJLI.LLLLIILLL = new C09TF(this.LLILLL.element, this.LLILZ, this.LL.element, 120);
        this.LLILLJJLI.Ya(true);
        C11Y7 c11y7 = this.LLILLJJLI;
        C09TA.LIZJ(c11y7.LLLLIILLL, c11y7.s7());
        C11Y7 c11y72 = this.LLILLJJLI;
        InterfaceC497601wk interfaceC497601wk = c11y72.LLLIIIL;
        CoroutineExceptionHandler coroutineExceptionHandler = this.LLILZIL;
        C23250099c.LIZLLL(interfaceC497601wk, coroutineExceptionHandler, null, new C2185508hJ(this.LLILLL, this.LL, this.LLILZLL, c11y72, str2, this.LLILZ, effect2, kevaSpeakerBean2, this.LLIZ, coroutineExceptionHandler, c013c, null), 2);
        return Unit.LIZ;
    }
}
