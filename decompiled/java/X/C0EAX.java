package X;

import Y.AObserverS209S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.app.Activity;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS30S1110000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS93S0110000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EAX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EAX extends C0ETX<InterfaceC372770EjT, C0EBG, C360210EAh, C0EAM> implements InterfaceC372770EjT, InterfaceC497601wk {
    public static final C360250EAl LLLJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJL;
    public static final int LLLL;
    public final C19A3 LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final Activity LLJJL;
    public final C372830EjZ LLJJLIIIJLLLLLLLZ;
    public final CoroutineContext LLJL;
    public C0EBG LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C0EAC LLJLLIL;
    public final C01GW LLJLLL;
    public final C0EAD LLJZ;
    public final C01GW LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public final C360170EAd LLLI;
    public final C01GW LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;
    public final InterfaceC1731706qJ LLLIIIL;
    public final InterfaceC1731706qJ LLLIIL;
    public final C0EAI LLLIILIL;
    public final C01GW LLLIL;
    public final C0EAB LLLILZ;
    public final C01GW LLLILZJ;
    public final C0EAJ LLLILZLLLI;
    public String LLLIZZ;
    public String LLLJ;

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0EAl] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EAX.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/retouch/RetouchPanelRootContext;", 0);
        C13LE.LIZ.getClass();
        LLLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EAX.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0), new C2217381BqS(C0EAX.class, "editorProStickerApi", "getEditorProStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0), new C2217381BqS(C0EAX.class, "previewPanel", "getPreviewPanel()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0), new C2217381BqS(C0EAX.class, "editProApi", "getEditProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C0EAX.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C0EAX.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0), new C2217381BqS(C0EAX.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0), new C2217381BqS(C0EAX.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0), new C2217381BqS(C0EAX.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0)};
        LLLJIL = new Object() { // from class: X.0EAl
        };
        LLLL = 8;
    }

    private final InterfaceC360800ECo S5() {
        return (InterfaceC360800ECo) this.LLLIIII.getValue(this, LLLJL[6]);
    }

    private final InterfaceC1460000o62 d6() {
        return (InterfaceC1460000o62) this.LLLFZ.getValue(this, LLLJL[5]);
    }

    private final C0E5S n7() {
        return (C0E5S) this.LLLIIL.getValue(this, LLLJL[9]);
    }

    @Override // ge.i
    public Function0<C0EBG> E3() {
        return new AwS549S0100000_5(this, 593);
    }

    public final InterfaceC359950E9h J6() {
        return (InterfaceC359950E9h) this.LLLIIIIL.getValue(this, LLLJL[7]);
    }

    public final C360100E9w K6() {
        return (C360100E9w) this.LLJZIJLIL.getValue();
    }

    public final C0EA5 L6() {
        return (C0EA5) this.LLLILZJ.getValue();
    }

    public final void LJJJJ() {
        i3(AFwS234S0000000_5.get$arr$(262));
        P6().LIZIZ();
        C0EOK c0eokM6 = m6();
        if (c0eokM6 != null) {
            c0eokM6.setVisibility(0);
        }
        N5(true);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            C350870DpF.LIZ(c0e48F4, false);
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
    }

    public final C360040E9q N6() {
        return (C360040E9q) this.LLJLILLLLZIIL.getValue(this, LLLJL[0]);
    }

    public final C0EAY P6() {
        return (C0EAY) this.LLLII.getValue();
    }

    public final C0EAU R5() {
        return (C0EAU) this.LLLIL.getValue();
    }

    public final InterfaceC361710EGb S6() {
        return (InterfaceC361710EGb) this.LLLFF.getValue(this, LLLJL[3]);
    }

    public final InterfaceC361710EGb T6() {
        return (InterfaceC361710EGb) this.LLLIIIL.getValue(this, LLLJL[8]);
    }

    public final InterfaceC377540ErA U5() {
        return (InterfaceC377540ErA) this.LLLFFI.getValue(this, LLLJL[4]);
    }

    public final C360180EAe W6() {
        return (C360180EAe) this.LLJLLL.getValue();
    }

    @Override // X.InterfaceC372770EjT
    public void cancel() {
        C0E55 player;
        NLEEditor nLEEditorLJI;
        i3(AFwS234S0000000_5.get$arr$(261));
        P6().LIZIZ();
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (nLEEditorLJI = c0e48F4.LLFII().LJI()) != null) {
            nLEEditorLJI.goTo(this.LLLIZZ);
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (player = c0e48F42.getPlayer()) != null) {
            player.LJJIIZ(null);
        }
        C0EOK c0eokM6 = m6();
        if (c0eokM6 != null) {
            c0eokM6.setVisibility(0);
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
    }

    public final C365380EUe d7() {
        return (C365380EUe) this.LLJLL.getValue();
    }

    public final C0EOK m6() {
        return (C0EOK) this.LLLF.getValue(this, LLLJL[2]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C360210EAh> o2() {
        return AFwS191S0000000_5.get$arr$(165);
    }

    public final void o8() {
        i3(AFwS234S0000000_5.get$arr$(264));
        C360180EAe c360180EAeW6 = W6();
        c360180EAeW6.LIZLLL = 0;
        c360180EAeW6.LJ = 0;
        c360180EAeW6.LJFF = System.currentTimeMillis();
        i3(AFwS234S0000000_5.get$arr$(265));
        W6().LIZIZ();
    }

    public final void p8() {
        i3(new AwS584S0100000_5(this, 512));
        T8();
    }

    public final void s7() {
        InterfaceC361710EGb interfaceC361710EGbLJIIIZ;
        InterfaceC361710EGb interfaceC361710EGbLJIIIZ2;
        LiveData<C0E2C> liveDataLIZ;
        C0EBG c0ebg = this.LLJLIL;
        if (c0ebg != null) {
            C0EAY c0eayP6 = P6();
            C0E48 c0e48Invoke = c0eayP6.LJ.invoke();
            if (c0e48Invoke != null && (liveDataLIZ = C0EB5.LIZ(c0e48Invoke, c0eayP6.LIZIZ)) != null) {
                liveDataLIZ.observe(c0ebg, new AObserverS209S0100000_5(c0eayP6, 67));
            }
            C0EOK c0eok = c0eayP6.LIZLLL;
            if (c0eok != null) {
                c0eok.PF0(false);
            }
            InterfaceC361710EGb interfaceC361710EGb = c0eayP6.LIZJ;
            if (interfaceC361710EGb != null) {
                interfaceC361710EGb.LR1(false);
            }
            C360040E9q c360040E9q = c0eayP6.LIZ;
            if (c360040E9q != null && (interfaceC361710EGbLJIIIZ2 = c360040E9q.LJIIIZ()) != null) {
                interfaceC361710EGbLJIIIZ2.V52(c0eayP6.LJIIIZ);
            }
            C360040E9q c360040E9q2 = c0eayP6.LIZ;
            if (c360040E9q2 == null || (interfaceC361710EGbLJIIIZ = c360040E9q2.LJIIIZ()) == null) {
                return;
            }
            interfaceC361710EGbLJIIIZ.kV0(new AwS584S0100000_5(c0eayP6, 506));
        }
    }

    public final C0EB6 u6() {
        return (C0EB6) this.LLL.getValue(this, LLLJL[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EAM> w2() {
        return new AwS549S0100000_5(this, 592);
    }

    private final void I7() {
        C360040E9q c360040E9qN6 = N6();
        if (c360040E9qN6 == null || !c360040E9qN6.LLJ) {
            J6().QO0().observe(this, new AObserverS209S0100000_5(this, 63));
        } else {
            o7();
        }
    }

    private final void L7() {
        C360040E9q c360040E9qN6 = N6();
        if (c360040E9qN6 == null || !c360040E9qN6.LLJ) {
            J6().QO0().observe(this, new AObserverS209S0100000_5(this, 64));
        } else {
            s7();
        }
    }

    private final void P8() {
        InterfaceC1460000o62 interfaceC1460000o62D6 = d6();
        if (interfaceC1460000o62D6 != null) {
            interfaceC1460000o62D6.Ux(8000, true);
        }
        InterfaceC1460000o62 interfaceC1460000o62D62 = d6();
        if (interfaceC1460000o62D62 != null) {
            interfaceC1460000o62D62.Ux(8001, true);
        }
    }

    private final void T8() {
        String resourceId = T2().LJ.LIZ.LIZJ ? "-1000" : T2().LIZLLL.LIZ.getResourceId();
        Iterator<NLETrackSlot> it2 = k7().iterator();
        while (it2.hasNext()) {
            it2.next().setExtra("ep_retouch_last_selected_resId", resourceId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Z7() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EAX.Z7():void");
    }

    private final void tM() {
        InterfaceC1460000o62 interfaceC1460000o62D6 = d6();
        if (interfaceC1460000o62D6 != null) {
            interfaceC1460000o62D6.Ux(8000, false);
        }
        InterfaceC1460000o62 interfaceC1460000o62D62 = d6();
        if (interfaceC1460000o62D62 != null) {
            interfaceC1460000o62D62.Ux(8001, false);
        }
    }

    private final void u7() {
        InterfaceC360800ECo interfaceC360800ECoS5 = S5();
        if (interfaceC360800ECoS5 != null) {
            C0EB4.LIZIZ(interfaceC360800ECoS5, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN}, 8, null, null, null, 28);
        }
    }

    private final void y7() {
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.fx1(new AwS549S0100000_5(this, 595));
        }
    }

    public final void E5() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_auto_apply_retouch", true, false)) {
            C0EAU c0eauR5 = R5();
            NLENode nLENode = (NLENode) C13LP.LJJJLL(k7());
            c0eauR5.getClass();
            if (nLENode != null) {
                if (nLENode.hasExtra("is_beauty_auto_retouch_off") && Boolean.parseBoolean(nLENode.getExtra("is_beauty_auto_retouch_off"))) {
                    return;
                }
                C0EAU c0eauR52 = R5();
                c0eauR52.LJII.LIZ(AFwS234S0000000_5.get$arr$(545));
                c0eauR52.LIZIZ(new AwS549S0100000_5(c0eauR52, 1603));
            }
        }
    }

    public final boolean W7() {
        NLETrack nLETrackPt;
        C0E48 c0e48F4 = F4();
        return Intrinsics.LJFF((c0e48F4 == null || (nLETrackPt = c0e48F4.Pt()) == null) ? null : Boolean.valueOf(C351220Dpo.LLLIIL(nLETrackPt)), Boolean.TRUE);
    }

    public final void a9() {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(k7());
        boolean z = false;
        if (nLETrackSlot == null) {
            J8(false);
            return;
        }
        if (!C351220Dpo.LJIIJ(nLETrackSlot).isEmpty()) {
            List<C351410Dq7> listLJIIJ = C351220Dpo.LJIIJ(nLETrackSlot);
            if (!listLJIIJ.isEmpty()) {
                Iterator<C351410Dq7> it2 = listLJIIJ.iterator();
                loop0: while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ArrayList<Pair<String, Integer>> arrayList = it2.next().LIZ.LIZJ;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator<Pair<String, Integer>> it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().getSecond().intValue() != 0) {
                                z = true;
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        J8(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r1 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.bytedance.ies.nle.editor_jni.NLETrackSlot> k7() {
        /*
            r5 = this;
            X.0E48 r4 = r5.F4()
            X.0E9q r3 = r5.N6()
            r2 = 1
            if (r3 == 0) goto L30
            X.0ELJ r0 = r3.LJIIIIZZ()
            if (r0 == 0) goto L29
            boolean r0 = r0.getRetouchMultiTrackMode()
            if (r0 != r2) goto L29
            r1 = 1
        L18:
            boolean r0 = r3.LLJ
            if (r0 != r2) goto L2d
        L1c:
            if (r4 == 0) goto L47
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r4.LLLLLLIL()
            if (r0 == 0) goto L47
            java.util.List r0 = java.util.Collections.singletonList(r0)
        L28:
            return r0
        L29:
            r1 = 0
            if (r3 == 0) goto L2d
            goto L18
        L2d:
            if (r1 == 0) goto L30
            goto L1c
        L30:
            if (r4 == 0) goto L44
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r4.Rn()
            if (r0 == 0) goto L44
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.getSortedSlots()
            if (r0 == 0) goto L44
            java.util.List r0 = X.C13LP.LLIIII(r0)
            if (r0 != 0) goto L28
        L44:
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        L47:
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EAX.k7():java.util.List");
    }

    public final void o7() {
        String uuid;
        InterfaceC358840E5a interfaceC358840E5aBo;
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (nLEEditorLJI = c0e48F4.LLFII().LJI()) == null || (branch = nLEEditorLJI.getBranch()) == null || (head = branch.getHead()) == null || (uuid = head.getUUID()) == null) {
            uuid = "";
        }
        this.LLLIZZ = uuid;
        N5(false);
        C0EOK c0eokM6 = m6();
        if (c0eokM6 != null) {
            c0eokM6.setVisibility(4);
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null) {
            C350870DpF.LIZ(c0e48F42, false);
        }
        C0E48 c0e48F43 = F4();
        if (c0e48F43 == null || (interfaceC358840E5aBo = c0e48F43.Bo()) == null) {
            return;
        }
        interfaceC358840E5aBo.LIZLLL(this.LLLILZLLLI);
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        u7();
        I7();
        Z7();
        W6().LIZIZ();
        L7();
        y7();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    @Override // X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EAX.onDestroy():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        a9();
        i3(AFwS234S0000000_5.get$arr$(263));
    }

    public final void r8() {
        C360150EAb c360150EAb;
        Object next;
        List<ResourceItem> resourceList;
        C351390Dq5 c351390Dq5;
        C351390Dq5 c351390Dq52;
        ArrayList<Pair<String, Integer>> arrayList;
        Pair pair;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(k7());
        if (nLETrackSlot == null) {
            return;
        }
        List<C351410Dq7> listLJIIJ = C351220Dpo.LJIIJ(nLETrackSlot);
        String resourceId = T2().LIZLLL.LIZ.getResourceId();
        boolean zLJFF = Intrinsics.LJFF(resourceId, "-1000");
        if (a0.LJJJIL(resourceId) || zLJFF) {
            c360150EAb = new C360150EAb(2);
        } else {
            Iterator it2 = ((ArrayList) listLJIIJ).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C351410Dq7) next).LIZ.LIZIZ, resourceId)) {
                        break;
                    }
                }
            }
            C351410Dq7 c351410Dq7 = (C351410Dq7) next;
            boolean z = false;
            int iIntValue = (c351410Dq7 == null || (c351390Dq52 = c351410Dq7.LIZ) == null || (arrayList = c351390Dq52.LIZJ) == null || (pair = (Pair) C13LP.LJJJLL(arrayList)) == null) ? 0 : ((Number) pair.getSecond()).intValue();
            Pair pair2 = (c351410Dq7 == null || (c351390Dq5 = c351410Dq7.LIZ) == null || !c351390Dq5.LIZLLL) ? new Pair(0, 100) : new Pair(-50, 50);
            C0EBG c0ebg = this.LLJLIL;
            if (c0ebg != null) {
                LinearLayout linearLayoutLLLLLLZ = c0ebg.LLLLLLZ();
                C0EDF c0edfLLLLZIL = (linearLayoutLLLLLLZ == null || linearLayoutLLLLLLZ.getVisibility() != 0) ? c0ebg.LLLLZIL() : c0ebg.LLLLLLLZIL();
                if (c0edfLLLLZIL != null && (resourceList = c0edfLLLLZIL.getResourceList()) != null && !resourceList.isEmpty()) {
                    Iterator<ResourceItem> it3 = resourceList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (Intrinsics.LJFF(it3.next().getResourceId(), resourceId)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            c360150EAb = new C360150EAb(z, new C0EB2(iIntValue, ((Number) pair2.getFirst()).intValue(), ((Number) pair2.getSecond()).intValue()));
        }
        i3(new AwS214S0300000_5(c360150EAb, nLETrackSlot, this, 9));
    }

    public final void y8() {
        C360040E9q c360040E9qN6 = N6();
        if (c360040E9qN6 == null || !c360040E9qN6.LLJ) {
            J6().QO0().observe(this, new AObserverS209S0100000_5(this, 62));
            return;
        }
        i3(AFwS234S0000000_5.get$arr$(260));
        z8();
        K6().LIZJ(this);
    }

    public final void z8() {
        C0EBG c0ebg;
        if (!T2().LIZIZ.LIZ.booleanValue() || (c0ebg = this.LLJLIL) == null) {
            return;
        }
        C12WG.LIZJ(c0ebg, new ARunnableS105S0100000_5(this, 51));
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLJL;
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC372770EjT
    public void save() {
        LJJJJ();
    }

    private final void J8(boolean z) {
        InterfaceC361710EGb interfaceC361710EGbT6 = T6();
        if (interfaceC361710EGbT6 != null) {
            interfaceC361710EGbT6.dP1(z);
        }
    }

    public final void N5(boolean z) {
        VecNLETrackSPtr tracks;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (tracks = C350870DpF.LJI(c0e48F4).getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (C351220Dpo.LLLJL(nLETrack) || C351220Dpo.LLLIZZ(nLETrack) || C351220Dpo.LLJLLIL(nLETrack)) {
                    nLETrack.setEnable(z);
                }
            }
        }
    }

    public final void d8(boolean z) {
        C0E55 player;
        NLEEditor nLEEditorLJI;
        C0E55 player2;
        if (z) {
            R5().LIZ();
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null) {
                C350870DpF.LIZ(c0e48F4, false);
            }
            C0EAE c0eae = C0EAE.LIZ;
            C0EAE.LJ(LJJJLIIL(), EnumC373620Ekq.COMPARE);
            return;
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (player2 = c0e48F42.getPlayer()) != null) {
            player2.LJIIZILJ(false);
        }
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (nLEEditorLJI = c0e48F43.LLFII().LJI()) != null) {
            nLEEditorLJI.resetHead();
        }
        N5(false);
        C0E48 c0e48F44 = F4();
        if (c0e48F44 != null && (player = c0e48F44.getPlayer()) != null) {
            player.LJIIZILJ(true);
        }
        C0E48 c0e48F45 = F4();
        if (c0e48F45 == null) {
            return;
        }
        C350870DpF.LIZ(c0e48F45, false);
    }

    public final void u8(NLETrackSlot nLETrackSlot) {
        boolean z;
        String resourceId;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot next;
        String uuid;
        C0ELJ c0eljLJIIIIZZ;
        C360040E9q c360040E9qN6 = N6();
        boolean z2 = true;
        if (c360040E9qN6 != null && (c0eljLJIIIIZZ = c360040E9qN6.LJIIIIZZ()) != null && c0eljLJIIIIZZ.getRetouchMultiTrackMode()) {
            z = true;
        } else {
            z = false;
        }
        C360040E9q c360040E9qN62 = N6();
        if (c360040E9qN62 == null || !c360040E9qN62.LLJ) {
            z2 = false;
        }
        String str = null;
        String str2 = "";
        if (!z2 && !z) {
            T8();
        } else {
            if (T2().LJ.LIZ.LIZJ) {
                resourceId = "-1000";
            } else {
                resourceId = T2().LIZLLL.LIZ.getResourceId();
            }
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (nLETrackRn = c0e48F4.Rn()) != null && (slots = nLETrackRn.getSlots()) != null) {
                Iterator<NLETrackSlot> it2 = slots.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        String uuid2 = next.getUUID();
                        if (uuid2 == null) {
                            uuid2 = "";
                        }
                        if (Intrinsics.LJFF(uuid2, this.LLLJ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrackSlot nLETrackSlot2 = next;
                if (nLETrackSlot2 != null) {
                    nLETrackSlot2.setExtra("ep_retouch_last_selected_resId", resourceId);
                }
            }
        }
        if (nLETrackSlot != null && (uuid = nLETrackSlot.getUUID()) != null) {
            str2 = uuid;
        }
        this.LLLJ = str2;
        a9();
        if (nLETrackSlot != null) {
            Iterator it3 = Collections.singletonList(nLETrackSlot).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                String extra = ((NLENode) it3.next()).getExtra("ep_retouch_last_selected_resId");
                if (extra != null) {
                    str = extra;
                    break;
                }
            }
            i3(new AwS30S1110000_5(this, Intrinsics.LJFF(str, "-1000"), str, 1));
        } else {
            i3(new AwS584S0100000_5(this, 513));
        }
        r8();
        i3(AFwS234S0000000_5.get$arr$(266));
    }

    public final void H5(String str, String str2) {
        C0E55 player;
        C0E55 player2;
        C0E55 player3;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            C350870DpF.LIZ(c0e48F4, false);
        }
        C0E48 c0e48F42 = F4();
        NLEEditor nLEEditorLJI = null;
        if (c0e48F42 != null && (player3 = c0e48F42.getPlayer()) != null) {
            player3.LJJIIZ(null);
        }
        N5(true);
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (player2 = c0e48F43.getPlayer()) != null) {
            player2.LJIIZILJ(false);
        }
        C0E1X c0e1x = new C0E1X(str, null, null, str2, null, 22);
        C0E48 c0e48F44 = F4();
        if (c0e48F44 != null) {
            nLEEditorLJI = c0e48F44.LLFII().LJI();
        }
        C350410DoV.LIZLLL(nLEEditorLJI, true, C051R.LIZIZ(c0e1x), false, true);
        C0E48 c0e48F45 = F4();
        if (c0e48F45 != null && (player = c0e48F45.getPlayer()) != null) {
            player.LJIIZILJ(true);
        }
        N5(false);
        a9();
    }

    public final void h8(boolean z, List<? extends ResourceItem> list) {
        int i;
        R5().LJIIIIZZ.addAll(list);
        i3(new AwS20S0010000_5(z, 26));
        C360180EAe c360180EAeW6 = W6();
        if (z) {
            i = c360180EAeW6.LIZLLL | 2;
        } else {
            i = c360180EAeW6.LIZLLL & (-3);
        }
        c360180EAeW6.LIZLLL = i;
        c360180EAeW6.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0EAD] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0EAd] */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.0EAI] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.0EAB] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.0EAJ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0EAC] */
    public C0EAX(C19A3 c19a3, C1DRG c1drg, Activity activity, C372830EjZ c372830EjZ) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = c19a3;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = activity;
        this.LLJJLIIIJLLLLLLLZ = c372830EjZ;
        this.LLJL = C0PEM.LIZJ;
        this.LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), C360040E9q.class, null);
        this.LLJLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(164));
        this.LLJLLIL = new InterfaceC360230EAj() { // from class: X.0EAC
            @Override // X.InterfaceC360230EAj
            public final void LIZ() {
                C0EAX c0eax = this.LIZ;
                c0eax.i3(new AwS93S0110000_5(c0eax, 7));
            }

            @Override // X.InterfaceC360230EAj
            public final void LIZIZ() {
                C0EAX c0eax = this.LIZ;
                c0eax.i3(new AwS584S0100000_5(c0eax, 511));
            }

            @Override // X.InterfaceC360230EAj
            public final void LIZJ() {
                this.LIZ.y8();
            }

            @Override // X.InterfaceC360230EAj
            public final void LIZLLL() {
                C360040E9q c360040E9qN6 = this.LIZ.N6();
                if (c360040E9qN6 == null || !c360040E9qN6.LLJ) {
                    C354270Duj.LIZJ(0L, new AwS549S0100000_5(this.LIZ, 596));
                } else {
                    this.LIZ.P6().LIZ();
                }
            }
        };
        this.LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 591));
        this.LLJZ = new InterfaceC360130E9z() { // from class: X.0EAD
            @Override // X.InterfaceC360130E9z
            public final void LIZ() {
                this.LIZ.E5();
            }

            @Override // X.InterfaceC360130E9z
            public final boolean LIZJ() {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(this.LIZ.k7());
                return nLETrackSlot != null && C351220Dpo.LLFZ(nLETrackSlot);
            }

            @Override // X.InterfaceC360130E9z
            public final VideoPublishEditModel LJJJLIIL() {
                return this.LIZ.LJJJLIIL();
            }

            @Override // X.InterfaceC360130E9z
            public final void LIZIZ(List<Float> list) {
                this.LIZ.i3(new AwS584S0100000_5(list, (List<Pair<Long, Float>>) 510));
            }
        };
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 594));
        this.LLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
        this.LLLF = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLLFF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLLFFI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLLFZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLLI = new InterfaceC360220EAi() { // from class: X.0EAd
            @Override // X.InterfaceC360220EAi
            public final VideoPublishEditModel LJJJLIIL() {
                return this.LIZ.LJJJLIIL();
            }

            @Override // X.InterfaceC360220EAi
            public final void LIZ(boolean z) {
                this.LIZ.d8(z);
            }
        };
        this.LLLII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 598));
        this.LLLIIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLLIIIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLLIIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLLIIL = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLLIILIL = new C0EAO() { // from class: X.0EAI
            @Override // X.C0EAO
            public final VideoPublishEditModel LJJJLIIL() {
                return this.LIZ.LJJJLIIL();
            }

            @Override // X.C0EAO
            public final List<NLETrackSlot> LLLLLLIL() {
                return this.LIZ.k7();
            }

            @Override // X.C0EAO
            public final C360210EAh getState() {
                return this.LIZ.T2();
            }

            @Override // X.C0EAO
            public final void LIZ(Function1<? super C360210EAh, C360210EAh> function1) {
                this.LIZ.i3(function1);
            }

            @Override // X.C0EAO
            public final void LIZIZ(String str, String str2) {
                this.LIZ.H5(str, str2);
            }
        };
        this.LLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 590));
        this.LLLILZ = new C0EA8() { // from class: X.0EAB
            @Override // X.C0EA8
            public final VideoPublishEditModel LJJJLIIL() {
                return this.LIZ.LJJJLIIL();
            }

            @Override // X.C0EA8
            public final List<NLETrackSlot> LLLLLLIL() {
                return this.LIZ.k7();
            }

            @Override // X.C0EA8
            public final C360210EAh getState() {
                return this.LIZ.T2();
            }

            @Override // X.C0EA8
            public final void LIZ(Function1<? super C360210EAh, C360210EAh> function1) {
                this.LIZ.i3(function1);
            }

            @Override // X.C0EA8
            public final void LIZIZ(String str, String str2) {
                this.LIZ.H5(str, str2);
            }
        };
        this.LLLILZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 597));
        this.LLLILZLLLI = new InterfaceC357170DzP() { // from class: X.0EAJ
            @Override // X.InterfaceC357170DzP
            public final void LIZJ(EnumC357140DzM enumC357140DzM) {
                C0E55 player;
                C0E48 c0e48F4 = this.LIZ.F4();
                if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
                    player.LJIIZILJ(false);
                }
            }

            @Override // X.InterfaceC357170DzP
            public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z) {
                C0E55 player;
                this.LIZ.N5(false);
                C0E48 c0e48F4 = this.LIZ.F4();
                if (c0e48F4 != null && (player = c0e48F4.getPlayer()) != null) {
                    player.LJIIZILJ(true);
                }
                C0E48 c0e48F42 = this.LIZ.F4();
                if (c0e48F42 != null) {
                    C350870DpF.LIZ(c0e48F42, false);
                }
                this.LIZ.a9();
                this.LIZ.r8();
            }
        };
        this.LLLIZZ = "";
        this.LLLJ = "";
    }
}
