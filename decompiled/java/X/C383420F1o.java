package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS119S1100000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383420F1o extends C0ETZ<InterfaceC373570Ekl, C383320F1e, C383380F1k, C0F21> implements InterfaceC373570Ekl {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public final C19A3 LLJJI;
    public final Activity LLJJIII;
    public final C1DRG LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final C385670FAf<Boolean> LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C383420F1o.class, "strokeApi", "getStrokeApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/stroke/api/CutoutStrokeApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C383420F1o.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJJJ = 8;
    }

    private final C357270DzZ H4() {
        return (C357270DzZ) this.LLJJIJIL.getValue(this, LLJJJIL[1]);
    }

    public final InterfaceC373560Ekk K4() {
        return (InterfaceC373560Ekk) this.LLJJIJIIJIL.getValue(this, LLJJJIL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C383380F1k> o2() {
        return AFwS191S0000000_5.get$arr$(161);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0F21> w2() {
        return new AwS549S0100000_5(this, 564);
    }

    @Override // X.InterfaceC373570Ekl, X.InterfaceC373170Ek7
    public void LIZ() {
        C357270DzZ c357270DzZH4 = H4();
        if (c357270DzZH4 != null) {
            c357270DzZH4.LIZLLL();
        }
        i3(AFwS234S0000000_5.get$arr$(241));
        show();
    }

    @Override // X.InterfaceC373570Ekl
    public void LIZLLL() {
        C357270DzZ c357270DzZH4 = H4();
        if (c357270DzZH4 != null) {
            c357270DzZH4.LIZLLL();
        }
        i3(AFwS234S0000000_5.get$arr$(240));
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC373570Ekl, X.InterfaceC373170Ek7
    public C385670FAf<Boolean> getVisible() {
        return this.LLJJJ;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public final void O4(int i) {
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        String uuid;
        InterfaceC373560Ekk interfaceC373560EkkK4;
        List<C0F26> list = T2().LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object c383480F1u : list) {
            if (c383480F1u instanceof C383480F1u) {
                c383480F1u = new C383480F1u(((C383480F1u) c383480F1u).LIZ, i);
            }
            arrayList.add(c383480F1u);
        }
        i3(new AwS584S0100000_5(arrayList, (List<Pair<Long, Float>>) 480));
        InterfaceC373560Ekk interfaceC373560EkkK42 = K4();
        if (interfaceC373560EkkK42 != null) {
            interfaceC373560EkkK42.n71(arrayList);
        }
        C0E1X c0e1x = new C0E1X(C0E1V.EDIT_STROKE.getNameId(), null, null, null, null, 30);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            C350870DpF.LIZJ(c0e48F4, C051R.LIZIZ(c0e1x));
        }
        C357270DzZ c357270DzZH4 = H4();
        if (c357270DzZH4 != null) {
            videoPublishEditModelLJIIJ = c357270DzZH4.LJIIJ();
        } else {
            videoPublishEditModelLJIIJ = null;
        }
        C376300EpA.LIZ("adjust_stroke", videoPublishEditModelLJIIJ, T2().LIZ, C0F24.LIZ(EnumC383510F1x.COLOR), null, 16);
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (nLEEditorLJI = c0e48F42.LLFII().LJI()) != null && (branch = nLEEditorLJI.getBranch()) != null && (head = branch.getHead()) != null && (uuid = head.getUUID()) != null && (interfaceC373560EkkK4 = K4()) != null) {
            interfaceC373560EkkK4.BS(uuid);
        }
    }

    @Override // X.InterfaceC373570Ekl
    public void CD0(String str, List<? extends C0F26> list) {
        i3(new AwS119S1100000_5(str, (String) list, (List<? extends C0F26>) 7));
    }

    public final void T4(EnumC383510F1x enumC383510F1x, float f) {
        VideoPublishEditModel videoPublishEditModelLJIIJ;
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head;
        String uuid;
        InterfaceC373560Ekk interfaceC373560EkkK4;
        C0E1X c0e1x = new C0E1X(C0E1V.EDIT_STROKE.getNameId(), null, null, null, null, 30);
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            C350870DpF.LIZJ(c0e48F4, C051R.LIZIZ(c0e1x));
        }
        C357270DzZ c357270DzZH4 = H4();
        if (c357270DzZH4 != null) {
            videoPublishEditModelLJIIJ = c357270DzZH4.LJIIJ();
        } else {
            videoPublishEditModelLJIIJ = null;
        }
        C376300EpA.LIZ("adjust_stroke", videoPublishEditModelLJIIJ, T2().LIZ, C0F24.LIZ(enumC383510F1x), null, 16);
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (nLEEditorLJI = c0e48F42.LLFII().LJI()) != null && (branch = nLEEditorLJI.getBranch()) != null && (head = branch.getHead()) != null && (uuid = head.getUUID()) != null && (interfaceC373560EkkK4 = K4()) != null) {
            interfaceC373560EkkK4.BS(uuid);
        }
    }

    public C383420F1o(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = activity;
        this.LLJJIJI = c1drg;
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC373560Ekk.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
        this.LLJJJ = Z1(new C2217381BqS() { // from class: X.0F1h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C383380F1k) obj).LIZJ);
            }
        });
    }

    public final void P4(EnumC383510F1x enumC383510F1x, float f, boolean z) {
        if (!z) {
            return;
        }
        List<C0F26> list = T2().LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Object objLIZIZ : list) {
            if (objLIZIZ instanceof C383450F1r) {
                C383450F1r c383450F1r = (C383450F1r) objLIZIZ;
                if (c383450F1r.LIZ == enumC383510F1x) {
                    objLIZIZ = C383450F1r.LIZIZ(c383450F1r, f);
                }
            }
            arrayList.add(objLIZIZ);
        }
        i3(new AwS584S0100000_5(arrayList, (List<Pair<Long, Float>>) 481));
        InterfaceC373560Ekk interfaceC373560EkkK4 = K4();
        if (interfaceC373560EkkK4 != null) {
            interfaceC373560EkkK4.n71(arrayList);
        }
    }
}
