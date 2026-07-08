package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.0qO9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548110qO9 extends HashSet<String> {
    public static final C1548120qOA Companion = new Object() { // from class: X.0qOA
    };

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return contains((String) obj);
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return remove((String) obj);
    }

    public /* bridge */ boolean contains(String str) {
        return super.contains((Object) str);
    }

    public /* bridge */ boolean remove(String str) {
        return super.remove((Object) str);
    }
}
