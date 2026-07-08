package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08Jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2096308Jd extends ArrayList<Integer> {
    public /* bridge */ int getSize() {
        return super.size();
    }

    public final void report() {
        C20684815ws.LJIILLIIL("internal_share_action_chain", C2097908Jt.LIZJ(new Pair("action_chain", toString())));
        clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        Iterator<Integer> it2 = iterator();
        if (!it2.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(it2.next().intValue());
            if (!it2.hasNext()) {
                return sb.toString();
            }
            sb.append(',');
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return contains((Integer) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return indexOf((Integer) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return lastIndexOf((Integer) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null && !(obj instanceof Integer)) {
            return false;
        }
        return remove((Integer) obj);
    }

    public /* bridge */ Integer removeAt(int i) {
        return remove(i);
    }

    public /* bridge */ boolean contains(Integer num) {
        return super.contains((Object) num);
    }

    public /* bridge */ int indexOf(Integer num) {
        return super.indexOf((Object) num);
    }

    public /* bridge */ int lastIndexOf(Integer num) {
        return super.lastIndexOf((Object) num);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ Integer remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(Integer num) {
        return super.remove((Object) num);
    }
}
