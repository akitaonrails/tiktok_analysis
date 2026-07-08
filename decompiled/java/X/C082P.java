package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.082P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C082P {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(List list) {
        Integer numValueOf;
        StringBuilder sb = new StringBuilder();
        if (list != null && (numValueOf = Integer.valueOf(list.size())) != null) {
            for (int iIntValue = numValueOf.intValue() - 1; -1 < iIntValue; iIntValue--) {
                Throwable th = (Throwable) ListProtector.get(list, iIntValue);
                sb.append(th.getClass().getName());
                sb.append(": ");
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                sb.append(message);
                sb.append('\n');
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    sb.append("at ");
                    sb.append(stackTraceElement.toString());
                    sb.append('\n');
                }
            }
        }
        return sb.toString();
    }

    public static String LIZIZ(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName());
        sb.append(": ");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        sb.append(message);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("at ");
            sb.append(stackTraceElement.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
