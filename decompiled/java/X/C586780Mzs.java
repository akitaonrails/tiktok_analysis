package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586780Mzs extends C09AY implements Function1<Pair<? extends String, ? extends String>, Boolean> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C586780Mzs(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends String, ? extends String> pair) {
        return Boolean.valueOf(Intrinsics.LJFF(pair.getFirst(), this.LL));
    }
}
