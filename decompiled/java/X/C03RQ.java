package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03RQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.preview.OspPreloadManager$performAssemPreview$1", f = "OspPreloadManager.kt", l = {99}, m = "invokeSuspend")
public final class C03RQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public OrderSubmitAssemViewModel LL;
    public C03RS LLILLJJLI;
    public Object LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLIZ;
    public final /* synthetic */ C03RS LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03RQ(OrderSubmitAssemViewModel orderSubmitAssemViewModel, C03RS c03rs, Integer num, long j, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, InterfaceC1364105Vn<? super C03RQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = orderSubmitAssemViewModel;
        this.LLIZLLLIL = c03rs;
        this.LLJ = num;
        this.LLJI = j;
        this.LLJIJIL = viewOnAttachStateChangeListenerC20604515jv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03RQ(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x013e, CancellationException -> 0x0148, TryCatch #2 {CancellationException -> 0x0148, all -> 0x013e, blocks: (B:16:0x0058, B:17:0x005b, B:18:0x005d, B:20:0x0068, B:25:0x0071, B:27:0x0077, B:28:0x0079, B:30:0x007f, B:32:0x0097, B:33:0x00a0, B:36:0x00a6, B:38:0x00aa, B:40:0x00b0, B:43:0x00b5, B:44:0x00b8, B:46:0x00bc, B:48:0x00c0, B:49:0x00c2, B:66:0x00e7, B:68:0x00f2, B:69:0x00f4, B:71:0x00f8, B:73:0x00fe, B:75:0x0102, B:78:0x010a, B:79:0x0110, B:82:0x011d, B:85:0x0125, B:86:0x012f, B:88:0x0133, B:89:0x0137, B:52:0x00c9, B:54:0x00cd, B:56:0x00d3, B:59:0x00d8, B:60:0x00db, B:62:0x00df, B:64:0x00e3, B:65:0x00e5, B:9:0x0037, B:11:0x0040), top: B:97:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03RQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
