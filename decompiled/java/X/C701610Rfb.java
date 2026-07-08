package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701610Rfb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C701360RfC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701610Rfb(C701360RfC c701360RfC) {
        super(0);
        this.LL = c701360RfC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C700730ReB c700730ReBLIZIZ;
        List<String> list;
        boolean z;
        C700730ReB c700730ReBLIZIZ2;
        C700730ReB c700730ReBLIZIZ3;
        C701860Rg0 c701860Rg0 = this.LL.LLJILJIL;
        List<String> list2 = null;
        List<String> list3 = (c701860Rg0 == null || (c700730ReBLIZIZ3 = c701860Rg0.LIZIZ()) == null) ? null : c700730ReBLIZIZ3.LJ;
        C701860Rg0 c701860Rg02 = this.LL.LLJILJIL;
        if (c701860Rg02 != null && (c700730ReBLIZIZ2 = c701860Rg02.LIZIZ()) != null) {
            list2 = c700730ReBLIZIZ2.LIZLLL;
        }
        C701860Rg0 c701860Rg03 = this.LL.LLJILJIL;
        if (c701860Rg03 != null && (c700730ReBLIZIZ = c701860Rg03.LIZIZ()) != null && (list = c700730ReBLIZIZ.LIZ) != null) {
            C701360RfC c701360RfC = this.LL;
            for (String str : list) {
                boolean z2 = true;
                if (list3 == null || !list3.contains(str)) {
                    z = false;
                    c701360RfC.LLILZ.LJ(str);
                    c701360RfC.LLILZ.LIZ(str, false);
                } else {
                    z = true;
                    c701360RfC.LLILZ.LIZJ(str);
                    c701360RfC.LLILZ.LIZ(str, true);
                }
                if (list2 == null || !list2.contains(str)) {
                    z2 = false;
                }
                c701360RfC.LJIIJJI(str, z2, z);
            }
        }
        return Unit.LIZ;
    }
}
