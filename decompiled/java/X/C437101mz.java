package X;

import android.content.Context;
import com.bytedance.assem.arch.core.UIAssem;

/* JADX INFO: renamed from: X.01mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C437101mz {
    public static final void LIZ(UIAssem uIAssem, int i, boolean z) {
        String string;
        if (uIAssem.getContext() != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            Context context = uIAssem.getContext();
            if (context != null) {
                string = context.getString(i);
            } else {
                string = null;
            }
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LIZ(z);
            c1389890mGx.LJIIJJI();
        }
    }
}
