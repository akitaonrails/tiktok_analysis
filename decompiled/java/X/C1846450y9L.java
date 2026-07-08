package X;

import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouNavAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0y9L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846450y9L extends C09AY implements Function0<LiveIconView> {
    public final /* synthetic */ IntelligentBoardTemplateForYouNavAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1846450y9L(IntelligentBoardTemplateForYouNavAssem intelligentBoardTemplateForYouNavAssem) {
        super(0);
        this.LL = intelligentBoardTemplateForYouNavAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.android.live.design.view.icon.LiveIconView] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveIconView invoke() {
        return this.LL.LJJIJL().findViewById(R.id.xh2);
    }
}
