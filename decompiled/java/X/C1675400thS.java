package X;

import com.ss.android.ugc.aweme.subscription.preview.photos.PhotoPreviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0thS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1675400thS extends C2217421BqW implements Function0<Unit> {
    public C1675400thS(Object obj) {
        super(0, obj, PhotoPreviewViewModel.class, "handleCoverClick", "handleCoverClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((PhotoPreviewViewModel) this.receiver).LLILLL.postValue(C1675440thW.LIZ);
        return Unit.LIZ;
    }
}
