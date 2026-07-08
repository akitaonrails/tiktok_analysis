package X;

import android.os.Bundle;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563870qnZ extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MainActivity LL;
    public final /* synthetic */ MainRootFragment LLILLJJLI;
    public final /* synthetic */ MainRootFragment LLILLL;
    public final /* synthetic */ AbstractC738140SxQ LLILZ;
    public final /* synthetic */ TabAbilityAssem LLILZIL;
    public final /* synthetic */ Bundle LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563870qnZ(MainActivity mainActivity, MainRootFragment mainRootFragment, MainRootFragment mainRootFragment2, AbstractC738140SxQ abstractC738140SxQ, TabAbilityAssem tabAbilityAssem, Bundle bundle) {
        super(1);
        this.LL = mainActivity;
        this.LLILLJJLI = mainRootFragment;
        this.LLILLL = mainRootFragment2;
        this.LLILZ = abstractC738140SxQ;
        this.LLILZIL = tabAbilityAssem;
        this.LLILZLL = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        C08TN.LIZ().LJ("main_act_assemble_hierarchy", false);
        InterfaceC1602040rn8 interfaceC1602040rn8 = this.LL.resourceOptComponent;
        if (interfaceC1602040rn8 != null) {
            assembler2.DQ2(this.LLILLJJLI, new C1563880qna(interfaceC1602040rn8));
        }
        assembler2.DQ2(this.LLILLJJLI, new C647050PZn(this.LLILZLL));
        C08TN.LIZ().LJI("main_act_assemble_hierarchy");
        C1563710qnJ.LIZIZ(assembler2, this.LLILLL, this.LLILZ, this.LLILZIL, this.LL);
        return Unit.LIZ;
    }
}
