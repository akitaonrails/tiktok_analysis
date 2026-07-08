package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cZh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1017110cZh implements InterfaceC987930bod, View.OnClickListener {
    public final RemoteImageView LL;
    public Aweme LLILLJJLI;
    public String LLILLL = "";
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(502));

    public ViewOnClickListenerC1017110cZh(C987940boe c987940boe) {
        this.LL = c987940boe.LIZ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC988510bpZ interfaceC988510bpZ;
        Context context;
        IAppLogDepend iAppLogDependLIZ;
        String uid;
        String uid2;
        Context context2;
        Aweme aweme = this.LLILLJJLI;
        Aweme aweme2 = null;
        Aweme aweme3 = null;
        List<String> urlList = null;
        if (aweme == null) {
            aweme = null;
        }
        User author = aweme.getAuthor();
        Aweme aweme4 = this.LLILLJJLI;
        if (aweme4 == null) {
            aweme4 = null;
        }
        if (C1017080cZe.LIZIZ(aweme4)) {
            InterfaceC988510bpZ interfaceC988510bpZ2 = (InterfaceC988510bpZ) this.LLILZ.getValue();
            if (interfaceC988510bpZ2 != null) {
                Context context3 = this.LL.getContext();
                Aweme aweme5 = this.LLILLJJLI;
                if (aweme5 != null) {
                    aweme3 = aweme5;
                }
                interfaceC988510bpZ2.LIZ(context3, aweme3, 9, C1017140cZk.LIZ);
                return;
            }
            return;
        }
        Aweme aweme6 = this.LLILLJJLI;
        if (aweme6 == null) {
            aweme6 = null;
        }
        String str = "";
        if (C1017080cZe.LIZ(aweme6)) {
            InterfaceC988510bpZ interfaceC988510bpZ3 = (InterfaceC988510bpZ) this.LLILZ.getValue();
            if (interfaceC988510bpZ3 != null) {
                if (view != null) {
                    context2 = view.getContext();
                } else {
                    context2 = null;
                }
                Aweme aweme7 = this.LLILLJJLI;
                if (aweme7 == null) {
                    aweme7 = null;
                }
                interfaceC988510bpZ3.LJIIL(context2, aweme7);
            }
            IAppLogDepend iAppLogDependLIZ2 = C2214471Bll.LIZ();
            if (iAppLogDependLIZ2 != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
                Aweme aweme8 = this.LLILLJJLI;
                if (aweme8 == null) {
                    aweme8 = null;
                }
                c2344009Gk.LJIIIIZZ("group_id", aweme8.getAid());
                if (author != null && (uid2 = author.getUid()) != null) {
                    str = uid2;
                }
                c2344009Gk.LJIIIIZZ("author_id", str);
                iAppLogDependLIZ2.onEventV3Map("click_brand_sticker", c2344009Gk.LIZ);
            }
            C0XJ4 c0xj4 = new C0XJ4() { // from class: X.0cl1
                @Override // X.C0XJ4
                public final void LIZ(long j, String str2, String str3) {
                    C1024100cky c1024100ckyLIZIZ = C1024150cl3.LIZIZ(j, str2, str3);
                    c1024100ckyLIZIZ.LIZIZ = "track_url";
                    c1024100ckyLIZIZ.LIZ = "track_ad";
                    c1024100ckyLIZIZ.LJ.LIZ("track_label", "click");
                    Aweme aweme9 = this.LIZ.LLILLJJLI;
                    Aweme aweme10 = null;
                    if (aweme9 == null) {
                        aweme9 = null;
                    }
                    c1024100ckyLIZIZ.LJFF(aweme9.getAwemeRawAd());
                    c1024100ckyLIZIZ.LJIIIZ();
                    Aweme aweme11 = this.LIZ.LLILLJJLI;
                    if (aweme11 != null) {
                        aweme10 = aweme11;
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("track_ad", "track_url", aweme10.getAwemeRawAd());
                    c1022820ciuLIZLLL.LIZJ("click", "track_label");
                    c1022820ciuLIZLLL.LIZJ("10", "ad_event_priority");
                    c1022820ciuLIZLLL.LIZJ("monitor", "ad_event_type");
                    c1022820ciuLIZLLL.LIZJ(str2, "track_url_list");
                    c1022820ciuLIZLLL.LIZJ(str3, "track_status");
                    c1022820ciuLIZLLL.LIZJ(Long.valueOf(j), "ts");
                    c1022820ciuLIZLLL.LIZJ("10", "ad_event_priority");
                    String strLIZ = C1489110oqz.LIZ("other");
                    if (!TextUtils.isEmpty(strLIZ)) {
                        c1022820ciuLIZLLL.LIZJ(strLIZ, "user_agent");
                    }
                    c1022820ciuLIZLLL.LJIIIIZZ();
                }
            };
            Aweme aweme9 = this.LLILLJJLI;
            if (aweme9 == null) {
                aweme9 = null;
            }
            UrlModel urlModel = aweme9.getActivityPendant().clickTrackUrlList;
            if (urlModel != null) {
                urlList = urlModel.getUrlList();
            }
            C0XJ2.LIZ(c0xj4, urlList, true);
            return;
        }
        Aweme aweme10 = this.LLILLJJLI;
        if (aweme10 == null) {
            aweme10 = null;
        }
        if (!C1017080cZe.LIZJ(aweme10) || (interfaceC988510bpZ = (InterfaceC988510bpZ) this.LLILZ.getValue()) == null) {
            return;
        }
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        Aweme aweme11 = this.LLILLJJLI;
        if (aweme11 == null) {
            aweme11 = null;
        }
        if (!interfaceC988510bpZ.LJJIIZ(context, aweme11) || (iAppLogDependLIZ = C2214471Bll.LIZ()) == null) {
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", this.LLILLL);
        Aweme aweme12 = this.LLILLJJLI;
        if (aweme12 == null) {
            aweme12 = null;
        }
        c2344009Gk2.LJIIIIZZ("group_id", aweme12.getAid());
        if (author != null && (uid = author.getUid()) != null) {
            str = uid;
        }
        c2344009Gk2.LJIIIIZZ("author_id", str);
        Aweme aweme13 = this.LLILLJJLI;
        if (aweme13 != null) {
            aweme2 = aweme13;
        }
        c2344009Gk2.LJIIIIZZ("sticker_id", aweme2.getSpecialSticker().getStickerId());
        iAppLogDependLIZ.onEventV3Map("click_brand_sticker", c2344009Gk2.LIZ);
    }

    @Override // X.InterfaceC987930bod
    public final void LJFF(final Aweme aweme, String str, final boolean z) {
        IAppLogDepend iAppLogDependLIZ;
        String uid;
        String uid2;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        C786410Ut5.E9(this.LL, this);
        List<String> urlList = null;
        UrlModel redImageUrl = null;
        if (C1017080cZe.LIZIZ(aweme)) {
            C786410Ut5.l(this.LL, 0);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                redImageUrl = awemeRawAd.getRedImageUrl();
            }
            C1322410kW7.LIZIZ(this.LL, redImageUrl, new C1320700kTM<Object>() { // from class: X.0cZi
                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LIZLLL(String str2, Throwable th) {
                    if (!z) {
                        C1017560caQ.LIZLLL(1, aweme);
                    }
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJFF(Object obj, String str2) {
                    Aweme aweme2;
                    AwemeRawAd awemeRawAd2;
                    if (!z && (aweme2 = aweme) != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null) {
                        C1017560caQ.LJ(-1, awemeRawAd2.getCreativeId(), "redpacket", "preload_start", awemeRawAd2.getLogExtra(), aweme2.getAid());
                    }
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str2, Object obj, Animatable animatable) {
                    if (!z) {
                        C1017560caQ.LIZLLL(0, aweme);
                    }
                }
            });
            if (z) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    C1017560caQ.LJ(0, awemeRawAd2.getCreativeId(), "redpacket", "show_result", awemeRawAd2.getLogExtra(), aweme.getAid());
                }
                C988530bpb c988530bpb = C988530bpb.LIZ;
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                c988530bpb.getClass();
                C1001140c9w c1001140c9w = new C1001140c9w();
                c1001140c9w.LIZ = awemeRawAd3;
                c1001140c9w.LIZIZ = "redpacket";
                JSONObject jSONObjectLIZ = c1001140c9w.LIZ();
                if (awemeRawAd3 != null) {
                    C994130byd.LIZ("draw_ad", "othershow", jSONObjectLIZ, awemeRawAd3);
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ("redpacket", "refer");
                c1022820ciuLIZLLL.LJIIIIZZ();
                return;
            }
            return;
        }
        String str2 = "";
        if (C1017080cZe.LIZ(aweme)) {
            C786410Ut5.l(this.LL, 0);
            UrlModel urlModel = aweme.getActivityPendant().image;
            final RemoteImageView remoteImageView = this.LL;
            C1322410kW7.LIZIZ(remoteImageView, urlModel, new InterfaceC1320650kTH<InterfaceC1330440kj4>(remoteImageView) { // from class: X.0HbU
                public final boolean LIZ = false;
                public final C1322110kVd LIZIZ;

                @Override // X.InterfaceC1320650kTH
                public final void LIZ(String str3, Throwable th) {
                }

                @Override // X.InterfaceC1320650kTH
                public final void LIZIZ(String str3) {
                }

                @Override // X.InterfaceC1320650kTH
                public final void LIZLLL(String str3, Throwable th) {
                }

                @Override // X.InterfaceC1320650kTH
                public final void LJFF(Object obj, String str3) {
                }

                {
                    this.LIZIZ = remoteImageView;
                }

                @Override // X.InterfaceC1320650kTH
                public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str3) {
                }

                @Override // X.InterfaceC1320650kTH
                public final void LJ(String str3, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                    InterfaceC1330440kj4 interfaceC1330440kj42 = interfaceC1330440kj4;
                    if (animatable != null) {
                        ValueAnimator valueAnimatorLIZ = C1330950kjt.LIZ((AnimatedDrawable2) animatable);
                        valueAnimatorLIZ.setRepeatCount(-1);
                        valueAnimatorLIZ.start();
                        if (this.LIZ && interfaceC1330440kj42 != null) {
                            this.LIZIZ.getLayoutParams().width = C12ES.LJIIJ(this.LIZIZ.getContext());
                            this.LIZIZ.getLayoutParams().height = -2;
                            this.LIZIZ.setAspectRatio(interfaceC1330440kj42.getWidth() / interfaceC1330440kj42.getHeight());
                        }
                    }
                }
            });
            User author = aweme.getAuthor();
            if (!z) {
                return;
            }
            IAppLogDepend iAppLogDependLIZ2 = C2214471Bll.LIZ();
            if (iAppLogDependLIZ2 != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                if (author != null && (uid2 = author.getUid()) != null) {
                    str2 = uid2;
                }
                c2344009Gk.LJIIIIZZ("author_id", str2);
                iAppLogDependLIZ2.onEventV3Map("show_brand_sticker", c2344009Gk.LIZ);
            }
            C0XJ4 c0xj4 = new C0XJ4() { // from class: X.0cl2
                @Override // X.C0XJ4
                public final void LIZ(long j, String str3, String str4) {
                    C1024100cky c1024100ckyLIZIZ = C1024150cl3.LIZIZ(j, str3, str4);
                    c1024100ckyLIZIZ.LIZIZ = "track_url";
                    c1024100ckyLIZIZ.LIZ = "track_ad";
                    c1024100ckyLIZIZ.LJ.LIZ("track_label", "show");
                    c1024100ckyLIZIZ.LJFF(aweme.getAwemeRawAd());
                    c1024100ckyLIZIZ.LJIIIZ();
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("track_ad", "track_url", aweme.getAwemeRawAd());
                    c1022820ciuLIZLLL2.LIZJ("show", "track_label");
                    c1022820ciuLIZLLL2.LIZJ("10", "ad_event_priority");
                    c1022820ciuLIZLLL2.LIZJ("monitor", "ad_event_type");
                    c1022820ciuLIZLLL2.LIZJ(str3, "track_url_list");
                    c1022820ciuLIZLLL2.LIZJ(str4, "track_status");
                    c1022820ciuLIZLLL2.LIZJ(Long.valueOf(j), "ts");
                    c1022820ciuLIZLLL2.LIZJ("10", "ad_event_priority");
                    String strLIZ = C1489110oqz.LIZ("other");
                    if (!TextUtils.isEmpty(strLIZ)) {
                        c1022820ciuLIZLLL2.LIZJ(strLIZ, "user_agent");
                    }
                    c1022820ciuLIZLLL2.LJIIIIZZ();
                }
            };
            UrlModel urlModel2 = aweme.getActivityPendant().trackUrlList;
            if (urlModel2 != null) {
                urlList = urlModel2.getUrlList();
            }
            C0XJ2.LIZ(c0xj4, urlList, true);
            return;
        }
        if (C1017080cZe.LIZJ(aweme)) {
            C786410Ut5.l(this.LL, 0);
            SpecialSticker specialSticker = aweme.getSpecialSticker();
            if (specialSticker != null) {
                final RemoteImageView remoteImageView2 = this.LL;
                C1322410kW7.LIZIZ(remoteImageView2, specialSticker.getIconUrl(), new InterfaceC1320650kTH<InterfaceC1330440kj4>(remoteImageView2) { // from class: X.0HbU
                    public final boolean LIZ = false;
                    public final C1322110kVd LIZIZ;

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZ(String str3, Throwable th) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZIZ(String str3) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LIZLLL(String str3, Throwable th) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJFF(Object obj, String str3) {
                    }

                    {
                        this.LIZIZ = remoteImageView2;
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str3) {
                    }

                    @Override // X.InterfaceC1320650kTH
                    public final void LJ(String str3, InterfaceC1330440kj4 interfaceC1330440kj4, Animatable animatable) {
                        InterfaceC1330440kj4 interfaceC1330440kj42 = interfaceC1330440kj4;
                        if (animatable != null) {
                            ValueAnimator valueAnimatorLIZ = C1330950kjt.LIZ((AnimatedDrawable2) animatable);
                            valueAnimatorLIZ.setRepeatCount(-1);
                            valueAnimatorLIZ.start();
                            if (this.LIZ && interfaceC1330440kj42 != null) {
                                this.LIZIZ.getLayoutParams().width = C12ES.LJIIJ(this.LIZIZ.getContext());
                                this.LIZIZ.getLayoutParams().height = -2;
                                this.LIZIZ.setAspectRatio(interfaceC1330440kj42.getWidth() / interfaceC1330440kj42.getHeight());
                            }
                        }
                    }
                });
            }
            User author2 = aweme.getAuthor();
            if (!z || (iAppLogDependLIZ = C2214471Bll.LIZ()) == null) {
                return;
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            c2344009Gk2.LJIIIIZZ("group_id", aweme.getAid());
            if (author2 != null && (uid = author2.getUid()) != null) {
                str2 = uid;
            }
            c2344009Gk2.LJIIIIZZ("author_id", str2);
            c2344009Gk2.LJIIIIZZ("sticker_id", aweme.getSpecialSticker().getStickerId());
            iAppLogDependLIZ.onEventV3Map("show_brand_sticker", c2344009Gk2.LIZ);
            return;
        }
        C786410Ut5.l(this.LL, 8);
    }
}
