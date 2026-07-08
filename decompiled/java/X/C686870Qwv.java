package X;

import Y.ARunnableS110S0100000_10;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: renamed from: X.0Qwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C686870Qwv extends AbstractC686880Qww {
    public static final /* synthetic */ int LIZLLL = 0;
    public final ConcurrentHashMap<Integer, LinkedList<View>> LIZIZ;
    public long LIZJ;

    public C686870Qwv(Activity activity) {
        super(activity);
        this.LIZIZ = new ConcurrentHashMap<>();
        this.LIZJ = 10000L;
    }

    @Override // X.C0QTN
    public final boolean LIZ(int i) {
        boolean z;
        LinkedList<View> linkedList = this.LIZIZ.get(Integer.valueOf(i));
        if (linkedList != null) {
            synchronized (linkedList) {
                try {
                    z = !linkedList.isEmpty();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return z;
        }
        return false;
    }

    @Override // X.C0QTN
    public View LIZIZ(int i) {
        if (C800870VbJ.LIZ()) {
            LinkedList<View> linkedList = this.LIZIZ.get(Integer.valueOf(i));
            if (linkedList != null) {
                synchronized (linkedList) {
                    try {
                        View viewPoll = linkedList.poll();
                        if (viewPoll != null) {
                            return viewPoll;
                        }
                        this.LIZIZ.remove(Integer.valueOf(i));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return C20742916Ex.LIZ(this.LIZ, i, new FrameLayout(this.LIZ), false, -1);
        }
        if (((Boolean) C800870VbJ.LIZIZ.getValue()).booleanValue()) {
            return C20742916Ex.LIZ(this.LIZ, i, new FrameLayout(this.LIZ), false, -1);
        }
        return C786410Ut5.Td(C786410Ut5.ne(this.LIZ), i, new FrameLayout(this.LIZ), false);
    }

    @Override // X.AbstractC686880Qww
    public void LIZJ(C686940Qx2 c686940Qx2, long j) {
        if (!C800870VbJ.LIZ()) {
            return;
        }
        AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(this, c686940Qx2, 78);
        if (j > 0) {
            C786410Ut5.LJLIIL(j, C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS411S0200000_10, 134));
        } else {
            C786410Ut5.LJJZZIII(C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS411S0200000_10, 134));
        }
    }
}
