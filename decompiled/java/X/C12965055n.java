package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.render.AudienceDecorationRenderAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.055n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12965055n extends C09AY implements Function0<C1092090eWd> {
    public final /* synthetic */ AudienceDecorationRenderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12965055n(AudienceDecorationRenderAssem audienceDecorationRenderAssem) {
        super(0);
        this.LL = audienceDecorationRenderAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0eWd, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C1092090eWd invoke() {
        return this.LL.LJJIJL().findViewById(R.id.ba0);
    }
}
