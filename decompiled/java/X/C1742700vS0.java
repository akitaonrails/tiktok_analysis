package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vS0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$fetchLocation$1$2", f = "DistrictFragment.kt", l = {2297}, m = "invokeSuspend")
public final class C1742700vS0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1742730vS3 LLILLL;
    public final /* synthetic */ DistrictFragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742700vS0(C1742730vS3 c1742730vS3, DistrictFragment districtFragment, InterfaceC1364105Vn<? super C1742700vS0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1742730vS3;
        this.LLILZ = districtFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1742700vS0 c1742700vS0 = new C1742700vS0(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1742700vS0.LLILLJJLI = obj;
        return c1742700vS0;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0151 A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:30:0x00b2, B:31:0x00b5, B:33:0x00b9, B:35:0x00bd, B:37:0x00c5, B:39:0x00ce, B:40:0x00d3, B:42:0x00d9, B:44:0x00e1, B:45:0x00fa, B:46:0x00fd, B:47:0x00fe, B:49:0x012a, B:50:0x0138, B:52:0x013e, B:54:0x0151, B:56:0x0191, B:9:0x0021, B:11:0x0029, B:12:0x002d, B:14:0x0033, B:15:0x0037, B:17:0x003f, B:23:0x004b, B:24:0x004d, B:26:0x00a9), top: B:63:0x000e }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1742700vS0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
