package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06YY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06YY extends C09AY implements Function1<C197039127h, Unit> {
    public C06YY() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C197039127h c197039127h) {
        C197039127h c197039127h2 = c197039127h;
        int iIntValue = 0;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eyv, C1385040m98.LIZ(c197039127h2.getContext(), false));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        c197039127h2.setTextColor(iIntValue);
        return Unit.LIZ;
    }
}
