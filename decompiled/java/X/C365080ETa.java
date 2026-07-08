package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.als.h0;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0ETa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365080ETa extends AbstractC381020Ewm<C0EFH> implements C0EFH, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LLILLL;
    public final h0<Boolean> LLILZ;
    public h0<C0ELJ> LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final ICrashReportService LLJI;
    public final MutableLiveData<C1884507Zr> LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C365080ETa.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C365080ETa.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C365080ETa.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C365080ETa.class, "controlBar", "getControlBar()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJILJILJ = 8;
    }

    @Override // X.C0EFH
    public void Mb2(C0ELJ c0elj, InterfaceC357240DzW interfaceC357240DzW) {
    }

    @Override // X.C0EFH
    public void QO1(C0ELJ c0elj, C0EFI c0efi) {
    }

    public C0EFH X1() {
        return this;
    }

    @Override // X.C0EFH
    public void yo0(ViewGroup viewGroup, NavigationScene navigationScene) {
    }

    private final InterfaceC359950E9h G2() {
        return (InterfaceC359950E9h) this.LLILZLL.getValue(this, LLJILJIL[0]);
    }

    private final C0EGY Z1() {
        return (C0EGY) this.LLIZLLLIL.getValue(this, LLJILJIL[2]);
    }

    private final InterfaceC360800ECo o2() {
        return (InterfaceC360800ECo) this.LLJ.getValue(this, LLJILJIL[3]);
    }

    @Override // X.C0EFH
    public void ps0() {
        C359780E8q.LIZ("EditorProInitComponentV2 doAfterFirstFrame", new AwS549S0100000_5(this, 937));
    }

    public final C0EY2 w2() {
        return (C0EY2) this.LLIZ.getValue(this, LLJILJIL[1]);
    }

    @Override // X.C0EFH
    public InterfaceC359860E8y k51() {
        C361890EGt c361890EGt;
        C0EHI value = w2().zu2().getValue();
        if (value == null || (c361890EGt = value.LIZIZ) == null) {
            return null;
        }
        return c361890EGt.LIZ;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        LiveData<Unit> liveDataZb0 = Z1().zb0();
        LiveData<Boolean> liveDataQO0 = G2().QO0();
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        Iterator it2 = C1697810uHb.LJIIJJI(liveDataQO0, liveDataZb0).iterator();
        while (it2.hasNext()) {
            mediatorLiveData.addSource((LiveData) it2.next(), new C389600FPi(new C228900uV(mediatorLiveData, liveDataQO0, liveDataZb0)));
        }
        Transformations.distinctUntilChanged(mediatorLiveData).observe(this, new AObserverS209S0100000_5(this, 108));
        G2().JI().LIZ(this, new AObjectS240S0100000_5(this, 144));
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        this.LLJI.setCustomTag("saa_sub_page", "");
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLJI.setCustomTag("saa_sub_page", "EditorProScene");
    }

    public h0<C0ELJ> H2() {
        return this.LLILZIL;
    }

    @Override // X.C0EFH
    public /* bridge */ /* synthetic */ C385670FAf J50() {
        return this.LLILZ;
    }

    public h0<Boolean> T2() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.C0EFH
    public /* bridge */ /* synthetic */ C385670FAf getInitData() {
        return this.LLILZIL;
    }

    @Override // X.C0EFH
    public MutableLiveData<C1884507Zr> nG() {
        return this.LLJIJIL;
    }

    public C365080ETa(C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = new h0<>(Boolean.FALSE);
        this.LLILZIL = new h0<>(null);
        this.LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0EY2.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJI = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter();
        this.LLJIJIL = new MutableLiveData<>();
    }

    public void W2(h0<C0ELJ> h0Var) {
        this.LLILZIL = h0Var;
    }
}
