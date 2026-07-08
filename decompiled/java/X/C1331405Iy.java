package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Iy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh$begin$1", f = "StickerDurationAutoRefresh.kt", l = {}, m = "invokeSuspend")
public final class C1331405Iy extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ C388890FMp LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1331405Iy(Function1<? super Integer, Unit> function1, C388890FMp c388890FMp, InterfaceC1364105Vn<? super C1331405Iy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c388890FMp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1331405Iy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerDurationAutoRefresh@7d7d.begin$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI.LIZIZ.invoke());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerDurationAutoRefresh@7d7d.begin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
