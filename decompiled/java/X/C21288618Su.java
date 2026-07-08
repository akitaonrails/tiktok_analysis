package X;

import com.ss.android.ugc.tools.chat.message.cell.regeneratecell.RegenerateAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18Su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.cell.regeneratecell.RegenerateAssem$startTimerJob$1", f = "RegenerateAssem.kt", l = {148}, m = "invokeSuspend")
public final class C21288618Su extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ RegenerateAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21288618Su(C869590Y9l c869590Y9l, RegenerateAssem regenerateAssem, InterfaceC1364105Vn<? super C21288618Su> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c869590Y9l;
        this.LLILZ = regenerateAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21288618Su c21288618Su = new C21288618Su(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c21288618Su.LLILLJJLI = obj;
        return c21288618Su;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        boolean z;
        C1C7U.LIZ("RegenerateAssem@34fe.startTimerJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        while (C2296808zG.LJI(interfaceC497601wk)) {
            C18U8.LIZ.getClass();
            if (C18U8.LIZ() - this.LLILLL.getCreatedAt() > ((long) (C342380DbY.LIZ().retryEnableIntervalInHours * 60 * 60)) * 100) {
                z = true;
            } else {
                z = false;
            }
            this.LLILZ.zp(!z);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("RegenerateAssem@34fe.startTimerJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RegenerateAssem@34fe.startTimerJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
