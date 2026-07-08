package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: renamed from: X.0qlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562470qlJ {
    public static final C1562470qlJ LIZ = new C1562470qlJ();
    public static final List<Pair<AbstractC725500Sd2<?>, Function1<?, Unit>>> LIZIZ = new ArrayList();

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static void LIZ(C723430SZh c723430SZh, String str, Function1 function1) {
        C725430Scv.LIZJ(str, 1.0f, new AwS425S0200000_24(c723430SZh, str, function1, 75));
    }

    public static boolean LIZJ(AbstractC725510Sd3 abstractC725510Sd3, Float f, Function1 function1) {
        float fFloatValue;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = C1562530qlP.LIZ().coldStartTrackRate;
        }
        boolean zLJ = C725430Scv.LJ(abstractC725510Sd3, fFloatValue, function1);
        if (zLJ) {
            ((ArrayList) LIZIZ).add(new Pair(abstractC725510Sd3, function1));
        }
        return zLJ;
    }
}
