package X;

import com.ss.android.ugc.aweme.psp.ICampaignPSPTaskCompleteApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zCZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.psp.CampaignPSPManager$onPspActionResult$4$1", f = "CampaignPSPManager.kt", l = {322}, m = "invokeSuspend")
public final class C1886890zCZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ICampaignPSPTaskCompleteApi LLILLL;
    public final /* synthetic */ C1869290ykB LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886890zCZ(ICampaignPSPTaskCompleteApi iCampaignPSPTaskCompleteApi, C1869290ykB c1869290ykB, String str, InterfaceC1364105Vn<? super C1886890zCZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iCampaignPSPTaskCompleteApi;
        this.LLILZ = c1869290ykB;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1886890zCZ c1886890zCZ = new C1886890zCZ(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1886890zCZ.LLILLJJLI = obj;
        return c1886890zCZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, X.0Wid] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1886890zCZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
