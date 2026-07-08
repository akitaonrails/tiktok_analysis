package X;

import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C721500SRw extends C2217421BqW implements Function0<Unit> {
    public C721500SRw(Object obj) {
        super(0, obj, PostModeNestHeaderComponent.class, "checkQuickTouchDown", "checkQuickTouchDown()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PostModeNestHeaderComponent postModeNestHeaderComponent = (PostModeNestHeaderComponent) this.receiver;
        int i = postModeNestHeaderComponent.LLJL;
        if ((i == 2 || i == 0) && !postModeNestHeaderComponent.LJJJJZI()) {
            PostModePageViewModel postModePageViewModel = postModeNestHeaderComponent.LLILLL.LJIIIIZZ;
            EnumC721170SQp enumC721170SQp = EnumC721170SQp.FLOAT_SWIPE_DOWN;
            if (!postModePageViewModel.BQ2(enumC721170SQp)) {
                postModeNestHeaderComponent.LJJLJLI(4);
                postModeNestHeaderComponent.LLILLL.LJIIIIZZ.vQ2(enumC721170SQp);
            }
        }
        return Unit.LIZ;
    }
}
