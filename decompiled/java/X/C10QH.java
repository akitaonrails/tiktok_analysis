package X;

import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import com.ss.android.ugc.aweme.configuration.models.NUAbilityNode;
import com.ss.android.ugc.aweme.configuration.models.NUJTasks;
import defpackage.g9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.10QH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10QH {
    public final g9 LIZ;
    public final Map<String, List<C10QL>> LIZIZ = new LinkedHashMap(C2097608Jq.LJ());

    public C10QH(g9 g9Var) {
        this.LIZ = g9Var;
        C10QG.LIZ.getClass();
        for (NUAbilityNode nUAbilityNode : ((NUJTasks) C10QG.LIZ(g9Var, false)).tasks) {
            for (String str : nUAbilityNode.triggers) {
                if (!this.LIZIZ.containsKey(str)) {
                    this.LIZIZ.put(str, new ArrayList(C13BV.INSTANCE));
                }
                List list = (List) ((LinkedHashMap) this.LIZIZ).get(str);
                if (list != null) {
                    Map<String, C10QP> map = C038600Bs.LIZ;
                    String str2 = nUAbilityNode.id;
                    Map<String, C10QP> map2 = C038600Bs.LIZ;
                    if (!map2.containsKey(str2)) {
                        C19240010Ow.LIZ.getClass();
                        C19240010Ow.LIZ(str2);
                    }
                    C10QP c10qp = (C10QP) ((LinkedHashMap) map2).get(str2);
                    List listLJLIL = C13LP.LJLIL(nUAbilityNode.filters, (c10qp == null ? new C10QP() { // from class: X.10QM
                        @Override // X.C10QP
                        public final void run() {
                        }

                        @Override // X.C10QP
                        public final List<FilterAbilityModel> LIZ() {
                            return C13BV.INSTANCE;
                        }
                    } : c10qp).LIZ());
                    String str3 = nUAbilityNode.id;
                    if (!map2.containsKey(str3)) {
                        C19240010Ow.LIZ.getClass();
                        C19240010Ow.LIZ(str3);
                    }
                    C10QP c10qp2 = (C10QP) ((LinkedHashMap) map2).get(str3);
                    list.add(new C10QL(listLJLIL, c10qp2 == null ? new C10QP() { // from class: X.10QM
                        @Override // X.C10QP
                        public final void run() {
                        }

                        @Override // X.C10QP
                        public final List<FilterAbilityModel> LIZ() {
                            return C13BV.INSTANCE;
                        }
                    } : c10qp2));
                }
            }
        }
    }
}
