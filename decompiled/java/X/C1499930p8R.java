package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.communication.SccNetAdapter;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0p8R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.sparkthird.SearchSparkThirdContainerHelper$createContainer$1", f = "SearchSparkThirdContainerHelper.kt", l = {}, m = "invokeSuspend")
public final class C1499930p8R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1499930p8R(InterfaceC1364105Vn<? super C1499930p8R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1499930p8R(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZJ;
        C1C7U.LIZ("SearchSparkThirdContainerHelper@9059.createContainer$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        n nVar = C1499970p8V.LIZ;
        n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("tiktok_scc_sdk", n.class, nVar);
        if (nVar2 != null) {
            nVar = nVar2;
        }
        if (nVar != null) {
            k kVarLJJIIZ = nVar.LJJIIZ("scc_cs_allow_list");
            ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) C1489780os4.LIZJ;
            reentrantReadWriteLock.writeLock().lock();
            if (kVarLJJIIZ == null) {
                strLIZJ = null;
            } else {
                strLIZJ = C1934607hw.LIZJ(kVarLJJIIZ.LJIIL());
            }
            C1489780os4.LIZIZ = strLIZJ;
            k kVarLJJIIZ2 = nVar.LJJIIZ("scc_cs_allow_fallback_regex");
            if (kVarLJJIIZ2 != null) {
                kVarLJJIIZ2.LJ();
            }
            reentrantReadWriteLock.writeLock().unlock();
        }
        C1489780os4.LIZJ(new SccNetAdapter());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchSparkThirdContainerHelper@9059.createContainer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1499930p8R(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
