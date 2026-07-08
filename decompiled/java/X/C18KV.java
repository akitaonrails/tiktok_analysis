package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18KV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18KV extends C09AY implements Function0<Keva> {
    public C18KV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("fcp_metric_cache");
    }
}
