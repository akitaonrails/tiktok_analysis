package X;

import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNumIndicatorAssem;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0S9U, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S9U implements Runnable {
    public final WeakReference<InterfaceC716630S9d> LL;
    public String LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("WeakRefDelayRun@e016.run");
        try {
            InterfaceC716630S9d interfaceC716630S9d = this.LL.get();
            if (interfaceC716630S9d != null) {
                interfaceC716630S9d.pg(this.LLILLJJLI);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WeakRefDelayRun@e016.run");
    }

    public C0S9U(PhotoNumIndicatorAssem photoNumIndicatorAssem) {
        this.LL = new WeakReference<>(photoNumIndicatorAssem);
    }
}
