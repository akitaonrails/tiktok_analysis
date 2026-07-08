package X;

import Y.AObserverS225S0100000_22;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420080n3e extends i<InterfaceC1420090n3f, C376150Eov, Unit, Unit> implements InterfaceC1420090n3f {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final Function0<Unit> LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1420080n3e.class, "asyncRenderService", "getAsyncRenderService()Lcom/ss/android/ugc/aweme/shortvideo/autocut/asyncrender/AutoCutAsyncRenderService;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1420080n3e.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIJI = 8;
    }

    private final InterfaceC1455860nzM H4() {
        return (InterfaceC1455860nzM) this.LLJJI.getValue(this, LLJJIII[1]);
    }

    public final C1420050n3b F4() {
        return (C1420050n3b) this.LLJJ.getValue(this, LLJJIII[0]);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Unit> liveDataOG2;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        super.onCreate();
        C1420050n3b c1420050n3bF4 = F4();
        if (c1420050n3bF4 != null && (mutableLiveData2 = c1420050n3bF4.LIZLLL) != null && Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.FALSE)) {
            show();
        }
        C1420050n3b c1420050n3bF42 = F4();
        if (c1420050n3bF42 != null && (mutableLiveData = c1420050n3bF42.LIZLLL) != null) {
            mutableLiveData.observe(this, new AObserverS225S0100000_22(this, 37));
        }
        InterfaceC1455860nzM interfaceC1455860nzMH4 = H4();
        if (interfaceC1455860nzMH4 == null || (liveDataOG2 = interfaceC1455860nzMH4.oG2()) == null) {
            return;
        }
        liveDataOG2.observe(this, new AObserverS225S0100000_22(this, 38));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> o2() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> w2() {
        return this.LLJILLL;
    }

    public C1420080n3e(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = AFwS210S0000000_22.get$arr$(118);
        this.LLJILLL = AFwS210S0000000_22.get$arr$(119);
        this.LLJJ = new C1664740tQG(c1drg.LJIILIIL(null, C1420050n3b.class), C1420050n3b.class);
        this.LLJJI = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1455860nzM.class), InterfaceC1455860nzM.class);
    }
}
