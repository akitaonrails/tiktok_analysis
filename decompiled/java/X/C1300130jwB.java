package X;

import com.lynx.tasm.LynxEnv;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300130jwB extends C09AY implements Function0<String> {
    public C1300130jwB() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return LynxEnv.inst().getLynxVersion();
    }
}
