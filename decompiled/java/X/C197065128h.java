package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.128h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197065128h {
    public static final /* synthetic */ int LIZJ = 0;
    public final C197067128j LIZ;
    public final C197066128i LIZIZ;

    public C197065128h(C197067128j c197067128j) {
        this.LIZ = c197067128j;
        this.LIZIZ = new C197066128i(c197067128j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Bundle bundle) {
        Context context;
        Integer numLIZ;
        C197067128j c197067128j = this.LIZ;
        C128Y c128y = c197067128j.LIZ;
        if (c128y instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) c128y.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.GET_CURRENT_STATE;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) c128y))) != null) {
                c197067128j.LIZ(bundle);
                C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                return;
            }
        }
        c197067128j.LIZ(bundle);
    }

    public final void LIZIZ(Bundle bundle) {
        C197067128j c197067128j = this.LIZ;
        c197067128j.getClass();
        C2097608Jq.LJ();
        Bundle bundleLIZ = C799520VXy.LIZ((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = c197067128j.LJFF;
        if (bundle2 != null) {
            C786410Ut5.LJJIIJZLJL(bundleLIZ, bundle2);
        }
        synchronized (c197067128j.LIZJ) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) c197067128j.LIZLLL).entrySet()) {
                    C786410Ut5.LJJIIZI(bundleLIZ, ((InterfaceC197061128d) entry.getValue()).saveState(), (String) entry.getKey());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!bundleLIZ.isEmpty()) {
            C786410Ut5.LJJIIZI(bundle, bundleLIZ, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
    }
}
