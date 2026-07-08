package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05WO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$refreshList$2", f = "ECAwemeListModel.kt", l = {164, 165}, m = "invokeSuspend")
public final class C05WO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C099G LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1525405y8 LLILZ;
    public final /* synthetic */ C2189821An6 LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WO(C1525405y8 c1525405y8, C2189821An6 c2189821An6, long j, String str, InterfaceC1364105Vn<? super C05WO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1525405y8;
        this.LLILZIL = c2189821An6;
        this.LLILZLL = j;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05WO c05wo = new C05WO(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c05wo.LLILLL = obj;
        return c05wo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(1:(1:(16:6|59|29|30|35|(1:37)|38|(1:40)|41|(1:43)|44|(1:46)|47|(3:49|(1:51)|52)|53|54)(2:7|8))(3:9|57|15))(4:10|61|11|(2:13|14))|16|21|(1:23)|24|55|25|(2:27|28)|30|35|(0)|38|(0)|41|(0)|44|(0)|47|(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05WO.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
