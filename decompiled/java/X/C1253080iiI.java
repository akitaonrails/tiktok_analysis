package X;

import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253080iiI extends C09AY implements Function1<ProfileUser, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ ProfileComponents LLILLJJLI;
    public final /* synthetic */ C1889007aa LLILLL;
    public final /* synthetic */ I18nUserProfileFragment LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1253080iiI(boolean z, ProfileComponents profileComponents, C1889007aa c1889007aa, I18nUserProfileFragment i18nUserProfileFragment, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = profileComponents;
        this.LLILLL = c1889007aa;
        this.LLILZ = i18nUserProfileFragment;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ProfileUser profileUser) {
        C1889007aa c1889007aa;
        ProfileUser profileUser2 = profileUser;
        if (this.LL && this.LLILLJJLI != null && (c1889007aa = this.LLILLL) != null) {
            I18nUserProfileFragment i18nUserProfileFragment = this.LLILZ;
            ProfileComponents profileComponents = profileUser2.profileBackground;
            i18nUserProfileFragment.getClass();
            if (Intrinsics.LJFF(c1889007aa, I18nUserProfileFragment.aS(profileComponents))) {
                profileUser2.profileBackground = this.LLILLJJLI;
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("I18nUserProfileFragment", "updateUserData reuse profile background signature");
            }
        }
        I18nUserProfileFragment i18nUserProfileFragment2 = this.LLILZ;
        i18nUserProfileFragment2.LLLLJI = profileUser2;
        i18nUserProfileFragment2.ma2(null, this.LLILZIL);
        return Unit.LIZ;
    }
}
