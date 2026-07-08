package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.BoardSceneryAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04cK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1135404cK extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ BoardSceneryAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1135404cK(BoardSceneryAssem boardSceneryAssem) {
        super(1);
        this.LL = boardSceneryAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.RQ2(this.LL, new C1135504cL());
        assembler2.RQ2(this.LL, new C1135204cI());
        assembler2.QQ2(this.LL, new C1135604cM());
        return Unit.LIZ;
    }
}
