package Y;

import X.C09JN;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.livesdk.init.SDKServiceInitTask;

/* JADX INFO: loaded from: classes21.dex */
public class AfS141S0000000_20 implements C09JN {
    public final int $t;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public AfS141S0000000_20(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS141S0000000_20 afS141S0000000_20, Object obj) {
        Throwable unknownError = (Throwable) obj;
        C1C7U.LIZ("LiveSDKInitP2TaskNew@8c10.initRxJavaErrorHandlerTask$1L");
        if (unknownError == null) {
            unknownError = new UnknownError("unknown error");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message = ");
        sbLIZ.append(unknownError.getMessage());
        C20441214yg.LJ("RxJava", C2188811AlT.LIZIZ(sbLIZ));
        if (unknownError.getStackTrace() != null) {
            for (StackTraceElement stackTraceElement : unknownError.getStackTrace()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("\t\t");
                sbLIZ2.append(stackTraceElement.toString());
                C20441214yg.LJ("RxJava", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        C1C7U.LIZIZ("LiveSDKInitP2TaskNew@8c10.initRxJavaErrorHandlerTask$1L");
    }

    public static final void accept$1(AfS141S0000000_20 afS141S0000000_20, Object obj) {
        SDKServiceInitTask.lambda$run$0((Throwable) obj);
    }
}
