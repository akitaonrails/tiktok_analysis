package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210980hcO extends C09AY implements Function1<C1210990hcP, Boolean> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1210980hcO(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C1210990hcP c1210990hcP) {
        String str;
        C1210990hcP c1210990hcP2 = c1210990hcP;
        if (c1210990hcP2 != null) {
            str = c1210990hcP2.LIZ;
        } else {
            str = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, this.LL));
    }
}
