package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18AC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18AC extends C09AY implements Function0<Object> {
    public C18AC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return GsonProtectorUtils.toJson(C18CS.LIZ(), C18CS.LIZ);
    }
}
