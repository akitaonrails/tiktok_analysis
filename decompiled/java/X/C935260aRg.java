package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0aRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935260aRg {
    public final List<C933130aOF> LIZ;
    public final List<C933130aOF> LIZIZ;

    public C935260aRg(C935250aRf c935250aRf) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = Collections.unmodifiableList(arrayList);
        List<C933130aOF> list = c935250aRf.LIZ;
        if (list != null && !((ArrayList) list).isEmpty()) {
            arrayList.addAll(c935250aRf.LIZ);
        }
    }
}
