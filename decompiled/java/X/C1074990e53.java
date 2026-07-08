package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactHandler$handleInternal$uploadResponse$1", f = "ContactHandler.kt", l = {66}, m = "invokeSuspend")
public final class C1074990e53 extends C09AX implements Function2<List<? extends ContactBookUploadItem>, InterfaceC1364105Vn<? super ContactUploadResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1075000e54 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074990e53(C1075000e54 c1075000e54, InterfaceC1364105Vn<? super C1074990e53> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1075000e54;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1074990e53 c1074990e53 = new C1074990e53(this.LLILLL, interfaceC1364105Vn);
        c1074990e53.LLILLJJLI = obj;
        return c1074990e53;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactHandler@cfe8.handleInternal$uploadResponse$1");
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
            Map<String, String> mapLIZLLL = this.LLILLL.LIZLLL((List) this.LLILLJJLI);
            C1075000e54 c1075000e54 = this.LLILLL;
            this.LL = 1;
            obj = c1075000e54.LIZJ.LJIIIIZZ(this, new C1074970e51(c1075000e54, mapLIZLLL, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ContactHandler@cfe8.handleInternal$uploadResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ContactHandler@cfe8.handleInternal$uploadResponse$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends ContactBookUploadItem> list, InterfaceC1364105Vn<? super ContactUploadResponse> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
