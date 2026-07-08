package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;

/* JADX INFO: renamed from: X.0HTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441610HTj {
    public final MixStudioLauncher.PrefillInfo LIZ;
    public final boolean LIZIZ;
    public final MixStudioLauncher.PushInfo LIZJ;

    public C441610HTj(MixStudioLauncher.PrefillInfo prefillInfo, boolean z, MixStudioLauncher.PushInfo pushInfo) {
        this.LIZ = prefillInfo;
        this.LIZIZ = z;
        this.LIZJ = pushInfo;
    }

    public /* synthetic */ C441610HTj(MixStudioLauncher.PrefillInfo prefillInfo, boolean z, MixStudioLauncher.PushInfo pushInfo, int i) {
        this((i & 1) != 0 ? null : prefillInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : pushInfo);
    }
}
