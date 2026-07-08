package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import ge.i;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ez8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382480Ez8 extends i<InterfaceC376000Eog, C0FC1, C382490Ez9, C382540EzE> implements InterfaceC379610EuV, InterfaceC376000Eog {
    public static final int LLJJJIL = 8;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final Function0<C382490Ez9> LLJJ;
    public final Function0<C382540EzE> LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;

    private final InterfaceC377650ErL F4() {
        return (InterfaceC377650ErL) this.LLJJIII.getValue();
    }

    private final SoftKeyBoardListener K4() {
        return (SoftKeyBoardListener) this.LLJJIJIL.getValue();
    }

    private final InterfaceC1737690vJv O4() {
        return (InterfaceC1737690vJv) this.LLJJIJIIJIL.getValue();
    }

    private final InterfaceC381940EyG P4() {
        return (InterfaceC381940EyG) this.LLJJJ.getValue();
    }

    public final C0EY2 H4() {
        return (C0EY2) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC376000Eog
    public void LIZLLL() {
        C1447800nmM.LIZIZ(this.LLJILJILJ).LLLLLLLZIL(O4());
        i3(AFwS234S0000000_5.get$arr$(476));
        hide();
    }

    @Override // X.InterfaceC376000Eog
    public void Xj() {
        String str;
        String str2;
        String str3;
        AIGCGenerationParam aIGCGenerationParam;
        i3(AFwS234S0000000_5.get$arr$(479));
        T2();
        InterfaceC381940EyG interfaceC381940EyGP4 = P4();
        AIGCGenerationParamType aIGCGenerationParamType = AIGCGenerationParamType.T2I_TYPE;
        Integer numValueOf = Integer.valueOf(T2().LIZ == EnumC378720Et4.TEXT_TO_IMAGE_REPORT ? 3 : 4);
        String str4 = T2().LJII;
        if (str4 == null) {
            str4 = "";
        }
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = T2().LJI;
        if (editorProAIGCMediaItemModel == null || (aIGCGenerationParam = editorProAIGCMediaItemModel.param) == null || (str = aIGCGenerationParam.promptDescription) == null) {
            str = "";
        }
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = T2().LJI;
        if (editorProAIGCMediaItemModel2 == null || (str2 = editorProAIGCMediaItemModel2.referenceImagePath) == null) {
            str2 = "";
        }
        Set<AIGCGenerationParamType> set = C377150EqX.LIZJ;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel3 = T2().LJI;
        String str5 = null;
        if (C13LP.LJJJJ(editorProAIGCMediaItemModel3 != null ? editorProAIGCMediaItemModel3.type : null, set)) {
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModel4 = T2().LJI;
            str3 = editorProAIGCMediaItemModel4 != null ? editorProAIGCMediaItemModel4.serverDownloadUrl : null;
        } else {
            str3 = "";
        }
        Set<AIGCGenerationParamType> set2 = C377150EqX.LIZIZ;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel5 = T2().LJI;
        if (C13LP.LJJJJ(editorProAIGCMediaItemModel5 != null ? editorProAIGCMediaItemModel5.type : null, set2)) {
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModel6 = T2().LJI;
            if (editorProAIGCMediaItemModel6 != null) {
                str5 = editorProAIGCMediaItemModel6.serverDownloadUrl;
            }
        } else {
            str5 = "";
        }
        List list = T2().LJIIIIZZ;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC381940EyGP4.LIZ(aIGCGenerationParamType, new C382210Eyh(numValueOf, str4, str, str2, str3, str5, list), new AwS584S0100000_5(this, 1011));
    }

    @Override // X.InterfaceC376000Eog
    public void clearData() {
        i3(AFwS234S0000000_5.get$arr$(475));
    }

    private final void nD1() {
        K4().LIZIZ(new InterfaceC1391500mJY() { // from class: X.0EzF
            @Override // X.InterfaceC1391500mJY
            public final void LLLL(int i) {
            }

            @Override // X.InterfaceC1391500mJY
            public final void LJJIIJ(int i) {
                this.LL.i3(AFwS234S0000000_5.get$arr$(478));
            }

            @Override // X.InterfaceC1391500mJY
            public final void LJZI(int i) {
                this.LL.i3(AFwS234S0000000_5.get$arr$(477));
            }
        });
    }

    @Override // X.InterfaceC376000Eog
    public boolean LJLILLLLZI() {
        return T2().LIZIZ == EnumC378320EsQ.SHOW || T2().LIZIZ == EnumC378320EsQ.SHOW_WITH_ANIMATION;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        nD1();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C382490Ez9> o2() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C382540EzE> w2() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC376000Eog
    public void KN(String str) {
        i3(new AwS56S1000000_5(str, 17));
    }

    @Override // X.InterfaceC376000Eog
    public void Ko1(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        if (LJLILLLLZI()) {
            return;
        }
        C1447800nmM.LIZIZ(this.LLJILJILJ).LLLIILIL(this, O4());
        i3(new AwS584S0100000_5(editorProAIGCMediaItemModel, 1010));
        show();
    }

    @Override // X.InterfaceC376000Eog
    public void NK0(List<String> list) {
        i3(new AwS584S0100000_5(list, (List<Pair<Long, Float>>) 1012));
    }

    public C382480Ez8(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = AFwS191S0000000_5.get$arr$(351);
        this.LLJJI = new AwS549S0100000_5(this, 1278);
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1273));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1274));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1276));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1275));
        this.LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1277));
    }
}
