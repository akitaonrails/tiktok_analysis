package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS170S0200000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import android.util.SparseArray;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0EBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360470EBh extends C0ETX<InterfaceC360540EBo, C360920EDa, C360990EDh, InterfaceC360940EDc> implements InterfaceC360540EBo {
    public static final C360530EBn LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public EnumC362260EIe LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0EBn] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C360470EBh.class, "panelDataApi", "getPanelDataApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/effects/transition/ui/VideoTransitionPanelDataApi;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C360470EBh.class, "editorProAdjustCanvasApi", "getEditorProAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0), new C2217381BqS(C360470EBh.class, "bottomBarApiComponent", "getBottomBarApiComponent()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0)};
        LLJLLL = new Object() { // from class: X.0EBn
        };
        LLJZIJLIL = 8;
    }

    public InterfaceC360540EBo M5() {
        return this;
    }

    private final C0EGY N5() {
        return (C0EGY) this.LLJLLIL.getValue(this, LLJZ[2]);
    }

    @Override // ge.i
    public Function0<C360920EDa> E3() {
        return new AwS549S0100000_5(this, 504);
    }

    public final InterfaceC362230EIb S5() {
        return (InterfaceC362230EIb) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJZ[1]);
    }

    public final C0EBZ U5() {
        return (C0EBZ) this.LLJJL.getValue(this, LLJZ[0]);
    }

    public final C360920EDa m6() {
        return (C360920EDa) this.LLJLL.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C360990EDh> o2() {
        return AFwS191S0000000_5.get$arr$(146);
    }

    public final void u6() {
        if (this.LLJLILLLLZIIL) {
            return;
        }
        this.LLJLILLLLZIIL = true;
        C0EBZ c0ebzU5 = U5();
        if (c0ebzU5 == null) {
            return;
        }
        c0ebzU5.O60().observe(this, new AObserverS170S0200000_5(c0ebzU5, this, 5));
        c0ebzU5.nv2().observe(this, new AObserverS170S0200000_5(c0ebzU5, this, 6));
        c0ebzU5.gm().observe(this, new AObserverS209S0100000_5(this, 58));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<InterfaceC360940EDc> w2() {
        return new AwS549S0100000_5(this, 503);
    }

    private final void P6() {
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        LiveEvent<Unit> liveEventGs1;
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (mutableLiveDataLIZ = c0e48F4.S7().LIZ("update_transition_select")) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 59));
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null && (liveEventGs1 = c0etqP4.Gs1()) != null) {
            liveEventGs1.LIZ(this, new AObjectS240S0100000_5(this, 78));
        }
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 == null || (liveEventEb1 = interfaceC357900E1kH4.eb1()) == null) {
            return;
        }
        liveEventEb1.LIZ(this, new AObjectS240S0100000_5(this, 79));
    }

    private final void T6() {
        InterfaceC362230EIb interfaceC362230EIbS5 = S5();
        if (interfaceC362230EIbS5 == null || !this.LLJL) {
            return;
        }
        EnumC362260EIe enumC362260EIePg0 = interfaceC362230EIbS5.pg0();
        EnumC362260EIe enumC362260EIe = EnumC362260EIe.MIN;
        if (enumC362260EIePg0 == enumC362260EIe) {
            interfaceC362230EIbS5.td1(EnumC362260EIe.MAX);
            this.LLJLIL = enumC362260EIe;
        }
    }

    public final void J6() {
        C0E48 c0e48F4;
        C360700ECe pageAdapter;
        SparseArray<AbstractC360500EBk> sparseArray;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL == null || (c0e48F4 = F4()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        C360690ECd c360690ECd = m6().LLLII;
        if (c360690ECd != null && (pageAdapter = c360690ECd.getPageAdapter()) != null && (sparseArray = pageAdapter.LLILZLL) != null) {
            C0FX4 c0fx4 = new C0FX4(sparseArray, 0);
            while (c0fx4.hasNext()) {
                AbstractC360500EBk abstractC360500EBk = (AbstractC360500EBk) c0fx4.next();
                if (abstractC360500EBk instanceof C0EBX) {
                    arrayList.addAll(((C0EBX) abstractC360500EBk).LLJLIL);
                }
            }
        }
        List listLLIIII = C13LP.LLIIII(C13LP.LLIIJI(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLLIIII) {
            if (true ^ a0.LJJJIL((String) obj)) {
                arrayList2.add(obj);
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj2 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            sb.append((String) obj2);
            if (i != arrayList2.size() - 1) {
                sb.append(",");
            }
            i = i2;
        }
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F4, new Pair(-1, -1));
        c0labLJFF.LJ("music_id", videoPublishEditModelLJJJLIIL.getMusicId());
        c0labLJFF.LJ("enter_from", videoPublishEditModelLJJJLIIL.getEnterFrom());
        c0labLJFF.LIZ(1, "is_editor_pro");
        c0labLJFF.LJ("transition_list", sb.toString());
        C20684815ws.LJIILLIIL("transition_show", c0labLJFF.LIZ);
    }

    public final void K6() {
        C0E48 c0e48F4;
        C0EBZ c0ebzU5;
        Pair<NLETrackSlot, NLETrackSlot> pairA60;
        NLETrackSlot first;
        boolean z;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL == null || (c0e48F4 = F4()) == null || (c0ebzU5 = U5()) == null || (pairA60 = c0ebzU5.A60(c0e48F4)) == null || (first = pairA60.getFirst()) == null) {
            return;
        }
        String extra = first.hasExtra("slot_extra_transition_effect_id") ? first.getExtra("slot_extra_transition_effect_id") : "";
        String extra2 = first.getExtra("slot_extra_transition_resource_category");
        String str = extra2 != null ? extra2 : "";
        ArrayList arrayList = new ArrayList();
        int size = c0e48F4.Rn().getSlots().size();
        int i = 0;
        while (i < size) {
            i++;
            arrayList.add(Integer.valueOf(i));
        }
        VecNLETrackSlotSPtr slots = c0e48F4.Rn().getSlots();
        if ((slots instanceof Collection) && slots.isEmpty()) {
            z = false;
        } else {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                if (it2.next().hasExtra("split_ref_name")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        C0E28.LIZ(videoPublishEditModelLJJJLIIL, c0e48F4, C1697810uHb.LJ(extra), "apply_to_all", arrayList, z, str);
    }

    public final void S6() {
        C0EBZ c0ebzU5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (c0ebzU5 = U5()) != null) {
            c0ebzU5.U60(this.LLJJJJJIL.getString(2131850732), c0e48F4);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(jCurrentTimeMillis2, "acc_advanced_edit_delete_transition_duration");
        C20684815ws.LJIILLIIL("acc_advanced_edit_delete_transition_duration", c0lab.LIZ);
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        C0E48 c0e48F4;
        super.onCreate();
        C0E48 c0e48F42 = F4();
        if ((c0e48F42 != null ? c0e48F42.LLLLLLIL() : null) != null && (c0e48F4 = F4()) != null) {
            c0e48F4.S7().LIZIZ(new C358740E4q(null, 0, null, false, 0, 254), "select_slot_event", false);
        }
        InterfaceC359940E9g interfaceC359940E9gAZ0 = N5().AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            interfaceC359940E9gAZ0.LIZ(false);
        }
        P6();
        d7(null);
        if (C357780E0y.LIZ()) {
            return;
        }
        T6();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC359940E9g interfaceC359940E9gAZ0 = N5().AZ0();
        if (interfaceC359940E9gAZ0 != null) {
            interfaceC359940E9gAZ0.LIZ(true);
        }
        super.onDestroy();
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        M5();
        return this;
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    private final ResourceItem d6(String str) {
        boolean z;
        C360690ECd c360690ECd;
        C360700ECe pageAdapter;
        SparseArray<AbstractC360500EBk> sparseArray;
        C0EDF c0edfLLLLIILL;
        C361100EDs resourceListAdapter;
        List<ResourceItem> listLLLFZ;
        ResourceItem next;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (c360690ECd = m6().LLLII) != null && (pageAdapter = c360690ECd.getPageAdapter()) != null && (sparseArray = pageAdapter.LLILZLL) != null) {
            C0FX4 c0fx4 = new C0FX4(sparseArray, 0);
            while (c0fx4.hasNext()) {
                AbstractC360500EBk abstractC360500EBk = (AbstractC360500EBk) c0fx4.next();
                if (abstractC360500EBk != null && (c0edfLLLLIILL = abstractC360500EBk.LLLLIILL()) != null && (resourceListAdapter = c0edfLLLLIILL.getResourceListAdapter()) != null && (listLLLFZ = resourceListAdapter.LLLFZ()) != null) {
                    Iterator<ResourceItem> it2 = listLLLFZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.getResourceId(), str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ResourceItem resourceItem = next;
                    if (resourceItem != null) {
                        return resourceItem;
                    }
                }
            }
        }
        return null;
    }

    public final void E5(String str) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null && (nLETrackSlotLJJLIIIJLLLLLLLZ = interfaceC351350Dq1LLFII.LJJLIIIJLLLLLLLZ()) != null && !C351220Dpo.LLLI("slot_extra_transition_resource_category", nLETrackSlotLJJLIIIJLLLLLLLZ)) {
            nLETrackSlotLJJLIIIJLLLLLLLZ.setExtra("slot_extra_transition_resource_category", str);
        }
    }

    public final float H5(float f) {
        return ((float) Math.floor(f * r3)) / 10;
    }

    public final void N6(String str) {
        Pair<NLETrackSlot, NLETrackSlot> pairA60;
        NLETrackSlot first;
        int i;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null) {
            if (C360510EBl.LIZ(str)) {
                C377120EqU c377120EqU = C377120EqU.LIZ;
                C0E48 c0e48F4 = F4();
                c377120EqU.getClass();
                C0LAB c0labLIZJ = C377120EqU.LIZJ(videoPublishEditModelLJJJLIIL, c0e48F4);
                c0labLIZJ.LJ("click_from", "ep_transition");
                c0labLIZJ.LJ("scenerio", "transition");
                C20684815ws.LJIILLIIL("click_ai_create_button", c0labLIZJ.LIZ);
                return;
            }
            C0EBZ c0ebzU5 = U5();
            if (c0ebzU5 == null || (pairA60 = c0ebzU5.A60(F4())) == null || (first = pairA60.getFirst()) == null) {
                return;
            }
            boolean zHasExtra = first.hasExtra("split_ref_name");
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null && (nLETrackRn = c0e48F42.Rn()) != null && (slots = nLETrackRn.getSlots()) != null) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next(), first)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
            } else {
                i = 0;
            }
            C0E48 c0e48F43 = F4();
            if (c0e48F43 == null) {
                return;
            }
            C0E28.LIZ(videoPublishEditModelLJJJLIIL, c0e48F43, new ArrayList(), "class_click", C1697810uHb.LJ(Integer.valueOf(i + 1)), zHasExtra, str);
        }
    }

    public final String R5(String str) {
        boolean z;
        int selectedTabPosition;
        String strLIZIZ;
        C0EJZ resourceMultiTab;
        C19U1 c19u1;
        ArrayList<C357590E0f> categoryList;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C360690ECd c360690ECd = m6().LLLII;
        String str2 = "";
        if (c360690ECd != null && (categoryList = c360690ECd.getCategoryList()) != null) {
            for (C357590E0f c357590E0f : categoryList) {
                List<ResourceItem> list = c357590E0f.LJI;
                if (list != null) {
                    Iterator<ResourceItem> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ResourceItem next = it2.next();
                            if (Intrinsics.LJFF(next.getResourceId(), str)) {
                                if (next != null && C123100dR.LIZ(c357590E0f.LIZIZ)) {
                                    String str3 = c357590E0f.LIZIZ;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    arrayList.add(str3);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C360690ECd c360690ECd2 = m6().LLLII;
        if (c360690ECd2 != null && (resourceMultiTab = c360690ECd2.getResourceMultiTab()) != null && (c19u1 = (C19U1) resourceMultiTab.findViewById(R.id.oq1)) != null) {
            selectedTabPosition = c19u1.getSelectedTabPosition();
        } else {
            selectedTabPosition = 0;
        }
        C360690ECd c360690ECd3 = m6().LLLII;
        if (c360690ECd3 != null && (strLIZIZ = c360690ECd3.LIZIZ(selectedTabPosition)) != null) {
            str2 = strLIZIZ;
        }
        if (!arrayList.contains(str2)) {
            return (String) C13LP.LJJJLZIJ(0, arrayList);
        }
        return str2;
    }

    public final void W6(String str) {
        i3(new AwS56S1000000_5(str, 14));
    }

    public final void d7(ArrayList<C357590E0f> arrayList) {
        Pair<NLETrackSlot, NLETrackSlot> pairA60;
        NLETrackSlot first;
        NLEResourceNode effectSDKTransition;
        String extra;
        ArrayList<C357590E0f> categoryList;
        C0EBZ c0ebzU5;
        C0EBZ c0ebzU52 = U5();
        NLEResourceNode effectSDKTransition2 = null;
        if (c0ebzU52 != null && (pairA60 = c0ebzU52.A60(F4())) != null && (first = pairA60.getFirst()) != null) {
            if (first.getEndTransition() == null) {
                first.removeExtraWithKey("slot_extra_transition_effect_id");
                first.removeExtraWithKey("slot_extra_transition_resource_category");
                first.removeExtraWithKey("slot_extra_transition_resource_id");
                C0EBZ c0ebzU53 = U5();
                if (c0ebzU53 != null) {
                    c0ebzU53.k8("");
                }
                C0EBZ c0ebzU54 = U5();
                if (c0ebzU54 != null) {
                    c0ebzU54.Eg2("");
                    return;
                }
                return;
            }
            NLESegmentTransition endTransition = first.getEndTransition();
            if (endTransition != null) {
                effectSDKTransition2 = endTransition.getEffectSDKTransition();
            }
            if (effectSDKTransition2 != null) {
                String extra2 = effectSDKTransition2.getExtra("biz_res_id");
                if (extra2 == null) {
                    extra2 = "";
                }
                if (u.LJJIIJZLJL(extra2, "urs", false)) {
                    NLESegmentTransition endTransition2 = first.getEndTransition();
                    if (endTransition2 == null || (effectSDKTransition = endTransition2.getEffectSDKTransition()) == null) {
                        return;
                    }
                    String extra3 = effectSDKTransition.getExtra("biz_res_id");
                    if (extra3 == null) {
                        extra3 = "";
                    }
                    if (!u.LJJIIJZLJL(extra3, "urs", false)) {
                        return;
                    }
                    if (effectSDKTransition == null || (extra = effectSDKTransition.getExtra("biz_res_id")) == null) {
                        extra = "";
                    }
                    String str = (String) C2742014i.LIZ(extra).get("resource_id");
                    if (str == null) {
                        return;
                    }
                    C360690ECd c360690ECd = m6().LLLII;
                    if (c360690ECd != null && (categoryList = c360690ECd.getCategoryList()) != null) {
                        for (C357590E0f c357590E0f : categoryList) {
                            List<ResourceItem> list = c357590E0f.LJI;
                            if (list != null) {
                                Iterator<ResourceItem> it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        ResourceItem next = it2.next();
                                        if (Intrinsics.LJFF(next.getResourceId(), str)) {
                                            if (next != null && (c0ebzU5 = U5()) != null) {
                                                String str2 = c357590E0f.LIZIZ;
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                c0ebzU5.k8(str2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C0EBZ c0ebzU55 = U5();
                    if (c0ebzU55 == null) {
                        return;
                    }
                    c0ebzU55.Eg2(str);
                    return;
                }
            }
            if (first.hasExtra("slot_extra_transition_resource_category") && C301740BsC.LIZ()) {
                C0EBZ c0ebzU56 = U5();
                if (c0ebzU56 != null) {
                    c0ebzU56.k8(first.getExtra("slot_extra_transition_resource_category"));
                }
            } else {
                C0EBZ c0ebzU57 = U5();
                if (c0ebzU57 != null) {
                    c0ebzU57.k8("");
                }
            }
            if (first.hasExtra("slot_extra_transition_resource_id")) {
                C0EBZ c0ebzU58 = U5();
                if (c0ebzU58 == null) {
                    return;
                }
                c0ebzU58.Eg2(first.getExtra("slot_extra_transition_resource_id"));
                return;
            }
            C0EBZ c0ebzU59 = U5();
            if (c0ebzU59 == null) {
                return;
            }
            c0ebzU59.Eg2("");
        }
    }

    public final void n7(String str) {
        long duration;
        double dDoubleValue;
        NLESegmentTransition endTransition;
        if (!this.LLJL) {
            return;
        }
        if (str != null && !a0.LJJJIL(str)) {
            C0EBZ c0ebzU5 = U5();
            if (c0ebzU5 == null) {
                return;
            }
            Pair pair = new Pair(100000L, Long.valueOf(c0ebzU5.af1(F4())));
            long jLongValue = ((Number) pair.getFirst()).longValue();
            long jLongValue2 = ((Number) pair.getSecond()).longValue();
            i3(new C360490EBj(jLongValue, jLongValue2));
            NLETrackSlot first = c0ebzU5.A60(F4()).getFirst();
            if (first != null && (endTransition = first.getEndTransition()) != null) {
                duration = endTransition.getDuration();
            } else {
                duration = 0;
            }
            ResourceItem resourceItemD6 = d6(str);
            if (resourceItemD6 == null) {
                return;
            }
            Double d = resourceItemD6.transitionDefaultDuration;
            if (d != null) {
                dDoubleValue = d.doubleValue();
            } else {
                dDoubleValue = 1.0d;
            }
            Pair pair2 = new Pair(Integer.valueOf((int) (H5(C352310DrZ.LIZIZ(jLongValue)) * 10.0f)), Integer.valueOf((int) (H5(C352310DrZ.LIZIZ(jLongValue2)) * 10.0f)));
            int iIntValue = ((Number) pair2.getFirst()).intValue();
            int iIntValue2 = ((Number) pair2.getSecond()).intValue();
            i3(AFwS234S0000000_5.get$arr$(207));
            i3(new C360480EBi(iIntValue, iIntValue2, duration, dDoubleValue));
            return;
        }
        i3(AFwS234S0000000_5.get$arr$(206));
    }

    public C360470EBh(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), C0EBZ.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        this.LLJL = true;
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 505));
        this.LLJLLIL = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
    }

    public final void L6(String str, String str2, String str3) {
        C0EBZ c0ebzU5;
        Pair<NLETrackSlot, NLETrackSlot> pairA60;
        NLETrackSlot first;
        int i;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null && (c0ebzU5 = U5()) != null && (pairA60 = c0ebzU5.A60(F4())) != null && (first = pairA60.getFirst()) != null) {
            boolean zHasExtra = first.hasExtra("split_ref_name");
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (nLETrackRn = c0e48F4.Rn()) != null && (slots = nLETrackRn.getSlots()) != null) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next(), first)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
            } else {
                i = 0;
            }
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null) {
                C0E28.LIZ(videoPublishEditModelLJJJLIIL, c0e48F42, C1697810uHb.LJ(str), str3, C1697810uHb.LJ(Integer.valueOf(i + 1)), zHasExtra, str2);
            }
        }
    }
}
