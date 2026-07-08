package X;

import com.ss.android.ugc.aweme.relation.auth.model.PsiUploadEncryptContactResponseV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.13vF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask$getEncryptDataAndUnBlind$2", f = "ContactFilterByPsi.kt", l = {}, m = "invokeSuspend")
public final class C20165113vF extends C09AX implements Function1<InterfaceC1364105Vn<? super C20165213vG>, Object> {
    public final /* synthetic */ C20165313vH LL;
    public final /* synthetic */ PsiUploadEncryptContactResponseV2 LLILLJJLI;
    public final /* synthetic */ C20165213vG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20165113vF(C20165313vH c20165313vH, PsiUploadEncryptContactResponseV2 psiUploadEncryptContactResponseV2, C20165213vG c20165213vG, InterfaceC1364105Vn<? super C20165113vF> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c20165313vH;
        this.LLILLJJLI = psiUploadEncryptContactResponseV2;
        this.LLILLL = c20165213vG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20165113vF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C20165213vG> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PsiTask@40e6.getEncryptDataAndUnBlind$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20165313vH c20165313vH = this.LL;
        PsiUploadEncryptContactResponseV2 psiUploadEncryptContactResponseV2 = this.LLILLJJLI;
        C20165213vG c20165213vG = this.LLILLL;
        c20165313vH.getClass();
        C20165313vH.LIZLLL(c20165313vH, c20165213vG.LIZ, psiUploadEncryptContactResponseV2.getBloomFilterBitsEmail(), psiUploadEncryptContactResponseV2.getBloomFilterMEmail(), psiUploadEncryptContactResponseV2.getBloomFilterKEmail(), c20165313vH.LJII());
        C20165313vH.LIZLLL(c20165313vH, c20165213vG.LIZIZ, psiUploadEncryptContactResponseV2.getBloomFilterBits(), psiUploadEncryptContactResponseV2.getBloomFilterM(), psiUploadEncryptContactResponseV2.getBloomFilterK(), c20165313vH.LJII());
        C1C7U.LIZIZ("PsiTask@40e6.getEncryptDataAndUnBlind$2");
        return c20165213vG;
    }
}
