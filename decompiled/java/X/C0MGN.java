package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.aiself.MobModuleImpl;

/* JADX INFO: renamed from: X.0MGN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MGN implements InterfaceC608270NtR<Object, Boolean> {
    public final /* synthetic */ MobModuleImpl LL;

    public C0MGN(MobModuleImpl mobModuleImpl) {
        this.LL = mobModuleImpl;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        Bundle bundle = this.LL.LIZIZ;
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("is_main_cover", false);
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Bundle bundle = this.LL.LIZIZ;
        if (bundle != null) {
            bundle.putBoolean("is_main_cover", zBooleanValue);
        }
    }
}
