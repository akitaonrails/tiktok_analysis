package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0uQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703360uQY {
    public static final C1703360uQY LIZ = new C1703360uQY();
    public static final ConcurrentHashMap<String, AbstractC1703340uQW<? extends C1238730iL9>> LIZIZ = new ConcurrentHashMap<>();

    public static AbstractC1703340uQW LIZ(final String str) throws Exception {
        AbstractC1703340uQW<? extends C1238730iL9> abstractC1703340uQW = LIZIZ.get(str);
        if (abstractC1703340uQW != null) {
            return abstractC1703340uQW;
        }
        throw new Exception(str) { // from class: X.0Dm1
            /* JADX WARN: Illegal instructions before constructor call */
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Scene [");
                sbLIZ.append(str);
                sbLIZ.append("] is not registered.");
                super(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }
}
