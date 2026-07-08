package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569830qxB extends C09AY implements Function1<Bundle, Unit> {
    public final /* synthetic */ SlideGuideViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569830qxB(SlideGuideViewModel slideGuideViewModel) {
        super(1);
        this.LL = slideGuideViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bundle bundle) {
        this.LL.setVisible(false);
        return Unit.LIZ;
    }
}
