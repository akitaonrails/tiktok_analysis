package X;

import com.bytedance.android.livesdk.game.gamelist.GameTopicListViewModel;

/* JADX INFO: renamed from: X.0UWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.gamelist.GameTopicListViewModel", f = "GameTopicListViewModel.kt", l = {173}, m = "fetchGameList")
public final class C773620UWi extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GameTopicListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773620UWi(GameTopicListViewModel gameTopicListViewModel, InterfaceC1364105Vn<? super C773620UWi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = gameTopicListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameTopicListViewModel@4b5b.fetchGameList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(this);
        C1C7U.LIZIZ("GameTopicListViewModel@4b5b.fetchGameList$1");
        return objVQ2;
    }
}
