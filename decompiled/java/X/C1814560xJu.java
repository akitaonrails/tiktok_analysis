package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814560xJu extends C09AY implements Function1<BoardItem, Unit> {
    public final /* synthetic */ BoardsDisplayViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814560xJu(BoardsDisplayViewModel boardsDisplayViewModel, boolean z) {
        super(1);
        this.LL = boardsDisplayViewModel;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BoardItem boardItem) {
        AbstractC1700910uMb value;
        BoardItem boardItem2 = boardItem;
        C05YD<AbstractC1700910uMb> c05yd = this.LL.LLILZ;
        if (c05yd != null) {
            value = c05yd.getValue();
        } else {
            value = null;
        }
        if (!this.LLILLJJLI && (value instanceof C1700890uMZ) && ((C1700890uMZ) value).LIZ.version == 2) {
            BoardsDisplayViewModel boardsDisplayViewModel = this.LL;
            boardsDisplayViewModel.getClass();
            C488201vE.LJI(boardItem2);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(boardsDisplayViewModel), null, null, new C1814840xKM(boardItem2, null), 3);
        }
        return Unit.LIZ;
    }
}
