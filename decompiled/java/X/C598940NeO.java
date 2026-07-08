package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.content.sea.communication.SeaContentCommunication$triggerAction$job$1$result$1", f = "SeaContentCommunication.kt", l = {295}, m = "invokeSuspend")
public final class C598940NeO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC598980NeS>, Object> {
    public int LL;
    public final /* synthetic */ C598950NeP LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598940NeO(C598950NeP c598950NeP, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super C598940NeO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c598950NeP;
        this.LLILLL = map;
        this.LLILZ = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598940NeO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaContentCommunication@2638.triggerAction$job$1$result$1");
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
            InterfaceC599000NeU interfaceC599000NeUInvoke = this.LLILLJJLI.LIZIZ.invoke();
            Map<String, Object> map = this.LLILLL;
            this.LL = 1;
            obj = interfaceC599000NeUInvoke.LIZ(map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeaContentCommunication@2638.triggerAction$job$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SeaContentCommunication@2638.triggerAction$job$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC598980NeS> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
