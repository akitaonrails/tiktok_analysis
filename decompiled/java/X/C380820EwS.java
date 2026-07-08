package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMattingStroke;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEMattingStroke;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.core.model.StrokeParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS116S1100000_2;
import kotlin.jvm.internal.AwS42S0100100_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380820EwS extends C0ETZ<InterfaceC373560Ekk, C380940Ewe, C380900Ewa, C380980Ewi> implements InterfaceC373560Ekk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public final Activity LLJJI;
    public final C1DRG LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final ArrayList<String> LLJJJIL;
    public String LLJJJJ;
    public boolean LLJJJJJIL;
    public final C383440F1q LLJJJJLIIL;
    public C380780EwO LLJJL;
    public final C385670FAf<Boolean> LLJJLIIIJLLLLLLLZ;
    public final C385670FAf<List<C380780EwO>> LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C380820EwS.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C380820EwS.class, "cutoutPreviewApi", "getCutoutPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/preview/CutoutPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C380820EwS.class, "cutoutToolBarNewApi", "getCutoutToolBarNewApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/toolbar/CutoutToolBarNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C380820EwS.class, "cutoutStrokeAdjustApi", "getCutoutStrokeAdjustApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/api/CutoutStrokeAdjustApi;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJLILLLLZIIL = 8;
    }

    @Override // X.InterfaceC373560Ekk
    public void ZD() {
        C380780EwO c380780EwO = this.LLJJL;
        if (c380780EwO == null) {
            return;
        }
        List<C380780EwO> list = T2().LIZLLL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C380780EwO c380780EwO2 : list) {
                if (!C383430F1p.LIZ(c380780EwO2) && c380780EwO2.LJI) {
                    return;
                }
            }
        }
        t5(this, c380780EwO.LIZLLL, Boolean.TRUE, null, null, null, null, null, false);
    }

    private final InterfaceC373870ElF O4() {
        return (InterfaceC373870ElF) this.LLJJIJIIJIL.getValue(this, LLJLIL[1]);
    }

    public final void K4() {
        i3(AFwS234S0000000_5.get$arr$(231));
        long jCurrentTimeMillis = System.currentTimeMillis();
        final C383440F1q c383440F1q = this.LLJJJJLIIL;
        final C380830EwT c380830EwT = new C380830EwT(jCurrentTimeMillis, this);
        final AwS42S0100100_5 awS42S0100100_5 = new AwS42S0100100_5(jCurrentTimeMillis, this, 2);
        c383440F1q.getClass();
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        InterfaceC360730ECh interfaceC360730ECh = C0E46.LIZ().LIZ().LIZ;
        if (interfaceC360730ECh != null) {
            interfaceC360730ECh.LJII("editor_pro_cutout_stroke", false, false, true, new InterfaceC365520EUs<ResourceItem>() { // from class: X.0EwW
                @Override // X.InterfaceC365520EUs
                public final void onStart() {
                }

                @Override // X.InterfaceC365520EUs
                public final void LIZ(C0EDV c0edv) {
                    awS42S0100100_5.invoke(c0edv);
                }

                @Override // X.InterfaceC365520EUs
                public final void LIZIZ(List<? extends ResourceItem> list, boolean z) {
                    C383440F1q c383440F1q2 = c383440F1q;
                    ArrayList arrayList = new ArrayList();
                    Iterator<? extends ResourceItem> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Effect effectLIZLLL = C365460EUm.LIZLLL(it2.next().getEffectId());
                        if (effectLIZLLL != null) {
                            c383440F1q2.getClass();
                            C380780EwO c380780EwOLIZIZ = C383440F1q.LIZIZ(effectLIZLLL);
                            if (c380780EwOLIZIZ != null) {
                                arrayList.add(c380780EwOLIZIZ);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    ListProtector.add(arrayList2, 0, C380780EwO.LJIIJJI);
                    c380830EwT.invoke(arrayList2, Boolean.valueOf(z));
                }
            });
        }
    }

    @Override // X.InterfaceC373560Ekk
    public void LLJI() {
        String params;
        NLEResourceNode stroke;
        C380780EwO next;
        InterfaceC373570Ekl interfaceC373570EklP4;
        VecNLEMattingStroke strokes;
        NLEMattingStroke nLEMattingStroke;
        C385670FAf<Boolean> visible;
        NLETrackSlot nLETrackSlotLJIIJJI;
        NLEAIMatting aIMatting;
        NLETrackSlot nLETrackSlotLJIIJJI2;
        C357270DzZ c357270DzZZ4 = Z4();
        boolean z = !((c357270DzZZ4 == null || (nLETrackSlotLJIIJJI2 = c357270DzZZ4.LJIIJJI()) == null || nLETrackSlotLJIIJJI2.getAIMatting() == null) ? false : true);
        C357270DzZ c357270DzZZ42 = Z4();
        NLESegmentAIMatting segment = (c357270DzZZ42 == null || (nLETrackSlotLJIIJJI = c357270DzZZ42.LJIIJJI()) == null || (aIMatting = nLETrackSlotLJIIJJI.getAIMatting()) == null) ? null : aIMatting.getSegment();
        InterfaceC373570Ekl interfaceC373570EklP42 = P4();
        boolean zLJFF = (interfaceC373570EklP42 == null || (visible = interfaceC373570EklP42.getVisible()) == null) ? false : Intrinsics.LJFF(visible.LIZJ(), Boolean.TRUE);
        if (segment == null) {
            t5(this, C380780EwO.LJIIJJI.LIZLLL, Boolean.TRUE, null, null, null, null, null, z);
            i3(AFwS234S0000000_5.get$arr$(234));
            if (zLJFF) {
                LIZ();
                InterfaceC373570Ekl interfaceC373570EklP43 = P4();
                if (interfaceC373570EklP43 != null) {
                    interfaceC373570EklP43.LIZLLL();
                    return;
                }
                return;
            }
            return;
        }
        NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment);
        if (nLESegmentAIMattingDynamicCast == null || (strokes = nLESegmentAIMattingDynamicCast.getStrokes()) == null || (nLEMattingStroke = (NLEMattingStroke) C13LP.LJJJLZIJ(0, strokes)) == null) {
            params = null;
            stroke = null;
        } else {
            params = nLEMattingStroke.getParams();
            stroke = nLEMattingStroke.getStroke();
        }
        StrokeParams strokeParams = (StrokeParams) C309390CAv.LIZ(params, StrokeParams.class);
        Iterator<C380780EwO> it2 = T2().LIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.LJFF(next.LJ, stroke != null ? stroke.getResourceId() : null)) {
                    break;
                }
            }
        }
        C380780EwO c380780EwO = next;
        C380780EwO c380780EwOLIZJ = c380780EwO != null ? C383430F1p.LIZJ(c380780EwO, strokeParams) : null;
        if (stroke != null && strokeParams != null && c380780EwOLIZJ != null) {
            t5(this, c380780EwOLIZJ.LIZLLL, Boolean.TRUE, null, null, null, null, c380780EwOLIZJ.LJIIJ, z);
            i3(AFwS234S0000000_5.get$arr$(236));
            if (!zLJFF || (interfaceC373570EklP4 = P4()) == null) {
                return;
            }
            interfaceC373570EklP4.CD0(c380780EwOLIZJ.LIZJ, c380780EwOLIZJ.LJIIJ);
            return;
        }
        t5(this, C380780EwO.LJIIJJI.LIZLLL, Boolean.TRUE, null, null, null, null, null, z);
        i3(AFwS234S0000000_5.get$arr$(235));
        if (zLJFF) {
            LIZ();
            InterfaceC373570Ekl interfaceC373570EklP44 = P4();
            if (interfaceC373570EklP44 != null) {
                interfaceC373570EklP44.LIZLLL();
            }
        }
    }

    public final InterfaceC373570Ekl P4() {
        return (InterfaceC373570Ekl) this.LLJJJ.getValue(this, LLJLIL[3]);
    }

    public final InterfaceC374220Elo T4() {
        return (InterfaceC374220Elo) this.LLJJIJIL.getValue(this, LLJLIL[2]);
    }

    public final C357270DzZ Z4() {
        return (C357270DzZ) this.LLJJIJI.getValue(this, LLJLIL[0]);
    }

    public final boolean n5() {
        C357270DzZ c357270DzZZ4;
        NLETrackSlot nLETrackSlotLJIIJJI;
        if (this.LLJJJJJIL || ((c357270DzZZ4 = Z4()) != null && c357270DzZZ4.LLJL)) {
            return false;
        }
        C357270DzZ c357270DzZZ42 = Z4();
        return c357270DzZZ42 == null || (nLETrackSlotLJIIJJI = c357270DzZZ42.LJIIJJI()) == null || nLETrackSlotLJIIJJI.getAIMatting() == null;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C380900Ewa> o2() {
        return AFwS191S0000000_5.get$arr$(159);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C380980Ewi> w2() {
        return new AwS549S0100000_5(this, 562);
    }

    public final void H4() {
        NLETrackSlot nLETrackSlotLJIIJJI;
        C380780EwO next;
        InterfaceC374220Elo interfaceC374220EloT4;
        C05YD<Boolean> c05ydOF2;
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        String uuid;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEEditor nLEEditorLJI2;
        NLEBranch branch2;
        NLECommit head2;
        String uuid2;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        C357270DzZ c357270DzZZ4 = Z4();
        if (c357270DzZZ4 == null || (nLETrackSlotLJIIJJI = c357270DzZZ4.LJIIJJI()) == null) {
            return;
        }
        Iterator<C380780EwO> it2 = T2().LIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.LJI) {
                    break;
                }
            }
        }
        C380780EwO c380780EwO = next;
        if (c380780EwO == null) {
            return;
        }
        if (C383430F1p.LIZ(c380780EwO)) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (interfaceC351350Dq1LLFII2 = c0e48F4.LLFII()) != null) {
                interfaceC351350Dq1LLFII2.LJJIJIIJIL(nLETrackSlotLJIIJJI, EnumC356070Dxd.DONE);
            }
            C0E48 c0e48F42 = F4();
            if (c0e48F42 == null || (nLEEditorLJI2 = c0e48F42.LLFII().LJI()) == null || (branch2 = nLEEditorLJI2.getBranch()) == null || (head2 = branch2.getHead()) == null || (uuid2 = head2.getUUID()) == null) {
                return;
            }
            this.LLJJJIL.add(uuid2);
            return;
        }
        if (nLETrackSlotLJIIJJI.getAIMatting() == null) {
            InterfaceC373870ElF interfaceC373870ElFO4 = O4();
            if ((interfaceC373870ElFO4 == null || (c05ydOF2 = interfaceC373870ElFO4.OF2()) == null || !c05ydOF2.getValue().booleanValue()) && (interfaceC374220EloT4 = T4()) != null) {
                interfaceC374220EloT4.al0();
                return;
            }
            return;
        }
        StrokeParams strokeParamsLIZIZ = C383430F1p.LIZIZ(c380780EwO);
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceId(c380780EwO.LJ);
        nLEResourceNode.setResourceFile(c380780EwO.LJFF);
        nLEResourceNode.setExtra("biz_res_id", c380780EwO.LJ);
        C0E48 c0e48F43 = F4();
        if (c0e48F43 != null && (interfaceC351350Dq1LLFII = c0e48F43.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJLJI(nLETrackSlotLJIIJJI, nLEResourceNode, strokeParamsLIZIZ, EnumC356070Dxd.DONE);
        }
        C0E48 c0e48F44 = F4();
        if (c0e48F44 == null || (nLEEditorLJI = c0e48F44.LLFII().LJI()) == null || (branch = nLEEditorLJI.getBranch()) == null || (head = branch.getHead()) == null || (uuid = head.getUUID()) == null) {
            return;
        }
        this.LLJJJIL.add(uuid);
    }

    @Override // X.InterfaceC373560Ekk, X.InterfaceC373170Ek7
    public void LIZ() {
        C357270DzZ c357270DzZZ4 = Z4();
        if (c357270DzZZ4 != null) {
            c357270DzZZ4.LIZLLL();
        }
        if (T2().LJFF) {
            K4();
        }
        if ((!T2().LIZLLL.isEmpty()) && T2().LIZJ) {
            i3(AFwS234S0000000_5.get$arr$(237));
        }
        i3(AFwS234S0000000_5.get$arr$(238));
        show();
        i3(AFwS234S0000000_5.get$arr$(239));
        if (!T2().LIZLLL.isEmpty()) {
            i3(new AwS584S0100000_5(this, 476));
        }
    }

    @Override // X.InterfaceC373560Ekk
    public void LIZLLL() {
        C357270DzZ c357270DzZZ4 = Z4();
        if (c357270DzZZ4 != null) {
            c357270DzZZ4.LIZLLL();
        }
        i3(AFwS234S0000000_5.get$arr$(233));
    }

    @Override // X.InterfaceC373560Ekk
    public C380780EwO VL0() {
        C380780EwO next;
        Iterator<C380780EwO> it2 = T2().LIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LJI) {
                break;
            }
        }
        C380780EwO c380780EwO = next;
        if (C383430F1p.LIZ(c380780EwO)) {
            return null;
        }
        return c380780EwO;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        K4();
    }

    @Override // X.InterfaceC373560Ekk
    public boolean LLJJLIIIJLLLLLLLZ() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC373560Ekk
    public C385670FAf<List<C380780EwO>> getData() {
        return this.LLJL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC373560Ekk, X.InterfaceC373170Ek7
    public C385670FAf<Boolean> getVisible() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC373560Ekk
    public void BS(String str) {
        this.LLJJJIL.add(str);
    }

    @Override // X.InterfaceC373560Ekk
    public void V4(boolean z) {
        t5(this, C380780EwO.LJIIJJI.LIZLLL, Boolean.TRUE, null, null, null, null, null, true);
        if (z) {
            this.LLJJL = null;
        }
    }

    @Override // X.InterfaceC373560Ekk
    public void n71(List<? extends C0F26> list) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        C380780EwO c380780EwO;
        C380780EwO next;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C357270DzZ c357270DzZZ4 = Z4();
        if (c357270DzZZ4 != null && (nLETrackSlotLJIIJJI = c357270DzZZ4.LJIIJJI()) != null) {
            Iterator<C380780EwO> it2 = T2().LIZLLL.iterator();
            while (true) {
                c380780EwO = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LJI) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C380780EwO c380780EwO2 = next;
            if (c380780EwO2 == null) {
                return;
            }
            t5(this, c380780EwO2.LIZLLL, null, null, null, null, null, list, false);
            Iterator<C380780EwO> it3 = T2().LIZLLL.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C380780EwO next2 = it3.next();
                if (next2.LJI) {
                    c380780EwO = next2;
                    break;
                }
            }
            C380780EwO c380780EwO3 = c380780EwO;
            if (c380780EwO3 == null) {
                return;
            }
            StrokeParams strokeParamsLIZIZ = C383430F1p.LIZIZ(c380780EwO3);
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceId(c380780EwO3.LJ);
            nLEResourceNode.setResourceFile(c380780EwO3.LJFF);
            nLEResourceNode.setExtra("biz_res_id", c380780EwO3.LJ);
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (interfaceC351350Dq1LLFII = c0e48F4.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LJLJI(nLETrackSlotLJIIJJI, nLEResourceNode, strokeParamsLIZIZ, EnumC356070Dxd.COMMIT);
            }
        }
    }

    @Override // X.InterfaceC373560Ekk
    public boolean vt2(String str) {
        return this.LLJJJIL.contains(str);
    }

    public C380820EwS(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = activity;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373870ElF.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC374220Elo.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373570Ekl.class, null);
        this.LLJJJIL = new ArrayList<>();
        this.LLJJJJLIIL = new C383440F1q();
        this.LLJJLIIIJLLLLLLLZ = Z1(new C2217381BqS() { // from class: X.0EwY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C380900Ewa) obj).LIZ);
            }
        });
        this.LLJL = Z1(new C2217381BqS() { // from class: X.0EwZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C380900Ewa) obj).LIZLLL;
            }
        });
    }

    public static final void d5(C380820EwS c380820EwS, C380780EwO c380780EwO, Function0 function0) {
        NLETrackSlot nLETrackSlotLJIIJJI;
        if (Intrinsics.LJFF(c380820EwS.LLJJJJ, c380780EwO.LIZLLL) && c380780EwO.LJIIIIZZ == EnumC1641380soa.START) {
            return;
        }
        c380820EwS.LLJJJJ = c380780EwO.LIZLLL;
        VideoPublishEditModel videoPublishEditModelLJIIJ = null;
        if (C383430F1p.LIZ(c380780EwO)) {
            if (c380780EwO.LJI) {
                return;
            }
            C357270DzZ c357270DzZZ4 = c380820EwS.Z4();
            if (c357270DzZZ4 != null) {
                videoPublishEditModelLJIIJ = c357270DzZZ4.LJIIJ();
            }
            C376300EpA.LIZ("select_stroke_none", videoPublishEditModelLJIIJ, null, null, null, 28);
            t5(c380820EwS, c380780EwO.LIZLLL, Boolean.TRUE, null, null, null, null, null, false);
            c380820EwS.H4();
            function0.invoke();
            return;
        }
        if (c380820EwS.T2().LIZIZ) {
            c380820EwS.LLJJJJJIL = true;
            c380820EwS.i3(AFwS234S0000000_5.get$arr$(232));
        }
        if (c380780EwO.LJI) {
            C357270DzZ c357270DzZZ42 = c380820EwS.Z4();
            if (c357270DzZZ42 != null) {
                videoPublishEditModelLJIIJ = c357270DzZZ42.LJIIJ();
            }
            C376300EpA.LIZ("click_stroke_settings", videoPublishEditModelLJIIJ, c380780EwO.LIZJ, null, null, 24);
        } else {
            C357270DzZ c357270DzZZ43 = c380820EwS.Z4();
            if (c357270DzZZ43 != null && (nLETrackSlotLJIIJJI = c357270DzZZ43.LJIIJJI()) != null && nLETrackSlotLJIIJJI.getAIMatting() != null) {
                C357270DzZ c357270DzZZ44 = c380820EwS.Z4();
                if (c357270DzZZ44 != null) {
                    videoPublishEditModelLJIIJ = c357270DzZZ44.LJIIJ();
                }
                C376300EpA.LIZ("select_stroke", videoPublishEditModelLJIIJ, c380780EwO.LIZJ, null, null, 24);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        final C383440F1q c383440F1q = c380820EwS.LLJJJJLIIL;
        String str = c380780EwO.LIZLLL;
        final C380850EwV c380850EwV = new C380850EwV(c380820EwS, c380780EwO, jCurrentTimeMillis, function0);
        final C380840EwU c380840EwU = new C380840EwU(c380820EwS, c380780EwO, jCurrentTimeMillis);
        final AwS441S0200000_5 awS441S0200000_5 = new AwS441S0200000_5(c380820EwS, c380780EwO, 7);
        c383440F1q.getClass();
        C380780EwO c380780EwOLIZIZ = C383440F1q.LIZIZ(C365460EUm.LIZLLL(str));
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        InterfaceC360730ECh interfaceC360730ECh = C0E46.LIZ().LIZ().LIZ;
        if (interfaceC360730ECh != null && interfaceC360730ECh.LIZ(str) && c380780EwOLIZIZ != null) {
            c380850EwV.invoke(c380780EwOLIZIZ, Boolean.TRUE);
            return;
        }
        final C365600EVa c365600EVa = new C365600EVa();
        c365600EVa.LIZ(new AwS116S1100000_2(awS441S0200000_5, str, 19), c383440F1q.LIZ);
        InterfaceC360730ECh interfaceC360730ECh2 = C0E46.LIZ().LIZ().LIZ;
        if (interfaceC360730ECh2 == null) {
            return;
        }
        interfaceC360730ECh2.LIZJ(new InterfaceC365420EUi() { // from class: X.0EwX
            @Override // X.InterfaceC365420EUi
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC365420EUi
            public final void LIZ(String str2, C0EDV c0edv) {
                c365600EVa.LIZIZ();
                c380840EwU.invoke(str2, c0edv);
            }

            @Override // X.InterfaceC365420EUi
            public final void LJJI(String str2, String str3) {
                c365600EVa.LIZIZ();
                awS441S0200000_5.invoke(str2, 100);
                Effect effectLIZLLL = C365460EUm.LIZLLL(str2);
                c383440F1q.getClass();
                C380780EwO c380780EwOLIZIZ2 = C383440F1q.LIZIZ(effectLIZLLL);
                if (effectLIZLLL != null && c380780EwOLIZIZ2 != null) {
                    c380850EwV.invoke(c380780EwOLIZIZ2, Boolean.FALSE);
                } else {
                    c380840EwU.invoke(str2, new C0EDV(new IllegalStateException("effect is not exist"), -1));
                }
            }
        }, str);
    }

    public static final void t5(C380820EwS c380820EwS, String str, Boolean bool, EnumC1641380soa enumC1641380soa, Integer num, String str2, String str3, List list, boolean z) {
        C380780EwO next;
        C380780EwO c380780EwOLIZ;
        boolean zBooleanValue;
        EnumC1641380soa enumC1641380soa2;
        int iIntValue;
        String str4;
        String str5;
        List list2;
        List<C380780EwO> list3 = c380820EwS.T2().LIZLLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator<C380780EwO> it2 = list3.iterator();
        while (true) {
            boolean z2 = false;
            if (!it2.hasNext()) {
                break;
            }
            C380780EwO next2 = it2.next();
            if (Intrinsics.LJFF(next2.LIZLLL, str)) {
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = next2.LJI;
                }
                if (enumC1641380soa == null) {
                    enumC1641380soa2 = next2.LJIIIIZZ;
                } else {
                    enumC1641380soa2 = enumC1641380soa;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = next2.LJIIIZ;
                }
                if (str2 == null) {
                    str4 = next2.LJFF;
                } else {
                    str4 = str2;
                }
                if (str3 == null) {
                    str5 = next2.LJII;
                } else {
                    str5 = str3;
                }
                if (list == null) {
                    list2 = next2.LJIIJ;
                } else {
                    list2 = list;
                }
                c380780EwOLIZ = C380780EwO.LIZ(next2, str4, zBooleanValue, str5, enumC1641380soa2, iIntValue, list2, 31);
            } else {
                if (bool == null) {
                    z2 = next2.LJI;
                }
                c380780EwOLIZ = C380780EwO.LIZ(next2, null, z2, null, null, 0, null, 1983);
            }
            arrayList.add(c380780EwOLIZ);
        }
        c380820EwS.i3(new AwS584S0100000_5(C13LP.LLIIII(arrayList), (List<Pair<Long, Float>>) 477));
        if (!z) {
            Iterator<C380780EwO> it3 = c380820EwS.T2().LIZLLL.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    C380780EwO c380780EwO = next;
                    if (!C383430F1p.LIZ(c380780EwO) && c380780EwO.LJI) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c380820EwS.LLJJL = next;
        }
    }
}
