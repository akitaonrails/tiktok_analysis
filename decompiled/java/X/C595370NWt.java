package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fetch.OutreachFetchRequestBody;
import com.ss.android.ugc.aweme.fetch.OutreachFetchResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fetch.OutreachFetchRequestManager$fetch$job$1", f = "IOutreachFetchAPI.kt", l = {81}, m = "invokeSuspend")
public final class C595370NWt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OutreachFetchRequestBody LLILLJJLI;
    public final /* synthetic */ Function2<Integer, Throwable, Unit> LLILLL;
    public final /* synthetic */ Function1<OutreachFetchResponse, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C595370NWt(OutreachFetchRequestBody outreachFetchRequestBody, Function2<? super Integer, ? super Throwable, Unit> function2, Function1<? super OutreachFetchResponse, Unit> function1, InterfaceC1364105Vn<? super C595370NWt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = outreachFetchRequestBody;
        this.LLILLL = function2;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C595370NWt(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("OutreachFetchRequestManager@7fe3.fetch$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC595380NWu interfaceC595380NWu = C595350NWr.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Starting fetch request ");
                sbLIZ.append(this.LLILLJJLI);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C20571615ec c20571615ec = C20571615ec.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("OutreachFetchApi, ");
                sbLIZ2.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c20571615ec.getClass();
                C20571615ec.LIZJ(strLIZIZ2);
                InterfaceC595380NWu.LIZ.getClass();
                long j = C595390NWv.LIZIZ;
                C595360NWs c595360NWs = new C595360NWs(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C099A.LIZIZ(j, c595360NWs, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OutreachFetchRequestManager@7fe3.fetch$job$1");
                    return objLJFF;
                }
            }
            OutreachFetchResponse outreachFetchResponse = (OutreachFetchResponse) obj;
            if (outreachFetchResponse.available()) {
                Integer num = outreachFetchResponse.statusCode;
                if (num != null && num.intValue() == 0) {
                    this.LLILZ.invoke(outreachFetchResponse);
                } else {
                    Function2<Integer, Throwable, Unit> function2 = this.LLILLL;
                    Integer num2 = outreachFetchResponse.statusCode;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    Integer numLJ = C2286608xc.LJ(iIntValue);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("outreach fetch fail, msg: ");
                    sbLIZ3.append(outreachFetchResponse.statusMsg);
                    function2.invoke(numLJ, new Throwable(C2188811AlT.LIZIZ(sbLIZ3)));
                }
            } else {
                this.LLILLL.invoke(C2286608xc.LJ(10001), new Throwable("response is unavailable"));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC595380NWu interfaceC595380NWu2 = C595350NWr.LIZ;
            Function2<Integer, Throwable, Unit> function22 = this.LLILLL;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Request error: ");
            sbLIZ4.append(e.getMessage());
            Throwable th = new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
            function22.invoke(-1, th);
            String message = th.getMessage();
            if (message == null) {
                message = "General error occurred";
            }
            C20571615ec c20571615ec2 = C20571615ec.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("OutreachFetchApi, ");
            sbLIZ5.append(message);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
            c20571615ec2.getClass();
            C20571615ec.LIZIZ(strLIZIZ3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OutreachFetchRequestManager@7fe3.fetch$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
