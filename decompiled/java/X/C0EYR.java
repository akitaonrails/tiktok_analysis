package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EYR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.creationflow.publish.save.PublishMobTask$mobSave$1", f = "PublishMobTask.kt", l = {}, m = "invokeSuspend")
public final class C0EYR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0EXW LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EYR(C0EXW c0exw, boolean z, InterfaceC1364105Vn<? super C0EYR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0exw;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EYR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublishMobTask@a933.mobSave$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0EYT c0eyt = this.LL.LLIZLLLIL;
        if (c0eyt == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PublishMobTask@a933.mobSave$1");
            return unit;
        }
        C361680EFy.LJJLIIJ(c0eyt.LIZ, c0eyt.LIZIZ, c0eyt.LIZJ, c0eyt.LIZLLL, c0eyt.LJ, c0eyt.LJFF, c0eyt.LJI, c0eyt.LJII, this.LLILLJJLI);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PublishMobTask@a933.mobSave$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
