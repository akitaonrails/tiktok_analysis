package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.token.AuthTokenMultiProcessSharedProvider;
import java.util.Map;

/* JADX INFO: renamed from: X.0WFT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WFT {
    public final Context LIZ;
    public final ContentValues LIZIZ = new ContentValues();

    public final synchronized void LIZ() {
        try {
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(this.LIZ, 4, AuthTokenMultiProcessSharedProvider.LLJ).edit();
            for (Map.Entry<String, Object> entry : this.LIZIZ.valueSet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                C847400XMc.LJIIIZ("AuthTokenMultiProcessShared", "MultiProcessShareProvider apply key = " + key + " value = " + C0XMV.LIZJ(value));
                if (value == null) {
                    editorEdit.remove(key);
                } else if (value instanceof String) {
                    editorEdit.putString(key, (String) value);
                } else if (value instanceof Boolean) {
                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Long) {
                    editorEdit.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Integer) {
                    editorEdit.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Float) {
                    editorEdit.putFloat(key, ((Float) value).floatValue());
                }
            }
            editorEdit.commit();
            C2204961BRm.LJJIJLIJ(this.LIZ.getContentResolver(), AuthTokenMultiProcessSharedProvider.LIZIZ(this.LIZ, "key", "type"), this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKco0nino4bHADTxvbY1AZTMpKa5gKsrgM4xWFcxC4Ak/yVrvtbHUd310=", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C847400XMc.LJIIIZ("AuthTokenMultiProcessShared", "MultiProcessShareProvider apply error = " + Log.getStackTraceString(th));
            C0XMZ.LIZJ(th);
        }
    }

    public C0WFT(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }
}
