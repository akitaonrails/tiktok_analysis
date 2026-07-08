package X;

import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAssem;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570460qyC extends C09AY implements Function0<ScrollSwitchStateManager> {
    public final /* synthetic */ MainPageSeekAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570460qyC(MainPageSeekAssem mainPageSeekAssem) {
        super(0);
        this.LL = mainPageSeekAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScrollSwitchStateManager invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null) {
            return null;
        }
        return C486860J7k.LIZIZ(c19egLIZ);
    }
}
