package X;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605690rt1 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1605680rt0());
    public static String LIZIZ;

    static {
        HashMap mapLIZIZ = LIZIZ();
        EnumC1615506Uf enumC1615506Uf = EnumC1615506Uf.STORY;
        mapLIZIZ.put(enumC1615506Uf, new C1605720rt4(enumC1615506Uf));
        C0S78.LIZJ(AFwS213S0000000_24.get$arr$(677), true);
    }

    public static HashMap LIZIZ() {
        return (HashMap) LIZ.getValue();
    }

    public static void LIZ(final Function0 function0) {
        ((ExecutorService) C0T5S.LIZ.getValue()).execute(new Runnable() { // from class: X.0Bxj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SocialDistributeExecutorKt@af5.sam$java_lang_Runnable$0");
                try {
                    function0.invoke();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SocialDistributeExecutorKt@af5.sam$java_lang_Runnable$0");
            }
        });
    }

    public static int LIZJ(EnumC1615506Uf enumC1615506Uf, String str) {
        C727780Sgi c727780Sgi;
        Integer numValueOf;
        C1605720rt4 c1605720rt4 = (C1605720rt4) LIZIZ().get(enumC1615506Uf);
        if (c1605720rt4 != null) {
            if (str != null && (c727780Sgi = c1605720rt4.LIZJ().get(str)) != null && (numValueOf = Integer.valueOf(c727780Sgi.LIZ)) != null) {
                return numValueOf.intValue();
            }
            return -1;
        }
        return 0;
    }

    public static C727780Sgi LIZLLL(EnumC1615506Uf enumC1615506Uf, String str, C727780Sgi c727780Sgi, EnumC1605740rt6 enumC1605740rt6) {
        C727780Sgi c727780SgiLIZLLL;
        C1605720rt4 c1605720rt4 = (C1605720rt4) LIZIZ().get(enumC1615506Uf);
        if (c1605720rt4 == null || (c727780SgiLIZLLL = c1605720rt4.LIZLLL(str, c727780Sgi, enumC1605740rt6)) == null) {
            return new C727780Sgi(0, null, null, null, null, 63);
        }
        return c727780SgiLIZLLL;
    }
}
