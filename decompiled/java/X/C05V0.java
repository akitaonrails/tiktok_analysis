package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05V0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.view.TakoAIVideoChatListAnimationState$getProgress$1$1", f = "TakoAIVideoChatList.kt", l = {}, m = "invokeSuspend")
public final class C05V0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05VF LL;
    public final /* synthetic */ InterfaceC1672680td4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05V0(C05VF c05vf, InterfaceC1672680td4 interfaceC1672680td4, InterfaceC1364105Vn<? super C05V0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05vf;
        this.LLILLJJLI = interfaceC1672680td4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05V0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoChatListAnimationState@8652.getProgress$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJFF(this.LLILLJJLI.getUuid(), this.LLILLJJLI.getMessageType(), this.LLILLJJLI.getContent().length());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoChatListAnimationState@8652.getProgress$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
