package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.140V, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C140V extends C09AY implements Function0<Keva> {
    public C140V() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("c2pa_crash_recover_keva");
    }
}
