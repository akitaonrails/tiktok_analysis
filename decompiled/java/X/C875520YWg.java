package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageSenderComponent$releaseDeleteMessage$1", f = "PigeonMessageSenderComponent.kt", l = {}, m = "invokeSuspend")
public final class C875520YWg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PigeonMessageSenderComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875520YWg(PigeonMessageSenderComponent pigeonMessageSenderComponent, InterfaceC1364105Vn<? super C875520YWg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pigeonMessageSenderComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875520YWg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PigeonMessageSenderComponent@7b6b.releaseDeleteMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PigeonMessageSenderComponent pigeonMessageSenderComponent = this.LL;
        try {
            Iterator<C869590Y9l> it2 = pigeonMessageSenderComponent.LLILZIL.iterator();
            while (it2.hasNext()) {
                pigeonMessageSenderComponent.LIZ(it2.next(), true, null);
            }
            pigeonMessageSenderComponent.LLILZIL.clear();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        PigeonMessageSenderComponent pigeonMessageSenderComponent2 = this.LL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            pigeonMessageSenderComponent2.LL.getPigeonDepend().LIZIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PigeonMessageSenderComponent@7b6b.releaseDeleteMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
