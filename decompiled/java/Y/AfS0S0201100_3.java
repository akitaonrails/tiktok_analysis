package Y;

import X.C09JN;
import X.C0C64;
import X.C0WZX;
import X.C1007810cKh;
import X.C1035880d3y;
import X.C1068210du7;
import X.C1068720duw;
import X.C1BWL;
import X.C1C7U;
import X.C2204961BRm;
import X.C2455909jp;
import X.C606810Nr5;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autofill.api.PipoDomainQueryResponse;
import com.ss.android.ugc.aweme.lifecycle.LifecycleActiveReceiver;
import com.ss.android.ugc.aweme.lifecycle.task.LifecycleTask;
import com.ss.android.ugc.aweme.lifecycle.task.TaskLifecycleProbeService;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class AfS0S0201100_3 implements C09JN {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0201100_3 afS0S0201100_3, Object obj) {
        LifecycleTask lifecycleTask = (LifecycleTask) afS0S0201100_3.l0;
        Context context = (Context) afS0S0201100_3.l1;
        int i = afS0S0201100_3.i2;
        long j = afS0S0201100_3.j3;
        lifecycleTask.getClass();
        C1C7U.LIZ("LifecycleTask@82e4.run$1L");
        if (((C606810Nr5) obj).LIZIZ) {
            if (LifecycleTask.LIZ()) {
                C2455909jp.LIZIZ = false;
            }
            LifecycleTask.LJ(i, j, context);
        } else {
            if (LifecycleTask.LIZ()) {
                C2455909jp.LIZIZ();
            }
            LifecycleActiveReceiver.LIZJ++;
            LifecycleActiveReceiver.LIZIZ = 0L;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_disable_fg", true) != 1) {
                Application applicationLIZ = C1BWL.LIZ();
                try {
                    C2204961BRm.LJJ(applicationLIZ, new Intent(applicationLIZ, (Class<?>) TaskLifecycleProbeService.class), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahZZrNxTHwdyqQgKeRO7d5ZtGroYWTKC70N54=", null));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        C1C7U.LIZIZ("LifecycleTask@82e4.run$1L");
    }

    public static final void accept$1(AfS0S0201100_3 afS0S0201100_3, Object obj) throws JSONException {
        C1C7U.LIZ("AdAutofillPipoManager@24f6.fetchGetPipoDomainQuery$2");
        PipoDomainQueryResponse pipoDomainQueryResponse = (PipoDomainQueryResponse) obj;
        C1068720duw c1068720duw = C1068720duw.LIZ;
        c1068720duw.getClass();
        boolean z = true;
        C1068720duw.LJII = true;
        C1068720duw.LJIIIIZZ = pipoDomainQueryResponse.domain;
        C1068720duw.LJIIIZ = pipoDomainQueryResponse.merchantId;
        C1068720duw.LJIIIIZZ((WebView) afS0S0201100_3.l0, afS0S0201100_3.i2, (C1035880d3y) afS0S0201100_3.l1);
        C1068210du7.LIZ.getClass();
        C1007810cKh c1007810cKh = C1068210du7.LJIIIZ;
        long j = afS0S0201100_3.j3;
        int i = afS0S0201100_3.i2;
        Integer num = pipoDomainQueryResponse.statusCode;
        if (num == null || num.intValue() != 0) {
            z = false;
        }
        C1068720duw.LJIIL(c1068720duw, c1007810cKh, j, i, z, String.valueOf(pipoDomainQueryResponse.statusCode), pipoDomainQueryResponse.statusMsg);
        Integer num2 = pipoDomainQueryResponse.statusCode;
        if (num2 == null || num2.intValue() != 0) {
            C1068720duw.LJIILJJIL(null);
        }
        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.fetchGetPipoDomainQuery$2");
    }

    public AfS0S0201100_3(Object obj, int i, Object obj2, long j, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
        this.j3 = j;
    }
}
