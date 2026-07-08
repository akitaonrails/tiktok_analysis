package X;

import com.ss.android.ugc.aweme.tako.botpage.components.video.videolist.TakoVideoItemCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.video.videolist.TakoVideoItemCell$mobShowReal$1", f = "TakoVideoItemCell.kt", l = {}, m = "invokeSuspend")
public final class C433410Gz5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoVideoItemCell LL;
    public final /* synthetic */ C689600R3e LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433410Gz5(TakoVideoItemCell takoVideoItemCell, C689600R3e c689600R3e, InterfaceC1364105Vn<? super C433410Gz5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoVideoItemCell;
        this.LLILLJJLI = c689600R3e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433410Gz5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoVideoItemCell@f228.mobShowReal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.R5(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoVideoItemCell@f228.mobShowReal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
