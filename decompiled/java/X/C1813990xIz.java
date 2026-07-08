package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.LiveIntelligentBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.UpsertBoardResponse;

/* JADX INFO: renamed from: X.0xIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.LiveIntelligentBoardUpsertViewModel$upsertReally$3$3$1", f = "IntelligentBoardUpsertViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1813990xIz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveIntelligentBoardUpsertViewModel LL;
    public final /* synthetic */ C470590Icr<UpsertBoardResponse.ResponseData> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1814370xJb LLILZ;
    public final /* synthetic */ Board LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813990xIz(LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModel, C470590Icr<UpsertBoardResponse.ResponseData> c470590Icr, int i, C1814370xJb c1814370xJb, Board board, boolean z, InterfaceC1364105Vn<? super C1813990xIz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveIntelligentBoardUpsertViewModel;
        this.LLILLJJLI = c470590Icr;
        this.LLILLL = i;
        this.LLILZ = c1814370xJb;
        this.LLILZIL = board;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1813990xIz(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveIntelligentBoardUpsertViewModel@22dd.upsertReally$3$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModel = this.LL;
        liveIntelligentBoardUpsertViewModel.withState(new C1813980xIy(this.LLILLJJLI, liveIntelligentBoardUpsertViewModel, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveIntelligentBoardUpsertViewModel@22dd.upsertReally$3$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
