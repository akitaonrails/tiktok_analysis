package X;

import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactMatchedData;
import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV3;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.13vE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask$getEncryptDataAndUnBlindV3$2", f = "ContactFilterByPsi.kt", l = {}, m = "invokeSuspend")
public final class C20165013vE extends C09AX implements Function1<InterfaceC1364105Vn<? super C20165213vG>, Object> {
    public final /* synthetic */ C20165313vH LL;
    public final /* synthetic */ PsiUploadEncryptContactResponseV3 LLILLJJLI;
    public final /* synthetic */ C20165213vG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20165013vE(C20165313vH c20165313vH, PsiUploadEncryptContactResponseV3 psiUploadEncryptContactResponseV3, C20165213vG c20165213vG, InterfaceC1364105Vn<? super C20165013vE> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c20165313vH;
        this.LLILLJJLI = psiUploadEncryptContactResponseV3;
        this.LLILLL = c20165213vG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20165013vE(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C20165213vG> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("PsiTask@40e6.getEncryptDataAndUnBlindV3$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20165313vH c20165313vH = this.LL;
        PsiUploadEncryptContactResponseV3 psiUploadEncryptContactResponseV3 = this.LLILLJJLI;
        C20165213vG c20165213vG = this.LLILLL;
        c20165313vH.getClass();
        for (Map.Entry<String, PsiUploadEncryptContactMatchedData> entry : psiUploadEncryptContactResponseV3.getMatchRes().entrySet()) {
            C20164913vD c20164913vD = psiUploadEncryptContactResponseV3.getMatchResBloom().get(entry.getKey());
            if (c20164913vD != null) {
                C20165313vH.LJFF(c20165313vH, c20165213vG.LIZ, c20164913vD.LIZIZ, entry.getValue().bloomFilterMEmail, entry.getValue().bloomFilterKEmail, c20165313vH.LJII());
                C20165313vH.LJFF(c20165313vH, c20165213vG.LIZIZ, c20164913vD.LIZ, entry.getValue().bloomFilterM, entry.getValue().bloomFilterK, c20165313vH.LJII());
            } else {
                throw new Exception("get bloom data failed");
            }
        }
        C1C7U.LIZIZ("PsiTask@40e6.getEncryptDataAndUnBlindV3$2");
        return c20165213vG;
    }
}
