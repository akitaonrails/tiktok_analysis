package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS0S0001001_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358200E2o extends C0ETX<InterfaceC358240E2s, C0EBN, C358230E2r, C358270E2v> implements InterfaceC358240E2s {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final int LLJLLL;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public C0EBN LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public boolean LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C358200E2o.class, "filterDataApi", "getFilterDataApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/effects/filter/ui/FilterPanelDataApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C358200E2o.class, "editFavoriteApi", "getEditFavoriteApi()Lcom/ss/ugc/android/editor/base/resource/base/EditPanelFavoriteApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C358200E2o.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/effects/filter/ui/FilterPanelContext;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJLLL = 8;
    }

    private final void d6() {
        i3(AFwS234S0000000_5.get$arr$(201));
    }

    private final VideoPublishEditModel getEditModel() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    @Override // ge.i
    public Function0<C0EBN> E3() {
        return new AwS549S0100000_5(this, 445);
    }

    public final InterfaceC361290EEl R5() {
        return (InterfaceC361290EEl) this.LLJL.getValue(this, LLJLLIL[1]);
    }

    public final InterfaceC358190E2n S5() {
        return (InterfaceC358190E2n) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLLIL[0]);
    }

    public final C360010E9n U5() {
        return (C360010E9n) this.LLJLIL.getValue(this, LLJLLIL[2]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C358230E2r> o2() {
        return AFwS191S0000000_5.get$arr$(140);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C358270E2v> w2() {
        return new AwS549S0100000_5(this, 444);
    }

    private final void m6() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C358210E2p(this, null), 3);
    }

    private final void u6() {
        LiveEvent<ResourceItem> liveEventNf0;
        LiveData<Map<String, List<ResourceItem>>> liveDataAr2;
        LiveData<String> liveDataGm;
        LiveData<String> liveDataXF2;
        InterfaceC358190E2n interfaceC358190E2nS5 = S5();
        if (interfaceC358190E2nS5 != null && (liveDataXF2 = interfaceC358190E2nS5.xF2()) != null) {
            liveDataXF2.observe(this, new AObserverS209S0100000_5(this, 52));
        }
        InterfaceC358190E2n interfaceC358190E2nS52 = S5();
        if (interfaceC358190E2nS52 != null && (liveDataGm = interfaceC358190E2nS52.gm()) != null) {
            liveDataGm.observe(this, new AObserverS209S0100000_5(this, 53));
        }
        InterfaceC358190E2n interfaceC358190E2nS53 = S5();
        if (interfaceC358190E2nS53 != null && (liveDataAr2 = interfaceC358190E2nS53.Ar2()) != null) {
            liveDataAr2.observe(this, new AObserverS209S0100000_5(this, 54));
        }
        InterfaceC358190E2n interfaceC358190E2nS54 = S5();
        if (interfaceC358190E2nS54 == null || (liveEventNf0 = interfaceC358190E2nS54.nf0()) == null) {
            return;
        }
        liveEventNf0.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 71));
    }

    public final void H5() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        InterfaceC358190E2n interfaceC358190E2nS5;
        LiveData<String> liveDataXF2;
        String value;
        C0E48 c0e48F4;
        C0E55 player;
        C0E48 c0e48F42 = F4();
        if (c0e48F42 == null || (nLETrackSlotLLLLLLIL = c0e48F42.LLLLLLIL()) == null || (interfaceC358190E2nS5 = S5()) == null || (liveDataXF2 = interfaceC358190E2nS5.xF2()) == null || (value = liveDataXF2.getValue()) == null || value.length() == 0) {
            return;
        }
        EditModelProvider.Companion.getClass();
        C355510Dwj filterController$tools_camera_edit_release = C0E1T.LIZ().getFilterController$tools_camera_edit_release();
        if (filterController$tools_camera_edit_release != null) {
            C0E48 c0e48F43 = F4();
            NLETrack nLETrackPt = c0e48F43 != null ? c0e48F43.Pt() : null;
            C0E48 c0e48F44 = F4();
            if (c0e48F44 != null && (player = c0e48F44.getPlayer()) != null) {
                player.pause(false);
            }
            C0E48 c0e48F45 = F4();
            NLEModel nLEModelLJI = c0e48F45 != null ? C350870DpF.LJI(c0e48F45) : null;
            C0E48 c0e48F46 = F4();
            filterController$tools_camera_edit_release.LIZJ(nLEModelLJI, c0e48F46 != null ? c0e48F46.LLLLLLIL() : null);
            if (C351220Dpo.LLJ(nLETrackSlotLLLLLLIL) && (c0e48F4 = F4()) != null) {
                NLETrackType nLETrackType = NLETrackType.NONE;
                c0e48F4.S7().LIZIZ(new C0EB9(nLETrackPt, nLETrackSlotLLLLLLIL), "delete_slot_event", false);
            }
        }
        InterfaceC358190E2n interfaceC358190E2nS52 = S5();
        if (interfaceC358190E2nS52 != null) {
            interfaceC358190E2nS52.xY0(null);
        }
    }

    public final void N6() {
        LiveData<String> liveDataXF2;
        InterfaceC358190E2n interfaceC358190E2nS5 = S5();
        i3(new AwS56S1000000_5((interfaceC358190E2nS5 == null || (liveDataXF2 = interfaceC358190E2nS5.xF2()) == null) ? null : liveDataXF2.getValue(), 13));
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        m6();
        u6();
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    private final void L6(String str) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLESegmentComposerFilter nLESegmentComposerFilterLJJIZ;
        String extra;
        Integer numLJIIJJI;
        C0EBN c0ebn;
        C360690ECd c360690ECd;
        ArrayList<C357590E0f> categoryList;
        ResourceItem next;
        NLESegmentComposerFilter nLESegmentComposerFilterLJJIZ2;
        NLESegmentComposerFilter nLESegmentComposerFilterLJJIZ3;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        float fLJJIIJ = 0.8f;
        if (nLETrackSlotLLLLLLIL != null && (nLESegmentComposerFilterLJJIZ3 = C351220Dpo.LJJIZ(nLETrackSlotLLLLLLIL)) != null) {
            fLJJIIJ = C351220Dpo.LJJIIJ(nLESegmentComposerFilterLJJIZ3);
        }
        int iIntValue = 80;
        if (C376950EqD.LIZ(getEditModel()) && (c0ebn = this.LLJJL) != null && (c360690ECd = c0ebn.LLJJLIIIJLLLLLLLZ) != null && (categoryList = c360690ECd.getCategoryList()) != null) {
            Iterator<C357590E0f> it2 = categoryList.iterator();
            while (it2.hasNext()) {
                List<ResourceItem> list = it2.next().LJI;
                if (list != null) {
                    Iterator<ResourceItem> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
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
                        String str2 = resourceItem.extra;
                        if (str2 == null) {
                            str2 = "";
                        }
                        List<Pair<String, Integer>> listLJJJJIZL = C351220Dpo.LJJJJIZL(str2);
                        if (listLJJJJIZL != null) {
                            for (Pair<String, Integer> pair : listLJJJJIZL) {
                                int i = 100;
                                if (pair.getSecond().intValue() != 100) {
                                    if (pair.getSecond().intValue() == 0) {
                                        i = 0;
                                    } else {
                                        i = 80;
                                    }
                                }
                                if (nLETrackSlotLLLLLLIL != null && (nLESegmentComposerFilterLJJIZ2 = C351220Dpo.LJJIZ(nLETrackSlotLLLLLLIL)) != null) {
                                    nLESegmentComposerFilterLJJIZ2.setExtra("filter_business_intensity", String.valueOf(i));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (nLETrackSlotLLLLLLIL != null && (nLESegmentComposerFilterLJJIZ = C351220Dpo.LJJIZ(nLETrackSlotLLLLLLIL)) != null && (extra = nLESegmentComposerFilterLJJIZ.getExtra("filter_business_intensity")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(extra)) != null && (iIntValue = numLJIIJJI.intValue()) == 0) {
            d6();
        } else {
            i3(new AwS0S0001001_5(fLJJIIJ, iIntValue, 0));
        }
    }

    private final String N5(String str) {
        boolean z;
        int selectedTabPosition;
        C360690ECd c360690ECd;
        String strLIZIZ;
        C360690ECd c360690ECd2;
        C0EJZ resourceMultiTab;
        C19U1 c19u1;
        C360690ECd c360690ECd3;
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
        C0EBN c0ebn = this.LLJJL;
        String str2 = "";
        if (c0ebn != null && (c360690ECd3 = c0ebn.LLJJLIIIJLLLLLLLZ) != null && (categoryList = c360690ECd3.getCategoryList()) != null) {
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
        C0EBN c0ebn2 = this.LLJJL;
        if (c0ebn2 != null && (c360690ECd2 = c0ebn2.LLJJLIIIJLLLLLLLZ) != null && (resourceMultiTab = c360690ECd2.getResourceMultiTab()) != null && (c19u1 = (C19U1) resourceMultiTab.findViewById(R.id.oq1)) != null) {
            selectedTabPosition = c19u1.getSelectedTabPosition();
        } else {
            selectedTabPosition = 0;
        }
        C0EBN c0ebn3 = this.LLJJL;
        if (c0ebn3 != null && (c360690ECd = c0ebn3.LLJJLIIIJLLLLLLLZ) != null && (strLIZIZ = c360690ECd.LIZIZ(selectedTabPosition)) != null) {
            str2 = strLIZIZ;
        }
        if (!arrayList.contains(str2)) {
            return (String) C13LP.LJJJLZIJ(0, arrayList);
        }
        return str2;
    }

    public final void E5(int i) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && C350870DpF.LJI(c0e48F42).getTrackBySlot(nLETrackSlotLLLLLLIL) != null) {
            boolean zLLJ = C351220Dpo.LLJ(nLETrackSlotLLLLLLIL);
            boolean z = !zLLJ;
            if (!zLLJ && !z) {
                return;
            }
            float f = i / 100.0f;
            C0E48 c0e48F43 = F4();
            if (c0e48F43 != null && (interfaceC351350Dq1LLFII = c0e48F43.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LJJJLZIJ(zLLJ, nLETrackSlotLLLLLLIL, f, true, EnumC356070Dxd.COMMIT);
            }
            i3(new AwS20S0001000_5(i, 14));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[PHI: r1
      0x0031: PHI (r1v8 float) = (r1v7 float), (r1v12 float) binds: [B:8:0x001f, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J6(int r13) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358200E2o.J6(int):void");
    }

    public final void K6(String str) {
        String str2;
        List<ResourceItem> list;
        LiveData<Map<String, List<ResourceItem>>> liveDataAr2;
        Map<String, List<ResourceItem>> value;
        LiveData<String> liveDataGm;
        String value2;
        String str3 = "";
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        InterfaceC358190E2n interfaceC358190E2nS5 = S5();
        if (interfaceC358190E2nS5 != null && (liveDataAr2 = interfaceC358190E2nS5.Ar2()) != null && (value = liveDataAr2.getValue()) != null) {
            InterfaceC358190E2n interfaceC358190E2nS52 = S5();
            if (interfaceC358190E2nS52 != null && (liveDataGm = interfaceC358190E2nS52.gm()) != null && (value2 = liveDataGm.getValue()) != null) {
                str3 = value2;
            }
            list = value.get(str3);
        } else {
            list = null;
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProFilter id=");
        sbLIZ.append(str);
        sbLIZ.append(", showFilters=");
        sbLIZ.append(list);
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        if (list != null && !list.isEmpty() && str != null && str.length() != 0) {
            L6(str2);
        } else {
            d6();
        }
    }

    public final void M5(NLETrackSlot nLETrackSlot) {
        NLESegmentComposerFilter nLESegmentComposerFilterLJJIZ = C351220Dpo.LJJIZ(nLETrackSlot);
        if (nLESegmentComposerFilterLJJIZ != null && !C351220Dpo.LLLI("filter_category", nLESegmentComposerFilterLJJIZ)) {
            String strLJJJJJ = C351220Dpo.LJJJJJ(nLETrackSlot);
            String str = "";
            if (strLJJJJJ == null) {
                strLJJJJJ = "";
            }
            String strN5 = N5(strLJJJJJ);
            if (strN5 != null) {
                str = strN5;
            }
            NLESegmentComposerFilter nLESegmentComposerFilterLJJIZ2 = C351220Dpo.LJJIZ(nLETrackSlot);
            if (nLESegmentComposerFilterLJJIZ2 != null) {
                nLESegmentComposerFilterLJJIZ2.setExtra("filter_category", str);
            }
        }
    }

    public final void k8(String str) {
        i3(new AwS56S1000000_5(str, 12));
    }

    public C358200E2o(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC358190E2n.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361290EEl.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), C360010E9n.class, null);
        this.LLJLILLLLZIIL = C289190BVd.LIZ(getEditModel());
    }
}
