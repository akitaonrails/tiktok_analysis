package X;

import com.lynx.tasm.LynxEnv;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q9C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538840q9C extends C09AY implements Function0<Object> {
    public C1538840q9C() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return LynxEnv.inst().getLynxVersion();
    }
}
