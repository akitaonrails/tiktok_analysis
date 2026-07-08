package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Set;

/* JADX INFO: renamed from: X.04rJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1228304rJ {
    public static final Set<String> LIZ;

    static {
        Object[] objArr = new String[0];
        Object[] objArr2 = (Object[]) SettingsManager.LIZLLL().LJIIIIZZ("ecom_event_full_sample_config", String[].class, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        LIZ = C13LQ.LJLIIL(objArr);
    }
}
