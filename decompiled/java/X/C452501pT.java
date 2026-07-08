package X;

import kotlin.SafePublicationLazyImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01pT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C452501pT {
    public static final <T> C01GW<T> LIZIZ(Function0<? extends T> function0) {
        return new C1333190knV(function0, null, 2, null);
    }

    public static final <T> C01GW<T> LIZ(EnumC452301pR enumC452301pR, Function0<? extends T> function0) {
        int i = C452401pS.LIZ[enumC452301pR.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C1333200knW(function0);
                }
                throw new C1954807lC();
            }
            return new SafePublicationLazyImpl(function0);
        }
        return new C1333190knV(function0, null, 2, null);
    }
}
