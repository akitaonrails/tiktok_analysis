package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092160eWk extends C09AY implements Function1<C1092100eWe, Boolean> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092160eWk(long j) {
        super(1);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C1092100eWe c1092100eWe) {
        boolean z;
        if (c1092100eWe.LIZ == this.LL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
