package X;

import com.bytedance.pumbaa.app2app.SandboxApp2AppConfigData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825720WaI extends C09AY implements Function0<String> {
    public final /* synthetic */ SandboxApp2AppConfigData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825720WaI(SandboxApp2AppConfigData sandboxApp2AppConfigData) {
        super(0);
        this.LL = sandboxApp2AppConfigData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init success, config:");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
