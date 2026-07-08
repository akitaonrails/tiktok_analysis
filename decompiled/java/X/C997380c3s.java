package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0c3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997380c3s extends AbstractC988340bpI implements Observer<C0RD4> {
    public static final String LLJJ = C997380c3s.class.getSimpleName();
    public final ViewStub LLJILJIL;
    public FrameLayout LLJILJILJ;
    public C997400c3u LLJILLL;

    @Override // X.AbstractC988340bpI
    public final void LJI() {
    }

    @Override // X.AbstractC988340bpI
    public final void LJIIIZ() {
    }

    @Override // X.AbstractC988340bpI
    public final void LJIIJJI() {
    }

    @Override // X.AbstractC988340bpI
    public final int LIZLLL() {
        return this.LLJILLL != null ? C997400c3u.LIZ("feed_fyp_super_like") : C997400c3u.LIZIZ;
    }

    @Override // X.AbstractC988340bpI
    public final boolean LJFF() {
        return this.LLJILLL != null && C997400c3u.LIZ("feed_fyp_super_like") == 1;
    }

    @Override // X.AbstractC988340bpI
    public final void LJII() {
        if (LJIILL(this.LLILLL)) {
            return;
        }
        if (this.LLJILLL == null) {
            this.LLJILLL = new C997400c3u();
        }
        C997400c3u c997400c3u = this.LLJILLL;
        if (c997400c3u != null) {
            c997400c3u.LIZIZ();
        }
    }

    @Override // X.AbstractC988340bpI
    public final void LJIIIIZZ() {
        FrameLayout frameLayout = this.LLJILJILJ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
    }

    @Override // X.AbstractC988340bpI
    public final boolean LJIIJ() {
        View view;
        if (LJIILL(this.LLILLL) || (view = this.LLJ) == null) {
            return false;
        }
        if (view.getParent() != null) {
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
        }
        if (this.LLJILJIL.getParent() != null) {
            this.LLJILJIL.setLayoutResource(R.layout.l4);
            this.LLJILJILJ = (FrameLayout) C786410Ut5.LJLLLL(this.LLJILJIL);
        }
        FrameLayout frameLayout = this.LLJILJILJ;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJILJILJ;
        if (frameLayout2 != null) {
            frameLayout2.addView(view);
        }
        FrameLayout frameLayout3 = this.LLJILJILJ;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(0, frameLayout3);
        }
        AbstractC1028360crq abstractC1028360crq = this.LLILZLL;
        if (abstractC1028360crq == null) {
            return true;
        }
        abstractC1028360crq.LJIIJJI("event_superlike_show", null);
        return true;
    }

    public C997380c3s(ViewStub viewStub) {
        super(viewStub.getContext());
        this.LLJILJIL = viewStub;
    }

    public static final boolean LJIILL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return C1001410cAN.LIZIZ.LJFF(aweme.getAid(), EnumC1001380cAK.SUPER_LIKE_OPERATION, EnumC599900Nfw.FEED);
    }

    @Override // X.AbstractC988340bpI
    public final void LJIILIIL(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.yQ2("ad_feed_on_page_selected", this, false);
            dataCenter.yQ2("ad_feed_on_page_unselected", this, false);
        }
    }

    @Override // X.AbstractC988340bpI
    public final boolean LJIILJJIL(Aweme aweme) {
        if (aweme != null && (C1017070cZd.LLIIII(aweme) || C1017070cZd.LLIIII(aweme))) {
            return true;
        }
        this.LLILLL = null;
        return false;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        C0RD4 c0rd42 = c0rd4;
        if (LJIILJJIL(this.LLILLL) && !LJIILL(this.LLILLL) && c0rd42 != null && (str = c0rd42.LIZ) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1540531799) {
                if (iHashCode == -1132409520 && str.equals("ad_feed_on_page_selected")) {
                    EventBus.LIZLLL().LJIJJ(this);
                    return;
                }
                return;
            }
            if (!str.equals("ad_feed_on_page_unselected")) {
                return;
            }
            EventBus.LIZLLL().LJJI(this);
            C997400c3u c997400c3u = this.LLJILLL;
            if (c997400c3u != null) {
                EventBus.LIZLLL().LJJI(c997400c3u);
            }
            LJ();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPopupWindowCloseEvent(C997390c3t c997390c3t) {
        C811103Ev.LIZ(LLJJ);
        LJ();
    }

    @Override // X.AbstractC988340bpI
    public final C1028380crs LIZIZ(Context context, Aweme aweme) {
        return C1000520c8w.LIZ(context, aweme);
    }

    @Override // X.AbstractC988340bpI
    public final C1051290dSp LIZJ(Context context, Aweme aweme) {
        return C1000520c8w.LIZIZ(context, aweme);
    }

    @Override // X.AbstractC988340bpI
    public final void LJIIL(String str, boolean z) {
        String str2;
        AwemeRawAd awemeRawAd;
        Object obj;
        Integer numValueOf;
        AwemeRawAd awemeRawAd2;
        Object obj2;
        String str3 = "1";
        String aid = null;
        if (z) {
            Aweme aweme = this.LLILLL;
            if (aweme != null) {
                awemeRawAd2 = aweme.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd2);
            c1022820ciuLIZLLL.LIZJ("superlike", "refer");
            C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
            if (c1001410cAN.LIZIZ()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            c1022820ciuLIZLLL.LIZIZ(obj2, "use_idle_preload");
            if (c1001410cAN.LIZIZ()) {
                Aweme aweme2 = this.LLILLL;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                }
                C1001420cAO c1001420cAOLJIIIIZZ = c1001410cAN.LJIIIIZZ(aid, EnumC1001380cAK.SUPER_LIKE_OPERATION, EnumC599900Nfw.FEED);
                if (c1001420cAOLJIIIIZZ == null || !c1001420cAOLJIIIIZZ.LIZ()) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c1022820ciuLIZLLL.LIZIZ(str3, "idle_preload_status");
            }
            c1022820ciuLIZLLL.LJII();
            return;
        }
        if (LJIILL(this.LLILLL)) {
            str2 = "idle_preload_fail";
        } else {
            str2 = str;
        }
        Aweme aweme3 = this.LLILLL;
        if (aweme3 != null) {
            awemeRawAd = aweme3.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
        c1022820ciuLIZLLL2.LIZJ("superlike", "refer");
        c1022820ciuLIZLLL2.LIZIZ(str2, "fail_reason");
        if (Intrinsics.LJFF(str, "load_timeout")) {
            if (this.LLJILLL != null) {
                numValueOf = Integer.valueOf(C997400c3u.LIZ("feed_fyp_super_like"));
            } else {
                numValueOf = null;
            }
            c1022820ciuLIZLLL2.LIZIZ(numValueOf, "failed_reason_status");
        }
        C1001410cAN c1001410cAN2 = C1001410cAN.LIZIZ;
        if (c1001410cAN2.LIZIZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c1022820ciuLIZLLL2.LIZIZ(obj, "use_idle_preload");
        if (c1001410cAN2.LIZIZ()) {
            Aweme aweme4 = this.LLILLL;
            if (aweme4 != null) {
                aid = aweme4.getAid();
            }
            C1001420cAO c1001420cAOLJIIIIZZ2 = c1001410cAN2.LJIIIIZZ(aid, EnumC1001380cAK.SUPER_LIKE_OPERATION, EnumC599900Nfw.FEED);
            if (c1001420cAOLJIIIIZZ2 == null || !c1001420cAOLJIIIIZZ2.LIZ()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c1022820ciuLIZLLL2.LIZIZ(str3, "idle_preload_status");
        }
        c1022820ciuLIZLLL2.LJII();
    }
}
