package X;

import Y.ARunnableS20S0201000_14;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0ZLB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0ZLB {
    public ARunnableS20S0201000_14 LIZIZ;
    public C0ZL5 LIZLLL;
    public View LJ;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public List<C1562980qm8<?>> LIZJ = new ArrayList();

    public void LIZJ(LongPressConfig longPressConfig) {
    }

    public static String LIZ(C0ZLB c0zlb) {
        List<C1562980qm8<?>> list = c0zlb.LIZJ;
        c0zlb.getClass();
        return C13LP.LJJLIIIJ(list, ", ", null, null, 0, null, AFwS248S0000000_14.get$arr$(519), 30);
    }

    public void LIZIZ(C0ZL0 c0zl0) {
        C893640Z3y c893640Z3y;
        View view = this.LJ;
        if ((view instanceof C912700ZrI) && (c893640Z3y = (C893640Z3y) view) != null) {
            c893640Z3y.LIZ(c0zl0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig r6, int r7) {
        /*
            r5 = this;
            Y.ARunnableS20S0201000_14 r1 = r5.LIZIZ
            if (r1 == 0) goto L9
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r5.LIZ
            r0.removeCallbacksAndMessages(r1)
        L9:
            X.0ZL5 r0 = r5.LIZLLL
            if (r0 == 0) goto L41
            X.0ZL9 r4 = r0.LIZLLL()
        L11:
            X.0ZL9 r0 = X.C0ZL9.NONE
            if (r4 == r0) goto L43
            r0 = 5
            if (r7 >= r0) goto L43
            Y.ARunnableS20S0201000_14 r3 = new Y.ARunnableS20S0201000_14
            r0 = 7
            r3.<init>(r5, r7, r6, r0)
            r5.LIZIZ = r3
            android.view.View r2 = r6.unmaskedView
            if (r4 == 0) goto L35
            int[] r1 = X.C0ZLA.LIZ
            int r0 = r4.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L3e
            r0 = 2
            if (r1 == r0) goto L3b
            r0 = 3
            if (r1 == r0) goto L3b
        L35:
            r0 = 0
        L37:
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r2, r3, r0)
            return
        L3b:
            r0 = 300(0x12c, double:1.48E-321)
            goto L37
        L3e:
            r0 = 150(0x96, double:7.4E-322)
            goto L37
        L41:
            r4 = 0
            goto L11
        L43:
            r5.LIZJ(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZLB.LIZLLL(com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig, int):void");
    }
}
