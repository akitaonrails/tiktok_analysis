package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sa0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1632340sa0 {
    public final void LIZ(Function1<? super String, Unit> function1, Function1<? super Effect, Unit> function12, Function1<? super Effect, Unit> function13, Function2<? super AbstractC1632340sa0, ? super ExceptionResult, Unit> function2) {
        if (!(this instanceof C1632440saA)) {
            if (this instanceof C1632430sa9) {
                function1.invoke(((C1632430sa9) this).LIZ);
                return;
            }
            if (this instanceof C1632410sa7) {
                function12.invoke(((C1632410sa7) this).LIZ);
                return;
            }
            if (this instanceof C1632420sa8) {
                function13.invoke(((C1632420sa8) this).LIZ);
            } else {
                if (this instanceof C1632400sa6) {
                    C1632400sa6 c1632400sa6 = (C1632400sa6) this;
                    function2.invoke(c1632400sa6.LIZ, c1632400sa6.LIZIZ);
                    return;
                }
                throw new C1954807lC();
            }
        }
    }
}
