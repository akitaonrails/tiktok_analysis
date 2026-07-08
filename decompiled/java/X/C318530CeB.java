package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0CeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C318530CeB {
    public static final String LIZ(String str, Effect effect, Pair<String, ? extends Object>... pairArr) {
        String name;
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('(');
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("effect = ");
        if (effect != null) {
            name = effect.getName();
        } else {
            name = null;
        }
        sbLIZ2.append(name);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        sb.append('\n');
        for (Pair<String, ? extends Object> pair : pairArr) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(pair.getFirst());
            sbLIZ3.append(" = ");
            sbLIZ3.append(pair.getSecond());
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            sb.append('\n');
        }
        sb.append(")\n");
        return sb.toString();
    }
}
