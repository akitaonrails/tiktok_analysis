package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pGO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504860pGO extends AbstractC2255721DQs<C0MRT> implements InterfaceC379610EuV, C0MRT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), ArrayList.class, null);
    public volatile boolean LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1504860pGO.class, "forwardMediaList", "getForwardMediaList()Ljava/util/ArrayList;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = 8;
    }

    public C0MRT W1() {
        return this;
    }

    private final ArrayList<ForwardMedia> X1() {
        return (ArrayList) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    @Override // X.C0MRT
    public void oA1() {
        if (this.LLILLL) {
            return;
        }
        C201955140j.LJIILJJIL(C0MRS.LIZIZ, "begin preload video task");
        this.LLILLL = true;
        int size = X1().size();
        for (int i = 1; i < size; i++) {
            ForwardMedia forwardMedia = (ForwardMedia) ListProtector.get(X1(), i);
            final String str = (String) C13LP.LJJLIIIJL(forwardMedia.video.getPlayAddressList());
            if (str != null && str.length() != 0) {
                C1475600oVC c1475600oVC = new C1475600oVC(512000L, C08F1.LIZIZ(str), forwardMedia.video.getSourceVID(), new String[]{str});
                c1475600oVC.LJIIJ = new InterfaceC1475560oV8() { // from class: X.0olp
                    @Override // X.InterfaceC1475560oV8
                    public final void LIZ(C1475490oV1 c1475490oV1) {
                        if (c1475490oV1.LIZ == 2) {
                            C0MRS c0mrs = C0MRS.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("preload success url: ");
                            sbLIZ.append(str);
                            C201955140j.LJIILJJIL(c0mrs, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                };
                C805420Vie.LIZ.LJIIZILJ(c1475600oVC);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1504860pGO(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
