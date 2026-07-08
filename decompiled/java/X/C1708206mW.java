package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.06mW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1708206mW extends AbstractC1708306mX {
    public /* synthetic */ C1708206mW() {
        this(new AbstractC1708306mX() { // from class: X.06mY
            @Override // X.AbstractC1708306mX
            public final <T> T LIZ(InterfaceC1681606iE<T> interfaceC1681606iE) {
                return null;
            }
        });
    }

    public C1708206mW(AbstractC1708306mX abstractC1708306mX) {
        this.LIZ.putAll(abstractC1708306mX.LIZ);
    }

    @Override // X.AbstractC1708306mX
    public final <T> T LIZ(InterfaceC1681606iE<T> interfaceC1681606iE) {
        return (T) ((LinkedHashMap) this.LIZ).get(interfaceC1681606iE);
    }

    public final <T> void LIZIZ(InterfaceC1681606iE<T> interfaceC1681606iE, T t) {
        this.LIZ.put(interfaceC1681606iE, t);
    }
}
