package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS427S0200000_26;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706490uVb {
    public static final <T> T LIZ(Class<T> cls) {
        C1569570qwl c1569570qwlLIZ = C1706510uVd.LIZ();
        if (c1569570qwlLIZ != null) {
            return (T) c1569570qwlLIZ.LIZ(cls);
        }
        return null;
    }

    public static final Boolean LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = null;
        if (z) {
            return null;
        }
        try {
            boolValueOf = Boolean.valueOf(new JSONObject(str).optBoolean("unique"));
            return boolValueOf;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return boolValueOf;
        }
    }

    public static final void LJ(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1706500uVc.LIZ().LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r2, java.lang.String r3) {
        /*
            java.lang.String r1 = ""
            if (r2 == 0) goto L22
            int r0 = r2.length()
            if (r0 != 0) goto Le
            r0 = 1
        Lb:
            if (r0 != 0) goto L1e
            goto L10
        Le:
            r0 = 0
            goto Lb
        L10:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1a
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1a
            java.lang.String r0 = r0.optString(r3, r1)     // Catch: java.lang.Exception -> L1a
            goto L1f
        L1a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L22
            return r0
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1706490uVb.LIZJ(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final Object LIZLLL(int i, List list) {
        if ((i >= 0 && i < list.size()) || (0 != 0 && list != null)) {
            return ListProtector.get(list, i);
        }
        return null;
    }

    public static final <T extends ViewModel, O extends ViewModelStoreOwner> C01GW<T> LJFF(O o, Class<T> cls) {
        return C452501pT.LIZIZ(new AwS427S0200000_26(o, cls, 0));
    }
}
