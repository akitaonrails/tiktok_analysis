package X;

import android.app.Application;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0CCY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CCY {
    public final /* synthetic */ HashMap<String, Integer> LIZ;
    public final /* synthetic */ Application LIZIZ;

    public final int LIZ() {
        Integer num = this.LIZ.get(C2104108Md.LIZ(this.LIZIZ));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public C0CCY(Application application, HashMap map) {
        this.LIZ = map;
        this.LIZIZ = application;
    }
}
