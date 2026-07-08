package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0gzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186790gzN {
    public static final boolean LIZ(Object obj, String str) {
        return ((Intent) obj).getBooleanExtra(str, false);
    }

    public static final Serializable LIZJ(Object obj, String str) {
        if (obj instanceof Intent) {
            return ((Intent) obj).getSerializableExtra(str);
        }
        if (obj instanceof Bundle) {
            return ((Bundle) obj).getSerializable(str);
        }
        return null;
    }

    public static final String LIZLLL(Object obj, String str) {
        try {
            return ((Intent) obj).getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final int LIZIZ(int i, Object obj, String str) {
        return ((Intent) obj).getIntExtra(str, i);
    }

    public static final void LJ(Object obj, String str, Serializable serializable) {
        if (obj instanceof Intent) {
            ((Intent) obj).putExtra(str, serializable);
        }
        if (obj instanceof Bundle) {
            C786410Ut5.LJJIZ((Bundle) obj, str, serializable);
        }
    }
}
