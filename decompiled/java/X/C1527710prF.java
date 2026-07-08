package X;

import com.bytedance.sync.v4.presistence.AppDatabaseV4;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0prF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527710prF extends C09AY implements Function0<AppDatabaseV4> {
    public final /* synthetic */ C1527670prB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527710prF(C1527670prB c1527670prB) {
        super(0);
        this.LL = c1527670prB;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0VMm, com.bytedance.sync.v4.presistence.AppDatabaseV4] */
    @Override // kotlin.jvm.functions.Function0
    public final AppDatabaseV4 invoke() {
        return C0OGG.LIZ(this.LL.LL, AppDatabaseV4.class, "bd_sync_sdk_v4.db").LIZIZ();
    }
}
