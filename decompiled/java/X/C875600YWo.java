package X;

import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent$fillLoadingStatus$1$1", f = "PigeonMessageListComponent.kt", l = {}, m = "invokeSuspend")
public final class C875600YWo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public final /* synthetic */ PigeonMessageListComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875600YWo(PigeonMessageListComponent pigeonMessageListComponent, InterfaceC1364105Vn<? super C875600YWo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pigeonMessageListComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875600YWo(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonMessageListComponent@9fc5.fillLoadingStatus$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Long lLJFF = C2286608xc.LJFF(this.LL.LL.getPigeonIMClient().LIZIZ.LJIIJJI().LJLZ(this.LL.LLILLJJLI.getConversationId()));
        C1C7U.LIZIZ("PigeonMessageListComponent@9fc5.fillLoadingStatus$1$1");
        return lLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
