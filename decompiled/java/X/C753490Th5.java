package X;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Th5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.uikit.remoteimage.GeckoRemoteImage$loader$1$start$1$1", f = "GeckoRemoteImage.kt", l = {}, m = "invokeSuspend")
public final class C753490Th5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Drawable>, Object> {
    public final /* synthetic */ C753520Th8 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C753490Th5(C753520Th8 c753520Th8, InterfaceC1364105Vn<? super C753490Th5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c753520Th8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C753490Th5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeckoRemoteImage@869c.loader$1$start$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C753520Th8 c753520Th8 = this.LL;
        Drawable drawableLIZ = C1143680frq.LIZ(c753520Th8.LIZLLL, c753520Th8.LJ);
        C1C7U.LIZIZ("GeckoRemoteImage@869c.loader$1$start$1$1");
        return drawableLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Drawable> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
