package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CXO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXO extends C09AY implements Function0<Keva> {
    public C0CXO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("tab_fcp_config_v2");
    }
}
