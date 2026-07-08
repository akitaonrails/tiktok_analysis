package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* JADX INFO: renamed from: X.0Vu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812460Vu0 {
    public final Context LIZ;

    public C812460Vu0(Context context) {
        this.LIZ = context;
    }

    public final boolean LIZJ() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C812470Vu1.LIZ(this.LIZ);
        }
        if (!C811660Vsi.LIZ() || (nameForUid = this.LIZ.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.LIZ.getPackageManager().isInstantApp(nameForUid);
    }

    public final ApplicationInfo LIZ(int i, String str) {
        return C786410Ut5.V3(this.LIZ.getPackageManager(), str, i);
    }

    public final PackageInfo LIZIZ(int i, String str) {
        return C786410Ut5.Y3(this.LIZ.getPackageManager(), str, i);
    }
}
