package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.api.ext.SendMessageEventListenerAdaptersKt$toSendMessageEventListener$2$2", f = "SendMessageEventListenerAdapters.kt", l = {}, m = "invokeSuspend")
public final class C0YTN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YTK LL;
    public final /* synthetic */ InterfaceC873750YPl LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YTN(C0YTK c0ytk, InterfaceC873750YPl interfaceC873750YPl, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC497601wk interfaceC497601wk, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ytk;
        this.LLILLJJLI = interfaceC873750YPl;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YTN(this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILZIL, this.LLILLL, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YTK c0ytk;
        C1C7U.LIZ("SendMessageEventListenerAdaptersKt@ae45.toSendMessageEventListener$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0YTK c0ytk2 = this.LL;
            if (c0ytk2 != null) {
                InterfaceC873750YPl interfaceC873750YPl = this.LLILLJJLI;
                c0ytk2.LJ(((C0YPL) interfaceC873750YPl).LIZ, ((C0YPL) interfaceC873750YPl).LIZIZ);
            }
            if (this.LLILLL && (c0ytk = this.LL) != null) {
                InterfaceC873750YPl interfaceC873750YPl2 = this.LLILLJJLI;
                c0ytk.LIZIZ(((C0YPL) interfaceC873750YPl2).LIZ, C1697810uHb.LJIILJJIL(((C0YPL) interfaceC873750YPl2).LIZIZ), new LinkedHashMap());
            }
            if (this.LLILZ) {
                C2296808zG.LIZJ(this.LLILZIL, null);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SendMessageEventListenerAdaptersKt@ae45.toSendMessageEventListener$2$2");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLILZ) {
                C2296808zG.LIZJ(this.LLILZIL, null);
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
