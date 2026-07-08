package X;

import com.ss.android.ugc.aweme.fetch.OutreachFetchRequestBody;
import com.ss.android.ugc.aweme.fetch.OutreachFetchResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fetch.OutreachFetchRequestManager$fetch$job$1$response$1", f = "IOutreachFetchAPI.kt", l = {82}, m = "invokeSuspend")
public final class C595360NWs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super OutreachFetchResponse>, Object> {
    public int LL;
    public final /* synthetic */ OutreachFetchRequestBody LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595360NWs(OutreachFetchRequestBody outreachFetchRequestBody, InterfaceC1364105Vn<? super C595360NWs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = outreachFetchRequestBody;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C595360NWs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OutreachFetchRequestManager@7fe3.fetch$job$1$response$1");
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
            InterfaceC595380NWu interfaceC595380NWu = C595350NWr.LIZ;
            InterfaceC595380NWu interfaceC595380NWu2 = C595350NWr.LIZ;
            OutreachFetchRequestBody outreachFetchRequestBody = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC595380NWu2.LIZ(outreachFetchRequestBody, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OutreachFetchRequestManager@7fe3.fetch$job$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("OutreachFetchRequestManager@7fe3.fetch$job$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super OutreachFetchResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
