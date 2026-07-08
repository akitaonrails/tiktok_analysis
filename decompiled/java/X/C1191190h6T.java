package X;

import Y.ACListenerS153S0100000_18;
import Y.ARunnableS118S0100000_18;
import Y.ATListenerS451S0100000_18;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi.reviews.IReviewsService;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS597S0100000_18;
import mf.a;

/* JADX INFO: renamed from: X.0h6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191190h6T extends ConstraintLayout implements InterfaceC1192370h8N {
    public TuxIconView btnClose;
    public Function0<Unit> closeAction;
    public String collectInfo;
    public Aweme currentAweme;
    public String eligibleExtraInfo;
    public String enterFrom;
    public String incentiveType;
    public TuxIconView ivPoiIcon;
    public String poiId;
    public String poiName;
    public C1203270hPx poiRating;
    public final Runnable resetStarRunnable;
    public PoiReviewsApi.PoiReviewEntrance reviewEntranceObject;
    public Function0<Unit> starSelectedAction;
    public TuxTextView tvHead;
    public TuxTextView tvPoiName;

    @Override // X.InterfaceC1192370h8N
    public void resetStar() {
        C1203270hPx c1203270hPx = this.poiRating;
        if (c1203270hPx == null) {
            c1203270hPx = null;
        }
        c1203270hPx.setValue(0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.tvPoiName = (TuxTextView) findViewById(R.id.tv_poi_name);
        this.btnClose = (TuxIconView) findViewById(R.id.lc0);
        this.poiRating = (C1203270hPx) findViewById(R.id.r9f);
        this.tvHead = (TuxTextView) findViewById(R.id.des);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.lrh);
        this.ivPoiIcon = tuxIconView;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = ((IPoiAnchorService) ServiceManager.get().getService(IPoiService.class)).getIconResByABExp(true);
            c419910GdJ.LJ = Integer.valueOf(R.attr.eg);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxIconView tuxIconView2 = this.btnClose;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        C786410Ut5.a9(tuxIconView2, new ACListenerS153S0100000_18(this, 102));
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_write_review_enlarge_area", false) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_write_review_enlarge_area", false) == 2) {
            View.OnClickListener aCListenerS153S0100000_18 = new ACListenerS153S0100000_18(this, 103);
            if (C1848410yCV.LIZ) {
                aCListenerS153S0100000_18 = new f(aCListenerS153S0100000_18);
            }
            a aVar = new a(aCListenerS153S0100000_18);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
        }
        C1203270hPx c1203270hPx = this.poiRating;
        if (c1203270hPx == null) {
            c1203270hPx = null;
        }
        c1203270hPx.setOnValueSelectedListener(new InterfaceC1191210h6V() { // from class: X.0h6U
            @Override // X.InterfaceC1191210h6V
            public final void LIZ(int i) {
                String aid;
                Function0<Unit> function0 = this.LIZ.starSelectedAction;
                if (function0 != null) {
                    function0.invoke();
                }
                String str = this.LIZ.poiId;
                if (str != null) {
                    PoiReviewFrequencyControl.LIZ.getClass();
                    String strLIZLLL = PoiReviewFrequencyControl.LIZLLL("ts_profile_banner_with_same_poi", str);
                    Keva keva = PoiReviewFrequencyControl.LIZIZ;
                    keva.storeLong(strLIZLLL, System.currentTimeMillis());
                    keva.storeInt(PoiReviewFrequencyControl.LIZLLL("count_profile_banner_with_same_poi", str), 0);
                }
                C1191180h6S c1191180h6S = C1191180h6S.LIZ;
                C1191190h6T c1191190h6T = this.LIZ;
                String str2 = c1191190h6T.enterFrom;
                String str3 = c1191190h6T.poiId;
                Aweme aweme = c1191190h6T.currentAweme;
                String authorUid = null;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                Aweme aweme2 = this.LIZ.currentAweme;
                if (aweme2 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme2);
                }
                String str4 = this.LIZ.collectInfo;
                Integer numValueOf = Integer.valueOf(((IReviewsService) ServiceManager.get().getService(IPoiService.class)).getTightenProfilePageWeeklyFreqTimes());
                Integer numValueOf2 = Integer.valueOf(((IReviewsService) ServiceManager.get().getService(IPoiService.class)).getTightenProfilePageDailyFreqTimes());
                C1191190h6T c1191190h6T2 = this.LIZ;
                String str5 = c1191190h6T2.incentiveType;
                PageFinder pageFinderVia = PageFinder.via((View) c1191190h6T2);
                c1191180h6S.getClass();
                C1191180h6S.LIZIZ(str2, "click_star", str3, aid, authorUid, str4, 1, numValueOf, numValueOf2, str5, pageFinderVia);
                ((IReviewsService) ServiceManager.get().getService(IPoiService.class)).tightenProfilePageWeeklyFreqClicked();
                ((IReviewsService) ServiceManager.get().getService(IPoiService.class)).tightenProfilePageDailyFreqClicked();
                this.LIZ.goReviewPostPage(i, "click_star");
            }
        });
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJFF = Integer.valueOf(R.attr.e4);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
        setBackground(c384050F3z.LIZ(getContext()));
        C2211631BhB.LJ(this, new AwS597S0100000_18(this, 500));
        if (C0A1R.LIZ()) {
            C1203270hPx c1203270hPx2 = this.poiRating;
            (c1203270hPx2 != null ? c1203270hPx2 : null).setOnTouchListener(new ATListenerS451S0100000_18(this, 10));
        }
    }

    public C1191190h6T(Context context) {
        this(context, null, 0);
    }

    @Override // X.InterfaceC1192370h8N
    public void observeCardClose(Function0<Unit> function0) {
        this.closeAction = function0;
    }

    @Override // X.InterfaceC1192370h8N
    public void observeStarSelected(Function0<Unit> function0) {
        this.starSelectedAction = function0;
    }

    public C1191190h6T(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void goReviewPostPage(int i, String str) {
        String aid;
        String str2;
        String str3 = this.poiId;
        if (str3 == null) {
            return;
        }
        String strLJJI = ((IPoiService) ServiceManager.get().getService(IPoiService.class)).LJJI("poi_review_post");
        if (strLJJI != null) {
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(strLJJI);
            sparkContext.LJJJZ("poi_id", str3);
            sparkContext.LJJJZ("poi_name", Uri.encode(this.poiName));
            withParam$poi_release(sparkContext, "enter_from", this.enterFrom);
            Aweme aweme = this.currentAweme;
            String str4 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            withParam$poi_release(sparkContext, "associated_video_id", aid);
            sparkContext.LJJJZ("enter_method", str);
            PoiReviewsApi.PoiReviewEntrance poiReviewEntrance = this.reviewEntranceObject;
            if (poiReviewEntrance != null) {
                str2 = poiReviewEntrance.extraInfo;
            } else {
                str2 = null;
            }
            String str5 = "";
            if (C123100dR.LIZ(str2)) {
                PoiReviewsApi.PoiReviewEntrance poiReviewEntrance2 = this.reviewEntranceObject;
                if (poiReviewEntrance2 != null) {
                    str4 = poiReviewEntrance2.extraInfo;
                }
            } else {
                str4 = this.eligibleExtraInfo;
                if (str4 == null) {
                    str4 = "";
                }
            }
            sparkContext.LJJJZ("review_config", Uri.encode(str4));
            String str6 = this.collectInfo;
            if (str6 != null) {
                str5 = str6;
            }
            sparkContext.LJJJZ("collect_info", Uri.encode(str5));
            sparkContext.LJJJLZIJ(2, "post_source");
            sparkContext.LJJJLZIJ(i, "review_star");
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = getContext();
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
        if (C0A1R.LIZ()) {
            HandlerHook.viewPostDelay(this, this.resetStarRunnable, 500L);
        }
    }

    public C1191190h6T(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.resetStarRunnable = new ARunnableS118S0100000_18(this, 44);
    }

    public final void withParam$poi_release(SparkContext sparkContext, String str, String str2) {
        if (str2 != null) {
            sparkContext.LJJJZ(str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    @Override // X.InterfaceC1192370h8N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bindData(com.ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1191190h6T.bindData(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
