package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.UpsertBoardResponse;

/* JADX INFO: renamed from: X.0xIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel$upsertReally$3$3$1", f = "LiveBoardUpsertViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1813950xIv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveBoardUpsertViewModel LL;
    public final /* synthetic */ C470590Icr<UpsertBoardResponse.ResponseData> LLILLJJLI;
    public final /* synthetic */ C1814370xJb LLILLL;
    public final /* synthetic */ Board LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813950xIv(LiveBoardUpsertViewModel liveBoardUpsertViewModel, C470590Icr<UpsertBoardResponse.ResponseData> c470590Icr, C1814370xJb c1814370xJb, Board board, InterfaceC1364105Vn<? super C1813950xIv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveBoardUpsertViewModel;
        this.LLILLJJLI = c470590Icr;
        this.LLILLL = c1814370xJb;
        this.LLILZ = board;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1813950xIv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBoardUpsertViewModel@44af.upsertReally$3$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveBoardUpsertViewModel liveBoardUpsertViewModel = this.LL;
        liveBoardUpsertViewModel.withState(new C1813960xIw(this.LLILLJJLI, liveBoardUpsertViewModel, this.LLILLL, this.LLILZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBoardUpsertViewModel@44af.upsertReally$3$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
