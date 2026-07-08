package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.14Uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20272814Uc implements C14UF, InterfaceC342470Dbh {
    public InterfaceC20273614Uk LL;

    public AbstractC20272814Uc(WeakReference<Context> weakReference) {
    }

    @Override // X.InterfaceC342470Dbh
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 && i != 700 && i != 800 && i != 10003 && i != 10004) {
            ((C20272914Ud) this).LIZ(0, "Unrecognized request code");
            return true;
        }
        InterfaceC20273614Uk interfaceC20273614Uk = this.LL;
        if (interfaceC20273614Uk == null) {
            interfaceC20273614Uk = null;
        }
        interfaceC20273614Uk.onActivityResult(i, i2, intent);
        return true;
    }
}
