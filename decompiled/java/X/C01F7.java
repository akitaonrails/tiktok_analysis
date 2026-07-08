package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01F7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01F7 extends C09AY implements Function1<User, Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C01IS LLILLJJLI;
    public final /* synthetic */ C259800zU<User> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01F7(C238400w2 c238400w2, C01IS c01is, C259800zU<User> c259800zU) {
        super(1);
        this.LL = c238400w2;
        this.LLILLJJLI = c01is;
        this.LLILLL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(User user) {
        if (this.LL.element > 0) {
            this.LLILLJJLI.LJFF = this.LLILLL.element;
        } else {
            this.LLILLJJLI.LJFF = null;
        }
        return Unit.LIZ;
    }
}
