package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.160N, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160N extends C09AY implements Function1<C160Z, Unit> {
    public final /* synthetic */ CLACaptionViewModelV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160N(CLACaptionViewModelV2 cLACaptionViewModelV2) {
        super(1);
        this.LL = cLACaptionViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C160Z c160z) {
        this.LL.setState(new C160O(c160z));
        return Unit.LIZ;
    }
}
