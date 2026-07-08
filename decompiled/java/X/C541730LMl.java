package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationDownloadListTask$downloadFileWithRetry$2$1", f = "AICreationDownloadListTask.kt", l = {275}, m = "invokeSuspend")
public final class C541730LMl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LMR>, Object> {
    public int LL;
    public final /* synthetic */ C541740LMm LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C541730LMl(C541740LMm c541740LMm, C118300cf c118300cf, String str, String str2, String str3, Function2<? super Integer, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C541730LMl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c541740LMm;
        this.LLILLL = c118300cf;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C541730LMl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationDownloadListTask@242.downloadFileWithRetry$2$1");
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
            C541740LMm c541740LMm = this.LLILLJJLI;
            int i2 = this.LLILLL.element;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLIZ;
            this.LL = 1;
            obj = c541740LMm.LJJJLL(i2, str, str2, str3, function2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AICreationDownloadListTask@242.downloadFileWithRetry$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AICreationDownloadListTask@242.downloadFileWithRetry$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LMR> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
