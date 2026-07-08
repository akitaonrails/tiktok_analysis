package X;

import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620280sGY extends AbstractC654930PmV implements InterfaceC1620270sGX, InterfaceC1260110itd {
    public final InterfaceC1620270sGX LLILLL;
    public TrendingTopicViewHolder LLILZ;
    public TrendingTopic LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL = -1;
    public final String LLJ = "discovery";

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void GA(Boolean bool) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void LD(TuxTextView tuxTextView, Aweme aweme) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void LLLLLZL(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void NN() {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void Xt(View view, Aweme aweme, String str, int i) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void ZF(Aweme aweme, View view) {
    }

    @Override // X.InterfaceC1260110itd
    public final /* synthetic */ void fx(Boolean bool) {
    }

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr
    public final void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // X.InterfaceC1620270sGX
    public final void vq() {
        this.LLILLL.vq();
    }

    public C1620280sGY(InterfaceC1620270sGX interfaceC1620270sGX) {
        this.LLILLL = interfaceC1620270sGX;
    }

    @Override // X.AbstractC683560Qra
    public final RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
        return new C1620250sGV(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bn2, viewGroup, false), this);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        if (C10EU.LJIIIIZZ()) {
            final View view = new View(viewGroup.getContext());
            C786410Ut5.W5(view, new ViewGroup.LayoutParams((int) C12ES.LIZJ(14.0f, viewGroup.getContext()), -1));
            final TrendingTopicViewHolder trendingTopicViewHolder = null;
            return new RecyclerView.ViewHolder(view, trendingTopicViewHolder) { // from class: X.0sGZ
                {
                    super(view);
                    C786410Ut5.I7(new ACListenerS158S0100000_24(trendingTopicViewHolder, 12), view);
                }
            };
        }
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bn4, viewGroup, false);
        final TrendingTopicViewHolder trendingTopicViewHolder2 = this.LLILZ;
        return new RecyclerView.ViewHolder(viewTd, trendingTopicViewHolder2) { // from class: X.0sGZ
            {
                super(viewTd);
                C786410Ut5.I7(new ACListenerS158S0100000_24(trendingTopicViewHolder2, 12), viewTd);
            }
        };
    }

    @Override // X.AbstractC683560Qra
    public final void LLLFZ(RecyclerView.ViewHolder viewHolder, int i) {
        C1620250sGV c1620250sGV = (C1620250sGV) viewHolder;
        if (!Intrinsics.LJFF(c1620250sGV.LLIZ, this)) {
            c1620250sGV.LLIZ = this;
        }
        Aweme aweme = (Aweme) ListProtector.get(this.mmItems, i);
        if (aweme != null) {
            c1620250sGV.I5(i, aweme);
            c1620250sGV.LL = aweme;
            c1620250sGV.X5();
            View view = c1620250sGV.LLJI;
            int i2 = c1620250sGV.LLJ;
            int i3 = c1620250sGV.LLIZLLLIL;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.width != i2 || marginLayoutParams.height != i3) {
                marginLayoutParams.width = i2;
                marginLayoutParams.height = i3;
                C786410Ut5.W5(view, marginLayoutParams);
            }
            c1620250sGV.M0();
            if (C10IT.LJIIJJI(aweme)) {
                C786410Ut5.LJLLLLLL(0, c1620250sGV.LLJIJIL);
            } else {
                C786410Ut5.LJLLLLLL(8, c1620250sGV.LLJIJIL);
            }
        }
    }

    @Override // X.InterfaceC1260110itd
    public final void I2(Aweme aweme, View view, String str) {
        String str2;
        String str3;
        int i;
        String str4;
        String desc;
        int i2;
        if (aweme == null) {
            return;
        }
        int i3 = this.LLILZLL;
        AbstractC1255880imo<Aweme, ?> c1401320mZO = null;
        if (i3 == 0) {
            if (!C10EU.LJIIIIZZ()) {
                str2 = "from_discovery_challenge";
            } else {
                str2 = "from_challenge_children_mode";
            }
            IChallengeDetailService.LIZ.getClass();
            IChallengeDetailService iChallengeDetailServiceLJFF = ChallengeDetailServiceImpl.LJFF();
            if (iChallengeDetailServiceLJFF != null) {
                c1401320mZO = iChallengeDetailServiceLJFF.LIZJ();
            }
            C1620340sGe.LIZIZ(c1401320mZO, this.mmItems);
            TrendingTopic trendingTopic = this.LLILZIL;
            if (trendingTopic != null && trendingTopic.isAd()) {
                Context context = view.getContext();
                TrendingTopic trendingTopic2 = this.LLILZIL;
                C1029590ctp.LIZLLL().LJIJJLI(context, trendingTopic2.getCreativeId(), trendingTopic2.getLogExtra(), trendingTopic2.getClickTrackUrlList(), aweme.getAid());
            }
            str3 = "challenge_id";
            i = 2;
        } else {
            str2 = "from_music_children_mode";
            if (i3 == 1) {
                if (!C10EU.LJIIIIZZ()) {
                    str2 = "from_music";
                }
                c1401320mZO = new C1401320mZO();
                C1620340sGe.LIZIZ(c1401320mZO, this.mmItems);
                str3 = "music_id";
            } else if (i3 == 2) {
                c1401320mZO = C2277881EDy.LIZIZ.createAwemeModel();
                str2 = "from_profile_other";
                str3 = "userid";
            } else if (i3 == 3) {
                c1401320mZO = ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LIZLLL();
                C1620340sGe.LIZIZ(c1401320mZO, this.mmItems);
                str2 = "from_sticker";
                i = 15;
                str3 = "sticker_id";
            } else if (i3 == 4) {
                if (!C10EU.LJIIIIZZ()) {
                    str2 = "from_music";
                }
                c1401320mZO = new C1401320mZO();
                C1620340sGe.LIZIZ(c1401320mZO, this.mmItems);
                int iIndexOf = this.mmItems.indexOf(aweme);
                String str5 = this.LLIZ;
                if (str5 != null && iIndexOf >= 0) {
                    C1620330sGd c1620330sGd = new Object() { // from class: X.0sGd
                    };
                    int i4 = iIndexOf + 1;
                    String groupId = aweme.getGroupId();
                    c1620330sGd.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "top_sounds");
                    c2344009Gk.LJIIIIZZ("music_id", str5);
                    c2344009Gk.LIZJ(i4, "order");
                    c2344009Gk.LJIIIIZZ("group_id", groupId);
                    C20684815ws.LJIILLIIL("feed_enter", c2344009Gk.LIZ);
                }
                str3 = "music_id";
            } else {
                str2 = "";
                str3 = "";
            }
            i = 0;
        }
        if (this.LLILZIL != null) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJFF("enter_from", "discovery");
            if (this.LLILZLL == 0 && this.LLILZIL.getChallenge() != null) {
                c2344009Gk2.LJFF("tag_id", this.LLILZIL.getChallenge().getCid());
            } else if (this.LLILZLL == 1 && this.LLILZIL.getMusic() != null) {
                c2344009Gk2.LJFF("music_id", this.LLILZIL.getMusic().getMid());
            } else if (this.LLILZLL == 2 && this.LLILZIL.getAuthor() != null) {
                c2344009Gk2.LJFF("to_user_id", this.LLILZIL.getAuthor().getUid());
            } else if (this.LLILZLL == 3 && this.LLILZIL.getEffect() != null) {
                c2344009Gk2.LJFF("prop_id", this.LLILZIL.getEffect().id);
            }
            c2344009Gk2.LJFF("tag_line", this.LLILZIL.getDesc());
            int iIndexOf2 = this.mmItems.indexOf(aweme);
            if (iIndexOf2 >= 0 && (i2 = this.LLIZLLLIL) >= 1) {
                c2344009Gk2.LIZJ(iIndexOf2 + ((i2 - 1) * 20), "order");
            }
            C20684815ws.LJIILLIIL("feed_enter", c2344009Gk2.LIZ);
        }
        C1603960rqE.LIZ = c1401320mZO;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//aweme/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
        smartRouteBuildRoute.withParam("refer", this.LLJ);
        smartRouteBuildRoute.withParam("video_from", str2);
        smartRouteBuildRoute.withParam("video_type", i);
        smartRouteBuildRoute.withParam("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
        smartRouteBuildRoute.withParam(str3, this.LLIZ);
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZIZ(view.getContext())) {
            smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//duo");
            smartRouteBuildRoute.withParam("duo_type", "duo_detail");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
            smartRouteBuildRoute.withParam("refer", this.LLJ);
            smartRouteBuildRoute.withParam("video_from", str2);
            smartRouteBuildRoute.withParam("video_type", i);
            smartRouteBuildRoute.withParam("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
            smartRouteBuildRoute.withParam(str3, this.LLIZ);
        }
        if (C10EU.LJIIIIZZ()) {
            List<T> list = this.mmItems;
            StringBuilder sb = new StringBuilder();
            if (!C086I.LIZIZ(list)) {
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Aweme aweme2 = (Aweme) ListProtector.get(list, i5);
                    if (aweme2 != null) {
                        if (i5 < list.size() - 1) {
                            sb.append(aweme2.getAid());
                            sb.append(",");
                        } else {
                            sb.append(aweme2.getAid());
                        }
                    }
                }
            }
            smartRouteBuildRoute.withParam("ids", sb.toString());
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_reuse_external_image", true, false)) {
            smartRouteBuildRoute.withBundleAnimation(C1607950rwf.LIZ(view, view.getWidth(), view.getHeight()).LJFF());
            smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        }
        TrendingTopic trendingTopic3 = this.LLILZIL;
        if (trendingTopic3 != null && (desc = trendingTopic3.getDesc()) != null) {
            smartRouteBuildRoute.withParam("extra_hashtag_tagline", desc);
        }
        smartRouteBuildRoute.open();
        if (TextUtils.equals(str2, "from_discovery_challenge")) {
            str4 = "challenge";
        } else {
            str4 = "music";
        }
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("cell_click");
        mobClickObtain.setLabelName("video_click");
        mobClickObtain.setValue(aweme.getAid());
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("cell_type", str4);
        mobClickObtain.setJsonObject(c2241008qG.LJ());
        C20684815ws.onEvent(mobClickObtain);
    }

    @Override // X.InterfaceC1260110itd
    public final void xe(View view, Aweme aweme, String str, int i) {
        I2(aweme, view, str);
    }
}
