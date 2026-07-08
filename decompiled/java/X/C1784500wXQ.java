package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wXQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.viewmodel.PcsIndustrySelectVM$confirmIndustryVerificationFlow$2", f = "PcsIndustrySelectVM.kt", l = {382, 391, 402, 417, 421, 423, 436, 440, 452, 454, 457, 462}, m = "invokeSuspend")
public final class C1784500wXQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PcsIndustrySelectVM LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ EnumC1778810wOF LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784500wXQ(PcsIndustrySelectVM pcsIndustrySelectVM, long j, boolean z, EnumC1778810wOF enumC1778810wOF, InterfaceC1364105Vn<? super C1784500wXQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pcsIndustrySelectVM;
        this.LLILZ = j;
        this.LLILZIL = z;
        this.LLILZLL = enumC1778810wOF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1784500wXQ c1784500wXQ = new C1784500wXQ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1784500wXQ.LLILLJJLI = obj;
        return c1784500wXQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0220  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1784500wXQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
