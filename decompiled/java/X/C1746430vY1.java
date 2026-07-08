package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vY1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel$saveAddressReal$3", f = "AddressEditViewModel.kt", l = {2439}, m = "invokeSuspend")
public final class C1746430vY1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Address LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ AddressEditViewModel LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746430vY1(Address address, boolean z, AddressEditViewModel addressEditViewModel, long j, InterfaceC1364105Vn<? super C1746430vY1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = address;
        this.LLILLL = z;
        this.LLILZ = addressEditViewModel;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746430vY1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7 A[Catch: Exception -> 0x01bf, TryCatch #0 {Exception -> 0x01bf, blocks: (B:70:0x0104, B:71:0x0107, B:74:0x012a, B:76:0x012e, B:80:0x0137, B:82:0x014e, B:84:0x015c, B:85:0x015e, B:87:0x017b, B:88:0x018a, B:89:0x01ac, B:9:0x0023, B:13:0x002e, B:15:0x003c, B:17:0x0044, B:19:0x004c, B:20:0x0052, B:22:0x0056, B:23:0x0058, B:25:0x005e, B:26:0x0064, B:28:0x0068, B:29:0x006a, B:31:0x0070, B:32:0x0076, B:34:0x007a, B:35:0x007c, B:36:0x007f, B:38:0x0085, B:39:0x0087, B:41:0x0093, B:43:0x0099, B:56:0x00be, B:58:0x00c6, B:59:0x00ce, B:63:0x00e9, B:65:0x00f1, B:66:0x00f3, B:62:0x00da, B:61:0x00d7), top: B:94:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746430vY1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
