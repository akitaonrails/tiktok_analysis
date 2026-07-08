package X;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rV0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590800rV0 extends C09AY implements Function0<DataCenter> {
    public final /* synthetic */ SocialPublishLandingAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590800rV0(SocialPublishLandingAssem socialPublishLandingAssem) {
        super(0);
        this.LL = socialPublishLandingAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DataCenter invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null) {
            return null;
        }
        return DataCenter.vQ2(ViewModelProviders.of(c19egLIZ), this.LL);
    }
}
