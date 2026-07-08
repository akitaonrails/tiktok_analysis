package X;

import android.os.Handler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: X.0CNK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNK implements InterfaceC1006670cIr<C1602200rnO> {
    public final /* synthetic */ Handler LL;
    public final /* synthetic */ C1601460rmC LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Lock LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ C1601380rm4 LLJIJIL;

    @Override // X.InterfaceC1006670cIr
    public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
        C1602200rnO c1602200rnO3 = c1602200rnO2;
        if (((Boolean) C285090BFj.LJJIL.getValue()).booleanValue()) {
            if (c1602200rnO3.LIZIZ()) {
                this.LL.removeCallbacksAndMessages(null);
                this.LLJIJIL.LJIILIIL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
                C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                return;
            }
            return;
        }
        if (((Boolean) C285090BFj.LJJIZ.getValue()).booleanValue()) {
            if (!c1602200rnO3.LIZJ()) {
                return;
            }
            this.LL.removeCallbacksAndMessages(null);
            this.LLJIJIL.LJIILIIL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
            C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
            return;
        }
        if (!((Boolean) C285090BFj.LJJJ.getValue()).booleanValue() || !c1602200rnO3.LIZJ()) {
            return;
        }
        this.LL.removeCallbacksAndMessages(null);
        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
        Handler handler = this.LL;
        final C1601460rmC c1601460rmC = this.LLILLJJLI;
        final int i = this.LLILLL;
        final int i2 = this.LLILZ;
        final String str = this.LLILZIL;
        final String str2 = this.LLILZLL;
        final Lock lock = this.LLIZ;
        final boolean z = this.LLIZLLLIL;
        final String str3 = this.LLJ;
        final boolean z2 = this.LLJI;
        C786410Ut5.LJLIIL(((Number) C285090BFj.LJJJIL.getValue()).longValue(), handler, new Runnable() { // from class: X.0CNM
            @Override // java.lang.Runnable
            public final void run() {
                C0CNK c0cnk = this.LL;
                C1601460rmC c1601460rmC2 = c1601460rmC;
                int i3 = i;
                int i4 = i2;
                String str4 = str;
                String str5 = str2;
                Lock lock2 = lock;
                boolean z3 = z;
                String str6 = str3;
                boolean z4 = z2;
                c0cnk.getClass();
                C1C7U.LIZ("FeedFetchModel@3835.fetchList$1$onStateChange$1L");
                c0cnk.LLJIJIL.LJIILIIL(c1601460rmC2, i3, i4, str4, str5, lock2, z3, str6, z4);
                C1C7U.LIZIZ("FeedFetchModel@3835.fetchList$1$onStateChange$1L");
            }
        });
    }

    public C0CNK(C1601380rm4 c1601380rm4, BPEAHandler bPEAHandler, C1601460rmC c1601460rmC, int i, int i2, String str, String str2, Lock lock, boolean z, String str3, boolean z2) {
        this.LLJIJIL = c1601380rm4;
        this.LL = bPEAHandler;
        this.LLILLJJLI = c1601460rmC;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = lock;
        this.LLIZLLLIL = z;
        this.LLJ = str3;
        this.LLJI = z2;
    }
}
