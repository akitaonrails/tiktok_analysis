package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RUH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUH extends C09AY implements Function0<Long> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ C696590RUb LLILLL;
    public final /* synthetic */ UIContentAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RUH(Assembler assembler, MainPageFragment mainPageFragment, C696590RUb c696590RUb, UIContentAssem uIContentAssem) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = mainPageFragment;
        this.LLILLL = c696590RUb;
        this.LLILZ = uIContentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LL.QQ2(this.LLILLJJLI, new C696600RUc(this.LLILLL, this.LLILZ));
        return Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
    }
}
