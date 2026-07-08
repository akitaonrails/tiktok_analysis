package X;

import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C721250SQx extends C2217421BqW implements Function1<Boolean, Unit> {
    public C721250SQx(PostModePageViewModel postModePageViewModel) {
        super(1, postModePageViewModel, PostModePageViewModel.class, "onPhotoMostlyVisible", "onPhotoMostlyVisible(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((PostModePageViewModel) this.receiver).zQ2(bool.booleanValue());
        return Unit.LIZ;
    }
}
