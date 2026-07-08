package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [D] */
/* JADX INFO: renamed from: X.0O4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.MusicTabExtensionKt$musicNetworkMonitorWatch$2", f = "MusicTabExtension.kt", l = {}, m = "invokeSuspend")
public final class C613570O4t<D> extends C09AX implements Function2<InterfaceC346701Wf<? super C0O7A<D>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C238400w2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613570O4t(C238400w2 c238400w2, InterfaceC1364105Vn<? super C613570O4t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c238400w2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613570O4t(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicTabExtensionKt@d184.musicNetworkMonitorWatch$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.element = System.currentTimeMillis();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicTabExtensionKt@d184.musicNetworkMonitorWatch$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
