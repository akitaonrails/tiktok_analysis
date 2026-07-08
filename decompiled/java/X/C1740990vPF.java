package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vPF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740990vPF extends C09AY implements Function2<String, Function1<? super Boolean, ? extends Unit>, Unit> {
    public final /* synthetic */ C1740970vPD LL;
    public final /* synthetic */ Function0<InterfaceC497601wk> LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ C1741560vQA LLILZLL;
    public final /* synthetic */ InterfaceC1741020vPI LLIZ;
    public final /* synthetic */ C1767790w6T LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740990vPF(C1740970vPD c1740970vPD, AwS570S0100000_26 awS570S0100000_26, ShopMallMixFragment shopMallMixFragment, int i, Map map, C1741560vQA c1741560vQA, C1741140vPU c1741140vPU, C1767790w6T c1767790w6T) {
        super(2);
        this.LL = c1740970vPD;
        this.LLILLJJLI = awS570S0100000_26;
        this.LLILLL = shopMallMixFragment;
        this.LLILZ = i;
        this.LLILZIL = map;
        this.LLILZLL = c1741560vQA;
        this.LLIZ = c1741140vPU;
        this.LLIZLLLIL = c1767790w6T;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Function1<? super Boolean, ? extends Unit> function1) {
        String str2 = str;
        Function1<? super Boolean, ? extends Unit> function12 = function1;
        AnonymousClass0956 anonymousClass0956 = this.LL.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC497601wk interfaceC497601wkInvoke = this.LLILLJJLI.invoke();
        C1740970vPD c1740970vPD = this.LL;
        c1740970vPD.LIZJ = C23250099c.LIZLLL(interfaceC497601wkInvoke, null, null, new C1741000vPG(this.LLILLL, str2, this.LLILZ, c1740970vPD, this.LLILZIL, function12, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null), 3);
        return Unit.LIZ;
    }
}
