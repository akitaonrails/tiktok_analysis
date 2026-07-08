package X;

import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSocialAssem;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590160rTy extends C09AY implements Function0<IBottomFriendsTabAvatarAbility> {
    public final /* synthetic */ MainPageSocialAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590160rTy(MainPageSocialAssem mainPageSocialAssem) {
        super(0);
        this.LL = mainPageSocialAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IBottomFriendsTabAvatarAbility invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            return C1583510rJF.LJIIJJI(C1558360qeg.LJI(c19egLIZ, null));
        }
        return null;
    }
}
