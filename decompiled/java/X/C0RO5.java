package X;

import com.ss.android.ugc.aweme.story.feed.common.collection.component.FeedCollectionProgressBarComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RO5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.common.collection.component.FeedCollectionProgressBarComponent$updateProgress$1", f = "FeedCollectionProgressBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C0RO5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedCollectionProgressBarComponent LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RO5(FeedCollectionProgressBarComponent feedCollectionProgressBarComponent, int i, float f, long j, InterfaceC1364105Vn<? super C0RO5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedCollectionProgressBarComponent;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0RO5(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedCollectionProgressBarComponent@a3f6.updateProgress$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C707280Rok c707280Rok = this.LL.LLJLLIL;
        if (c707280Rok != null) {
            c707280Rok.LIZLLL(this.LLILLL, this.LLILLJJLI, this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedCollectionProgressBarComponent@a3f6.updateProgress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
