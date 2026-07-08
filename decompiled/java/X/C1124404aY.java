package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04aY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1124404aY extends C09AY implements Function1<Object, Long> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124404aY(long j) {
        super(1);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(Object obj) {
        return Long.valueOf(this.LL);
    }
}
