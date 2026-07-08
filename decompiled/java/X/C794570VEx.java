package X;

import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794570VEx extends C09AY implements Function0<Boolean> {
    public C794570VEx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(KevaImpl.getRepo("keva_repo_native_network_monitor", 1).getBoolean("keva_key_native_network_monitor", true));
    }
}
