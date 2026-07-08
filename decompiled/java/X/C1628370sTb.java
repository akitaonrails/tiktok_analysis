package X;

import com.ss.android.ugc.slideslip.a6;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0sTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628370sTb extends a6 implements InterfaceC1648240sze {
    public static final C1628380sTc LLLLLLZZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLZ;
    public static final int LLLLLZIL;
    public final InterfaceC1731706qJ LLLLLLLZIL;
    public final C01GW LLLLLLZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0sTc] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1628370sTb.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLLLZZ = new Object() { // from class: X.0sTc
        };
        LLLLLZIL = 8;
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLLLLLLZIL.getValue(this, LLLLLZ[0]);
    }

    @Override // X.InterfaceC1648240sze
    public void Mp1() {
        this.LLLIIIL.onNext(Boolean.FALSE);
    }

    @Override // X.InterfaceC1648240sze
    public void Pd1() {
        this.LLLIIIL.onNext(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.slideslip.a6
    public boolean t5() {
        return ((Boolean) this.LLLLLLZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.slideslip.a6, X.AbstractC1664510tPt, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().XC0(this);
    }

    @Override // X.InterfaceC1648240sze
    public void pl1(boolean z) {
        EnumC995040c06 enumC995040c06;
        C11PQ<EnumC995040c06> c11pqLJJLIIIJ = LJJLIIIJ();
        if (z) {
            enumC995040c06 = EnumC995040c06.RED;
        } else {
            enumC995040c06 = EnumC995040c06.WHITE;
        }
        c11pqLJJLIIIJ.onNext(enumC995040c06);
    }

    public C1628370sTb(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLLLLLLZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLLLLLZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(370));
    }
}
