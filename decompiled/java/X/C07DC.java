package X;

import java.security.SecureRandom;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07DC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07DC extends C09AY implements Function0<Float> {
    public C07DC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(new SecureRandom().nextFloat());
    }
}
