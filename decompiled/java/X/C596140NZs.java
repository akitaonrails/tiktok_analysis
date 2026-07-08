package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactFilterByPsi$Companion$uploadAfterTryPsiFilter$resp$1", f = "ContactFilterByPsi.kt", l = {82}, m = "invokeSuspend")
public final class C596140NZs extends C09AX implements Function1<InterfaceC1364105Vn<? super ContactUploadResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1074950e4z LLILLJJLI;
    public final /* synthetic */ C20166313vR LLILLL;
    public final /* synthetic */ List<ContactBookUploadItem> LLILZ;
    public final /* synthetic */ Function2<List<ContactBookUploadItem>, InterfaceC1364105Vn<? super ContactUploadResponse>, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C596140NZs(C1074950e4z c1074950e4z, C20166313vR c20166313vR, List<ContactBookUploadItem> list, Function2<? super List<ContactBookUploadItem>, ? super InterfaceC1364105Vn<? super ContactUploadResponse>, ? extends Object> function2, InterfaceC1364105Vn<? super C596140NZs> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1074950e4z;
        this.LLILLL = c20166313vR;
        this.LLILZ = list;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596140NZs(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super ContactUploadResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactFilterByPsi$Companion@15ca.uploadAfterTryPsiFilter$resp$1");
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
            C20166613vU c20166613vU = new C20166613vU();
            C1074950e4z c1074950e4z = this.LLILLJJLI;
            C20166313vR c20166313vR = this.LLILLL;
            List<ContactBookUploadItem> list = this.LLILZ;
            Function2<List<ContactBookUploadItem>, InterfaceC1364105Vn<? super ContactUploadResponse>, Object> function2 = this.LLILZIL;
            this.LL = 1;
            obj = c20166613vU.LIZ(c1074950e4z, c20166313vR, list, function2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ContactFilterByPsi$Companion@15ca.uploadAfterTryPsiFilter$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ContactFilterByPsi$Companion@15ca.uploadAfterTryPsiFilter$resp$1");
        return obj;
    }
}
