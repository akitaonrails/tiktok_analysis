package X;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: renamed from: X.08Nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2107308Nj {
    public static final AbstractC2238408pq LIZ;

    static {
        String property;
        MainDispatcherFactory next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
        }
        List<? extends MainDispatcherFactory> listLIZ = (property == null || Boolean.parseBoolean(property)) ? C2107008Ng.LIZ() : C09RB.LJJII(C09R4.LIZIZ(C786410Ut5.o4(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator<? extends MainDispatcherFactory> it2 = listLIZ.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int loadPriority = next.getLoadPriority();
                do {
                    MainDispatcherFactory next2 = it2.next();
                    int loadPriority2 = next2.getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it2.hasNext());
            }
        }
        MainDispatcherFactory mainDispatcherFactory = next;
        if (mainDispatcherFactory == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        try {
            AbstractC2238408pq abstractC2238408pqCreateDispatcher = mainDispatcherFactory.createDispatcher(listLIZ);
            if (abstractC2238408pqCreateDispatcher != null) {
                LIZ = abstractC2238408pqCreateDispatcher;
                return;
            }
        } catch (Throwable unused2) {
            mainDispatcherFactory.hintOnError();
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
