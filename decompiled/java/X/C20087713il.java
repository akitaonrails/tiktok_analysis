package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13il, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20087713il {
    public static final void LIZ(View view) {
        Iterator<Object> it2 = C19724012Fa.LIZJ(view).iterator();
        while (true) {
            C2152008bu c2152008bu = (C2152008bu) it2;
            if (c2152008bu.hasNext()) {
                C20087813im c20087813imLIZIZ = LIZIZ((View) c2152008bu.next());
                for (int iLJIIJ = C1697810uHb.LJIIJ(c20087813imLIZIZ.LIZ); -1 < iLJIIJ; iLJIIJ--) {
                    ((InterfaceC20088013io) ListProtector.get(c20087813imLIZIZ.LIZ, iLJIIJ)).onRelease();
                }
            } else {
                return;
            }
        }
    }

    public static final C20087813im LIZIZ(View view) {
        C20087813im c20087813im = (C20087813im) view.getTag(R.id.rgq);
        if (c20087813im == null) {
            C20087813im c20087813im2 = new C20087813im();
            view.setTag(R.id.rgq, c20087813im2);
            return c20087813im2;
        }
        return c20087813im;
    }

    public static final void LIZJ(View view, boolean z) {
        view.setTag(R.id.l0i, Boolean.valueOf(z));
    }
}
