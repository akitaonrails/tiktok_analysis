package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o1Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457220o1Y extends AbstractC2255721DQs<InterfaceC1456720o0k> implements InterfaceC1456720o0k, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final AbstractC214814194y LLILLJJLI;
    public final Function0<C1DRG> LLILLL;
    public final InterfaceC1456720o0k LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 358));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 359));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1457220o1Y.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1457220o1Y.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJI = 8;
    }

    private final C1459920o5u X1() {
        return (C1459920o5u) this.LLIZ.getValue();
    }

    public final InterfaceC1459790o5h Z1() {
        return (InterfaceC1459790o5h) this.LLIZLLLIL.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLILZLL.getValue(this, LLJ[1]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJ[0]);
    }

    @Override // X.InterfaceC1456720o0k
    public void ku0() {
        if (!C1459710o5Z.LJIIJJI || getEditModel().creativeModel.pugcTemplateData.isFromCreateTemplate) {
            if (getEditModel().creativeModel.draftInfoModel.isDraft) {
                C856830XjN.LIZ = false;
            }
        } else {
            if (Intrinsics.LJFF(getEditModel().getEnterFrom(), "effect_qr_scan")) {
                return;
            }
            X1().LJI(getEditModel(), new InterfaceC1460130o6F() { // from class: X.0o1Z
                @Override // X.InterfaceC1460130o6F
                public final void LIZ(boolean z) {
                    if (z) {
                        C856830XjN.LIZ = true;
                        return;
                    }
                    C856830XjN.LIZ = false;
                    C1459710o5Z.LJ(this.LIZ.Z1(), C08CX.INSTANCE);
                }
            });
        }
    }

    public InterfaceC1456720o0k W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1457220o1Y(C1DRG c1drg, AbstractC214814194y abstractC214814194y, Function0<C1DRG> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = abstractC214814194y;
        this.LLILLL = function0;
    }
}
