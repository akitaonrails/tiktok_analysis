package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.MessageRequestModelImpl$batchAcceptStrangers$1", f = "MessageRequestModelImpl.kt", l = {169}, m = "invokeSuspend")
public final class C610260Nwe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C872760YLq LLILLJJLI;
    public final /* synthetic */ List<Pair<Long, String>> LLILLL;
    public final /* synthetic */ EnumC868530Y5j LLILZ;
    public final /* synthetic */ InterfaceC863600XuI<List<String>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610260Nwe(C872760YLq c872760YLq, List<Pair<Long, String>> list, EnumC868530Y5j enumC868530Y5j, InterfaceC863600XuI<List<String>> interfaceC863600XuI, InterfaceC1364105Vn<? super C610260Nwe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c872760YLq;
        this.LLILLL = list;
        this.LLILZ = enumC868530Y5j;
        this.LLILZIL = interfaceC863600XuI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610260Nwe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestModelImpl@bb78.batchAcceptStrangers$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C872760YLq c872760YLq = this.LLILLJJLI;
            List<Pair<Long, String>> list = this.LLILLL;
            EnumC868530Y5j enumC868530Y5j = this.LLILZ;
            InterfaceC863600XuI<List<String>> interfaceC863600XuI = this.LLILZIL;
            this.LL = 1;
            if (c872760YLq.LIZIZ(list, enumC868530Y5j, interfaceC863600XuI, EnumC1477205qM.DEFAULT, this) == objLJFF) {
                C1C7U.LIZIZ("MessageRequestModelImpl@bb78.batchAcceptStrangers$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestModelImpl@bb78.batchAcceptStrangers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
