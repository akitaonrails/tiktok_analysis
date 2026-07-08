package Y;

import X.C0NI4;
import X.C0POE;
import X.C0PQA;
import X.C1495270p0v;
import X.C1515670pXp;
import X.C644110POf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.INetworkChunk;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AObjectS205S0300000_23 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS205S0300000_23 aObjectS205S0300000_23) {
        C1515670pXp c1515670pXp = (C1515670pXp) aObjectS205S0300000_23.l0;
        C0POE c0poe = (C0POE) aObjectS205S0300000_23.l1;
        C0PQA c0pqa = (C0PQA) aObjectS205S0300000_23.l2;
        c1515670pXp.getClass();
        try {
            c1515670pXp.LIZIZ();
        } catch (Throwable th) {
            th = th;
        }
        if (c1515670pXp.LLJILJIL != 0) {
            c0poe.onComplete();
            INetworkChunk iNetworkChunk = (INetworkChunk) PluggableExtentionKt.pluggableSpi(INetworkChunk.class);
            if (iNetworkChunk != null) {
                iNetworkChunk.LIZ();
            }
        } else {
            c1515670pXp.LLJILJIL = 1;
            long jCurrentTimeMillis = System.currentTimeMillis();
            INetworkChunk iNetworkChunk2 = (INetworkChunk) PluggableExtentionKt.pluggableSpi(INetworkChunk.class);
            if (iNetworkChunk2 != null) {
                iNetworkChunk2.LIZIZ();
            }
            int i = 0;
            int i2 = -1;
            int iCurrentTimeMillis = 0;
            while (true) {
                int iLJII = c1515670pXp.LJII();
                i2++;
                if (iLJII < 0) {
                    break;
                }
                byte[] bArr = new byte[iLJII];
                System.arraycopy(c1515670pXp.LLILZ, c1515670pXp.LLILZIL, bArr, i, iLJII);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j = jCurrentTimeMillis;
                try {
                    C644110POf c644110POf = new C644110POf(c1515670pXp.LLJILJILJ, jCurrentTimeMillis, c1515670pXp.LLJILLL, jCurrentTimeMillis2, iLJII);
                    c644110POf.LJIIIIZZ = i2;
                    synchronized (c0pqa) {
                        c0pqa.LIZ.add(c644110POf);
                    }
                    c0poe.onNext(bArr);
                    iCurrentTimeMillis = (int) (((long) iCurrentTimeMillis) + (System.currentTimeMillis() - jCurrentTimeMillis2));
                    c1515670pXp.LLILZIL += iLJII;
                    c644110POf.LIZ = iCurrentTimeMillis;
                    c644110POf.LJII = System.currentTimeMillis();
                    i = 0;
                    jCurrentTimeMillis = j;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    TryCatchGuardChecker.doCheck(th);
                    c0poe.onFailed(th);
                    INetworkChunk iNetworkChunk3 = (INetworkChunk) PluggableExtentionKt.pluggableSpi(INetworkChunk.class);
                    if (iNetworkChunk3 != null) {
                        iNetworkChunk3.LIZ();
                    }
                } catch (Throwable th3) {
                    INetworkChunk iNetworkChunk4 = (INetworkChunk) PluggableExtentionKt.pluggableSpi(INetworkChunk.class);
                    if (iNetworkChunk4 != null) {
                        iNetworkChunk4.LIZ();
                    }
                    try {
                        C1495270p0v.LJI(c1515670pXp.LL);
                        throw th3;
                    } finally {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
            }
            c0poe.onComplete();
            INetworkChunk iNetworkChunk5 = (INetworkChunk) PluggableExtentionKt.pluggableSpi(INetworkChunk.class);
            if (iNetworkChunk5 != null) {
                iNetworkChunk5.LIZ();
            }
        }
        try {
            C1495270p0v.LJI(c1515670pXp.LL);
            return null;
        } catch (Throwable th32) {
            return null;
        }
    }

    public static final Object invoke$1(AObjectS205S0300000_23 aObjectS205S0300000_23) {
        DVideoPreloadManager dVideoPreloadManager = (DVideoPreloadManager) aObjectS205S0300000_23.l0;
        dVideoPreloadManager.LIZIZ.LJJIL((SimVideoUrlModel) aObjectS205S0300000_23.l1, (C0NI4) aObjectS205S0300000_23.l2);
        return Unit.LIZ;
    }

    public AObjectS205S0300000_23(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
