package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.controller.BackgroundAudioPlayer$resume$1", f = "BackgroundAudioPlayer.kt", l = {}, m = "invokeSuspend")
public final class C0NIO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NIP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NIO(C0NIP c0nip, InterfaceC1364105Vn<? super C0NIO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0nip;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NIO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BackgroundAudioPlayer@8a21.resume$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LJ() && this.LL.LIZ() != null) {
            this.LL.LIZ().getPlayerManager().LJIILLIIL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BackgroundAudioPlayer@8a21.resume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
