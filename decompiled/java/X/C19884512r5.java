package X;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.12r5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19884512r5 extends AbstractC19884812r8 {
    public final transient AbstractC19884012r0 LLILLL;
    public final transient Object[] LLILZ;
    public final transient int LLILZIL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC19884812r8
    public final AbstractC19884912r9 LJIIJ() {
        return new AbstractC19884912r9(this) { // from class: X.12r6
            public final /* synthetic */ C19884512r5 LLILLL;

            @Override // X.AbstractC19884712r7
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.LLILLL.LLILZIL;
            }

            {
                Objects.requireNonNull(this);
                this.LLILLL = this;
            }

            @Override // java.util.List
            public final /* bridge */ /* synthetic */ Object get(int i) {
                C19884512r5 c19884512r5 = this.LLILLL;
                C19863812nk.LIZ(i, c19884512r5.LLILZIL);
                int i2 = i + i;
                Object obj = c19884512r5.LLILZ[i2];
                Objects.requireNonNull(obj);
                Object obj2 = c19884512r5.LLILZ[i2 + 1];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        };
    }

    @Override // X.AbstractC19884812r8, X.AbstractC19884712r7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // X.AbstractC19884812r8, X.AbstractC19884712r7
    /* JADX INFO: renamed from: zze */
    public final AbstractC19885512rF iterator() {
        return zzd().listIterator(0);
    }

    @Override // X.AbstractC19884712r7
    public final int LIZJ(Object[] objArr) {
        return zzd().LIZJ(objArr);
    }

    @Override // X.AbstractC19884712r7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.LLILLL.get(key))) {
                return true;
            }
        }
        return false;
    }

    public C19884512r5(AbstractC19884012r0 abstractC19884012r0, Object[] objArr, int i) {
        this.LLILLL = abstractC19884012r0;
        this.LLILZ = objArr;
        this.LLILZIL = i;
    }
}
