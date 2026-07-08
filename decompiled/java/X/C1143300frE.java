package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0frE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143300frE extends AbstractC1143290frD {
    public static C1143300frE LIZIZ;
    public final AtomicReference<Pair<Long, JSONObject>> LIZ = new AtomicReference<>();

    public static synchronized C1143300frE LJIIJJI() {
        if (LIZIZ == null) {
            LIZIZ = new C1143300frE();
        }
        return LIZIZ;
    }
}
