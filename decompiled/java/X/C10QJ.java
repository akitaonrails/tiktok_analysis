package X;

import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import com.ss.android.ugc.aweme.configuration.models.NUAbilityNode;
import com.ss.android.ugc.aweme.configuration.models.NUJConfig;
import defpackage.g9;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10QJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10QJ {
    public final g9 LIZ;
    public final NUJConfig LIZIZ;

    public final String LIZ(String str) {
        List<NUAbilityNode> list;
        NUAbilityNode next;
        NUJConfig nUJConfig = this.LIZIZ;
        if (nUJConfig != null && (list = nUJConfig.config) != null) {
            Iterator<NUAbilityNode> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.id, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NUAbilityNode nUAbilityNode = next;
            if (nUAbilityNode != null) {
                FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                Pair pairLIZIZ = C10OM.LIZIZ(nUAbilityNode.filters);
                String str2 = (String) pairLIZIZ.getSecond();
                if (str2 == null) {
                    str2 = nUAbilityNode.fallbackResult;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getResultValueOfConfig config [");
                sbLIZ.append(this.LIZ.name());
                sbLIZ.append('-');
                sbLIZ.append(this.LIZ.getId());
                sbLIZ.append("] result is ");
                sbLIZ.append(str2);
                sbLIZ.append(", hit ");
                sbLIZ.append((String) pairLIZIZ.getFirst());
                C1911410zq7.LIZJ("ConfigStrategy", C2188811AlT.LIZIZ(sbLIZ));
                return str2;
            }
        }
        return null;
    }

    public C10QJ(g9 g9Var, boolean z) {
        NUJConfig nUJConfig;
        this.LIZ = g9Var;
        C10QG.LIZ.getClass();
        AbstractC1153390g7V abstractC1153390g7VLIZ = C10QG.LIZ(g9Var, z);
        if (abstractC1153390g7VLIZ instanceof NUJConfig) {
            nUJConfig = (NUJConfig) abstractC1153390g7VLIZ;
        } else {
            nUJConfig = null;
        }
        this.LIZIZ = nUJConfig;
    }
}
