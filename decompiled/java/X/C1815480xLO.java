package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xLO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel$doneScenery$1$3$1", f = "SceneryApplyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1815480xLO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SceneryApplyViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815480xLO(SceneryApplyViewModel sceneryApplyViewModel, InterfaceC1364105Vn<? super C1815480xLO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sceneryApplyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1815480xLO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SceneryApplyViewModel@a4ab.doneScenery$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1790620whI.LJII();
        C1790620whI.LJI("upsert_item");
        this.LL.getClass();
        C0U4R c0u4r = new C0U4R();
        c0u4r.LIZLLL = 2131851427;
        c0u4r.LIZJ = "ttlive_boards_live_createBoard_generalErrorToast";
        c0u4r.LJFF = true;
        C766270U4b.LJIIJ(c0u4r);
        this.LL.LL.qk(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SceneryApplyViewModel@a4ab.doneScenery$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
