package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.gamora.celebration.ICreationPreloadAssetService;
import com.ss.android.ugc.gamora.celebration.PreloadConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0t8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.recordtab.EditorTabModule$Companion$preloadEditorActiveConfigs$1", f = "EditorTabModule.kt", l = {}, m = "invokeSuspend")
public final class C1653540t8C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C1653540t8C(InterfaceC1364105Vn<? super C1653540t8C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1653540t8C c1653540t8C = new C1653540t8C(interfaceC1364105Vn);
        c1653540t8C.LL = obj;
        return c1653540t8C;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<PreloadConfig> list;
        List<PreloadConfig> list2;
        List<PreloadConfig> listLIZ;
        C1C7U.LIZ("EditorTabModule$Companion@6f13.preloadEditorActiveConfigs$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        if (!C1653530t8B.LLJJIII && ((list = C1653530t8B.LLJJI) == null || list.isEmpty())) {
            synchronized (obj2) {
                try {
                    if (!C1653530t8B.LLJJIII && ((list2 = C1653530t8B.LLJJI) == null || list2.isEmpty())) {
                        C1655280tB0 c1655280tB0 = C1653530t8B.LLJJ;
                        C1653530t8B.LLJJIII = true;
                        try {
                            try {
                                ICreationPreloadAssetService iCreationPreloadAssetService = (ICreationPreloadAssetService) PluggableExtentionKt.pluggableSpi$default(ICreationPreloadAssetService.class, false, false, false, 14, null);
                                if (iCreationPreloadAssetService == null || (listLIZ = iCreationPreloadAssetService.LIZ()) == null) {
                                    listLIZ = C13BV.INSTANCE;
                                }
                                C1653530t8B.LLJJI = listLIZ;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1655280tB0 c1655280tB02 = C1653530t8B.LLJJ;
                                C1653530t8B.LLJJI = C13BV.INSTANCE;
                            }
                            C1653530t8B.LLJJIJI.countDown();
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("EditorTabModule$Companion@6f13.preloadEditorActiveConfigs$1");
                            return unit;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1653530t8B.LLJJIJI.countDown();
                            throw th;
                        }
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("EditorTabModule$Companion@6f13.preloadEditorActiveConfigs$1");
                    return unit2;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EditorTabModule$Companion@6f13.preloadEditorActiveConfigs$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
