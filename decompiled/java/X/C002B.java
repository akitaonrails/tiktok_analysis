package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTest;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.002B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C002B {
    public static final Integer LIZ(BattleABTestList battleABTestList, int i) {
        BattleABTest next;
        List<BattleABTest> list = battleABTestList.abTestList;
        if (list == null) {
            return null;
        }
        Iterator<BattleABTest> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.abTestType == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BattleABTest battleABTest = next;
        if (battleABTest == null) {
            return null;
        }
        return Integer.valueOf(battleABTest.group);
    }
}
