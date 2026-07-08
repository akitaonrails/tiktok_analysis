package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.widget.LSLiveShopBagWidget$updateProductsAlertNumText$2", f = "LSLiveShopBagWidget.kt", l = {326, 328}, m = "invokeSuspend")
public final class C1892300zLI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1892600zLm LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892300zLI(long j, C1892600zLm c1892600zLm, Function0<Unit> function0, String str, InterfaceC1364105Vn<? super C1892300zLI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1892600zLm;
        this.LLILZ = function0;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892300zLI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:43)|(1:(1:(10:21|22|(3:24|(1:26)(1:29)|27)(1:30)|28|41|31|36|(1:38)|39|40)(2:7|8))(1:16))(3:9|10|(2:12|(2:14|15)))|17|(2:19|20)|22|(0)(0)|28|41|31|36|(0)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r12);
        r13 = r17.LLILLL;
        r2 = new org.json.JSONObject();
        r14 = r17.LLILZIL;
        r0 = r17.LLILLJJLI;
        r2.put("by_catch", 1);
        r2.put("source", r14);
        r2.put("delayTime", r0);
        r2.put("catch_e_message", r12.getMessage());
        r13.LJJIIZI("StepRequestResponse", r2);
        X.C2276471E8n.LIZIZ.LIZJ("ttls-live", r12, "LSLiveShopBagWidget", "updateProductsAlertNumText===network error==");
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[Catch: Exception -> 0x00ae, TryCatch #1 {Exception -> 0x00ae, blocks: (B:21:0x005e, B:22:0x0061, B:24:0x0068, B:26:0x0070, B:27:0x0074, B:28:0x007f, B:30:0x008b, B:16:0x0045, B:17:0x0048, B:10:0x0031, B:12:0x0039), top: B:43:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[Catch: Exception -> 0x00ae, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ae, blocks: (B:21:0x005e, B:22:0x0061, B:24:0x0068, B:26:0x0070, B:27:0x0074, B:28:0x007f, B:30:0x008b, B:16:0x0045, B:17:0x0048, B:10:0x0031, B:12:0x0039), top: B:43:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1892300zLI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
