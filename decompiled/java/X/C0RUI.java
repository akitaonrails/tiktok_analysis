package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RUI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUI extends C09AY implements Function0<Long> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ AbstractC738140SxQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RUI(Assembler assembler, LifecycleOwner lifecycleOwner, AbstractC738140SxQ abstractC738140SxQ) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LL.vQ2(this.LLILLJJLI, new C0RUL(this.LLILLL));
        return Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
    }
}
