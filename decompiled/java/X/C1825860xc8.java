package X;

import android.content.Context;
import android.view.View;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825860xc8 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C1825800xc2 LL;
    public final /* synthetic */ C1825940xcG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825860xc8(C1825800xc2 c1825800xc2, C1825940xcG c1825940xcG) {
        super(1);
        this.LL = c1825800xc2;
        this.LLILLJJLI = c1825940xcG;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C1749450vct c1749450vct = C1749450vct.LIZ;
        Context context = this.LL.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("phone_number", this.LLILLJJLI.LIZ.LLILZIL));
        EnumC1749470vcv enumC1749470vcv = EnumC1749470vcv.DEFAULT;
        Map mapLJ = C2097608Jq.LJ();
        c1749450vct.getClass();
        C1749450vct.LJFF(context, mapLJIIJ, enumC1749470vcv, mapLJ);
        return Unit.LIZ;
    }
}
