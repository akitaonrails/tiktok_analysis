package X;

import com.bytedance.android.livesdk.guide.model.TaskActionResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0hqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaskApiUtilsKt$requestTaskAction$2", f = "TaskApiUtils.kt", l = {234}, m = "invokeSuspend")
public final class C1219610hqJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TaskActionResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ Long LLJI;
    public final /* synthetic */ Long LLJIJIL;
    public final /* synthetic */ int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219610hqJ(String str, int i, String str2, Long l, int i2, Integer num, String str3, Integer num2, Long l2, Long l3, int i3, InterfaceC1364105Vn<? super C1219610hqJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = l;
        this.LLILZLL = i2;
        this.LLIZ = num;
        this.LLIZLLLIL = str3;
        this.LLJ = num2;
        this.LLJI = l2;
        this.LLJIJIL = l3;
        this.LLJILJIL = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219610hqJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJLIIIL = obj;
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskAction$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            C099F c099fLIZIZ = C090F.LIZIZ();
            C1219670hqP.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, new AwS668S0100000_19(c099fLIZIZ, 40), new AwS633S0100000_19(c099fLIZIZ, 235));
            this.LL = 1;
            objLJLIIIL = c099fLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskAction$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskAction$2");
        return objLJLIIIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends TaskActionResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
