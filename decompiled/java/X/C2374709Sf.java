package X;

import com.ss.android.ugc.gamora.editor.audio.tts.network.TextToSpeechApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Sf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment$downloadAudio$1$response$1", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
public final class C2374709Sf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TextToSpeechApi.FetchTextAudioResponse>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2374709Sf(String str, String str2, String str3, InterfaceC1364105Vn<? super C2374709Sf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2374709Sf(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSFragment@b180.downloadAudio$1$response$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TextToSpeechApi.FetchTextAudioResponse fetchTextAudioResponseLIZ = C09SZ.LIZ(null, this.LL, this.LLILLJJLI, this.LLILLL);
        C1C7U.LIZIZ("TTSFragment@b180.downloadAudio$1$response$1");
        return fetchTextAudioResponseLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TextToSpeechApi.FetchTextAudioResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
