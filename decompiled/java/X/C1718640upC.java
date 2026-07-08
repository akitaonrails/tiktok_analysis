package X;

import com.ss.android.ugc.aweme.component.verify.pin.change.PinChangeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0upC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.verify.pin.change.PinChangeViewModel$consultChangePin$1", f = "PinChangeViewModel.kt", l = {86, 91}, m = "invokeSuspend")
public final class C1718640upC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PinChangeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1718640upC(PinChangeViewModel pinChangeViewModel, InterfaceC1364105Vn<? super C1718640upC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pinChangeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1718640upC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0153 A[Catch: Exception -> 0x0187, all -> 0x01b3, TryCatch #1 {Exception -> 0x0187, blocks: (B:53:0x00d5, B:54:0x00d8, B:57:0x00de, B:60:0x00fb, B:62:0x0101, B:64:0x010b, B:65:0x0119, B:67:0x0126, B:69:0x0130, B:74:0x013a, B:76:0x0146, B:77:0x0153, B:79:0x0161, B:80:0x016e, B:81:0x017b, B:45:0x00b9, B:46:0x00bc, B:10:0x0020, B:12:0x0039, B:15:0x0054, B:18:0x005c, B:21:0x0061, B:23:0x006a, B:25:0x0072, B:28:0x0077, B:29:0x007a, B:31:0x008a, B:33:0x0092, B:36:0x0097, B:38:0x00a4, B:41:0x00a9, B:47:0x00bf, B:49:0x00c5), top: B:92:0x000d, outer: #0 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1718640upC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
