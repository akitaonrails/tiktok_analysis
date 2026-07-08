package X;

import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.register.PIPOSilentRegisterManager$registerSilent$1$1$1", f = "PIPOSilentRegisterManager.kt", l = {}, m = "invokeSuspend")
public final class C1506980pJo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<BaseResponse<Object>> LL;
    public final /* synthetic */ BaseResponse<Object> LLILLJJLI;
    public final /* synthetic */ InterfaceC1506990pJp LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1506980pJo(C0X52<BaseResponse<Object>> c0x52, BaseResponse<Object> baseResponse, InterfaceC1506990pJp interfaceC1506990pJp, InterfaceC1364105Vn<? super C1506980pJo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = baseResponse;
        this.LLILLL = interfaceC1506990pJp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1506980pJo(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("PIPOSilentRegisterManager@999d.registerSilent$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZJ() && this.LLILLJJLI.LIZ()) {
            this.LLILLL.onSuccess();
        } else {
            if (this.LL.LIZJ()) {
                str = this.LL.LIZIZ.errorMessage;
            } else {
                str = "error";
            }
            this.LLILLL.LIZ(str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PIPOSilentRegisterManager@999d.registerSilent$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
