package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.SocialFIPluginManager$kickoffInitialProbe$1", f = "SocialFIPluginManager.kt", l = {}, m = "invokeSuspend")
public final class C314770CVn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C314770CVn(InterfaceC1364105Vn<? super C314770CVn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314770CVn(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialFIPluginManager@f9c4.kickoffInitialProbe$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C319400Cfa.LIZ.getClass();
        boolean zLIZJ = C319400Cfa.LIZJ();
        if (zLIZJ) {
            C319400Cfa.LIZLLL.set(EnumC319440Cfe.INSTALLED);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kickoffInitialProbe: done, downloaded=");
        sbLIZ.append(zLIZJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(", pluginStatus=");
        sbLIZ2.append(C319400Cfa.LIZLLL.get());
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        C2188811AlT.LIZIZ(sbLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialFIPluginManager@f9c4.kickoffInitialProbe$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C314770CVn(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
