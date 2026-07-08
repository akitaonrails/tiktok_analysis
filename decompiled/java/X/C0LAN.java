package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LAN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AIGCArchHelperKt$queryCreationIDByServerTaskId$taskInfo$1", f = "AIGCArchHelper.kt", l = {52}, m = "invokeSuspend")
public final class C0LAN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LSZ>, Object> {
    public int LL;
    public final /* synthetic */ ICreationAsyncTaskManager LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LAN(ICreationAsyncTaskManager iCreationAsyncTaskManager, String str, InterfaceC1364105Vn<? super C0LAN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iCreationAsyncTaskManager;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LAN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCArchHelperKt@737d.queryCreationIDByServerTaskId$taskInfo$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManager = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = iCreationAsyncTaskManager.LIZJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCArchHelperKt@737d.queryCreationIDByServerTaskId$taskInfo$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIGCArchHelperKt@737d.queryCreationIDByServerTaskId$taskInfo$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LSZ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
