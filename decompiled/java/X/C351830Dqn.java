package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.asve.editor.nlepro.NLEMusicManagerImpl$setBgms$1$2", f = "NLEMusicManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C351830Dqn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C347770DkF LL;
    public final /* synthetic */ List<C347660Dk4> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351830Dqn(C347770DkF c347770DkF, List<C347660Dk4> list, InterfaceC1364105Vn<? super C351830Dqn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c347770DkF;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351830Dqn(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NLEMusicManagerImpl@358d.setBgms$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C347770DkF.LJJL(this.LL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NLEMusicManagerImpl@358d.setBgms$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
