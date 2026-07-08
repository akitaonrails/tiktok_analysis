package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS487S0200000_25;
import kotlin.jvm.internal.AwS653S0100000_4;
import kotlin.jvm.internal.AwS657S0100000_8;

/* JADX INFO: renamed from: X.0MAD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAD extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C05P0<String> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, Unit> LLILZIL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ C05P0<Integer> LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ AbstractC1690640u62 LLJI;
    public final /* synthetic */ C13EY<Integer, C1690050u55> LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ Set<Integer> LLJJ;
    public final /* synthetic */ long LLJJI;
    public final /* synthetic */ InterfaceC1690500u5o LLJJIII;
    public final /* synthetic */ C1690080u58 LLJJIJI;
    public final /* synthetic */ float LLJJIJIIJIL;
    public final /* synthetic */ float LLJJIJIL;
    public final /* synthetic */ Function2<C1378605aS, SocMediaResource, Unit> LLJJJ;
    public final /* synthetic */ float LLJJJIL;
    public final /* synthetic */ C05P1<Integer> LLJJJJ;
    public final /* synthetic */ C05P1<C1690050u55> LLJJJJJIL;
    public final /* synthetic */ C05P1<Boolean> LLJJJJLIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MAD(SocialMediaPickerViewModel socialMediaPickerViewModel, boolean z, C05P0 c05p0, C05P0 c05p02, InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1685750ty9 interfaceC1685750ty9, float f, C05P0 c05p03, boolean z2, C1386605bk c1386605bk, C13EY c13ey, boolean z3, int i, boolean z4, Set set, long j, InterfaceC1690500u5o interfaceC1690500u5o, C1690080u58 c1690080u58, float f2, float f3, Function2 function2, float f4, C05P1 c05p1, C05P1 c05p12, C05P1 c05p13) {
        super(1);
        this.LL = socialMediaPickerViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = c05p0;
        this.LLILZ = c05p02;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = interfaceC1685750ty9;
        this.LLIZ = f;
        this.LLIZLLLIL = c05p03;
        this.LLJ = z2;
        this.LLJI = c1386605bk;
        this.LLJIJIL = c13ey;
        this.LLJILJIL = z3;
        this.LLJILJILJ = i;
        this.LLJILLL = z4;
        this.LLJJ = set;
        this.LLJJI = j;
        this.LLJJIII = interfaceC1690500u5o;
        this.LLJJIJI = c1690080u58;
        this.LLJJIJIIJIL = f2;
        this.LLJJIJIL = f3;
        this.LLJJJ = function2;
        this.LLJJJIL = f4;
        this.LLJJJJ = c05p1;
        this.LLJJJJJIL = c05p12;
        this.LLJJJJLIIL = c05p13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        InterfaceC563570M8l interfaceC563570M8lLIZIZ;
        Function2<InterfaceC1680500tpg, Integer, Unit> function2LIZIZ;
        C0MAE c0mae2 = c0mae;
        if (this.LL.LL.getMultiEntranceAreaUIConfig() != null) {
            c0mae2.LIZIZ(null, null, new C19719212De(-1857755133, new AwS657S0100000_8(this.LL, 5), true));
        }
        if (C123100dR.LIZ(this.LLILLL.getValue())) {
            c0mae2.LIZIZ(null, null, new C19719212De(1118568940, new AwS657S0100000_8(this.LLILLL, (C05P0<String>) 6), true));
        }
        if (this.LLILZ.getValue().booleanValue() && this.LL.LL.getMediaLoadingStrategy().getPermissionBannerStyle() == C0LJD.FIXED_TOP) {
            c0mae2.LIZIZ(null, null, new C19719212De(364544651, new AwS487S0200000_25(this.LLILZLL, this.LLILZIL, 6), true));
        }
        C0M8Q c0m8q = this.LL.LLJ;
        if (c0m8q != null && (interfaceC563570M8lLIZIZ = c0m8q.LIZIZ()) != null && (function2LIZIZ = interfaceC563570M8lLIZIZ.LIZIZ()) != null && ((Boolean) ((C13FE) this.LL.LLJLL).getValue()).booleanValue()) {
            c0mae2.LIZIZ("permission", "permission", new C19719212De(-389479638, new AwS653S0100000_4(function2LIZIZ, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) 7), true));
        } else {
            if (this.LLILLJJLI) {
                c0mae2.LIZLLL("StickyHeaderItemKey", null, new C19719212De(1405423738, new C0MAG(this.LLIZ, this.LL, this.LLIZLLLIL), true));
            }
            c0mae2.LIZIZ(null, null, new C19719212De(1177343425, new C1671120taY(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLILLJJLI, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LL, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL), true));
        }
        return Unit.LIZ;
    }
}
