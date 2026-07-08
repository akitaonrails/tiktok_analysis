package X;

import com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D0L, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C1D0L extends C2217421BqW implements Function0<Unit> {
    public C1D0L(Object obj) {
        super(0, obj, TabletBottomControlBarViewModel.class, "recompose", "recompose()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TabletBottomControlBarViewModel) this.receiver).yQ2();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.LIZ;
    }
}
