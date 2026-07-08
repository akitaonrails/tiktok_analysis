package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aUV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937010aUV extends C09AY implements Function1<C935490aS3, Unit> {
    public final /* synthetic */ C937020aUW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C937010aUV(C937020aUW c937020aUW) {
        super(1);
        this.LL = c937020aUW;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C935490aS3 c935490aS3) {
        C935490aS3 c935490aS32 = c935490aS3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive ToolsTypeStateUpdateEvent value:");
        sbLIZ.append(c935490aS32);
        C20441214yg.LIZIZ("PlaybookPolymerizationHeaderTopViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        int i = C937000aUU.LIZ[c935490aS32.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && !C986270blx.LIZ()) {
                            C937020aUW.S5(this.LL.LLJJJJLIIL, c935490aS32.LIZIZ);
                        }
                    } else {
                        C937020aUW.S5(this.LL.LLJJIII, c935490aS32.LIZIZ);
                    }
                } else {
                    C937020aUW.S5(this.LL.LLJILJIL, c935490aS32.LIZIZ);
                }
            } else {
                C937020aUW.S5(this.LL.LLJJJ, c935490aS32.LIZIZ);
            }
        } else {
            C937020aUW.S5(this.LL.LLIZ, c935490aS32.LIZIZ);
        }
        return Unit.LIZ;
    }
}
