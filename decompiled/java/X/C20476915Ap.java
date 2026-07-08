package X;

import Y.AfS162S0200000_28;
import Y.AfS53S1100000_28;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestShowdownShowAnimationMaximumExecutionTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixGuestShowdownAnimationContainerSetting;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS81S1000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20476915Ap {
    public static final long LJIIJ = MultiGuestShowdownShowAnimationMaximumExecutionTimeSetting.INSTANCE.getValue();
    public static final /* synthetic */ int LJIIJJI = 0;
    public final ViewGroup LIZ;
    public final C20475815Ae LIZIZ;
    public final C15AH LIZJ;
    public ViewGroup LIZLLL;
    public final Queue<C20477515Av> LJ = new LinkedList();
    public final List<C15AJ<InterfaceC20476615Am>> LJFF = new ArrayList();
    public final List<C15AJ<? extends InterfaceC20476615Am>> LJI = new ArrayList();
    public volatile InterfaceC420801kM LJII;
    public volatile C11JL LJIIIIZZ;
    public C11JF LJIIIZ;

    public String LJIIIZ() {
        return "AnimationExecutor";
    }

    public final void LJIIZILJ() {
        LJIIJ("tryStartNextAnimations", true);
        if (this.LJ.isEmpty()) {
            return;
        }
        LJIILJJIL((C20477515Av) ((LinkedList) this.LJ).poll());
    }

    public final void LIZJ() {
        InterfaceC20477315At interfaceC20477315AtLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearAllAnimation length:");
        sbLIZ.append(((LinkedList) this.LJ).size());
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ), true);
        ((LinkedList) this.LJ).clear();
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            InterfaceC20476615Am geniusModel = ((C15AJ) it2.next()).getGeniusModel();
            if (geniusModel != null && (interfaceC20477315AtLIZ = geniusModel.LIZ()) != null) {
                interfaceC20477315AtLIZ.LIZIZ(true);
            }
        }
        ((ArrayList) this.LJFF).clear();
        InterfaceC420801kM interfaceC420801kM = this.LJII;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        LJIILIIL(null);
        C11JL c11jl = this.LJIIIIZZ;
        if (c11jl != null) {
            c11jl.dispose();
        }
        this.LJIIIIZZ = null;
        LJFF(true);
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
            viewGroup.removeAllViewsInLayout();
        }
    }

    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearAllAnimationWithoutRunning length:");
        sbLIZ.append(((LinkedList) this.LJ).size());
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ), true);
        ((LinkedList) this.LJ).clear();
    }

    public static void LJ(C20476915Ap c20476915Ap) {
        c20476915Ap.LIZLLL();
    }

    public static boolean LJIIJJI(C20477515Av c20477515Av) {
        Boolean boolValueOf;
        if (c20477515Av != null) {
            boolValueOf = Boolean.valueOf(c20477515Av.LIZJ);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJIJIIJIL(boolValueOf);
    }

    public final void LIZIZ(EnumC20476415Ak... enumC20476415AkArr) {
        Integer numValueOf;
        View childAt;
        EnumC20476415Ak enumC20476415AkLJFF;
        EnumC20476415Ak enumC20476415AkLJFF2;
        for (EnumC20476415Ak enumC20476415Ak : enumC20476415AkArr) {
            List<C15AJ<? extends InterfaceC20476615Am>> list = this.LJI;
            ArrayList<C15AJ> arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                EnumC20476415Ak enumC20476415AkLJFF3 = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                InterfaceC20476615Am geniusModel = ((C15AJ) next).getGeniusModel();
                if (geniusModel != null) {
                    enumC20476415AkLJFF3 = geniusModel.LJFF();
                }
                if (enumC20476415AkLJFF3 == enumC20476415Ak) {
                    arrayList.add(next);
                }
            }
            List<C15AJ<InterfaceC20476615Am>> list2 = this.LJFF;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (ArrayList) list2) {
                InterfaceC20476615Am geniusModel2 = ((C15AJ) obj).getGeniusModel();
                if (geniusModel2 != null) {
                    enumC20476415AkLJFF2 = geniusModel2.LJFF();
                } else {
                    enumC20476415AkLJFF2 = null;
                }
                if (enumC20476415AkLJFF2 == enumC20476415Ak) {
                    arrayList2.add(obj);
                }
            }
            StringBuilder sb = new StringBuilder("viewList:(");
            for (C15AJ c15aj : arrayList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c15aj.getGeniusId());
                sbLIZ.append(' ');
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            LJIIJ("checkHasGeniusType geniusType:" + enumC20476415Ak + " viewList:" + arrayList.size() + " viewListInAll:" + arrayList2.size() + " result:" + ((Object) sb), true);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((C15AJ) it3.next()).LJIIJ();
            }
            C19719512Dh.LIZ(this.LJFF).removeAll(arrayList);
            ((ArrayList) this.LJI).removeAll(arrayList);
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup != null && (numValueOf = Integer.valueOf(viewGroup.getChildCount())) != null && numValueOf.intValue() > 0) {
                for (int iIntValue = numValueOf.intValue() - 1; -1 < iIntValue; iIntValue--) {
                    ViewGroup viewGroup2 = this.LIZ;
                    if (viewGroup2 != null) {
                        childAt = viewGroup2.getChildAt(iIntValue);
                    } else {
                        childAt = null;
                    }
                    if (childAt instanceof C15AJ) {
                        InterfaceC20476615Am geniusModel3 = ((C15AJ) childAt).getGeniusModel();
                        if (geniusModel3 != null) {
                            enumC20476415AkLJFF = geniusModel3.LJFF();
                        } else {
                            enumC20476415AkLJFF = null;
                        }
                        if (enumC20476415AkLJFF == enumC20476415Ak) {
                            LJIIJ("checkHasGeniusType geniusType:" + enumC20476415Ak + " child:" + childAt + " is leak!", true);
                            ViewGroup viewGroup3 = this.LIZ;
                            if (viewGroup3 != null) {
                                C786410Ut5.LJJLIL(iIntValue, viewGroup3);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void LJFF(boolean z) {
        InterfaceC20477315At interfaceC20477315AtLIZ;
        int size = ((ArrayList) this.LJI).size();
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            C15AJ c15aj = (C15AJ) it2.next();
            InterfaceC20476615Am geniusModel = c15aj.getGeniusModel();
            if ((geniusModel != null && (interfaceC20477315AtLIZ = geniusModel.LIZ()) != null && interfaceC20477315AtLIZ.LIZ()) || !c15aj.LLIIII()) {
                if (!c15aj.LLIIII()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("confrontation geniusView:");
                    sbLIZ.append(c15aj.getGeniusId());
                    sbLIZ.append(" parent is null please check");
                    LJIIJ(C2188811AlT.LIZIZ(sbLIZ), true);
                }
                C19719512Dh.LIZ(this.LJFF).remove(c15aj);
                c15aj.LJIIJ();
                it2.remove();
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("confrontation beforeRemoveSize:");
        sbLIZ2.append(size);
        sbLIZ2.append(" afterRemoveSize:");
        sbLIZ2.append(((ArrayList) this.LJI).size());
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ2), z);
    }

    public final C15AJ<InterfaceC20476615Am> LJII(String str) {
        C15AJ<InterfaceC20476615Am> next;
        Iterator<C15AJ<InterfaceC20476615Am>> it2 = this.LJFF.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getGeniusId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final ViewGroup LJIIIIZZ(InterfaceC20476615Am interfaceC20476615Am) {
        int i = C20476815Ao.LIZ[interfaceC20476615Am.LIZJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.LIZLLL;
        }
        return this.LIZ;
    }

    public final void LJIIL(String str) {
        Object next;
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C15AJ) next).getGeniusId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C15AJ c15aj = (C15AJ) next;
        C19719512Dh.LIZ(this.LJFF).remove(c15aj);
        C500260Jjc.LJJJLIIL(this.LJI, new AwS81S1000000_31(str, 5));
        if (c15aj != null) {
            c15aj.LJIIJ();
        }
        if (!Intrinsics.LJFF(str, C15B8.LJJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeGenius geniusId:");
            sbLIZ.append(str);
            LJIIJ(C2188811AlT.LIZIZ(sbLIZ), true);
        }
    }

    public final void LJIILIIL(C11JL c11jl) {
        this.LJII = c11jl;
        if (c11jl == null) {
            C11JF c11jf = this.LJIIIZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LJIIIZ = null;
        }
    }

    public final void LJIILJJIL(final C20477515Av c20477515Av) {
        C15AJ<InterfaceC20476615Am> c15ajLJII;
        Object next;
        ViewGroup viewGroupLJIIIIZZ;
        String geniusId;
        EnumC20476415Ak enumC20476415AkLJFF;
        EnumC20476415Ak enumC20476415AkLJFF2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAnimationGroup animationGroup ");
        sbLIZ.append(c20477515Av);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ), LJIIJJI(c20477515Av));
        if (c20477515Av == null) {
            LJIIJ("startAnimationGroup animationGroup is null", LJIIJJI(c20477515Av));
            LJIIZILJ();
            return;
        }
        if (!c20477515Av.LIZJ && ((c20477515Av.LIZIZ && c20477515Av.LJFF.isEmpty()) || (!c20477515Av.LIZIZ && c20477515Av.LJ.isEmpty()))) {
            LJIIJ("startAnimationGroup animationGroup is not valid", LJIIJJI(c20477515Av));
            LJIIZILJ();
            return;
        }
        C20477615Aw c20477615Aw = c20477515Av.LJI;
        if (c20477615Aw != null) {
            List<C15AJ<? extends InterfaceC20476615Am>> list = this.LJI;
            ArrayList<C15AJ> arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                C15AJ c15aj = (C15AJ) obj;
                List<EnumC20476415Ak> list2 = c20477615Aw.LIZIZ;
                InterfaceC20476615Am geniusModel = c15aj.getGeniusModel();
                if (geniusModel != null) {
                    enumC20476415AkLJFF2 = geniusModel.LJFF();
                } else {
                    enumC20476415AkLJFF2 = null;
                }
                if (!C13LP.LJJJJ(enumC20476415AkLJFF2, list2) && !c20477615Aw.LIZJ.contains(c15aj.getGeniusId())) {
                    arrayList.add(obj);
                }
            }
            List<C15AJ<InterfaceC20476615Am>> list3 = this.LJFF;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (ArrayList) list3) {
                C15AJ c15aj2 = (C15AJ) obj2;
                List<EnumC20476415Ak> list4 = c20477615Aw.LIZIZ;
                InterfaceC20476615Am geniusModel2 = c15aj2.getGeniusModel();
                if (geniusModel2 != null) {
                    enumC20476415AkLJFF = geniusModel2.LJFF();
                } else {
                    enumC20476415AkLJFF = null;
                }
                if (!C13LP.LJJJJ(enumC20476415AkLJFF, list4) && !c20477615Aw.LIZJ.contains(c15aj2.getGeniusId())) {
                    arrayList2.add(obj2);
                }
            }
            StringBuilder sb = new StringBuilder("clearGeniusViewBeforeState infos:");
            sb.append(c20477615Aw);
            sb.append(" removeGeniusViewList.size:");
            sb.append(arrayList.size());
            sb.append(" removeGeniusViewListInAll.size:");
            sb.append(arrayList2.size());
            sb.append(" removeGeniusViewList:");
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((C15AJ) it2.next()).getGeniusId());
            }
            sb.append(arrayList3);
            sb.append(" removeGeniusViewListInAll:");
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((C15AJ) it3.next()).getGeniusId());
            }
            sb.append(arrayList4);
            LJIIJ(sb.toString(), true);
            Map<String, Object> map = C1338270kvh.LIZ;
            for (C15AJ c15aj3 : arrayList) {
                c15aj3.LJIIJ();
                C500260Jjc.LJJJLIIL(this.LIZIZ.LIZ, new AwS81S1000000_31(c15aj3.getGeniusId(), 4));
            }
            ((ArrayList) this.LJI).removeAll(arrayList);
            ((ArrayList) this.LJFF).removeAll(arrayList2);
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup != null) {
                Iterator<View> it4 = new C09RD(viewGroup).iterator();
                while (true) {
                    C09RE c09re = (C09RE) it4;
                    if (!c09re.hasNext()) {
                        break;
                    }
                    Object obj3 = (View) c09re.next();
                    if (obj3 instanceof C15AJ) {
                        Iterator it5 = arrayList.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                Object next2 = it5.next();
                                InterfaceC20476615Am geniusModel3 = ((C15AJ) next2).getGeniusModel();
                                if (geniusModel3 != null) {
                                    geniusId = geniusModel3.getGeniusId();
                                } else {
                                    geniusId = null;
                                }
                                if (Intrinsics.LJFF(geniusId, ((C15AJ) obj3).getGeniusId())) {
                                    if (next2 != null) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("checkHasGeniusType geniusId:");
                                        C15AJ c15aj4 = (C15AJ) obj3;
                                        sbLIZ2.append(c15aj4.getGeniusId());
                                        sbLIZ2.append(" child:");
                                        sbLIZ2.append(obj3);
                                        sbLIZ2.append(" is leak!");
                                        LJIIJ(C2188811AlT.LIZIZ(sbLIZ2), true);
                                        c15aj4.LJIIJ();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        LJIIJ("startAnimations animationGroup real", LJIIJJI(c20477515Av));
        if (!c20477515Av.LIZIZ) {
            for (InterfaceC20476615Am interfaceC20476615Am : c20477515Av.LJ) {
                if (LJII(interfaceC20476615Am.getGeniusId()) == null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("tryStartAnimations ");
                    sbLIZ3.append(interfaceC20476615Am.getGeniusId());
                    sbLIZ3.append(" rootType:");
                    sbLIZ3.append(interfaceC20476615Am.LIZJ());
                    sbLIZ3.append(" not create");
                    LJIIJ(C2188811AlT.LIZIZ(sbLIZ3), LJIIJJI(c20477515Av));
                    c15ajLJII = LJI(interfaceC20476615Am.LJFF(), LJIIIIZZ(interfaceC20476615Am), interfaceC20476615Am);
                } else {
                    c15ajLJII = LJII(interfaceC20476615Am.getGeniusId());
                }
                if (c15ajLJII != null) {
                    if (BugFixGuestShowdownAnimationContainerSetting.INSTANCE.isEnable() && (viewGroupLJIIIIZZ = LJIIIIZZ(interfaceC20476615Am)) != null && !Intrinsics.LJFF(c15ajLJII.getRoot(), viewGroupLJIIIIZZ)) {
                        c15ajLJII.setRoot(viewGroupLJIIIIZZ);
                    }
                    LJIILLIIL(c15ajLJII, AFwS221S0000000_31.get$arr$(49));
                }
                this.LIZIZ.LIZJ(interfaceC20476615Am);
                Iterator it6 = ((ArrayList) this.LJFF).iterator();
                while (true) {
                    if (it6.hasNext()) {
                        next = it6.next();
                        if (Intrinsics.LJFF(((C15AJ) next).getGeniusId(), interfaceC20476615Am.getGeniusId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C15AJ<? extends InterfaceC20476615Am> c15aj5 = (C15AJ) next;
                if (c15aj5 != null) {
                    LJIILLIIL(c15aj5, new AwS432S0200000_31((C15AJ) c15aj5, (C15AJ<InterfaceC20476615Am>) interfaceC20476615Am, (InterfaceC20476615Am) 26));
                }
            }
            Function1<? super Boolean, Unit> function1 = c20477515Av.LJII;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            LJIILL(c20477515Av);
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("startAnimationGroup animationGroup start ");
        sbLIZ4.append(c20477515Av);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ4), LJIIJJI(c20477515Av));
        final ArrayList arrayList5 = new ArrayList();
        c20477515Av.LJFF.forEach(new BiConsumer() { // from class: X.15Aq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj4, Object obj5) {
                InterfaceC20476615Am next3;
                final C15AJ<InterfaceC20476615Am> c15ajLJII2;
                InterfaceC20476615Am next4;
                ViewGroup viewGroupLJIIIIZZ2;
                ViewGroup viewGroupLJIIIIZZ3;
                final String str = (String) obj4;
                final C15B1 c15b1 = (C15B1) obj5;
                Iterator<InterfaceC20476615Am> it7 = c20477515Av.LJ.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        next3 = it7.next();
                        if (Intrinsics.LJFF(next3.getGeniusId(), str)) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                InterfaceC20476615Am interfaceC20476615Am2 = next3;
                final int iLJJJZ = C13LP.LJJJZ(str, c20477515Av.LJFF.keySet());
                if (interfaceC20476615Am2 == null) {
                    C20476915Ap c20476915Ap = this;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("startAnimationGroup ");
                    sbLIZ5.append(str);
                    sbLIZ5.append(" model is null");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    C20476915Ap c20476915Ap2 = this;
                    C20477515Av c20477515Av2 = c20477515Av;
                    c20476915Ap2.getClass();
                    c20476915Ap.LJIIJ(strLIZIZ, C20476915Ap.LJIIJJI(c20477515Av2));
                    return;
                }
                if (this.LJII(str) == null) {
                    C20476915Ap c20476915Ap3 = this;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("startAnimationGroup ");
                    sbLIZ6.append(str);
                    sbLIZ6.append(" not create");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
                    C20476915Ap c20476915Ap4 = this;
                    C20477515Av c20477515Av3 = c20477515Av;
                    c20476915Ap4.getClass();
                    c20476915Ap3.LJIIJ(strLIZIZ2, C20476915Ap.LJIIJJI(c20477515Av3));
                    C20476915Ap c20476915Ap5 = this;
                    EnumC20476415Ak enumC20476415AkLJFF3 = interfaceC20476615Am2.LJFF();
                    if (!BugFixGuestShowdownAnimationContainerSetting.INSTANCE.isEnable() || (viewGroupLJIIIIZZ3 = this.LJIIIIZZ(interfaceC20476615Am2)) == null) {
                        viewGroupLJIIIIZZ3 = this.LIZ;
                    }
                    c15ajLJII2 = c20476915Ap5.LJI(enumC20476415AkLJFF3, viewGroupLJIIIIZZ3, interfaceC20476615Am2);
                } else {
                    c15ajLJII2 = this.LJII(str);
                }
                if (c15ajLJII2 == null) {
                    return;
                }
                final C20476915Ap c20476915Ap6 = this;
                C20477515Av c20477515Av4 = c20477515Av;
                List<AbstractC19484711Kz<Boolean>> list5 = arrayList5;
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("startAnimationGroup animationGroup indexOf:");
                sbLIZ7.append(iLJJJZ);
                sbLIZ7.append(" geniusId:");
                sbLIZ7.append(str);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ7);
                c20476915Ap6.getClass();
                c20476915Ap6.LJIIJ(strLIZIZ3, C20476915Ap.LJIIJJI(c20477515Av4));
                if (BugFixGuestShowdownAnimationContainerSetting.INSTANCE.isEnable() && (viewGroupLJIIIIZZ2 = c20476915Ap6.LJIIIIZZ(interfaceC20476615Am2)) != null && !Intrinsics.LJFF(c15ajLJII2.getRoot(), viewGroupLJIIIIZZ2)) {
                    c15ajLJII2.setRoot(viewGroupLJIIIIZZ2);
                }
                c20476915Ap6.LJIILLIIL(c15ajLJII2, AFwS221S0000000_31.get$arr$(50));
                Iterator<InterfaceC20476615Am> it8 = c20477515Av4.LJ.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next4 = it8.next();
                        if (Intrinsics.LJFF(next4.getGeniusId(), str)) {
                            break;
                        }
                    } else {
                        next4 = null;
                        break;
                    }
                }
                final InterfaceC20476615Am interfaceC20476615Am3 = next4;
                if (interfaceC20476615Am3 != null) {
                    c20476915Ap6.LIZIZ.LIZJ(interfaceC20476615Am3);
                }
                C11KQ c11kqLJIIL = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.15Az
                    @Override // X.InterfaceC300801Eo
                    public final void subscribe(InterfaceC2329309At<Boolean> interfaceC2329309At) {
                        c15ajLJII2.LJLL(c15b1.LIZ, interfaceC20476615Am3, new C15B0(c20476915Ap6, iLJJJZ, str, (C11KT) interfaceC2329309At));
                    }
                }).LJIIL(new AfS53S1100000_28(c20476915Ap6, str, 1));
                Boolean bool = Boolean.TRUE;
                C1701890uOB.LIZ(bool, "value is null");
                list5.add(new C11KD(c11kqLJIIL, null, bool));
            }
        });
        if (arrayList5.isEmpty()) {
            LJIIJ("startAnimationGroup finish as mutableListOf is empty", true);
            LJIILL(c20477515Av);
            return;
        }
        InterfaceC420801kM interfaceC420801kMLJJIIZ = AbstractC19484711Kz.LJJIL(arrayList5, new InterfaceC1487280oo2() { // from class: X.10Fp
            @Override // X.InterfaceC1487280oo2
            public final /* bridge */ /* synthetic */ Object apply(Object obj4) {
                return Unit.LIZ;
            }
        }).LJJ(C1701940uOG.LIZIZ()).LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0ylu
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C20476915Ap c20476915Ap = this.LIZ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("startAnimationGroup doOnDispose ");
                sbLIZ5.append(c20477515Av);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                C20476915Ap c20476915Ap2 = this.LIZ;
                C20477515Av c20477515Av2 = c20477515Av;
                c20476915Ap2.getClass();
                c20476915Ap.LJIIJ(strLIZIZ, C20476915Ap.LJIIJJI(c20477515Av2));
                if (c20477515Av.LIZJ) {
                    this.LIZ.LJIIIIZZ = null;
                } else {
                    this.LIZ.LJIILIIL(null);
                }
                this.LIZ.LIZ(c20477515Av, false);
            }
        }).LJIILL(new AfS162S0200000_28(this, c20477515Av, 2)).LJIIL(new AfS162S0200000_28(this, c20477515Av, 3)).LJJIIZ(new C09JN() { // from class: X.0ylt
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj4) {
                C1C7U.LIZ("AnimationExecutor@6000.startAnimationGroup$8");
                C1C7U.LIZIZ("AnimationExecutor@6000.startAnimationGroup$8");
            }
        }, new AfS162S0200000_28(this, c20477515Av, 4));
        if (!c20477515Av.LIZJ) {
            C11JF c11jf = this.LJIIIZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LJIIIZ = null;
            this.LJIIIZ = (C11JF) C11NZ.LJLJJLL(LJIIJ, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS162S0200000_28(this, c20477515Av, 1));
        }
        if (c20477515Av.LIZJ) {
            this.LJIIIIZZ = (C11JL) interfaceC420801kMLJJIIZ;
        } else {
            LJIILIIL((C11JL) interfaceC420801kMLJJIIZ);
        }
    }

    public final void LJIILL(C20477515Av c20477515Av) {
        Boolean boolValueOf;
        InterfaceC420801kM interfaceC420801kM;
        LJFF(LJIIJJI(c20477515Av));
        if (!c20477515Av.LIZJ) {
            InterfaceC420801kM interfaceC420801kM2 = this.LJII;
            if (interfaceC420801kM2 != null) {
                boolValueOf = Boolean.valueOf(interfaceC420801kM2.isDisposed());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIFFI(boolValueOf) && (interfaceC420801kM = this.LJII) != null) {
                interfaceC420801kM.dispose();
            }
            LJIILIIL(null);
            LJIIZILJ();
        }
    }

    public final void LIZ(final C20477515Av c20477515Av, final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animationFinish animationGroup ");
        sbLIZ.append(c20477515Av);
        sbLIZ.append(" success:");
        sbLIZ.append(z);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ), LJIIJJI(c20477515Av));
        Function1<? super Boolean, Unit> function1 = c20477515Av.LJII;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        c20477515Av.LJFF.forEach(new BiConsumer() { // from class: X.15Ar
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Boolean boolValueOf;
                InterfaceC20476615Am next;
                String str = (String) obj;
                C15B1 c15b1 = (C15B1) obj2;
                Iterator<InterfaceC20476615Am> it2 = c20477515Av.LJ.iterator();
                while (true) {
                    boolValueOf = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getGeniusId(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InterfaceC20476615Am interfaceC20476615Am = next;
                if (interfaceC20476615Am != null) {
                    C20476915Ap c20476915Ap = this;
                    boolean z2 = z;
                    C20477515Av c20477515Av2 = c20477515Av;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("geniusId:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" animation finish success:");
                    sbLIZ2.append(z2);
                    sbLIZ2.append(" geniusConfig.detach:");
                    InterfaceC20477315At interfaceC20477315AtLIZ = interfaceC20476615Am.LIZ();
                    if (interfaceC20477315AtLIZ != null) {
                        boolValueOf = Boolean.valueOf(interfaceC20477315AtLIZ.LIZ());
                    }
                    sbLIZ2.append(boolValueOf);
                    sbLIZ2.append(" animations.isDetached:");
                    sbLIZ2.append(c15b1.LIZIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c20476915Ap.getClass();
                    c20476915Ap.LJIIJ(strLIZIZ, C20476915Ap.LJIIJJI(c20477515Av2));
                    InterfaceC20477315At interfaceC20477315AtLIZ2 = interfaceC20476615Am.LIZ();
                    if (interfaceC20477315AtLIZ2 != null) {
                        InterfaceC20477315At interfaceC20477315AtLIZ3 = interfaceC20476615Am.LIZ();
                        boolean z3 = false;
                        if ((interfaceC20477315AtLIZ3 != null && interfaceC20477315AtLIZ3.LIZ()) || c15b1.LIZIZ) {
                            z3 = true;
                        }
                        interfaceC20477315AtLIZ2.LIZIZ(z3);
                    }
                }
            }
        });
        List<InterfaceC20476615Am> list = c20477515Av.LJ;
        ArrayList<InterfaceC20476615Am> arrayList = new ArrayList();
        for (InterfaceC20476615Am interfaceC20476615Am : list) {
            if (!c20477515Av.LJFF.keySet().contains(interfaceC20476615Am.getGeniusId())) {
                arrayList.add(interfaceC20476615Am);
            }
        }
        for (InterfaceC20476615Am interfaceC20476615Am2 : arrayList) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("animationFinish ");
            sbLIZ2.append(c20477515Av.LIZ);
            sbLIZ2.append(" update GeniusMode withoult animations");
            LJIIJ(C2188811AlT.LIZIZ(sbLIZ2), LJIIJJI(c20477515Av));
            C15AJ<InterfaceC20476615Am> c15ajLJII = LJII(interfaceC20476615Am2.getGeniusId());
            if (c15ajLJII != null) {
                c15ajLJII.LJLL(C13BV.INSTANCE, interfaceC20476615Am2, null);
            }
        }
        List<InterfaceC20476615Am> list2 = c20477515Av.LJ;
        ArrayList<InterfaceC20476615Am> arrayList2 = new ArrayList();
        for (InterfaceC20476615Am interfaceC20476615Am3 : list2) {
            if (c20477515Av.LJFF.keySet().contains(interfaceC20476615Am3.getGeniusId())) {
                arrayList2.add(interfaceC20476615Am3);
            }
        }
        for (InterfaceC20476615Am interfaceC20476615Am4 : arrayList2) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("animationFinish ");
            sbLIZ3.append(c20477515Av.LIZ);
            sbLIZ3.append(" update GeniusMode after animation");
            LJIIJ(C2188811AlT.LIZIZ(sbLIZ3), LJIIJJI(c20477515Av));
            C15AJ<InterfaceC20476615Am> c15ajLJII2 = LJII(interfaceC20476615Am4.getGeniusId());
            if (c15ajLJII2 != null) {
                c15ajLJII2.LLJLILLLLZIIL(interfaceC20476615Am4, "animationFinish", null);
            }
        }
        LJIILL(c20477515Av);
    }

    public final void LJIIJ(String str, boolean z) {
        if (z) {
            C20441214yg.LIZIZ(LJIIIZ(), str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL(C15AJ<? extends InterfaceC20476615Am> c15aj, Function0<Unit> function0) {
        View view;
        if (BugFixGuestShowdownAnimationContainerSetting.INSTANCE.isEnable()) {
            ViewParent parent = null;
            if ((c15aj instanceof View) && (view = (View) c15aj) != null) {
                parent = view.getParent();
            }
            if ((!Intrinsics.LJFF(parent, c15aj.getRoot())) || !((ArrayList) this.LJI).contains(c15aj)) {
                c15aj.LLLIILIL();
                ((ArrayList) this.LJI).remove(c15aj);
                ((ArrayList) this.LJI).add(c15aj);
            }
            function0.invoke();
            return;
        }
        if (!((ArrayList) this.LJI).contains(c15aj)) {
            c15aj.LLLIILIL();
            function0.invoke();
            ((ArrayList) this.LJI).add(c15aj);
            return;
        }
        function0.invoke();
    }

    public C20476915Ap(ViewGroup viewGroup, C20475815Ae c20475815Ae, C15AH c15ah) {
        this.LIZ = viewGroup;
        this.LIZIZ = c20475815Ae;
        this.LIZJ = c15ah;
    }

    public final C15AJ<InterfaceC20476615Am> LJI(EnumC20476415Ak enumC20476415Ak, ViewGroup viewGroup, InterfaceC20476615Am interfaceC20476615Am) {
        Object next;
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C15AJ) next).getGeniusId(), interfaceC20476615Am.getGeniusId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C15AJ<InterfaceC20476615Am> c15aj = (C15AJ) next;
        if (c15aj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createGeniusView id:");
            sbLIZ.append(interfaceC20476615Am.getGeniusId());
            sbLIZ.append(" has contains, only update model");
            LJIIJ(C2188811AlT.LIZIZ(sbLIZ), true);
            if (BugFixGuestShowdownAnimationContainerSetting.INSTANCE.isEnable() && viewGroup != null && !Intrinsics.LJFF(c15aj.getRoot(), viewGroup)) {
                c15aj.setRoot(viewGroup);
            }
            c15aj.W(interfaceC20476615Am);
            return c15aj;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createGeniusView id:");
        sbLIZ2.append(interfaceC20476615Am.getGeniusId());
        sbLIZ2.append(" root:");
        sbLIZ2.append(viewGroup);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ2), true);
        if (viewGroup == null) {
            return null;
        }
        C15AJ<InterfaceC20476615Am> c15ajLIZ = this.LIZJ.LIZ(enumC20476415Ak, viewGroup, interfaceC20476615Am);
        ((ArrayList) this.LJFF).add(c15ajLIZ);
        return c15ajLIZ;
    }
}
