package X;

import Y.AgS211S0200000_28;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.common.component.AiChatSaveComponent$saveToGallery$$inlined$transform$1", f = "AiChatSaveComponent.kt", l = {40}, m = "invokeSuspend")
public final class C1890230zHx extends C09AX implements Function2<InterfaceC346701Wf<? super InterfaceC1157570gEF<? extends String>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890230zHx(InterfaceC346201Wa interfaceC346201Wa, InterfaceC1364105Vn interfaceC1364105Vn, Context context) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1890230zHx c1890230zHx = new C1890230zHx(this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c1890230zHx.LLILLJJLI = obj;
        return c1890230zHx;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super InterfaceC1157570gEF<? extends String>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatSaveComponent@8e0a.saveToGallery$$inlined$transform$1");
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
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            InterfaceC346201Wa interfaceC346201Wa = this.LLILLL;
            AgS211S0200000_28 agS211S0200000_28 = new AgS211S0200000_28(interfaceC346701Wf, this.LLILZ, 1);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS211S0200000_28, this) == objLJFF) {
                C1C7U.LIZIZ("AiChatSaveComponent@8e0a.saveToGallery$$inlined$transform$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatSaveComponent@8e0a.saveToGallery$$inlined$transform$1");
        return unit;
    }
}
