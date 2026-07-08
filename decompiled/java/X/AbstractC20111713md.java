package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20111713md {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public AbstractC20111713md(String str) {
        this.LIZ = str;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AbstractC20111713md) && obj != null) {
            AbstractC20111713md abstractC20111713md = (AbstractC20111713md) obj;
            if (!(!Intrinsics.LJFF(abstractC20111713md.getClass(), getClass()))) {
                return Intrinsics.LJFF(this.LIZ, abstractC20111713md.LIZ);
            }
            return false;
        }
        return false;
    }
}
