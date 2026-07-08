package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698820Rb6 extends C09AY implements Function1<C698810Rb5, Unit> {
    public final /* synthetic */ C699060RbU LL;
    public final /* synthetic */ Function1<C698810Rb5, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C698820Rb6(C699060RbU c699060RbU, Function1<? super C698810Rb5, Unit> function1) {
        super(1);
        this.LL = c699060RbU;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C698810Rb5 c698810Rb5) {
        C698810Rb5 c698810Rb52 = c698810Rb5;
        C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
        C699060RbU c699060RbU = this.LL;
        Aweme aweme = c699060RbU.LLJILLL;
        String str = c699060RbU.LL;
        String str2 = c699060RbU.LLILLJJLI;
        c698800Rb4.getClass();
        C698800Rb4.LJFF(aweme, str, str2, c698810Rb52);
        Function1<C698810Rb5, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(c698810Rb52);
        }
        return Unit.LIZ;
    }
}
