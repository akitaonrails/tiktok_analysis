package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07zK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2042407zK extends C09AY implements Function0<Unit> {
    public C2042407zK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!C2041907zF.LJFF) {
            C2041907zF.LJFF = true;
            Iterator it2 = ((LinkedHashMap) C2041907zF.LJ).entrySet().iterator();
            while (it2.hasNext()) {
                ((Runnable) ((Map.Entry) it2.next()).getValue()).run();
            }
            ((LinkedHashMap) C2041907zF.LJ).clear();
        }
        return Unit.LIZ;
    }
}
