package X;

import android.content.Context;
import android.os.Binder;

/* JADX INFO: renamed from: X.0Wfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class BinderC829080Wfi extends AbstractBinderC832330Wkx {
    public final Context LL;

    public final void LLILLIZIL() {
        if (C828950WfV.LIZ(this.LL, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Calling UID ");
        sbLIZ.append(callingUid);
        sbLIZ.append(" is not Google Play services.");
        throw new SecurityException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public BinderC829080Wfi(Context context) {
        this.LL = context;
    }
}
