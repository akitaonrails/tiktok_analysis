package X;

import android.os.Bundle;
import com.bytedance.pumbaa.app2app.data.KV;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825670WaD {
    public static final List<KV> LIZ(Bundle bundle) {
        Object obj;
        String string;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            if (str != null) {
                try {
                    obj = bundle.get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                if (obj != null) {
                    string = obj.toString();
                } else {
                    string = null;
                }
                arrayList.add(new KV(str, string));
            }
        }
        return arrayList;
    }
}
