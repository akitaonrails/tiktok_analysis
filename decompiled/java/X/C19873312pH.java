package X;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: X.12pH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19873312pH<K, V> extends C19873412pI<K, V> {
    @Override // X.C19873412pI
    public final Collection<V> LIZ() {
        return new C19880112qN();
    }

    public final C19872912pD<K, V> LIZLLL() {
        return C19872912pD.LJII(this.LIZ.entrySet());
    }

    @Override // X.C19873412pI
    public final void LIZJ(Map.Entry entry) {
        super.LIZJ(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19873412pI
    public final C19873412pI LIZIZ(Object obj, Object obj2) {
        super.LIZIZ(obj, obj2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(Object obj, Object obj2) {
        super.LIZIZ(obj, obj2);
    }
}
