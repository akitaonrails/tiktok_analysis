package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import androidx.appcompat.widget.t0;

/* JADX INFO: renamed from: X.142C, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C142C {
    public static boolean LIZ(Context context, final InterfaceC342470Dbh interfaceC342470Dbh) {
        boolean z = context instanceof t0;
        Object baseContext = context;
        if (z) {
            baseContext = ((ContextWrapper) context).getBaseContext();
        }
        if (baseContext instanceof InterfaceC836750Ws5) {
            ((InterfaceC836750Ws5) baseContext).setActivityResultListener(interfaceC342470Dbh);
            return true;
        }
        if (baseContext instanceof InterfaceC1432560nNm) {
            ((InterfaceC1432560nNm) baseContext).KF(new InterfaceC1387820mDc() { // from class: X.142D
                @Override // X.InterfaceC1387820mDc
                public final void onActivityResult(int i, int i2, Intent intent) {
                    interfaceC342470Dbh.onActivityResult(i, i2, intent);
                }
            });
            return true;
        }
        return false;
    }
}
