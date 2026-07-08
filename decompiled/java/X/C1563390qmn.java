package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563390qmn extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MainRootFragment LL;
    public final /* synthetic */ MainActivity LLILLJJLI;
    public final /* synthetic */ MainActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563390qmn(MainRootFragment mainRootFragment, MainActivity mainActivity, MainActivity mainActivity2) {
        super(1);
        this.LL = mainRootFragment;
        this.LLILLJJLI = mainActivity;
        this.LLILLL = mainActivity2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        C1563170qmR c1563170qmR = C1563170qmR.LLJ;
        if (c1563170qmR == null) {
            c1563170qmR = new C1563170qmR();
        }
        C1563170qmR.LLJ = c1563170qmR;
        c1563170qmR.LIZIZ(this.LL);
        MainActivity mainActivity = this.LLILLJJLI;
        C0S78.LIZLLL(((Boolean) C2277641EDa.LIZLLL.getValue()).booleanValue(), new C1597806Nk(this.LLILLL.getMainSAFFragment(), assembler2, mainActivity));
        return Unit.LIZ;
    }
}
