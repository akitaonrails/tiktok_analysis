package X;

import Y.ARunnableS93S0200000_24;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.experiment.FlexiblePanelPerformanceSettings;
import com.ss.android.ugc.aweme.feed.flexible.preload.FlexiblePanelPreloadScene;
import com.ss.android.ugc.aweme.feed.flexible.preload.FlexibleSparkPreloadProtocol;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.cell.interact.FcpStandardPreloadComponent;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700350RdZ extends C09AY implements Function2<FcpStandardPreloadComponent, Double, Unit> {
    public C700350RdZ() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FcpStandardPreloadComponent fcpStandardPreloadComponent, Double d) {
        List<String> listIf0;
        String strLJJLIIIJ;
        FcpStandardPreloadComponent fcpStandardPreloadComponent2 = fcpStandardPreloadComponent;
        Double d2 = d;
        if (d2 != null) {
            d2.doubleValue();
            if (((Boolean) fcpStandardPreloadComponent2.LLJJJ.getValue()).booleanValue()) {
                fcpStandardPreloadComponent2.Eo(d2.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            if (((Boolean) fcpStandardPreloadComponent2.LLJJJIL.getValue()).booleanValue()) {
                double dDoubleValue = d2.doubleValue() * ((double) LSPassThroughRecordSizeConfig.DEFAULT);
                IFcpPolicyAbility iFcpPolicyAbilityCo = fcpStandardPreloadComponent2.Co();
                if (iFcpPolicyAbilityCo == null || (listIf0 = iFcpPolicyAbilityCo.If0()) == null) {
                    listIf0 = C13BV.INSTANCE;
                }
                if (!fcpStandardPreloadComponent2.LLJJJJ && dDoubleValue >= ((FlexiblePanelPerformanceSettings.FlexiblePanelPerformanceConfig) FlexiblePanelPerformanceSettings.LIZIZ.getValue()).startPreloadTime) {
                    fcpStandardPreloadComponent2.LLJJJJ = true;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    boolean z = false;
                    List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(fcpStandardPreloadComponent2), FlexibleSparkPreloadProtocol.class, false);
                    if (listLIZIZ != null) {
                        for (FlexibleSparkPreloadProtocol flexibleSparkPreloadProtocol : (ArrayList) listLIZIZ) {
                            if (listIf0.contains(flexibleSparkPreloadProtocol.o7()) && !fcpStandardPreloadComponent2.LLJJIJIIJIL.contains(flexibleSparkPreloadProtocol.o7())) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("preloadFlexibleScene mid, componentkey:");
                                sbLIZ.append(flexibleSparkPreloadProtocol.o7());
                                sbLIZ.append(", schema:");
                                List<String> listE51 = flexibleSparkPreloadProtocol.e51();
                                if (listE51 != null) {
                                    strLJJLIIIJ = C13LP.LJJLIIIJ(listE51, null, null, null, 0, null, null, 63);
                                } else {
                                    strLJJLIIIJ = null;
                                }
                                sbLIZ.append(strLJJLIIIJ);
                                C2188811AlT.LIZIZ(sbLIZ);
                                List<String> listE512 = flexibleSparkPreloadProtocol.e51();
                                if (listE512 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<String> it2 = listE512.iterator();
                                    while (it2.hasNext()) {
                                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(it2.next()), "target_schema");
                                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                                            arrayList.add(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                                        }
                                    }
                                    linkedHashMap.put(flexibleSparkPreloadProtocol.o7(), arrayList);
                                    z = true;
                                }
                            }
                        }
                        if (z && fcpStandardPreloadComponent2.getContext() != null) {
                            fcpStandardPreloadComponent2.LLJJIJIIJIL.addAll(linkedHashMap.keySet());
                            ((C2206201BWg) C2238821Cjw.LIZLLL.getValue()).LIZ(new ARunnableS93S0200000_24(new FlexiblePanelPreloadScene(new C700380Rdc(listIf0, linkedHashMap)), null, 46));
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
