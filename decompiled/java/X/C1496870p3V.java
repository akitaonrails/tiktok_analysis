package X;

import java.util.AbstractList;
import java.util.RandomAccess;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p3V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496870p3V extends AbstractList<ByteString> implements RandomAccess {
    public static final C1496860p3U LLILLL = new C1496860p3U();
    public final ByteString[] LL;
    public final int[] LLILLJJLI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.LL.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null && !(obj instanceof ByteString)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.LL[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null && !(obj instanceof ByteString)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null && !(obj instanceof ByteString)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null && !(obj instanceof ByteString)) {
            return false;
        }
        return super.remove(obj);
    }

    public C1496870p3V(ByteString[] byteStringArr, int[] iArr) {
        this.LL = byteStringArr;
        this.LLILLJJLI = iArr;
    }
}
