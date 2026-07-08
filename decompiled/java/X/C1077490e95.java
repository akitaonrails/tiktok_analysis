package X;

import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;
import com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e95, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077490e95 implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$1(C1077490e95 c1077490e95) {
    }

    public static final /* synthetic */ void LIZIZ$2(C1077490e95 c1077490e95) {
    }

    public static final /* synthetic */ void LIZIZ$3(C1077490e95 c1077490e95) {
    }

    public static final /* synthetic */ void LIZIZ$4(C1077490e95 c1077490e95) {
    }

    public static final /* synthetic */ void LIZIZ$5(C1077490e95 c1077490e95) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
            case 5:
                LIZ$5(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZIZ() throws Throwable {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            case 4:
                LIZIZ$4(this);
                break;
            case 5:
                LIZIZ$5(this);
                break;
        }
    }

    public static final void LIZ$0(C1077490e95 c1077490e95) throws Throwable {
        C2204961BRm.d((AwemeAuthorizeLoginActivity) c1077490e95.l0, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOW4ZpHPySYmE3cSt9He73So2Bd5MmMYdOyFoqLq8cUHlHW7KNRMTJlr", null));
        ((AwemeAuthorizeLoginActivity) c1077490e95.l0).finish();
    }

    public static final void LIZ$1(C1077490e95 c1077490e95) {
        C19EG activity;
        if ((C1585030rLh.LJJ() || C1585030rLh.LJJI()) && (activity = ((UnloginSignUpFragment) c1077490e95.l0).getActivity()) != null) {
            ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(activity);
            if (!Intrinsics.LJFF(scrollSwitchStateManagerLIZIZ.wQ2(), "page_feed")) {
                scrollSwitchStateManagerLIZIZ.LL.setValue(scrollSwitchStateManagerLIZIZ.EQ2("page_feed"));
            }
        }
        TabChangeManager.xQ2(C343710Ddh.LIZ(((UnloginSignUpFragment) c1077490e95.l0).getActivity()), C1593730rZj.LIZIZ.LJFF(), false, null, 30);
    }

    public static final void LIZ$2(C1077490e95 c1077490e95) {
        C486860J7k.LIZIZ((C19EG) c1077490e95.l0).kE0("page_feed", false);
        TabChangeManager.xQ2(C343710Ddh.LIZ((C19EG) c1077490e95.l0), "HOME", false, null, 30);
    }

    public static final void LIZ$3(C1077490e95 c1077490e95) {
        TabChangeManager.xQ2(C343710Ddh.LIZ(C1388190mED.LIZIZ(((C1255210ilj) c1077490e95.l0).LL)), C1593730rZj.LIZIZ.LJFF(), false, null, 30);
    }

    public static final void LIZ$4(C1077490e95 c1077490e95) {
        C486860J7k.LIZIZ((C19EG) c1077490e95.l0).kE0("page_feed", false);
        TabChangeManager.xQ2(C343710Ddh.LIZ((C19EG) c1077490e95.l0), "HOME", false, null, 30);
    }

    public static final void LIZ$5(C1077490e95 c1077490e95) {
        FeedFragment feedFragment;
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        C19EG c19eg = (C19EG) c1077490e95.l0;
        if (c19eg != null) {
            Fragment fragmentKi = c446900Hfk.LIZ(c19eg).Ki("FRIENDS_FEED");
            if ((fragmentKi instanceof FeedFragment) && (feedFragment = (FeedFragment) fragmentKi) != null) {
                feedFragment.Oi(false);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void LIZIZ$0(C1077490e95 c1077490e95) throws Throwable {
        C2204961BRm.d((AwemeAuthorizeLoginActivity) c1077490e95.l0, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOW4ZpHPySYmE3cSt9He73So2Bd5MmMYdOyFoqLq8cUHlHW7KNRMTJlr", null));
        ((AwemeAuthorizeLoginActivity) c1077490e95.l0).finish();
    }

    public C1077490e95(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
