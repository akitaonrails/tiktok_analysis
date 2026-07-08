package X;

import android.content.Context;
import android.view.View;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823040xXa extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C1822990xXV LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823040xXa(C1822990xXV c1822990xXV, String str) {
        super(1);
        this.LL = c1822990xXV;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.LLILLL.LIZLLL("phone");
        C1749450vct c1749450vct = C1749450vct.LIZ;
        Context context = this.LL.itemView.getContext();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("phone_number", this.LLILLJJLI));
        EnumC1749470vcv enumC1749470vcv = EnumC1749470vcv.DEFAULT;
        Map mapLJ = C2097608Jq.LJ();
        c1749450vct.getClass();
        C1749450vct.LJFF(context, mapLJIIJ, enumC1749470vcv, mapLJ);
        return Unit.LIZ;
    }
}
