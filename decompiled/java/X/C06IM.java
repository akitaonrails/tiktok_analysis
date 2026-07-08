package X;

import com.ss.android.ugc.aweme.experiment.IndependentAppBubbleItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06IM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06IM {
    public static final C06IM LIZ = new C06IM();
    public static final IndependentAppBubbleItem[] LIZIZ = new IndependentAppBubbleItem[0];
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(298));

    public static IndependentAppBubbleItem LIZ() {
        return (IndependentAppBubbleItem) C13LP.LJJJLL((List) LIZJ.getValue());
    }

    public static boolean LIZJ() {
        return !((List) LIZJ.getValue()).isEmpty();
    }

    public static IndependentAppBubbleItem LIZIZ(String str) {
        String string;
        Object obj = null;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        Iterator it2 = ((List) LIZJ.getValue()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(a0.LJLIIIL(((IndependentAppBubbleItem) next).bubbleId).toString(), string)) {
                obj = next;
                break;
            }
        }
        return (IndependentAppBubbleItem) obj;
    }
}
