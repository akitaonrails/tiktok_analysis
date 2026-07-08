package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.reviews.IReviewsService;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h6Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191250h6Z implements InterfaceC1191270h6b, InterfaceC1141530foN {
    public String LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public Function0<Unit> LLILZ;
    public AwS562S0100000_18 LLILZIL;
    public String LLILZLL;
    public WeakReference<AbstractC1387200mCc> LLIZLLLIL;
    public WeakReference<Activity> LLJ;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(823));
    public final AwS562S0100000_18 LLJI = new AwS562S0100000_18(this, 2767);

    @Override // X.InterfaceC1191270h6b
    public final int LJIIIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1191270h6b
    public final void LJIIJJI(C1447970nmd c1447970nmd) {
        this.LLILZ = c1447970nmd;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        boolean zLIZIZ;
        Activity activity;
        C1389880mGw c1389880mGw;
        AbstractC1387200mCc abstractC1387200mCc;
        View viewLJI;
        String strLJFF;
        if (Intrinsics.LJFF(c262100zr.LIZ, "closeReviewSubmitPage")) {
            String str = this.LL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            InterfaceC1191270h6b.LJJLIIIJILLIZJL.getClass();
            C1191260h6a.LIZIZ.remove(str);
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            boolean zLIZIZ2 = false;
            if (interfaceC1107590evd != null) {
                zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd, "isSubmitReviewSuccess", false);
            } else {
                zLIZIZ = false;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "originalPostSource", "")) != null) {
                str2 = strLJFF;
            }
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null) {
                zLIZIZ2 = C1871910yoP.LIZIZ(interfaceC1107590evd3, "isFinalPage", false);
            }
            if (((AbstractC1189550h3p) C1190930h63.class.newInstance()).LIZIZ(str2) && zLIZIZ2) {
                C1548820qPI.LJIIIIZZ("closeReviewSubmitPage", this);
                if (zLIZIZ) {
                    WeakReference<AbstractC1387200mCc> weakReference = this.LLIZLLLIL;
                    if (weakReference != null && (abstractC1387200mCc = weakReference.get()) != null && (viewLJI = abstractC1387200mCc.LJI()) != null) {
                        c1389880mGw = new C1389880mGw(viewLJI);
                    } else {
                        WeakReference<Activity> weakReference2 = this.LLJ;
                        if (weakReference2 != null && (activity = weakReference2.get()) != null) {
                            c1389880mGw = new C1389880mGw(activity);
                        } else {
                            this.LLILLJJLI = 5;
                            Function0<Unit> function0 = this.LLILZ;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            this.LLILZ = null;
                            return;
                        }
                    }
                    c1389880mGw.LJIIIZ(C20642515q3.LJI(2131849275));
                    c1389880mGw.LJ(R.raw.icon_tick_fill);
                    c1389880mGw.LJI(R.attr.ee);
                    c1389880mGw.LIZJ(this.LLJI);
                    c1389880mGw.LJIIJ();
                    return;
                }
                this.LLILLJJLI = 5;
                Function0<Unit> function02 = this.LLILZ;
                if (function02 != null) {
                    function02.invoke();
                }
                this.LLILZ = null;
            }
        }
    }

    @Override // X.InterfaceC1191270h6b
    public final void LJIIJ(final C19EG c19eg, final AbstractC1387200mCc abstractC1387200mCc, final PoiData poiData, final String str, final String str2) {
        PoiReviewFrequencyControl.FriendPage friendPage;
        PoiReviewFrequencyControl.Frequency frequency;
        ((INearbyFeedService) ServiceManager.get().getService(INearbyFeedService.class)).LJIILL();
        if (poiData == null) {
            this.LLILLJJLI = 2;
            return;
        }
        final String str3 = poiData.poiId;
        if (str3 == null) {
            return;
        }
        if (((IReviewsService) ServiceManager.get().getService(IPoiService.class)).isFriendPageUnifyFreqHit()) {
            this.LLILLJJLI = 2;
            return;
        }
        if (((IReviewsService) ServiceManager.get().getService(IPoiService.class)).isTightenFriendPageDailyFreqHit() || ((IReviewsService) ServiceManager.get().getService(IPoiService.class)).isTightenFriendPageWeeklyFreqHit()) {
            return;
        }
        this.LL = str3;
        this.LLILLJJLI = 1;
        PoiReviewFrequencyControl.LIZ.getClass();
        PoiReviewFrequencyControl.InnerConfig innerConfigLIZ = PoiReviewFrequencyControl.LIZ();
        if (innerConfigLIZ != null && (friendPage = innerConfigLIZ.friendPage) != null && (frequency = friendPage.poi) != null) {
            int i = frequency.frequencyDay;
            int i2 = frequency.frequencyTimes;
            String strLIZLLL = PoiReviewFrequencyControl.LIZLLL("ts_poi_write_review_toast", str3);
            Keva keva = PoiReviewFrequencyControl.LIZIZ;
            if (System.currentTimeMillis() - keva.getLong(strLIZLLL, 0L) <= ((long) (i * 24 * 60 * 60)) * 1000 && keva.getInt(PoiReviewFrequencyControl.LIZLLL("count_poi_write_review_toast", str3), 0) >= i2) {
                this.LLILLJJLI = 2;
                return;
            }
        }
        PoiReviewsApi.LIZ.getClass();
        C0NBH.LIZ(C1172760gck.LIZ().isReviewEligible(str3, EnumC1186570gz1.FRIEND_PAGE.getValue(), str2)).LJJLL(new C09JN() { // from class: X.0h6X
            /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x022c  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r39) {
                /*
                    Method dump skipped, instruction units count: 603
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1191230h6X.accept(java.lang.Object):void");
            }
        }, new C516201zk(this, 362));
    }
}
