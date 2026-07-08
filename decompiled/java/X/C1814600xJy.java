package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel$deleteBoards$1$2$1", f = "LiveBoardsPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1814600xJy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveBoardsPageViewModel LL;
    public final /* synthetic */ AbstractC1814790xKH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814600xJy(LiveBoardsPageViewModel liveBoardsPageViewModel, AbstractC1814790xKH abstractC1814790xKH, InterfaceC1364105Vn<? super C1814600xJy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveBoardsPageViewModel;
        this.LLILLJJLI = abstractC1814790xKH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1814600xJy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBoardsPageViewModel@b609.deleteBoards$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveBoardsPageViewModel liveBoardsPageViewModel = this.LL;
        liveBoardsPageViewModel.withState(new C1814990xKb(liveBoardsPageViewModel, this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBoardsPageViewModel@b609.deleteBoards$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
