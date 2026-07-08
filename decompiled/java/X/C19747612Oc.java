package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12Oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19747612Oc extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19747612Oc(long j) {
        super(0);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL > 0);
    }
}
