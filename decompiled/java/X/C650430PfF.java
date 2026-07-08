package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650430PfF {
    public final Function1<C654820PmK, Unit> LIZ;

    public final HashMap<String, String> LIZ() {
        C654820PmK c654820PmK = new C654820PmK();
        this.LIZ.invoke(c654820PmK);
        C07XJ c07xj = new C07XJ();
        c654820PmK.LIZIZ.invoke(c07xj);
        HashMap<String, String> map = new HashMap<>();
        map.putAll(c654820PmK.LIZ);
        map.putAll(c07xj.LIZ);
        return map;
    }

    public final HashMap<String, String> LIZIZ() {
        C654820PmK c654820PmK = new C654820PmK();
        this.LIZ.invoke(c654820PmK);
        HashMap<String, String> map = new HashMap<>();
        map.putAll(c654820PmK.LIZ);
        return map;
    }

    public final HashMap<String, String> LIZJ() {
        C654820PmK c654820PmK = new C654820PmK();
        this.LIZ.invoke(c654820PmK);
        C07XJ c07xj = new C07XJ();
        c654820PmK.LIZLLL.invoke(c07xj);
        HashMap<String, String> map = new HashMap<>();
        map.putAll(c654820PmK.LIZ);
        map.putAll(c07xj.LIZ);
        return map;
    }

    public final HashMap<String, String> LIZLLL() {
        C654820PmK c654820PmK = new C654820PmK();
        this.LIZ.invoke(c654820PmK);
        C07XJ c07xj = new C07XJ();
        c654820PmK.LIZJ.invoke(c07xj);
        HashMap<String, String> map = new HashMap<>();
        map.putAll(c654820PmK.LIZ);
        map.putAll(c07xj.LIZ);
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C650430PfF(Function1<? super C654820PmK, Unit> function1) {
        this.LIZ = function1;
    }
}
