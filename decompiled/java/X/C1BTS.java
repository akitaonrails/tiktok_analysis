package X;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.SupportMapFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1BTS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BTS implements ViewTreeObserver.OnGlobalLayoutListener, InterfaceC2205441BTi {
    public final Function1<C1BSM, Unit> LL;
    public final View LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public C1BSM LLILZIL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C1BSM c1bsm;
        ViewTreeObserver viewTreeObserver;
        View view = this.LLILLJJLI;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            C2187701Ajg.LIZIZ(viewTreeObserver, this, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLILLL = true;
        if (!this.LLILZ || (c1bsm = this.LLILZIL) == null) {
            return;
        }
        this.LL.invoke(c1bsm);
    }

    @Override // X.InterfaceC2205441BTi
    public final void LIZ(C1BSM c1bsm) {
        this.LLILZIL = c1bsm;
        this.LLILZ = true;
        if (this.LLILLL) {
            this.LL.invoke(c1bsm);
        }
    }

    public C1BTS(SupportMapFragment supportMapFragment, AwS613S0100000_34 awS613S0100000_34) {
        this.LL = awS613S0100000_34;
        View view = supportMapFragment.getView();
        this.LLILLJJLI = view;
        if (view != null && (view.getWidth() == 0 || view.getHeight() == 0)) {
            C786410Ut5.x3(view.getViewTreeObserver(), this);
        } else {
            this.LLILLL = true;
        }
        C0W3J.LJ("getMapAsync must be called on the main thread.");
        C1BTR c1btr = supportMapFragment.LL;
        T t = c1btr.LIZ;
        if (t != 0) {
            try {
                ((C1BTV) t).LIZIZ.LJJIII(new BinderC2205401BTe(this));
                return;
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C829150Wfp(e);
            }
        }
        ((ArrayList) c1btr.LJII).add(this);
    }
}
