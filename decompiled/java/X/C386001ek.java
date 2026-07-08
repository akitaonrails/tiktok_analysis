package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.OptInteractStickerAutoRefreshHelper$begin$1", f = "OptInteractStickerAutoRefreshHelper.kt", l = {}, m = "invokeSuspend")
public final class C386001ek extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C386101el LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C386001ek(C386101el c386101el, InterfaceC1364105Vn<? super C386001ek> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c386101el;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C386001ek(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("OptInteractStickerAutoRefreshHelper@cb63.begin$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C386101el c386101el = this.LL;
        Iterator<Map.Entry<Integer, InterfaceC386201em>> it2 = c386101el.LIZLLL.entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC386201em value = it2.next().getValue();
            InterfaceC386401eo interfaceC386401eo = c386101el.LIZ;
            if (interfaceC386401eo != null) {
                lLJFF = C2286608xc.LJFF(interfaceC386401eo.LLL());
            } else {
                lLJFF = null;
            }
            value.LIZ(lLJFF);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OptInteractStickerAutoRefreshHelper@cb63.begin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
