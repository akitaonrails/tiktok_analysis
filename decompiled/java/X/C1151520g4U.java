package X;

import android.util.SparseIntArray;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.chatroom.banner.data.BannerDisplayParam;
import com.bytedance.android.livesdk.chatroom.banner.panel.BannerPanelFragment;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0g4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151520g4U extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 2:
                onPageScrollStateChanged$0(this, i);
                break;
            case 3:
            default:
                super.onPageScrollStateChanged(i);
                break;
            case 4:
                onPageScrollStateChanged$1(this, i);
                break;
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        if (4 - this.$t != 0) {
            super.onPageScrolled(i, f, i2);
        } else {
            onPageScrolled$0(this, i, f, i2);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            case 3:
                onPageSelected$3(this, i);
                break;
            case 4:
                onPageSelected$4(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C1151520g4U(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C1151520g4U c1151520g4U, int i) {
        if (i == 1) {
            C1098550eh3 c1098550eh3 = (C1098550eh3) c1151520g4U.l0;
            AnonymousClass0956 anonymousClass0956 = c1098550eh3.LLJJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c1098550eh3.LLJJ = null;
        }
    }

    public static final void onPageScrollStateChanged$1(C1151520g4U c1151520g4U, int i) {
        C1103880epe c1103880epe = (C1103880epe) c1151520g4U.l0;
        c1103880epe.LLJILJILJ = true;
        if (i != 0) {
            if (i == 1 && !c1103880epe.LLJILJIL && c1103880epe.LLIZLLLIL.getItemCount() > 1) {
                ((C1103880epe) c1151520g4U.l0).LJ("horizontal_slide", null);
                ((C1103880epe) c1151520g4U.l0).LLJILJIL = true;
                return;
            }
            return;
        }
        c1103880epe.LLJILJIL = false;
    }

    public static final void onPageSelected$0(C1151520g4U c1151520g4U, int i) {
        BannerPanelItem bannerPanelItem;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List<BannerPanelItem> list = ((BannerPanelFragment) c1151520g4U.l0).LLJZ;
        if (list != null && ListProtector.get(list, i) != null) {
            List<BannerPanelItem> list2 = ((BannerPanelFragment) c1151520g4U.l0).LLJZ;
            String str6 = null;
            if (list2 != null) {
                bannerPanelItem = (BannerPanelItem) C13LP.LJJJLZIJ(i, list2);
            } else {
                bannerPanelItem = null;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_banner_multi_tab_enter");
            c474500IjALIZ.LJIL();
            if (bannerPanelItem != null) {
                str = bannerPanelItem.bannerId;
            } else {
                str = null;
            }
            c474500IjALIZ.LJJII(str, "banner_id");
            c474500IjALIZ.LJJII(((BannerPanelFragment) c1151520g4U.l0).LLJLLL, "enter_banner_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "banner_detail_position");
            c474500IjALIZ.LJJII("live_take_detail", "banner_page");
            String str7 = "";
            if (bannerPanelItem == null || (str2 = bannerPanelItem.activityId) == null) {
                str2 = "";
            }
            c474500IjALIZ.LJJII(str2, "activity_id");
            if (bannerPanelItem != null && (str5 = bannerPanelItem.bannerType) != null) {
                str7 = str5;
            }
            c474500IjALIZ.LJJII(str7, "banner_type");
            if (bannerPanelItem != null) {
                str3 = bannerPanelItem.schema;
            } else {
                str3 = null;
            }
            c474500IjALIZ.LJJII(str3, "next_page_url");
            if (bannerPanelItem != null) {
                str6 = bannerPanelItem.title;
            }
            c474500IjALIZ.LJJII(str6, "tab_name");
            c474500IjALIZ.LJJII("click", "action_type");
            BannerPanelFragment bannerPanelFragment = (BannerPanelFragment) c1151520g4U.l0;
            if (bannerPanelFragment.LLJZIJLIL) {
                str4 = "anchor";
            } else if (bannerPanelFragment.LLL) {
                str4 = "admin";
            } else {
                str4 = "viewer";
            }
            c474500IjALIZ.LJJII(str4, "user_type");
            c474500IjALIZ.LIZ();
        }
    }

    public static final void onPageSelected$1(C1151520g4U c1151520g4U, int i) {
        C1098550eh3 c1098550eh3 = (C1098550eh3) c1151520g4U.l0;
        c1098550eh3.LLJJIJIL = false;
        SparseIntArray sparseIntArray = c1098550eh3.LLJJJJLIIL;
        int size = i % c1098550eh3.LLILLJJLI.size();
        C1098550eh3 c1098550eh32 = (C1098550eh3) c1151520g4U.l0;
        sparseIntArray.put(size, c1098550eh32.LLJJJJLIIL.get(i % c1098550eh32.LLILLJJLI.size()) + 1);
    }

    public static final void onPageSelected$2(C1151520g4U c1151520g4U, int i) {
        Object c098200Yq;
        float f;
        int i2;
        boolean z = false;
        ((C1098550eh3) c1151520g4U.l0).LLJJL = false;
        C1098550eh3 c1098550eh3 = (C1098550eh3) c1151520g4U.l0;
        AnonymousClass0956 anonymousClass0956 = c1098550eh3.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c1098550eh3.LLJJ = null;
        Pair<Integer, BannerInRoom> pairLJJI = ((C1098550eh3) c1151520g4U.l0).LJJI();
        if (pairLJJI == null) {
            return;
        }
        BannerInRoom second = pairLJJI.getSecond();
        C1098550eh3 c1098550eh32 = (C1098550eh3) c1151520g4U.l0;
        if (c1098550eh32.LLJI && c1098550eh32.LLJIJIL.invoke(second).booleanValue()) {
            return;
        }
        if (second.displayStyle == 1) {
            z = true;
        }
        if (z) {
            C1098550eh3 c1098550eh33 = (C1098550eh3) c1151520g4U.l0;
            C500260Jjc.LJJJJJ(c1098550eh33.LLJ, null, new C1098530eh1(c1098550eh33, second, null), 3);
            return;
        }
        C1098550eh3 c1098550eh34 = (C1098550eh3) c1151520g4U.l0;
        c1098550eh34.getClass();
        try {
            c098200Yq = (BannerDisplayParam) C19748512Ol.LIZIZ.LJII(second.displayParam, BannerDisplayParam.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        BannerDisplayParam bannerDisplayParam = (BannerDisplayParam) c098200Yq;
        if (bannerDisplayParam == null) {
            return;
        }
        if (c1098550eh34.LLILLL) {
            f = c1098550eh34.LLJJI;
            i2 = bannerDisplayParam.hostDisplayParam.LIZ.progressPercent;
        } else {
            f = c1098550eh34.LLJJI;
            i2 = bannerDisplayParam.guestDisplayParam.expandParam.progressPercent;
        }
        c1098550eh34.LLJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c1098550eh34.LLJ), null, null, new C1098560eh4((long) (f * (i2 / 100)), c1098550eh34, second, i, null), 3);
    }

    public static final void onPageSelected$3(C1151520g4U c1151520g4U, int i) {
        C1114250f6N c1114250f6N = (C1114250f6N) c1151520g4U.l0;
        C1114260f6O c1114260f6O = c1114250f6N.LLILZIL;
        if (c1114260f6O != null) {
            c1114260f6O.LIZIZ(((AbstractC1114240f6M) ListProtector.get(c1114250f6N.LLIZ, i)).I5());
        }
        C1114250f6N c1114250f6N2 = (C1114250f6N) c1151520g4U.l0;
        if (!c1114250f6N2.LLJJI) {
            c1114250f6N2.i0(((AbstractC1114240f6M) ListProtector.get(c1114250f6N2.LLIZ, i)).I5());
        }
        boolean z = true;
        if (((AbstractC1114240f6M) ListProtector.get(((C1114250f6N) c1151520g4U.l0).LLIZ, i)).I5() == 2) {
            C1114250f6N c1114250f6N3 = (C1114250f6N) c1151520g4U.l0;
            InterfaceC1095590ecH interfaceC1095590ecH = c1114250f6N3.LLILLL;
            C1110180ezo c1110180ezo = c1114250f6N3.LLILZ;
            if (!c1110180ezo.LLILZIL && (!c1110180ezo.LLILZLL || !c1110180ezo.LLIZ)) {
                z = false;
            }
            interfaceC1095590ecH.LIZIZ(z);
        } else if (((AbstractC1114240f6M) ListProtector.get(((C1114250f6N) c1151520g4U.l0).LLIZ, i)).I5() == 3) {
            C1114250f6N c1114250f6N4 = (C1114250f6N) c1151520g4U.l0;
            InterfaceC1095590ecH interfaceC1095590ecH2 = c1114250f6N4.LLILLL;
            C1110180ezo c1110180ezo2 = c1114250f6N4.LLILZ;
            if (!c1110180ezo2.LLILZIL && !c1110180ezo2.LLJ) {
                z = false;
            }
            interfaceC1095590ecH2.LIZIZ(z);
        }
        ((C1114250f6N) c1151520g4U.l0).LLJJI = false;
    }

    public static final void onPageSelected$4(C1151520g4U c1151520g4U, int i) {
        C434320H1i c434320H1i = ((C1103880epe) c1151520g4U.l0).LLILZIL;
        c434320H1i.getClass();
        c434320H1i.LLILLL = Math.min(Math.max(0, i), Math.max(0, c434320H1i.LLILLJJLI - 1));
        c434320H1i.LLILZ = 0.0f;
        c434320H1i.invalidate();
        ((C1103880epe) c1151520g4U.l0).getViewState().LIZJ.setValue(Integer.valueOf(i));
        C1103880epe c1103880epe = (C1103880epe) c1151520g4U.l0;
        if (i != c1103880epe.LLJIJIL) {
            c1103880epe.LLJIJIL = i;
            c1103880epe.LJFF(i);
        }
    }

    public static final void onPageScrolled$0(C1151520g4U c1151520g4U, int i, float f, int i2) {
        C434320H1i c434320H1i = ((C1103880epe) c1151520g4U.l0).LLILZIL;
        c434320H1i.getClass();
        c434320H1i.LLILLL = Math.min(Math.max(0, i), Math.max(0, c434320H1i.LLILLJJLI - 1));
        float fMax = 0.0f;
        if (c434320H1i.LLILLJJLI > 0) {
            fMax = Math.max(0.0f, Math.min(f, 1.0f));
        }
        c434320H1i.LLILZ = fMax;
        c434320H1i.invalidate();
    }
}
