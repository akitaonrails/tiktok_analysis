package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450700nr2 implements InterfaceC379610EuV, InterfaceC1450810nrD {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final /* synthetic */ C1450720nr4 LL;
    public final LifecycleOwner LLILLJJLI;
    public final C1DRG LLILLL;
    public final C1453390nvN LLILZ;
    public final LiveData<VESize> LLILZIL;
    public final Function1<VEVideoTransformFilterParam, Unit> LLILZLL;
    public final Function0<Unit> LLIZ;
    public final Function0<InterfaceC1461390o8H> LLIZLLLIL;
    public volatile boolean LLJ;
    public final C1664750tQH LLJI;
    public final C1664750tQH LLJIJIL;
    public boolean LLJILJIL;
    public VESize LLJILJILJ;
    public CanvasFilterParam LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1054));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1055));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1053));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1450700nr2.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1450700nr2.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1450810nrD
    public final InterfaceC1449880npi LIZ() {
        return this.LL.LIZ();
    }

    public final InterfaceC1455860nzM LIZIZ() {
        return (InterfaceC1455860nzM) this.LLJI.getValue(this, LLJJIJI[0]);
    }

    public final VideoPublishEditModel LIZJ() {
        return (VideoPublishEditModel) this.LLJIJIL.getValue(this, LLJJIJI[1]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            ((C1454540nxE) this.LLJJI.getValue()).LLILLL = true;
            C567850MOx.LIZ("enableGesture");
            return;
        }
        C1454540nxE c1454540nxE = (C1454540nxE) this.LLJJI.getValue();
        c1454540nxE.getClass();
        C567850MOx.LIZ("disableGesture");
        if (c1454540nxE.LLILZLL) {
            return;
        }
        c1454540nxE.LLILLL = false;
        c1454540nxE.LLILZLL = false;
        c1454540nxE.LLILZIL.clear();
        c1454540nxE.LLJI = false;
    }

    public C1450700nr2(C1450640nqw c1450640nqw, C1DRG c1drg, C1453390nvN c1453390nvN, MutableLiveData mutableLiveData, C1450680nr0 c1450680nr0, C1450790nrB c1450790nrB, Function0 function0) {
        this.LL = new C1450720nr4(c1450640nqw.getLifecycle());
        this.LLILLJJLI = c1450640nqw;
        this.LLILLL = c1drg;
        this.LLILZ = c1453390nvN;
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = c1450680nr0;
        this.LLIZ = c1450790nrB;
        this.LLIZLLLIL = function0;
        this.LLJI = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }
}
