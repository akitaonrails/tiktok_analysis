package X;

import android.view.View;
import com.ss.android.ugc.aweme.services.ExternalService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713860RzM extends C09AY implements Function1<C711590Rvh, View> {
    public C713860RzM() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(C711590Rvh c711590Rvh) {
        return ExternalService.INSTANCE.effectCardService().getEffectRecommendView(c711590Rvh.LIZIZ);
    }
}
