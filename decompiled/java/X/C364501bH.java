package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01bH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C364501bH extends C09AY implements Function2<Boolean, C1533790q13, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C364501bH(String str, Function2<? super Boolean, ? super String, Unit> function2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, C1533790q13 c1533790q13) {
        String strLJL;
        boolean zBooleanValue = bool.booleanValue();
        String strLIZLLL = c1533790q13.LIZLLL();
        if (strLIZLLL != null && zBooleanValue && C1533950q1J.LJ(strLIZLLL)) {
            String str = this.LL;
            Function2<Boolean, String, Unit> function2 = this.LLILLJJLI;
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (str.length() > 0) {
                strLJL = a0.LJL(strLIZLLL, str, strLIZLLL);
            } else {
                strLJL = "";
            }
            String str2 = C364401bG.LIZIZ;
            if (str2 == null || str2.length() == 0) {
                C364401bG.LIZIZ = strLJL;
            }
            function2.invoke(Boolean.TRUE, strLJL);
        }
        return Unit.LIZ;
    }
}
