package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RCV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0RCV extends C2217421BqW implements Function0<Long> {
    public static final C0RCV LL = new C0RCV();

    public C0RCV() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
