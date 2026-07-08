package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.BottomSubscribeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KGY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGY extends C09AY implements Function1<C0KIP, Unit> {
    public final /* synthetic */ BottomSubscribeComponent LL;
    public final /* synthetic */ C259800zU<Function0<Unit>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KGY(BottomSubscribeComponent bottomSubscribeComponent, C259800zU<Function0<Unit>> c259800zU) {
        super(1);
        this.LL = bottomSubscribeComponent;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0KIP c0kip) {
        Function0<Unit> function0;
        C0KCF c0kcfLIZ;
        Function0<Unit> function02;
        if (c0kip.LIZJ == 1) {
            C513680KCo c513680KCoHp = this.LL.hp();
            Boolean boolValueOf = null;
            if (c513680KCoHp != null) {
                c0kcfLIZ = c513680KCoHp.LIZ();
            } else {
                c0kcfLIZ = null;
            }
            C513700KCq c513700KCqIp = this.LL.ip();
            if (c513700KCqIp != null) {
                boolValueOf = Boolean.valueOf(c513700KCqIp.LLIZ);
            }
            C0KCA.LIZLLL(c0kcfLIZ, boolValueOf, this.LL.getContext());
            C513700KCq c513700KCqIp2 = this.LL.ip();
            if (c513700KCqIp2 != null && (function02 = c513700KCqIp2.LLJILLL) != null) {
                function02.invoke();
            }
        }
        C513700KCq c513700KCqIp3 = this.LL.ip();
        if (c513700KCqIp3 != null && c513700KCqIp3.LLJILJILJ && (function0 = this.LLILLJJLI.element) != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
