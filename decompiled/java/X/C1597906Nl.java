package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1597906Nl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ MainActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597906Nl(LifecycleOwner lifecycleOwner, Assembler assembler, MainActivity mainActivity) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.QQ2(this.LLILLJJLI, new C1350880lG2(this.LLILLL));
        return Unit.LIZ;
    }
}
