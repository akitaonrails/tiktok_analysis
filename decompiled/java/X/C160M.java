package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.160M, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160M extends C09AY implements Function1<C710840RuU, Unit> {
    public final /* synthetic */ CLACaptionViewModelV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160M(CLACaptionViewModelV2 cLACaptionViewModelV2) {
        super(1);
        this.LL = cLACaptionViewModelV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C710840RuU c710840RuU) {
        C710840RuU c710840RuU2 = c710840RuU;
        if (C295300Bho.LIZ() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LL.setStateImmediate(new C160L(c710840RuU2));
        } else {
            this.LL.setState(new AwS610S0100000_31(c710840RuU2, 120));
        }
        return Unit.LIZ;
    }
}
