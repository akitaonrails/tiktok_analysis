package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1485305rf extends C09AY implements Function0<ConcurrentHashMap<String, CopyOnWriteArraySet<String>>> {
    public C1485305rf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ConcurrentHashMap<String, CopyOnWriteArraySet<String>> invoke() {
        ConcurrentHashMap<String, CopyOnWriteArraySet<String>> concurrentHashMap = new ConcurrentHashMap<>();
        InterfaceC1485205re.LJIIL.getClass();
        Iterator<String> it2 = C1485105rd.LIZIZ.iterator();
        while (it2.hasNext()) {
            concurrentHashMap.put(it2.next(), new CopyOnWriteArraySet<>());
        }
        concurrentHashMap.put("im_compensation", new CopyOnWriteArraySet<>());
        return concurrentHashMap;
    }
}
