package X;

import android.app.Activity;
import android.view.ScaleGestureDetector;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650260t2u extends AbstractC2255721DQs<InterfaceC1648510t05> implements InterfaceC1648510t05, InterfaceC379610EuV, C0F1U {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1622130sJX LLILZ;
    public Cert LLJIJIL;
    public final InterfaceC1648510t05 LLILZIL = this;
    public final InterfaceC1650230t2r LLILZLL = (InterfaceC1650230t2r) getDiContainer().LJII(InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1650270t2v.class, null);
    public final Activity LLIZLLLIL = (Activity) getDiContainer().LJII(Activity.class, null);
    public final CopyOnWriteArrayList<InterfaceC1650290t2x> LLJ = new CopyOnWriteArrayList<>();
    public CopyOnWriteArraySet<InterfaceC1650280t2w> LLJI = new CopyOnWriteArraySet<>();
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 81));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 80));
    public final h0<InterfaceC21645719nT> LLJILLL = new h0<>(null);
    public final h0<ScaleGestureDetector> LLJJ = new h0<>(null);
    public final C560530Lyd<AbstractC1645970svz> LLJJI = new C560530Lyd<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650260t2u.class, "filterSwipeApi", "getFilterSwipeApi()Lcom/bytedance/creativex/recorder/filter/api/FilterSwipeApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final DefaultGesturePresenter G2() {
        return (DefaultGesturePresenter) this.LLJILJILJ.getValue();
    }

    public final InterfaceC21664819qY H2() {
        return (InterfaceC21664819qY) this.LLJILJIL.getValue();
    }

    public final InterfaceC2254081DKk Z1() {
        return this.LLILZLL.St2();
    }

    public final InterfaceC1650270t2v o2() {
        return (InterfaceC1650270t2v) this.LLIZ.getValue(this, LLJJIII[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W1((VideoRecordGestureLayout) this.LL.requireViewById(this.LLILLL));
    }

    @Override // X.InterfaceC1648510t05
    public /* bridge */ /* synthetic */ C385670FAf JS0() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1648510t05
    public /* bridge */ /* synthetic */ C385670FAf Px0() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1648510t05
    public /* bridge */ /* synthetic */ LiveEvent Si() {
        return this.LLJJI;
    }

    public h0<InterfaceC21645719nT> T2() {
        return this.LLJILLL;
    }

    public h0<ScaleGestureDetector> W2() {
        return this.LLJJ;
    }

    public InterfaceC1648510t05 X1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C560530Lyd<AbstractC1645970svz> w2() {
        return this.LLJJI;
    }

    private final void W1(VideoRecordGestureLayout videoRecordGestureLayout) {
        DefaultGesturePresenter defaultGesturePresenterG2 = G2();
        defaultGesturePresenterG2.getClass();
        if (videoRecordGestureLayout instanceof VideoRecordGestureLayout) {
            defaultGesturePresenterG2.LLILZLL = videoRecordGestureLayout;
            videoRecordGestureLayout.setOnGestureListener(defaultGesturePresenterG2);
            defaultGesturePresenterG2.LLILZLL.setOnInterceptListener(defaultGesturePresenterG2);
        }
        this.LLJILLL.LJII(videoRecordGestureLayout.getOnGestureListener());
        this.LLJJ.LJII(videoRecordGestureLayout.getScaleGestureDetector());
    }

    @Override // X.InterfaceC1648510t05
    public void IQ0(AbstractC21664519qV abstractC21664519qV) {
        G2().LJIIL(abstractC21664519qV, 1, 100);
    }

    @Override // X.InterfaceC1648510t05
    public void Nd(boolean z) {
        G2().LL = z;
    }

    @Override // X.InterfaceC1648510t05
    public void S60(InterfaceC1650280t2w interfaceC1650280t2w) {
        this.LLJI.add(interfaceC1650280t2w);
    }

    @Override // X.InterfaceC1648510t05
    public void WL(InterfaceC1650290t2x interfaceC1650290t2x) {
        if (!this.LLJ.contains(interfaceC1650290t2x)) {
            this.LLJ.add(interfaceC1650290t2x);
        }
    }

    @Override // X.InterfaceC1648510t05
    public void bQ2(InterfaceC1650280t2w interfaceC1650280t2w) {
        this.LLJI.remove(interfaceC1650280t2w);
    }

    @Override // X.InterfaceC1648510t05
    public void bk0(InterfaceC1650300t2y interfaceC1650300t2y) {
        ((ArrayList) G2().LLILLJJLI).add(interfaceC1650300t2y);
    }

    public final void c3(Cert cert) {
        this.LLJIJIL = cert;
    }

    @Override // X.InterfaceC1648510t05
    public void eL2(InterfaceC1650290t2x interfaceC1650290t2x) {
        this.LLJ.remove(interfaceC1650290t2x);
    }

    @Override // X.InterfaceC1648510t05
    public void jz0(boolean z) {
        G2().LLJILJIL = z;
    }

    @Override // X.InterfaceC1648510t05
    public AbstractC21664519qV zk1(int i) {
        return (AbstractC21664519qV) ((ConcurrentHashMap) G2().LLILZ).get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1648510t05
    public void xX0(AbstractC21664519qV abstractC21664519qV, int i) {
        G2().LJIIL(abstractC21664519qV, i, 100);
    }

    @Override // X.InterfaceC1648510t05
    public void AL1(AbstractC21664519qV abstractC21664519qV, int i, int i2) {
        G2().LJIIL(abstractC21664519qV, i, i2);
    }

    public C1650260t2u(C19A3 c19a3, C1DRG c1drg, int i, InterfaceC1622130sJX interfaceC1622130sJX) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = i;
        this.LLILZ = interfaceC1622130sJX;
        this.LLJIJIL = interfaceC1622130sJX.LIZ();
    }
}
