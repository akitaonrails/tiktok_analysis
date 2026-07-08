package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.IStandardModelProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0Rkk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704800Rkk implements InterfaceC705570Rlz {
    public final Function0<String> LL;
    public final Function0<String> LLILLJJLI;
    public final Function0<C690870R8b> LLILLL;
    public final Function0<FeedComponentPriorityData> LLILZ;
    public final FrameLayout LLILZIL;
    public final Function0<C698920RbG> LLILZLL;
    public final Map<String, C704970Rl1> LLIZ = new LinkedHashMap();
    public C704970Rl1 LLIZLLLIL;
    public C704830Rkn LLJ;
    public IStandardModelProvider LLJI;
    public Set<InterfaceC705580Rm0> LLJIJIL;
    public Function1<? super View, Unit> LLJILJIL;

    @Override // X.InterfaceC1393670mN3
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC705550Rlx
    public final View LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public final View LJ() {
        return null;
    }

    @Override // X.InterfaceC1393670mN3
    public final void LJFF() {
    }

    @Override // X.InterfaceC705550Rlx
    public final void LJI(int i) {
    }

    @Override // X.InterfaceC705550Rlx
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC704780Rki
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIIJJI() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIILIIL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public final View LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public final TuxIconView LJIILL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIILLIIL() {
        return null;
    }

    @Override // X.InterfaceC704780Rki
    public final void LJIIZILJ(InterfaceC704770Rkh interfaceC704770Rkh) {
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIJ() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public final View LJIJJ() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public final void LJIJJLI(double d) {
    }

    @Override // X.InterfaceC705550Rlx
    public final TextView LJIL() {
        return null;
    }

    @Override // X.InterfaceC705550Rlx
    public final SmartImageView LJJ() {
        return null;
    }

    @Override // X.InterfaceC704780Rki
    public final void LJJI(AwS555S0100000_11 awS555S0100000_11) {
    }

    @Override // X.InterfaceC704780Rki
    public final void onDestroy() {
    }

    @Override // X.InterfaceC705550Rlx
    public final void setAnimationBundle(C705850RmR c705850RmR) {
    }

    @Override // X.InterfaceC705550Rlx
    public final void setCommodityCard(C0R5I c0r5i) {
    }

    @Override // X.InterfaceC705550Rlx
    public final void setInteceptorTouchAction(Function0<Unit> function0) {
    }

    @Override // X.InterfaceC704780Rki
    public final void LIZ() {
        C705340Rlc c705340Rlc;
        C704970Rl1 c704970Rl1 = this.LLIZLLLIL;
        if (c704970Rl1 != null) {
            c704970Rl1.LJIIJJI();
        }
        C704830Rkn c704830Rkn = this.LLJ;
        if (c704830Rkn == null || (c705340Rlc = c704830Rkn.LJI) == null) {
            return;
        }
        EventBus.LIZLLL().LJJI(c705340Rlc);
    }

    @Override // X.InterfaceC704780Rki
    public final void LJIIJ() {
        C705340Rlc c705340Rlc;
        C704830Rkn c704830Rkn = this.LLJ;
        if (c704830Rkn != null && (c705340Rlc = c704830Rkn.LJI) != null) {
            EventBus.LIZLLL().LJIJJ(c705340Rlc);
        }
        C704970Rl1 c704970Rl1 = this.LLIZLLLIL;
        if (c704970Rl1 != null) {
            c704970Rl1.LJIIJ();
        }
    }

    @Override // X.InterfaceC705570Rlz
    public final String getAwemeId() {
        Aweme awemeProviderAweme;
        IStandardModelProvider iStandardModelProvider = this.LLJI;
        if (iStandardModelProvider == null || (awemeProviderAweme = iStandardModelProvider.providerAweme()) == null) {
            return null;
        }
        return awemeProviderAweme.getAid();
    }

    @Override // X.InterfaceC705550Rlx
    public final Map<String, String> getStayTimeBizExtraMap() {
        C704840Rko c704840Rko;
        Map<String, String> map;
        C704970Rl1 c704970Rl1 = this.LLIZLLLIL;
        if (c704970Rl1 == null || (c704840Rko = c704970Rl1.LJII) == null || (map = c704840Rko.LJIIIZ) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020d  */
    @Override // X.InterfaceC704780Rki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind() {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C704800Rkk.onBind():void");
    }

    @Override // X.InterfaceC705550Rlx
    public final View rootView() {
        C704970Rl1 c704970Rl1 = this.LLIZLLLIL;
        if (c704970Rl1 != null) {
            return c704970Rl1.LJI;
        }
        return null;
    }

    @Override // X.InterfaceC704780Rki
    public final void unBind() {
        C704970Rl1 c704970Rl1 = this.LLIZLLLIL;
        if (c704970Rl1 != null) {
            c704970Rl1.LJIILIIL();
        }
        this.LLIZLLLIL = null;
        this.LLJI = null;
    }

    @Override // X.InterfaceC704780Rki
    public final void onCreated() {
        for (IStandardConfigProvider iStandardConfigProvider : ServiceManager.get().getServices(IStandardConfigProvider.class)) {
            Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> mapI5 = iStandardConfigProvider.I5();
            if (mapI5 != null) {
                for (Map.Entry<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> entry : mapI5.entrySet()) {
                    C601840Nj4.LIZ(iStandardConfigProvider.o7(), entry.getKey(), entry.getValue());
                }
            }
        }
    }

    @Override // X.InterfaceC705550Rlx
    public final View LJIIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC705570Rlz
    public final Set<InterfaceC705580Rm0> getAnchorShowListeners() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1393670mN3
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        C705560Rly.LIZIZ(this);
        return false;
    }

    @Override // X.InterfaceC1393670mN3
    public final void LJII(AbstractC707180Roa abstractC707180Roa) {
        C705560Rly.LIZ(this, abstractC707180Roa);
    }

    @Override // X.InterfaceC704780Rki
    public final void LJIJI(IStandardModelProvider iStandardModelProvider) {
        this.LLJI = iStandardModelProvider;
    }

    @Override // X.InterfaceC705570Rlz
    public final void setAnchorShowListeners(Set<InterfaceC705580Rm0> set) {
        this.LLJIJIL = set;
    }

    @Override // X.InterfaceC705550Rlx
    public final void setLegacyContentClickListener(Function1<? super View, Unit> function1) {
        this.LLJILJIL = function1;
    }

    public C704800Rkk(AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112, AwS555S0100000_11 awS555S0100000_113, AwS555S0100000_11 awS555S0100000_114, FrameLayout frameLayout, AwS555S0100000_11 awS555S0100000_115) {
        this.LL = awS555S0100000_11;
        this.LLILLJJLI = awS555S0100000_112;
        this.LLILLL = awS555S0100000_113;
        this.LLILZ = awS555S0100000_114;
        this.LLILZIL = frameLayout;
        this.LLILZLL = awS555S0100000_115;
    }
}
