package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS297S0000000_13;

/* JADX INFO: renamed from: X.0XAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.easteregg.TakoEasterEggHelper$parsEasterEggConfig$1", f = "TakoEasterEggHelper.kt", l = {}, m = "invokeSuspend")
public final class C844370XAl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C844370XAl(InterfaceC1364105Vn<? super C844370XAl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C844370XAl(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoEasterEggHelper@9d6e.parsEasterEggConfig$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = (String) C1849007Ma.LIZ.getValue();
        C844350XAj c844350XAj = C844350XAj.LIZ;
        AFwS297S0000000_13 aFwS297S0000000_13 = AFwS297S0000000_13.get$arr$(3);
        c844350XAj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("easterEgg/");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c844350XAj.getClass();
        C844350XAj.LIZLLL("tiktok_bot_avatar_resource", strLIZIZ, aFwS297S0000000_13, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoEasterEggHelper@9d6e.parsEasterEggConfig$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C844370XAl(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
