package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.report.log.EtEventRecord;
import com.ss.android.ugc.aweme.minis.report.log.MinisReportEtDataWhiteListSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.01aT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C359501aT {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(196));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(197));

    public static InterfaceC359601aU LIZ(final String str) {
        if (str == null) {
            return null;
        }
        Map map = (Map) LIZ.getValue();
        Object obj = map.get(str);
        if (obj == null) {
            obj = new InterfaceC359601aU() { // from class: X.01aS
                public final List<EtEventRecord> LIZ = new ArrayList();

                @Override // X.InterfaceC359601aU
                public final Unit LIZIZ() {
                    Unit unit;
                    Object value = C359501aT.LIZIZ.getValue();
                    String str2 = str;
                    value.getClass();
                    try {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        if (contextLIZ == null) {
                            unit = Unit.LIZ;
                        } else {
                            C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(contextLIZ), "minis_et_data");
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("et_event_cache_");
                            sbLIZ.append(str2);
                            sbLIZ.append(".json");
                            C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
                            if (c0vsj2.exists()) {
                                c0vsj2.delete();
                            }
                            unit = Unit.LIZ;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        unit = Unit.LIZ;
                    }
                    return unit == C099R.LJFF() ? unit : Unit.LIZ;
                }

                @Override // X.InterfaceC359601aU
                public final C0VSJ LIZJ() throws Throwable {
                    List<EtEventRecord> cache;
                    Object value = C359501aT.LIZIZ.getValue();
                    String str2 = str;
                    value.getClass();
                    InterfaceC359601aU interfaceC359601aULIZ = C359501aT.LIZ(str2);
                    if (interfaceC359601aULIZ != null && (cache = interfaceC359601aULIZ.getCache()) != null && !cache.isEmpty()) {
                        try {
                            C844470XAv.LIZ.getClass();
                            Context contextLIZ = C844470XAv.LIZ();
                            if (contextLIZ != null) {
                                C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(contextLIZ), "minis_et_data");
                                if (!c0vsj.exists()) {
                                    c0vsj.mkdirs();
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("et_event_cache_");
                                sbLIZ.append(str2);
                                sbLIZ.append(".json");
                                C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
                                C1227904rF.LIZ.getClass();
                                String strLJI = C1227904rF.LJI(cache);
                                if (strLJI != null) {
                                    C09BH.LJIIIZ(c0vsj2, strLJI, Charsets.UTF_8);
                                    return c0vsj2;
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    return null;
                }

                @Override // X.InterfaceC359601aU
                public final void clearCache() {
                    ((ArrayList) this.LIZ).clear();
                }

                @Override // X.InterfaceC359601aU
                public final List<EtEventRecord> getCache() {
                    return C13LP.LLIIII(this.LIZ);
                }

                @Override // X.InterfaceC359601aU
                public final void LIZ(String str2, Map<String, String> map2) {
                    Map mapLJ;
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    MinisReportEtDataWhiteListSettings.MinisReportEtDataWhiteListModel minisReportEtDataWhiteListModel = MinisReportEtDataWhiteListSettings.LIZ;
                    MinisReportEtDataWhiteListSettings.MinisReportEtDataWhiteListModel minisReportEtDataWhiteListModel2 = (MinisReportEtDataWhiteListSettings.MinisReportEtDataWhiteListModel) settingsManagerLIZLLL.LJIIIIZZ("minis_report_et_data_white_list", MinisReportEtDataWhiteListSettings.MinisReportEtDataWhiteListModel.class, minisReportEtDataWhiteListModel);
                    if (minisReportEtDataWhiteListModel2 != null) {
                        minisReportEtDataWhiteListModel = minisReportEtDataWhiteListModel2;
                    }
                    List<MinisReportEtDataWhiteListSettings.EtWhiteListItem> list = minisReportEtDataWhiteListModel.etWhiteList;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return;
                    }
                    for (MinisReportEtDataWhiteListSettings.EtWhiteListItem etWhiteListItem : list) {
                        if (etWhiteListItem.enableReport && etWhiteListItem.etList.contains(str2)) {
                            if (map2 == null || (mapLJ = C2097608Jq.LJIIZILJ(map2)) == null) {
                                mapLJ = C2097608Jq.LJ();
                            }
                            ((ArrayList) this.LIZ).add(new EtEventRecord(str2, mapLJ, System.currentTimeMillis()));
                            return;
                        }
                    }
                }
            };
            map.put(str, obj);
        }
        return (InterfaceC359601aU) obj;
    }
}
