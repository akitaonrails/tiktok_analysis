package X;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Vgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804340Vgu extends C09AY implements Function0<String> {
    public C804340Vgu() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
