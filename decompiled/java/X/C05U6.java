package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05U6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem$ChatList$2$1$1$2", f = "TakoAIVideoInputAssem.kt", l = {501}, m = "invokeSuspend")
public final class C05U6 extends C09AX implements Function2<C1668650tWZ, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C1677480tko<C1668650tWZ, C1677280tkU> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05U6(C1677480tko<C1668650tWZ, C1677280tkU> c1677480tko, InterfaceC1364105Vn<? super C05U6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1677480tko;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputAssem@6324.ChatList$2$1$1$2");
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
            float f = this.LLILLJJLI;
            C1677480tko<C1668650tWZ, C1677280tkU> c1677480tko = this.LLILLL;
            C1668650tWZ c1668650tWZ = new C1668650tWZ(f);
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, c1668650tWZ, null, null, null, this, 14) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.ChatList$2$1$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.ChatList$2$1$1$2");
        return unit;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05U6 c05u6 = new C05U6(this.LLILLL, interfaceC1364105Vn);
        c05u6.LLILLJJLI = ((C1668650tWZ) obj).LL;
        return c05u6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1668650tWZ c1668650tWZ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(new C1668650tWZ(c1668650tWZ.LL), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
