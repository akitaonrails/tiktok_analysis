package X;

import com.bytedance.android.livesdk.chatroom.model.UpdateStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.utils.StatusReportRetryUtilsKt$sendStatusV3$1$1$3", f = "StatusReportRetryUtils.kt", l = {}, m = "invokeSuspend")
public final class C323601Ni extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C259800zU<C470590Icr<UpdateStatusResponse>> LLILLJJLI;
    public final /* synthetic */ Function2<C470590Icr<UpdateStatusResponse>, Integer, Unit> LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C259800zU<Throwable> LLILZIL;
    public final /* synthetic */ Function2<Throwable, Integer, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C323601Ni(C259800zU<C470590Icr<UpdateStatusResponse>> c259800zU, Function2<? super C470590Icr<UpdateStatusResponse>, ? super Integer, Unit> function2, C118300cf c118300cf, C259800zU<Throwable> c259800zU2, Function2<? super Throwable, ? super Integer, Unit> function22, InterfaceC1364105Vn<? super C323601Ni> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = function2;
        this.LLILZ = c118300cf;
        this.LLILZIL = c259800zU2;
        this.LLILZLL = function22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323601Ni c323601Ni = new C323601Ni(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c323601Ni.LL = obj;
        return c323601Ni;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StatusReportRetryUtilsKt@5e7.sendStatusV3$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C470590Icr<UpdateStatusResponse> c470590Icr = this.LLILLJJLI.element;
        if (c470590Icr != null) {
            this.LLILLL.invoke(c470590Icr, C2286608xc.LJ(this.LLILZ.element));
        } else {
            C259800zU<Throwable> c259800zU = this.LLILZIL;
            Function2<Throwable, Integer, Unit> function2 = this.LLILZLL;
            C118300cf c118300cf = this.LLILZ;
            Throwable th = c259800zU.element;
            if (th != null) {
                function2.invoke(th, C2286608xc.LJ(c118300cf.element));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StatusReportRetryUtilsKt@5e7.sendStatusV3$1$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
