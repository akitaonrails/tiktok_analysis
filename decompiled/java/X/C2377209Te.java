package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09Te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.sticker.text.logic.EditorProTextEventListener$downloadTTSResourceAndStartTTS$2$3", f = "EditorProTextEventListener.kt", l = {}, m = "invokeSuspend")
public final class C2377209Te extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EditorProTTSHelper LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2377209Te(EditorProTTSHelper editorProTTSHelper, Function0<Unit> function0, InterfaceC1364105Vn<? super C2377209Te> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = editorProTTSHelper;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2377209Te(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EditorProTTSHelper.LIZJ(this.LL, new AwS582S0100000_3(this.LLILLJJLI, (Function0<Unit>) 109));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProTextEventListener@e151.downloadTTSResourceAndStartTTS$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
