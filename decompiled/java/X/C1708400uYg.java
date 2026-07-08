package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel$doRealBindCcdc$1$1", f = "CCDCAddCardViewModel.kt", l = {605, 617}, m = "invokeSuspend")
public final class C1708400uYg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public CCDCAddCardViewModel LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ CCDCAddCardViewModel LLILZIL;
    public final /* synthetic */ C1707990uY1 LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708400uYg(CCDCAddCardViewModel cCDCAddCardViewModel, C1707990uY1 c1707990uY1, String str, InterfaceC1364105Vn<? super C1708400uYg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = cCDCAddCardViewModel;
        this.LLILZLL = c1707990uY1;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1708400uYg(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a8 A[Catch: all -> 0x01e3, TryCatch #0 {all -> 0x01e3, blocks: (B:99:0x01dc, B:100:0x01df, B:77:0x0173, B:78:0x0176, B:80:0x0182, B:82:0x0188, B:84:0x018e, B:85:0x0190, B:87:0x0198, B:89:0x019e, B:90:0x01a0, B:93:0x01ac, B:92:0x01a8, B:11:0x0038, B:15:0x0046, B:18:0x004b, B:20:0x0051, B:24:0x005c, B:26:0x0060, B:28:0x0066, B:31:0x006b, B:33:0x0073, B:35:0x0079, B:36:0x007b, B:38:0x0083, B:45:0x0096, B:46:0x0099, B:47:0x00a0, B:49:0x00a6, B:51:0x00b6, B:53:0x00c0, B:54:0x00c8, B:56:0x00de, B:58:0x00e4, B:59:0x00ec, B:61:0x00f2, B:63:0x0104, B:64:0x0112, B:67:0x011b, B:70:0x015c, B:73:0x0161, B:41:0x008b, B:44:0x0092), top: B:108:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1708400uYg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
