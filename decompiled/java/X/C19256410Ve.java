package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateFragment;
import com.ss.android.ugc.aweme.compliance.agegate.view.ExistingAgeGateFragment;

/* JADX INFO: renamed from: X.10Ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19256410Ve implements InterfaceC19257010Vk {
    public final EnumC19257610Vq LIZ;

    public /* synthetic */ C19256410Ve() {
        this(EnumC19257610Vq.EDIT);
    }

    @Override // X.InterfaceC19257010Vk
    public final C10WS LIZ() {
        return this.LIZ == EnumC19257610Vq.EDIT ? new AgeGateFragment(0) : new ExistingAgeGateFragment();
    }

    @Override // X.InterfaceC19257010Vk
    public final Bundle data() {
        return new Bundle();
    }

    public C19256410Ve(EnumC19257610Vq enumC19257610Vq) {
        this.LIZ = enumC19257610Vq;
    }
}
