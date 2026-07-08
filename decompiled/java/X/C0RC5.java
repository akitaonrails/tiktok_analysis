package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RC5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RC5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC691660RBc LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RC5(InterfaceC691660RBc interfaceC691660RBc, int i, Aweme aweme) {
        super(0);
        this.LL = interfaceC691660RBc;
        this.LLILLJJLI = i;
        this.LLILLL = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.J1(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
