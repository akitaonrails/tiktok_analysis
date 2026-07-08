package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ziC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906500ziC extends C09AY implements Function1<List<C1906370zhz>, Unit> {
    public C1906500ziC() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<C1906370zhz> list) throws JSONException {
        for (C1906370zhz c1906370zhz : list) {
            long j = c1906370zhz.LJIIJ;
            if (j > 0) {
                C1906380zi0 c1906380zi0 = C1906380zi0.LIZ;
                String str = c1906370zhz.LIZ;
                c1906380zi0.getClass();
                C1906380zi0.LIZLLL(str, j, c1906370zhz, true);
            }
        }
        return Unit.LIZ;
    }
}
