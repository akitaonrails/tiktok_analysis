package Y;

import X.C06W5;
import X.C19D5;
import X.C19D6;
import X.C2508309sH;
import X.C786410Ut5;
import X.ChoreographerFrameCallbackC1700340uLg;
import android.os.Looper;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.changeregion.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AObjectS76S0000000_26 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObjectS76S0000000_26(int r3) {
        /*
            r2 = this;
            r2.$t = r3
            switch(r3) {
                case 0: goto Lc;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            r1 = r2
            X.19D5 r0 = X.C19D6.LIZ
        L8:
            r1.<init>()
            return
        Lc:
            r1 = r2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS76S0000000_26.<init>(int):void");
    }

    public static final Object invoke$0(AObjectS76S0000000_26 aObjectS76S0000000_26) {
        String str = TimeUnlockActivity._pnsPageId;
        return new C06W5(0);
    }

    public static final Object invoke$1(AObjectS76S0000000_26 aObjectS76S0000000_26) {
        long j = C2508309sH.LIZ;
        long j2 = C2508309sH.LIZIZ;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                Choreographer choreographerV2 = C786410Ut5.v2();
                choreographerV2.postFrameCallback(new ChoreographerFrameCallbackC1700340uLg(new AtomicInteger(0), choreographerV2, j, j2));
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    public static final Object invoke$2(AObjectS76S0000000_26 aObjectS76S0000000_26) {
        C19D5 c19d5 = C19D6.LIZ;
        String str = MusCountryListActivity._pnsPageId;
        return C19D6.LIZIZ;
    }
}
