package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightNearByEntranceSetting;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Imw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476840Imw extends AbstractC477000InC {
    public final String LIZLLL;
    public final EnumC471790Ien LJ;
    public final Function0<Integer> LJFF;
    public AbstractC477250Inb LJI;
    public AbstractC477260Inc LJII;
    public final C01GW LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public BaseListResponse<FeedItem, FeedExtra> LJIIJJI;
    public ViewOnLayoutChangeListenerC521670Kd3 LJIIL;

    @Override // X.InterfaceC475250IkN
    public final float LIZ() {
        int height;
        if (this.LJIIIZ == 0.0f) {
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup == null || (height = viewGroup.getHeight()) == 0) {
                return 0.0f;
            }
            this.LJIIIZ = height + ((Number) this.LJIIIIZZ.getValue()).floatValue();
        }
        return this.LJIIIZ;
    }

    public final void LIZJ() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this.LJIIL);
        }
        this.LJIIL = null;
        ViewGroup viewGroup2 = this.LIZ;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        AbstractC477250Inb abstractC477250Inb = this.LJI;
        if (abstractC477250Inb != null) {
            abstractC477250Inb.LIZIZ();
        }
        this.LJI = null;
        this.LJII = null;
        this.LJIIJ = false;
    }

    @Override // X.InterfaceC475250IkN
    public final void LIZIZ(BaseListResponse<FeedItem, FeedExtra> baseListResponse) {
        FeedExtra feedExtra;
        FeedBannerContainer feedBannerContainer;
        List<FeedBanner> list;
        FeedBanner feedBanner;
        List<FeedItem> list2;
        boolean z;
        List<FeedItem> list3;
        boolean z2;
        boolean z3;
        View viewLIZ;
        View viewLIZ2;
        FeedExtra feedExtra2;
        FeedBannerContainer feedBannerContainer2;
        List<FeedBanner> list4;
        BaseListResponse<FeedItem, FeedExtra> baseListResponse2 = this.LJIIJJI;
        if (baseListResponse2 != null && Intrinsics.LJFF(baseListResponse2, baseListResponse)) {
            return;
        }
        this.LJIIJJI = baseListResponse;
        List<FeedItem> list5 = null;
        if (!this.LJIIJ) {
            this.LJIIJ = true;
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup != null) {
                final Context context = viewGroup.getContext();
                C786410Ut5.LJJJJI(viewGroup);
                if (!C474920Ijq.LIZ(viewGroup.getContext()) && LiveSkylightNearByEntranceSetting.enableRequestLocation() && C474850Ijj.LIZJ() != null && InterfaceC1106030et7.q4.LIZIZ().intValue() < C474870Ijl.LIZIZ) {
                    z = true;
                } else {
                    z = false;
                }
                BaseListResponse<FeedItem, FeedExtra> baseListResponse3 = this.LJIIJJI;
                if (baseListResponse3 != null) {
                    list3 = baseListResponse3.data;
                } else {
                    list3 = null;
                }
                if ((C500260Jjc.LJJIJIIJI(list3) || z) && LiveSkylightNearByEntranceSetting.enableNearby() && !LiveNearbyTabSetting.INSTANCE.enable()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zEnableBanner = LiveSkylightNearByEntranceSetting.enableBanner();
                BaseListResponse<FeedItem, FeedExtra> baseListResponse4 = this.LJIIJJI;
                if (baseListResponse4 != null && (feedExtra2 = (FeedExtra) baseListResponse4.extra) != null && (feedBannerContainer2 = feedExtra2.bannerContainer) != null && (list4 = feedBannerContainer2.bannerList) != null && (!list4.isEmpty()) && zEnableBanner) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (z2) {
                        final EnumC471790Ien enumC471790Ien = this.LJ;
                        this.LJII = new AbstractC477260Inc(context, enumC471790Ien) { // from class: X.0In9
                            @Override // X.AbstractC477260Inc
                            public final int LIZIZ() {
                                return R.layout.dhm;
                            }

                            @Override // X.AbstractC477260Inc, X.InterfaceC477270Ind
                            public final View LIZ() {
                                View viewLIZ3 = super.LIZ();
                                try {
                                    C16F5 c16f5 = (C16F5) this.LJFF.getValue();
                                    if (c16f5 != null) {
                                        C21382118m3.LIZJ(c16f5, 0);
                                    }
                                    C16F5 c16f52 = (C16F5) this.LJFF.getValue();
                                    if (c16f52 != null) {
                                        c16f52.setTextSize(1, 13.0f);
                                        return viewLIZ3;
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                return viewLIZ3;
                            }
                        };
                        final EnumC471790Ien enumC471790Ien2 = this.LJ;
                        final AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 434);
                        final String str = this.LIZLLL;
                        final Function0<Integer> function0 = this.LJFF;
                        this.LJI = new AbstractC477250Inb(context, enumC471790Ien2, awS586S0100000_7, str, function0) { // from class: X.0In7
                            @Override // X.AbstractC477250Inb
                            public final String LIZJ() {
                                return "live_skylight_nearby_avatar_other_outer_small.png";
                            }

                            @Override // X.AbstractC477250Inb
                            public final int LIZLLL() {
                                return R.layout.dho;
                            }

                            @Override // X.AbstractC477250Inb, X.InterfaceC477270Ind
                            public final View LIZ() {
                                View viewLIZ3 = super.LIZ();
                                try {
                                    C16F5 c16f5 = (C16F5) this.LJI.getValue();
                                    if (c16f5 != null) {
                                        C21382118m3.LIZJ(c16f5, 0);
                                    }
                                    C16F5 c16f52 = (C16F5) this.LJI.getValue();
                                    if (c16f52 != null) {
                                        c16f52.setTextSize(1, 13.0f);
                                        return viewLIZ3;
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                return viewLIZ3;
                            }
                        };
                        int iGenerateViewId = View.generateViewId();
                        int iGenerateViewId2 = View.generateViewId();
                        AbstractC477260Inc abstractC477260Inc = this.LJII;
                        if (abstractC477260Inc != null && (viewLIZ2 = abstractC477260Inc.LIZ()) != null) {
                            viewLIZ2.setId(iGenerateViewId2);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(73)));
                            layoutParams.weight = 1.0f;
                            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                            C786410Ut5.W5(viewLIZ2, layoutParams);
                            viewGroup.addView(viewLIZ2);
                        }
                        AbstractC477250Inb abstractC477250Inb = this.LJI;
                        if (abstractC477250Inb != null && (viewLIZ = abstractC477250Inb.LIZ()) != null) {
                            viewLIZ.setId(iGenerateViewId);
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(73)));
                            layoutParams2.weight = 1.0f;
                            layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                            C786410Ut5.W5(viewLIZ, layoutParams2);
                            viewGroup.addView(viewLIZ);
                        }
                    } else {
                        final EnumC471790Ien enumC471790Ien3 = this.LJ;
                        AbstractC477260Inc abstractC477260Inc2 = new AbstractC477260Inc(context, enumC471790Ien3) { // from class: X.0InA
                            @Override // X.AbstractC477260Inc
                            public final int LIZIZ() {
                                return R.layout.dhl;
                            }

                            @Override // X.AbstractC477260Inc, X.InterfaceC477270Ind
                            public final View LIZ() {
                                View viewLIZ3 = super.LIZ();
                                try {
                                    C16F5 c16f5 = (C16F5) this.LJFF.getValue();
                                    if (c16f5 != null) {
                                        C21382118m3.LIZIZ(c16f5, 10, 15, 1, 1);
                                    }
                                    C16F5 c16f52 = (C16F5) this.LJI.getValue();
                                    if (c16f52 != null) {
                                        C21382118m3.LIZIZ(c16f52, 10, 12, 1, 1);
                                        return viewLIZ3;
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                return viewLIZ3;
                            }
                        };
                        this.LJII = abstractC477260Inc2;
                        View viewLIZ3 = abstractC477260Inc2.LIZ();
                        C786410Ut5.W5(viewLIZ3, new LinearLayout.LayoutParams(-1, -1));
                        viewGroup.addView(viewLIZ3);
                    }
                } else if (z2) {
                    final EnumC471790Ien enumC471790Ien4 = this.LJ;
                    final AwS586S0100000_7 awS586S0100000_72 = new AwS586S0100000_7(this, 435);
                    final String str2 = this.LIZLLL;
                    final Function0<Integer> function02 = this.LJFF;
                    AbstractC477250Inb abstractC477250Inb2 = new AbstractC477250Inb(context, enumC471790Ien4, awS586S0100000_72, str2, function02) { // from class: X.0In8
                        @Override // X.AbstractC477250Inb
                        public final String LIZJ() {
                            return "live_skylight_nearby_avatar_other_outer.png";
                        }

                        @Override // X.AbstractC477250Inb
                        public final int LIZLLL() {
                            return R.layout.dhn;
                        }

                        @Override // X.AbstractC477250Inb, X.InterfaceC477270Ind
                        public final View LIZ() {
                            View viewLIZ4 = super.LIZ();
                            try {
                                C16F5 c16f5 = (C16F5) this.LJI.getValue();
                                if (c16f5 != null) {
                                    C21382118m3.LIZIZ(c16f5, 10, 15, 1, 1);
                                }
                                TextView textView = (TextView) this.LJIIIIZZ.getValue();
                                if (textView != null) {
                                    C21382118m3.LIZIZ(textView, 10, 12, 1, 1);
                                    return viewLIZ4;
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            return viewLIZ4;
                        }
                    };
                    this.LJI = abstractC477250Inb2;
                    View viewLIZ4 = abstractC477250Inb2.LIZ();
                    C786410Ut5.W5(viewLIZ4, new LinearLayout.LayoutParams(-1, -1));
                    viewGroup.addView(viewLIZ4);
                }
                viewGroup.requestLayout();
            }
        }
        AbstractC477250Inb abstractC477250Inb3 = this.LJI;
        if (abstractC477250Inb3 != null) {
            if ((baseListResponse == null || (list2 = baseListResponse.data) == null || list2.isEmpty()) && C474920Ijq.LIZ(abstractC477250Inb3.LIZ)) {
                TextView textView = (TextView) abstractC477250Inb3.LJI.getValue();
                if (textView != null) {
                    textView.setText(C497740JfY.LJIJI(2131856829));
                }
                TextView textView2 = (TextView) abstractC477250Inb3.LJIIIIZZ.getValue();
                if (textView2 != null) {
                    textView2.setText(C497740JfY.LJIJI(2131856828));
                }
                View view = (View) abstractC477250Inb3.LJIIJJI.getValue();
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                View view2 = (View) abstractC477250Inb3.LJIIL.getValue();
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
                View view3 = (View) abstractC477250Inb3.LJIILIIL.getValue();
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                abstractC477250Inb3.LJFF();
                abstractC477250Inb3.LJ(null);
            } else if (!abstractC477250Inb3.LJIJ || !Intrinsics.LJFF(abstractC477250Inb3.LJIJI, baseListResponse)) {
                if (baseListResponse != null) {
                    list5 = baseListResponse.data;
                }
                TextView textView3 = (TextView) abstractC477250Inb3.LJI.getValue();
                if (textView3 != null) {
                    textView3.setText(C497740JfY.LJIJI(2131854886));
                }
                TextView textView4 = (TextView) abstractC477250Inb3.LJIIIIZZ.getValue();
                if (textView4 != null) {
                    textView4.setText(C497740JfY.LJIJI(2131854885));
                }
                View view4 = (View) abstractC477250Inb3.LJIIJJI.getValue();
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(0, view4);
                }
                View view5 = (View) abstractC477250Inb3.LJIIL.getValue();
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(0, view5);
                }
                View view6 = (View) abstractC477250Inb3.LJIILIIL.getValue();
                if (view6 != null) {
                    C786410Ut5.LJLLLLLL(0, view6);
                }
                abstractC477250Inb3.LJFF();
                abstractC477250Inb3.LJ(list5);
            }
            abstractC477250Inb3.LJIJ = true;
            abstractC477250Inb3.LJIJI = baseListResponse;
        }
        AbstractC477260Inc abstractC477260Inc3 = this.LJII;
        if (abstractC477260Inc3 != null) {
            BaseListResponse<FeedItem, FeedExtra> baseListResponse5 = abstractC477260Inc3.LIZJ;
            if (baseListResponse5 != null && Intrinsics.LJFF(baseListResponse5, baseListResponse)) {
                return;
            }
            abstractC477260Inc3.LIZJ = baseListResponse;
            if (baseListResponse == null || (feedExtra = (FeedExtra) baseListResponse.extra) == null || (feedBannerContainer = feedExtra.bannerContainer) == null || (list = feedBannerContainer.bannerList) == null || (feedBanner = (FeedBanner) C13LP.LJJJLZIJ(0, list)) == null) {
                return;
            }
            String str3 = feedBanner.title;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            String str5 = feedBanner.subtitle;
            if (str5 != null) {
                str4 = str5;
            }
            List<String> list6 = feedBanner.urlList;
            abstractC477260Inc3.LJII = feedBanner.schemaUrl;
            TextView textView5 = (TextView) abstractC477260Inc3.LJFF.getValue();
            if (textView5 != null) {
                textView5.setText(str3);
            }
            if (TextUtils.isEmpty(str4)) {
                C16F5 c16f5 = (C16F5) abstractC477260Inc3.LJI.getValue();
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 8);
                }
            } else {
                TextView textView6 = (TextView) abstractC477260Inc3.LJI.getValue();
                if (textView6 != null) {
                    textView6.setText(str4);
                }
                C16F5 c16f52 = (C16F5) abstractC477260Inc3.LJI.getValue();
                if (c16f52 != null) {
                    C786410Ut5.LLJJJJ(c16f52, 0);
                }
            }
            C1819620xS4.LIZ().LIZJ(list6).LJJI((View) abstractC477260Inc3.LJ.getValue());
        }
    }

    public C476840Imw(C422640Ghi c422640Ghi, EnumC471790Ien enumC471790Ien, C477090InL c477090InL) {
        super(c422640Ghi);
        this.LIZLLL = "live_merge";
        this.LJ = enumC471790Ien;
        this.LJFF = c477090InL;
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 707));
    }
}
