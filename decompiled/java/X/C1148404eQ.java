package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.FullyCustomizedBoardItemEditContainerDialog;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04eQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1148404eQ extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FullyCustomizedBoardItemEditContainerDialog LL;
    public final /* synthetic */ BoardItem LLILLJJLI;
    public final /* synthetic */ C13IQ<? extends UISlotAssem> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148404eQ(FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog, BoardItem boardItem, C19719912Dl c19719912Dl) {
        super(1);
        this.LL = fullyCustomizedBoardItemEditContainerDialog;
        this.LLILLJJLI = boardItem;
        this.LLILLL = c19719912Dl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog = this.LL;
        assembler2.DQ2(fullyCustomizedBoardItemEditContainerDialog, new C01XN(this.LLILLJJLI, fullyCustomizedBoardItemEditContainerDialog));
        assembler2.RQ2(this.LL, new C1147404eG(this.LLILLL));
        return Unit.LIZ;
    }
}
