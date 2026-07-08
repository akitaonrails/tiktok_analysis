package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08L2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08L2 {
    public static final List<C08L3> LIZ = C1697810uHb.LJIIJJI(new C08L3("ViewRootImpl.relayoutWindow", "render_relayout"), new C08L3("Choreographer.doFrame", "render"), new C08L3("ViewRootImpl.performTraversals", "render"), new C08L3("PaintingContext.executeFuture", "lynx_painting"), new C08L3("PaintingContext.", "lynx_painting"), new C08L3("LynxEngineProxy.sendCustomEvent", "lynx_event"), new C08L3("LynxEventEmitter.sendCustomEvent", "lynx_event"), new C08L3("UIListAdapter.onBindViewHolder", "lynx_rv_bind"), new C08L3("FSPTracer", "fsp_tracer"));
    public static final List<C08L3> LIZIZ = C1697810uHb.LJIIJJI(new C08L3("Choreographer$FrameDisplayEventReceiver", "choreographer"), new C08L3("SmartHandlerScheduler$ScheduledRunnable", "assem"), new C08L3("DispatchedContinuation", "coroutine"), new C08L3("LynxEngineProxy$", "lynx_event"), new C08L3("LynxEventEmitter$", "lynx_event"), new C08L3("SubscriberFrameAggregator", "image_frame"), new C08L3("SimplifyPlayerImpl", "player"));
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"render", "render_relayout", "lynx_painting", "lynx_event", "lynx_rv_bind", "rv_bind", "fsp_tracer"});
    public static final Set<String> LIZLLL = C13LQ.LJLIIL(new String[]{"choreographer", "assem", "coroutine", "lynx_event", "image_frame", "player"});

    public static String LIZ(String str) {
        boolean z;
        String string;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "unknown";
        }
        int iLJJIZ = a0.LJJIZ(str, '}', 0, false, 6);
        if (iLJJIZ >= 0) {
            String string2 = a0.LJLJJL(str.substring(iLJJIZ + 1)).toString();
            int iLJJJJ = a0.LJJJJ(string2, ':', 0, 6);
            if (iLJJJJ > 0) {
                string = a0.LJLIIIL(string2.substring(0, iLJJJJ)).toString();
            } else {
                string = a0.LJLIIIL(string2).toString();
            }
            if (!Intrinsics.LJFF(string, "null") && string.length() != 0) {
                str = a0.LJJLL('@', string, string);
            } else {
                str = "";
            }
        }
        for (C08L3 c08l3 : LIZIZ) {
            if (a0.LJJIIZI(str, c08l3.LIZ, false)) {
                return c08l3.LIZIZ;
            }
        }
        String strLJJLJ = a0.LJJLJ('.', str, str);
        String strLJJLL = a0.LJJLL('$', strLJJLJ, strLJJLJ);
        String strLJJLL2 = a0.LJJLL('@', strLJJLL, strLJJLL);
        if (strLJJLL2.length() <= 2) {
            return "unknown";
        }
        return strLJJLL2;
    }

    public static String LIZIZ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "unknown";
        }
        List<String> listLJJII = C09RB.LJJII(C09RB.LJJI(C09RB.LJIIIZ(new C08LY(new C1939607ik(a0.LJJJJIZL(str)), AFwS231S0000000_3.get$arr$(182)), AFwS231S0000000_3.get$arr$(183)), 8));
        for (String str2 : listLJJII) {
            for (C08L3 c08l3 : LIZ) {
                if (a0.LJJIIZI(str2, c08l3.LIZ, false)) {
                    return c08l3.LIZIZ;
                }
            }
        }
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"android.os.", "android.view.", "android.app.", "android.widget.", "androidx.", "androidx.appcompat.", "java.lang.", "java.util.", "sun.util.", "kotlin.", "kotlinx.", "com.bytedance.", "com.ss.android.", "com.google."});
        Iterator it2 = listLJJII.iterator();
        while (it2.hasNext()) {
            String strLJJJJZ = a0.LJJJJZ("at ", (String) it2.next());
            String string = a0.LJLIIIL(a0.LJJLL('(', strLJJJJZ, strLJJJJZ)).toString();
            if (!(setLJLIIL instanceof Collection) || !setLJLIIL.isEmpty()) {
                Iterator it3 = setLJLIIL.iterator();
                while (it3.hasNext()) {
                    if (u.LJJIIJZLJL(string, (String) it3.next(), false)) {
                        break;
                    }
                }
            }
            String strLJJLL = a0.LJJLL('.', string, string);
            if (strLJJLL.length() > 2) {
                return strLJJLL;
            }
        }
        return "unknown";
    }

    public static String LIZLLL(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        return a0.LJLIIIL(new Regex("\\s+").replace(new Regex("@[0-9a-fA-F]+").replace(new Regex("\\{[0-9a-fA-F]+\\}").replace(str, ""), ""), " ")).toString();
    }

    public static boolean LIZJ(String str, String str2) {
        if (LIZJ.contains(str) && LIZLLL.contains(str2)) {
            return true;
        }
        return false;
    }
}
