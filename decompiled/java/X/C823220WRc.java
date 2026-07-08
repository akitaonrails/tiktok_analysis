package X;

import com.bytedance.pns.engine.RuleEngineService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823220WRc extends C09AY implements Function0<Object> {
    public C823220WRc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(!RuleEngineService.isActivated());
    }
}
