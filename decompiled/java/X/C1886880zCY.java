package X;

import com.ss.android.ugc.aweme.psp.ICampaignPSPTaskCompleteApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.psp.CampaignPSPManager$onPspActionResult$3$1", f = "CampaignPSPManager.kt", l = {278}, m = "invokeSuspend")
public final class C1886880zCY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1869300ykC LLILLL;
    public final /* synthetic */ ICampaignPSPTaskCompleteApi LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886880zCY(C1869300ykC c1869300ykC, ICampaignPSPTaskCompleteApi iCampaignPSPTaskCompleteApi, String str, InterfaceC1364105Vn<? super C1886880zCY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1869300ykC;
        this.LLILZ = iCampaignPSPTaskCompleteApi;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1886880zCY c1886880zCY = new C1886880zCY(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1886880zCY.LLILLJJLI = obj;
        return c1886880zCY;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, X.0Wid] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1886880zCY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
