package X;

import com.ss.android.ugc.aweme.story.feed.common.collection.component.FeedCollectionProgressBarComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RO4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.common.collection.component.FeedCollectionProgressBarComponent$setProgressBarCount$1", f = "FeedCollectionProgressBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C0RO4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedCollectionProgressBarComponent LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RO4(FeedCollectionProgressBarComponent feedCollectionProgressBarComponent, int i, InterfaceC1364105Vn<? super C0RO4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedCollectionProgressBarComponent;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0RO4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedCollectionProgressBarComponent@a3f6.setProgressBarCount$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FeedCollectionProgressBarComponent feedCollectionProgressBarComponent = this.LL;
        if (feedCollectionProgressBarComponent.LLJLLIL == null) {
            feedCollectionProgressBarComponent.LLLF = C2286608xc.LJ(this.LLILLJJLI);
        } else {
            feedCollectionProgressBarComponent.LLLF = null;
            C707280Rok c707280Rok = this.LL.LLJLLIL;
            if (c707280Rok != null) {
                c707280Rok.setMaxProgressCount(this.LLILLJJLI);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedCollectionProgressBarComponent@a3f6.setProgressBarCount$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
