package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RCX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0RCX extends C2217421BqW implements Function0<Long> {
    public static final C0RCX LL = new C0RCX();

    public C0RCX() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
