package X;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13AP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public interface C13AP extends Serializable {
    void add(C13AP c13ap);

    boolean contains(C13AP c13ap);

    boolean contains(String str);

    boolean equals(Object obj);

    String getName();

    boolean hasChildren();

    boolean hasReferences();

    int hashCode();

    Iterator<C13AP> iterator();

    boolean remove(C13AP c13ap);
}
