package X;

import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarViewModel;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0ht9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221370ht9 {
    public final /* synthetic */ ProfileAigcAvatarViewModel LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        String str;
        int i = C2187451AjH.LIZ;
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LIZ;
        C2179208gI c2179208gI = profileAigcAvatarViewModel.LLJI;
        String string = ((C1221150hsn) profileAigcAvatarViewModel.getState()).LLILZIL.LIZ.toString();
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel2 = this.LIZ;
        C1221530htP c1221530htP = profileAigcAvatarViewModel2.LL;
        String str2 = null;
        if (c1221530htP != null) {
            str2 = c1221530htP.LLILLJJLI;
            str = c1221530htP.LLILLL;
        } else {
            str = null;
        }
        c2179208gI.LIZ(((C1221150hsn) profileAigcAvatarViewModel2.getState()).LLILLJJLI.LIZ.size(), string, "download_fail", str2, str);
        this.LIZ.BQ2(EnumC1221420htE.AVATAR_CHANGE);
        this.LIZ.L1(2131820593);
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel3 = this.LIZ;
        profileAigcAvatarViewModel3.setState(new AwS598S0100000_19(profileAigcAvatarViewModel3, 342));
    }

    public C1221370ht9(ProfileAigcAvatarViewModel profileAigcAvatarViewModel) {
        this.LIZ = profileAigcAvatarViewModel;
    }
}
