package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CPN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CPN extends C09AY implements Function0<Keva> {
    public C0CPN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return KevaImpl.getRepo("live_setting_api_vesrion_ctr", 0);
    }
}
