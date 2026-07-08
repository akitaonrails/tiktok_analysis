package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0e51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.handler.ContactHandler$upload$2", f = "ContactHandler.kt", l = {82}, m = "invokeSuspend")
public final class C1074970e51 extends C09AX implements Function1<InterfaceC1364105Vn<? super ContactUploadResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1075000e54 LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074970e51(C1075000e54 c1075000e54, Map<String, String> map, InterfaceC1364105Vn<? super C1074970e51> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1075000e54;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1074970e51(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super ContactUploadResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactHandler@cfe8.upload$2");
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
            C1074950e4z c1074950e4z = this.LLILLJJLI.LJFF;
            Map<String, String> map = this.LLILLL;
            this.LL = 1;
            obj = c1074950e4z.LIZ(map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ContactHandler@cfe8.upload$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ContactHandler@cfe8.upload$2");
        return obj;
    }
}
