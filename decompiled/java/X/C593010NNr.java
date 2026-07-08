package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS223S0300000_14;
import njp.a;

/* JADX INFO: renamed from: X.0NNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.handler.BatchSetConversationSettingHandler$batchChangeConversationSettingInfo$1", f = "BatchSetConversationSettingHandler.kt", l = {}, m = "invokeSuspend")
public final class C593010NNr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C868070Y3p LL;
    public final /* synthetic */ List<C0Y8T> LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593010NNr(C868070Y3p c868070Y3p, List<C0Y8T> list, Boolean bool, List<String> list2, List<String> list3, InterfaceC1364105Vn<? super C593010NNr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c868070Y3p;
        this.LLILLJJLI = list;
        this.LLILLL = bool;
        this.LLILZ = list2;
        this.LLILZIL = list3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593010NNr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BatchSetConversationSettingHandler@703b.batchChangeConversationSettingInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIL(this.LLILLJJLI, new AwS223S0300000_14(this.LLILLL, (Boolean) this.LLILZ, this.LLILZIL, (List<String>) 21));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BatchSetConversationSettingHandler@703b.batchChangeConversationSettingInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
