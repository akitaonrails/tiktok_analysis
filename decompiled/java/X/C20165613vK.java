package X;

import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.13vK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask$getEncryptDataAndUnBlindV3$resp$1", f = "ContactFilterByPsi.kt", l = {447}, m = "invokeSuspend")
public final class C20165613vK extends C09AX implements Function1<InterfaceC1364105Vn<? super PsiUploadEncryptContactResponseV3>, Object> {
    public int LL;
    public final /* synthetic */ C20165313vH LLILLJJLI;
    public final /* synthetic */ C20165213vG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20165613vK(C20165313vH c20165313vH, C20165213vG c20165213vG, InterfaceC1364105Vn<? super C20165613vK> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c20165313vH;
        this.LLILLL = c20165213vG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20165613vK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super PsiUploadEncryptContactResponseV3> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PsiTask@40e6.getEncryptDataAndUnBlindV3$resp$1");
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
            C20165313vH c20165313vH = this.LLILLJJLI;
            C20165213vG c20165213vG = this.LLILLL;
            this.LL = 1;
            obj = c20165313vH.LJIIJJI(c20165213vG, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PsiTask@40e6.getEncryptDataAndUnBlindV3$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PsiTask@40e6.getEncryptDataAndUnBlindV3$resp$1");
        return obj;
    }
}
