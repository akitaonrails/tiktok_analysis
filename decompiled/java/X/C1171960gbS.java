package X;

import Y.AfS187S0100000_18;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0gbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171960gbS implements C0O2O {
    public final String LL;
    public C1389910mGz LLILLJJLI;
    public C11JF LLILZ;
    public final C1171580gaq LLILLL = new C1171580gaq(this);
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(143));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(142));

    public final AbstractC1604130rqV LIZ() {
        return (AbstractC1604130rqV) this.LLILZLL.getValue();
    }

    public final boolean LIZIZ() {
        return ((Boolean) this.LLILZIL.getValue()).booleanValue();
    }

    public final void LIZJ() {
        LIZ().LJ("FavoriteToastSession onDismiss");
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber(this);
        }
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILLJJLI = null;
    }

    public C1171960gbS(String str) {
        this.LL = str;
    }

    public final void LIZLLL(C1389910mGz c1389910mGz) {
        LIZ().LJ("FavoriteToastSession onShow");
        this.LLILLJJLI = c1389910mGz;
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).addSubscriber(this);
        }
        EventBus.LIZLLL().LJIJJ(this);
        if (LIZIZ()) {
            this.LLILZ = C1906580ziK.LIZJ().LJIIIZ().LJLLLLLL(new AfS187S0100000_18(this, 14));
        }
    }

    @C14EU
    public final void onBaseListFragmentPanelVideoChangeEvent(C1D01 c1d01) {
        String aid;
        if (!LIZIZ()) {
            return;
        }
        LIZ().LJIIIZ("FavoriteToastSession onBaseListFragmentPanelVideoChangeEvent");
        Aweme aweme = c1d01.LIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, this.LL)) {
            C1389910mGz c1389910mGz = this.LLILLJJLI;
            if (c1389910mGz != null) {
                c1389910mGz.LIZJ();
            }
            LIZJ();
        }
    }

    @C14EU
    public final void onCollectAwemeEvent(C731710Sn3 c731710Sn3) {
        AbstractC1604130rqV abstractC1604130rqVLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FavoriteToastSession onCollectAwemeEvent: id: ");
        sbLIZ.append(c731710Sn3.LIZ);
        sbLIZ.append(", action: ");
        sbLIZ.append(c731710Sn3.LIZIZ);
        abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c731710Sn3.LIZIZ == 0 && Intrinsics.LJFF(c731710Sn3.LIZ, this.LL)) {
            C1389910mGz c1389910mGz = this.LLILLJJLI;
            if (c1389910mGz != null) {
                c1389910mGz.LIZJ();
            }
            LIZJ();
        }
    }

    @C14EU
    public final void onFullFeedFragmentLifeCycleEvent(C1568310quj c1568310quj) {
        if (!LIZIZ()) {
            return;
        }
        LIZ().LJIIIZ("FavoriteToastSession onFullFeedFragmentLifeCycleEvent");
        C1389910mGz c1389910mGz = this.LLILLJJLI;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
        LIZJ();
    }

    @C14EU
    public final void onTabChangeEvent(C0R6M c0r6m) {
        if (!LIZIZ()) {
            return;
        }
        LIZ().LJIIIZ("FavoriteToastSession onTabChangeEvent");
        C1389910mGz c1389910mGz = this.LLILLJJLI;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
        LIZJ();
    }

    @C14EU
    public final void onTabSwitchEvent(C0RHA c0rha) {
        if (!LIZIZ()) {
            return;
        }
        LIZ().LJIIIZ("FavoriteToastSession onTabSwitchEvent");
        C1389910mGz c1389910mGz = this.LLILLJJLI;
        if (c1389910mGz != null) {
            c1389910mGz.LIZJ();
        }
        LIZJ();
    }

    @Override // X.C0O2O
    public final void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        AbstractC1604130rqV abstractC1604130rqVLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FavoriteToastSession onAwemeCollectionStateChange: id: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newState: ");
        sbLIZ.append(z);
        abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            if (Intrinsics.LJFF(str, this.LL)) {
                C1389910mGz c1389910mGz = this.LLILLJJLI;
                if (c1389910mGz != null) {
                    c1389910mGz.LJII(false);
                }
                C1389910mGz c1389910mGz2 = this.LLILLJJLI;
                if (c1389910mGz2 != null) {
                    c1389910mGz2.LIZJ();
                }
                LIZJ();
            }
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber(this);
        }
    }

    @Override // X.InterfaceC612260Nzs
    public final void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) {
        Wz(str, bool.booleanValue(), enumC612200Nzm);
    }
}
