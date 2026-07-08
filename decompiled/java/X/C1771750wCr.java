package X;

import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771750wCr {
    public final C1771760wCs LIZ;
    public final FrameLayout LIZIZ;
    public C1772770wEV LIZJ;
    public String LIZLLL;

    public final void LIZ() {
        if (C7879035x.LIZLLL()) {
            this.LIZLLL = null;
            this.LIZ.LIZIZ.LJ("mix_mall_pendant_layer_ready", 0, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            C786410Ut5.LJJJJIZL(this.LIZIZ);
            C786410Ut5.LJZ(8, this.LIZIZ);
            C1772770wEV c1772770wEV = this.LIZJ;
            if (c1772770wEV != null) {
                c1772770wEV.release();
            }
            this.LIZJ = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            this.LIZLLL = null;
            this.LIZ.LIZIZ.LJ("mix_mall_pendant_layer_ready", 0, EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            C786410Ut5.LJJJJIZL(this.LIZIZ);
            C786410Ut5.LJZ(8, this.LIZIZ);
            C1772770wEV c1772770wEV2 = this.LIZJ;
            if (c1772770wEV2 != null) {
                c1772770wEV2.release();
            }
            this.LIZJ = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C1771750wCr(C1771760wCs c1771760wCs, FrameLayout frameLayout) {
        this.LIZ = c1771760wCs;
        this.LIZIZ = frameLayout;
    }
}
