package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1147520fy2 extends C2217421BqW implements Function0<Unit> {
    public C1147520fy2(MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(0, musicGiftDetailViewModel, MusicGiftDetailViewModel.class, "onRetryLoadMoreClick", "onRetryLoadMoreClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicGiftDetailViewModel musicGiftDetailViewModel = (MusicGiftDetailViewModel) this.receiver;
        musicGiftDetailViewModel.getClass();
        musicGiftDetailViewModel.FQ2(true, false, false);
        return Unit.LIZ;
    }
}
