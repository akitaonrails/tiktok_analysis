package X;

import android.app.Application;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: X.088s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C20692088s {
    public final Application LIZ;
    public final HashMap<String, AnonymousClass0894> LIZIZ = new HashMap<>();

    public C20692088s(Application application) {
        if (application != null) {
            this.LIZ = application;
            return;
        }
        throw new RuntimeException("Godzilla init, application is null");
    }

    public final void LIZ(AnonymousClass0894 anonymousClass0894) {
        String strLIZIZ = anonymousClass0894.LIZIZ();
        if (!TextUtils.isEmpty(strLIZIZ)) {
            if (this.LIZIZ.get(strLIZIZ) == null) {
                this.LIZIZ.put(strLIZIZ, anonymousClass0894);
                return;
            }
            throw new RuntimeException(C786410Ut5.j4("%s plugin is already exist", new Object[]{strLIZIZ}));
        }
        throw new RuntimeException(C786410Ut5.j4("%s plugin name is null", new Object[]{anonymousClass0894.getClass().getName()}));
    }
}
