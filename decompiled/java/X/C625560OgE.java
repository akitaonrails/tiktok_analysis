package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OgE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager$initCacheState$1", f = "OfflineModeManager.kt", l = {}, m = "invokeSuspend")
public final class C625560OgE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C625560OgE(InterfaceC1364105Vn<? super C625560OgE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C625560OgE(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC624770Oex enumC624770Oex;
        C1C7U.LIZ("OfflineModeManager@8800.initCacheState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C01GW c01gw = C625420Og0.LIZ;
            C625530OgB.LIZ.getClass();
            C625420Og0.LJIIL(C625530OgB.LIZIZ());
            C625460Og4.LIZ.getClass();
            C625420Og0.LJIIJJI(C625460Og4.LJII() / 1024.0d);
            C19319410i8 c19319410i8 = C625470Og5.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init cache state cacheSize: ");
            sbLIZ.append(C625420Og0.LIZIZ());
            c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (C625420Og0.LIZJ() < C625420Og0.LIZ() && C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADED) {
                C844470XAv.LIZ.getClass();
                if (!C0XF1.LIZLLL(C844470XAv.LIZ())) {
                    enumC624770Oex = EnumC624770Oex.PAUSE_NO_NETWORK;
                } else if (C625420Og0.LJIIIZ() && !C0XF1.LJ(C844470XAv.LIZ())) {
                    enumC624770Oex = EnumC624770Oex.PAUSE_NOT_WIFI;
                } else {
                    enumC624770Oex = EnumC624770Oex.DOWNLOADING;
                }
                C625420Og0.LJIILIIL(enumC624770Oex);
            } else if (C625420Og0.LIZJ() >= C625420Og0.LIZ()) {
                C625420Og0.LJIILIIL(EnumC624770Oex.DOWNLOADED);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i82 = C625470Og5.LLILZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("OfflineModeManager init failed ");
            sbLIZ2.append(e);
            c19319410i82.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeManager@8800.initCacheState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C625560OgE(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
