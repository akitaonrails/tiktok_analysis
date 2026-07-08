package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c3L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997050c3L implements InterfaceC987490bnv {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final InterfaceC990810btH LL;
    public boolean LLIZ;
    public C997110c3R LLIZLLLIL;
    public ViewOnClickListenerC997060c3M LLJ;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(696));
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(698));
    public final C997320c3m LLILZ = new C997320c3m(AFwS252S0000000_16.get$arr$(697));
    public final C997320c3m LLILZIL = new C997320c3m(AFwS252S0000000_16.get$arr$(699));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1027));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(547));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C997050c3L.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C997050c3L.class, "container", "getContainer()Landroid/view/View;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C997050c3L.class, "callback", "getCallback()Lcom/ss/android/ugc/aweme/api/component/mask/delegate/ICommerceMaskCallBack;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C997050c3L.class, "dataCenter", "getDataCenter()Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC987490bnv
    public final void LJL() {
        LJ(false);
        C997320c3m c997320c3m = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        DataCenter dataCenter = (DataCenter) c997320c3m.LIZ(this);
        if (dataCenter != null) {
            dataCenter.zQ2(null, "ad_mask_ecommerce_notify");
        }
        C997110c3R c997110c3R = this.LLIZLLLIL;
        C622680Oba.LIZLLL(c997110c3R != null ? c997110c3R : null);
    }

    public final Aweme LIZIZ() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (Aweme) c997320c3m.LIZ(this);
    }

    public final View LIZJ() {
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (View) c997320c3m.LIZ(this);
    }

    public final void LJFF() {
        C997110c3R c997110c3R = this.LLIZLLLIL;
        if (c997110c3R == null) {
            c997110c3R = null;
        }
        c997110c3R.LIZIZ(C997240c3e.LIZ);
    }

    public final void LJI() {
        C997110c3R c997110c3R = this.LLIZLLLIL;
        if (c997110c3R == null) {
            c997110c3R = null;
        }
        c997110c3R.LIZIZ(C997250c3f.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0c3Q] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0btF] */
    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        C997110c3R c997110c3R = new C997110c3R(new InterfaceC997170c3X() { // from class: X.0c3Q
            @Override // X.InterfaceC997180c3Y
            public final Function1<AbstractC997150c3V, Unit> LIZ() {
                return new C997210c3b(this.LIZ);
            }

            @Override // X.InterfaceC997180c3Y
            public final View LJIJI() {
                return this.LIZ.LIZJ();
            }

            @Override // X.InterfaceC997170c3X
            public final Aweme getAweme() {
                return this.LIZ.LIZIZ();
            }
        });
        c997110c3R.initialize();
        this.LLIZLLLIL = c997110c3R;
        ViewOnClickListenerC997060c3M viewOnClickListenerC997060c3M = new ViewOnClickListenerC997060c3M(new InterfaceC997140c3U() { // from class: X.0btF
            @Override // X.InterfaceC997180c3Y
            public final Function1<AbstractC997150c3V, Unit> LIZ() {
                return new C997220c3c(this.LIZ);
            }

            @Override // X.InterfaceC997140c3U
            public final C997080c3O LIZIZ() {
                String[] appCategory;
                C990800btG c990800btG = ViewOnClickListenerC997060c3M.LLJJIJIL;
                Context context = LJIJI().getContext();
                Aweme awemeLIZIZ = this.LIZ.LIZIZ();
                c990800btG.getClass();
                AwemeRawAd awemeRawAd = awemeLIZIZ.getAwemeRawAd();
                int nativeCardType = awemeRawAd != null ? awemeRawAd.getNativeCardType() : 0;
                boolean zLLJI = C1017070cZd.LLJI(awemeLIZIZ);
                String desc = awemeLIZIZ.getDesc();
                UrlModel avatarMedium = awemeLIZIZ.getAuthor().getAvatarMedium();
                if (C1019620cdk.LIZIZ(3, awemeLIZIZ)) {
                    AwemeRawAd awemeRawAd2 = awemeLIZIZ.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        awemeRawAd2.getOmVast();
                    }
                } else {
                    User author = awemeLIZIZ.getAuthor();
                    if (author != null) {
                        author.getNickname();
                    }
                }
                String strLIZIZ = C988580bpg.LIZIZ(context, awemeLIZIZ);
                int iLIZ = C988580bpg.LIZ(context, awemeLIZIZ);
                Integer numLIZJ = C988580bpg.LIZJ(context, awemeLIZIZ);
                AwemeRawAd awemeRawAd3 = awemeLIZIZ.getAwemeRawAd();
                String[] strArr = null;
                String appInstall = awemeRawAd3 != null ? awemeRawAd3.getAppInstall() : null;
                AwemeRawAd awemeRawAd4 = awemeLIZIZ.getAwemeRawAd();
                float appLike = awemeRawAd4 != null ? awemeRawAd4.getAppLike() : 0.0f;
                AwemeRawAd awemeRawAd5 = awemeLIZIZ.getAwemeRawAd();
                if (awemeRawAd5 != null && (appCategory = awemeRawAd5.getAppCategory()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : appCategory) {
                        if (str != null && str.length() < 6) {
                            arrayList.add(str);
                        }
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                }
                return new C997080c3O(nativeCardType, zLLJI, desc, avatarMedium, strLIZIZ, iLIZ, numLIZJ, appInstall, appLike, strArr);
            }

            @Override // X.InterfaceC997180c3Y
            public final View LJIJI() {
                return this.LIZ.LIZJ();
            }

            @Override // X.InterfaceC997140c3U
            public final Aweme getAweme() {
                return this.LIZ.LIZIZ();
            }

            @Override // X.InterfaceC997140c3U
            public final Fragment getFragment() {
                return this.LIZ.LL.getFragment();
            }
        });
        viewOnClickListenerC997060c3M.initialize();
        this.LLJ = viewOnClickListenerC997060c3M;
    }

    @Override // X.InterfaceC987490bnv
    public final void onUnbind() {
        C997110c3R c997110c3R = this.LLIZLLLIL;
        if (c997110c3R == null) {
            c997110c3R = null;
        }
        C622680Oba.LIZLLL(c997110c3R);
    }

    @Override // X.InterfaceC987490bnv
    public final void LJJLJLI() {
        C786410Ut5.LJLLLLLL(8, LIZJ());
        C997110c3R c997110c3R = this.LLIZLLLIL;
        if (c997110c3R == null) {
            c997110c3R = null;
        }
        C622680Oba.LIZJ(c997110c3R);
    }

    @Override // X.InterfaceC987490bnv
    public final void onBind() {
        Integer numLIZJ;
        TextView textView;
        if (C1017070cZd.LLLII(LIZIZ())) {
            C997110c3R c997110c3R = this.LLIZLLLIL;
            if (c997110c3R == null) {
                c997110c3R = null;
            }
            C622680Oba.LIZJ(c997110c3R);
            C997110c3R c997110c3R2 = this.LLIZLLLIL;
            if (c997110c3R2 == null) {
                c997110c3R2 = null;
            }
            c997110c3R2.getClass();
        }
        ViewOnClickListenerC997060c3M viewOnClickListenerC997060c3M = this.LLJ;
        if (viewOnClickListenerC997060c3M == null) {
            viewOnClickListenerC997060c3M = null;
        }
        C786410Ut5.LJLLLLLL(8, (View) viewOnClickListenerC997060c3M.LLIZLLLIL.getValue());
        C786410Ut5.LJLLLLLL(8, (View) viewOnClickListenerC997060c3M.LLILZLL.getValue());
        C786410Ut5.LJLLLLLL(8, (View) viewOnClickListenerC997060c3M.LLIZ.getValue());
        C786410Ut5.LJLLLLLL(8, (View) viewOnClickListenerC997060c3M.LLJILLL.getValue());
        C786410Ut5.LJLLLLLL(8, (View) viewOnClickListenerC997060c3M.LLJJI.getValue());
        C786410Ut5.LJLLLLLL(8, (View) viewOnClickListenerC997060c3M.LLJJIII.getValue());
        C786410Ut5.LJLLLLLL(8, (View) viewOnClickListenerC997060c3M.LLJJIJI.getValue());
        C786410Ut5.LJLLLLLL(8, (View) viewOnClickListenerC997060c3M.LLJJIJIIJIL.getValue());
        C786410Ut5.W5(viewOnClickListenerC997060c3M.LIZIZ(), viewOnClickListenerC997060c3M.LIZIZ().getLayoutParams());
        TextView textView2 = (TextView) viewOnClickListenerC997060c3M.LLJ.getValue();
        textView2.setText(viewOnClickListenerC997060c3M.LIZJ().LJ);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(viewOnClickListenerC997060c3M.LIZJ().LJFF);
        C0C3H.LIZ.getClass();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(C0C3H.LIZ() ? 8 : 2)));
        textView2.setBackground(gradientDrawable);
        Integer num = viewOnClickListenerC997060c3M.LIZJ().LJI;
        if (num != null) {
            ((TextView) viewOnClickListenerC997060c3M.LLJ.getValue()).setTextColor(num.intValue());
        }
        if (C1003680cE2.LIZ(viewOnClickListenerC997060c3M.LIZ()) == 1) {
            LinearLayout linearLayout = viewOnClickListenerC997060c3M.LLILZIL;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.setBackgroundResource(R.drawable.ajf);
        } else {
            LinearLayout linearLayout2 = viewOnClickListenerC997060c3M.LLILZIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            Context context = linearLayout2.getContext();
            if ((context != null || (context = C2214201BlK.LJFF()) != null) && (numLIZJ = C1308910kAL.LIZJ(R.attr.oh, context)) != null) {
                int iIntValue = numLIZJ.intValue();
                LinearLayout linearLayout3 = viewOnClickListenerC997060c3M.LLILZIL;
                if (linearLayout3 == null) {
                    linearLayout3 = null;
                }
                linearLayout3.setBackgroundColor(iIntValue);
            }
        }
        View view = (View) viewOnClickListenerC997060c3M.LLJI.getValue();
        if ((view instanceof TextView) && (textView = (TextView) view) != null) {
            textView.setText(!TextUtils.isEmpty(C1003680cE2.LIZIZ(viewOnClickListenerC997060c3M.LIZ())) ? C1003680cE2.LIZIZ(viewOnClickListenerC997060c3M.LIZ()) : C1BWL.LIZJ().getString(2131834545));
        }
        int i = viewOnClickListenerC997060c3M.LIZJ().LIZ;
        if (i == 0) {
            viewOnClickListenerC997060c3M.LJIIIIZZ();
            return;
        }
        if (i == 1) {
            viewOnClickListenerC997060c3M.LJ();
        } else {
            if (i != 2) {
                viewOnClickListenerC997060c3M.LJ();
                return;
            }
            viewOnClickListenerC997060c3M.LIZLLL();
            viewOnClickListenerC997060c3M.LJFF();
            viewOnClickListenerC997060c3M.LJI();
        }
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C997050c3L(C991500buO c991500buO) {
        this.LL = c991500buO;
    }

    public final void LIZ(boolean z) {
        C997320c3m c997320c3m = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        DataCenter dataCenter = (DataCenter) c997320c3m.LIZ(this);
        if (dataCenter != null) {
            dataCenter.zQ2(null, "ad_mask_ecommerce_notify");
        }
        if (C583160Mu2.LIZIZ(LIZIZ())) {
            C583160Mu2.LIZJ(1);
            LJ(false);
            DataCenter dataCenter2 = (DataCenter) this.LLILZIL.LIZ(this);
            if (dataCenter2 != null) {
                dataCenter2.zQ2(null, "ad_play_story_sub_video");
                return;
            }
            return;
        }
        LJ(z);
    }

    public final void LIZLLL(AbstractC997150c3V abstractC997150c3V) {
        if (Intrinsics.LJFF(abstractC997150c3V, new AbstractC997150c3V() { // from class: X.0c3Z
        })) {
            int i = C2187451AjH.LIZ;
            C583160Mu2.LJ = true;
            return;
        }
        if (Intrinsics.LJFF(abstractC997150c3V, C997200c3a.LIZ)) {
            LIZ(true);
            if (C583160Mu2.LIZIZ(LIZIZ())) {
                return;
            }
            ((IAdSceneService) this.LLJI.getValue()).LIZIZ();
            C1022290ci3.LJIJJLI(3, 0, LIZJ().getContext(), LIZIZ());
            return;
        }
        if (abstractC997150c3V instanceof C997070c3N) {
            LIZ(false);
            if (C583160Mu2.LIZIZ(LIZIZ())) {
                return;
            }
            C997070c3N c997070c3N = (C997070c3N) abstractC997150c3V;
            if (c997070c3N.LIZ) {
                return;
            }
            AbstractC1023360cjm abstractC1023360cjm = (AbstractC1023360cjm) this.LLILZLL.getValue();
            String str = c997070c3N.LIZIZ;
            abstractC1023360cjm.getClass();
            C1000620c96.LIZ.getClass();
            abstractC1023360cjm.logAd(C1000620c96.LIZLLL, new AwS67S1000000_16(str, 1));
            return;
        }
        if (abstractC997150c3V instanceof C997090c3P) {
            C583160Mu2.LIZJ(((C997090c3P) abstractC997150c3V).LIZ);
            LJ(false);
            C997320c3m c997320c3m = this.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            DataCenter dataCenter = (DataCenter) c997320c3m.LIZ(this);
            if (dataCenter == null) {
                return;
            }
            dataCenter.zQ2(null, "ad_play_story_sub_video");
            return;
        }
        throw new C1954807lC();
    }

    public final void LJ(boolean z) {
        if (!this.LLIZ) {
            return;
        }
        this.LLIZ = false;
        C997320c3m c997320c3m = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        ((InterfaceC997040c3K) c997320c3m.LIZ(this)).cd(z);
        LIZJ().animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS116S0100000_16(this, 269)).start();
    }
}
