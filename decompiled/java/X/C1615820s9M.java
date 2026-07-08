package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS568S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0s9M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.fundraiser.native.pages.donorlist.FundraiserDonorListPageComposeKt$FundraiserDonorListPage$1$2$1", f = "FundraiserDonorListPageCompose.kt", l = {281}, m = "invokeSuspend")
public final class C1615820s9M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1615820s9M(boolean z, C1690080u58 c1690080u58, boolean z2, int i, Function0<Unit> function0, InterfaceC1364105Vn<? super C1615820s9M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1690080u58;
        this.LLILZ = z2;
        this.LLILZIL = i;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1615820s9M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FundraiserDonorListPageComposeKt@241f.FundraiserDonorListPage$1$2$1");
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
            if (!this.LLILLJJLI) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FundraiserDonorListPageComposeKt@241f.FundraiserDonorListPage$1$2$1");
                return unit;
            }
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS568S0100000_24(this.LLILLL, 1674));
            final boolean z = this.LLILZ;
            final int i2 = this.LLILZIL;
            final Function0<Unit> function0 = this.LLILZLL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0rjv
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    int iIntValue = ((Number) obj2).intValue();
                    if (!z && iIntValue >= i2) {
                        function0.invoke();
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c095dLJIIIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("FundraiserDonorListPageComposeKt@241f.FundraiserDonorListPage$1$2$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FundraiserDonorListPageComposeKt@241f.FundraiserDonorListPage$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
