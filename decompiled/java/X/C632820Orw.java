package X;

import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Orw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C632820Orw extends C2217421BqW implements Function0<Unit> {
    public C632820Orw(OriginMusicListViewModel originMusicListViewModel) {
        super(0, originMusicListViewModel, OriginMusicListViewModel.class, "refresh", "refresh()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((OriginMusicListViewModel) this.receiver).refresh();
        return Unit.LIZ;
    }
}
