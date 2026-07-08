package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.TemplateAutoCutAIComponent$observeAICreateI2ITaskStatus$job$1", f = "TemplateAutoCutAIComponent.kt", l = {385}, m = "invokeSuspend")
public final class C558850Lvv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C559060LwG LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C559020LwC LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C558850Lvv(C559060LwG c559060LwG, C559020LwC c559020LwC, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c559060LwG;
        this.LLILLL = str;
        this.LLILZ = c559020LwC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C558850Lvv(this.LLILLJJLI, this.LLILZ, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI;
        C1C7U.LIZ("TemplateAutoCutAIComponent@a1d6.observeAICreateI2ITaskStatus$job$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null && (interfaceC346201WaLJJJJLI = iCreationAsyncTaskManagerLIZ.LJJJJLI(this.LLILLJJLI.LIZJ)) != null) {
                C558840Lvu c558840Lvu = new C558840Lvu(this.LLILLJJLI, this.LLILZ, this.LLILLL, null);
                this.LL = 1;
                if (C09IC.LJII(interfaceC346201WaLJJJJLI, this, c558840Lvu) == objLJFF) {
                    C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.observeAICreateI2ITaskStatus$job$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.observeAICreateI2ITaskStatus$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
