package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS170S0200000_5;
import Y.AObserverS209S0100000_5;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360580EBs extends AbstractC381020Ewm<C0EB6> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public final C01GW LLILZIL;
    public final C1664740tQG LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public boolean LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C360580EBs.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C360580EBs.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C360580EBs.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C360580EBs.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final InterfaceC360800ECo X1() {
        return (InterfaceC360800ECo) this.LLJ.getValue(this, LLJIJIL[3]);
    }

    public final void Z1() {
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        LiveData<C0E2C> liveDataLIZ = C0EB5.LIZ(c0e48W1, (C0EB6) this.LLILZIL.getValue());
        if (liveDataLIZ != null) {
            liveDataLIZ.observe(this, new AObserverS170S0200000_5(c0e48W1, this, 14));
        }
        ((C0ETY) this.LLILZ.LJII(C0ETY.class, null)).Sd(InterfaceC384330F5b.class, new AwS584S0100000_5(this, 722));
    }

    @Override // X.AbstractC2255721DQs
    public final C05YF getApiComponent() {
        return (C0EB6) this.LLILZIL.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public final void onCreate() {
        LiveEvent<Unit> liveEventUQ2;
        LiveData<Boolean> liveDataQO0;
        super.onCreate();
        C1664740tQG c1664740tQG = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        InterfaceC359950E9h interfaceC359950E9h = (InterfaceC359950E9h) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
        if (interfaceC359950E9h != null && (liveDataQO0 = interfaceC359950E9h.QO0()) != null) {
            liveDataQO0.observe(this, new AObserverS209S0100000_5(this, 90));
        }
        InterfaceC359950E9h interfaceC359950E9h2 = (InterfaceC359950E9h) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[0]);
        if (interfaceC359950E9h2 == null || (liveEventUQ2 = interfaceC359950E9h2.uQ2()) == null) {
            return;
        }
        liveEventUQ2.LIZ(this, new AObjectS240S0100000_5(this, 127));
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZ;
    }

    public C360580EBs(C372480Ej0 c372480Ej0, C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c372480Ej0;
        this.LLILZ = c1drg;
        this.LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 806));
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC359950E9h.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, C0E5S.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC360800ECo.class, null);
    }
}
