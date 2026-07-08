package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0p8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.sparkthird.SearchSparkThirdContainerHelper$createContainer$2", f = "SearchSparkThirdContainerHelper.kt", l = {}, m = "invokeSuspend")
public final class C1499960p8U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1497050p3n LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499960p8U(C1497050p3n c1497050p3n, InterfaceC1364105Vn<? super C1499960p8U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1497050p3n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1499960p8U(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchSparkThirdContainerHelper@9059.createContainer$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1497050p3n c1497050p3n = this.LL;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        n nVar = C1499970p8V.LIZ;
        n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("tiktok_scc_sdk", n.class, nVar);
        if (nVar2 != null) {
            nVar = nVar2;
        }
        c1497050p3n.LIZ.LIZ(nVar);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchSparkThirdContainerHelper@9059.createContainer$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
