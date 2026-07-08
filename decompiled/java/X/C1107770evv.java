package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0evv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107770evv extends C1107780evw {
    public final HashMap<Object, C1107780evw> LIZJ;

    public C1107770evv() {
        super(false, 3);
        this.LIZJ = new HashMap<>();
    }

    @Override // X.C1107780evw
    public final boolean LIZ() {
        if (this.LIZJ.size() <= 0) {
            return this.LIZ;
        }
        Collection<C1107780evw> collectionValues = this.LIZJ.values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            if (((C1107780evw) it2.next()).LIZ()) {
                return true;
            }
        }
        return false;
    }
}
