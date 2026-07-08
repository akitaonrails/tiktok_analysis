package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.recent.RecentUsedStickerDataRepo$stickers$2", f = "RecentUsedStickerDataRepo.kt", l = {}, m = "invokeSuspend")
public final class C1420305hB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1634780sdw LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420305hB(C1634780sdw c1634780sdw, InterfaceC1364105Vn<? super C1420305hB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1634780sdw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1420305hB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("RecentUsedStickerDataRepo@8b62.stickers$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1634780sdw c1634780sdw = this.LL;
        c1634780sdw.LJ.postValue(c1634780sdw.LIZJ().LIZJ(this.LL.LIZ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecentInfoStickers::update, stickers count: ");
        List<C1635170seZ> value = this.LL.LJ.getValue();
        if (value != null) {
            numLJ = C2286608xc.LJ(value.size());
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecentUsedStickerDataRepo@8b62.stickers$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
