package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.BoardSceneryFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04cX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1136704cX extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ BoardSceneryFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1136704cX(BoardSceneryFragment boardSceneryFragment) {
        super(1);
        this.LL = boardSceneryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        BoardSceneryFragment boardSceneryFragment = this.LL;
        assembler2.DQ2(boardSceneryFragment, new C1817520xOg(boardSceneryFragment));
        assembler2.QQ2(this.LL, new C1134004c6());
        return Unit.LIZ;
    }
}
