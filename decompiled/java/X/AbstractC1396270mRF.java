package X;

import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1396270mRF implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1396270mRF.class, "host", "getHost()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract long LIZ();

    public abstract void LIZIZ(int i, long j, String str);

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC1396270mRF(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, C19EG.class, null);
    }

    public final void LIZJ(Function0<Unit> function0) {
        Activity activity = (Activity) this.LLILLJJLI.getValue(this, LLILLL[0]);
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS121S0100000_21(function0, 93));
        }
    }
}
