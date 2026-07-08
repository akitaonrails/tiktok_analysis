package Y;

import X.AbstractC1524310pll;
import X.C09JN;
import X.C1501910pBd;
import X.C1518550pcT;
import X.C1639430slR;
import X.C1C7U;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AfS8S0100100_23 implements C09JN {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS8S0100100_23 afS8S0100100_23, Object obj) {
        C1C7U.LIZ("LivePreviewPlayerWidget@e362.startPauseStreamTimer$2");
        ((LivePreviewPlayerWidget) afS8S0100100_23.l0).U1(afS8S0100100_23.j1, "time out");
        C1C7U.LIZIZ("LivePreviewPlayerWidget@e362.startPauseStreamTimer$2");
    }

    public static final void accept$1(AfS8S0100100_23 afS8S0100100_23, Object obj) {
        C1C7U.LIZ("OkHttpSimpleDownloaderInternal@d8d5.executeDownload$d$3");
        AbstractC1524310pll abstractC1524310pll = (AbstractC1524310pll) afS8S0100100_23.l0;
        if (abstractC1524310pll != null) {
            abstractC1524310pll.LJFF(System.currentTimeMillis() - afS8S0100100_23.j1);
        }
        C1C7U.LIZIZ("OkHttpSimpleDownloaderInternal@d8d5.executeDownload$d$3");
    }

    public static final void accept$2(AfS8S0100100_23 afS8S0100100_23, Object obj) {
        Exception exc;
        C1C7U.LIZ("OkHttpSimpleDownloaderInternal@d8d5.executeDownload$d$4");
        Throwable th = (Throwable) obj;
        AbstractC1524310pll abstractC1524310pll = (AbstractC1524310pll) afS8S0100100_23.l0;
        if (abstractC1524310pll != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - afS8S0100100_23.j1;
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            abstractC1524310pll.LJ(jCurrentTimeMillis, exc, null);
        }
        C1C7U.LIZIZ("OkHttpSimpleDownloaderInternal@d8d5.executeDownload$d$4");
    }

    public static final void accept$3(AfS8S0100100_23 afS8S0100100_23, Object obj) {
        C1C7U.LIZ("UserCommunicationManager@c9a4.invokePopupCallbackRequest$1");
        long jCurrentTimeMillis = System.currentTimeMillis() - afS8S0100100_23.j1;
        Function1 function1 = (Function1) afS8S0100100_23.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
        C1518550pcT.LIZ.getClass();
        C1518550pcT.LJ(0, jCurrentTimeMillis, "/popup/callback/v1", true);
        C1C7U.LIZIZ("UserCommunicationManager@c9a4.invokePopupCallbackRequest$1");
    }

    public static final void accept$4(AfS8S0100100_23 afS8S0100100_23, Object obj) {
        C1C7U.LIZ("UserCommunicationManager@c9a4.invokePopupCallbackRequest$2");
        Throwable th = (Throwable) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS8S0100100_23.j1;
        Function1 function1 = (Function1) afS8S0100100_23.l0;
        if (function1 != null) {
            function1.invoke(null);
        }
        C1518550pcT c1518550pcT = C1518550pcT.LIZ;
        int iLIZ = C1501910pBd.LIZ(th);
        c1518550pcT.getClass();
        C1518550pcT.LJ(iLIZ, jCurrentTimeMillis, "/popup/callback/v1", false);
        C1C7U.LIZIZ("UserCommunicationManager@c9a4.invokePopupCallbackRequest$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AfS8S0100100_23) (LINE:50331651) Y.AfS8S0100100_23.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.AfS8S0100100_23) (LINE:50331653) Y.AfS8S0100100_23.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS8S0100100_23, java.lang.Object] */
    public AfS8S0100100_23(long j, long j2, Function1<? super String, Unit> function1) {
        long j3;
        Object obj;
        obj.$t = function1;
        obj.j1 = j3;
        obj.l0 = obj;
        ?? obj2 = new Object();
    }

    public AfS8S0100100_23(C1639430slR c1639430slR, String str, long j, int i) {
        this.$t = i;
        this.l0 = c1639430slR;
        this.j1 = j;
    }
}
