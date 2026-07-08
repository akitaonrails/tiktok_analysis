package X;

import java.security.SecureRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BWA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BWA extends C09AY implements Function0<Boolean> {
    public C0BWA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(new SecureRandom().nextInt(100) < 1);
    }
}
