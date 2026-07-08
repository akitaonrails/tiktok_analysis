package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.01AB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AB {
    public static Context LIZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.context();
        }
        return null;
    }
}
