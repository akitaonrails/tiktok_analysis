package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.FullyCustomizedBoardItemEditAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485520J2g extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FullyCustomizedBoardItemEditAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C485520J2g(FullyCustomizedBoardItemEditAssem fullyCustomizedBoardItemEditAssem) {
        super(1);
        this.LL = fullyCustomizedBoardItemEditAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.RQ2(this.LL, new C1136504cV());
        assembler2.QQ2(this.LL, new C485500J2e());
        assembler2.QQ2(this.LL, new C485510J2f());
        assembler2.QQ2(this.LL, new C485550J2j());
        return Unit.LIZ;
    }
}
