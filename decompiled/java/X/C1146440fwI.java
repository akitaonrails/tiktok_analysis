package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: renamed from: X.0fwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146440fwI {
    public static final C1146350fw9 LIZIZ(C1146430fwH c1146430fwH) {
        return LIZ(c1146430fwH, AFwS254S0000000_17.get$arr$(55));
    }

    public static final C1146350fw9 LIZ(C1146430fwH c1146430fwH, Function1<? super C1146350fw9, Boolean> function1) {
        C1146350fw9 next;
        InterfaceC1665500tRU<C1146350fw9> interfaceC1665500tRU;
        C1146350fw9 next2;
        C1146360fwA c1146360fwA = c1146430fwH.LIZ;
        if (c1146360fwA != null && (interfaceC1665500tRU = c1146360fwA.LLILZLL) != null) {
            Iterator<C1146350fw9> it2 = interfaceC1665500tRU.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (function1.invoke(next2).booleanValue()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C1146350fw9 c1146350fw9 = next2;
            if (c1146350fw9 != null) {
                return c1146350fw9;
            }
        }
        Iterator<C1146350fw9> it3 = c1146430fwH.LIZIZ.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (function1.invoke(next).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1146350fw9 c1146350fw92 = next;
        if (c1146350fw92 == null) {
            return null;
        }
        return c1146350fw92;
    }
}
