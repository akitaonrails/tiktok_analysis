package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566070qr7 extends C09AY implements Function1<C1566060qr6, Unit> {
    public final /* synthetic */ C0RJN LL;
    public final /* synthetic */ Function1<C1566060qr6, Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1566070qr7(C0RJN c0rjn, Function1<? super C1566060qr6, Unit> function1, boolean z) {
        super(1);
        this.LL = c0rjn;
        this.LLILLJJLI = function1;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1566060qr6 c1566060qr6) {
        Lifecycle.State currentState;
        Lifecycle lifecycle;
        Lifecycle.State currentState2;
        Lifecycle lifecycle2;
        C1566060qr6 c1566060qr62 = c1566060qr6;
        if (c1566060qr62 == null) {
            String strValueOf = String.valueOf(this.LL.LJ);
            Fragment fragment = this.LL.LJ;
            if (fragment != null && (lifecycle2 = fragment.getLifecycle()) != null) {
                currentState2 = lifecycle2.getCurrentState();
            } else {
                currentState2 = null;
            }
            c1566060qr62 = new C1566060qr6(strValueOf, String.valueOf(currentState2));
            C0RJN c0rjn = this.LL;
            C1566110qrB<C1566060qr6> c1566110qrB = C1566090qr9.LIZIZ;
            C1566110qrB<Object> c1566110qrB2 = C1566090qr9.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("immutable_scene_");
            sbLIZ.append(c0rjn.LIZ);
            c1566110qrB.LIZJ(C2188811AlT.LIZIZ(sbLIZ), c1566060qr62);
        } else {
            c1566060qr62.LIZ = String.valueOf(this.LL.LJ);
            Fragment fragment2 = this.LL.LJ;
            if (fragment2 != null && (lifecycle = fragment2.getLifecycle()) != null) {
                currentState = lifecycle.getCurrentState();
            } else {
                currentState = null;
            }
            c1566060qr62.LIZIZ = String.valueOf(currentState);
            Function1<C1566060qr6, Unit> function1 = this.LLILLJJLI;
            if (function1 != null) {
                function1.invoke(c1566060qr62);
            }
        }
        if (this.LLILLL) {
            C1566110qrB<Object> c1566110qrB3 = C1566090qr9.LIZ;
            C1566080qr8.LIZJ(c1566060qr62.toString(), null);
        }
        return Unit.LIZ;
    }
}
