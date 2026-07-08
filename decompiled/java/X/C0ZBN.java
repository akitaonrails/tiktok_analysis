package X;

import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZBN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBN extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ C13IQ<? extends UISlotAssem> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C893950Z5d LLILLL;
    public final /* synthetic */ LinearLayout LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZBN(C13IQ<? extends UISlotAssem> c13iq, int i, C893950Z5d c893950Z5d, LinearLayout linearLayout) {
        super(1);
        this.LL = c13iq;
        this.LLILLJJLI = i;
        this.LLILLL = c893950Z5d;
        this.LLILZ = linearLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        c0sz52.LL = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("actionGroup ");
        sbLIZ.append(this.LLILLJJLI);
        c0sz52.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        c0sz52.LLJI = new AwS558S0100000_14(this.LLILZ, 1340);
        c0sz52.LLILZ = C2097608Jq.LJIIJ(new Pair("actionGroup", this.LLILLL));
        return Unit.LIZ;
    }
}
