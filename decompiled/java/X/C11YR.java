package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11YR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audio.tts.base.TextToSpeechComponent$requestAudio$1", f = "TextToSpeechComponent.kt", l = {176}, m = "invokeSuspend")
public final class C11YR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C11YC LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C11YS LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C11FI<TTSAudioParam, TextStickerData> LLIZ;
    public final /* synthetic */ C11YV LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11YR(String str, C11YS c11ys, String str2, C11FI<TTSAudioParam, TextStickerData> c11fi, C11YV c11yv, InterfaceC1364105Vn<? super C11YR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = c11ys;
        this.LLILZLL = str2;
        this.LLIZ = c11fi;
        this.LLIZLLLIL = c11yv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C11YR(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0 A[Catch: RuntimeException -> 0x01cc, TryCatch #0 {RuntimeException -> 0x01cc, blocks: (B:21:0x00c8, B:22:0x00cb, B:23:0x00d4, B:25:0x00f0, B:27:0x00f6, B:31:0x00ff, B:41:0x0155, B:43:0x017d, B:44:0x0182, B:33:0x0105, B:35:0x010b, B:36:0x0149, B:38:0x014f, B:40:0x0153, B:9:0x0052, B:11:0x005b, B:13:0x0069, B:15:0x0073, B:17:0x00bf, B:32:0x0102), top: B:49:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105 A[Catch: RuntimeException -> 0x01cc, TryCatch #0 {RuntimeException -> 0x01cc, blocks: (B:21:0x00c8, B:22:0x00cb, B:23:0x00d4, B:25:0x00f0, B:27:0x00f6, B:31:0x00ff, B:41:0x0155, B:43:0x017d, B:44:0x0182, B:33:0x0105, B:35:0x010b, B:36:0x0149, B:38:0x014f, B:40:0x0153, B:9:0x0052, B:11:0x005b, B:13:0x0069, B:15:0x0073, B:17:0x00bf, B:32:0x0102), top: B:49:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017d A[Catch: RuntimeException -> 0x01cc, TryCatch #0 {RuntimeException -> 0x01cc, blocks: (B:21:0x00c8, B:22:0x00cb, B:23:0x00d4, B:25:0x00f0, B:27:0x00f6, B:31:0x00ff, B:41:0x0155, B:43:0x017d, B:44:0x0182, B:33:0x0105, B:35:0x010b, B:36:0x0149, B:38:0x014f, B:40:0x0153, B:9:0x0052, B:11:0x005b, B:13:0x0069, B:15:0x0073, B:17:0x00bf, B:32:0x0102), top: B:49:0x0012 }] */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11YR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
