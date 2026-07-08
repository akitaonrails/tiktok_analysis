package X;

import com.ss.android.ugc.aweme.component.verify.pin.set.PinConfirmViewModel;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.verify.pin.set.PinConfirmViewModel$confirmPin$1$1", f = "PinConfirmViewModel.kt", l = {70, 76, 84, 92}, m = "invokeSuspend")
public final class C1719190uq5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public PinConfirmViewModel LLILLL;
    public int LLILZ;
    public final /* synthetic */ PinConfirmViewModel LLILZIL;
    public final /* synthetic */ PipoAccountApi LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ EnumC1717460unI LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719190uq5(PinConfirmViewModel pinConfirmViewModel, PipoAccountApi pipoAccountApi, String str, EnumC1717460unI enumC1717460unI, InterfaceC1364105Vn<? super C1719190uq5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = pinConfirmViewModel;
        this.LLILZLL = pipoAccountApi;
        this.LLIZ = str;
        this.LLIZLLLIL = enumC1717460unI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1719190uq5(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4 A[Catch: Exception -> 0x015c, TRY_ENTER, TryCatch #0 {Exception -> 0x015c, blocks: (B:42:0x00c7, B:43:0x00ca, B:56:0x0126, B:58:0x012c, B:60:0x0136, B:61:0x0142, B:62:0x014f, B:54:0x0121, B:55:0x0124, B:52:0x011b, B:53:0x011e, B:33:0x007a, B:34:0x007d, B:35:0x0081, B:38:0x009a, B:44:0x00cd, B:48:0x00f4, B:13:0x0035, B:16:0x0048, B:20:0x004f, B:23:0x0054, B:29:0x0062), top: B:67:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:42:0x00c7, B:43:0x00ca, B:56:0x0126, B:58:0x012c, B:60:0x0136, B:61:0x0142, B:62:0x014f, B:54:0x0121, B:55:0x0124, B:52:0x011b, B:53:0x011e, B:33:0x007a, B:34:0x007d, B:35:0x0081, B:38:0x009a, B:44:0x00cd, B:48:0x00f4, B:13:0x0035, B:16:0x0048, B:20:0x004f, B:23:0x0054, B:29:0x0062), top: B:67:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f A[Catch: Exception -> 0x015c, TRY_LEAVE, TryCatch #0 {Exception -> 0x015c, blocks: (B:42:0x00c7, B:43:0x00ca, B:56:0x0126, B:58:0x012c, B:60:0x0136, B:61:0x0142, B:62:0x014f, B:54:0x0121, B:55:0x0124, B:52:0x011b, B:53:0x011e, B:33:0x007a, B:34:0x007d, B:35:0x0081, B:38:0x009a, B:44:0x00cd, B:48:0x00f4, B:13:0x0035, B:16:0x0048, B:20:0x004f, B:23:0x0054, B:29:0x0062), top: B:67:0x0013 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1719190uq5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
