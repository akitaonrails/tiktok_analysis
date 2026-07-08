package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.17oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21145417oy {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Activity LIZ(Context context) {
        Context baseContext;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof InterfaceC21145517oz) {
            return ((InterfaceC21145517oz) context).getActivity();
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == null) {
            return null;
        }
        return LIZ(baseContext);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    public static final <E> E LIZIZ(Iterable<? extends E> iterable, Function1<? super E, Boolean> function1) {
        Iterator<? extends E> it2 = iterable.iterator();
        while (it2.hasNext()) {
            E next = it2.next();
            if (function1.invoke(next).booleanValue()) {
                it2.remove();
                return next;
            }
        }
        return null;
    }

    public static final void LIZLLL(InterfaceC21144717or interfaceC21144717or, C21145317ox c21145317ox) {
        c21145317ox.invoke(interfaceC21144717or);
        List<InterfaceC21144717or> listLIZ = interfaceC21144717or.LIZ();
        if (listLIZ != null) {
            Iterator<InterfaceC21144717or> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                LIZLLL(it2.next(), c21145317ox);
            }
        }
    }

    public static final <E> void LIZJ(Iterable<? extends E> iterable, Function1<? super E, Boolean> function1, Function1<? super E, Unit> function12) {
        Iterator<? extends E> it2 = iterable.iterator();
        while (it2.hasNext()) {
            E next = it2.next();
            if (function1.invoke(next).booleanValue()) {
                it2.remove();
                function12.invoke(next);
            }
        }
    }
}
