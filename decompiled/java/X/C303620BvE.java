package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVInitializer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303620BvE extends C09AY implements Function0<InterfaceC2269341Ds4> {
    public C303620BvE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2269341Ds4 invoke() {
        IAVInitializer iAVInitializer;
        if (((Boolean) C0APF.LIZ.getValue()).booleanValue() && C303630BvF.LIZ == null && (iAVInitializer = (IAVInitializer) PluggableExtentionKt.pluggableSpi$default(IAVInitializer.class, false, false, false, 14, null)) != null) {
            iAVInitializer.initAVEnv(C1BWL.LIZ());
        }
        Function0<? extends InterfaceC2269341Ds4> function0 = C303630BvF.LIZ;
        if (function0 == null) {
            function0 = null;
        }
        return function0.invoke();
    }
}
