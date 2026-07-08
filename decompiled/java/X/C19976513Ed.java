package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: X.13Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19976513Ed implements Map.Entry<Object, Object>, C08J0 {
    public final Object LL;
    public Object LLILLJJLI;
    public final /* synthetic */ C19976713Ef<Object, Object> LLILLL;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.LL;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.LLILLJJLI;
    }

    public C19976513Ed(C19976713Ef<Object, Object> c19976713Ef) {
        this.LLILLL = c19976713Ef;
        this.LL = c19976713Ef.LLILZ.getKey();
        this.LLILLJJLI = c19976713Ef.LLILZ.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C19976713Ef<Object, Object> c19976713Ef = this.LLILLL;
        if (c19976713Ef.LL.LIZJ().LIZLLL == c19976713Ef.LLILLL) {
            Object obj2 = this.LLILLJJLI;
            c19976713Ef.LL.put(this.LL, obj);
            this.LLILLJJLI = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
