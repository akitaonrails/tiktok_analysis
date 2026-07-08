package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: renamed from: X.0yZK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862560yZK extends C09AY implements Function1<C20234214Fg, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ TakoEventTracker LLILZ;
    public final /* synthetic */ TakoSearchCarryInItem LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ List<Aweme> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1862560yZK(long j, String str, String str2, TakoEventTracker takoEventTracker, TakoSearchCarryInItem takoSearchCarryInItem, String str3, List<? extends Aweme> list, String str4, String str5, String str6, String str7) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = takoEventTracker;
        this.LLILZIL = takoSearchCarryInItem;
        this.LLILZLL = str3;
        this.LLIZ = list;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = str7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20234214Fg c20234214Fg) {
        C20234214Fg c20234214Fg2 = c20234214Fg;
        c20234214Fg2.LJFF(EnumC1864410ycJ.FULL_SCREEN, AFwS274S0000000_30.get$arr$(28));
        c20234214Fg2.LIZ = this.LL;
        c20234214Fg2.LJ(new C1863940ybY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ));
        c20234214Fg2.LIZLLL(new C1862570yZL(this.LLILLJJLI, this.LLJI, this.LLILLL, this.LLJIJIL, this.LLIZLLLIL, this.LLJ));
        return Unit.LIZ;
    }
}
