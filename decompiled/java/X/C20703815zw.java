package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20703815zw extends C09AY implements Function1<C20703415zs, Unit> {
    public final /* synthetic */ CLACaptionViewModelV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20703815zw(CLACaptionViewModelV2 cLACaptionViewModelV2) {
        super(1);
        this.LL = cLACaptionViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20703415zs c20703415zs) {
        this.LL.setState(new AwS610S0100000_31(c20703415zs, 121));
        return Unit.LIZ;
    }
}
