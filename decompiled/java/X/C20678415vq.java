package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.frequency.model.CommonFrequencyClientInfo;
import com.ss.android.ugc.aweme.frequency.model.FrequencyProtocol;
import com.ss.android.ugc.aweme.frequency.model.NotAllowOutreachItemInfo;
import com.ss.android.ugc.aweme.frequency.model.OutreachFrequencyInfo;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.outreach.frequency.config.Abilities;
import com.ss.android.ugc.aweme.outreach.frequency.config.CustomConfig;
import com.ss.android.ugc.aweme.outreach.frequency.config.RecordsClipping;
import com.ss.android.ugc.aweme.outreach.frequency.config.UnifiedUploadRecordsAbility;
import com.ss.android.ugc.aweme.report.ClickReportInfo;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import com.ss.android.ugc.aweme.report.ShowReportInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS353S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20678415vq implements IOutreachFrequency {
    public final Context LIZ;
    public final FrequencyProtocol LIZIZ;
    public final InterfaceC807990Vmn LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final SimpleDateFormat LJI;
    public final List<InterfaceC20680515wB> LJII;

    public C20678415vq() {
        this(null, null, null);
    }

    public final C807950Vmj LJII() {
        return (C807950Vmj) this.LJFF.getValue();
    }

    public final C822720WPe LJIIIIZZ() {
        return (C822720WPe) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void LIZIZ() {
        C807950Vmj c807950VmjLJII = LJII();
        if (c807950VmjLJII != null) {
            C23250099c.LIZLLL(c807950VmjLJII.LIZLLL, null, null, new C808070Vmv(c807950VmjLJII, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void release() {
        C807950Vmj c807950VmjLJII = LJII();
        if (c807950VmjLJII != null) {
            c807950VmjLJII.LJIIIZ = true;
            AnonymousClass0956 anonymousClass0956 = c807950VmjLJII.LJII;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C23250099c.LIZLLL(c807950VmjLJII.LIZLLL, null, null, new C808110Vmz(c807950VmjLJII, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void init() {
        LJII();
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final List<OutreachFlowReportItem> LIZJ(String str) {
        Abilities abilities;
        UnifiedUploadRecordsAbility unifiedUploadRecordsAbility;
        String str2;
        CustomConfig customConfigLIZ = C20677515vh.LIZ(str);
        if (customConfigLIZ != null && (abilities = customConfigLIZ.abilities) != null && (unifiedUploadRecordsAbility = abilities.unifiedUploadRecords) != null && unifiedUploadRecordsAbility.enable) {
            C20677815vk.Companion.getClass();
            Map<String, OutreachFlowReportItem> cacheRecords = C20677815vk.instance.getCacheRecords();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, OutreachFlowReportItem> entry : cacheRecords.entrySet()) {
                OutreachInfo outreachInfo = entry.getValue().outreachInfo;
                if (outreachInfo != null) {
                    str2 = outreachInfo.outreachType;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(((Map.Entry) it2.next()).getValue());
            }
            return C13LP.LLIIII(arrayList);
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void LJ(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo) {
        C20679415w0.LIZ(new C20678915vv(interfaceC20677715vj, outreachInfo, null, null, null, 60), C1697810uHb.LJIIJJI(new C20678715vt(LJII()), new InterfaceC20680215w8<C20678915vv>() { // from class: X.15vp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20680215w8
            public final void LIZ(C20679515w1 c20679515w1) {
                InterfaceC20677715vj interfaceC20677715vj2;
                OutreachInfo outreachInfo2;
                T t = c20679515w1.LIZIZ;
                OutreachFlowReportItem outreachFlowReportItem = ((C20678915vv) t).LJFF;
                if (outreachFlowReportItem == null || (interfaceC20677715vj2 = ((C20678915vv) t).LIZ) == null || (outreachInfo2 = ((C20678915vv) t).LIZIZ) == null) {
                    return;
                }
                if (!outreachFlowReportItem.available()) {
                    C20571615ec.LIZ.getClass();
                    C20571615ec.LIZLLL("OutreachRecordData: cache is unavailable, can not be reported!");
                } else {
                    C20677415vg.LIZIZ(EnumC748390TXh.REPORT, interfaceC20677715vj2, outreachInfo2, outreachFlowReportItem);
                    c20679515w1.LIZ();
                }
            }
        })).LIZ();
    }

    public C20678415vq(Context context, FrequencyProtocol frequencyProtocol, InterfaceC807990Vmn interfaceC807990Vmn) {
        this.LIZ = context;
        this.LIZIZ = frequencyProtocol;
        this.LIZJ = interfaceC807990Vmn;
        this.LIZLLL = C452501pT.LIZIZ(new C20679015vw(this));
        this.LJ = C452501pT.LIZIZ(new C20679115vx());
        this.LJFF = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C20678515vr(this));
        this.LJI = new SimpleDateFormat("MM-dd HH:mm:ss");
        this.LJII = new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final CommonFrequencyClientInfo LIZ(AFwS353S0000000_31 aFwS353S0000000_31, String str, String str2) {
        Abilities abilities;
        RecordsClipping recordsClipping;
        Map<String, ? extends InterfaceC822760WPi> map;
        String strLJJLIIIJ;
        CustomConfig customConfigLIZ = C20677515vh.LIZ(str);
        ArrayList arrayList = null;
        if (customConfigLIZ == null || (abilities = customConfigLIZ.abilities) == null || (recordsClipping = abilities.recordsClipping) == null || !recordsClipping.enable) {
            return null;
        }
        Map<String, ? extends Map<String, ? extends InterfaceC822760WPi>> map2 = LJIIIIZZ().LIZ.get(str);
        if (map2 != null && (map = map2.get(str2)) != null) {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry<String, ? extends InterfaceC822760WPi> entry : map.entrySet()) {
                arrayList2.add(entry.getValue().LIZ(((InterfaceC20677715vj) aFwS353S0000000_31.invoke(str, str2, entry.getKey())).LIZ(), entry.getKey()));
            }
            List listLLIIII = C13LP.LLIIII(arrayList2);
            if (listLLIIII != null) {
                ArrayList<RuleHitState> arrayList3 = new ArrayList();
                for (Object obj : listLLIIII) {
                    if (Intrinsics.LJFF(((RuleHitState) obj).isHit(), Boolean.TRUE)) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                for (RuleHitState ruleHitState : arrayList3) {
                    String str3 = ruleHitState.outreachKey;
                    List<String> list = ruleHitState.hitRuleIds;
                    if (list != null) {
                        strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
                    } else {
                        strLJJLIIIJ = null;
                    }
                    arrayList4.add(new NotAllowOutreachItemInfo(str3, strLJJLIIIJ));
                }
                arrayList = arrayList4;
            }
        }
        return new CommonFrequencyClientInfo(Collections.singletonList(new OutreachFrequencyInfo(str, arrayList)));
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void LIZLLL(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo, String str) {
        C20679415w0.LIZ(new C20678915vv(interfaceC20677715vj, outreachInfo, str, null, null, 56), C1697810uHb.LJIIJJI(new C20678715vt(LJII()), new InterfaceC20680215w8<C20678915vv>() { // from class: X.15vn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20680215w8
            public final void LIZ(C20679515w1 c20679515w1) {
                InterfaceC20677715vj interfaceC20677715vj2;
                OutreachInfo outreachInfo2;
                T t = c20679515w1.LIZIZ;
                OutreachFlowReportItem outreachFlowReportItem = ((C20678915vv) t).LJFF;
                if (outreachFlowReportItem == null || (interfaceC20677715vj2 = ((C20678915vv) t).LIZ) == null || (outreachInfo2 = ((C20678915vv) t).LIZIZ) == null) {
                    return;
                }
                if (outreachFlowReportItem.showReportInfo == null) {
                    outreachFlowReportItem.setShowReportInfo(new ShowReportInfo(String.valueOf(System.currentTimeMillis())));
                }
                C20648315qz.LIZ.getClass();
                outreachFlowReportItem.setTriggerSession(C20648315qz.LJFF);
                String str2 = outreachFlowReportItem.triggerSession;
                if (str2 == null || str2.length() == 0) {
                    outreachFlowReportItem.setTriggerSession(C20648315qz.LJFF);
                }
                C20677415vg.LIZIZ(EnumC748390TXh.SHOW, interfaceC20677715vj2, outreachInfo2, outreachFlowReportItem);
                c20679515w1.LIZ();
            }
        }, new C20678615vs(LJIIIIZZ(), LJII(), this.LJII))).LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.functions.Function1] */
    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final RuleHitState LJFF(C20653915rt c20653915rt, OutreachInfo outreachInfo, final String str, final String str2) {
        final String str3;
        RuleHitState ruleHitState;
        String strLJJLIIIJ;
        Map<String, ? extends InterfaceC822760WPi> map;
        InterfaceC822760WPi interfaceC822760WPi;
        C822720WPe c822720WPeLJIIIIZZ = LJIIIIZZ();
        c822720WPeLJIIIIZZ.getClass();
        final String str4 = outreachInfo.outreachKey;
        String str5 = null;
        if (str4 == null || (str3 = outreachInfo.outreachType) == null) {
            return null;
        }
        String strLIZ = c20653915rt.LIZ();
        Map<String, ? extends Map<String, ? extends InterfaceC822760WPi>> map2 = c822720WPeLJIIIIZZ.LIZ.get(outreachInfo.outreachType);
        if (map2 == null || (map = map2.get(str)) == null || (interfaceC822760WPi = map.get(str4)) == null || (ruleHitState = interfaceC822760WPi.LIZ(strLIZ, str4)) == null) {
            str5 = null;
            ruleHitState = new RuleHitState(strLIZ, str4, Boolean.FALSE, null, null, System.currentTimeMillis());
        }
        Boolean boolIsHit = ruleHitState.isHit();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolIsHit, bool)) {
            final String str6 = ruleHitState.ruleStrategy;
            List<String> list = ruleHitState.hitRuleIds;
            if (list != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", str5, str5, 0, str5, str5, 62);
            } else {
                strLJJLIIIJ = str5;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('-');
            sbLIZ.append(str3);
            sbLIZ.append('-');
            sbLIZ.append(str4);
            sbLIZ.append('-');
            sbLIZ.append(str5);
            sbLIZ.append('-');
            sbLIZ.append(str6);
            sbLIZ.append('-');
            sbLIZ.append(strLJJLIIIJ);
            sbLIZ.append('-');
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C04Q4.LIZ;
            if (!Intrinsics.LJFF(concurrentHashMap.get(strLIZIZ), bool)) {
                concurrentHashMap.put(strLIZIZ, bool);
                final String str7 = strLJJLIIIJ;
                C20684815ws.LJFF().submit(new Runnable() { // from class: X.14ho
                    public final /* synthetic */ String LLILZ = null;

                    public final void LIZ() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            String str8 = str;
                            String str9 = str3;
                            String str10 = str4;
                            String str11 = this.LLILZ;
                            String str12 = str6;
                            String str13 = str7;
                            String str14 = str2;
                            jSONObject.put("enter_from", str8);
                            jSONObject.put("outreach_type", str9);
                            jSONObject.put("outreach_key", str10);
                            jSONObject.put("outreach_id", str11);
                            jSONObject.put("block_strategy_type", str12);
                            jSONObject.put("block_strategy_detail", str13);
                            jSONObject.put("block_time", "client_last");
                            jSONObject.put("extra_info", str14);
                            C20684815ws.LJIJ("common_frequency_block_detail", jSONObject);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FrequencyMobHelper@e5c.reportFrequencyEvent$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FrequencyMobHelper@e5c.reportFrequencyEvent$1");
                    }
                });
            }
        }
        return ruleHitState;
    }

    @Override // com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency
    public final void LJI(InterfaceC20677715vj interfaceC20677715vj, OutreachInfo outreachInfo, String str, String str2, String str3) {
        C20679415w0.LIZ(new C20678915vv(interfaceC20677715vj, outreachInfo, str, str2, str3, 32), C1697810uHb.LJIIJJI(new C20678715vt(LJII()), new InterfaceC20680215w8<C20678915vv>() { // from class: X.15vo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20680215w8
            public final void LIZ(C20679515w1 c20679515w1) {
                InterfaceC20677715vj interfaceC20677715vj2;
                OutreachInfo outreachInfo2;
                String str4;
                T t = c20679515w1.LIZIZ;
                OutreachFlowReportItem outreachFlowReportItem = ((C20678915vv) t).LJFF;
                if (outreachFlowReportItem == null || (interfaceC20677715vj2 = ((C20678915vv) t).LIZ) == null || (outreachInfo2 = ((C20678915vv) t).LIZIZ) == null || (str4 = ((C20678915vv) t).LIZLLL) == null) {
                    return;
                }
                outreachFlowReportItem.clickReportInfo.add(new ClickReportInfo(String.valueOf(System.currentTimeMillis()), str4, ((C20678915vv) c20679515w1.LIZIZ).LJ));
                C20648315qz.LIZ.getClass();
                outreachFlowReportItem.setTriggerSession(C20648315qz.LJFF);
                String str5 = outreachFlowReportItem.triggerSession;
                if (str5 == null || str5.length() == 0) {
                    outreachFlowReportItem.setTriggerSession(C20648315qz.LJFF);
                }
                C20677415vg.LIZIZ(EnumC748390TXh.CLICK, interfaceC20677715vj2, outreachInfo2, outreachFlowReportItem);
                c20679515w1.LIZ();
            }
        }, new C20678615vs(LJIIIIZZ(), LJII(), this.LJII))).LIZ();
    }
}
