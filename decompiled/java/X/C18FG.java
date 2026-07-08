package X;

import com.bytedance.android.btm.api.PageProp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18FG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PageProp LL;
    public final /* synthetic */ Pair<String, String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FG(PageProp pageProp, Pair<String, String> pair, String str) {
        super(0);
        this.LL = pageProp;
        this.LLILLJJLI = pair;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C18CE.LIZ.LIZIZ(2311, "", null, null, false, new C21252018Es(this.LL, this.LLILLJJLI, this.LLILLL));
        return Unit.LIZ;
    }
}
