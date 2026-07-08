package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11Xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.guide.BagGuidanceAnimRequestHelper$handleRequestBagAnimation$1", f = "BagGuidanceAnimRequestHelper.kt", l = {88, 95}, m = "invokeSuspend")
public final class C19516611Xg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C21213017zs LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ EnumC598510Ndh LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19516611Xg(boolean z, C21213017zs c21213017zs, long j, long j2, boolean z2, EnumC598510Ndh enumC598510Ndh, InterfaceC1364105Vn<? super C19516611Xg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c21213017zs;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = z2;
        this.LLIZLLLIL = enumC598510Ndh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19516611Xg c19516611Xg = new C19516611Xg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c19516611Xg.LLILLJJLI = obj;
        return c19516611Xg;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19516611Xg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
