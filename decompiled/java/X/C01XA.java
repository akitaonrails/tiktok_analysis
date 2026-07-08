package X;

import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01XA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService$getAutoSoundStatusSuspend$2", f = "AutoSoundCheckService.kt", l = {}, m = "invokeSuspend")
public final class C01XA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ AutoSoundCheckService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01XA(AutoSoundCheckService autoSoundCheckService, InterfaceC1364105Vn<? super C01XA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = autoSoundCheckService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoSoundCheckService@2f23.getAutoSoundStatusSuspend$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(((AudioCopyrightDetectAPI) this.LL.LIZ.getValue()).LIZ());
        C1C7U.LIZIZ("AutoSoundCheckService@2f23.getAutoSoundStatusSuspend$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
