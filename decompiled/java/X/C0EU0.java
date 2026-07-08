package X;

import Y.AObjectS240S0100000_5;
import com.bytedance.als.LiveEvent;
import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EU0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EU0 extends i<InterfaceC365320ETy, C365330ETz, AnonymousClass0049, C1260104wR> implements InterfaceC365320ETy, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final Function0<AnonymousClass0049> LLJJIII;
    public final Function0<C1260104wR> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EU0.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/video/opacity/OpacityPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EU0.class, "panelNavApi", "getPanelNavApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelNavApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EU0.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJIJIL = 8;
    }

    public InterfaceC365320ETy F4() {
        return this;
    }

    private final C0ETQ K4() {
        return (C0ETQ) this.LLJJ.getValue(this, LLJJIJIIJIL[1]);
    }

    public final C363780EOa H4() {
        return (C363780EOa) this.LLJILLL.getValue(this, LLJJIJIIJIL[0]);
    }

    public final C0E5S O4() {
        return (C0E5S) this.LLJJI.getValue(this, LLJJIJIIJIL[2]);
    }

    public final void P4() {
        C0ETQ c0etqK4 = K4();
        if (c0etqK4 != null) {
            c0etqK4.close();
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventGs1;
        super.onCreate();
        C0E5S c0e5sO4 = O4();
        if (c0e5sO4 != null) {
            c0e5sO4.yV(AFwS234S0000000_5.get$arr$(325));
        }
        C0ETQ c0etqK4 = K4();
        if (c0etqK4 == null || (liveEventGs1 = c0etqK4.Gs1()) == null) {
            return;
        }
        liveEventGs1.LIZ(this, new AObjectS240S0100000_5(this, 114));
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        F4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<AnonymousClass0049> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1260104wR> w2() {
        return this.LLJJIJI;
    }

    public C0EU0(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C363780EOa.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), C0ETQ.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLJJIII = new AwS549S0100000_5(this, 733);
        this.LLJJIJI = new AwS549S0100000_5(this, 734);
    }
}
