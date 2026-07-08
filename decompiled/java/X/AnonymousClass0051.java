package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0051, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0051 implements Function1<Object, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof Integer) && !Intrinsics.LJFF(obj, 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
