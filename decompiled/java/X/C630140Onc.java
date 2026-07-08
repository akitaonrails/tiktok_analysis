package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.ab.MusicChartFmpOptV2Settings;
import com.ss.android.ugc.aweme.music.model.MusicChartLinkStyle;
import com.ss.android.ugc.aweme.music.model.MusicChartRankStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Onc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630140Onc {
    public static final /* synthetic */ int LIZJ = 0;
    public final C630160One LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(564));

    public C630140Onc(C630160One c630160One) {
        this.LIZ = c630160One;
    }

    public final String LIZ(String str) {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("music_chart_url", "");
        if (TextUtils.isEmpty(strLJI) || (!u.LJJIIJZLJL(strLJI, "aweme://lynxview/", false) && !u.LJJIIJZLJL(strLJI, "aweme://roma_redirect/", false))) {
            return "";
        }
        Uri.Builder builderBuildUpon = UriProtector.parse(strLJI).buildUpon();
        String str2 = this.LIZ.LIZ;
        if (str2 != null) {
            builderBuildUpon.appendQueryParameter("extra_log_params", str2);
        }
        String str3 = this.LIZ.LIZIZ;
        if (str3 != null) {
            builderBuildUpon.appendQueryParameter("stickers", str3);
        }
        String str4 = this.LIZ.LIZJ;
        if (str4 != null) {
            builderBuildUpon.appendQueryParameter("group_id", str4);
        }
        String str5 = this.LIZ.LIZLLL;
        if (str5 != null) {
            builderBuildUpon.appendQueryParameter("from_group_id", str5);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "music_chart_multithread_list_in_test", true, false) && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_music_chart_multithread_list", true, false)) {
            builderBuildUpon.appendQueryParameter("multithread_list_in_test", "1").appendQueryParameter("thread_strategy", String.valueOf(((MusicChartFmpOptV2Settings.MusicChartFmpOptV2SettingsConfig) MusicChartFmpOptV2Settings.LIZIZ.getValue()).threadStrategy)).appendQueryParameter("enable_multithread_list", "1").appendQueryParameter("enter_from", "single_song").appendQueryParameter("musicInfo", str);
        } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "music_chart_multithread_list_in_test", true, false)) {
            builderBuildUpon.appendQueryParameter("multithread_list_in_test", "1").appendQueryParameter("enter_from", "single_song").appendQueryParameter("musicInfo", str);
        } else {
            builderBuildUpon.appendQueryParameter("enter_from", "single_song").appendQueryParameter("musicInfo", str);
        }
        return builderBuildUpon.build().toString();
    }

    public final void LIZIZ(TextView textView, View view, final MusicChartRankStruct musicChartRankStruct, String str, String str2, String str3) {
        boolean z;
        int bgStartColor;
        int bgEndColor;
        User curUser;
        final String str4 = str2;
        final String str5 = str;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null && curUser.getAccountType() == 3 && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLIL(textView, 8);
            C786410Ut5.LJLLLLLL(8, view);
            return;
        }
        final String strLIZ = LIZ(musicChartRankStruct.getChartMusicInfo());
        if (strLIZ.length() == 0) {
            C786410Ut5.LLIL(textView, 8);
            C786410Ut5.LJLLLLLL(8, view);
            return;
        }
        C786410Ut5.LLIL(textView, 0);
        textView.setText(musicChartRankStruct.getDesc());
        C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0Ond
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view2) {
                String str6;
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ);
                sbLIZ.append("&click_time=");
                sbLIZ.append(jCurrentTimeMillis);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                if (C1537060q6K.LIZ("lynx_music_card", strLIZ)) {
                    SmartRouter.buildRoute(view2.getContext(), strLIZIZ).open();
                } else {
                    C630140Onc c630140Onc = this;
                    Context context = view2.getContext();
                    c630140Onc.getClass();
                    if (context != null) {
                        SparkContext sparkContext = new SparkContext();
                        sparkContext.LJJLIIJ(strLIZIZ);
                        sparkContext.LJJJJLL(new AbstractC1542100qES() { // from class: X.0doF
                            @Override // X.AbstractC1537870q7d
                            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                                LynxView lynxView;
                                View viewE1 = interfaceC1541990qEH.e1();
                                if ((viewE1 instanceof LynxView) && (lynxView = (LynxView) viewE1) != null) {
                                    LynxViewMonitor.Companion.getClass();
                                    LynxViewMonitor.INSTANCE.addContext(lynxView, "music_chart_fmp_opti", "true");
                                }
                            }
                        });
                        C1541950qED.LIZJ.getClass();
                        new C1541950qED(context, sparkContext).LIZIZ();
                    }
                }
                ((Keva) this.LIZIZ.getValue()).storeLong("last_enter_chart_time", System.currentTimeMillis());
                String id = musicChartRankStruct.getId();
                String str7 = str5;
                String str8 = str4;
                int rank = musicChartRankStruct.getRank();
                if (C1537060q6K.LIZ("lynx_music_card", strLIZ)) {
                    str6 = "1";
                } else {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (id == null) {
                    id = "";
                }
                c2344009Gk.LJIIIIZZ("chart_id", id);
                c2344009Gk.LJIIIIZZ("enter_method", "click_more_list");
                if (str7 == null) {
                    str7 = "";
                }
                c2344009Gk.LJIIIIZZ("group_id", str7);
                if (str8 == null) {
                    str8 = "";
                }
                c2344009Gk.LJIIIIZZ("music_id", str8);
                c2344009Gk.LIZJ(rank, "order");
                c2344009Gk.LJIIIIZZ("page", "single_song");
                c2344009Gk.LJIIIIZZ("is_preload", str6);
                C20684815ws.LJIILLIIL("click_music_list_entrance", c2344009Gk.LIZ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(500L);
            }
        }, view);
        if (musicChartRankStruct.getMusicChartLinkStyle() != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            MusicChartLinkStyle musicChartLinkStyle = musicChartRankStruct.getMusicChartLinkStyle();
            if (musicChartLinkStyle != null) {
                bgStartColor = musicChartLinkStyle.getBgStartColor();
            } else {
                bgStartColor = 0;
            }
            MusicChartLinkStyle musicChartLinkStyle2 = musicChartRankStruct.getMusicChartLinkStyle();
            if (musicChartLinkStyle2 != null) {
                bgEndColor = musicChartLinkStyle2.getBgEndColor();
            } else {
                bgEndColor = 0;
            }
            int i = (bgEndColor & (-16777216)) >>> 24;
            if (((bgStartColor & (-16777216)) >>> 24) <= 0) {
                bgStartColor |= -16777216;
            }
            if (i <= 0) {
                bgEndColor |= -16777216;
            }
            gradientDrawable.setColors(new int[]{bgStartColor, bgEndColor});
            gradientDrawable.setCornerRadius(C341940Daq.LIZ(24.0d));
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            textView.setBackground(gradientDrawable);
        }
        String id = musicChartRankStruct.getId();
        int rank = musicChartRankStruct.getRank();
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str6 = "";
        if (id == null) {
            id = "";
        }
        c2344009Gk.LJIIIIZZ("chart_id", id);
        if (str5 == null) {
            str5 = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", str5);
        if (str4 == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("music_id", str4);
        if (str3 != null) {
            str6 = str3;
        }
        c2344009Gk.LJIIIIZZ("author_id", str6);
        c2344009Gk.LIZJ(rank, "order");
        c2344009Gk.LJIIIIZZ("page", "single_song");
        C20684815ws.LJIILLIIL("show_music_list_entrance", c2344009Gk.LIZ);
        try {
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
            C1537050q6J.LIZ.getClass();
            C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
            if (c1551950qULLIZ != null) {
                c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, Collections.singletonList(new CheckRequestBodyModel.TargetChannel("lynx_music_card")))), optionCheckUpdateParams);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
