package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20012013Ru extends C09AY implements Function1<C13S7, Unit> {
    public final /* synthetic */ C20008813Qo LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function2<Integer, Long, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20012013Ru(C20008813Qo c20008813Qo, long j, Function2<? super Integer, ? super Long, Unit> function2, String str, String str2) {
        super(1);
        this.LL = c20008813Qo;
        this.LLILLJJLI = j;
        this.LLILLL = function2;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C13S7 c13s7) throws C13NG {
        String strLIZJ = C20012413Ry.LIZJ(this.LL, c13s7, this.LLILLJJLI, this.LLILLL);
        if (Intrinsics.LJFF(strLIZJ, this.LLILZ)) {
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("write: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" md5 not match! expected md: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", actual md5: ");
        sbLIZ.append(strLIZJ);
        throw new C13NG(C2188811AlT.LIZIZ(sbLIZ));
    }
}
