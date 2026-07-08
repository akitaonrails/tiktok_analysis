package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563400qmo extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ AbstractC738140SxQ LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ Assembler LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563400qmo(AbstractC738140SxQ abstractC738140SxQ, MainActivity mainActivity, Assembler assembler, LifecycleOwner lifecycleOwner) {
        super(0);
        this.LL = abstractC738140SxQ;
        this.LLILLJJLI = mainActivity;
        this.LLILLL = assembler;
        this.LLILZ = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AbstractC738140SxQ abstractC738140SxQLJ = this.LL;
        if (abstractC738140SxQLJ == null) {
            abstractC738140SxQLJ = C1563710qnJ.LJ(this.LLILLJJLI);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social2tabAbility is null: ");
        sbLIZ.append(abstractC738140SxQLJ == null);
        C2188811AlT.LIZIZ(sbLIZ);
        Assembler assembler = this.LLILLL;
        LifecycleOwner lifecycleOwner = this.LLILZ;
        if (abstractC738140SxQLJ == null) {
            return Boolean.FALSE;
        }
        assembler.vQ2(lifecycleOwner, new C1563410qmp(abstractC738140SxQLJ));
        return Boolean.TRUE;
    }
}
