package X;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350840DpC extends AbstractC2255721DQs<C0EBZ> implements C0EBZ, InterfaceC379610EuV {
    public static final C350860DpE LLIZLLLIL = new Object() { // from class: X.0DpE
    };
    public static final int LLJ = 8;
    public final C1DRG LL;
    public String LLILZIL;
    public final MutableLiveData<String> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<String> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLILZ = new MutableLiveData<>();
    public boolean LLILZLL = true;
    public Map<String, List<String>> LLIZ = new LinkedHashMap();

    public C0EBZ W1() {
        return this;
    }

    @Override // X.C0EBZ
    public LiveData<String> O60() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C0EBZ
    public LiveData<String> gm() {
        return this.LLILLL;
    }

    @Override // X.C0EBZ
    public MutableLiveData<Unit> nv2() {
        return this.LLILZ;
    }

    @Override // X.C0EBZ
    public boolean qE0() {
        return this.LLILZLL;
    }

    @Override // X.C0EBZ
    public String tL0() {
        return this.LLILZIL;
    }

    public C350840DpC(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0EBZ
    public Pair<NLETrackSlot, NLETrackSlot> A60(C0E48 c0e48) {
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlotLJIILL = null;
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
            nLETrackSlotLJJLIIIJLLLLLLLZ = interfaceC351350Dq1LLFII.LJJLIIIJLLLLLLLZ();
        } else {
            nLETrackSlotLJJLIIIJLLLLLLLZ = null;
            if (c0e48 != null) {
            }
            return new Pair<>(nLETrackSlotLJJLIIIJLLLLLLLZ, nLETrackSlotLJIILL);
        }
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2 = c0e48.LLFII();
        if (interfaceC351350Dq1LLFII2 != null) {
            nLETrackSlotLJIILL = interfaceC351350Dq1LLFII2.LJIILL();
        }
        return new Pair<>(nLETrackSlotLJJLIIIJLLLLLLLZ, nLETrackSlotLJIILL);
    }

    @Override // X.C0EBZ
    public void AF0(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.C0EBZ
    public void Eg2(String str) {
        this.LLILLJJLI.setValue(str);
    }

    @Override // X.C0EBZ
    public int HL(C0E48 c0e48) {
        NLESegmentTransition endTransition;
        String extra;
        Integer numLJIIJJI;
        int i = C349360Dmo.LIZJ;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48.LLFII().LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ != null && (endTransition = nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTransition()) != null && (extra = endTransition.getExtra("transition_position")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(extra)) != null) {
            return numLJIIJJI.intValue();
        }
        return 0;
    }

    @Override // X.C0EBZ
    public String Qa2(C0E48 c0e48) {
        NLESegmentTransition endTransition;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48.LLFII().LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ != null && (endTransition = nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTransition()) != null) {
            return endTransition.getExtra("transition_name");
        }
        return "";
    }

    @Override // X.C0EBZ
    public boolean R52(String str) {
        return Intrinsics.LJFF(str, "ai_transition");
    }

    @Override // X.C0EBZ
    public void Rb2(String str) {
        this.LLILZIL = str;
    }

    @Override // X.C0EBZ
    public long af1(C0E48 c0e48) {
        long duration;
        long j = 0;
        if (c0e48 == null) {
            return 0L;
        }
        int i = C349360Dmo.LIZJ;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48.LLFII().LJJLIIIJLLLLLLLZ();
        NLETrackSlot nLETrackSlotLJIILL = c0e48.LLFII().LJIILL();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ != null && nLETrackSlotLJIILL != null) {
            if (nLETrackSlotLJJLIIIJLLLLLLLZ.getDuration() > nLETrackSlotLJIILL.getDuration()) {
                duration = nLETrackSlotLJIILL.getDuration() / ((long) 2);
            } else {
                duration = nLETrackSlotLJJLIIIJLLLLLLLZ.getDuration() / ((long) 2);
            }
            j = C349360Dmo.LIZ;
            if (duration <= j) {
                return duration;
            }
        }
        return j;
    }

    @Override // X.C0EBZ
    public void dG(C0E48 c0e48) {
        NLESegmentTransition endTransition;
        C350820DpA c350820DpA;
        String resourceFile;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ;
        NLESegmentTransition endTransition2;
        NLEResourceNode effectSDKTransition;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ2 = c0e48.LLFII().LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ2 != null) {
            endTransition = nLETrackSlotLJJLIIIJLLLLLLLZ2.getEndTransition();
        } else {
            endTransition = null;
        }
        boolean zLIZ = C347020Dj2.LIZ(endTransition);
        if (endTransition == null) {
            c350820DpA = new C350820DpA("", 0, "", 0L, false, null, null, null, 992);
        } else {
            String extra = endTransition.getExtra("transition_tab");
            String str = "";
            if (extra == null) {
                extra = "";
            }
            String extra2 = endTransition.getExtra("transition_name");
            List<NLETrackSlot> listLJFF = C352250DrT.LJFF(C350870DpF.LJI(c0e48));
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJFF) {
                if (C352250DrT.LJIILIIL((NLETrackSlot) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((NLENode) it2.next()).getUUID());
            }
            int iHL = HL(c0e48);
            NLEResourceNode effectSDKTransition2 = endTransition.getEffectSDKTransition();
            if (effectSDKTransition2 == null || (resourceFile = effectSDKTransition2.getResourceFile()) == null) {
                resourceFile = "";
            }
            long transitionDuration = endTransition.getTransitionDuration();
            boolean overlap = endTransition.getOverlap();
            String extra3 = nLETrackSlotLJJLIIIJLLLLLLLZ2.getExtra("slot_extra_transition_effect_id");
            if (extra3 == null) {
                extra3 = "";
            }
            String extra4 = nLETrackSlotLJJLIIIJLLLLLLLZ2.getExtra("slot_extra_transition_resource_id");
            if (extra4 != null) {
                str = extra4;
            }
            c350820DpA = new C350820DpA(extra, iHL, resourceFile, transitionDuration, overlap, extra3, extra2, str, nLETrackSlotLJJLIIIJLLLLLLLZ2.hasExtra("ep_transition_cache_duration"), arrayList2);
        }
        long maxEnd = c0e48.Rn().getMaxEnd();
        long jJh = c0e48.getPlayer().Jh();
        c0e48.LLFII().LJJLIIIJILLIZJL(c350820DpA, EnumC356070Dxd.NONE);
        if (zLIZ && !((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C351510DqH.LJIIIZ(C351510DqH.LIZ, c0e48);
        }
        if (c0e48.Rn().getMaxEnd() > maxEnd) {
            C351510DqH.LIZ.getClass();
            C351510DqH.LIZIZ(maxEnd, c0e48);
        }
        if (endTransition != null && (nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48.LLFII().LJJLIIIJLLLLLLLZ()) != null && nLETrackSlotLJJLIIIJLLLLLLLZ.hasExtra("slot_extra_transition_resource_id")) {
            String extra5 = nLETrackSlotLJJLIIIJLLLLLLLZ.getExtra("slot_extra_transition_resource_id");
            if (!TextUtils.isEmpty(extra5)) {
                for (NLETrackSlot nLETrackSlot : c0e48.Rn().getSlots()) {
                    if (nLETrackSlot != null && (endTransition2 = nLETrackSlot.getEndTransition()) != null && (effectSDKTransition = endTransition2.getEffectSDKTransition()) != null) {
                        effectSDKTransition.setExtra("biz_res_id", C0FGD.LIZ(extra5, "editor_pro_transition"));
                    }
                }
            }
        }
        C350870DpF.LJI(c0e48).setExtra("is_editorpro_transition", "true");
        C0E1X c0e1x = new C0E1X(C0E1V.APPLY_TO_ALL.getNameId(), null, null, null, "apply_to_all", 14);
        c0e48.getPlayer().skipNextSeek(true);
        C350410DoV.LIZLLL(c0e48.LLFII().LJI(), true, C051R.LIZIZ(c0e1x), false, true);
        c0e48.getPlayer().skipNextSeek(false);
        c0e48.getPlayer().LJIJ(Math.min(jJh, C352310DrZ.LIZ(c0e48.Rn().getMaxEnd())), Boolean.TRUE, null);
    }

    @Override // X.C0EBZ
    public void k8(String str) {
        this.LLILLL.setValue(str);
    }

    @Override // X.C0EBZ
    public String oP0(C0E48 c0e48) {
        String uuid;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48.LLFII().LJJLIIIJLLLLLLLZ();
        NLETrackSlot nLETrackSlotLJIILL = c0e48.LLFII().LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String uuid2 = null;
        if (nLETrackSlotLJJLIIIJLLLLLLLZ != null) {
            uuid = nLETrackSlotLJJLIIIJLLLLLLLZ.getUUID();
        } else {
            uuid = null;
        }
        sbLIZ.append(uuid);
        sbLIZ.append(':');
        if (nLETrackSlotLJIILL != null) {
            uuid2 = nLETrackSlotLJIILL.getUUID();
        }
        sbLIZ.append(uuid2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0EBZ
    public List<String> ox1(C0E48 c0e48) {
        if (c0e48 == null) {
            return null;
        }
        return this.LLIZ.get(oP0(c0e48));
    }

    @Override // X.C0EBZ
    public String v22(C0E48 c0e48) {
        NLESegmentTransition endTransition;
        String extra;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48.LLFII().LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ == null || (endTransition = nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTransition()) == null || (extra = endTransition.getExtra("transition_tab")) == null) {
            return "";
        }
        return extra;
    }

    @Override // X.C0EBZ
    public void LN0(List<String> list, C0E48 c0e48) {
        if (c0e48 == null) {
            return;
        }
        String strOP0 = oP0(c0e48);
        if (strOP0.length() == 0) {
            return;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().length() == 0) {
                    return;
                }
            }
        }
        this.LLIZ.put(strOP0, list);
    }

    @Override // X.C0EBZ
    public void SW1(C0E48 c0e48, int i) {
        NLESegmentTransition endTransition;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48.LLFII().LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ != null && (endTransition = nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTransition()) != null) {
            endTransition.setExtra("transition_position", String.valueOf(i));
        }
    }

    @Override // X.C0EBZ
    public void U60(String str, C0E48 c0e48) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ;
        if (c0e48 == null || (nLETrackSlotLJJLIIIJLLLLLLLZ = (interfaceC351350Dq1LLFII = c0e48.LLFII()).LJJLIIIJLLLLLLLZ()) == null) {
            return;
        }
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ2 = interfaceC351350Dq1LLFII.LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ2 != null && nLETrackSlotLJJLIIIJLLLLLLLZ2.getEndTransition() != null) {
            interfaceC351350Dq1LLFII.LJJLJLI();
            C350870DpF.LJI(c0e48).setExtra("is_editorpro_transition", "true");
            C350410DoV.LIZLLL(c0e48.LLFII().LJI(), true, C051R.LIZIZ(new C0E1X(C0E1V.VIDEO_TRANSITION.getNameId(), null, null, str, "click", 6)), false, true);
            c0e48.getPlayer().LJIJI(nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTime(), new C0FX3(c0e48, 5));
            return;
        }
        c0e48.getPlayer().LJIJI(nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTime(), new C0FX3(c0e48, 4));
    }

    @Override // X.C0EBZ
    public void V20(C350820DpA c350820DpA, C0E48 c0e48) {
        NLESegmentTransition endTransition;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ;
        NLESegmentTransition endTransition2;
        NLEResourceNode effectSDKTransition;
        NLEResourceNode effectSDKTransition2;
        if (c0e48 == null) {
            return;
        }
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII = c0e48.LLFII();
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ2 = interfaceC351350Dq1LLFII.LJJLIIIJLLLLLLLZ();
        String resourceFile = null;
        if (nLETrackSlotLJJLIIIJLLLLLLLZ2 != null) {
            endTransition = nLETrackSlotLJJLIIIJLLLLLLLZ2.getEndTransition();
        } else {
            endTransition = null;
        }
        String str = c350820DpA.LIZJ;
        long j = c350820DpA.LIZLLL;
        boolean z = c350820DpA.LJ;
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ3 = interfaceC351350Dq1LLFII.LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ3 == null) {
            return;
        }
        if (endTransition != null && (effectSDKTransition2 = endTransition.getEffectSDKTransition()) != null) {
            resourceFile = effectSDKTransition2.getResourceFile();
        }
        if (Intrinsics.LJFF(resourceFile, str) && endTransition.getTransitionDuration() == j) {
            interfaceC351350Dq1LLFII.LJJIJIIJI(j);
            return;
        }
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c0e48).deepClone());
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLJJLIIIJLLLLLLLZ3.deepClone());
        long maxEnd = c0e48.Rn().getMaxEnd();
        interfaceC351350Dq1LLFII.LLJILLL(c350820DpA, EnumC356070Dxd.NONE);
        interfaceC351350Dq1LLFII.LJLLILLLL(nLEModelDynamicCast, nLETrackSlotDynamicCast, c0e48);
        if (z && !((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C351510DqH.LJIIIZ(C351510DqH.LIZ, c0e48);
        }
        if (c0e48.Rn().getMaxEnd() > maxEnd) {
            C351510DqH.LIZ.getClass();
            C351510DqH.LIZIZ(maxEnd, c0e48);
        }
        C350870DpF.LJI(c0e48).setExtra("is_editorpro_transition", "true");
        if (!TextUtils.isEmpty(c350820DpA.LJII) && (nLETrackSlotLJJLIIIJLLLLLLLZ = interfaceC351350Dq1LLFII.LJJLIIIJLLLLLLLZ()) != null && (endTransition2 = nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTransition()) != null && (effectSDKTransition = endTransition2.getEffectSDKTransition()) != null) {
            effectSDKTransition.setExtra("biz_res_id", C0FGD.LIZ(c350820DpA.LJII, "editor_pro_transition"));
        }
        String str2 = c350820DpA.LJI;
        if (str2 == null) {
            str2 = "";
        }
        C350410DoV.LIZLLL(c0e48.LLFII().LJI(), true, C051R.LIZIZ(new C0E1X(C0E1V.VIDEO_TRANSITION.getNameId(), null, null, str2, "click", 6)), false, true);
        interfaceC351350Dq1LLFII.LJJIJIIJI(j);
    }

    @Override // X.C0EBZ
    public void ox0(C0E48 c0e48, String str) {
        NLETrackSlot nLETrackSlotLJJLIIIJLLLLLLLZ = c0e48.LLFII().LJJLIIIJLLLLLLLZ();
        if (nLETrackSlotLJJLIIIJLLLLLLLZ != null) {
            NLESegmentTransition endTransition = nLETrackSlotLJJLIIIJLLLLLLLZ.getEndTransition();
            if (endTransition != null) {
                endTransition.setExtra("transition_tab", str);
            }
            nLETrackSlotLJJLIIIJLLLLLLLZ.setExtra("slot_extra_transition_resource_category", str);
        }
    }

    @Override // X.C0EBZ
    public void rk1(long j, C0E48 c0e48) {
        NLESegmentTransition endTransition;
        if (c0e48 == null) {
            return;
        }
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII = c0e48.LLFII();
        NLETrackSlot first = A60(c0e48).getFirst();
        if (first == null || (endTransition = first.getEndTransition()) == null) {
            return;
        }
        boolean zLIZ = C347020Dj2.LIZ(endTransition);
        long maxEnd = c0e48.Rn().getMaxEnd();
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c0e48).deepClone());
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(first.deepClone());
        interfaceC351350Dq1LLFII.LJLJLJ(j, EnumC356070Dxd.NONE);
        if (c0e48.Rn().getMaxEnd() > maxEnd) {
            C351510DqH.LIZ.getClass();
            C351510DqH.LIZIZ(maxEnd, c0e48);
        }
        interfaceC351350Dq1LLFII.LJLLILLLL(nLEModelDynamicCast, nLETrackSlotDynamicCast, c0e48);
        if (zLIZ && !((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C351510DqH.LJIIIZ(C351510DqH.LIZ, c0e48);
        }
        C350870DpF.LIZ(c0e48, true);
        C350410DoV.LIZJ(interfaceC351350Dq1LLFII.LJI(), C0E1V.VIDEO_TRANSITION_UPDATE.getNameId(), true, 1);
        c0e48.LLFII().LJJIJIIJI(endTransition.getDuration());
    }
}
