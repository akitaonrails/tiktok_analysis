package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Oid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627050Oid {
    public static final void LIZ(C628830OlV c628830OlV, Function1<? super C627060Oie, Unit> function1) {
        C627060Oie c627060Oie = new C627060Oie();
        function1.invoke(c627060Oie);
        if (c627060Oie.LLJILJILJ.length() > 0) {
            c628830OlV.LLJILJIL.put(c627060Oie.LLJILJILJ, c627060Oie);
        } else {
            "vSlot should not be empty".toString();
            throw new IllegalStateException("vSlot should not be empty");
        }
    }
}
