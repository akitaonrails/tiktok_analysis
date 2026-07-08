package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0saR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632610saR<KEY, INFO> implements InterfaceC1632630saT<KEY, INFO> {
    public final List<InterfaceC1632630saT<KEY, INFO>> LIZ = new ArrayList();

    @Override // X.InterfaceC1632630saT
    public final void LIZ(Long l, Object obj, Object obj2) {
        Iterator<InterfaceC1632630saT<KEY, INFO>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(l, obj, obj2);
        }
    }

    @Override // X.InterfaceC1632630saT
    public final void LIZIZ(int i, int i2, KEY key) {
        Iterator<InterfaceC1632630saT<KEY, INFO>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(i, i2, key);
        }
    }

    @Override // X.InterfaceC1632630saT
    public final void LIZJ(KEY key, Long l, Exception exc, INFO info) {
        Iterator<InterfaceC1632630saT<KEY, INFO>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(key, l, exc, info);
        }
    }
}
