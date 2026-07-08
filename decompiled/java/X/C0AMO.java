package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0AMO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0AMO extends C09AY implements Function0<Boolean> {
    public C0AMO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LJ("enable_default_view_scope_vprovider", 1) == 1);
    }
}
