package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0WgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829390WgD implements InterfaceC828670Wf3 {
    @Override // X.InterfaceC828670Wf3
    public final C829410WgF LIZ(Context context, String str, InterfaceC829420WgG interfaceC829420WgG) {
        int iLIZ;
        C829410WgF c829410WgF = new C829410WgF();
        int iLIZIZ = interfaceC829420WgG.LIZIZ(context, str);
        c829410WgF.LIZ = iLIZIZ;
        int i = 0;
        if (iLIZIZ != 0) {
            iLIZ = interfaceC829420WgG.LIZ(context, str, false);
            c829410WgF.LIZIZ = iLIZ;
        } else {
            iLIZ = interfaceC829420WgG.LIZ(context, str, true);
            c829410WgF.LIZIZ = iLIZ;
        }
        int i2 = c829410WgF.LIZ;
        if (i2 == 0) {
            if (iLIZ == 0) {
                c829410WgF.LIZJ = 0;
                return c829410WgF;
            }
        } else {
            i = i2;
        }
        if (iLIZ >= i) {
            c829410WgF.LIZJ = 1;
            return c829410WgF;
        }
        c829410WgF.LIZJ = -1;
        return c829410WgF;
    }
}
