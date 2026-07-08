package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class MethodCallsLogger {
    public final Map<String, Integer> calledMethods = new HashMap();

    public boolean approveCall(String str, int i) {
        int iIntValue;
        Integer num = this.calledMethods.get(str);
        boolean z = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if ((iIntValue & i) != 0) {
            z = true;
        }
        this.calledMethods.put(str, Integer.valueOf(i | iIntValue));
        return !z;
    }
}
