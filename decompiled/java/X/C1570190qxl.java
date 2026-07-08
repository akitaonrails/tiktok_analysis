package X;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem;
import com.ss.android.ugc.aweme.main.MainAnimViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570190qxl extends C09AY implements Function0<MainAnimViewModel> {
    public final /* synthetic */ SocialPublishLandingAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570190qxl(SocialPublishLandingAssem socialPublishLandingAssem) {
        super(0);
        this.LL = socialPublishLandingAssem;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.ss.android.ugc.aweme.main.MainAnimViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final MainAnimViewModel invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null) {
            return null;
        }
        return ViewModelProviders.of(c19egLIZ).get(MainAnimViewModel.class);
    }
}
