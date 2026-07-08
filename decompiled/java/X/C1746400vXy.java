package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel$requestMapDetail$1", f = "AddressMapDetailViewModel.kt", l = {173}, m = "invokeSuspend")
public final class C1746400vXy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddressMapDetailViewModel LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ Boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746400vXy(AddressMapDetailViewModel addressMapDetailViewModel, Integer num, Boolean bool, boolean z, InterfaceC1364105Vn<? super C1746400vXy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addressMapDetailViewModel;
        this.LLILLL = num;
        this.LLILZ = bool;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746400vXy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[Catch: Exception -> 0x014a, PHI: r0
      0x0043: PHI (r0v16 java.lang.Integer) = (r0v15 java.lang.Integer), (r0v43 java.lang.Integer) binds: [B:10:0x0033, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x014a, blocks: (B:44:0x00bf, B:45:0x00c2, B:47:0x00ce, B:49:0x00d2, B:51:0x00dd, B:52:0x00df, B:54:0x00e5, B:56:0x00e9, B:57:0x00ed, B:59:0x00f3, B:61:0x00fd, B:62:0x0102, B:64:0x0108, B:66:0x0112, B:70:0x0119, B:71:0x0131, B:75:0x0138, B:76:0x0140, B:9:0x002f, B:11:0x0035, B:13:0x003b, B:18:0x0047, B:20:0x0051, B:22:0x0057, B:24:0x005d, B:25:0x005f, B:27:0x0065, B:34:0x0079, B:36:0x007f, B:40:0x008b, B:39:0x0087, B:33:0x0075, B:31:0x006e, B:17:0x0043), top: B:91:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: Exception -> 0x014a, TryCatch #0 {Exception -> 0x014a, blocks: (B:44:0x00bf, B:45:0x00c2, B:47:0x00ce, B:49:0x00d2, B:51:0x00dd, B:52:0x00df, B:54:0x00e5, B:56:0x00e9, B:57:0x00ed, B:59:0x00f3, B:61:0x00fd, B:62:0x0102, B:64:0x0108, B:66:0x0112, B:70:0x0119, B:71:0x0131, B:75:0x0138, B:76:0x0140, B:9:0x002f, B:11:0x0035, B:13:0x003b, B:18:0x0047, B:20:0x0051, B:22:0x0057, B:24:0x005d, B:25:0x005f, B:27:0x0065, B:34:0x0079, B:36:0x007f, B:40:0x008b, B:39:0x0087, B:33:0x0075, B:31:0x006e, B:17:0x0043), top: B:91:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: Exception -> 0x014a, TryCatch #0 {Exception -> 0x014a, blocks: (B:44:0x00bf, B:45:0x00c2, B:47:0x00ce, B:49:0x00d2, B:51:0x00dd, B:52:0x00df, B:54:0x00e5, B:56:0x00e9, B:57:0x00ed, B:59:0x00f3, B:61:0x00fd, B:62:0x0102, B:64:0x0108, B:66:0x0112, B:70:0x0119, B:71:0x0131, B:75:0x0138, B:76:0x0140, B:9:0x002f, B:11:0x0035, B:13:0x003b, B:18:0x0047, B:20:0x0051, B:22:0x0057, B:24:0x005d, B:25:0x005f, B:27:0x0065, B:34:0x0079, B:36:0x007f, B:40:0x008b, B:39:0x0087, B:33:0x0075, B:31:0x006e, B:17:0x0043), top: B:91:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087 A[Catch: Exception -> 0x014a, TryCatch #0 {Exception -> 0x014a, blocks: (B:44:0x00bf, B:45:0x00c2, B:47:0x00ce, B:49:0x00d2, B:51:0x00dd, B:52:0x00df, B:54:0x00e5, B:56:0x00e9, B:57:0x00ed, B:59:0x00f3, B:61:0x00fd, B:62:0x0102, B:64:0x0108, B:66:0x0112, B:70:0x0119, B:71:0x0131, B:75:0x0138, B:76:0x0140, B:9:0x002f, B:11:0x0035, B:13:0x003b, B:18:0x0047, B:20:0x0051, B:22:0x0057, B:24:0x005d, B:25:0x005f, B:27:0x0065, B:34:0x0079, B:36:0x007f, B:40:0x008b, B:39:0x0087, B:33:0x0075, B:31:0x006e, B:17:0x0043), top: B:91:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1746400vXy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
