package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.GameRewardsPreviewCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.game.GameRewardsPreviewCardWidget$initClickListener$1$2", f = "GameRewardsPreviewCardWidget.kt", l = {83}, m = "invokeSuspend")
public final class C755450TkF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GameRewardsPreviewCardWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C755450TkF(GameRewardsPreviewCardWidget gameRewardsPreviewCardWidget, InterfaceC1364105Vn<? super C755450TkF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = gameRewardsPreviewCardWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C755450TkF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MutableLiveData<Integer> mutableLiveData;
        C1C7U.LIZ("GameRewardsPreviewCardWidget@f121.initClickListener$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("GameRewardsPreviewCardWidget@f121.initClickListener$1$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.hide();
        FeedLiveViewHolderVM feedLiveViewHolderVMO1 = this.LLILLJJLI.O1();
        if (feedLiveViewHolderVMO1 != null && (mutableLiveData = feedLiveViewHolderVMO1.LLLIIL) != null) {
            mutableLiveData.postValue(C2286608xc.LJ(0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameRewardsPreviewCardWidget@f121.initClickListener$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
