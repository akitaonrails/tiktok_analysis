package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0tLE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661620tLE implements InterfaceC1660130tIp<C1660350tJB>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LL;
    public final C1461780o8u LLILLJJLI;
    public final AnonymousClass0951 LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1661620tLE.class, "lco", "getLco()Landroidx/lifecycle/LifecycleOwner;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1661620tLE.class, "callbacksComponent", "getCallbacksComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/business/EditToolBarClickCallbacksApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1661620tLE.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        C1664740tQG c1664740tQG = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        InterfaceC1455360nyY interfaceC1455360nyY = (InterfaceC1455360nyY) c1664740tQG.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC1455360nyY != null) {
            interfaceC1455360nyY.U81();
        }
        this.LLILLJJLI.LIZ(((LifecycleOwner) this.LLILZ.getValue(this, interfaceC2217461BqaArr[0])).getLifecycle(), ((VideoPublishEditModel) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[2])).creativeModel, AFwS214S0000000_25.get$arr$(573));
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<InterfaceC1461640o8g<C1660350tJB>> getState() {
        return this.LLILLL;
    }

    public C1661620tLE(C1DRG c1drg) {
        this.LL = c1drg;
        C1461780o8u c1461780o8u = new C1461780o8u();
        this.LLILLJJLI = c1461780o8u;
        C1698270uIL c1698270uIL = new C1698270uIL(c1461780o8u.LL, 20);
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII());
        C05YW.LIZ.getClass();
        this.LLILLL = C09IC.LJJIJIL(c1698270uIL, c054gLIZ, C1370905Yd.LIZIZ, new C1661660tLI(0, false));
        this.LLILZ = C1664770tQJ.LIZ(c1drg, LifecycleOwner.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455360nyY.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}
