package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zLH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.feed.LSLiveProductCard$showCardIfNeeded$1", f = "LSLiveProductCard.kt", l = {67, 71}, m = "invokeSuspend")
public final class C1892290zLH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1887790zE1 LLILLL;
    public final /* synthetic */ LiveRoomStruct LLILZ;
    public final /* synthetic */ Aweme LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892290zLH(C1887790zE1 c1887790zE1, LiveRoomStruct liveRoomStruct, Aweme aweme, InterfaceC1364105Vn<? super C1892290zLH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1887790zE1;
        this.LLILZ = liveRoomStruct;
        this.LLILZIL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1892290zLH c1892290zLH = new C1892290zLH(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1892290zLH.LLILLJJLI = obj;
        return c1892290zLH;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|95|(1:(1:(7:26|27|28|97|(4:30|(1:32)|33|(24:35|(1:37)|38|(1:42)|43|(1:47)|48|(1:52)|53|(1:57)|58|(1:62)|63|(1:65)(1:66)|67|(1:69)(1:70)|71|(1:75)|76|(1:78)|79|(1:81)|82|(1:84)))(3:85|(1:87)|88)|93|94)(2:7|8))(2:9|21))(5:10|11|(1:17)(1:15)|16|(2:19|20))|22|(2:24|25)|27|28|97|(0)(0)|93|94) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0204, code lost:
    
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0207, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4);
        X.C2276471E8n.LIZIZ.LIZJ("ttls-live", r4, "LSLiveProductCard", "updatePinedProduct error");
        r3 = r20.LLILLL;
        r2 = new org.json.JSONObject();
        r2.put("has_pined_product", "unknown");
        r2.put("by_catch", 1);
        r2.put("catch_e_message", r4.getMessage());
        r3.LIZLLL("StepResponseSuccess", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: Exception -> 0x0206, TRY_ENTER, TryCatch #0 {Exception -> 0x0206, blocks: (B:26:0x0070, B:27:0x0073, B:30:0x007d, B:33:0x009d, B:35:0x00a7, B:37:0x00ae, B:38:0x00b7, B:40:0x00c3, B:43:0x00c9, B:21:0x0054, B:22:0x0057, B:11:0x0031, B:13:0x0039, B:15:0x003d, B:16:0x0041), top: B:95:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d5 A[Catch: Exception -> 0x0204, TryCatch #1 {Exception -> 0x0204, blocks: (B:45:0x00dc, B:48:0x00e2, B:50:0x00e9, B:53:0x00f9, B:55:0x0100, B:58:0x0106, B:60:0x010d, B:63:0x011d, B:65:0x0124, B:71:0x0132, B:73:0x0147, B:76:0x014f, B:78:0x0187, B:79:0x0192, B:81:0x01ab, B:82:0x01c8, B:84:0x01cc, B:85:0x01d5, B:88:0x01fb), top: B:97:0x007b }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1892290zLH.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
