package X;

import java.security.SecureRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BW9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BW9 extends C09AY implements Function0<Boolean> {
    public C0BW9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(new SecureRandom().nextInt(10) < 1);
    }
}
