package X;

import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import com.ss.android.ugc.aweme.relation.auth.model.ContactUploadResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactBookFilterByPsi$tryFilterBeforeUpload$expV1$resp$1", f = "ContactFilterByPsi.kt", l = {219}, m = "invokeSuspend")
public final class C596130NZr extends C09AX implements Function1<InterfaceC1364105Vn<? super ContactUploadResponse>, Object> {
    public int LL;
    public final /* synthetic */ Function2<List<ContactBookUploadItem>, InterfaceC1364105Vn<? super ContactUploadResponse>, Object> LLILLJJLI;
    public final /* synthetic */ List<ContactBookUploadItem> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596130NZr(List list, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596130NZr(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super ContactUploadResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactBookFilterByPsi@dd2a.tryFilterBeforeUpload$expV1$resp$1");
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
            Function2<List<ContactBookUploadItem>, InterfaceC1364105Vn<? super ContactUploadResponse>, Object> function2 = this.LLILLJJLI;
            List<ContactBookUploadItem> list = this.LLILLL;
            this.LL = 1;
            obj = function2.invoke(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ContactBookFilterByPsi@dd2a.tryFilterBeforeUpload$expV1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ContactBookFilterByPsi@dd2a.tryFilterBeforeUpload$expV1$resp$1");
        return obj;
    }
}
