package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import lth.o;

/* JADX INFO: renamed from: X.0LHA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LHA {
    public static final C0MB4 LIZ(Intent intent) {
        if (intent != null && C0LHB.LIZ(intent)) {
            return new C0MB4() { // from class: X.0LH9
                @Override // X.C0MB4
                public final boolean LIZ(Context context, Bundle bundle) {
                    boolean z;
                    boolean z2;
                    if (o.LJJ.LJ().LJFF(context) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (o.LJJ.LJ().LJ(context) == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z || !z2) {
                        return false;
                    }
                    return true;
                }
            };
        }
        return C0LH8.LIZ;
    }
}
