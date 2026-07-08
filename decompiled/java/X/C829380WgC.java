package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0WgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829380WgC implements InterfaceC828670Wf3 {
    @Override // X.InterfaceC828670Wf3
    public final C829410WgF LIZ(Context context, String str, InterfaceC829420WgG interfaceC829420WgG) {
        C829410WgF c829410WgF = new C829410WgF();
        c829410WgF.LIZ = interfaceC829420WgG.LIZIZ(context, str);
        int iLIZ = interfaceC829420WgG.LIZ(context, str, true);
        c829410WgF.LIZIZ = iLIZ;
        int i = c829410WgF.LIZ;
        if (i == 0) {
            i = 0;
            if (iLIZ == 0) {
                c829410WgF.LIZJ = 0;
                return c829410WgF;
            }
        }
        if (iLIZ >= i) {
            c829410WgF.LIZJ = 1;
            return c829410WgF;
        }
        c829410WgF.LIZJ = -1;
        return c829410WgF;
    }
}
