package X;

import Y.ARunnableS15S0101000_4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122040fIw extends C09AY implements Function1<C1122050fIx, Unit> {
    public final /* synthetic */ C1121790fIX LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1122040fIw(C1121790fIX c1121790fIX, String str, String str2, Function1<? super Integer, Unit> function1) {
        super(1);
        this.LL = c1121790fIX;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1122050fIx c1122050fIx) {
        Integer numValueOf;
        C1122050fIx c1122050fIx2 = c1122050fIx;
        if (c1122050fIx2 != null) {
            Integer num = c1122050fIx2.LIZ;
            if (num != null) {
                C1121790fIX c1121790fIX = this.LL;
                Function1<Integer, Unit> function1 = this.LLILZ;
                int iIntValue = num.intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try showing bubble with description: ");
                sbLIZ.append(c1122050fIx2.LIZ);
                sbLIZ.append(", index: ");
                sbLIZ.append(c1122050fIx2.LIZIZ);
                C20441214yg.LIZIZ("ServicePlusTitleUnderstandingDelegate", C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.LJJZZIII(c1121790fIX.LIZIZ, new ARunnableS15S0101000_4(iIntValue, function1, 1));
            }
            numValueOf = Integer.valueOf(c1122050fIx2.LIZIZ);
        } else {
            numValueOf = null;
        }
        if (numValueOf == null) {
            C1121970fIp.LIZIZ(this.LL.LIZ, this.LLILLJJLI, this.LLILLL, 0, 0);
        } else {
            C1121970fIp.LIZIZ(this.LL.LIZ, this.LLILLJJLI, this.LLILLL, c1122050fIx2.LIZIZ, 0);
        }
        return Unit.LIZ;
    }
}
