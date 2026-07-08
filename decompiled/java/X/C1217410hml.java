package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217410hml extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ LiveBoardsPageDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217410hml(LiveBoardsPageDialogFragment liveBoardsPageDialogFragment) {
        super(1);
        this.LL = liveBoardsPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        LiveBoardsPageDialogFragment liveBoardsPageDialogFragment = this.LL;
        assembler2.DQ2(liveBoardsPageDialogFragment, new C1814850xKN(liveBoardsPageDialogFragment));
        assembler2.QQ2(this.LL, new C1217380hmi());
        assembler2.QQ2(this.LL, new C1217400hmk());
        assembler2.QQ2(this.LL, new C1217420hmm());
        assembler2.QQ2(this.LL, new C1217430hmn());
        return Unit.LIZ;
    }
}
