package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.09AA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09AA {
    public static <E extends CoroutineContext.Element> E LIZ(InterfaceC23139094v interfaceC23139094v, InterfaceC23272099y<E> interfaceC23272099y) {
        if (interfaceC23272099y instanceof C09AB) {
            C09AB c09ab = (C09AB) interfaceC23272099y;
            if (c09ab.LIZ(interfaceC23139094v.getKey())) {
                E e = (E) c09ab.LIZIZ(interfaceC23139094v);
                if (e instanceof CoroutineContext.Element) {
                    return e;
                }
            }
            return null;
        }
        if (InterfaceC23139094v.LJJLIIJ != interfaceC23272099y) {
            return null;
        }
        return interfaceC23139094v;
    }

    public static CoroutineContext LIZIZ(InterfaceC23139094v interfaceC23139094v, InterfaceC23272099y<?> interfaceC23272099y) {
        if (interfaceC23272099y instanceof C09AB) {
            C09AB c09ab = (C09AB) interfaceC23272099y;
            if (c09ab.LIZ(interfaceC23139094v.getKey()) && c09ab.LIZIZ(interfaceC23139094v) != null) {
                return C23271099x.INSTANCE;
            }
            return interfaceC23139094v;
        }
        if (InterfaceC23139094v.LJJLIIJ == interfaceC23272099y) {
            return C23271099x.INSTANCE;
        }
        return interfaceC23139094v;
    }
}
