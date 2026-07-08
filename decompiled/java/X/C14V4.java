package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.14V4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C14V4 implements C14VG, InterfaceC342470Dbh {
    public C14VQ LL;

    public C14V4(WeakReference<Context> weakReference) {
    }

    @Override // X.InterfaceC342470Dbh
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 && i != 700 && i != 800 && i != 10003 && i != 10004) {
            ((C14V1) this).LIZ(0, "Unrecognized request code");
            return true;
        }
        C14VQ c14vq = this.LL;
        if (c14vq == null) {
            c14vq = null;
        }
        c14vq.onActivityResult(i, i2, intent);
        return true;
    }
}
