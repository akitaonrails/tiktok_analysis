package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS188S1100000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HAE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HAE extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ EnumC2211841BhW LLILLJJLI;
    public final /* synthetic */ SearchVideoHolder LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HAE(float f, EnumC2211841BhW enumC2211841BhW, SearchVideoHolder searchVideoHolder, String str, View view) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = enumC2211841BhW;
        this.LLILLL = searchVideoHolder;
        this.LLILZ = str;
        this.LLILZIL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new AwS550S0100000_6(this.LLILLL, 587);
        c20248814Kw2.LIZIZ(new AwS188S1100000_6(this.LLILLL, this.LLILZ, 1));
        C20248814Kw.LIZJ(c20248814Kw2, true, false, this.LL, 0, this.LLILLJJLI, new AwS372S0200000_6(this.LLILZIL, this.LLILLL, 22), null, 64);
        return Unit.LIZ;
    }
}
