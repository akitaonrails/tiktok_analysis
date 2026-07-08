package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0WgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829370WgB implements InterfaceC828670Wf3 {
    @Override // X.InterfaceC828670Wf3
    public final C829410WgF LIZ(Context context, String str, InterfaceC829420WgG interfaceC829420WgG) {
        C829410WgF c829410WgF = new C829410WgF();
        int iLIZIZ = interfaceC829420WgG.LIZIZ(context, str);
        c829410WgF.LIZ = iLIZIZ;
        if (iLIZIZ != 0) {
            c829410WgF.LIZJ = -1;
        } else {
            int iLIZ = interfaceC829420WgG.LIZ(context, str, true);
            c829410WgF.LIZIZ = iLIZ;
            if (iLIZ != 0) {
                c829410WgF.LIZJ = 1;
                return c829410WgF;
            }
        }
        return c829410WgF;
    }
}
