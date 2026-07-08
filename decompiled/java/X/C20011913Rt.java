package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20011913Rt extends C09AY implements Function1<C13S7, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C20008813Qo LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function2<Integer, Long, Unit> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20011913Rt(String str, C20008713Qn c20008713Qn, String str2, long j, Function2 function2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c20008713Qn;
        this.LLILLL = str2;
        this.LLILZ = j;
        this.LLILZIL = function2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C13S7 c13s7) throws C13NG {
        C20012513Rz c20012513Rz;
        C13S7 c13s72 = c13s7;
        C20012413Ry.LJIILIIL(this.LL, this.LLILLJJLI);
        C13SB.LJIJJ(this.LL, this.LLILLL);
        List listLJIILL = C13SB.LJIILL(this.LLILLL);
        if (listLJIILL != null && (!listLJIILL.isEmpty()) && (c20012513Rz = (C20012513Rz) ListProtector.get(listLJIILL, 0)) != null) {
            String str = this.LL;
            String str2 = this.LLILLL;
            long j = this.LLILZ;
            Function2<Integer, Long, Unit> function2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            String str4 = this.LLIZ;
            C20008813Qo c20008813QoLJIIJJI = C13SB.LJIIJJI(c20012513Rz.LIZIZ);
            if (c20008813QoLJIIJJI != null) {
                String strLIZJ = C20012413Ry.LIZJ(c20008813QoLJIIJJI, c13s72, j, function2);
                if (!Intrinsics.LJFF(strLIZJ, str3)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("write: ");
                    sbLIZ.append(str4);
                    sbLIZ.append(" md5 not match! expected md: ");
                    sbLIZ.append(str3);
                    sbLIZ.append(", actual md5: ");
                    sbLIZ.append(strLIZJ);
                    throw new C13NG(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            C13SB.LJIIZILJ(str);
            C13SB.LJIIZILJ(str2);
        }
        return Unit.LIZ;
    }
}
