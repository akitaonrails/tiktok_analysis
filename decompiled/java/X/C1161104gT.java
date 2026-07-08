package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04gT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1161104gT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ MainPageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161104gT(Assembler assembler, MainPageFragment mainPageFragment) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = mainPageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Assembler assembler = this.LL;
        MainPageFragment mainPageFragment = this.LLILLJJLI;
        assembler.QQ2(mainPageFragment, new C1161004gS(mainPageFragment));
        return Unit.LIZ;
    }
}
