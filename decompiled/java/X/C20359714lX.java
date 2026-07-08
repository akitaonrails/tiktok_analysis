package X;

import Y.ARunnableS131S0100000_31;
import Y.ARunnableS6S0111000_31;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings.GroupSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings.PlaybookAutoRotationTimeConfig;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.settings.PlaybookEditorRuleGroupSetting;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.android.livesdk.condition.ConditionData;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookDecorationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookDecorationTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookEditorTestToolkitSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS3S0420000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS81S0301000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14lX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20359714lX extends AbstractC20358714lN {
    public static final /* synthetic */ int LJIL = 0;
    public final InterfaceC20356214ky LJ;
    public final InterfaceC20354714kj LJFF;
    public final InterfaceC20360214lc LJI;
    public final InterfaceC20359614lW LJII;
    public final InterfaceC20360014la LJIIIIZZ;
    public int LJIIIZ;
    public final HashSet<AbstractC20356314kz> LJIIJ;
    public final C20359814lY LJIIJJI;
    public C20379114of LJIIL;
    public C20379114of LJIILIIL;
    public C20360614lg LJIILJJIL;
    public Playbook LJIILL;
    public int LJIILLIIL;
    public long LJIIZILJ;
    public ARunnableS6S0111000_31 LJIJ;
    public ARunnableS131S0100000_31 LJIJI;
    public InterfaceC20360014la LJIJJ;
    public boolean LJIJJLI;

    @Override // X.AbstractC20358714lN
    public final InterfaceC20357214l8 LIZLLL() {
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(this.LIZ);
        if (playbookAnchorServiceV2LIZIZ != null) {
            return playbookAnchorServiceV2LIZIZ.LLJJJJ;
        }
        return null;
    }

    public final void LJI() {
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        C20359414lU c20359414lU;
        if (PlaybookUtilKt.LJIL(this.LJIIL)) {
            C20379114of c20379114of = this.LJIIL;
            if (c20379114of != null && (c20360614lg = c20379114of.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null && (c20359414lU = (C20359414lU) C13LP.LJJJLZIJ(0, list)) != null) {
                c20359414lU.LJII = EnumC1779020wOa.IDLE;
                Iterator<C20361214lm> it2 = c20359414lU.LIZJ.iterator();
                while (it2.hasNext()) {
                    PlayRule playRule = it2.next().LIZLLL;
                    if (playRule != null) {
                        playRule.LJJII();
                    }
                }
            }
            ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LJIJI;
            if (aRunnableS131S0100000_31 != null) {
                C473410IhP.LIZ().removeCallbacks(aRunnableS131S0100000_31);
                this.LJIJI = null;
            }
            this.LJIIL = null;
        }
    }

    public final void LJIIIIZZ() {
        List<C20359414lU> list;
        C20360614lg c20360614lg = this.LJIILJJIL;
        if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            while (it2.hasNext()) {
                for (C20361214lm c20361214lm : it2.next().LIZJ) {
                    PlayRule playRule = c20361214lm.LIZLLL;
                    if (playRule != null) {
                        playRule.LJIIJ();
                    }
                    PlayRule playRule2 = c20361214lm.LIZLLL;
                    if (playRule2 != null) {
                        playRule2.LJIL();
                    }
                }
            }
        }
        ARunnableS6S0111000_31 aRunnableS6S0111000_31 = this.LJIJ;
        if (aRunnableS6S0111000_31 != null) {
            C473410IhP.LIZ().removeCallbacks(aRunnableS6S0111000_31);
            this.LJIJ = null;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(this, 1349));
        this.LJIILLIIL = 0;
        this.LJIIZILJ = -1L;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILIIL = null;
        if (this.LJIJJLI) {
            this.LJIJJLI = false;
        }
        this.LJIJJ = null;
    }

    @Override // X.AbstractC20358714lN
    public final void LIZ(PlayRule playRule) {
        InterfaceC20356214ky interfaceC20356214ky = this.LJ;
        if (interfaceC20356214ky != null) {
            playRule.LJJIIJZLJL(interfaceC20356214ky);
        }
        InterfaceC20354714kj interfaceC20354714kj = this.LJFF;
        if (interfaceC20354714kj != null) {
            playRule.LJII(interfaceC20354714kj);
        }
        playRule.LJJIFFI(this.LJIIJJI);
    }

    public final void LJFF(C20379114of c20379114of) {
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        C20359414lU c20359414lU;
        PlayRule playRule;
        if (!PlaybookUtilKt.LJIL(c20379114of)) {
            C20441214yg.LJ("PlaybookDecoration", "not decoration playbook");
            InterfaceC20360014la interfaceC20360014la = this.LJIJJ;
            if (interfaceC20360014la != null) {
                interfaceC20360014la.LIZ("not decoration playbook");
            }
            InterfaceC20360014la interfaceC20360014la2 = this.LJIIIIZZ;
            if (interfaceC20360014la2 != null) {
                interfaceC20360014la2.LIZ("not decoration playbook");
                return;
            }
            return;
        }
        this.LJIIL = c20379114of;
        if (c20379114of != null && (c20360614lg = c20379114of.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null && (c20359414lU = (C20359414lU) C13LP.LJJJLZIJ(0, list)) != null) {
            for (C20361214lm c20361214lm : c20359414lU.LIZJ) {
                if (!PlayEntityUtilKt.LJIIJ(c20361214lm.LIZ) && (playRule = c20361214lm.LIZLLL) != null) {
                    playRule.LJIJ();
                }
            }
            c20359414lU.LJII = EnumC1779020wOa.RUNNING;
            InterfaceC20360014la interfaceC20360014la3 = this.LJIJJ;
            if (interfaceC20360014la3 != null) {
                interfaceC20360014la3.LJ();
            }
            InterfaceC20360014la interfaceC20360014la4 = this.LJIIIIZZ;
            if (interfaceC20360014la4 != null) {
                interfaceC20360014la4.LJ();
            }
            LJII(c20379114of, c20359414lU, 0);
            return;
        }
        InterfaceC20360014la interfaceC20360014la5 = this.LJIJJ;
        if (interfaceC20360014la5 != null) {
            interfaceC20360014la5.LIZ("decorationStep is null");
        }
        InterfaceC20360014la interfaceC20360014la6 = this.LJIIIIZZ;
        if (interfaceC20360014la6 != null) {
            interfaceC20360014la6.LIZ("decorationStep is null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LinkedHashMap<String, List<C20361214lm>> LJIIIZ(String str) {
        Collection collection;
        PlayRule playRule;
        PlayRule playRule2;
        LinkedHashMap<String, List<C20361214lm>> linkedHashMap = new LinkedHashMap<>();
        List<String> list = PlaybookEditorRuleGroupSetting.INSTANCE.getSettingValue().groups;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            InterfaceC20355814ku.LJIJI.getClass();
            if (C20355714kt.LIZIZ.contains(str2)) {
                arrayList.add(str2);
            }
        }
        for (Object obj : arrayList) {
            GroupSetting groupSetting = PlaybookEditorRuleGroupSetting.INSTANCE.getSettingValue().map.get(obj);
            if (groupSetting != null && (true ^ groupSetting.list.isEmpty())) {
                List<String> list2 = groupSetting.list;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(LJIIJ(it2.next(), str));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    C20361214lm c20361214lm = (C20361214lm) obj2;
                    if (c20361214lm != null && (playRule2 = c20361214lm.LIZLLL) != null && C20374514nv.LJII(playRule2)) {
                        arrayList3.add(obj2);
                    }
                }
                linkedHashMap.put(obj, arrayList3);
            }
        }
        if (MultiGuestPlaybookEditorTestToolkitSetting.INSTANCE.enable()) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(LJIIJ("test_liveshow_new_version", str));
            arrayList4.add(LJIIJ("test_unknown", str));
            linkedHashMap.put("test", arrayList4);
        }
        if (C952600ate.LIZ && (collection = (Collection) linkedHashMap.get("Interact")) != null) {
            ArrayList arrayList5 = new ArrayList(collection);
            C20361214lm c20361214lmLJIIJ = LJIIJ("topic", str);
            if (c20361214lmLJIIJ != null && (playRule = c20361214lmLJIIJ.LIZLLL) != null && C20374514nv.LJII(playRule)) {
                ListProtector.add(arrayList5, 0, c20361214lmLJIIJ);
            }
            linkedHashMap.put("Interact", arrayList5);
        }
        return linkedHashMap;
    }

    public final C20361214lm LJIIJ(String str, String str2) {
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        PlayRule playRuleLIZIZ = LIZIZ(-1L, str, "editor", C978360bZC.LJFF().LIZ);
        if (playRuleLIZIZ == null) {
            return null;
        }
        return new C20361214lm(playRuleLIZIZ.getConfig().LIZ, (String) null, -1L, playRuleLIZIZ.LIZLLL(new C20424814w2(-1L, false, playRuleLIZIZ.getConfig().LIZ, "", new ArrayList(), playRuleLIZIZ.getConfig().LIZIZ, playRuleLIZIZ.getConfig().LIZJ, "", ""), str2), playRuleLIZIZ);
    }

    public final void LJIILJJIL(final int i, final boolean z) {
        long j;
        Boolean boolValueOf;
        List<C20359414lU> list;
        C20359414lU c20359414lU;
        C20357914lF config;
        EnumC20429514wn enumC20429514wn;
        EnumC20429514wn enumC20429514wn2;
        boolean z2;
        C20357914lF config2;
        EnumC20429514wn enumC20429514wn3;
        boolean z3;
        C20357914lF config3;
        ARunnableS6S0111000_31 aRunnableS6S0111000_31 = this.LJIJ;
        if (aRunnableS6S0111000_31 != null) {
            C473410IhP.LIZ().removeCallbacks(aRunnableS6S0111000_31);
            this.LJIJ = null;
        }
        C20379114of c20379114of = this.LJIILIIL;
        if (c20379114of == null) {
            return;
        }
        final C20360614lg c20360614lg = this.LJIILJJIL;
        if (c20360614lg != null) {
            int i2 = i + 1;
            if (c20360614lg.LIZIZ.size() < i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("stepList.size < stepIndex + 1, stepList.size: ");
                sbLIZ.append(c20360614lg.LIZIZ.size());
                sbLIZ.append(", stepIndex + 1: ");
                sbLIZ.append(i2);
                C20441214yg.LJ("PlaybookDirector", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            this.LJIILLIIL = i;
            C20361214lm c20361214lm = (C20361214lm) C13LP.LJJJLZIJ(0, ((C20359414lU) ListProtector.get(c20360614lg.LIZIZ, i)).LIZJ);
            if (c20361214lm != null) {
                j = c20361214lm.LIZIZ;
            } else {
                j = -1;
            }
            this.LJIIZILJ = j;
            InterfaceC20359614lW interfaceC20359614lW = this.LJII;
            if (interfaceC20359614lW != null) {
                interfaceC20359614lW.LIZ(i, j, c20360614lg.LIZIZ);
            }
            if (((C20359414lU) ListProtector.get(c20360614lg.LIZIZ, i)).LJI && this.LJIJJLI && MultiGuestPlaybookDecorationSetting.INSTANCE.enable()) {
                if (!z) {
                    C766270U4b.LIZLLL(2131854665);
                }
                InterfaceC20360014la interfaceC20360014la = new InterfaceC20360014la() { // from class: X.14lV
                    @Override // X.InterfaceC20360014la
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC20360014la
                    public final void LIZ(String str) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoRun, onDecorationFail, reason=");
                        sbLIZ2.append(str);
                        C20441214yg.LJ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    @Override // X.InterfaceC20360014la
                    public final void LIZIZ(C20359414lU c20359414lU2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoRun, onDecorationStepUndoStart, decorationState=");
                        sbLIZ2.append(c20359414lU2.LJII);
                        C20441214yg.LIZIZ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LIZ.LJIIJJI(i, "decoration_undo_start", z, false);
                    }

                    @Override // X.InterfaceC20360014la
                    public final void LIZLLL(C20359414lU c20359414lU2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoRun, onDecorationStepUndoFinish, decorationState=");
                        sbLIZ2.append(c20359414lU2.LJII);
                        C20441214yg.LIZIZ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    @Override // X.InterfaceC20360014la
                    public final void LJFF(C20361214lm c20361214lm2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoRun, onDecorationEntityStart, name=");
                        sbLIZ2.append(c20361214lm2.LIZ);
                        C20441214yg.LIZIZ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ2));
                        PlayRule playRule = c20361214lm2.LIZLLL;
                        if (playRule != null) {
                            C20359714lX c20359714lX = this.LIZ;
                            playRule.LJIIZILJ(c20361214lm2, c20359714lX.LJIJJLI, false, new AwS81S0301000_31(c20359714lX, c20361214lm2, c20360614lg, i, 1));
                        }
                    }

                    @Override // X.InterfaceC20360014la
                    public final void LJI(C20359414lU c20359414lU2) {
                        List<Condition> list2;
                        String str;
                        EnumC20429514wn enumC20429514wn4;
                        C20357914lF config4;
                        EnumC20429514wn enumC20429514wn5;
                        C20357914lF config5;
                        List<Condition> list3;
                        List<Condition> list4;
                        Condition condition;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoRun, onDecorationStepSuccess, decorationState=");
                        sbLIZ2.append(c20359414lU2.LJII);
                        C20441214yg.LIZIZ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LIZ.LJIJJ = null;
                        ConditionData conditionDataLIZ = C20356614l2.LIZ(c20359414lU2.LJ);
                        if (conditionDataLIZ != null) {
                            list2 = conditionDataLIZ.conditions;
                        } else {
                            list2 = null;
                        }
                        if (list2 == null || (list3 = conditionDataLIZ.conditions) == null || list3.isEmpty() || (list4 = conditionDataLIZ.conditions) == null || (condition = (Condition) ListProtector.get(list4, 0)) == null || (str = condition.name) == null) {
                            str = "";
                        }
                        if (Intrinsics.LJFF(str, "all_decoration_succeeded")) {
                            List<C20361214lm> list5 = c20359414lU2.LIZJ;
                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                Iterator<C20361214lm> it2 = list5.iterator();
                                while (it2.hasNext()) {
                                    PlayRule playRule = it2.next().LIZLLL;
                                    if (playRule != null && (config5 = playRule.getConfig()) != null) {
                                        enumC20429514wn5 = config5.LJII;
                                    } else {
                                        enumC20429514wn5 = null;
                                    }
                                    if (enumC20429514wn5 != EnumC20429514wn.SUCCESS) {
                                        return;
                                    }
                                }
                            }
                            this.LIZ.LJIIJJI(i, "decoration_finish", z, false);
                            return;
                        }
                        if (!Intrinsics.LJFF(str, "partial_decoration_succeeded")) {
                            return;
                        }
                        List<C20361214lm> list6 = c20359414lU2.LIZJ;
                        if ((list6 instanceof Collection) && list6.isEmpty()) {
                            return;
                        }
                        Iterator<C20361214lm> it3 = list6.iterator();
                        while (it3.hasNext()) {
                            PlayRule playRule2 = it3.next().LIZLLL;
                            if (playRule2 != null && (config4 = playRule2.getConfig()) != null) {
                                enumC20429514wn4 = config4.LJII;
                            } else {
                                enumC20429514wn4 = null;
                            }
                            if (enumC20429514wn4 == EnumC20429514wn.SUCCESS) {
                                this.LIZ.LJIIJJI(i, "decoration_finish", z, false);
                                return;
                            }
                        }
                    }

                    @Override // X.InterfaceC20360014la
                    public final void LIZJ(C20361214lm c20361214lm2, boolean z4) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("autoRun, onDecorationEntityFinish, name=");
                        sbLIZ2.append(c20361214lm2.LIZ);
                        sbLIZ2.append(", isSuccess=");
                        sbLIZ2.append(z4);
                        C20441214yg.LIZIZ("PlaybookDecoration", C2188811AlT.LIZIZ(sbLIZ2));
                        PlayRule playRule = c20361214lm2.LIZLLL;
                        if (playRule != null) {
                            playRule.LJJIJ();
                        }
                        List<C20361214lm> list2 = ((C20359414lU) ListProtector.get(c20360614lg.LIZIZ, i)).LIZJ;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<C20361214lm> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(it2.next().LIZIZ));
                        }
                        this.LIZ.LJIILL(i, arrayList.indexOf(Long.valueOf(c20361214lm2.LIZIZ)), "decoration");
                    }
                };
                this.LJIJJ = interfaceC20360014la;
                C20360614lg c20360614lg2 = c20379114of.LIZIZ;
                if (c20360614lg2 != null && (list = c20360614lg2.LIZIZ) != null && (c20359414lU = (C20359414lU) C13LP.LJJJLZIJ(0, list)) != null) {
                    EnumC1779020wOa enumC1779020wOa = c20359414lU.LJII;
                    if (enumC1779020wOa != EnumC1779020wOa.RUNNING && enumC1779020wOa != EnumC1779020wOa.SUCCESS) {
                        if (enumC1779020wOa == EnumC1779020wOa.UNDOING) {
                            for (C20361214lm c20361214lm2 : c20359414lU.LIZJ) {
                                interfaceC20360014la.LJFF(c20361214lm2);
                                PlayRule playRule = c20361214lm2.LIZLLL;
                                if (playRule != null && (config3 = playRule.getConfig()) != null) {
                                    enumC20429514wn3 = config3.LJII;
                                } else {
                                    enumC20429514wn3 = null;
                                }
                                if (enumC20429514wn3 == EnumC20429514wn.SUCCESS) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                interfaceC20360014la.LIZJ(c20361214lm2, z3);
                            }
                            interfaceC20360014la.LIZIZ(c20359414lU);
                            return;
                        }
                        LJFF(c20379114of);
                        return;
                    }
                    for (C20361214lm c20361214lm3 : c20359414lU.LIZJ) {
                        PlayRule playRule2 = c20361214lm3.LIZLLL;
                        if (playRule2 != null && (config = playRule2.getConfig()) != null && (enumC20429514wn = config.LJII) != null) {
                            int i3 = C20357014l6.LIZ[enumC20429514wn.ordinal()];
                            if (i3 != 1) {
                                if (i3 == 2 || i3 == 3) {
                                    interfaceC20360014la.LJFF(c20361214lm3);
                                    PlayRule playRule3 = c20361214lm3.LIZLLL;
                                    if (playRule3 != null && (config2 = playRule3.getConfig()) != null) {
                                        enumC20429514wn2 = config2.LJII;
                                    } else {
                                        enumC20429514wn2 = null;
                                    }
                                    if (enumC20429514wn2 == EnumC20429514wn.SUCCESS) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    interfaceC20360014la.LIZJ(c20361214lm3, z2);
                                }
                            } else {
                                interfaceC20360014la.LJFF(c20361214lm3);
                            }
                        }
                    }
                    if (c20359414lU.LJII == EnumC1779020wOa.SUCCESS) {
                        interfaceC20360014la.LJI(c20359414lU);
                        return;
                    }
                    return;
                }
                interfaceC20360014la.LIZ("playbookStep is null");
                return;
            }
            for (C20361214lm c20361214lm4 : ((C20359414lU) ListProtector.get(c20360614lg.LIZIZ, i)).LIZJ) {
                if (c20361214lm4.LIZJ.LJI == 0) {
                    PlayRule playRule4 = c20361214lm4.LIZLLL;
                    if (playRule4 != null) {
                        boolValueOf = Boolean.valueOf(playRule4.LJIJJ(c20361214lm4, null, false));
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        PlayRule playRule5 = c20361214lm4.LIZLLL;
                        if (playRule5 != null) {
                            playRule5.LIZJ(new InterfaceC20357614lC() { // from class: X.14lR
                                @Override // X.InterfaceC20357614lC
                                public final void LIZ() {
                                    this.LIZ.LJIIJJI(i, "normalRun", z, true);
                                }
                            });
                            playRule5.LJIIZILJ(c20361214lm4, this.LJIJJLI, true, new AwS81S0301000_31(this, c20361214lm4, c20360614lg, i, 2));
                        }
                    }
                }
                PlayRule playRule6 = c20361214lm4.LIZLLL;
                if (playRule6 != null) {
                    playRule6.LIZJ(new InterfaceC20357614lC() { // from class: X.14lS
                        @Override // X.InterfaceC20357614lC
                        public final void LIZ() {
                            this.LIZ.LJIIJJI(i, "unable", z, true);
                        }
                    });
                }
                PlayRule playRule7 = c20361214lm4.LIZLLL;
                if (playRule7 != null) {
                    playRule7.LJJIJ();
                }
            }
            if (!((C20359414lU) ListProtector.get(c20360614lg.LIZIZ, i)).LIZJ.isEmpty()) {
                return;
            }
            if (this.LJIJJLI) {
                C500260Jjc.LJJLIIIJILLIZJL(new C20359014lQ(this, c20360614lg, i, z));
                ARunnableS6S0111000_31 aRunnableS6S0111000_312 = new ARunnableS6S0111000_31(this, i, z, 1);
                this.LJIJ = aRunnableS6S0111000_312;
                C786410Ut5.LJLIIL(((long) PlaybookAutoRotationTimeConfig.INSTANCE.getTimeInSecond()) * 1000, C473410IhP.LIZ(), aRunnableS6S0111000_312);
                return;
            }
            ARunnableS6S0111000_31 aRunnableS6S0111000_313 = new ARunnableS6S0111000_31(this, i, z, 1);
            this.LJIJ = aRunnableS6S0111000_313;
            C786410Ut5.LJLIIL(((long) PlaybookAutoRotationTimeConfig.INSTANCE.getTimeInSecond()) * 1000, C473410IhP.LIZ(), aRunnableS6S0111000_313);
            return;
        }
        C20441214yg.LJ("PlaybookDirector", "runPlaybookStep, but runningPlaybookFlow is null");
    }

    public final void LJIILLIIL(C20359414lU c20359414lU, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PlayRule playRule = ((C20361214lm) it2.next()).LIZLLL;
            if (playRule != null) {
                playRule.LJI(AFwS285S0000000_2.get$arr$(55));
            }
        }
        LJI();
        InterfaceC20360014la interfaceC20360014la = this.LJIJJ;
        if (interfaceC20360014la != null) {
            interfaceC20360014la.LIZLLL(c20359414lU);
        }
        InterfaceC20360014la interfaceC20360014la2 = this.LJIIIIZZ;
        if (interfaceC20360014la2 != null) {
            interfaceC20360014la2.LIZLLL(c20359414lU);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.14lZ] */
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
    public final void LJII(final C20379114of c20379114of, final C20359414lU c20359414lU, final int i) {
        EnumC20429514wn enumC20429514wn;
        C20357914lF config;
        if (c20359414lU.LIZJ.size() <= i) {
            ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LJIJI;
            if (aRunnableS131S0100000_31 != null) {
                C473410IhP.LIZ().removeCallbacks(aRunnableS131S0100000_31);
                this.LJIJI = null;
            }
            c20359414lU.LJII = EnumC1779020wOa.SUCCESS;
            InterfaceC20360014la interfaceC20360014la = this.LJIJJ;
            if (interfaceC20360014la != null) {
                interfaceC20360014la.LJI(c20359414lU);
            }
            InterfaceC20360014la interfaceC20360014la2 = this.LJIIIIZZ;
            if (interfaceC20360014la2 != null) {
                interfaceC20360014la2.LJI(c20359414lU);
                return;
            }
            return;
        }
        final C20361214lm c20361214lm = (C20361214lm) ListProtector.get(c20359414lU.LIZJ, i);
        PlayRule playRule = c20361214lm.LIZLLL;
        if (playRule != null && (config = playRule.getConfig()) != null) {
            enumC20429514wn = config.LJII;
        } else {
            enumC20429514wn = null;
        }
        if (enumC20429514wn != EnumC20429514wn.IDLE) {
            return;
        }
        PlayRule playRule2 = c20361214lm.LIZLLL;
        if (playRule2 != 0) {
            playRule2.LJIILL(new InterfaceC20357414lA() { // from class: X.14lZ
                @Override // X.InterfaceC20357414lA
                public final void LIZIZ() {
                    String str;
                    Condition conditionLJI = C20359314lT.LJI(c20361214lm);
                    if (conditionLJI == null || (str = conditionLJI.name) == null) {
                        return;
                    }
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    C978360bZC.LJJIFFI(c20379114of.LIZ.playbookId, c20361214lm.LIZ, str, "fail", CardStruct.IStatusCode.DEFAULT);
                    C20359714lX c20359714lX = this;
                    C20361214lm c20361214lm2 = c20361214lm;
                    InterfaceC20360014la interfaceC20360014la3 = c20359714lX.LJIJJ;
                    if (interfaceC20360014la3 != null) {
                        interfaceC20360014la3.LIZJ(c20361214lm2, false);
                    }
                    InterfaceC20360014la interfaceC20360014la4 = c20359714lX.LJIIIIZZ;
                    if (interfaceC20360014la4 != null) {
                        interfaceC20360014la4.LIZJ(c20361214lm2, false);
                    }
                    this.LJII(c20379114of, c20359414lU, i + 1);
                }

                @Override // X.InterfaceC20357414lA
                public final void LIZ(boolean z) {
                    String str;
                    String str2;
                    Condition conditionLJI = C20359314lT.LJI(c20361214lm);
                    if (conditionLJI == null || (str = conditionLJI.name) == null) {
                        return;
                    }
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    String str3 = c20361214lm.LIZ;
                    long j = c20379114of.LIZ.playbookId;
                    if (z) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    C978360bZC.LJJIFFI(j, str3, str, "success", str2);
                    C20359714lX c20359714lX = this;
                    C20361214lm c20361214lm2 = c20361214lm;
                    InterfaceC20360014la interfaceC20360014la3 = c20359714lX.LJIJJ;
                    if (interfaceC20360014la3 != null) {
                        interfaceC20360014la3.LIZJ(c20361214lm2, true);
                    }
                    InterfaceC20360014la interfaceC20360014la4 = c20359714lX.LJIIIIZZ;
                    if (interfaceC20360014la4 != null) {
                        interfaceC20360014la4.LIZJ(c20361214lm2, true);
                    }
                    this.LJII(c20379114of, c20359414lU, i + 1);
                }
            });
        }
        ARunnableS131S0100000_31 aRunnableS131S0100000_312 = this.LJIJI;
        if (aRunnableS131S0100000_312 != null) {
            C473410IhP.LIZ().removeCallbacks(aRunnableS131S0100000_312);
            this.LJIJI = null;
        }
        ARunnableS131S0100000_31 aRunnableS131S0100000_313 = new ARunnableS131S0100000_31(c20361214lm, 150);
        this.LJIJI = aRunnableS131S0100000_313;
        C786410Ut5.LJLIIL(MultiGuestPlaybookDecorationTimeoutSetting.INSTANCE.getValue(), C473410IhP.LIZ(), aRunnableS131S0100000_313);
        PlayRule playRule3 = c20361214lm.LIZLLL;
        if (playRule3 == null) {
            return;
        }
        playRule3.LJIIIIZZ(c20361214lm, new AwS432S0200000_31(this, c20361214lm, 110));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2 A[PHI: r9
      0x00e2: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:36:0x0067, B:34:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(int r14, int r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20359714lX.LJIILL(int, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    @Override // X.AbstractC20358714lN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.ref.WeakReference<com.bytedance.android.live.design.view.sheet.LiveSheetFragment> LJ(X.C20359414lU r8, X.C20361214lm r9, java.lang.Long r10, kotlin.jvm.functions.Function1<? super android.content.Context, kotlin.Unit> r11) {
        /*
            r7 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r7.LIZ
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2 r5 = X.C784920Uqg.LIZIZ(r0)
            r4 = 0
            if (r5 == 0) goto L81
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartDialog r1 = r5.LLJJIJI
            if (r1 == 0) goto L11
            r0 = 1
            r1.close(r0)
        L11:
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartDialog r6 = new com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartDialog
            r6.<init>()
            r5.LLJJIJI = r6
            X.14lb r3 = new X.14lb
            r3.<init>(r5)
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel r0 = r5.LLILLJJLI
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel) r0
            if (r0 == 0) goto L84
            X.14pX r0 = r0.LLJJJJJIL
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.14oK> r0 = r0.LJ
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.14oK r0 = (X.C20377014oK) r0
            boolean r0 = r0.LJIIIZ
            if (r0 == 0) goto L2f
        L40:
            X.14oK r1 = (X.C20377014oK) r1
            if (r1 == 0) goto L84
            X.14lX r2 = r1.LIZLLL
            X.14lg r0 = r2.LJIILJJIL
            if (r0 == 0) goto L84
            java.util.List<X.14lU> r1 = r0.LIZIZ
            if (r1 == 0) goto L84
            int r0 = r2.LJIILLIIL
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            X.14lU r0 = (X.C20359414lU) r0
            if (r0 == 0) goto L84
            java.lang.String r2 = r0.LIZIZ
        L5a:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.LLJI
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel r0 = r5.LLILLJJLI
            r6.LLLI = r11
            r6.LLLIIL = r3
            r6.LLLII = r9
            r6.LLLIIIL = r2
            r6.LLLIILIL = r1
            r6.LLLIL = r10
            r6.LLLIIIIL = r0
            r6.LLLIIII = r8
            androidx.fragment.app.FragmentManager r3 = r5.LJJJJJL()
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartDialog r2 = r5.LLJJIJI
            r1 = 0
            java.lang.String r0 = "PlaybookAutoStartDialog"
            X.C19322110iZ.LJFF(r3, r2, r0, r4, r1)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartDialog r0 = r5.LLJJIJI
            r4.<init>(r0)
        L81:
            return r4
        L82:
            r1 = r4
            goto L40
        L84:
            r2 = r4
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20359714lX.LJ(X.14lU, X.14lm, java.lang.Long, kotlin.jvm.functions.Function1):java.lang.ref.WeakReference");
    }

    public final void LJIIJJI(int i, String str, boolean z, boolean z2) {
        C20357914lF config;
        if (z2) {
            LJIILL(i, 0, str);
        }
        C20360614lg c20360614lg = this.LJIILJJIL;
        if (c20360614lg != null) {
            int i2 = i + 1;
            if (c20360614lg.LIZIZ.size() < i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlaybookTaskExecuteFinished - ");
                sbLIZ.append(str);
                sbLIZ.append(", stepList.size < stepIndex + 1, stepIndex + 1: ");
                sbLIZ.append(i2);
                C20441214yg.LJ("PlaybookDirector", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            Iterator<C20361214lm> it2 = ((C20359414lU) ListProtector.get(c20360614lg.LIZIZ, i)).LIZJ.iterator();
            boolean z3 = true;
            while (it2.hasNext()) {
                PlayRule playRule = it2.next().LIZLLL;
                if (playRule == null || (config = playRule.getConfig()) == null || config.LJFF != 2) {
                    z3 = false;
                }
            }
            if (!z3) {
                return;
            }
            if (c20360614lg.LIZIZ.size() == i2) {
                this.LJIILLIIL = -1;
                InterfaceC20359614lW interfaceC20359614lW = this.LJII;
                if (interfaceC20359614lW == null) {
                    return;
                }
                interfaceC20359614lW.LIZ(-1, -1L, c20360614lg.LIZIZ);
                return;
            }
            LJIILJJIL(i2, z);
            return;
        }
        C20441214yg.LJ("PlaybookDirector", "onPlaybookTaskExecuteFinished, but runningPlaybookFlow is null");
    }

    public final void LJIIL(C20379114of c20379114of, Playbook playbook, C20360614lg c20360614lg, boolean z, boolean z2) {
        if (this.LJIILJJIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runPlaybookFlow, runningPlaybookFlow != null: ");
            sbLIZ.append(this.LJIILJJIL);
            C20441214yg.LJ("PlaybookDirector", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (z) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS3S0420000_31(this, c20379114of, c20360614lg, playbook, z, z2, 0));
        } else {
            LJIILIIL(this, c20379114of, c20360614lg, playbook, false, z2);
        }
    }

    public static final void LJIILIIL(C20359714lX c20359714lX, C20379114of c20379114of, C20360614lg c20360614lg, Playbook playbook, boolean z, boolean z2) {
        Long lValueOf;
        ActivePlaybook activePlaybookLIZIZ;
        ActivePlaybook activePlaybookLIZIZ2;
        if (c20359714lX.LJIJJLI != z) {
            c20359714lX.LJIJJLI = z;
        }
        c20359714lX.LJIILIIL = c20379114of;
        c20359714lX.LJIILJJIL = c20360614lg;
        c20359714lX.LJIILL = playbook;
        Iterator<C20359414lU> it2 = c20360614lg.LIZIZ.iterator();
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            if (it2.hasNext()) {
                C20359414lU next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Iterator<C20361214lm> it3 = next.LIZJ.iterator();
                    while (it3.hasNext()) {
                        PlayRule playRule = it3.next().LIZLLL;
                        if (playRule != null && playRule.isRunning()) {
                            break loop0;
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else if (PlaybookAutoRunTypeSetting.INSTANCE.enable()) {
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(c20359714lX.LIZ);
                if (playbookAnchorServiceV2LIZIZ != null && (activePlaybookLIZIZ2 = playbookAnchorServiceV2LIZIZ.LIZIZ()) != null) {
                    lValueOf = Long.valueOf(activePlaybookLIZIZ2.currentStateId);
                } else {
                    lValueOf = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("runningStateId: ");
                sbLIZ.append(lValueOf);
                sbLIZ.append(", dataChannel: ");
                sbLIZ.append(c20359714lX.LIZ);
                sbLIZ.append(", dataChannel.getPlaybookAnchorServiceV2(): ");
                sbLIZ.append(C784920Uqg.LIZIZ(c20359714lX.LIZ));
                sbLIZ.append(", activePlaybook: ");
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ2 = C784920Uqg.LIZIZ(c20359714lX.LIZ);
                if (playbookAnchorServiceV2LIZIZ2 != null) {
                    activePlaybookLIZIZ = playbookAnchorServiceV2LIZIZ2.LIZIZ();
                } else {
                    activePlaybookLIZIZ = null;
                }
                sbLIZ.append(activePlaybookLIZIZ);
                C20441214yg.LIZIZ("playbook_auto_run", C2188811AlT.LIZIZ(sbLIZ));
                ArrayList arrayList = new ArrayList();
                if (lValueOf != null) {
                    if (lValueOf.longValue() == -1) {
                        c20359714lX.LJIILLIIL = -1;
                        return;
                    }
                    if (lValueOf.longValue() != 0) {
                        i2 = 0;
                        for (C20359414lU c20359414lU : c20360614lg.LIZIZ) {
                            int i4 = i2 + 1;
                            if (i2 >= 0) {
                                C20359414lU c20359414lU2 = c20359414lU;
                                if (c20359414lU2.LIZ != lValueOf.longValue()) {
                                    for (C20361214lm c20361214lm : c20359414lU2.LIZJ) {
                                        if (c20361214lm.LIZIZ == lValueOf.longValue()) {
                                            Iterator it4 = arrayList.iterator();
                                            while (it4.hasNext()) {
                                                PlayRule playRule2 = ((C20361214lm) it4.next()).LIZLLL;
                                                if (playRule2 != null) {
                                                    playRule2.LJJIJ();
                                                }
                                            }
                                        } else {
                                            arrayList.add(c20361214lm);
                                        }
                                    }
                                    i2 = i4;
                                }
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        if (i2 != 0) {
            i = i2;
        }
        c20359714lX.LJIILJJIL(i, z2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.14lY] */
    public C20359714lX(WeakReference<Context> weakReference, DataChannel dataChannel, InterfaceC20356214ky interfaceC20356214ky, InterfaceC20354714kj interfaceC20354714kj, InterfaceC20360214lc interfaceC20360214lc, InterfaceC20359614lW interfaceC20359614lW, InterfaceC20360014la interfaceC20360014la, Playbook playbook) {
        super(dataChannel, playbook, weakReference);
        this.LJ = interfaceC20356214ky;
        this.LJFF = interfaceC20354714kj;
        this.LJI = interfaceC20360214lc;
        this.LJII = interfaceC20359614lW;
        this.LJIIIIZZ = interfaceC20360014la;
        this.LJIIJ = new HashSet<>();
        this.LJIIJJI = new InterfaceC20357514lB() { // from class: X.14lY
            @Override // X.InterfaceC20357514lB
            public final void LIZ(int i, AbstractC20356314kz abstractC20356314kz) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("entityState=");
                sbLIZ.append(i);
                sbLIZ.append(", entityName=");
                sbLIZ.append(abstractC20356314kz.LJJJIL().LIZ);
                C20441214yg.LJIIIZ("PlaybookDirector", C2188811AlT.LIZIZ(sbLIZ));
                if (i != 0) {
                    this.LIZ.LJIIJ.add(abstractC20356314kz);
                } else {
                    this.LIZ.LJIIJ.remove(abstractC20356314kz);
                }
                int i2 = !this.LIZ.LJIIJ.isEmpty() ? 1 : 0;
                C20359714lX c20359714lX = this.LIZ;
                if (c20359714lX.LJIIIZ != i2) {
                    c20359714lX.LJIIIZ = i2;
                    InterfaceC20360214lc interfaceC20360214lc2 = c20359714lX.LJI;
                    if (interfaceC20360214lc2 != null) {
                        interfaceC20360214lc2.onStateChange(i2);
                    }
                }
            }
        };
        this.LJIIZILJ = -1L;
    }
}
