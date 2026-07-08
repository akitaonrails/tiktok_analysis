package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1147460fxw extends C2217421BqW implements Function0<Unit> {
    public C1147460fxw(MusicGiftDetailViewModel musicGiftDetailViewModel) {
        super(0, musicGiftDetailViewModel, MusicGiftDetailViewModel.class, "onRetryPageClick", "onRetryPageClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLongValue;
        MusicGiftDetailViewModel musicGiftDetailViewModel = (MusicGiftDetailViewModel) this.receiver;
        Long lValueOf = Long.valueOf(musicGiftDetailViewModel.LLJILLL);
        if (lValueOf.longValue() > 0 || 0 != 0) {
            jLongValue = lValueOf.longValue();
        } else {
            Long lValueOf2 = Long.valueOf(musicGiftDetailViewModel.LL.LIZ);
            lValueOf2.longValue();
            jLongValue = musicGiftDetailViewModel.UQ2(musicGiftDetailViewModel.LLJILJIL) ? lValueOf2.longValue() : 0L;
        }
        long j = musicGiftDetailViewModel.LLJILJIL;
        musicGiftDetailViewModel.EQ2(j, jLongValue, musicGiftDetailViewModel.UQ2(j), jLongValue <= 0);
        return Unit.LIZ;
    }
}
