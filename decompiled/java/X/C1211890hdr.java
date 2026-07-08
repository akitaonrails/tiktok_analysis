package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211890hdr<T> implements InterfaceC1255900imq {
    public final /* synthetic */ Function0<Boolean> LIZ;

    public C1211890hdr(Function0<Boolean> function0) {
        this.LIZ = function0;
    }

    @Override // X.InterfaceC1255900imq
    public final boolean test(Object obj) {
        Function0<Boolean> function0 = this.LIZ;
        if (function0 != null) {
            return function0.invoke().booleanValue();
        }
        return true;
    }
}
