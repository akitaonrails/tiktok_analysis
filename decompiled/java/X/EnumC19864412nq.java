package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC19864412nq implements Iterator<Object> {
    public static final EnumC19864412nq LL;
    public static final /* synthetic */ EnumC19864412nq[] LLILLJJLI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C19863912nl.LIZJ(false);
    }

    static {
        EnumC19864412nq enumC19864412nq = new EnumC19864412nq();
        LL = enumC19864412nq;
        LLILLJJLI = new EnumC19864412nq[]{enumC19864412nq};
    }

    public static EnumC19864412nq[] values() {
        return (EnumC19864412nq[]) LLILLJJLI.clone();
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    public static EnumC19864412nq valueOf(String str) {
        return (EnumC19864412nq) C08FF.LIZ(EnumC19864412nq.class, str);
    }
}
