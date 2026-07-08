package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0UwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788440UwM {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(151));

    public static final void LIZ(View view) {
        Object obj;
        try {
            C01GW c01gw = LIZ;
            Field field = (Field) c01gw.getValue();
            if (field != null) {
                obj = field.get(view);
            } else {
                obj = null;
            }
            int iIntValue = ((Integer) obj).intValue();
            Field field2 = (Field) c01gw.getValue();
            if (field2 != null) {
                field2.set(view, Integer.valueOf((iIntValue & (-13)) | 4));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void LIZIZ(View view) {
        Object obj;
        try {
            C01GW c01gw = LIZ;
            Field field = (Field) c01gw.getValue();
            if (field != null) {
                obj = field.get(view);
            } else {
                obj = null;
            }
            int iIntValue = ((Integer) obj).intValue();
            Field field2 = (Field) c01gw.getValue();
            if (field2 != null) {
                field2.set(view, Integer.valueOf(iIntValue & (-13)));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
