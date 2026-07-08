package X;

import Y.AObjectS240S0100000_5;
import Y.AObjectS302S0200000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.track.SeekInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS59S0210000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zoo.b;

/* JADX INFO: renamed from: X.0E0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357700E0q extends C0ETX<C0E11, C360890ECx, C357930E1n, InterfaceC360910ECz> implements C0E11 {
    public static final C357790E0z LLLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public static final int LLLIL;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C0E0N LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public DialogC1390150mHN LLJLLL;
    public String LLJZ;
    public boolean LLJZIJLIL;
    public String LLL;
    public final InterfaceC1731706qJ LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C357640E0k LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public final C0E1G LLLIIIIL;
    public String LLLIIIL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0E0z] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C357700E0q.class, "panelDataApi", "getPanelDataApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/magic/logic/MagicDataApi;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C357700E0q.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/magic/logic/MagicPanelContext;", 0), new C2217381BqS(C357700E0q.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0), new C2217381BqS(C357700E0q.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0), new C2217381BqS(C357700E0q.class, "epPanelHeightApi", "getEpPanelHeightApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelHeightApiComponent;", 0)};
        LLLIIL = new Object() { // from class: X.0E0z
        };
        LLLIL = 8;
    }

    public final void N5() {
        s7(true);
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
    }

    public C0E11 R5() {
        return this;
    }

    @Override // X.C0ETX
    public void n5() {
        s7(true);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC360570EBr interfaceC360570EBrU6;
        this.LLJLLL = null;
        C0E0G c0e0gT6 = T6();
        if (c0e0gT6 != null) {
            c0e0gT6.qn0();
        }
        InterfaceC361710EGb interfaceC361710EGbW6 = W6();
        if (interfaceC361710EGbW6 != null) {
            interfaceC361710EGbW6.LR1(true);
        }
        InterfaceC361710EGb interfaceC361710EGbW62 = W6();
        if (interfaceC361710EGbW62 != null) {
            interfaceC361710EGbW62.sc0(this.LLLIIIIL);
        }
        if (C357780E0y.LIZ() && (interfaceC360570EBrU6 = u6()) != null) {
            interfaceC360570EBrU6.ec1();
        }
        super.onDestroy();
    }

    private final InterfaceC360570EBr u6() {
        return (InterfaceC360570EBr) this.LLLIIII.getValue(this, LLLIILIL[4]);
    }

    @Override // ge.i
    public Function0<C360890ECx> E3() {
        return new AwS549S0100000_5(this, 368);
    }

    public final InterfaceC355850DxH K6() {
        return (InterfaceC355850DxH) this.LLLFZ.getValue();
    }

    public final C0EG3 L6() {
        return (C0EG3) this.LLLFF.getValue();
    }

    public final C360890ECx P6() {
        return (C360890ECx) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C360030E9p S6() {
        return (C360030E9p) this.LLJLL.getValue(this, LLLIILIL[1]);
    }

    public final C0E0G T6() {
        return (C0E0G) this.LLJLILLLLZIIL.getValue(this, LLLIILIL[0]);
    }

    public final C0E0B U5() {
        return (C0E0B) this.LLLI.getValue();
    }

    public final InterfaceC361710EGb W6() {
        return (InterfaceC361710EGb) this.LLLF.getValue(this, LLLIILIL[3]);
    }

    public final AsyncTasksPanelViewModel d6() {
        return (AsyncTasksPanelViewModel) this.LLJL.getValue();
    }

    public final C357580E0e k7() {
        return (C357580E0e) this.LLLFFI.getValue();
    }

    public final boolean m6() {
        return ((Boolean) this.LLJJL.getValue()).booleanValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C357930E1n> o2() {
        return AFwS191S0000000_5.get$arr$(114);
    }

    public final C0E5S o7() {
        return (C0E5S) this.LLJLLIL.getValue(this, LLLIILIL[2]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<InterfaceC360910ECz> w2() {
        return new AwS549S0100000_5(this, 367);
    }

    private final void L7() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null) {
            return;
        }
        this.LLL = nLETrackSlotLLLLLLIL.getExtra("ep_magic_resource_id");
    }

    private final Pair<Boolean, String> S5() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String strFw1;
        ResourceItem next;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        C0E0G c0e0gT6 = T6();
        if (c0e0gT6 == null || (strFw1 = c0e0gT6.fw1(nLETrackSlotLLLLLLIL)) == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        String str = (String) C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(strFw1, new String[]{","}, 0, 6));
        if (str == null || str.length() == 0) {
            return new Pair<>(Boolean.FALSE, null);
        }
        Iterator<? extends ResourceItem> it2 = k7().LIZJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.getResourceId(), str)) {
                break;
            }
        }
        ResourceItem resourceItem = next;
        return new Pair<>(Boolean.TRUE, resourceItem != null ? resourceItem.getName() : null);
    }

    private final void h8() {
        LiveEvent<Unit> liveEventL72;
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        MutableLiveData mutableLiveDataLIZ;
        MutableLiveData mutableLiveDataLIZ2;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (mutableLiveDataLIZ2 = c0e48F4.S7().LIZ("selected_nle_track_slot")) != null) {
            mutableLiveDataLIZ2.observe(this, new AObserverS209S0100000_5(this, 38));
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (mutableLiveDataLIZ = c0e48F42.S7().LIZ("magic_changed_event")) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 39));
        }
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 != null && (liveEventEb1 = interfaceC357900E1kH4.eb1()) != null) {
            liveEventEb1.LIZ(this, new AObjectS240S0100000_5(this, 59));
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 == null || (liveEventL72 = c0etqP4.L72()) == null) {
            return;
        }
        liveEventL72.LIZ(this, new AObjectS302S0200000_5(new AObjectS240S0100000_5(this, 60), liveEventL72, 8));
    }

    private final void r8() {
        if (P6().LLLILZLLLI == null || (!r0.getCurrentSelectItems().isEmpty())) {
            o8(C0E1V.MAGIC, this.LLJJJJJIL.getString(2131850732));
        }
    }

    private final boolean y7() {
        C0EDF c0edf = P6().LLLILZLLLI;
        return (c0edf != null && (c0edf.getCurrentSelectItems().isEmpty() ^ true)) || S5().getFirst().booleanValue();
    }

    public final String J6() {
        C361100EDs resourceListAdapter;
        ResourceItem resourceItem;
        C357590E0f category;
        String str;
        C0EDF c0edf = P6().LLLILZLLLI;
        return (c0edf == null || (resourceListAdapter = c0edf.getResourceListAdapter()) == null || (resourceItem = (ResourceItem) C13LP.LJJJLL(resourceListAdapter.LLLFZ())) == null || (category = resourceItem.getCategory()) == null || (str = category.LIZIZ) == null) ? "" : str;
    }

    public final void n9() {
        i3(new AwS20S0010000_5(y7(), 18));
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        C0E48 c0e48F4;
        InterfaceC360570EBr interfaceC360570EBrU6;
        super.onCreate();
        if (C357780E0y.LIZ() && (interfaceC360570EBrU6 = u6()) != null) {
            interfaceC360570EBrU6.rO2(false, true);
        }
        InterfaceC361710EGb interfaceC361710EGbW6 = W6();
        if (interfaceC361710EGbW6 != null) {
            interfaceC361710EGbW6.LR1(false);
        }
        C0E0G c0e0gT6 = T6();
        if (c0e0gT6 != null) {
            c0e0gT6.hY0(this.LLJJJJJIL, null);
        }
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 != null) {
            interfaceC357900E1kH4.qc1(true);
        }
        h8();
        L7();
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null && (c0e48F4 = F4()) != null) {
            C360030E9p c360030E9pS6 = S6();
            boolean z = c360030E9pS6 != null ? c360030E9pS6.LLJI : false;
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F4, new Pair(-1, -1));
            c0labLJFF.LJ("is_editor_pro", "1");
            c0labLJFF.LJ("is_from_pip", z ? "1" : CardStruct.IStatusCode.DEFAULT);
            c0labLJFF.LJ("enter_from", "video_edit_page");
            C20684815ws.LJIILLIIL("magic_panel_show", c0labLJFF.LIZ);
        }
        InterfaceC361710EGb interfaceC361710EGbW62 = W6();
        if (interfaceC361710EGbW62 != null) {
            interfaceC361710EGbW62.V52(this.LLLIIIIL);
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.fx1(new AwS549S0100000_5(this, 374));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        U5().LJIILIIL = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C0E0B c0e0bU5 = U5();
        DialogC1390150mHN dialogC1390150mHN = this.LLJLLL;
        boolean z = dialogC1390150mHN != null && dialogC1390150mHN.isShowing();
        C357640E0k c357640E0k = this.LLLII;
        if (z && c0e0bU5.LJIIZILJ) {
            c0e0bU5.LJ(c357640E0k);
            c0e0bU5.LJIIZILJ = false;
        }
        c0e0bU5.LJIILIIL = true;
        ResourceItem resourceItem = c0e0bU5.LJIILLIIL;
        if (resourceItem == null || !c0e0bU5.LJIILJJIL) {
            return;
        }
        c0e0bU5.LJIIIIZZ(resourceItem);
        c0e0bU5.LJIILJJIL = false;
        c0e0bU5.LJIILLIIL = null;
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        U5().LJIIZILJ = true;
    }

    public final void p8() {
        ResourceItem resourceItem;
        String name;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0EDF c0edf = P6().LLLILZLLLI;
        C0EDQ currentSelectItem = c0edf != null ? c0edf.getCurrentSelectItem() : null;
        Pair<Boolean, String> pairS5 = S5();
        boolean zBooleanValue = pairS5.getFirst().booleanValue();
        String second = pairS5.getSecond();
        if (currentSelectItem != null || zBooleanValue) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) != null) {
                nLETrackSlotLLLLLLIL.setAIMatting(null);
                C0E48 c0e48F42 = F4();
                if (c0e48F42 != null) {
                    C350870DpF.LIZ(c0e48F42, false);
                }
            }
            if (currentSelectItem != null && (resourceItem = currentSelectItem.LIZ) != null && (name = resourceItem.getName()) != null) {
                second = name;
            } else if (second == null) {
                second = "";
            }
            o8(C0E1V.REMOVE_MAGIC, second);
            if (second.length() > 0) {
                Activity activity = this.LLJJJJJIL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(C786410Ut5.j4(this.LLJJJJJIL.getString(2131836989), Arrays.copyOf(new Object[]{second}, 1)));
                creativeToastBuilder.isTuxToast(true);
                C1390380mHk.LIZ(activity, 5012, creativeToastBuilder);
            }
        }
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        R5();
        return this;
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    private final void M5(Function1<? super Boolean, Unit> function1) {
        C0E48 c0e48F4;
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = C357770E0x.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("server_rendering_consent_");
        sbLIZ.append(currentUserID);
        if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            C1397580mTM c1397580mTM = new C1397580mTM(this.LLJJJJJIL);
            c1397580mTM.LJFF(2131830092);
            c1397580mTM.LIZ(2131829602);
            C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(this, (C357700E0q) function1, (Function1<? super Boolean, Unit>) 58));
            new C1397510mTF(c1397580mTM).LIZLLL();
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            if (videoPublishEditModelLJJJLIIL != null && (c0e48F4 = F4()) != null) {
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F4, new Pair(-1, -1));
                c0labLJFF.LJ("creation_tool", "magic");
                c0labLJFF.LJ("is_editor_pro", "1");
                C20684815ws.LJIILLIIL("upload_authorization_popup_show", c0labLJFF.LIZ);
                return;
            }
            return;
        }
        H5(true, Boolean.TRUE, new AwS59S0210000_5(this, function1, C0CHQ.LIZ().getAccountService().isLogin(), 3));
    }

    private final ResourceItem d7(String str) {
        C361100EDs resourceListAdapter;
        C0EDF c0edf = P6().LLLILZLLLI;
        ResourceItem resourceItem = null;
        if (c0edf == null || (resourceListAdapter = c0edf.getResourceListAdapter()) == null) {
            return null;
        }
        Iterator<ResourceItem> it2 = resourceListAdapter.LLLFZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ResourceItem next = it2.next();
            if (Intrinsics.LJFF(next.getResourceId(), str)) {
                resourceItem = next;
                break;
            }
        }
        return resourceItem;
    }

    private final void s7(boolean z) {
        C0E48 c0e48F4;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        this.LLJZIJLIL = true;
        if (z) {
            C5();
        }
        i3(AFwS234S0000000_5.get$arr$(164));
        C0E48 c0e48F42 = F4();
        String str = null;
        if (c0e48F42 != null && (nLETrackSlotLLLLLLIL = c0e48F42.LLLLLLIL()) != null) {
            C360030E9p c360030E9pS6 = S6();
            if (c360030E9pS6 != null) {
                C361680EFy.LJLILLLLZI(nLETrackSlotLLLLLLIL, "add_magic_duration", String.valueOf(C361680EFy.LJIJJ(nLETrackSlotLLLLLLIL, "add_magic_duration") + (System.currentTimeMillis() - c360030E9pS6.LLIZ)));
            }
            String extra = nLETrackSlotLLLLLLIL.getExtra("ep_magic_resource_id");
            if (C286440BKo.LIZ() && (videoPublishEditModelLJJJLIIL = LJJJLIIL()) != null && !Intrinsics.LJFF(this.LLL, extra)) {
                C354260Dui.LIZ.getClass();
                if (C354260Dui.LJIILIIL(nLETrackSlotLLLLLLIL)) {
                    this.LLL = "";
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2486909op(videoPublishEditModelLJJJLIIL, nLETrackSlotLLLLLLIL, null), 3);
                }
            }
        }
        C360030E9p c360030E9pS62 = S6();
        if (c360030E9pS62 != null) {
            str = c360030E9pS62.LLJ;
        }
        if (Intrinsics.LJFF(str, "bottom_item_root_magic")) {
            C0E5S c0e5sO7 = o7();
            if (c0e5sO7 != null) {
                c0e5sO7.yV(AFwS234S0000000_5.get$arr$(165));
            }
            C0E48 c0e48F43 = F4();
            if (c0e48F43 != null) {
                c0e48F43.S7().LIZIZ(new C358740E4q(null, 0, null, false, 0, 254), "select_slot_event", false);
            }
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL2 = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL2 != null && (c0e48F4 = F4()) != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL2, c0e48F4, new Pair(-1, -1));
            c0labLJFF.LJ("is_editor_pro", "1");
            c0labLJFF.LJ("enter_from", "video_edit_page");
            C20684815ws.LJIILLIIL("magic_panel_exit", c0labLJFF.LIZ);
        }
    }

    public final void E5(NLETrackSlot nLETrackSlot) {
        C361100EDs resourceListAdapter;
        boolean z;
        C0EDF c0edf = P6().LLLILZLLLI;
        if (c0edf != null && (resourceListAdapter = c0edf.getResourceListAdapter()) != null) {
            List<ResourceItem> listLLLFZ = resourceListAdapter.LLLFZ();
            C357580E0e c357580E0eK7 = k7();
            Activity activity = this.LLJJJJJIL;
            c357580E0eK7.getClass();
            ArrayList<Pair> arrayList = new ArrayList();
            C354260Dui.LIZ.getClass();
            NLEResType nLEResTypeLJIIJ = C354260Dui.LJIIJ(nLETrackSlot);
            String strLIZJ = C0E0F.LIZJ(C354260Dui.LJIIJ(nLETrackSlot));
            boolean zLJ = C0E5J.LJ(nLETrackSlot);
            int i = 0;
            for (Object obj : (ArrayList) listLLLFZ) {
                int i2 = i + 1;
                if (i >= 0) {
                    ResourceItem resourceItem = (ResourceItem) obj;
                    if (!C357750E0v.LIZ(resourceItem, activity)) {
                        C353560Dta c353560Dta = C353560Dta.LIZ;
                        VideoPublishEditModel videoPublishEditModel = c357580E0eK7.LIZ;
                        c353560Dta.getClass();
                        boolean z2 = true;
                        if (C353560Dta.LIZLLL(videoPublishEditModel) && nLEResTypeLJIIJ == NLEResType.VIDEO && resourceItem.magicResourceTypeList.contains("photo")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((!resourceItem.magicResourceTypeList.contains(strLIZJ) && !z) || zLJ) {
                            z2 = false;
                        }
                        arrayList.add(new Pair(Integer.valueOf(i), Boolean.valueOf(z2)));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            for (Pair pair : arrayList) {
                c0edf.LIZIZ(((Number) pair.getFirst()).intValue(), ((Boolean) pair.getSecond()).booleanValue());
            }
        }
    }

    public final int N6(ResourceItem resourceItem) {
        C361100EDs resourceListAdapter;
        String str;
        C0EDF c0edf = P6().LLLILZLLLI;
        if (c0edf != null && (resourceListAdapter = c0edf.getResourceListAdapter()) != null) {
            List<ResourceItem> listLLLFZ = resourceListAdapter.LLLFZ();
            ArrayList arrayList = new ArrayList();
            for (ResourceItem resourceItem2 : listLLLFZ) {
                C357590E0f category = resourceItem2.getCategory();
                String str2 = null;
                if (category != null) {
                    str = category.LIZIZ;
                } else {
                    str = null;
                }
                C357590E0f category2 = resourceItem.getCategory();
                if (category2 != null) {
                    str2 = category2.LIZIZ;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    arrayList.add(resourceItem2);
                }
            }
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((ResourceItem) it2.next()).getResourceId(), resourceItem.getResourceId())) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final boolean T8(ResourceItem resourceItem) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        if (resourceItem == null) {
            return false;
        }
        U5().getClass();
        ArrayList arrayListLJI = C0E0B.LJI(resourceItem);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null) {
            return false;
        }
        U5().getClass();
        C354260Dui.LIZ.getClass();
        NLEResType nLEResTypeLJIIJ = C354260Dui.LJIIJ(nLETrackSlotLLLLLLIL);
        boolean zContains = arrayListLJI.contains(EnumC356200Dxq.PHOTO);
        if (nLEResTypeLJIIJ != NLEResType.VIDEO || !zContains) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a9(com.bytedance.ies.nle.editor_jni.NLETrackSlot r8) {
        /*
            r7 = this;
            boolean r0 = r7.m6()
            if (r0 == 0) goto L58
            X.0E0e r0 = r7.k7()
            java.util.List<? extends com.ss.ugc.android.editor.base.resource.ResourceItem> r1 = r0.LIZJ
        Lc:
            X.0E0e r0 = r7.k7()
            java.util.List r6 = r0.LIZJ(r8, r1)
            X.0ECx r0 = r7.P6()
            X.0EDF r1 = r0.LLLILZLLLI
            r0 = 0
            if (r1 == 0) goto L72
            X.0EDs r1 = r1.getResourceListAdapter()
            if (r1 == 0) goto L72
            java.util.List r1 = r1.LLLFZ()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r5 = r1.iterator()
            r2 = 0
        L2e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r4 = r5.next()
            int r3 = r2 + 1
            if (r2 < 0) goto L6e
            com.ss.ugc.android.editor.base.resource.ResourceItem r4 = (com.ss.ugc.android.editor.base.resource.ResourceItem) r4
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r2, r6)
            com.ss.ugc.android.editor.base.resource.ResourceItem r1 = (com.ss.ugc.android.editor.base.resource.ResourceItem) r1
            if (r1 == 0) goto L56
            java.lang.String r2 = r1.getResourceId()
        L4a:
            java.lang.String r1 = r4.getResourceId()
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r1 == 0) goto L72
            r2 = r3
            goto L2e
        L56:
            r2 = r0
            goto L4a
        L58:
            X.0ECx r0 = r7.P6()
            X.0EDF r0 = r0.LLLILZLLLI
            if (r0 == 0) goto L6b
            X.0EDs r0 = r0.getResourceListAdapter()
            if (r0 == 0) goto L6b
            java.util.List r1 = r0.LLLFZ()
            goto Lc
        L6b:
            X.13BV r1 = X.C13BV.INSTANCE
            goto Lc
        L6e:
            X.C1697810uHb.LJIJI()
            throw r0
        L72:
            X.0ECx r1 = r7.P6()
            X.0EDF r1 = r1.LLLILZLLLI
            if (r1 == 0) goto L7d
            r1.LJIILLIIL(r6)
        L7d:
            X.0ECx r1 = r7.P6()
            r1.LLLLLZL()
        L84:
            X.0E48 r3 = r7.F4()
            if (r3 == 0) goto L9d
            X.0E48 r1 = r7.F4()
            java.lang.String r2 = "magic_changed_event"
            if (r1 == 0) goto L9a
            X.0DpP r1 = r1.S7()
            java.lang.Object r0 = r1.LIZJ(r2, r0)
        L9a:
            X.C350870DpF.LJIIIZ(r3, r2, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357700E0q.a9(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public final void d8(EnumC357140DzM enumC357140DzM) {
        String uuid;
        C360030E9p c360030E9pS6;
        LiveData<SeekInfo> liveDataZE2;
        SeekInfo value;
        C360030E9p c360030E9pS62;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null) {
            return;
        }
        C353560Dta c353560Dta = C353560Dta.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        c353560Dta.getClass();
        if (!C353560Dta.LIZLLL(videoPublishEditModelLJJJLIIL) || ((c360030E9pS62 = S6()) != null && c360030E9pS62.LLJI)) {
            if (C353560Dta.LIZLLL(LJJJLIIL()) && (c360030E9pS6 = S6()) != null && c360030E9pS6.LLJI) {
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48F4);
                Iterator it2 = C13LP.LLIIII(this.LLJLIL.LIZ).iterator();
                while (it2.hasNext()) {
                    NLETrackSlot nLETrackSlotLIZ = C346680DiU.LIZ(nLEModelLJI, (String) it2.next());
                    if (nLETrackSlotLIZ != null) {
                        C0E5S c0e5sO7 = o7();
                        if (c0e5sO7 == null || (liveDataZE2 = c0e5sO7.zE2()) == null || (value = liveDataZE2.getValue()) == null) {
                            break;
                        }
                        long j = value.position;
                        long startTime = nLETrackSlotLIZ.getStartTime();
                        if (j <= nLETrackSlotLIZ.getMeasuredEndTime() && startTime <= j) {
                            c0e48F4.S7().LIZIZ(new C358740E4q(nLETrackSlotLIZ, 1, null, false, 0, 234), "select_slot_event", false);
                        }
                    }
                }
            } else {
                C360030E9p c360030E9pS63 = S6();
                if (c360030E9pS63 != null && c360030E9pS63.LLJI) {
                    NLETrackSlot nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL();
                    if (nLETrackSlotLLLLLLIL != null) {
                        uuid = nLETrackSlotLLLLLLIL.getUUID();
                    } else {
                        uuid = null;
                    }
                    c0e48F4.S7().LIZIZ(new C358740E4q(C346680DiU.LIZ(C350870DpF.LJI(c0e48F4), uuid), 1, null, false, 0, 234), "select_slot_event", false);
                }
            }
        } else {
            C0E5S c0e5sO72 = o7();
            if (c0e5sO72 != null) {
                c0e5sO72.NT0();
            }
        }
        c9(this, false, null, null);
    }

    @Override // X.C0ETX
    public void t5(boolean z) {
        s7(false);
        super.t5(z);
    }

    private final void o8(C0E1V c0e1v, String str) {
        C0EDF c0edf = P6().LLLILZLLLI;
        if (c0edf != null) {
            c0edf.LJIILL(C0E17.NO_SCROLL);
        }
        C0E0G c0e0gT6 = T6();
        if (c0e0gT6 != null) {
            c0e0gT6.X91(c0e1v, str);
        }
        n9();
    }

    private final void u8(String str, boolean z) {
        if (!m6()) {
            return;
        }
        if (C123100dR.LIZ(str)) {
            i3(new AwS56S1000000_5(str, 10));
        } else {
            if (!z) {
                return;
            }
            i3(new AwS584S0100000_5(this, 325));
        }
    }

    public final void I7(ResourceItem resourceItem, int i) {
        int i2;
        U5().LJIIL = new Pair<>(resourceItem, Integer.valueOf(i));
        DialogC1390150mHN dialogC1390150mHN = this.LLJLLL;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.LJJLL(0.0f, false);
        } else {
            DialogC1390150mHN dialogC1390150mHN2 = new DialogC1390150mHN(this.LLJJJJJIL);
            Activity activity = this.LLJJJJJIL;
            if (C357080DzG.LIZ(resourceItem)) {
                i2 = 2131850033;
            } else {
                i2 = 2131830094;
            }
            dialogC1390150mHN2.LJJLJLI(activity.getString(i2));
            dialogC1390150mHN2.LJJZ(true);
            dialogC1390150mHN2.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0E0j
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    this.LIZ.U5().LJ(this.LIZ.LLLII);
                }
            };
            this.LLJLLL = dialogC1390150mHN2;
        }
        DialogC1390150mHN dialogC1390150mHN3 = this.LLJLLL;
        if (dialogC1390150mHN3 != null) {
            C786410Ut5.K4(dialogC1390150mHN3);
        }
    }

    public final C0E17 n7(String str, boolean z) {
        if (!m6()) {
            return C0E17.DIRECT_SCROLL;
        }
        if (C123100dR.LIZ(str)) {
            return C0E17.DIRECT_SCROLL;
        }
        if (z) {
            return C0E17.DIRECT_SCROLL;
        }
        return C0E17.NO_SCROLL;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.0E1G] */
    public C357700E0q(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(115));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 373));
        this.LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 370));
        this.LLJLIL = new C0E0N();
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E0G.class, null);
        this.LLJLL = C1664770tQJ.LIZIZ(getDiContainer(), C360030E9p.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLL = "";
        this.LLLF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLLFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 372));
        this.LLLFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 375));
        this.LLLFZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 371));
        this.LLLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 369));
        this.LLLII = new C357640E0k(this);
        this.LLLIIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360570EBr.class, null);
        this.LLLIIIIL = new AbstractC385780FAq() { // from class: X.0E1G
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean E2(C21645419nQ c21645419nQ) {
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZIZ(MotionEvent motionEvent) {
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                return true;
            }

            @Override // X.AbstractC385780FAq
            public final int getPriority() {
                return Integer.MAX_VALUE;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                LiveState<Size> canvasSize;
                Size sizeLIZJ;
                InterfaceC361710EGb interfaceC361710EGbW6 = this.LL.W6();
                if (interfaceC361710EGbW6 == null || (canvasSize = interfaceC361710EGbW6.getCanvasSize()) == null || (sizeLIZJ = canvasSize.LIZJ()) == null) {
                    return false;
                }
                int width = sizeLIZJ.getWidth();
                float fLIZIZ = (C1415610mwR.LIZIZ() - width) / 2.0f;
                float fLIZIZ2 = (C1415610mwR.LIZIZ() + width) / 2.0f;
                if (motionEvent.getX() >= fLIZIZ && motionEvent.getX() <= fLIZIZ2) {
                    return false;
                }
                this.LL.N5();
                return true;
            }
        };
        this.LLLIIIL = "";
    }

    public final void H5(final boolean z, final Boolean bool, final Function1<? super Boolean, Unit> function1) {
        String enterFrom;
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            Activity activity = this.LLJJJJJIL;
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            if (videoPublishEditModelLJJJLIIL == null || (enterFrom = videoPublishEditModelLJJJLIIL.getEnterFrom()) == null) {
                enterFrom = "";
            }
            C0XPD.LIZIZ(activity, "video_edit_page", enterFrom, null, new InterfaceC849390XTt() { // from class: X.0E0r
                @Override // X.InterfaceC849390XTt
                public final void LIZ() {
                    if (z && Intrinsics.LJFF(bool, Boolean.FALSE)) {
                        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
                        Keva keva = C357770E0x.LIZ;
                        C357740E0u.LIZ(currentUserID);
                    }
                    function1.invoke(Boolean.FALSE);
                }

                @Override // X.InterfaceC849390XTt
                public final void LIZIZ() {
                    function1.invoke(Boolean.TRUE);
                }
            });
            return;
        }
        if (z && Intrinsics.LJFF(bool, Boolean.FALSE)) {
            String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
            Keva keva = C357770E0x.LIZ;
            C357740E0u.LIZ(currentUserID);
        }
        function1.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W7(com.ss.ugc.android.editor.base.resource.ResourceItem r12, int r13, boolean r14) {
        /*
            r11 = this;
            r7 = r11
            X.0E48 r0 = r7.F4()
            if (r0 == 0) goto L5a
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r5 = r0.LLLLLLIL()
            if (r5 == 0) goto L5a
            X.0E0G r1 = r7.T6()
            r4 = 0
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L5b
            java.lang.String r2 = r1.fw1(r4)
            if (r2 == 0) goto L5b
            char[] r1 = new char[r0]
            r0 = 44
            r1[r3] = r0
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJ(r2, r1, r3, r3, r0)
            if (r0 == 0) goto L5b
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            if (r1 == 0) goto L5b
        L2f:
            com.bytedance.ies.nle.editor_jni.NLEAIMatting r0 = r5.getAIMatting()
            r9 = r14
            r6 = r13
            r8 = r12
            if (r0 == 0) goto L44
            if (r8 == 0) goto L3e
            java.lang.String r4 = r8.getResourceId()
        L3e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 == 0) goto L5e
        L44:
            boolean r0 = X.C351220Dpo.LLIZLLLIL(r5)
            if (r0 != 0) goto L5e
            X.0E0B r0 = r7.U5()
            androidx.lifecycle.LifecycleCoroutineScope r4 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r7)
            X.0E0k r5 = r7.LLLII
            r1 = r9
            r2 = r8
            r3 = r6
            r0.LIZIZ(r1, r2, r3, r4, r5)
        L5a:
            return
        L5b:
            java.lang.String r1 = ""
            goto L2f
        L5e:
            android.app.Activity r0 = r7.LLJJJJJIL
            X.0mTM r1 = new X.0mTM
            r1.<init>(r0)
            r0 = 2131830432(0x7f1126a0, float:1.9293861E38)
            r1.LJFF(r0)
            r1.LJII = r3
            r0 = 2131830431(0x7f11269f, float:1.929386E38)
            r1.LIZ(r0)
            kotlin.jvm.internal.AwS13S0211000_5 r5 = new kotlin.jvm.internal.AwS13S0211000_5
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            X.C985403tE.LIZ(r1, r5)
            X.0mTF r0 = new X.0mTF
            r0.<init>(r1)
            r0.LIZLLL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357700E0q.W7(com.ss.ugc.android.editor.base.resource.ResourceItem, int, boolean):void");
    }

    public static final void J8(C357700E0q c357700E0q, String str, boolean z, boolean z2) {
        List<ResourceItem> listLLLFZ;
        String str2;
        ResourceItem next;
        ResourceItem next2;
        EPAnchorData ePAnchorData;
        C361100EDs resourceListAdapter;
        if (str != null) {
            String str3 = null;
            if (C123100dR.LIZ(str)) {
                C0EDF c0edf = c357700E0q.P6().LLLILZLLLI;
                if (c0edf != null && (resourceListAdapter = c0edf.getResourceListAdapter()) != null) {
                    listLLLFZ = resourceListAdapter.LLLFZ();
                } else {
                    listLLLFZ = null;
                }
                C360030E9p c360030E9pS6 = c357700E0q.S6();
                if (c360030E9pS6 != null && (ePAnchorData = c360030E9pS6.LLJIJIL) != null) {
                    str2 = ePAnchorData.resourceId;
                } else {
                    str2 = null;
                }
                if (listLLLFZ != null) {
                    Iterator<ResourceItem> it2 = listLLLFZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.getResourceId(), str2)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ResourceItem resourceItem = next;
                    if (resourceItem != null) {
                        String resourceId = resourceItem.getResourceId();
                        C357590E0f category = resourceItem.getCategory();
                        if (category != null) {
                            str3 = category.LIZIZ;
                        }
                        c357700E0q.y8(resourceId, str3, z, z2);
                        return;
                    }
                    Iterator<ResourceItem> it3 = listLLLFZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (Intrinsics.LJFF(next2.getEffectId(), str)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    ResourceItem resourceItem2 = next2;
                    if (resourceItem2 == null) {
                        return;
                    }
                    String resourceId2 = resourceItem2.getResourceId();
                    C357590E0f category2 = resourceItem2.getCategory();
                    if (category2 != null) {
                        str3 = category2.LIZIZ;
                    }
                    c357700E0q.y8(resourceId2, str3, z, z2);
                }
            }
        }
    }

    public static final void c9(C357700E0q c357700E0q, boolean z, String str, NLETrackSlot nLETrackSlot) {
        String strFw1;
        C0E0G c0e0gT6;
        String strZF1;
        C0E0G c0e0gT62 = c357700E0q.T6();
        if (c0e0gT62 != null && (strFw1 = c0e0gT62.fw1(nLETrackSlot)) != null && (c0e0gT6 = c357700E0q.T6()) != null && (strZF1 = c0e0gT6.zF1(nLETrackSlot)) != null) {
            boolean z2 = false;
            String str2 = (String) C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(strFw1, new String[]{","}, 0, 6));
            if (str2 == null) {
                str2 = "";
            }
            if (C123100dR.LIZ(str)) {
                C360030E9p c360030E9pS6 = c357700E0q.S6();
                if (c360030E9pS6 != null && c360030E9pS6.LLJIJIL != null) {
                    z2 = true;
                }
                J8(c357700E0q, str, false, z2);
                return;
            }
            C0E48 c0e48F4 = c357700E0q.F4();
            if (c0e48F4 == null) {
                return;
            }
            c0e48F4.S7().LIZIZ(new C351380Dq4(str2, strZF1, z, 8), "magic_changed_event", false);
        }
    }

    public final void Z7(ResourceItem resourceItem, int i, boolean z, C0E10 c0e10) {
        C0E55 player;
        ArrayList<String> arrayList;
        Object objLJJJLZIJ;
        int i2;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        if (resourceItem != null) {
            boolean z2 = false;
            if (!z) {
                C0E48 c0e48F4 = F4();
                if ((c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null || !C0E5J.LJ(nLETrackSlotLLLLLLIL)) && (arrayList = resourceItem.magicResourceTypeList) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, arrayList)) != null) {
                    if (Intrinsics.LJFF(objLJJJLZIJ, "photo")) {
                        i2 = 2131829601;
                    } else {
                        i2 = 2131829605;
                    }
                    Activity activity = this.LLJJJJJIL;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(i2);
                    creativeToastBuilder.isTuxToast(true);
                    C1390380mHk.LIZ(activity, 5012, creativeToastBuilder);
                }
                C0E0R c0e0r = C0E0R.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
                C0E48 c0e48F42 = F4();
                int iN6 = N6(resourceItem);
                C360030E9p c360030E9pS6 = S6();
                if (c360030E9pS6 != null) {
                    z2 = c360030E9pS6.LLJI;
                }
                c0e0r.getClass();
                C0E0R.LIZ(videoPublishEditModelLJJJLIIL, c0e48F42, resourceItem, i, false, iN6, z2, null);
                c0e10.LIZ(true);
                return;
            }
            C0E48 c0e48F43 = F4();
            if (c0e48F43 != null && (player = c0e48F43.getPlayer()) != null) {
                player.pause(false);
            }
            if (!Intrinsics.LJFF(resourceItem.gameplayType, C0E00.SERVER_GAME_PLAY.getTypeName()) && !Intrinsics.LJFF(resourceItem.gameplayType, C0E00.COMBINE_GAME_PLAY.getTypeName())) {
                if (C357750E0v.LIZ(resourceItem, this.LLJJJJJIL)) {
                    c0e10.LIZ(false);
                    return;
                } else {
                    H5(false, null, new AwS59S0210000_5(this, c0e10, C0CHQ.LIZ().getAccountService().isLogin(), 4));
                    return;
                }
            }
            M5(new AwS584S0100000_5(c0e10, 326));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y8(final java.lang.String r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357700E0q.y8(java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
