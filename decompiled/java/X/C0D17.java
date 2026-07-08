package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D17, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.product.ACPProductGateway$fetchProduct$2", f = "ACPProductGateway.kt", l = {46}, m = "invokeSuspend")
public final class C0D17 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>>, Object> {
    public C0D16 LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C0D16 LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D17(String str, C0D16 c0d16, Map<String, String> map, InterfaceC1364105Vn<? super C0D17> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = c0d16;
        this.LLIZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0D17 c0d17 = new C0D17(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0d17.LLILZ = obj;
        return c0d17;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[Catch: all -> 0x0108, TryCatch #0 {all -> 0x0108, blocks: (B:17:0x007f, B:18:0x0082, B:20:0x008e, B:22:0x0094, B:23:0x00b9, B:26:0x00bd, B:28:0x00c4, B:30:0x00ce, B:33:0x00d4, B:44:0x00f5, B:45:0x0100, B:46:0x0107, B:36:0x00db, B:38:0x00e8, B:43:0x00f0, B:13:0x0051), top: B:51:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100 A[Catch: all -> 0x0108, TryCatch #0 {all -> 0x0108, blocks: (B:17:0x007f, B:18:0x0082, B:20:0x008e, B:22:0x0094, B:23:0x00b9, B:26:0x00bd, B:28:0x00c4, B:30:0x00ce, B:33:0x00d4, B:44:0x00f5, B:45:0x0100, B:46:0x0107, B:36:0x00db, B:38:0x00e8, B:43:0x00f0, B:13:0x0051), top: B:51:0x000c }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D17.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UniversalProductDto>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
