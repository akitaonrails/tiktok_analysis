package X;

import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C457500Hwq extends C2217421BqW implements Function0<Unit> {
    public C457500Hwq(IAlbumUpdateGuideViewModel iAlbumUpdateGuideViewModel) {
        super(0, iAlbumUpdateGuideViewModel, IAlbumUpdateGuideViewModel.class, "dismiss", "dismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((IAlbumUpdateGuideViewModel) this.receiver).dismiss();
        return Unit.LIZ;
    }
}
