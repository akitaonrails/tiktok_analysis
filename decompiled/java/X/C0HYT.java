package X;

import com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HYT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYT extends C09AY implements Function1<C2003307t1, C2003307t1> {
    public final /* synthetic */ SocialAvatarIconFlipPrerequisiteViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HYT(SocialAvatarIconFlipPrerequisiteViewModel socialAvatarIconFlipPrerequisiteViewModel) {
        super(1);
        this.LL = socialAvatarIconFlipPrerequisiteViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2003307t1 invoke(C2003307t1 c2003307t1) {
        boolean z;
        C2003307t1 c2003307t12 = c2003307t1;
        SocialAvatarIconFlipPrerequisiteViewModel socialAvatarIconFlipPrerequisiteViewModel = this.LL;
        if (socialAvatarIconFlipPrerequisiteViewModel.LLIZ && socialAvatarIconFlipPrerequisiteViewModel.LLIZLLLIL && !socialAvatarIconFlipPrerequisiteViewModel.LLJ) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = c2003307t12.LL;
        c2003307t12.getClass();
        return new C2003307t1(z, bool);
    }
}
