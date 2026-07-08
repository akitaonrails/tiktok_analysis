package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;

/* JADX INFO: renamed from: X.0dob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064790dob {
    public static final C1064800doc LIZ = new C1537480q70() { // from class: X.0doc
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC497601wk LIZ(Context context, C1537480q70 c1537480q70) {
        LifecycleOwner lifecycleOwner;
        InterfaceC497601wk interfaceC497601wk;
        if (c1537480q70 == null || (interfaceC497601wk = c1537480q70.coroutineScope) == null) {
            if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null) {
                return LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
            }
            return C817503Hh.LL;
        }
        return interfaceC497601wk;
    }
}
