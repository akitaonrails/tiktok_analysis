package X;

import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0zwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915530zwl implements InterfaceC486470J5x {
    public static final C1915530zwl LL = new C1915530zwl();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1915570zwp());
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C1915560zwo());
    public static boolean LLILZ;
    public static boolean LLILZIL;
    public static final Keva LLILZLL;
    public static final C01GW LLIZ;
    public static boolean LLIZLLLIL;

    static {
        Keva repo = Keva.getRepo("non_personalized_experience");
        LLILZLL = repo;
        LLIZ = C452501pT.LIZIZ(new C1915610zwt());
        boolean z = false;
        LLILZIL = repo.getBoolean("is_eligible", false);
        boolean z2 = repo.getBoolean("action_list_urls_exist", false);
        if (LLILZIL && z2) {
            z = true;
        }
        LLILZ = z;
    }

    public final void LIZLLL() {
        LLILZLL.clear();
        LLILZ = false;
        LLILZIL = false;
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.01nU
            public static void LIZ() {
                Pair pair;
                Fragment fragmentLIZLLL;
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZLLL);
                    c1389890mGx.LJIIIZ(2131838203);
                    c1389890mGx.LJIIJJI();
                }
                try {
                    try {
                        pair = new Pair("enter_from", ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        pair = new Pair("enter_from", "");
                    }
                    C20684815ws.LJIILLIIL("show_teen_personalization_on_toast", C2097908Jt.LIZJ(pair));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20684815ws.LJIILLIIL("show_teen_personalization_on_toast", C2097908Jt.LIZJ(new Pair("enter_from", "")));
                    throw th;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NonPersonalizedServiceHelper@3953.showNpeDeactivationToast$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NonPersonalizedServiceHelper@3953.showNpeDeactivationToast$1");
            }
        });
        C1440005kM.LIZ(new C1588880rRu("turn_off_non_personalize", false));
        LIZ();
        if (LLIZLLLIL) {
            LLIZLLLIL = false;
            ((C2203431BLp) LLIZ.getValue()).LJIIIZ(this);
        }
    }

    public static void LIZ() {
        Fragment fragmentLIZLLL;
        C19EG activity;
        HomeTabAbility homeTabAbility;
        List<TopTabProtocol> listB9;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) == null || (activity = fragmentLIZLLL.getActivity()) == null) {
            return;
        }
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(activity, null), MainActivityScope.class);
            Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(HomeTabAbility.class) : null;
            homeTabAbility = (HomeTabAbility) (ability instanceof HomeTabAbility ? ability : null);
        } else {
            homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(activity, null), HomeTabAbility.class, null);
        }
        if (homeTabAbility == null || (listB9 = homeTabAbility.b9()) == null) {
            return;
        }
        Iterator it2 = ((ArrayList) C13EQ.LJJIJL(listB9, InterfaceC1566990qsb.class)).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1566990qsb) it2.next()).LIZ();
        }
    }

    public static boolean LIZJ(DecisionMakerNetworkApi.EligibilityModel eligibilityModel) {
        String str = eligibilityModel.idValue;
        if (Intrinsics.LJFF(str, "ca_no_personalized_go_rule")) {
            return eligibilityModel.isEligible();
        }
        if (Intrinsics.LJFF(str, "personalized_feeds") && !eligibilityModel.isEligible()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg.LIZ().length == 0 || !Intrinsics.LJFF(new String(wsChannelMsg.LIZ(), Charsets.UTF_8), "tiktok_pns_ca_u18_non_personalization_success")) {
            return;
        }
        LIZLLL();
    }
}
