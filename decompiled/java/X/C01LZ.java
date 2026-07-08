package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01LZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.presenter.MusicAwemeRequestDelegate$runOnIOCoroutineScope$1", f = "MusicAwemeRequestDelegate.kt", l = {}, m = "invokeSuspend")
public final class C01LZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01LZ(Runnable runnable, InterfaceC1364105Vn<? super C01LZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01LZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicAwemeRequestDelegate@d96a.runOnIOCoroutineScope$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Runnable runnable = this.LL;
        if (runnable != null) {
            runnable.run();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicAwemeRequestDelegate@d96a.runOnIOCoroutineScope$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
