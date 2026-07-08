package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00YK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YK implements Function1<Object, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof String) && ((CharSequence) obj).length() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
