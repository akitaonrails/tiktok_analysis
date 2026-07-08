package X;

import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Dcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell$bindRelationButton$1$3", f = "CollabFeedInvitedCell.kt", l = {}, m = "invokeSuspend")
public final class C343270Dcz extends C09AX implements Function1<InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ CollabFeedInvitedCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343270Dcz(CollabFeedInvitedCell collabFeedInvitedCell, InterfaceC1364105Vn<? super C343270Dcz> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = collabFeedInvitedCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C343270Dcz(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollabFeedInvitedCell@1126.bindRelationButton$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.P5("click_chat");
        C1C7U.LIZIZ("CollabFeedInvitedCell@1126.bindRelationButton$1$3");
        return false;
    }
}
