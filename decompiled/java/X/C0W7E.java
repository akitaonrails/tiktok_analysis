package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0W7E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0W7E implements C0W7G {
    @Override // X.C0W7G
    public boolean LIZIZ() {
        return this instanceof C0W7F;
    }

    @Override // X.C0W7G
    public Intent LIZ(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("package:");
        sbLIZ.append(context.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
    }
}
