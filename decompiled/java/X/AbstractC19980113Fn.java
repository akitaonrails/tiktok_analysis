package X;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13Fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19980113Fn<E, C extends Collection<? extends E>, B> extends AbstractC19985213Hm<E, C, B> {
    public AbstractC19980113Fn(C13HG<E> c13hg) {
        super(c13hg);
    }

    @Override // X.AbstractC19985413Ho
    public final Iterator LIZJ(Object obj) {
        return ((Collection) obj).iterator();
    }

    @Override // X.AbstractC19985413Ho
    public final int LIZLLL(Object obj) {
        return ((Collection) obj).size();
    }
}
