package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo;

/* JADX INFO: renamed from: X.0Pv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660250Pv5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(final SearchIntermediateAwemeInfo searchIntermediateAwemeInfo, final LifecycleOwner lifecycleOwner) {
        final C259800zU c259800zU = new C259800zU();
        if (lifecycleOwner instanceof C19EG) {
            SAFHelper.LIZ.getClass();
            if (SAFHelper.LJIIJJI()) {
                InterfaceC214902198i interfaceC214902198iLIZIZ = C651580Ph6.LIZIZ((Activity) lifecycleOwner);
                T t = interfaceC214902198iLIZIZ;
                if (interfaceC214902198iLIZIZ == null) {
                    t = 0;
                }
                c259800zU.element = t;
            }
        }
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0Pv6
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C667750QHd c667750QHd;
                C1C7U.LIZ("SearchSignalHelper$Companion@c527.addAwemeInfo$1");
                try {
                    if (lifecycleOwner != null) {
                        C259800zU<Fragment> c259800zU2 = c259800zU;
                        c667750QHd = new C667750QHd(c259800zU2.element, lifecycleOwner);
                    } else {
                        c667750QHd = new C667750QHd();
                    }
                    c667750QHd.LIZ(new C660270Pv7(searchIntermediateAwemeInfo));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchSignalHelper$Companion@c527.addAwemeInfo$1");
            }
        });
    }
}
