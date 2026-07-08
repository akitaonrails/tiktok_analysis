package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.util.InstagramStoryShareImageRenderer$renderShareOutCardBitmap$loaded$1", f = "InstagramStoryShareImageRenderer.kt", l = {224}, m = "invokeSuspend")
public final class C1388550mEn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1388590mEr LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388550mEn(C1388590mEr c1388590mEr, String str, InterfaceC1364105Vn<? super C1388550mEn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1388590mEr;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1388550mEn(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstagramStoryShareImageRenderer@a4ae.renderShareOutCardBitmap$loaded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1388590mEr c1388590mEr = this.LLILLL;
            String str = this.LLILZ;
            this.LL = str;
            this.LLILLJJLI = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            c1388590mEr.setCallback(new InterfaceC1388600mEs() { // from class: X.0mEo
                @Override // X.InterfaceC1388600mEs
                public final void LIZ() {
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.FALSE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                    }
                }

                @Override // X.InterfaceC1388600mEs
                public final void LIZIZ() {
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                        Boolean bool = Boolean.TRUE;
                        C189200o6.m2constructorimpl(bool);
                        interfaceC20236714Gf.resumeWith(bool);
                    }
                }
            });
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJIJL(c1388590mEr.getContext());
            c1331670kl3LJIIIZ.LJJII(new C1402310maz(c1388590mEr, 1));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InstagramStoryShareImageRenderer@a4ae.renderShareOutCardBitmap$loaded$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("InstagramStoryShareImageRenderer@a4ae.renderShareOutCardBitmap$loaded$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
