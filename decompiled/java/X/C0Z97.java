package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.strategy.StrategyConfigData;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z97, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.strategy.StrategyPreheatManager$preloadLightInteractionEntry$1", f = "StrategyPreheatManager.kt", l = {}, m = "invokeSuspend")
public final class C0Z97 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StrategyConfigData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z97(StrategyConfigData strategyConfigData, InterfaceC1364105Vn<? super C0Z97> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = strategyConfigData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z97(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Collection<LightInteractionEntryConf> collectionValues;
        InterfaceC1664506fT interfaceC1664506fTLIZJ;
        C1C7U.LIZ("StrategyPreheatManager@6353.preloadLightInteractionEntry$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Map<String, LightInteractionEntryConf> lightInteractionEntry = this.LL.getLightInteractionEntry();
            if (lightInteractionEntry != null && (collectionValues = lightInteractionEntry.values()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    String iconUrl = ((LightInteractionEntryConf) it2.next()).getIconUrl();
                    if (iconUrl != null) {
                        arrayList.add(iconUrl);
                    }
                }
                Set<String> setLLIIJI = C13LP.LLIIJI(arrayList);
                if (setLLIIJI != null) {
                    for (String str : setLLIIJI) {
                        IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceLoadService.class);
                        if (iDMResourceLoadService != null && (interfaceC1664506fTLIZJ = iDMResourceLoadService.LIZJ(C0Z3V.DIMENSION_UID, true)) != null) {
                            interfaceC1664506fTLIZJ.LJI("light_interaction_entry_icon_preload", str);
                        }
                        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                        C1332130kln.LIZJ(c1331670kl3LJIIIZ, C06TB.DEFAULT);
                        c1331670kl3LJIIIZ.LJIILIIL();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StrategyPreheatManager@6353.preloadLightInteractionEntry$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
