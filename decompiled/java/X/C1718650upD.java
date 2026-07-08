package X;

import com.ss.android.ugc.aweme.component.verify.pin.forgot.PinForgotViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0upD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.verify.pin.forgot.PinForgotViewModel$pinForgotConsult$1", f = "PinForgotViewModel.kt", l = {83, 88}, m = "invokeSuspend")
public final class C1718650upD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PinForgotViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1718650upD(PinForgotViewModel pinForgotViewModel, InterfaceC1364105Vn<? super C1718650upD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pinForgotViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1718650upD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154 A[Catch: Exception -> 0x0192, all -> 0x01b4, TryCatch #1 {Exception -> 0x0192, blocks: (B:53:0x00d7, B:54:0x00da, B:57:0x00e0, B:60:0x00fd, B:62:0x0103, B:64:0x010d, B:65:0x011a, B:67:0x0127, B:69:0x0131, B:74:0x013b, B:76:0x0147, B:77:0x0154, B:79:0x0162, B:80:0x016f, B:81:0x017c, B:45:0x00bb, B:46:0x00be, B:10:0x0028, B:13:0x003d, B:16:0x0042, B:18:0x004b, B:20:0x0053, B:23:0x0058, B:24:0x005b, B:26:0x0061, B:29:0x007c, B:31:0x008c, B:33:0x0094, B:36:0x0099, B:38:0x00a6, B:41:0x00ab, B:47:0x00c1, B:49:0x00c7), top: B:92:0x000d, outer: #0 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1718650upD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
