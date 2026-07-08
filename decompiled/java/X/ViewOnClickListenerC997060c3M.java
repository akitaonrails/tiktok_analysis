package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.CornerRadiusActionModel;
import com.ss.android.ugc.aweme.commercialize.model.UpdateTuxButtonLargerCornerMapModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.IAdOpenHelper;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC997060c3M implements InterfaceC1010530cP5, View.OnClickListener {
    public static final C990800btG LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final InterfaceC997140c3U LL;
    public LinearLayout LLILZIL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(671));
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(673));
    public final C997320c3m LLILZ = new C997320c3m(AFwS252S0000000_16.get$arr$(672));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 999));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 993));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 996));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 992));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1002));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1001));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 997));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 991));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 998));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1003));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 994));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 995));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1004));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, LSPassThroughRecordSizeConfig.DEFAULT));

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0btG] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ViewOnClickListenerC997060c3M.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ViewOnClickListenerC997060c3M.class, "nativeMaskInfo", "getNativeMaskInfo()Lcom/ss/android/ugc/aweme/api/component/mask/component/CommerceMaskNativeComponent$NativeMaskStruct;", 0), new C2217381BqS(ViewOnClickListenerC997060c3M.class, "container", "getContainer()Landroid/view/View;", 0)};
        LLJJIJIL = new Object() { // from class: X.0btG
        };
    }

    public final Aweme LIZ() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (Aweme) c997320c3m.LIZ(this);
    }

    public final View LIZIZ() {
        C997320c3m c997320c3m = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (View) c997320c3m.LIZ(this);
    }

    public final C997080c3O LIZJ() {
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (C997080c3O) c997320c3m.LIZ(this);
    }

    public final void LIZLLL() {
        String adMoreTextual;
        C430310Gu5 c430310Gu5 = (C430310Gu5) this.LLIZ.getValue();
        c430310Gu5.setText(LIZJ().LIZJ);
        AwemeRawAd awemeRawAd = LIZ().getAwemeRawAd();
        if (awemeRawAd == null || (adMoreTextual = awemeRawAd.getAdMoreTextual()) == null) {
            adMoreTextual = "";
        }
        c430310Gu5.setMoreString(adMoreTextual);
        c430310Gu5.setViewLineHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))));
        c430310Gu5.setImageSpanXAxisAdjust(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f))));
        C786410Ut5.LJLLLLLL(C123100dR.LIZ(LIZJ().LIZJ) ? 0 : 8, c430310Gu5);
    }

    public final void LJFF() {
        AdStyleActionModel adStyleActionModel;
        CornerRadiusActionModel cornerRadiusActionModel;
        UpdateTuxButtonLargerCornerMapModel updateTuxButtonLargerCornerMapModel;
        RemoteImageView remoteImageView = (RemoteImageView) this.LLIZLLLIL.getValue();
        UrlModel urlModel = LIZJ().LIZLLL;
        if (urlModel != null) {
            C1324840ka2.LJFF(remoteImageView, urlModel);
        } else {
            C1324840ka2.LJIIL(remoteImageView, C997540c48.LIZ(2130971789));
        }
        boolean z = LIZJ().LIZIZ && LIZJ().LIZ == 1;
        AwemeRawAd awemeRawAd = LIZ().getAwemeRawAd();
        remoteImageView.getHierarchy().LJJIII(z ? C1331100kk8.LIZ() : (awemeRawAd == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (cornerRadiusActionModel = adStyleActionModel.cornerRadius) == null || (updateTuxButtonLargerCornerMapModel = cornerRadiusActionModel.updateTuxButtonLargerCornerMap) == null || !updateTuxButtonLargerCornerMapModel.nativeEndLayer) ? false : true ? C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(10)) : null);
        C786410Ut5.LJLLLLLL(0, remoteImageView);
    }

    public final void LJI() {
        String nickname;
        TextView textView = (TextView) this.LLILZLL.getValue();
        User author = LIZ().getAuthor();
        if (author == null || (nickname = author.getNickname()) == null) {
            nickname = "";
        }
        textView.setText(nickname);
        C786410Ut5.LJLLLLLL(0, textView);
    }

    public final void LJIIIIZZ() {
        C0DSC c0dsc = (C0DSC) this.LLJJ.getValue();
        String[] strArr = LIZJ().LJIIIZ;
        C786410Ut5.LJLLLLLL((strArr == null || strArr.length == 0) ? 8 : 0, c0dsc);
        String[] strArr2 = LIZJ().LJIIIZ;
        if (strArr2 != null) {
            c0dsc.setTagList(strArr2);
        }
    }

    public final void LJ() {
        LIZLLL();
        LJFF();
        LJI();
        LJIIIIZZ();
        View view = (View) this.LLJILLL.getValue();
        String str = LIZJ().LJII;
        C786410Ut5.LJLLLLLL((!(str == null || str.length() == 0) || LIZJ().LJIIIIZZ >= 4.0f) ? 8 : 0, view);
        TextView textView = (TextView) this.LLJILJILJ.getValue();
        C786410Ut5.LJLLLLLL(C123100dR.LIZ(LIZJ().LJII) ? 0 : 8, textView);
        textView.setText(LIZJ().LJII);
        C423090GiR c423090GiR = (C423090GiR) this.LLJIJIL.getValue();
        C786410Ut5.LJLLLLLL(LIZJ().LJIIIIZZ >= 4.0f ? 0 : 8, c423090GiR);
        c423090GiR.setRatingProgress(LIZJ().LJIIIIZZ);
        C786410Ut5.LJLLLLLL((((View) this.LLJILJILJ.getValue()).getVisibility() == 0 || ((View) this.LLJIJIL.getValue()).getVisibility() == 0) ? 0 : 8, view);
        C786410Ut5.LJLLLLLL((((View) this.LLJILJILJ.getValue()).getVisibility() == 0 && ((View) this.LLJIJIL.getValue()).getVisibility() == 0) ? 0 : 8, (View) this.LLJILJIL.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        LinearLayout linearLayout = (LinearLayout) C726240SeE.LIZIZ(LIZIZ(), null, R.id.hs8, R.id.vs_feed_ad_layout);
        this.LLILZIL = linearLayout;
        View[] viewArr = new View[8];
        viewArr[0] = linearLayout != null ? linearLayout : null;
        viewArr[1] = this.LLJI.getValue();
        viewArr[2] = this.LLJ.getValue();
        viewArr[3] = this.LLIZLLLIL.getValue();
        viewArr[4] = this.LLILZLL.getValue();
        viewArr[5] = this.LLIZ.getValue();
        viewArr[6] = this.LLJILLL.getValue();
        viewArr[7] = this.LLJJ.getValue();
        Iterator it2 = C13LQ.LJLIIL(viewArr).iterator();
        while (it2.hasNext()) {
            C786410Ut5.I7(this, (View) it2.next());
        }
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public ViewOnClickListenerC997060c3M(C990790btF c990790btF) {
        this.LL = c990790btF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC997150c3V c997070c3N;
        AwemeRawAd awemeRawAd;
        Aweme awemeLIZ = LIZ();
        String simpleName = null;
        if (awemeLIZ != null && (awemeRawAd = awemeLIZ.getAwemeRawAd()) != null) {
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            String str = "";
            if (iAdLandPagePreloadService != null) {
                if (awemeRawAd.getPreloadWeb() == 4) {
                    String channelName = awemeRawAd.getChannelName();
                    String strK0 = iAdLandPagePreloadService.K0("feed");
                    if (strK0 == null) {
                        strK0 = "";
                    }
                    iAdLandPagePreloadService.O0(C1552050qUV.LJ(strK0, channelName), null);
                }
                if (awemeRawAd.getPreloadWebSecondPage() == 1) {
                    String channelName2 = awemeRawAd.getChannelName();
                    String strK02 = iAdLandPagePreloadService.K0("feed");
                    if (strK02 != null) {
                        str = strK02;
                    }
                    iAdLandPagePreloadService.O0(C1552050qUV.LJ(str, channelName2), null);
                }
            }
        }
        View[] viewArr = new View[2];
        LinearLayout linearLayout = this.LLILZIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        int i = 0;
        viewArr[0] = linearLayout;
        viewArr[1] = this.LLJI.getValue();
        if (C13LQ.LJLIIL(viewArr).contains(view)) {
            Function1<AbstractC997150c3V, Unit> function1LIZ = this.LL.LIZ();
            if (C1003680cE2.LIZJ(LIZ())) {
                if (Intrinsics.LJFF(view, this.LLJI.getValue())) {
                    simpleName = "button";
                }
                c997070c3N = new C997070c3N(false, simpleName, 1);
            } else {
                c997070c3N = C997200c3a.LIZ;
            }
            function1LIZ.invoke(c997070c3N);
            return;
        }
        IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
        Fragment fragment = this.LL.getFragment();
        if (fragment != null) {
            simpleName = fragment.getClass().getSimpleName();
        }
        iFeedAdService.setEnterFrom(simpleName);
        int id = view.getId();
        if (id == ((View) this.LLJ.getValue()).getId()) {
            i = 3;
        } else if (id == ((View) this.LLIZLLLIL.getValue()).getId()) {
            i = 11;
        } else if (id == ((View) this.LLILZLL.getValue()).getId()) {
            i = 14;
        } else if (id == ((View) this.LLIZ.getValue()).getId()) {
            i = 12;
        } else if (id == ((View) this.LLJILLL.getValue()).getId()) {
            i = 13;
        } else if (id == ((View) this.LLJJ.getValue()).getId()) {
            i = 15;
        }
        ((IAdOpenHelper) ServiceManager.get().getService(IAdOpenHelper.class)).LIZ(LIZIZ().getContext(), LIZ(), i);
    }
}
