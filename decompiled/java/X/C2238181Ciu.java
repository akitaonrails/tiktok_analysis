package X;

import Y.ACListenerS98S0300000_34;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profilebanner.IProfileBannerService;
import com.ss.android.ugc.aweme.profilebanner.data.ButtonInfo;
import com.ss.android.ugc.aweme.profilebanner.data.HighLightInfo;
import com.ss.android.ugc.aweme.profilebanner.data.ProfileBannerInfoModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS243S0300000_34;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS48S0310000_34;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1Ciu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238181Ciu extends AbstractC2238211Cix {
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
    public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
    public static final float LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final IProfileBannerService LIZIZ;
    public final EnumC19381310s7 LIZJ = EnumC19381310s7.TEMPLATE_RECT_WITHOUT_BUTTON;

    @Override // X.InterfaceC2238291Cj5
    public final void onDismiss() {
    }

    @Override // X.InterfaceC2238291Cj5
    public final void onShow() {
    }

    @Override // X.InterfaceC2238291Cj5
    public final EnumC19381310s7 getTemplateType() {
        return this.LIZJ;
    }

    public C2238181Ciu(IProfileBannerService iProfileBannerService) {
        this.LIZIZ = iProfileBannerService;
    }

    public static void LIZLLL(Context context, String str) {
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(context, str).open();
        } else {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("RectWithoutButtonBannerProvider", "open route error. schema is null or empty");
        }
    }

    @Override // X.InterfaceC2238291Cj5
    public final View LIZ(Context context, ProfileBannerInfoModel profileBannerInfoModel) {
        String str;
        String str2;
        int i;
        ViewGroup viewGroupLIZIZ = this.LIZIZ.LIZIZ();
        if (viewGroupLIZIZ != null) {
            ButtonInfo buttonInfo = profileBannerInfoModel.buttonInfo;
            String str3 = null;
            if (buttonInfo != null) {
                str = buttonInfo.title;
            } else {
                str = null;
            }
            boolean zLIZIZ = C736460Sui.LIZIZ(str);
            C20515015Pg c20515015Pg = new C20515015Pg(viewGroupLIZIZ);
            c20515015Pg.LIZ.LJIIJJI = C1257230ioz.LIZIZ;
            if (profileBannerInfoModel.iconUrl != null) {
                c20515015Pg.LIZ.LIZ = new AwS585S0100000_6(new AwS48S0310000_34(this, context, profileBannerInfoModel, zLIZIZ, 0), (Function1<? super C1721380utc, ? extends List<? extends Object>>) 324);
            }
            String str4 = profileBannerInfoModel.title;
            C20516415Pu c20516415Pu = c20515015Pg.LIZ;
            c20516415Pu.LJ = str4;
            String str5 = profileBannerInfoModel.content;
            HighLightInfo highLightInfo = profileBannerInfoModel.highLightInfo;
            if (highLightInfo != null) {
                str2 = highLightInfo.content;
            } else {
                str2 = null;
            }
            c20516415Pu.LJFF = str5;
            c20516415Pu.LJI = str2;
            if (profileBannerInfoModel.showCloseButton) {
                i = 0;
            } else {
                i = 2;
            }
            c20516415Pu.LJIIL = i;
            ButtonInfo buttonInfo2 = profileBannerInfoModel.buttonInfo;
            if (buttonInfo2 != null) {
                str3 = buttonInfo2.title;
            }
            c20516415Pu.LJIIIIZZ = str3;
            c20516415Pu.LIZJ = false;
            AwS400S0200000_34 awS400S0200000_34 = new AwS400S0200000_34(this, profileBannerInfoModel, 36);
            C20516415Pu c20516415Pu2 = c20515015Pg.LIZ;
            c20516415Pu2.LJIILLIIL = awS400S0200000_34;
            c20516415Pu2.LJIILIIL = new ACListenerS98S0300000_34(context, profileBannerInfoModel, this, 0);
            c20516415Pu2.LJIILL = new ACListenerS98S0300000_34(context, profileBannerInfoModel, this, 1);
            c20515015Pg.LIZ.LJII = new AwS243S0300000_34(this, context, profileBannerInfoModel, 2);
            C20514815Pe c20514815PeLIZ = c20515015Pg.LIZ();
            if (c20514815PeLIZ != null) {
                return c20514815PeLIZ;
            }
        }
        return new View(context);
    }

    @Override // X.InterfaceC2238291Cj5
    public final void LIZIZ(View view, ProfileBannerInfoModel profileBannerInfoModel) {
        C20514815Pe c20514815Pe;
        String str;
        String str2 = null;
        if ((view instanceof C20514815Pe) && (c20514815Pe = (C20514815Pe) view) != null) {
            ButtonInfo buttonInfo = profileBannerInfoModel.buttonInfo;
            if (buttonInfo != null) {
                str = buttonInfo.title;
            } else {
                str = null;
            }
            new AwS48S0310000_34(this, view, profileBannerInfoModel, C736460Sui.LIZIZ(str), 1).invoke(c20514815Pe.LLJL.LLILZLL);
            new AwS243S0300000_34(view, profileBannerInfoModel, this, 3).invoke(c20514815Pe.LLJL.LLILZIL);
            new AwS613S0100000_34(profileBannerInfoModel, 124).invoke(c20514815Pe.LLJL.LLIZ);
            String str3 = profileBannerInfoModel.content;
            HighLightInfo highLightInfo = profileBannerInfoModel.highLightInfo;
            if (highLightInfo != null) {
                str2 = highLightInfo.content;
            }
            c20514815Pe.LLJL.LIZJ(str3, str2, new AwS400S0200000_34(this, profileBannerInfoModel, 37));
            new AwS243S0300000_34(view, profileBannerInfoModel, this, 4).invoke(c20514815Pe.LLJL.LLJ);
            new AwS613S0100000_34(profileBannerInfoModel, 125).invoke(c20514815Pe.LLJL.LLJI);
        }
    }

    public static void LIZJ(Context context, FrameLayout frameLayout, UrlModel urlModel, boolean z) {
        int i;
        if (urlModel == null) {
            C786410Ut5.LJZ(8, frameLayout);
            return;
        }
        C786410Ut5.LJZ(0, frameLayout);
        if (z) {
            i = LJ;
        } else {
            i = LIZLLL;
        }
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float f = LJFF;
        C462800ICw.LIZ(smartImageView, new float[]{f, f, f, f});
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJJIIZ(R.drawable.czk);
        c1331670kl3LJIIIIZZ.LJIJJLI(R.drawable.czj);
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        c1331670kl3LJIIIIZZ.LJIIJ(new C19LJ(1));
        frameLayout.addView(smartImageView, new FrameLayout.LayoutParams(i, i));
    }
}
