package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.017l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2823017l extends C09AY implements Function0<List<? extends Integer>> {
    public C2823017l() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List<? extends java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Integer> invoke() {
        ?? r2;
        ArrayList arrayList;
        List listLJJLIIIJILLIZJL;
        try {
            String string = AnchorListManager.LIZLLL.getString("anchor_types_key", null);
            if (string == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6)) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
                }
            }
            C189200o6.m2constructorimpl(arrayList);
            r2 = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            r2 = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(r2)) {
            return null;
        }
        return r2;
    }
}
