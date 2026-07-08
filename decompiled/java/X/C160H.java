package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.160H, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C160H extends C2217421BqW implements Function1<Boolean, Unit> {
    public C160H(Object obj) {
        super(1, obj, CLACaptionAssemV2.class, "onIsHolderInViewChangedAfterScrolling", "onIsHolderInViewChangedAfterScrolling(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((CLACaptionAssemV2) this.receiver).Bp().cL2(bool.booleanValue());
        return Unit.LIZ;
    }
}
