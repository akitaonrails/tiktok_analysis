package X;

import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0prv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.translate.repository.TranslationRepository", f = "TranslationRepository.kt", l = {BdTuring.TYPE_EMAIL}, m = "getTranslation")
public final class C1528130prv extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1528120pru LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528130prv(C1528120pru c1528120pru, InterfaceC1364105Vn<? super C1528130prv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1528120pru;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TranslationRepository@dd18.getTranslation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("TranslationRepository@dd18.getTranslation$1");
        return objLIZ;
    }
}
