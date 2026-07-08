package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.ValidRule;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zWF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1899090zWF implements InterfaceC1899310zWb {
    public final TaskEvent LL;
    public boolean LLILLJJLI;
    public C1899080zWE LLILLL;
    public final List<AbstractC1898880zVu> LLILZ = new ArrayList();
    public final List<AbstractC1898880zVu> LLILZIL = new ArrayList();
    public BaseTaskEventTimerPendantManager LLILZLL;

    public void LJI() {
    }

    public void LJII() {
    }

    public boolean LJIIIZ() {
        return true;
    }

    public void LJIIJ() {
    }

    public void LJIIJJI() {
    }

    public void LJIIL(String str, String str2) {
    }

    public void LJIILJJIL() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public AbstractC1899090zWF(TaskEvent taskEvent) {
        ArrayList<ValidRule> arrayList;
        final String str;
        this.LL = taskEvent;
        List<ValidRule> list = taskEvent.validRules;
        if (list != null && !list.isEmpty()) {
            for (final ValidRule validRule : list) {
                String str2 = validRule.ruleType;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1948509198:
                            if (str2.equals("valid_video_types")) {
                                ((ArrayList) this.LLILZ).add(new AbstractC1898880zVu(validRule) { // from class: X.0zWG
                                    public final List<Integer> LIZ = new ArrayList();

                                    {
                                        Object c098200Yq;
                                        String str3 = validRule.ruleMeta;
                                        if (str3 != null) {
                                            try {
                                                c098200Yq = (Integer[]) C20484080s.LIZ(str3, Integer[].class);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            C19719612Di.LJJII(this.LIZ, (Object[]) (C189200o6.m7isFailureimpl(c098200Yq) ? new Integer[0] : c098200Yq));
                                        }
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        if (((ArrayList) this.LIZ).isEmpty()) {
                                            return true;
                                        }
                                        C1896890zSh c1896890zSh = (C1896890zSh) C1619720sFe.LIZ.LIZ(1);
                                        if (c1896890zSh != null && c1896890zSh.LJIIIIZZ()) {
                                            return false;
                                        }
                                        return ((ArrayList) this.LIZ).contains(Integer.valueOf(c1896810zSZ.LIZJ));
                                    }
                                });
                            }
                            break;
                        case -970529044:
                            if (str2.equals("valid_page_types")) {
                                ((ArrayList) this.LLILZ).add(new AbstractC1898880zVu(validRule) { // from class: X.0zWH
                                    public final List<String> LIZ = new ArrayList();

                                    {
                                        Object c098200Yq;
                                        String str3 = validRule.ruleMeta;
                                        if (str3 != null) {
                                            try {
                                                c098200Yq = (String[]) C20484080s.LIZ(str3, String[].class);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            C19719612Di.LJJII(this.LIZ, (Object[]) (C189200o6.m7isFailureimpl(c098200Yq) ? new String[0] : c098200Yq));
                                        }
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        if (((ArrayList) this.LIZ).isEmpty()) {
                                            return true;
                                        }
                                        return ((ArrayList) this.LIZ).contains(c1896810zSZ.LIZ);
                                    }
                                });
                            }
                            break;
                        case -715316811:
                            if (str2.equals("valid_operation_type")) {
                                ((ArrayList) this.LLILZ).add(new AbstractC1898880zVu(validRule) { // from class: X.0zWZ
                                    public final ValidRule LIZ;

                                    {
                                        this.LIZ = validRule;
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        return Intrinsics.LJFF(c1896810zSZ.LJIIIIZZ, this.LIZ.ruleMeta);
                                    }
                                });
                            }
                            break;
                        case -537705768:
                            if (str2.equals("is_ads_valid")) {
                                ((ArrayList) this.LLILZ).add(new AbstractC1898880zVu(validRule) { // from class: X.0zWW
                                    public final boolean LIZ;

                                    {
                                        this.LIZ = Intrinsics.LJFF(validRule.ruleMeta, "true");
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        if (c1896810zSZ.LIZIZ && !this.LIZ) {
                                            return false;
                                        }
                                        return true;
                                    }
                                });
                            }
                            break;
                        case -535511095:
                            if (str2.equals("is_repeat_video_valid")) {
                                ((ArrayList) this.LLILZ).add(new AbstractC1898880zVu(validRule) { // from class: X.0zWX
                                    public final boolean LIZ;

                                    {
                                        this.LIZ = Intrinsics.LJFF(validRule.ruleMeta, "true");
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        if (c1896810zSZ.LIZLLL && !this.LIZ) {
                                            return false;
                                        }
                                        return true;
                                    }
                                });
                            }
                            break;
                        case -413211535:
                            if (str2.equals("valid_video_ids")) {
                                ((ArrayList) this.LLILZ).add(new AbstractC1898880zVu(validRule) { // from class: X.0zWJ
                                    public final List<String> LIZ = new ArrayList();

                                    {
                                        Object c098200Yq;
                                        String str3 = validRule.ruleMeta;
                                        if (str3 != null) {
                                            try {
                                                c098200Yq = (String[]) C20484080s.LIZ(str3, String[].class);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            C19719612Di.LJJII(this.LIZ, (Object[]) (C189200o6.m7isFailureimpl(c098200Yq) ? new String[0] : c098200Yq));
                                        }
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        return ((ArrayList) this.LIZ).contains(c1896810zSZ.LJIIJ);
                                    }
                                });
                            }
                            break;
                        case 296628480:
                            if (str2.equals("task_event_key") && (str = validRule.ruleMeta) != null && str.length() != 0) {
                                ((ArrayList) this.LLILZ).add(new AbstractC1898880zVu(str) { // from class: X.0zWc
                                    public final String LIZ;

                                    {
                                        this.LIZ = str;
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        return Intrinsics.LJFF(c1896810zSZ.LJ, this.LIZ);
                                    }
                                });
                            }
                            break;
                        case 785887527:
                            if (str2.equals("valid_user_ids")) {
                                ((ArrayList) this.LLILZ).add(new AbstractC1898880zVu(validRule) { // from class: X.0zWI
                                    public final List<String> LIZ = new ArrayList();

                                    {
                                        Object c098200Yq;
                                        String str3 = validRule.ruleMeta;
                                        if (str3 != null) {
                                            try {
                                                c098200Yq = (String[]) C20484080s.LIZ(str3, String[].class);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            C19719612Di.LJJII(this.LIZ, (Object[]) (C189200o6.m7isFailureimpl(c098200Yq) ? new String[0] : c098200Yq));
                                        }
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        return ((ArrayList) this.LIZ).contains(c1896810zSZ.LJIIJJI);
                                    }
                                });
                            }
                            break;
                        case 1845081881:
                            if (str2.equals("task_event_key_type")) {
                                ((ArrayList) this.LLILZ).add(new AbstractC1898880zVu(validRule) { // from class: X.0zWS
                                    public final boolean LIZ;

                                    {
                                        String str3 = validRule.ruleMeta;
                                        if (str3 != null) {
                                            this.LIZ = Boolean.parseBoolean(str3);
                                        }
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        if (!this.LIZ) {
                                            return true;
                                        }
                                        return Intrinsics.LJFF(c1896810zSZ.LJ, c1896810zSZ.LJFF);
                                    }
                                });
                            }
                            break;
                    }
                }
            }
        }
        List<ValidRule> list2 = this.LL.validRuleSeconds;
        if (list2 != null) {
            arrayList = new ArrayList(list2);
        } else {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty()) {
            Collection collection = this.LL.validRules;
            arrayList.addAll(collection == null ? new ArrayList() : collection);
        }
        if (!arrayList.isEmpty()) {
            for (final ValidRule validRule2 : arrayList) {
                String str3 = validRule2.ruleType;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1286577015:
                            if (str3.equals("video_report_length_limit")) {
                                ((ArrayList) this.LLILZIL).add(new AbstractC1898880zVu() { // from class: X.0zVs
                                    @Override // X.AbstractC1898880zVu
                                    public final String LIZLLL() {
                                        return "tick";
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        C1896510zS5 c1896510zS5;
                                        int i = c1896810zSZ.LIZJ;
                                        if (i == 101 || i == 150 || (c1896510zS5 = (C1896510zS5) C1619720sFe.LIZ.LIZ(11)) == null || !c1896510zS5.LIZLLL() || c1896810zSZ.LJIIIZ < c1896810zSZ.LJII) {
                                            return true;
                                        }
                                        return false;
                                    }
                                });
                            }
                            break;
                        case -1148965452:
                            if (str3.equals("watch_single_video_time_limit")) {
                                ((ArrayList) this.LLILZIL).add(new AbstractC1898880zVu(validRule2) { // from class: X.0zWT
                                    public final int LIZ;

                                    @Override // X.AbstractC1898880zVu
                                    public final String LIZJ() {
                                        return "watch_single_video_time_limit";
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final String LIZLLL() {
                                        return "tick";
                                    }

                                    {
                                        int iIntValue;
                                        Integer numLJIIJJI;
                                        String str4 = validRule2.ruleMeta;
                                        if (str4 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str4)) != null) {
                                            iIntValue = numLJIIJJI.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        this.LIZ = iIntValue;
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        int i = this.LIZ;
                                        if (i <= 0 || c1896810zSZ.LJIIIZ < ((long) i) * 1000) {
                                            return true;
                                        }
                                        return false;
                                    }
                                });
                            }
                            break;
                        case -965567587:
                            if (str3.equals("watch_single_photo_time_limit")) {
                                ((ArrayList) this.LLILZIL).add(new AbstractC1898880zVu(validRule2) { // from class: X.0zWP
                                    public final int LIZ;

                                    @Override // X.AbstractC1898880zVu
                                    public final String LIZLLL() {
                                        return "tick";
                                    }

                                    {
                                        int i;
                                        String str4 = validRule2.ruleMeta;
                                        if (str4 != null) {
                                            i = CastIntegerProtector.parseInt(str4);
                                        } else {
                                            i = 0;
                                        }
                                        this.LIZ = i;
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        if (c1896810zSZ.LIZJ != 150) {
                                            return true;
                                        }
                                        if (((Number) C0A48.LIZ.getValue()).intValue() == 1 && c1896810zSZ.LJIIIZ < this.LIZ * LSPassThroughRecordSizeConfig.DEFAULT) {
                                            return true;
                                        }
                                        return false;
                                    }
                                });
                            }
                            break;
                        case -421824395:
                            if (str3.equals("watch_single_live_time_limit")) {
                                ((ArrayList) this.LLILZIL).add(new AbstractC1898880zVu(validRule2) { // from class: X.0zWR
                                    public final int LIZ;

                                    @Override // X.AbstractC1898880zVu
                                    public final String LIZLLL() {
                                        return "tick";
                                    }

                                    {
                                        int i;
                                        String str4 = validRule2.ruleMeta;
                                        if (str4 != null) {
                                            i = CastIntegerProtector.parseInt(str4);
                                        } else {
                                            i = 0;
                                        }
                                        this.LIZ = i;
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        if (c1896810zSZ.LIZJ != 101) {
                                            return true;
                                        }
                                        C301960BsY.LIZ.getClass();
                                        if (C301960BsY.LIZ() && c1896810zSZ.LJIIIZ < this.LIZ * LSPassThroughRecordSizeConfig.DEFAULT) {
                                            return true;
                                        }
                                        return false;
                                    }
                                });
                            }
                            break;
                        case 354744414:
                            if (str3.equals("cheat_block_valid")) {
                                ((ArrayList) this.LLILZIL).add(new AbstractC1898880zVu(validRule2) { // from class: X.0zWa
                                    public final String LIZ;

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        return true;
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final String LIZJ() {
                                        return "cheat_block_valid";
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final String LIZIZ() {
                                        return this.LIZ;
                                    }

                                    {
                                        this.LIZ = "";
                                        String str4 = validRule2.ruleMeta;
                                        this.LIZ = str4 != null ? str4 : "";
                                    }
                                });
                            }
                            break;
                        case 1826067686:
                            if (str3.equals("auto_play_status_report")) {
                                ((ArrayList) this.LLILZIL).add(new AbstractC1898880zVu(validRule2) { // from class: X.0zWL
                                    public final boolean LIZ;

                                    @Override // X.AbstractC1898880zVu
                                    public final String LIZJ() {
                                        return "auto_display_status_report";
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final String LIZLLL() {
                                        return "tick";
                                    }

                                    {
                                        boolean z;
                                        String str4 = validRule2.ruleMeta;
                                        if (str4 != null) {
                                            z = Boolean.parseBoolean(str4);
                                        } else {
                                            z = false;
                                        }
                                        this.LIZ = z;
                                    }

                                    @Override // X.AbstractC1898880zVu
                                    public final boolean LIZ(C1896810zSZ c1896810zSZ) {
                                        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
                                        if (abstractC1896090zRP != null && abstractC1896090zRP.LJJIIZ()) {
                                            C1898890zVv.LIZIZ++;
                                        }
                                        return this.LIZ;
                                    }
                                });
                            }
                            break;
                    }
                }
            }
        }
    }

    public void LJIILIIL(InterfaceC1898470zVF<TaskEvent> interfaceC1898470zVF) {
        C01U6.LIZIZ(new AwS429S0200000_28(this, (AbstractC1899090zWF) interfaceC1898470zVF, (InterfaceC1898470zVF<TaskEvent>) 71));
    }
}
