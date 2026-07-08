package X;

import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569430qwX extends C09AY implements Function0<TabChangeManager> {
    public final /* synthetic */ MainPageBusinessAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569430qwX(MainPageBusinessAssem mainPageBusinessAssem) {
        super(0);
        this.LL = mainPageBusinessAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TabChangeManager invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null) {
            return null;
        }
        return C343710Ddh.LIZ(c19egLIZ);
    }
}
