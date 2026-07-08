package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.resource.TemplateFetcher$requestTemplateDetailViaAssetItem$1$onFailed$1", f = "TemplateFetcher.kt", l = {}, m = "invokeSuspend")
public final class C1390505cN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1631620sYq<Integer, String, String, Unit> LL;
    public final /* synthetic */ ExceptionResult LLILLJJLI;
    public final /* synthetic */ Function2<String, String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1390505cN(InterfaceC1631620sYq<? super Integer, ? super String, ? super String, Unit> interfaceC1631620sYq, ExceptionResult exceptionResult, Function2<? super String, ? super String, Unit> function2, InterfaceC1364105Vn<? super C1390505cN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = exceptionResult;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390505cN(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String msg;
        String msg2;
        C1C7U.LIZ("TemplateFetcher@4ce9.requestTemplateDetailViaAssetItem$1$onFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1631620sYq<Integer, String, String, Unit> interfaceC1631620sYq = this.LL;
        String str = "unknown error";
        if (interfaceC1631620sYq != null) {
            Integer numLJ = C2286608xc.LJ(-1);
            ExceptionResult exceptionResult = this.LLILLJJLI;
            if (exceptionResult == null || (msg2 = exceptionResult.getMsg()) == null) {
                msg2 = "unknown error";
            }
            interfaceC1631620sYq.invoke(numLJ, msg2, "");
        }
        Function2<String, String, Unit> function2 = this.LLILLL;
        if (function2 != null) {
            ExceptionResult exceptionResult2 = this.LLILLJJLI;
            if (exceptionResult2 != null && (msg = exceptionResult2.getMsg()) != null) {
                str = msg;
            }
            function2.invoke(str, "");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateFetcher@4ce9.requestTemplateDetailViaAssetItem$1$onFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
