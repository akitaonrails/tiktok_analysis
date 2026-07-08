package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399420mWK extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C1399410mWJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399420mWK(C1399410mWJ c1399410mWJ) {
        super(0);
        this.LL = c1399410mWJ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AnonymousClass0951 anonymousClass0951LIZ;
        C437560HDu c437560HDu;
        ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) this.LL.LLJI.getValue();
        return Boolean.valueOf(((iSocialAvatarCreationStatusService == null || (anonymousClass0951LIZ = iSocialAvatarCreationStatusService.LIZ(((User) this.LL.LLJ.getValue()).getUid())) == null || (c437560HDu = (C437560HDu) anonymousClass0951LIZ.getValue()) == null) ? null : c437560HDu.LIZ) == EnumC437540HDs.SUCCESSFUL);
    }
}
