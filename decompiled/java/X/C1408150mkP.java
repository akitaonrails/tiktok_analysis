package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0mkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408150mkP extends i<C18WH, C1409970mnL, C1408540ml2, C1408170mkR> implements C18WH, InterfaceC379610EuV {
    public static final C1408160mkQ LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final C1407840mju LLJJIJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mkQ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1408150mkP.class, "aiChatProtocolApi", "getAiChatProtocolApi()Lcom/ss/android/ugc/tools/chat/common/api/AiChatProtocolApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIIJIL = new Object() { // from class: X.0mkQ
        };
        LLJJJ = 8;
    }

    private final void H4() {
        C1727006pY c1727006pY = C1727006pY.LIZ;
        C1407840mju c1407840mju = this.LLJJIJI;
        c1727006pY.getClass();
        C1727006pY.LIZLLL.add(c1407840mju);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1407810mjr(this, null), 3);
    }

    public final InterfaceC1430910nL7 F4() {
        return (InterfaceC1430910nL7) this.LLJILLL.getValue(this, LLJJIJIL[0]);
    }

    @Override // X.C18WH, X.InterfaceC21297618Wg
    public void el() {
        i3(AFwS261S0000000_22.get$arr$(242));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1408540ml2> o2() {
        return new AwS566S0100000_22(this, 802);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1408170mkR> w2() {
        return new AwS566S0100000_22(this, 803);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        H4();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C1727006pY c1727006pY = C1727006pY.LIZ;
        C1407840mju c1407840mju = this.LLJJIJI;
        c1727006pY.getClass();
        C1727006pY.LIZLLL.remove(c1407840mju);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.C18WH
    public void o12(boolean z) {
        i3(new AwS35S0010000_22(z, 29));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0mju] */
    public C1408150mkP(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1430910nL7.class, null);
        C1727006pY.LIZ.getClass();
        C1727006pY.LIZJ();
        Keva keva = C1727106pZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_quota_max");
        sbLIZ.append(C1727106pZ.LIZIZ());
        this.LLJJ = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 5);
        this.LLJJIJI = new InterfaceC1727306pb() { // from class: X.0mju
            @Override // X.InterfaceC1727306pb
            public final void LIZ(int i, int i2) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C1407830mjt(this.LIZ, i2, null), 3);
            }
        };
    }
}
