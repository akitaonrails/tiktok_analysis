package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0azW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956240azW {
    public static final C01GW<C956240azW> LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(458));
    public final ArrayList<List<Pair<String, String>>> LIZ = new ArrayList<>();

    public final synchronized void LIZ(List<Pair<String, String>> list) {
        if (C958370b2x.LIZIZ()) {
            if (this.LIZ.size() >= 20) {
                ListProtector.remove(this.LIZ, r1.size() - 1);
            }
            ListProtector.add(this.LIZ, 0, list);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addDebugStageData layoutData size = ");
            sbLIZ.append(this.LIZ.size());
            C20441214yg.LIZIZ("CoHostLayoutDebugDataManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
