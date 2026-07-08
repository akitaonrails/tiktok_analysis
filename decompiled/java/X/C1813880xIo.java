package X;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel$boardCheckBeforeUpsert$1", f = "LiveBoardUpsertViewModel.kt", l = {288}, m = "invokeSuspend")
public final class C1813880xIo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1782570wUJ LLILLJJLI;
    public final /* synthetic */ LiveBoardUpsertViewModel LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ Board LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813880xIo(EnumC1782570wUJ enumC1782570wUJ, LiveBoardUpsertViewModel liveBoardUpsertViewModel, Context context, Board board, InterfaceC1364105Vn<? super C1813880xIo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1782570wUJ;
        this.LLILLL = liveBoardUpsertViewModel;
        this.LLILZ = context;
        this.LLILZIL = board;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1813880xIo(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("LiveBoardUpsertViewModel@44af.boardCheckBeforeUpsert$1");
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
            int i2 = C1782580wUK.LIZ[this.LLILLJJLI.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    this.LLILLL.qD1(true);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveBoardUpsertViewModel@44af.boardCheckBeforeUpsert$1");
                    return unit;
                }
                this.LLILLL.qD1(true);
                this.LLILLL.Zm2();
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("LiveBoardUpsertViewModel@44af.boardCheckBeforeUpsert$1");
                return unit2;
            }
            this.LLILLL.qD1(true);
            AbstractC233200vC abstractC233200vC = (AbstractC233200vC) this.LLILLL.LLILLL.getValue();
            Context context = this.LLILZ;
            Board board = this.LLILZIL;
            LiveBoardUpsertViewModel liveBoardUpsertViewModel = this.LLILLL;
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(liveBoardUpsertViewModel);
            C291301Ax c291301Ax = (C291301Ax) this.LLILLL.LLILLJJLI.getValue();
            if (c291301Ax == null || (str = c291301Ax.LL) == null) {
                str = "live_take_page";
            }
            C1816270xMf c1816270xMf = new C1816270xMf(context, board, liveBoardUpsertViewModel, viewModelScope, new C1813890xIp(str));
            this.LL = 1;
            if (abstractC233200vC.LIZ(c1816270xMf, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBoardUpsertViewModel@44af.boardCheckBeforeUpsert$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("LiveBoardUpsertViewModel@44af.boardCheckBeforeUpsert$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
