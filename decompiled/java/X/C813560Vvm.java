package X;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.0Vvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813560Vvm {
    public final String LIZ;
    public final CharSequence LIZIZ;
    public final boolean LIZLLL;
    public final Bundle LJFF;
    public final Set<String> LJI;
    public final CharSequence[] LIZJ = null;
    public final int LJ = 0;

    public static RemoteInput LIZ(C813560Vvm c813560Vvm) {
        Set<String> set;
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(c813560Vvm.LIZ).setLabel(c813560Vvm.LIZIZ).setChoices(c813560Vvm.LIZJ).setAllowFreeFormInput(c813560Vvm.LIZLLL).addExtras(c813560Vvm.LJFF);
        if (Build.VERSION.SDK_INT >= 26 && (set = c813560Vvm.LJI) != null) {
            Iterator<String> it2 = set.iterator();
            while (it2.hasNext()) {
                C813570Vvn.LIZLLL(builderAddExtras, it2.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C813660Vvw.LIZIZ(builderAddExtras, c813560Vvm.LJ);
        }
        return builderAddExtras.build();
    }

    public C813560Vvm(String str, CharSequence charSequence, boolean z, Bundle bundle, Set set) {
        this.LIZ = str;
        this.LIZIZ = charSequence;
        this.LIZLLL = z;
        this.LJFF = bundle;
        this.LJI = set;
    }
}
