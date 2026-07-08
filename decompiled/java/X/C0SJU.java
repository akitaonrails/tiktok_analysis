package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SJU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SJU extends C09AY implements Function1<C0SJL<C719000SIg>, C0SJL<C719000SIg>> {
    public final /* synthetic */ List<C0SJV> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0SJU(List<? extends C0SJV> list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SJL<C719000SIg> invoke(C0SJL<C719000SIg> c0sjl) {
        TextExtraStruct textExtraStruct;
        Integer numValueOf;
        C0SJL<C719000SIg> c0sjl2 = c0sjl;
        List<C0SJV> list = this.LL;
        C719000SIg c719000SIg = c0sjl2.LLIZ;
        Integer numValueOf2 = null;
        if (c719000SIg != null) {
            textExtraStruct = c719000SIg.LIZ;
        } else {
            textExtraStruct = null;
        }
        Iterator<C0SJV> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0SJV next = it2.next();
            if (next.LIZIZ(c0sjl2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('<');
                sbLIZ.append(c0sjl2.LIZLLL());
                sbLIZ.append("> match success -> ");
                sbLIZ.append(next);
                sbLIZ.append(", ");
                if (textExtraStruct != null) {
                    numValueOf = Integer.valueOf(textExtraStruct.getStart());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", type:");
                if (textExtraStruct != null) {
                    numValueOf2 = Integer.valueOf(textExtraStruct.getType());
                }
                sbLIZ.append(numValueOf2);
                C719300SJk.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                next.LIZ(c0sjl2);
            }
        }
        return c0sjl2;
    }
}
