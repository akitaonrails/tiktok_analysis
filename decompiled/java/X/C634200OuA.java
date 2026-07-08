package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0OuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634200OuA {
    public static final InterfaceC665370Q7z LIZ(Object obj) {
        Context context;
        C19EG c19egLJ;
        if ((obj instanceof Context) && (context = (Context) obj) != null && (c19egLJ = C737910Sx3.LJ(context)) != null) {
            return C1558360qeg.LJI(c19egLJ, null);
        }
        if (obj instanceof Fragment) {
            return C1558360qeg.LJFF((Fragment) obj, null);
        }
        if (obj instanceof AbstractC738140SxQ) {
            return ((AbstractC738140SxQ) obj).getVAssemScope();
        }
        if (obj instanceof InterfaceC713360RyY) {
            return C1558420qem.LIZIZ((InterfaceC713360RyY) obj);
        }
        if (!(obj instanceof View)) {
            return null;
        }
        return C1558360qeg.LJ((View) obj, null);
    }
}
