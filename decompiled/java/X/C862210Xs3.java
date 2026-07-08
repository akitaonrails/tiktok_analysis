package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xs3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.nativegame.MinisVmsdkShipPluginLoader$preparePlugin$2", f = "MinisVmsdkShipPluginLoader.kt", l = {}, m = "invokeSuspend")
public final class C862210Xs3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1868510yiv>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function0<Boolean> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, Boolean, String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C862210Xs3(String str, Function0<Boolean> function0, int i, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq, InterfaceC1364105Vn<? super C862210Xs3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = function0;
        this.LLILLL = i;
        this.LLILZ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862210Xs3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisVmsdkShipPluginLoader@d5ab.preparePlugin$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C202051144b c202051144b = C202051144b.LIZ;
        String str = this.LL;
        Function0<Boolean> function0 = this.LLILLJJLI;
        int i = this.LLILLL;
        InterfaceC1631620sYq<Boolean, Boolean, String, Unit> interfaceC1631620sYq = this.LLILZ;
        c202051144b.getClass();
        AbstractC1868510yiv abstractC1868510yivLJFF = C202051144b.LJFF(str, function0, i, interfaceC1631620sYq);
        C1C7U.LIZIZ("MinisVmsdkShipPluginLoader@d5ab.preparePlugin$2");
        return abstractC1868510yivLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1868510yiv> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
