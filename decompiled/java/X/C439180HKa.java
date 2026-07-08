package X;

import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarCreationProgressService;

/* JADX INFO: renamed from: X.0HKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439180HKa implements ISocialAvatarCreationProgressService {
    public AnonymousClass0956 LIZIZ;
    public boolean LIZ = true;
    public final C0HMP LIZJ = C0HMP.LIZ;

    @Override // com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarCreationProgressService
    public final void cancelPooling() {
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarCreationProgressService
    public final void requestProgress(String str, boolean z, InterfaceC439190HKb interfaceC439190HKb) {
        this.LIZ = true;
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C439200HKc(this, z, null), 3);
    }
}
