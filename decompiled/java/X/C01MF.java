package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01MF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.preload.TakoViewPreload$preloadForE2EFirstPacketRender$2", f = "TakoViewPreload.kt", l = {}, m = "invokeSuspend")
public final class C01MF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01MF(Context context, InterfaceC1364105Vn<? super C01MF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01MF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoViewPreload@2e88.preloadForE2EFirstPacketRender$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21146717pB.LIZJ(this.LL, R.layout.fmk);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoViewPreload@2e88.preloadForE2EFirstPacketRender$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
