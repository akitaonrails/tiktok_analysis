package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0rls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601260rls implements Iterator<Aweme>, C03W4 {
    public final Iterator<Aweme> LL;
    public final C1160560gJ4 LLILLJJLI;
    public Aweme LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final Aweme next() {
        Aweme next = this.LL.next();
        this.LLILLL = next;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Aweme aweme = this.LLILLL;
        if (aweme == null) {
            this.LL.remove();
        } else {
            this.LLILLJJLI.LJ(aweme);
            this.LLILLL = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1601260rls(Iterator<? extends Aweme> it2, C1160560gJ4 c1160560gJ4) {
        this.LL = it2;
        this.LLILLJJLI = c1160560gJ4;
    }
}
