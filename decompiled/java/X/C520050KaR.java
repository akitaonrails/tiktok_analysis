package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520050KaR extends WeakReference<AbstractC1387200mCc> {
    public final int hashCode() {
        AbstractC1387200mCc abstractC1387200mCc = get();
        if (abstractC1387200mCc != null) {
            return abstractC1387200mCc.hashCode();
        }
        return 0;
    }

    public C520050KaR(AbstractC1387200mCc abstractC1387200mCc) {
        super(abstractC1387200mCc);
    }

    public final boolean equals(Object obj) {
        Reference reference;
        Object obj2;
        AbstractC1387200mCc abstractC1387200mCc;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C520050KaR) {
            reference = (Reference) obj;
        } else {
            reference = null;
        }
        if (reference == null || (obj2 = reference.get()) == null || (abstractC1387200mCc = get()) == null) {
            return false;
        }
        return Intrinsics.LJFF(obj2, abstractC1387200mCc);
    }
}
