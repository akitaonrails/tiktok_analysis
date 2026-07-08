package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.005D, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005D extends C09AY implements Function1<PosIdentity, Boolean> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C005D(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PosIdentity posIdentity) {
        return Boolean.valueOf(Intrinsics.LJFF(posIdentity.value, this.LL));
    }
}
