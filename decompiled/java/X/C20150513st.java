package X;

import Y.ARunnableS99S0200000_30;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13st, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20150513st extends AbstractRunnableC20150813sw<InterfaceC20150713sv> {
    public final C01GW LLIZLLLIL;
    public C20150213sq<Object> LLJ;

    @Override // X.AbstractRunnableC20150813sw
    public final Object LIZJ() {
        T t = this.LLILZ;
        if (t instanceof InterfaceC20150613su) {
            C786410Ut5.LJJZZIII((Handler) this.LLIZLLLIL.getValue(), new ARunnableS99S0200000_30(this, (InterfaceC20150613su) t, 9));
        } else {
            if (t instanceof InterfaceC20150413ss) {
                C20152413tC.LIZ.LIZLLL.invoke().execute(new ARunnableS99S0200000_30(this, (InterfaceC20150413ss) t, 10));
                return null;
            }
            if (t instanceof InterfaceC20150313sr) {
                try {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C20150113sp(this, (InterfaceC20150313sr) t, null), 2);
                    return null;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // X.AbstractRunnableC20150813sw
    public final void onDetach() {
        super.onDetach();
        ((InterfaceC20150713sv) this.LLILZ).onDetach();
        this.LLJ = null;
    }

    @Override // X.AbstractRunnableC20150813sw
    public final void LIZ(Bundle bundle) {
        ((InterfaceC20150713sv) this.LLILZ).LIZ(bundle);
    }

    public C20150513st(InterfaceC20150713sv interfaceC20150713sv, C20152313tB c20152313tB, Bundle bundle) {
        super(interfaceC20150713sv, c20152313tB, bundle);
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(227));
        this.LLJ = new C20150213sq<>(new C19387110t3());
    }
}
