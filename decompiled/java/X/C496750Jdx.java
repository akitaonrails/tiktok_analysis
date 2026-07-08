package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496750Jdx extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C496700Jds LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496750Jdx(C496700Jds c496700Jds) {
        super(0);
        this.LL = c496700Jds;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(Intrinsics.LJFF(this.LL.LJFF, "third_party_service"));
    }
}
