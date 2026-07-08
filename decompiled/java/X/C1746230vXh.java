package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746230vXh extends AbstractC339510DSr<Object> {
    @Override // X.AbstractC339510DSr
    public final boolean LIZ(Object obj, Object obj2) {
        return Intrinsics.LJFF(obj, obj2);
    }

    @Override // X.AbstractC339510DSr
    public final boolean LIZIZ(Object obj, Object obj2) {
        if ((obj instanceof C1745680vWo) && (obj2 instanceof C1745680vWo)) {
            return Intrinsics.LJFF(((C1745680vWo) obj).LIZ.key, ((C1745680vWo) obj2).LIZ.key);
        }
        return Intrinsics.LJFF(obj, obj2);
    }
}
