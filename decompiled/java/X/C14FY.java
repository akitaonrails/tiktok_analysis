package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS144S1100000_30;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14FY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14FY extends C09AY implements Function1<C14EG, Unit> {
    public final /* synthetic */ EnumC1864410ycJ LL;
    public final /* synthetic */ InterfaceC19396010uU LLILLJJLI;
    public final /* synthetic */ InterfaceC19395910uT LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ EnumC20234414Fi LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Map<String, String> LLJI;
    public final /* synthetic */ Aweme LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ C2189821An6 LLJILJILJ;
    public final /* synthetic */ C259800zU<Long> LLJILLL;
    public final /* synthetic */ Map<String, String> LLJJ;
    public final /* synthetic */ Map<String, String> LLJJI;
    public final /* synthetic */ Map<String, String> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14FY(EnumC1864410ycJ enumC1864410ycJ, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT, String str, List<String> list, String str2, EnumC20234414Fi enumC20234414Fi, Map<String, String> map, String str3, Map<String, String> map2, Aweme aweme, String str4, C2189821An6 c2189821An6, C259800zU<Long> c259800zU, Map<String, String> map3, Map<String, String> map4, Map<String, String> map5) {
        super(1);
        this.LL = enumC1864410ycJ;
        this.LLILLJJLI = interfaceC19396010uU;
        this.LLILLL = interfaceC19395910uT;
        this.LLILZ = str;
        this.LLILZIL = list;
        this.LLILZLL = str2;
        this.LLIZ = enumC20234414Fi;
        this.LLIZLLLIL = map;
        this.LLJ = str3;
        this.LLJI = map2;
        this.LLJIJIL = aweme;
        this.LLJILJIL = str4;
        this.LLJILJILJ = c2189821An6;
        this.LLJILLL = c259800zU;
        this.LLJJ = map3;
        this.LLJJI = map4;
        this.LLJJIII = map5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C14EG c14eg) {
        boolean z;
        C14EG c14eg2 = c14eg;
        c14eg2.LJFF(this.LL, new AwS396S0200000_30(this.LLILLJJLI, this.LLILLL, 9));
        String str = this.LLILZ;
        List<String> list = this.LLILZIL;
        if (str == null && (list == null || list.isEmpty())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            c14eg2.LIZJ(this.LLILZ, this.LLILZLL, new AwS239S0300000_30((List) this.LLILZIL, (List<String>) this.LLIZ, (EnumC20234414Fi) this.LLIZLLLIL, (Map<String, String>) 1));
        }
        String str2 = this.LLJ;
        if (str2 != null && str2.length() > 0) {
            c14eg2.LJ(new AwS144S1100000_30(this.LLJ, (String) this.LLJI, (Map<String, String>) 1));
        }
        c14eg2.LJI(new AwS609S0100000_30(this.LLJIJIL, 48));
        c14eg2.LIZLLL(new C14FX(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII));
        return Unit.LIZ;
    }
}
