package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20292514ah extends C09AY implements Function1<Long, Boolean> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20292514ah(long j) {
        super(1);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Long l) {
        boolean z;
        if (l.longValue() < this.LL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
