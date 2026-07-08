package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.12lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19852412lu<T> implements Iterable<T> {
    public final /* synthetic */ Iterable LL;

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new AbstractC19852612lw<T>(this) { // from class: X.12lv
            public final Iterator<? extends AbstractC19852312lt<? extends T>> LLILLL;

            @Override // X.AbstractC19852612lw
            public final T LIZ() {
                while (this.LLILLL.hasNext()) {
                    AbstractC19852312lt<? extends T> next = this.LLILLL.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                this.LL = EnumC19852712lx.LLILLL;
                return null;
            }

            {
                Iterator<? extends AbstractC19852312lt<? extends T>> it2 = this.LL.iterator();
                it2.getClass();
                this.LLILLL = it2;
            }
        };
    }

    public C19852412lu(Iterable iterable) {
        this.LL = iterable;
    }
}
