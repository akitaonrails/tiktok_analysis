package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import com.ss.android.ugc.feed.platform.componentmanager.outreach.FcpComponentOutreachFrequencyExtraInfo;
import com.ss.android.ugc.feed.platform.componentmanager.outreach.ab.FrequencyExpConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS2S4000000_11;
import kotlin.jvm.internal.AwS2S4100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.15rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20653815rs {
    public static final C20653815rs LIZ = new C20653815rs();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0W0V());
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6103));
    public static final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS200S0000000_13.get$arr$(411));
    public static final ConcurrentHashMap<String, RuleHitState> LJ = new ConcurrentHashMap<>();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(412));
    public static final C20654315rx LJI = new InterfaceC20654515rz() { // from class: X.15rx
        @Override // X.InterfaceC20654515rz
        public final void d() {
        }
    };

    /* JADX WARN: Type inference failed for: r0v13, types: [X.15rx] */
    static {
        new ArrayList();
    }

    public static C807940Vmi LIZIZ() {
        return (C807940Vmi) LIZLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static RuleHitState LIZ(String str, String str2, String str3) {
        boolean z;
        ?? arrayList;
        List<String> list;
        FrequencyExpConfig frequencyExpConfig;
        List<String> list2;
        Object obj = null;
        if (str == null || str2 == null) {
            return null;
        }
        String strLIZ = C1614340s6y.LIZ();
        EnumC20654715s1.FEED_COMPONENT.getTypeName();
        C20654015ru c20654015ru = new C20654015ru(str, str2, strLIZ, str3, LJI);
        ArrayList arrayList2 = new ArrayList();
        C01GW c01gw = C1867120ygg.LIZIZ;
        FrequencyExpConfig frequencyExpConfig2 = (FrequencyExpConfig) c01gw.getValue();
        if (frequencyExpConfig2 != null) {
            z = frequencyExpConfig2.openDefault;
        } else {
            z = false;
        }
        if (z || ((frequencyExpConfig = (FrequencyExpConfig) c01gw.getValue()) != null && (list2 = frequencyExpConfig.allowComponentList) != null && list2.contains(str2))) {
            LIZ.getClass();
            final C808250VnD c808250VnD = (C808250VnD) LJFF.getValue();
            arrayList2.add(new C20654215rw(new InterfaceC20654115rv() { // from class: X.15rr
                @Override // X.InterfaceC20654115rv
                public final String LIZ() {
                    return "cacheChecker";
                }

                @Override // X.InterfaceC20654115rv
                public final Pair<Boolean, RuleHitState> LIZIZ(C20654015ru c20654015ru2) {
                    RuleHitState ruleHitStateLIZ = c808250VnD.LIZ(c20654015ru2.LJFF.LIZ());
                    if (ruleHitStateLIZ != null) {
                        return new Pair<>(Boolean.FALSE, ruleHitStateLIZ);
                    }
                    return new Pair(Boolean.TRUE, null);
                }
            }));
            final IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) LIZIZ.getValue();
            arrayList2.add(new C20654215rw(new InterfaceC20654115rv() { // from class: X.15rq
                @Override // X.InterfaceC20654115rv
                public final String LIZ() {
                    return "frequencyChecker";
                }

                @Override // X.InterfaceC20654115rv
                public final Pair<Boolean, RuleHitState> LIZIZ(C20654015ru c20654015ru2) {
                    RuleHitState ruleHitStateLJFF;
                    IOutreachFrequency iOutreachFrequency2 = iOutreachFrequency;
                    if (iOutreachFrequency2 != null) {
                        ruleHitStateLJFF = iOutreachFrequency2.LJFF(c20654015ru2.LJFF, new OutreachInfo(EnumC20654715s1.FEED_COMPONENT.getTypeName(), c20654015ru2.LIZIZ, null), c20654015ru2.LIZJ, GsonProtectorUtils.toJson(C08JS.LIZIZ(), new FcpComponentOutreachFrequencyExtraInfo(c20654015ru2.LIZ, c20654015ru2.LIZLLL)));
                        if (ruleHitStateLJFF != null && Intrinsics.LJFF(ruleHitStateLJFF.isHit(), Boolean.TRUE)) {
                            return new Pair<>(Boolean.FALSE, ruleHitStateLJFF);
                        }
                    } else {
                        ruleHitStateLJFF = null;
                    }
                    return new Pair<>(Boolean.TRUE, ruleHitStateLJFF);
                }
            }));
        }
        if (((Boolean) C0B6V.LIZ.getValue()).booleanValue()) {
            arrayList2.add(new C20654215rw(new InterfaceC20654115rv() { // from class: X.15rp
                @Override // X.InterfaceC20654115rv
                public final String LIZ() {
                    return "dispersionChecker";
                }

                @Override // X.InterfaceC20654115rv
                public final Pair<Boolean, RuleHitState> LIZIZ(C20654015ru c20654015ru2) throws JSONException {
                    ArrayList arrayList3;
                    C20648315qz.LIZ.getClass();
                    long jLJII = C20648315qz.LJII();
                    if (jLJII == 0) {
                        jLJII = System.currentTimeMillis();
                    }
                    C20647815qu c20647815qu = C20647815qu.LIZ;
                    OutreachRecordData outreachRecordData = new OutreachRecordData(EnumC20654715s1.FEED_COMPONENT.getTypeName(), c20654015ru2.LIZIZ, c20654015ru2.LIZ, c20654015ru2.LIZJ, C20648315qz.LJI(new Date(jLJII)), C20648315qz.LJFF, c20654015ru2.LIZLLL);
                    c20647815qu.getClass();
                    C20648115qx c20648115qxLJ = C20647815qu.LJ(outreachRecordData, false);
                    String strLIZ2 = c20654015ru2.LJFF.LIZ();
                    String str4 = c20654015ru2.LIZIZ;
                    ArrayList<C20648515r1> arrayList4 = c20648115qxLJ.LIZJ;
                    if (arrayList4 != null) {
                        arrayList3 = new ArrayList();
                        Iterator<C20648515r1> it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            String str5 = it2.next().LIZ;
                            if (str5 != null) {
                                arrayList3.add(str5);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                    RuleHitState ruleHitState = new RuleHitState(strLIZ2, str4, Boolean.valueOf(!c20648115qxLJ.LIZ()), arrayList3, "dispersion", System.currentTimeMillis());
                    Boolean boolIsHit = ruleHitState.isHit();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.LJFF(boolIsHit, bool)) {
                        return new Pair<>(Boolean.FALSE, ruleHitState);
                    }
                    return new Pair<>(bool, ruleHitState);
                }
            }));
        }
        new C20673615v4(arrayList2, 0, c20654015ru).LIZ();
        Iterator it2 = ((ConcurrentLinkedDeque) c20654015ru.LJI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            RuleHitState ruleHitState = (RuleHitState) next;
            if (ruleHitState != null && Intrinsics.LJFF(ruleHitState.isHit(), Boolean.TRUE)) {
                obj = next;
                break;
            }
        }
        RuleHitState ruleHitState2 = (RuleHitState) obj;
        if (ruleHitState2 == null) {
            String strLIZ2 = c20654015ru.LJFF.LIZ();
            String str4 = c20654015ru.LIZIZ;
            Deque<RuleHitState> deque = c20654015ru.LJI;
            ArrayList arrayList3 = new ArrayList();
            for (RuleHitState ruleHitState3 : (ConcurrentLinkedDeque) deque) {
                if (ruleHitState3 != null && (list = ruleHitState3.hitRuleIds) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<String> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(it3.next());
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(arrayList, arrayList3);
            }
            ruleHitState2 = new RuleHitState(strLIZ2, str4, Boolean.FALSE, arrayList3, null, System.currentTimeMillis());
        }
        C20654315rx c20654315rx = LJI;
        new AwS2S4100000_11(ruleHitState2, str, strLIZ, str2, str3, 0);
        c20654315rx.getClass();
        String str5 = ruleHitState2.uniqueKey;
        if (str5 != null && str5.length() != 0 && C695930RRn.LIZLLL(ruleHitState2.hitRuleIds)) {
            if (C700340RdY.LIZ(ruleHitState2)) {
                new AwS2S4100000_11(ruleHitState2, str, strLIZ, str2, str3, 1);
                LJ.put(str5, ruleHitState2);
            } else {
                new AwS2S4100000_11(ruleHitState2, str, strLIZ, str2, str3, 2);
                LJFF.getValue().getClass();
                C808250VnD.LIZIZ(str5, ruleHitState2);
                return ruleHitState2;
            }
        }
        return ruleHitState2;
    }

    public static void LIZLLL(String str, String str2, String str3) {
        List<String> list;
        if (str == null || str2 == null) {
            return;
        }
        String strLIZ = C1614340s6y.LIZ();
        C20654315rx c20654315rx = LJI;
        new AwS2S4000000_11(str, strLIZ, str2, str3, 1);
        c20654315rx.getClass();
        String strLIZ2 = new C20653915rt(str, strLIZ, str2).LIZ();
        C01GW c01gw = LJFF;
        RuleHitState ruleHitStateLIZ = ((C808250VnD) c01gw.getValue()).LIZ(strLIZ2);
        List<String> list2 = null;
        if (ruleHitStateLIZ != null) {
            list = ruleHitStateLIZ.hitRuleIds;
        } else {
            list = null;
        }
        if (C695930RRn.LIZLLL(list) && C700340RdY.LIZ(ruleHitStateLIZ)) {
            new AwS2S4100000_11(ruleHitStateLIZ, str, strLIZ, str2, str3, 3);
            return;
        }
        RuleHitState ruleHitStateRemove = LJ.remove(strLIZ2);
        if (ruleHitStateRemove != null) {
            list2 = ruleHitStateRemove.hitRuleIds;
        }
        if (C695930RRn.LIZLLL(list2) && C700340RdY.LIZ(ruleHitStateRemove)) {
            new AwS2S4100000_11(ruleHitStateRemove, str, strLIZ, str2, str3, 4);
            c01gw.getValue().getClass();
            if (C808250VnD.LIZIZ(strLIZ2, ruleHitStateRemove)) {
                IOutreachFrequency iOutreachFrequency = (IOutreachFrequency) LIZIZ.getValue();
                if (iOutreachFrequency != null) {
                    iOutreachFrequency.LIZLLL(new C20653915rt(str, strLIZ, str2), new OutreachInfo(EnumC20654715s1.FEED_COMPONENT.getTypeName(), str2, ""), strLIZ);
                }
                C20647815qu c20647815qu = C20647815qu.LIZ;
                EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.FEED_COMPONENT;
                c20647815qu.getClass();
                C20647815qu.LIZ(enumC20654715s1, str2, str, strLIZ, str3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C20653815rs r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = 0
            r8.getClass()
            if (r9 == 0) goto L4f
            if (r10 == 0) goto L4f
            java.lang.String r5 = X.C1614340s6y.LIZ()
            X.15rx r1 = X.C20653815rs.LJI
            X.0NBL r0 = new X.0NBL
            r0.<init>(r9, r5, r10, r7)
            r1.getClass()
            int r1 = r11.hashCode()
            r0 = 747805177(0x2c9299f9, float:4.166664E-12)
            if (r1 == r0) goto L5b
            r0 = 921111605(0x36e70c35, float:6.8857576E-6)
            if (r1 == r0) goto L50
            r0 = 1544803905(0x5c13d641, float:1.6644958E17)
            if (r1 != r0) goto L2e
            java.lang.String r0 = "default"
        L2b:
            r11.equals(r0)
        L2e:
            java.lang.String r6 = "positive_click"
        L30:
            X.01GW r0 = X.C20653815rs.LIZIZ
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency r2 = (com.ss.android.ugc.aweme.outreach.frequency.IOutreachFrequency) r2
            if (r2 == 0) goto L4f
            X.15rt r3 = new X.15rt
            r3.<init>(r9, r5, r10)
            com.ss.android.ugc.aweme.report.OutreachInfo r4 = new com.ss.android.ugc.aweme.report.OutreachInfo
            X.15s1 r0 = X.EnumC20654715s1.FEED_COMPONENT
            java.lang.String r1 = r0.getTypeName()
            java.lang.String r0 = ""
            r4.<init>(r1, r10, r0)
            r2.LJI(r3, r4, r5, r6, r7)
        L4f:
            return
        L50:
            java.lang.String r0 = "negative"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L2e
            java.lang.String r6 = "negative_click"
            goto L30
        L5b:
            java.lang.String r0 = "positive"
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20653815rs.LIZJ(X.15rs, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
