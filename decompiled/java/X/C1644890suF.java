package X;

import Y.AObjectS246S0100000_25;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0suF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1644890suF extends AbstractC2255721DQs<InterfaceC1644910suH> implements InterfaceC1644910suH, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644770su3.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final ShortVideoContext LLILZ = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1644890suF.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1644890suF.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1644890suF.class, "lazyBeautyFilter", "getLazyBeautyFilter()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLIZ = 8;
    }

    public InterfaceC1644910suH W1() {
        return this;
    }

    private final C1645380sv2 X1() {
        return (C1645380sv2) this.LLILZIL.getValue(this, LLILZLL[2]);
    }

    private final InterfaceC1644770su3 getFilterApiComponent() {
        return (InterfaceC1644770su3) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILLL.getValue(this, LLILZLL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<C1644900suG> liveEventBZ0;
        super.onCreate();
        if (C1622090sJT.LIZ(X1())) {
            if (getDiContainer().LIZJ(InterfaceC1644770su3.class)) {
                whenReadyOrThrowInternal(getDiContainer(), InterfaceC1644770su3.class, new AwS604S0100000_25(this, 182));
            }
        } else {
            InterfaceC1644770su3 filterApiComponent = getFilterApiComponent();
            if (filterApiComponent == null || (liveEventBZ0 = filterApiComponent.BZ0()) == null) {
                return;
            }
            liveEventBZ0.LIZ(this, new AObjectS246S0100000_25(this, 209));
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

    public C1644890suF(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z1(X.C1644900suG r9) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1644890suF.Z1(X.0suG):void");
    }
}
