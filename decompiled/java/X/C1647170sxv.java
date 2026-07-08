package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647170sxv extends AbstractC2255721DQs<InterfaceC1646850sxP> implements InterfaceC1646850sxP, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final int LLILZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1647170sxv.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = 8;
    }

    public C1647170sxv W1() {
        return this;
    }

    @Override // X.InterfaceC1646850sxP
    public boolean jw1() {
        return true;
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLJJLI.getValue(this, LLILLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getDiContainer().LIZJ(InterfaceC1647520syU.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1647520syU.class, new AwS604S0100000_25(this, 110));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        jw1();
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

    public C1647170sxv(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
