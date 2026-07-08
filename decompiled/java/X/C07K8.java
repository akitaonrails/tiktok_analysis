package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07K8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07K8 extends C09AY implements Function0<Boolean> {
    public C07K8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Object obj = ((Map) C07K9.LIZIZ.getValue()).get("key_item_strict_mode");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        return Boolean.valueOf(!Intrinsics.LJFF(obj, Boolean.FALSE));
    }
}
