package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0c9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001130c9v {
    public static final Context LIZ(InterfaceC1010530cP5<? extends InterfaceC1000860c9U> interfaceC1010530cP5) {
        return interfaceC1010530cP5.Mh().getContext();
    }

    public static final Context LIZIZ(InterfaceC1010530cP5<? extends InterfaceC1000860c9U> interfaceC1010530cP5) {
        Context context = interfaceC1010530cP5.Mh().getContext();
        if (context != null) {
            return context;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
