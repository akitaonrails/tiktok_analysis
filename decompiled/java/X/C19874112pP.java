package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12pP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19874112pP {
    public static <T> C19874012pO<T> LIZ(Class<T> cls, String str) {
        try {
            return new C19874012pO<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public static <K, V> void LIZIZ(InterfaceC19873212pG<K, V> interfaceC19873212pG, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC19873212pG.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : interfaceC19873212pG.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                objectOutputStream.writeObject(it2.next());
            }
        }
    }
}
