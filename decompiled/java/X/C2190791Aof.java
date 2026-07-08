package X;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1Aof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2190791Aof extends ArrayList<String> {
    public final /* synthetic */ C2206531BXn LL;

    public C2190791Aof(C2206531BXn c2206531BXn) {
        this.LL = c2206531BXn;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((ConcurrentHashMap) this.LL.LIZLLL).get(obj).getClass();
        return super.add(obj);
    }
}
