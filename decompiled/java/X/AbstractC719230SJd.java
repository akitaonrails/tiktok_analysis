package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0SJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC719230SJd<METADATA> {
    public final CharSequence LIZ;
    public final Iterable<METADATA> LIZIZ;
    public final List<C0SJL<METADATA>> LIZJ = new ArrayList();

    public abstract List<C0SJL<METADATA>> LIZ(CharSequence charSequence, Iterable<? extends METADATA> iterable);

    public abstract String LIZIZ();

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC719230SJd(CharSequence charSequence, Iterable<? extends METADATA> iterable) {
        this.LIZ = charSequence;
        this.LIZIZ = iterable;
    }
}
