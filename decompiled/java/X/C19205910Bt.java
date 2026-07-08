package X;

import com.ss.android.ugc.aweme.subscription.preview.photos.PhotoPreviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10Bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19205910Bt extends C2217421BqW implements Function0<Unit> {
    public C19205910Bt(Object obj) {
        super(0, obj, PhotoPreviewViewModel.class, "handleCloseClick", "handleCloseClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((PhotoPreviewViewModel) this.receiver).vQ2("cancel");
        C19210910Dr.LIZ(C10AW.LIZ);
        return Unit.LIZ;
    }
}
