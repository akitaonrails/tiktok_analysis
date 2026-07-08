package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1454505mh extends C2217421BqW implements Function0<Long> {
    public static final C1454505mh LL = new C1454505mh();

    public C1454505mh() {
        super(0, C065A.class, "nowMs", "nowMs()J", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
