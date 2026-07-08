package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksPanelFragment;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS113S0101000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Eqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377280Eqk extends C0ETZ<InterfaceC376450EpP, C380350Evh, C377400Eqw, C1260204wS> implements InterfaceC376450EpP {
    public static final C377430Eqz LLJLILLLLZIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public static final int LLJLLIL;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final Function0<C377400Eqw> LLJJIJIL;
    public final Function0<C1260204wS> LLJJJ;
    public final C362580EJk LLJJJIL;
    public final C01GW LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final C557050Lt1 LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final InterfaceC1731706qJ LLJLIL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Eqz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C377280Eqk.class, "curActivity", "getCurActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C377280Eqk.class, "magicDataApi", "getMagicDataApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/magic/logic/MagicDataApi;", 0), new C2217381BqS(C377280Eqk.class, "editorProInitApi", "getEditorProInitApi()Lcom/ss/android/ugc/gamora/editorpro/startup/api/EditorProInitApi;", 0), new C2217381BqS(C377280Eqk.class, "editorProAdjustCanvasApi", "getEditorProAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0), new C2217381BqS(C377280Eqk.class, "editorProLoaderApi", "getEditorProLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0)};
        LLJLILLLLZIIL = new Object() { // from class: X.0Eqz
        };
        LLJLLIL = 8;
    }

    private final InterfaceC377410Eqx K4() {
        return (InterfaceC377410Eqx) this.LLJJIJIIJIL.getValue();
    }

    private final C0EFH P4() {
        return (C0EFH) this.LLJJJJLIIL.getValue(this, LLJLL[2]);
    }

    private final C0EY2 T4() {
        return (C0EY2) this.LLJLIL.getValue(this, LLJLL[4]);
    }

    public final void C5() {
        InterfaceC377410Eqx interfaceC377410EqxK4;
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "shiwei", "Async task manager component taskIconClicked");
        C19EG c19egH4 = H4();
        if (c19egH4 != null) {
            if (k5() != null) {
                Fragment fragmentLJJJJZ = c19egH4.getSupportFragmentManager().LJJJJZ(R.id.gcw);
                if (!(fragmentLJJJJZ instanceof DTResourcePanelFragment)) {
                    fragmentLJJJJZ = null;
                }
                if (fragmentLJJJJZ instanceof AsyncTasksPanelFragment) {
                    return;
                }
            }
            InterfaceC377410Eqx interfaceC377410EqxK42 = K4();
            if (interfaceC377410EqxK42 != null && interfaceC377410EqxK42.LJLILLLLZI() && (interfaceC377410EqxK4 = K4()) != null) {
                interfaceC377410EqxK4.LIZLLL();
            }
            AsyncTasksPanelViewModel asyncTasksPanelViewModelK5 = k5();
            if (asyncTasksPanelViewModelK5 != null) {
                int i = !asyncTasksPanelViewModelK5.LLJILLL.isEmpty() ? 1 : 0;
                C377260Eqi c377260EqiZQ2 = asyncTasksPanelViewModelK5.zQ2();
                List<String> list = asyncTasksPanelViewModelK5.LL;
                c377260EqiZQ2.getClass();
                C0LAB c0labLIZIZ = C377260Eqi.LIZIZ(C377260Eqi.LJ(), c377260EqiZQ2.LIZ, list);
                if (c0labLIZIZ != null) {
                    c0labLIZIZ.LJ("async_status", String.valueOf(i));
                    C20684815ws.LJIILLIIL("async_popup_click", c0labLIZIZ.LIZ);
                }
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C377310Eqn(this, c19egH4, null), 3);
        }
    }

    @Override // ge.i
    public Function0<C380350Evh> E3() {
        return AFwS191S0000000_5.get$arr$(220);
    }

    public final C19EG H4() {
        return (C19EG) this.LLJJIJI.getValue(this, LLJLL[0]);
    }

    public final InterfaceC362230EIb O4() {
        return (InterfaceC362230EIb) this.LLJJL.getValue(this, LLJLL[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Integer] */
    @Override // X.InterfaceC376450EpP
    public void T11() {
        C259800zU c259800zU = new C259800zU();
        AsyncTasksPanelViewModel asyncTasksPanelViewModelK5 = k5();
        if (asyncTasksPanelViewModelK5 != null) {
            List<C377380Equ> list = ((C377270Eqj) asyncTasksPanelViewModelK5.LLILZIL.getValue()).LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (C377380Equ c377380Equ : list) {
                if (c377380Equ.LJI != EnumC377350Eqr.FAILED) {
                    arrayList.add(c377380Equ);
                }
            }
            c259800zU.element = Integer.valueOf(arrayList.size());
            C377240Eqg.LJ(getEditModel(), (C377270Eqj) asyncTasksPanelViewModelK5.LLILZIL.getValue());
        }
        NLEModel nLEModelLLZ = LLZ();
        if (nLEModelLLZ == null || nLEModelLLZ.getMainTrack() == null) {
            return;
        }
        C377150EqX c377150EqX = C377150EqX.LIZ;
        C377150EqX.LJIJJLI(getEditModel(), LLZ(), (Integer) c259800zU.element);
    }

    public final C0E0G Z4() {
        return (C0E0G) this.LLJJJJJIL.getValue(this, LLJLL[1]);
    }

    public final VideoPublishEditModel getEditModel() {
        EditModelProvider.Companion.getClass();
        EditModelProvider editModelProviderLIZIZ = C0E1T.LIZIZ();
        if (editModelProviderLIZIZ != null) {
            return editModelProviderLIZIZ.getEditModel();
        }
        return null;
    }

    public final AsyncTasksPanelViewModel k5() {
        return (AsyncTasksPanelViewModel) this.LLJJJJ.getValue();
    }

    private final NLEModel LLZ() {
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            return C350870DpF.LJI(c0e48F4);
        }
        return null;
    }

    private final void n5() {
        LiveData<C0EHI> liveDataZu2;
        C0EY2 c0ey2T4 = T4();
        if (c0ey2T4 == null || (liveDataZu2 = c0ey2T4.zu2()) == null) {
            return;
        }
        liveDataZu2.observe(this, new AObserverS209S0100000_5(this, 84));
    }

    public final void Xi() {
        P4().J50().LIZ(this, new AObjectS240S0100000_5(this, 118));
        O4().my1().LIZ(this, new AObjectS240S0100000_5(this, 119));
    }

    @Override // X.InterfaceC376450EpP
    public boolean bZ() {
        C2252321DDq c2252321DDq;
        AsyncTasksPanelViewModel asyncTasksPanelViewModelK5 = k5();
        C377270Eqj c377270Eqj = (asyncTasksPanelViewModelK5 == null || (c2252321DDq = asyncTasksPanelViewModelK5.LLILZIL) == null) ? null : (C377270Eqj) c2252321DDq.getValue();
        C377150EqX c377150EqX = C377150EqX.LIZ;
        return C377150EqX.LJIJJ(getEditModel(), LLZ()) || C377240Eqg.LIZLLL(c377270Eqj);
    }

    @Override // X.InterfaceC376450EpP
    public boolean lo2() {
        C2252321DDq c2252321DDq;
        C377270Eqj c377270Eqj;
        AsyncTasksPanelViewModel asyncTasksPanelViewModelK5 = k5();
        if (asyncTasksPanelViewModelK5 == null || (c2252321DDq = asyncTasksPanelViewModelK5.LLILZIL) == null || (c377270Eqj = (C377270Eqj) c2252321DDq.getValue()) == null) {
            return false;
        }
        return !c377270Eqj.LIZIZ.isEmpty();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ != null) {
            iCreationAsyncTaskManagerLIZ.LJI("AsyncTaskViewModel", AFwS189S0000000_3.get$arr$(377), false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        n5();
    }

    public final void t5() {
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (mutableLiveDataLIZ = c0e48F4.S7().LIZ("delete_slot_event")) == null) {
            return;
        }
        mutableLiveDataLIZ.observe(this, new Observer() { // from class: X.0EBA
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String strLJII;
                String strLIZIZ;
                ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ;
                C0EB9 c0eb9 = (C0EB9) obj;
                NLETrackSlot nLETrackSlot = c0eb9.LIZIZ;
                if (nLETrackSlot != null && (strLJII = C352250DrT.LJII(nLETrackSlot)) != null) {
                    NLETrackSlot nLETrackSlot2 = c0eb9.LIZIZ;
                    if (nLETrackSlot2 != null) {
                        strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot2);
                    } else {
                        strLIZIZ = null;
                    }
                    if (!C123100dR.LIZ(strLIZIZ) && (iCreationAsyncTaskManagerLIZ = C09BV.LIZ()) != null) {
                        iCreationAsyncTaskManagerLIZ.LJII(strLJII);
                    }
                }
            }
        });
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C377400Eqw> o2() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1260204wS> w2() {
        return this.LLJJJ;
    }

    private final void v5(Function0<Unit> function0) {
        C19EG c19egH4 = H4();
        if (c19egH4 != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(c19egH4);
            c1397580mTM.LJFF(2131825384);
            c1397580mTM.LIZ(2131825381);
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(this, (C377280Eqk) function0, (Function0<Unit>) 145));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C377120EqU c377120EqU = C377120EqU.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            C0E48 c0e48F4 = F4();
            c377120EqU.getClass();
            C377120EqU.LJIILJJIL(editModel, c0e48F4, "click_next");
        }
    }

    @Override // X.InterfaceC376450EpP
    public void D01(boolean z) {
        if (z) {
            if (T2().LIZ) {
                show();
                return;
            }
            return;
        }
        hide();
    }

    public final void D5(int i) {
        int iD5 = d5(Integer.valueOf(i));
        if (T2().LIZ) {
            i3(new AwS113S0101000_5(this, iD5, 5));
        }
    }

    public final int d5(Integer num) {
        int iLIZ;
        if (num != null) {
            iLIZ = num.intValue();
        } else {
            iLIZ = C363750ENx.LIZ();
        }
        if (iLIZ <= 0) {
            iLIZ = C0ES3.LIZ();
        }
        return iLIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public final void x5(Activity activity) {
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131850023);
        creativeToastBuilder.icon(R.raw.icon_tick_circle_fill);
        creativeToastBuilder.iconColorRes(R.attr.a1h);
        creativeToastBuilder.acrossActivities(true);
        creativeToastBuilder.duration(3000L);
        C1390380mHk.LIZ(activity, 1074, creativeToastBuilder);
    }

    @Override // X.InterfaceC376450EpP
    public void yC1(boolean z) {
        boolean z2;
        ArrayList<C377380Equ> arrayList;
        CreativeModel creativeModel;
        DraftInfoModel draftInfoModel;
        AsyncTasksPanelViewModel asyncTasksPanelViewModelK5 = k5();
        if (asyncTasksPanelViewModelK5 != null) {
            VideoPublishEditModel editModel = asyncTasksPanelViewModelK5.getEditModel();
            if (editModel != null && (creativeModel = editModel.creativeModel) != null && (draftInfoModel = creativeModel.draftInfoModel) != null && draftInfoModel.isDraft) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                List<C377380Equ> list = asyncTasksPanelViewModelK5.LLJILJILJ;
                arrayList = new ArrayList();
                for (C377380Equ c377380Equ : list) {
                    if (c377380Equ.LJI != EnumC377350Eqr.COMPLETE) {
                        arrayList.add(c377380Equ);
                    }
                }
            } else {
                List<C377380Equ> list2 = asyncTasksPanelViewModelK5.LLJILJILJ;
                arrayList = new ArrayList();
                for (C377380Equ c377380Equ2 : list2) {
                    if (c377380Equ2.LJI == EnumC377350Eqr.STOPPED) {
                        arrayList.add(c377380Equ2);
                    }
                }
            }
            if (z2) {
                if (!z) {
                    asyncTasksPanelViewModelK5.DQ2();
                    if (!asyncTasksPanelViewModelK5.LLILLL.containsAll(asyncTasksPanelViewModelK5.LLILLJJLI)) {
                        C201955140j.LIZLLL(C563650M8t.LIZIZ, "shiwei", "user edit draft with async tasks, reset draft checked");
                        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
                        if (iCreationAsyncTaskManagerLIZ != null && iCreationAsyncTaskManagerLIZ.LJIILIIL() != null) {
                            C0LCT.LIZLLL(asyncTasksPanelViewModelK5.getCreationId(), false);
                        }
                    }
                }
                for (C377380Equ c377380Equ3 : arrayList) {
                    if (!z) {
                        asyncTasksPanelViewModelK5.wQ2(c377380Equ3.LIZ);
                    } else if (!asyncTasksPanelViewModelK5.LLILLL.contains(c377380Equ3.LIZ)) {
                        C563650M8t c563650M8t = C563650M8t.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("new task in this edit ");
                        sbLIZ.append(c377380Equ3.LIZ);
                        sbLIZ.append(", cancel");
                        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
                        asyncTasksPanelViewModelK5.wQ2(c377380Equ3.LIZ);
                    }
                }
            } else {
                if (!z) {
                    asyncTasksPanelViewModelK5.DQ2();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    asyncTasksPanelViewModelK5.wQ2(((C377380Equ) it2.next()).LIZ);
                }
            }
            if (((C377270Eqj) asyncTasksPanelViewModelK5.LLILZIL.getValue()).LIZIZ.isEmpty() && (!((C377270Eqj) asyncTasksPanelViewModelK5.LLILZIL.getValue()).LIZ.isEmpty())) {
                Iterator<C377380Equ> it3 = ((C377270Eqj) asyncTasksPanelViewModelK5.LLILZIL.getValue()).LIZIZ.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf = Integer.valueOf(it3.next().LJ);
                    while (it3.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(it3.next().LJ);
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    if (numValueOf != null && numValueOf.intValue() > 20) {
                        C201955140j.LIZLLL(C563650M8t.LIZIZ, "shiwei", "all tasks completed. set draft checked true");
                        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = C09BV.LIZ();
                        if (iCreationAsyncTaskManagerLIZ2 != null && iCreationAsyncTaskManagerLIZ2.LJIILIIL() != null) {
                            C0LCT.LIZLLL(asyncTasksPanelViewModelK5.getCreationId(), true);
                        }
                    }
                }
            }
        }
    }

    public C377280Eqk(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C19EG.class, null);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 763));
        this.LLJJIJIL = AFwS191S0000000_5.get$arr$(219);
        this.LLJJJ = new AwS549S0100000_5(this, 764);
        this.LLJJJIL = new C362580EJk(Integer.valueOf(R.id.gcw));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 765));
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E0G.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), C0EFH.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        this.LLJJLIIIJLLLLLLLZ = new C557050Lt1(false);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
    }

    @Override // X.InterfaceC376450EpP
    public boolean Lf0(EnumC377350Eqr enumC377350Eqr, EnumC381960EyI enumC381960EyI) {
        C2252321DDq c2252321DDq;
        C377270Eqj c377270Eqj;
        AsyncTasksPanelViewModel asyncTasksPanelViewModelK5 = k5();
        if (asyncTasksPanelViewModelK5 != null && (c2252321DDq = asyncTasksPanelViewModelK5.LLILZIL) != null && (c377270Eqj = (C377270Eqj) c2252321DDq.getValue()) != null) {
            List<C377380Equ> list = c377270Eqj.LIZIZ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C377380Equ c377380Equ : list) {
                    if (c377380Equ.LJI == enumC377350Eqr && c377380Equ.LJFF == enumC381960EyI) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC376450EpP
    public boolean mM0(Function0<Unit> function0, Function0<Unit> function02) {
        C2252321DDq c2252321DDq;
        C377270Eqj c377270Eqj;
        AsyncTasksPanelViewModel asyncTasksPanelViewModelK5 = k5();
        if (asyncTasksPanelViewModelK5 != null && (c2252321DDq = asyncTasksPanelViewModelK5.LLILZIL) != null && (c377270Eqj = (C377270Eqj) c2252321DDq.getValue()) != null) {
            if (bZ()) {
                C377150EqX c377150EqX = C377150EqX.LIZ;
                if (!C377150EqX.LJIJ(getEditModel(), LLZ()) && !C377240Eqg.LIZ(c377270Eqj)) {
                    v5(function0);
                } else {
                    C19EG c19egH4 = H4();
                    if (c19egH4 != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egH4);
                        c1389890mGx.LJIIIZ(2131825399);
                        c1389890mGx.LJIIJJI();
                        return true;
                    }
                }
                return true;
            }
            List<C377380Equ> list = c377270Eqj.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (C377380Equ c377380Equ : list) {
                EnumC381960EyI enumC381960EyI = c377380Equ.LJFF;
                if (enumC381960EyI == EnumC381960EyI.EDITOR_PRO_AIGC_T2V || enumC381960EyI == EnumC381960EyI.EDITOR_PRO_AIGC_T2I) {
                    arrayList.add(c377380Equ);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C377380Equ) obj).LJI == EnumC377350Eqr.PROCESSING) {
                    arrayList2.add(obj);
                }
            }
            int size = arrayList2.size();
            int i = c377270Eqj.LIZLLL;
            if (i - size == 0) {
                AsyncTasksPanelViewModel asyncTasksPanelViewModelK52 = k5();
                if (asyncTasksPanelViewModelK52 != null) {
                    asyncTasksPanelViewModelK52.FQ2();
                }
                return false;
            }
            if (i == 0) {
                AsyncTasksPanelViewModel asyncTasksPanelViewModelK53 = k5();
                if (asyncTasksPanelViewModelK53 != null) {
                    asyncTasksPanelViewModelK53.FQ2();
                }
                return false;
            }
            C19EG c19egH42 = H4();
            if (c19egH42 != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(c19egH42);
                c1397580mTM.LIZ(2131850038);
                c1397580mTM.LJII = false;
                C985403tE.LIZ(c1397580mTM, new AwS214S0300000_5(this, (C377280Eqk) function0, function02, (Function0<Unit>) 15));
                new C1397510mTF(c1397580mTM).LIZLLL();
                AsyncTasksPanelViewModel asyncTasksPanelViewModelK54 = k5();
                if (asyncTasksPanelViewModelK54 != null) {
                    asyncTasksPanelViewModelK54.zQ2().LIZLLL("click_next", asyncTasksPanelViewModelK54.LL);
                }
                return true;
            }
        }
        return false;
    }
}
