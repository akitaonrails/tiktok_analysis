package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1156504fj extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ MainPageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156504fj(Assembler assembler, MainPageFragment mainPageFragment) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = mainPageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.RQ2(this.LLILLJJLI, new C1156404fi());
        return Unit.LIZ;
    }
}
