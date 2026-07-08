package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17uJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.AbsECLiveExplanationCardWidget$checkPrefetchDataV2$1", f = "AbsECLiveExplanationCardWidget.kt", l = {715, 735}, m = "invokeSuspend")
public final class C21178517uJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C21161717rb LL;
    public BaseResponse LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ OecInitData LLILZLL;
    public final /* synthetic */ AbstractC21194217wq LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21178517uJ(long j, OecInitData oecInitData, AbstractC21194217wq abstractC21194217wq, long j2, InterfaceC1364105Vn<? super C21178517uJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = j;
        this.LLILZLL = oecInitData;
        this.LLIZ = abstractC21194217wq;
        this.LLIZLLLIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21178517uJ(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21178517uJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
