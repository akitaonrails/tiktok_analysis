package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpComponentTracker;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageInfo;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageStack;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS213S0300000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18KG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18KG {
    public static final C18KG LIZ = new C18KG();
    public static C18KB LIZIZ;
    public static C18KR LIZJ;

    public final synchronized C18KR LIZJ() {
        C18KR fcpPageStack;
        fcpPageStack = LIZJ;
        if (fcpPageStack == null) {
            fcpPageStack = new FcpPageStack();
            LIZJ = fcpPageStack;
        }
        return fcpPageStack;
    }

    public final Pair<Integer, FcpPageNode> LIZLLL(Function1<? super FcpPageNode, Boolean> function1) {
        C118300cf c118300cf = new C118300cf();
        C259800zU c259800zU = new C259800zU();
        LIZJ().doLoop(new AwS213S0300000_4(c118300cf, (C118300cf) function1, (Function1<? super FcpPageNode, Boolean>) c259800zU, (C259800zU<FcpPageNode>) 21));
        T t = c259800zU.element;
        if (t == 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(c118300cf.element), t);
    }

    public static void LIZIZ(FcpPageNode fcpPageNode, String str) {
        FcpComponentTracker tracker = fcpPageNode.getTracker();
        if (tracker != null) {
            tracker.stop(str);
        }
        FcpComponentTracker tracker2 = fcpPageNode.getTracker();
        if (tracker2 != null) {
            tracker2.report(LIZIZ);
        }
    }

    public final void LIZ(Function1<? super FcpPageNode, Boolean> function1, Function1<? super FcpPageNode, Unit> function12, FcpPageInfo fcpPageInfo, boolean z) {
        String str;
        C18KG c18kg;
        FcpComponentTracker tracker;
        Pair<Integer, FcpPageNode> pairLIZLLL = LIZLLL(function1);
        if (pairLIZLLL == null) {
            return;
        }
        int iIntValue = pairLIZLLL.getFirst().intValue();
        FcpPageNode second = pairLIZLLL.getSecond();
        if (z && !second.getInfo().getWillEndRecordManually()) {
            return;
        }
        if (function12 != null) {
            function12.invoke(second);
        }
        if (fcpPageInfo != null && !second.isUniqueIdEqual(fcpPageInfo)) {
            str = "jump_tab";
        } else {
            str = "back_to_feed";
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            c18kg = LIZ;
            if (i >= iIntValue) {
                break;
            }
            FcpPageNode fcpPageNodePop = LIZJ().pop();
            if (fcpPageNodePop != null) {
                if (!fcpPageNodePop.getInfo().getWillEndRecordManually()) {
                    if (z && (tracker = fcpPageNodePop.getTracker()) != null && Intrinsics.LJFF(tracker.getState(), "Record")) {
                        tracker.pause();
                    }
                    LIZIZ(fcpPageNodePop, str);
                } else if (z && function1.invoke(fcpPageNodePop).booleanValue()) {
                    FcpComponentTracker tracker2 = fcpPageNodePop.getTracker();
                    if (tracker2 != null && Intrinsics.LJFF(tracker2.getState(), "Record")) {
                        tracker2.pause();
                    }
                    LIZIZ(fcpPageNodePop, str);
                } else {
                    ListProtector.add(arrayList, 0, fcpPageNodePop);
                }
            }
            i++;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c18kg.LIZJ().push((FcpPageNode) it2.next());
        }
    }
}
