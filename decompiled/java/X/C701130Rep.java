package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701130Rep extends C09AY implements Function1<C701030Ref, Boolean> {
    public final /* synthetic */ C700970ReZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701130Rep(C700970ReZ c700970ReZ) {
        super(1);
        this.LL = c700970ReZ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C701030Ref c701030Ref) {
        C0RZK c0rzk;
        C701030Ref c701030Ref2 = c701030Ref;
        String key = null;
        if ((c701030Ref2 instanceof C0RZK) && (c0rzk = (C0RZK) c701030Ref2) != null) {
            key = c0rzk.getKey();
        }
        return Boolean.valueOf(Intrinsics.LJFF(key, this.LL.LIZJ));
    }
}
