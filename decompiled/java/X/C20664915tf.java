package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20664915tf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C20671715ul LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20664915tf(C20671715ul c20671715ul, boolean z, String str) {
        super(0);
        this.LL = c20671715ul;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19290510dT.LIZ("InnerPushPopupWindow_Exit", "Exit onAnimationEnd");
        this.LL.dismiss();
        C20663715tT.LIZ.LJFF(this.LL.LLILLJJLI, this.LLILLJJLI, this.LLILLL);
        this.LL.LJJIZ(Lifecycle.State.DESTROYED);
        return Unit.LIZ;
    }
}
