package X;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0njj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446170njj {
    public final C01GW LIZ;

    public C1446170njj(Context context) {
        this.LIZ = C452501pT.LIZIZ(new AwS566S0100000_22(context, 1126));
    }

    public final int LIZ(int i) {
        return ((SharedPreferences) this.LIZ.getValue()).getInt("resource_version", i);
    }
}
