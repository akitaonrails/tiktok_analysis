package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.0Oco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C623440Oco extends AbstractC1023090cjL {
    public static final C623440Oco LIZIZ;
    public static final Sequence<C623440Oco> LIZJ;

    static {
        C623440Oco c623440Oco = new C623440Oco();
        LIZIZ = c623440Oco;
        LIZJ = C13LQ.LJIIJJI(new C623440Oco[]{c623440Oco});
    }

    public C623440Oco() {
        super("feed");
    }

    @Override // X.AbstractC1023090cjL
    public final Sequence<C623440Oco> LIZJ() {
        return LIZJ;
    }

    @Override // X.AbstractC1023090cjL
    public final String LIZIZ(Map<String, Object> map) {
        Object obj = ((LinkedHashMap) map).get("value");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
