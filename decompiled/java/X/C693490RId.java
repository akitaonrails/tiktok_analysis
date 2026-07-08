package X;

import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693490RId extends C09AY implements Function1<Assembler, Unit> {

    /* JADX INFO: Incorrect field signature: TASSEM; */
    public final /* synthetic */ BaseContainer LL;
    public final /* synthetic */ C0RPZ LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;
    public final /* synthetic */ ReusedUIAssem<? extends C03H5> LLILZIL;
    public final /* synthetic */ RootCellCommonAbility LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TASSEM;LX/0RPZ;ILandroid/view/ViewGroup;Lcom/bytedance/assem/arch/reused/ReusedUIAssem<+LX/03H5;>;Lcom/ss/android/ugc/feed/platform/cell/RootCellCommonAbility;)V */
    public C693490RId(BaseContainer baseContainer, C0RPZ c0rpz, int i, ViewGroup viewGroup, ReusedUIAssem reusedUIAssem, RootCellCommonAbility rootCellCommonAbility) {
        super(1);
        this.LL = baseContainer;
        this.LLILLJJLI = c0rpz;
        this.LLILLL = i;
        this.LLILZ = viewGroup;
        this.LLILZIL = reusedUIAssem;
        this.LLILZLL = rootCellCommonAbility;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.LQ2(this.LL, new C693500RIe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
        return Unit.LIZ;
    }
}
