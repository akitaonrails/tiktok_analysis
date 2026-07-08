package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.IntelligentBoardTemplateForYouSheet;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217360hmg extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ IntelligentBoardTemplateForYouSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217360hmg(IntelligentBoardTemplateForYouSheet intelligentBoardTemplateForYouSheet) {
        super(1);
        this.LL = intelligentBoardTemplateForYouSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        IntelligentBoardTemplateForYouSheet intelligentBoardTemplateForYouSheet = this.LL;
        assembler2.DQ2(intelligentBoardTemplateForYouSheet, new C1218780hoy(intelligentBoardTemplateForYouSheet));
        assembler2.QQ2(this.LL, new C1217350hmf());
        assembler2.QQ2(this.LL, new C1217310hmb());
        return Unit.LIZ;
    }
}
