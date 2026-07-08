package X;

import com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0ZqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912120ZqM extends AbstractC2255721DQs<InterfaceC1449590npF> implements InterfaceC1449590npF, InterfaceC379610EuV {
    public static final C912130ZqN LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final IMediaPublishManager LLILLL = C912070ZqH.LIZIZ.LJIILIIL().LJIIIZ();
    public final InterfaceC1449590npF LLILZ = this;
    public boolean LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ZqN] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C912120ZqM.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.0ZqN
        };
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    public InterfaceC1449590npF W1() {
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

    public C912120ZqM(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1449590npF
    public void jm(int i) {
        C01GW c01gw = C294750Bgv.LIZ;
        if (C294750Bgv.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click toolbar icon ");
            sbLIZ.append(i);
            m7(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1449590npF
    public void m7(String str) {
        if (C294750Bgv.LIZIZ && !this.LLILZIL) {
            this.LLILLL.LJFF(getEditModel(), str);
            this.LLILZIL = true;
        }
    }

    @Override // X.InterfaceC1449590npF
    public void uc(InterfaceC1452170ntP interfaceC1452170ntP) {
        this.LLILLL.LJII(getEditModel(), interfaceC1452170ntP);
        this.LLILZIL = false;
    }
}
