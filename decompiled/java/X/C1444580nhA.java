package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444580nhA extends AbstractC2255721DQs<InterfaceC572230McP> implements InterfaceC572230McP, InterfaceC379610EuV {
    public static final C1444590nhB LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578380MmK.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), AbstractC1453750nvx.class, null);
    public final C1444580nhA LLILZLL = this;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0nhB] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1444580nhA.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1444580nhA.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0), new C2217381BqS(C1444580nhA.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C1444580nhA.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0)};
        LLIZ = new Object() { // from class: X.0nhB
        };
        LLJ = 8;
    }

    public final InterfaceC578380MmK X1() {
        return (InterfaceC578380MmK) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    public final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLIZLLLIL[2]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    public final AbstractC1453750nvx o2() {
        return (AbstractC1453750nvx) this.LLILZIL.getValue(this, LLIZLLLIL[3]);
    }

    @Override // X.InterfaceC572230McP
    public void H91() {
        InterfaceC1452170ntP value = Z1().g().getValue();
        if (value == null) {
            return;
        }
        InterfaceC578380MmK interfaceC578380MmKX1 = X1();
        C0CHQ.LIZ().getPublishService().LJJJLZIJ(getEditModel().creativeModel.editSaveLocalModel.flowId, value, interfaceC578380MmKX1 != null ? interfaceC578380MmKX1.C1() : getEditModel().hasInfoStickers());
    }

    public C1444580nhA W1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1444580nhA(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
