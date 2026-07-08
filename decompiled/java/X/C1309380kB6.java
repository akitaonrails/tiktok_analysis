package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kB6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309380kB6 extends C09AY implements Function0<Boolean> {
    public C1309380kB6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Object obj = C1309360kB4.LIZ().get("key_disable_init");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(obj, Boolean.TRUE));
    }
}
