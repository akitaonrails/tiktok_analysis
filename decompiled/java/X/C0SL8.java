package X;

import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SL8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0SL8 extends C2217421BqW implements Function1<Boolean, Unit> {
    public C0SL8(Object obj) {
        super(1, obj, PhotoSlideViewPagerComponent.class, "setPagerOffset", "setPagerOffset(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((PhotoSlideViewPagerComponent) this.receiver).Jp(bool.booleanValue());
        return Unit.LIZ;
    }
}
