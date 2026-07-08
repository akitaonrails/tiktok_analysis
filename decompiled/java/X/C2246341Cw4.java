package X;

import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioViewModel;
import kotlin.jvm.internal.AwS19S0002000_34;

/* JADX INFO: renamed from: X.1Cw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246341Cw4 implements InterfaceC1355360lNG {
    public final /* synthetic */ ProfileEditBioViewModel LIZ;

    public C2246341Cw4(ProfileEditBioViewModel profileEditBioViewModel) {
        this.LIZ = profileEditBioViewModel;
    }

    @Override // X.InterfaceC1355360lNG
    public final void LIZ(int i, int i2, boolean z) {
        if (z) {
            this.LIZ.setStateImmediate(new AwS19S0002000_34(i, i2, 1));
        }
    }
}
