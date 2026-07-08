package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouListAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217300hma extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ IntelligentBoardTemplateForYouListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217300hma(IntelligentBoardTemplateForYouListAssem intelligentBoardTemplateForYouListAssem) {
        super(1);
        this.LL = intelligentBoardTemplateForYouListAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1217290hmZ());
        return Unit.LIZ;
    }
}
