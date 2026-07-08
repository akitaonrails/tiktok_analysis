package X;

import com.ss.android.ugc.aweme.services.audio.ITTSService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$afterDialogDismissRecoverAcion$1", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C19469011Ey extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C11Y7 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19469011Ey(C11Y7 c11y7, InterfaceC1364105Vn<? super C19469011Ey> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c11y7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19469011Ey(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.afterDialogDismissRecoverAcion$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C09TF c09tf = this.LL.LLLLIILLL;
        if (c09tf != null && C123100dR.LIZ(c09tf.LIZJ)) {
            ITTSService iTTSServiceY7 = this.LL.y7();
            if (iTTSServiceY7 != null) {
                iTTSServiceY7.stopStreamReading();
            }
            this.LL.da();
            this.LL.oa(false);
            this.LL.o7().Gn();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.afterDialogDismissRecoverAcion$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
