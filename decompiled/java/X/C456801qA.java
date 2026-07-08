package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelListCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01qA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelListCell$bindRelationButton$3", f = "RepostPanelListCell.kt", l = {}, m = "invokeSuspend")
public final class C456801qA extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ RepostPanelListCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456801qA(RepostPanelListCell repostPanelListCell, InterfaceC1364105Vn<? super C456801qA> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = repostPanelListCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C456801qA(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostPanelListCell@8d10.bindRelationButton$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.R5("button");
        C1C7U.LIZIZ("RepostPanelListCell@8d10.bindRelationButton$3");
        return false;
    }
}
