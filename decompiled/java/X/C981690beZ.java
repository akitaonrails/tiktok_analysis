package X;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0beZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.utils.GameResourceManager$downloadCatchBeans$1$1", f = "GameResourceManager.kt", l = {}, m = "invokeSuspend")
public final class C981690beZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C981690beZ(InterfaceC1364105Vn<? super C981690beZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C981690beZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameResourceManager@a046.downloadCatchBeans$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC974260bSa enumC974260bSaJV1 = C915980Zwa.LIZIZ().JV1(false);
        Set<String> set = C985690bl1.LJFF;
        C985690bl1.LIZ.getClass();
        String str = C985690bl1.LIZIZ;
        if (set.contains(str) && enumC974260bSaJV1.compareTo(EnumC974260bSa.INVITED) < 0) {
            C766270U4b.LIZLLL(2131851547);
            set.remove(str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameResourceManager@a046.downloadCatchBeans$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C981690beZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
