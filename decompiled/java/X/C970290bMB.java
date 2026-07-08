package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchComponentDisappearCheckDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bMB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970290bMB extends C0K04 {
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static long LJIIL;
    public static long LJIILIIL;
    public static boolean LJIILJJIL;
    public static boolean LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static long LJIJ;
    public static long LJIJI;
    public static long LJIJJ;
    public static int LJIJJLI;
    public static volatile boolean LJIL;
    public static long LJJ;
    public static C11JF LJJI;
    public static final C970290bMB LIZ = new C970290bMB();
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();
    public static final Map<String, String> LIZJ = new LinkedHashMap();
    public static JSONObject LIZLLL = new JSONObject();
    public static final LinkedHashSet<String> LJ = new LinkedHashSet<>();
    public static final LinkedHashSet<String> LJFF = new LinkedHashSet<>();
    public static final LinkedHashSet<EnumC970300bMC> LJI = new LinkedHashSet<>();
    public static final LinkedHashSet<EnumC970300bMC> LJII = new LinkedHashSet<>();
    public static String LJIIJ = "open_message";
    public static String LJIIJJI = "start";

    public static void LJJI() {
        LJIILJJIL = false;
        LJIILLIIL = false;
        LJIIL = 0L;
        LJIIJ = "open_message";
        LJIIJJI = "start";
        LJ.clear();
        LJI.clear();
        LJIJI = 0L;
        LJIJ = 0L;
        LJJII();
    }

    public static void LJJIFFI() {
        LJIILL = false;
        LJIIZILJ = false;
        LJIILIIL = 0L;
        LJIIJ = "open_message";
        LJIIJJI = "start";
        LJFF.clear();
        LJII.clear();
        LIZLLL = new JSONObject();
        LJIJI = 0L;
        LJIJ = 0L;
        LJJII();
    }

    public static void LJJIII() {
        C11JF c11jf;
        LJIL = false;
        LJJ = 0L;
        LJIJJLI = 0;
        LJIJJ = 0L;
        ((LinkedHashMap) LIZJ).clear();
        C11JF c11jf2 = LJJI;
        if (!C500260Jjc.LJJIJIIJIL(c11jf2 != null ? Boolean.valueOf(c11jf2.isDisposed()) : null) && (c11jf = LJJI) != null) {
            c11jf.dispose();
        }
        LJJI = null;
    }

    public static boolean LJIILL() {
        return LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableComponentTrack();
    }

    public static void LJJII() {
        ((LinkedHashMap) LIZIZ).clear();
        ((LinkedHashMap) LIZJ).clear();
        LJIJ = 0L;
        LJJIII();
    }

    public static void LJIIJ(String str) {
        if (LJ.add(str)) {
            LJI.addAll(LJIILIIL(str, true));
        }
    }

    public static void LJIIL(JSONObject jSONObject) {
        C0K04.LJFF("match_stage", LJIIJJI, jSONObject);
        C0K04.LJFF("entry_source", LJIIJ, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(int r15) {
        /*
            boolean r0 = LJIILL()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = X.C970290bMB.LJIIL
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r8 = 0
            r4 = 1
            if (r0 <= 0) goto L98
            long r13 = r5.longValue()
        L1d:
            boolean r0 = X.C970290bMB.LJIILJJIL
            if (r0 == 0) goto L91
            boolean r0 = X.C970290bMB.LJIILLIIL
            if (r0 != 0) goto L91
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L91
            r0 = 3
            if (r15 != r0) goto L31
            java.lang.String r0 = "finish"
            LJIIJ(r0)
        L31:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.util.LinkedHashSet<X.0bMC> r1 = X.C970290bMB.LJI
            java.util.LinkedHashSet<java.lang.String> r0 = X.C970290bMB.LJ
            java.util.Set r0 = LJIILJJIL(r1, r0, r4)
            kotlin.Pair r1 = LJJ(r7, r1, r0)
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r12 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            if (r12 != r11) goto L59
            r8 = 1
        L59:
            long r5 = X.C970290bMB.LJIJ
            r9 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            java.lang.String r3 = "match_contribute_entrance_display_duration"
            if (r0 <= 0) goto L92
            long r1 = X.C970290bMB.LJIJI
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L92
            long r5 = r5 - r1
            X.C0K04.LJ(r3, r5, r7)
        L6d:
            LJIIL(r7)
            java.lang.String r0 = "should_display_count"
            X.C0K04.LIZLLL(r12, r0, r7)
            java.lang.String r0 = "actual_display_count"
            X.C0K04.LIZLLL(r11, r0, r7)
            java.lang.String r0 = "full_display"
            X.C0K04.LIZLLL(r8, r0, r7)
            boolean r3 = X.C970290bMB.LJIIIIZZ
            boolean r2 = X.C970290bMB.LJIIIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.lang.String r0 = "component_identify_result"
            LJJIIJZLJL(r0, r7, r3, r2, r1)
            X.C970290bMB.LJIILLIIL = r4
            LJJI()
        L91:
            return
        L92:
            r0 = 10
            X.C0K04.LIZLLL(r0, r3, r7)
            goto L6d
        L98:
            X.0bSt r0 = X.C973890bRz.LIZ
            long r13 = r0.LJLIIIL()
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C970290bMB.LJIILLIIL(int):void");
    }

    public static void LJIJ(String str) {
        long jLJLIIIL = C973890bRz.LIZ.LJLIIIL();
        String str2 = LJIIJ;
        if (LJIILL()) {
            if (!LJIILJJIL || LJIIL != jLJLIIIL) {
                LJIIZILJ(jLJLIIIL, str2, LJIIIIZZ, LJIIIZ);
            }
            LJIIJ(str);
        }
    }

    public static final void LJIL(long j) {
        if (!LJIILL()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("componentLoadStartTime = ");
        sbLIZ.append(LJIJ);
        sbLIZ.append(" --------22222----loadSuccess = ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("loadTime", C2188811AlT.LIZIZ(sbLIZ));
        if (LJIJ == 0) {
            LJIJ = j;
        }
    }

    public static void LJJIIJ(String str) {
        Boolean boolValueOf;
        LJIJJ = C973890bRz.LIZ.LJLIIIL();
        if (str != null) {
            boolValueOf = Boolean.valueOf(a0.LJJIIZI(str, "list_change", false));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LJIJJLI = 1;
        } else {
            if (str == null || str.length() == 0) {
                return;
            }
            LJIJJLI = -1;
        }
    }

    public static void LJJIIZI(EnumC970300bMC enumC970300bMC) {
        Boolean boolValueOf;
        C11JF c11jf;
        long jLIZ = C158B.LIZ();
        if (LJJ < jLIZ) {
            LJJ = jLIZ;
        }
        LIZJ.put(enumC970300bMC.getScene(), "disappear");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("disappearedReason ======");
        sbLIZ.append(LJIJJLI);
        sbLIZ.append(" and comp = ");
        sbLIZ.append(enumC970300bMC);
        C20441214yg.LJ("disappear", C2188811AlT.LIZIZ(sbLIZ));
        if (LJIJJLI >= 0) {
            LJIJJ = C973890bRz.LIZ.LJLIIIL();
            C11JF c11jf2 = LJJI;
            if (c11jf2 != null) {
                boolValueOf = Boolean.valueOf(c11jf2.isDisposed());
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJIJIIJIL(boolValueOf) && (c11jf = LJJI) != null) {
                c11jf.dispose();
            }
            if (LiveMatchComponentDisappearCheckDurationSetting.INSTANCE.getValue() < 0) {
                LJJIII();
            } else {
                LJJI = (C11JF) C11NZ.LJLJJLL(r1.getValue(), TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0ahs
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("MatchComponentMonitor@38af.updateComponentDisappearStatus$1");
                        C970290bMB c970290bMB = C970290bMB.LIZ;
                        C970290bMB.LJIL = true;
                        C1C7U.LIZIZ("MatchComponentMonitor@38af.updateComponentDisappearStatus$1");
                    }
                }, new C09JN() { // from class: X.0ahr
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("MatchComponentMonitor@38af.updateComponentDisappearStatus$2");
                        C970290bMB c970290bMB = C970290bMB.LIZ;
                        C970290bMB.LJIL = false;
                        C20441214yg.LJII((Throwable) obj);
                        C1C7U.LIZIZ("MatchComponentMonitor@38af.updateComponentDisappearStatus$2");
                    }
                });
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Set LJIILIIL(String str, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        switch (str.hashCode()) {
            case -1274442605:
                if (str.equals("finish") && z) {
                    linkedHashSet.add(EnumC970300bMC.REMATCH_BUTTON);
                    return linkedHashSet;
                }
                return linkedHashSet;
            case -977068843:
                if (str.equals(LiveCenterMockToolSwitch.PUNISH)) {
                    linkedHashSet.add(EnumC970300bMC.MATCH_HEALTH_BAR);
                    linkedHashSet.add(EnumC970300bMC.MATCH_TITLE_BAR);
                    linkedHashSet.add(EnumC970300bMC.CONTRIBUTE_ENTRANCE);
                    linkedHashSet.add(EnumC970300bMC.RESULT_ANIMATION);
                    if (C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_1V1) {
                        linkedHashSet.add(EnumC970300bMC.PERSONAL_SCORE);
                        return linkedHashSet;
                    }
                }
                return linkedHashSet;
            case -905768629:
                if (!str.equals("settle")) {
                    return linkedHashSet;
                }
                break;
            case 109757538:
                if (!str.equals("start")) {
                    return linkedHashSet;
                }
                break;
            default:
                return linkedHashSet;
        }
        linkedHashSet.add(EnumC970300bMC.MATCH_HEALTH_BAR);
        linkedHashSet.add(EnumC970300bMC.MATCH_TITLE_BAR);
        linkedHashSet.add(EnumC970300bMC.CONTRIBUTE_ENTRANCE);
        linkedHashSet.add(EnumC970300bMC.START_ANIMATION);
        if (C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_1V1) {
            linkedHashSet.add(EnumC970300bMC.PERSONAL_SCORE);
            return linkedHashSet;
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJ(int r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C970290bMB.LJIJJ(int, boolean):void");
    }

    public static void LJJIJ(EnumC970300bMC enumC970300bMC, boolean z) {
        if (LJIILL()) {
            LIZIZ.put(enumC970300bMC.getScene(), Boolean.valueOf(z));
        }
    }

    public static void LJIIJJI(JSONObject jSONObject, boolean z, Long l) {
        long jLJLIIIL;
        long jLJLIIIL2;
        Integer numValueOf;
        int i;
        int i2;
        BattleSetting battleSettingLJIILIIL;
        C0K04.LJ("channel_id", C915980Zwa.LJI().LJIIJ().getChannelId(), jSONObject);
        if (l != null) {
            jLJLIIIL = l.longValue();
        } else {
            jLJLIIIL = C973890bRz.LIZ.LJLIIIL();
        }
        C0K04.LJ("battle_id", jLJLIIIL, jSONObject);
        C0K04.LIZLLL(C915980Zwa.LJFF().xB0().getType(), "match_type", jSONObject);
        C0K04.LIZLLL(z ? 1 : 0, "invite_type", jSONObject);
        if (l != null) {
            jLJLIIIL2 = l.longValue();
        } else {
            jLJLIIIL2 = C973890bRz.LIZ.LJLIIIL();
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        int i3 = 0;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (battleSettingLJIILIIL = interfaceC973730bRjYf2.LJIILIIL()) != null) {
            numValueOf = Integer.valueOf(battleSettingLJIILIIL.scene);
        } else {
            numValueOf = null;
        }
        if (C970370bMJ.LJIIIZ() && C915980Zwa.LJFF().xB0() != EnumC919170a1j.MATCH_TYPE_1V1) {
            i = 1;
        } else {
            i = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jLJLIIIL2);
        sbLIZ.append('_');
        sbLIZ.append(currentUserId);
        C0K04.LJFF("distinct_key", C2188811AlT.LIZIZ(sbLIZ), jSONObject);
        if (numValueOf != null && numValueOf.intValue() == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C0K04.LIZLLL(i2, "is_team_pair", jSONObject);
        if (numValueOf != null && numValueOf.intValue() == 2) {
            i3 = 1;
        }
        C0K04.LIZLLL(i3, "is_direct_match", jSONObject);
        C0K04.LIZLLL(i, "is_downgrade_1v1", jSONObject);
    }

    public static Set LJIILJJIL(Set set, Set set2, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (LJIILIIL((String) it2.next(), z).contains(obj)) {
                        linkedHashSet.add(obj);
                        break;
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public static Pair LJJ(JSONObject jSONObject, Set set, Set set2) {
        String str;
        int i = 0;
        for (EnumC970300bMC enumC970300bMC : EnumC970300bMC.values()) {
            if (set.contains(enumC970300bMC) && set2.contains(enumC970300bMC)) {
                if (Intrinsics.LJFF(((LinkedHashMap) LIZIZ).get(enumC970300bMC.getScene()), Boolean.TRUE)) {
                    i++;
                    str = "display_success";
                } else {
                    str = "display_failed";
                }
            } else {
                str = "not_eligible";
            }
            C0K04.LJFF(enumC970300bMC.getScene(), str, jSONObject);
        }
        return new Pair(Integer.valueOf(set2.size()), Integer.valueOf(i));
    }

    public static void LJIIZILJ(long j, String str, boolean z, boolean z2) {
        if (!LJIILL()) {
            return;
        }
        if (z2 && LJIILJJIL && !LJIILLIIL) {
            LJIILLIIL(2);
        }
        LJIIIIZZ = z;
        LJIIIZ = z2;
        if (!LJIILJJIL || LJIIL != j) {
            LJJI();
            LJIILJJIL = true;
            LJIILLIIL = false;
            LJIIL = j;
            LJIIJ = str;
            LJIIJJI = "start";
            LJIJI = C158B.LIZ();
            JSONObject jSONObject = new JSONObject();
            C0K04.LJ("component_load_start_time", LJIJI, jSONObject);
            LJIIL(jSONObject);
            LJJIIJZLJL("component_identify_start", jSONObject, z, z2, Long.valueOf(j));
            LJJII();
        }
        LJIIJ("start");
    }

    public static void LJJIIZ(String str, JSONObject jSONObject, boolean z, boolean z2) {
        C0K04.LJFF("event_id", str, jSONObject);
        C0K04.LIZLLL(C915980Zwa.LJII().LLI().getValue(), "cohost_status", LIZLLL);
        LJIIJJI(jSONObject, z2, null);
        if (C1078990eBV.LIZ("ttlive_client_audience_match_component_monitor", str)) {
            C1CC2.LJI("ttlive_client_audience_match_component_monitor", new JSONObject(), null, jSONObject);
            C962910bAH.LIZJ(str, jSONObject, null, null, true, 1, true);
        }
    }

    public final void LJIJI(String str, String str2, boolean z, boolean z2) {
        if (!LJIILL()) {
            LJJIFFI();
            return;
        }
        long jLJLIIIL = C973890bRz.LIZ.LJLIIIL();
        if (z2 && LJIILL && !LJIIZILJ) {
            getClass();
            LJIJJ(1, false);
        }
        LJIIIIZZ = z;
        LJIIIZ = z2;
        if (!LJIILL || (jLJLIIIL > 0 && LJIILIIL != jLJLIIIL)) {
            LJJIFFI();
            LJIILL = true;
            LJIIZILJ = false;
            LJIILIIL = jLJLIIIL;
            LJIIJ = str;
            LJIIJJI = str2;
            LJIJI = C158B.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("componentLoadStartTime = ");
            sbLIZ.append(LJIJI);
            sbLIZ.append(" --------111111");
            C20441214yg.LIZIZ("loadTime", C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            C0K04.LJ("component_load_start_time", LJIJI, jSONObject);
            C0K04.LJFF("identify_scene", str, jSONObject);
            LJIIL(jSONObject);
            LIZLLL = jSONObject;
            LJJIIZ("component_identify_start", new JSONObject(C786410Ut5.J3(LIZLLL)), z, z2);
        }
        if (LJFF.add(str2)) {
            LJII.addAll(LJIILIIL(str2, false));
        }
    }

    public static void LJJIIJZLJL(String str, JSONObject jSONObject, boolean z, boolean z2, Long l) {
        LJIIJJI(jSONObject, z2, l);
        C0K04.LJFF("event_id", str, jSONObject);
        if (C1078990eBV.LIZ("ttlive_client_anchor_match_component_monitor", str)) {
            C1CC2.LJI("ttlive_client_anchor_match_component_monitor", new JSONObject(), null, jSONObject);
            C962910bAH.LIZJ(str, jSONObject, null, null, true, 1, true);
        }
    }
}
