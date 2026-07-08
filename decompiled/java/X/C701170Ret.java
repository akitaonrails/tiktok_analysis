package X;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ret, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701170Ret extends C09AY implements Function1<C701030Ref, Unit> {
    public final /* synthetic */ Set<C700970ReZ> LL;
    public final /* synthetic */ Set<C700970ReZ> LLILLJJLI;
    public final /* synthetic */ Set<C700970ReZ> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701170Ret(Set<C700970ReZ> set, Set<C700970ReZ> set2, Set<C700970ReZ> set3) {
        super(1);
        this.LL = set;
        this.LLILLJJLI = set2;
        this.LLILLL = set3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C701030Ref c701030Ref) {
        C700970ReZ c700970ReZ;
        C701030Ref c701030Ref2 = c701030Ref;
        if ((c701030Ref2 instanceof C700970ReZ) && (c700970ReZ = (C700970ReZ) c701030Ref2) != null) {
            C700960ReY.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, c700970ReZ);
        }
        return Unit.LIZ;
    }
}
