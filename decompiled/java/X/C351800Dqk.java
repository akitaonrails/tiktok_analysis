package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.asve.editor.nlepro.NLEMusicManagerImpl$setBgm$1$2", f = "NLEMusicManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C351800Dqk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C347770DkF LL;
    public final /* synthetic */ C347660Dk4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351800Dqk(C347770DkF c347770DkF, C347660Dk4 c347660Dk4, InterfaceC1364105Vn<? super C351800Dqk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c347770DkF;
        this.LLILLJJLI = c347660Dk4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351800Dqk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NLEMusicManagerImpl@358d.setBgm$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C347770DkF.LJJJZ(this.LL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NLEMusicManagerImpl@358d.setBgm$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
