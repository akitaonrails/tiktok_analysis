package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.LiveBoardApi;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.UpsertBoardItemReq;

/* JADX INFO: renamed from: X.0xKM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel$upsertBoardItem$1", f = "BoardsDisplayViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1814840xKM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BoardItem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814840xKM(BoardItem boardItem, InterfaceC1364105Vn<? super C1814840xKM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = boardItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1814840xKM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BoardsDisplayViewModel@4c6d.upsertBoardItem$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C480460Ism.LIZ().getClass();
        LiveBoardApi liveBoardApi = (LiveBoardApi) C480460Ism.LIZLLL(LiveBoardApi.class);
        UpsertBoardItemReq upsertBoardItemReq = new UpsertBoardItemReq();
        upsertBoardItemReq.boardItem = this.LL;
        liveBoardApi.upsertBoardItem(upsertBoardItemReq).LJFF(new C0UO0()).LJJIIJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BoardsDisplayViewModel@4c6d.upsertBoardItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
