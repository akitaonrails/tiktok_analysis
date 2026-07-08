package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08eK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$processTtsWithOutUISucResult$1$duration$1", f = "TTSPanelUIComponent.kt", l = {}, m = "invokeSuspend")
public final class C2167008eK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ File LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2167008eK(File file, InterfaceC1364105Vn<? super C2167008eK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2167008eK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSPanelUIComponent@ceaf.processTtsWithOutUISucResult$1$duration$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer numLJ = C2286608xc.LJ(C141Q.LIZIZ(-1, this.LL.getAbsolutePath()));
        C1C7U.LIZIZ("TTSPanelUIComponent@ceaf.processTtsWithOutUISucResult$1$duration$1");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
