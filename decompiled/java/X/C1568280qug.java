package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0qug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568280qug {
    public static final C1568280qug LIZ = new C1568280qug();
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static WeakReference<InterfaceC1568300qui> LIZLLL;

    public static void LIZ() {
        InterfaceC1568300qui interfaceC1568300qui;
        if (((Number) C291820BcC.LIZ.getValue()).intValue() > 0) {
            C0X35.LIZ("feed_cache_trigger_preload_async", false);
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0quh
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    InterfaceC1568300qui interfaceC1568300qui2;
                    C1C7U.LIZ("FeedCacheFixer@9348.triggerPreload$1");
                    try {
                        WeakReference<InterfaceC1568300qui> weakReference = C1568280qug.LIZLLL;
                        if (weakReference != null && (interfaceC1568300qui2 = weakReference.get()) != null) {
                            interfaceC1568300qui2.Dm();
                        }
                        C0X35.LJIIJJI("feed_cache_trigger_preload_async", false);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedCacheFixer@9348.triggerPreload$1");
                }
            });
            return;
        }
        C0X35.LIZ("feed_cache_trigger_preload", false);
        WeakReference<InterfaceC1568300qui> weakReference = LIZLLL;
        if (weakReference != null && (interfaceC1568300qui = weakReference.get()) != null) {
            interfaceC1568300qui.Dm();
        }
        C0X35.LJIIJJI("feed_cache_trigger_preload", false);
    }
}
