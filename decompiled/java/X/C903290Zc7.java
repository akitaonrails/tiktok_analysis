package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Zc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903290Zc7 extends AbstractC903280Zc6 {
    public C903290Zc7() {
        this((Object) null);
    }

    public C903290Zc7(AbstractC903280Zc6 abstractC903280Zc6) {
        this.LIZ.putAll(abstractC903280Zc6.LIZ);
    }

    @Override // X.AbstractC903280Zc6
    public final <T> T LIZ(InterfaceC902960Zba<T> interfaceC902960Zba) {
        return (T) ((LinkedHashMap) this.LIZ).get(interfaceC902960Zba);
    }

    public /* synthetic */ C903290Zc7(Object obj) {
        this((AbstractC903280Zc6) C903300Zc8.LIZJ);
    }

    public final <T> void LIZIZ(InterfaceC902960Zba<T> interfaceC902960Zba, T t) {
        this.LIZ.put(interfaceC902960Zba, t);
    }
}
