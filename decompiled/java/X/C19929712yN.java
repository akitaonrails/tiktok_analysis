package X;

import X.C19928812yE;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12yN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19929712yN extends C19928812yE<InterfaceC19930212yS<Object>, Object> {
    @Override // X.C19928812yE
    public final void LJFF() {
        if (!this.LLILZ) {
            for (int i = 0; i < this.LLILLJJLI; i++) {
                C19928812yE.c cVarLIZJ = LIZJ(i);
                if (((InterfaceC19930212yS) cVarLIZJ.LL).LJJLJ()) {
                    cVarLIZJ.setValue(Collections.unmodifiableList((List) cVarLIZJ.LLILLJJLI));
                }
            }
            for (Map.Entry<InterfaceC19930212yS<Object>, Object> entry : LIZLLL()) {
                if (entry.getKey().LJJLJ()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.LJFF();
    }

    @Override // X.C19928812yE, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
