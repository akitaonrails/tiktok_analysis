package X;

import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569420qwW extends C09AY implements Function0<HomePageDataViewModel> {
    public final /* synthetic */ MainPageBusinessAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569420qwW(MainPageBusinessAssem mainPageBusinessAssem) {
        super(0);
        this.LL = mainPageBusinessAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HomePageDataViewModel invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null) {
            return null;
        }
        return C680080Qly.LIZIZ(c19egLIZ);
    }
}
