package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MaskExtraModule;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.feed.model.tuc.MaskExtraTipData;
import com.ss.android.ugc.aweme.feed.model.tuc.TUCMaskData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tuc.model.TUCActionData;
import com.ss.android.ugc.tiktok.tuc.model.TUCBackgroundData;
import com.ss.android.ugc.tiktok.tuc.model.TUCButtonData;
import com.ss.android.ugc.tiktok.tuc.model.TUCEventData;
import com.ss.android.ugc.tiktok.tuc.model.TUCIconData;
import com.ss.android.ugc.tiktok.tuc.model.TUCLinkTextData;
import com.ss.android.ugc.tiktok.tuc.model.TUCProcessData;
import com.ss.android.ugc.tiktok.tuc.platform.handler.SchemaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.101N, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101N implements InterfaceC722440SVm<C101Y> {
    public final Activity LIZ;
    public final Aweme LIZIZ;
    public final C1219200hpe LIZJ;
    public final Function1<Aweme, Unit> LIZLLL;
    public final C101U LJ = new C0SVZ() { // from class: X.101U
        @Override // X.C0SVZ
        public final void LIZIZ() {
        }

        @Override // X.C0SVZ
        public final void LIZ() {
            int i;
            MaskExtraModule maskExtraModule;
            String str;
            String str2;
            if (!((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).isLogin()) {
                i = 1;
            } else if (ComplianceServiceProvider.LJIL().LJJJJZI()) {
                i = 2;
            } else {
                VideoMaskInfo contentClassificationMaskInfo = this.LIZ.LIZIZ.getContentClassificationMaskInfo();
                i = (contentClassificationMaskInfo == null || (maskExtraModule = contentClassificationMaskInfo.birthdayEditModule) == null || (str = maskExtraModule.btnText) == null || str.length() == 0) ? 3 : 4;
            }
            Pair[] pairArr = new Pair[4];
            C1219200hpe c1219200hpe = this.LIZ.LIZJ;
            if (c1219200hpe == null || (str2 = c1219200hpe.LIZ) == null) {
                str2 = "";
            }
            pairArr[0] = new Pair("enter_from", str2);
            String aid = this.LIZ.LIZIZ.getAid();
            pairArr[1] = new Pair("item_id", aid != null ? aid : "");
            pairArr[2] = new Pair("scenario", String.valueOf(i));
            pairArr[3] = new Pair("aweme_type", String.valueOf(this.LIZ.LIZIZ.getAwemeType()));
            C20684815ws.LJIILLIIL("content_classification_mask_layer", C2097608Jq.LJIIIIZZ(pairArr));
        }
    };

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        String str;
        Pair[] pairArr = new Pair[2];
        String aid = this.LIZIZ.getAid();
        String str2 = "";
        if (aid == null) {
            aid = "";
        }
        pairArr[0] = new Pair("item_id", aid);
        C1219200hpe c1219200hpe = this.LIZJ;
        if (c1219200hpe != null && (str = c1219200hpe.LIZ) != null) {
            str2 = str;
        }
        pairArr[1] = new Pair("enter_from", str2);
        return new C722360SVe("mask", "restricted_mode", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final boolean LJI() {
        C1219200hpe c1219200hpe = this.LIZJ;
        if (!Intrinsics.LJFF(c1219200hpe != null ? c1219200hpe.LIZ : null, "homepage_hot")) {
            return false;
        }
        C1219200hpe c1219200hpe2 = this.LIZJ;
        return c1219200hpe2.LIZIZ == 0 && c1219200hpe2.LIZJ == 1;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C101Y> LJ() {
        String str;
        String str2;
        MaskExtraModule maskExtraModule;
        String string;
        String string2;
        String str3;
        MaskExtraModule maskExtraModule2;
        MaskExtraModule maskExtraModule3;
        MaskExtraModule maskExtraModule4;
        String str4;
        MaskExtraModule maskExtraModule5;
        String str5;
        if (!C306830C0z.LIZ()) {
            return new InterfaceC722470SVp<C101Y>() { // from class: X.101R
                public final Aweme LIZ;

                @Override // X.InterfaceC722470SVp
                public final C07XH LIZ() {
                    VideoMaskInfo videoMaskInfo;
                    String str6;
                    C191784101e c191784101e;
                    String str7;
                    String str8;
                    Aweme aweme = this.LIZ;
                    if (aweme == null || (videoMaskInfo = aweme.getContentClassificationMaskInfo()) == null) {
                        videoMaskInfo = new VideoMaskInfo(Boolean.FALSE, 0, null, null, null, "", "", "", null);
                    }
                    MaskExtraModule maskExtraModule6 = videoMaskInfo.policyModule;
                    String str9 = maskExtraModule6 != null ? maskExtraModule6.btnText : null;
                    boolean z = !(str9 == null || str9.length() == 0);
                    boolean zLJI = this.LIZIZ.LJI();
                    boolean z2 = !((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).isLogin();
                    MaskExtraModule maskExtraModule7 = videoMaskInfo.birthdayEditModule;
                    boolean z3 = !(maskExtraModule7 == null || (str8 = maskExtraModule7.btnText) == null || str8.length() == 0);
                    ArrayList arrayList = new ArrayList();
                    String str10 = "";
                    if (z2) {
                        arrayList.add(new C191784101e(this.LIZIZ.LIZ.getString(2131846517), "content_classification_login", EnumC191783101d.CONST_SECONDARY, new C1239580iMW(this.LIZIZ), null, null, null, false));
                    } else if (z3) {
                        MaskExtraModule maskExtraModule8 = videoMaskInfo.birthdayEditModule;
                        if (maskExtraModule8 == null || (str6 = maskExtraModule8.btnText) == null) {
                            str6 = "";
                        }
                        arrayList.add(new C191784101e(str6, "content_classification_edit_age", EnumC191783101d.CONST_SECONDARY, new C1238790iLF(this.LIZIZ), null, null, null, false));
                    }
                    C0SV1 c0sv1 = C0SV1.TUX;
                    C722300SUy c722300SUy = new C722300SUy(C1308910kAL.LIZJ(R.attr.ei, this.LIZIZ.LIZ), c0sv1.ordinal(), R.raw.icon_large_protection, 4);
                    String string3 = videoMaskInfo.title;
                    if (string3 == null) {
                        string3 = "";
                    }
                    C101N c101n = this.LIZIZ;
                    if (string3.length() == 0) {
                        string3 = c101n.LIZ.getString(2131828416);
                    }
                    C191791101l c191791101l = new C191791101l(string3, 2);
                    String string4 = videoMaskInfo.content;
                    if (string4 == null) {
                        string4 = "";
                    }
                    C101N c101n2 = this.LIZIZ;
                    if (string4.length() == 0) {
                        string4 = c101n2.LIZ.getString(2131828417);
                    }
                    C191791101l c191791101l2 = new C191791101l(string4, 2);
                    C0SVT c0svt = new C0SVT(C0SXM.COLOR.ordinal(), 0, C1308910kAL.LIZJ(R.attr.bm, this.LIZIZ.LIZ), 2);
                    if (z) {
                        MaskExtraModule maskExtraModule9 = videoMaskInfo.policyModule;
                        if (maskExtraModule9 != null && (str7 = maskExtraModule9.btnText) != null) {
                            str10 = str7;
                        }
                        c191784101e = new C191784101e(str10, "content_classification_policy_link", EnumC191783101d.PRIMARY, new C191780101a(this.LIZIZ), null, null, null, false);
                    } else {
                        c191784101e = null;
                    }
                    return new C101Y(c722300SUy, c191791101l, c191791101l2, c191784101e, c0svt, arrayList, zLJI ? new C191796101q(new C722300SUy(C1308910kAL.LIZJ(R.attr.eh, this.LIZIZ.LIZ), c0sv1.ordinal(), R.raw.icon_chevron_up_double_fill, 4), this.LIZIZ.LIZ.getString(2131828415)) : null);
                }

                {
                    this.LIZ = this.LIZIZ.LIZIZ;
                }
            };
        }
        InterfaceC1239610iMZ interfaceC1239610iMZ = new InterfaceC1239610iMZ() { // from class: X.0iMX
            @Override // X.InterfaceC1239610iMZ
            public final void LIZ(Context context, TUCActionData tUCActionData, C101B c101b) {
                String str6 = tUCActionData.actionName;
                if (Intrinsics.LJFF(str6, "rm_update_bd")) {
                    C101N c101n = this.LIZ;
                    c101n.getClass();
                    ComplianceServiceProvider.LIZLLL().LJIIIIZZ(c101n.LIZ, new C1219190hpd(c101n), "content_classification_mask_layer");
                    c101b.invoke(Boolean.TRUE, null);
                    return;
                }
                if (Intrinsics.LJFF(str6, "rm_sign_up")) {
                    C101N c101n2 = this.LIZ;
                    C0XPD.LIZIZ(c101n2.LIZ, "maturity_mask_layer", "click", null, new C1620940sHc(c101n2, 0));
                    c101b.invoke(Boolean.TRUE, null);
                    return;
                }
                c101b.invoke(Boolean.FALSE, null);
            }
        };
        Activity activity = this.LIZ;
        C1219200hpe c1219200hpe = this.LIZJ;
        if (c1219200hpe == null || (str = c1219200hpe.LIZ) == null) {
            str = "";
        }
        Aweme aweme = this.LIZIZ;
        boolean zLJI = LJI();
        VideoMaskInfo contentClassificationMaskInfo = aweme.getContentClassificationMaskInfo();
        boolean z = !(contentClassificationMaskInfo == null || (maskExtraModule5 = contentClassificationMaskInfo.policyModule) == null || (str5 = maskExtraModule5.btnText) == null || str5.length() == 0);
        boolean z2 = !((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).isLogin();
        boolean z3 = !(contentClassificationMaskInfo == null || (maskExtraModule4 = contentClassificationMaskInfo.birthdayEditModule) == null || (str4 = maskExtraModule4.btnText) == null || str4.length() == 0);
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(new TUCButtonData(activity.getString(2131846517), "content_classification_login", "constSecondary", new TUCProcessData(new TUCEventData(null, "click_button_on_cc_mask", C2097608Jq.LJIIJ(new Pair("button_clicked", "log_in"), new Pair("item_id", aweme.getAid()), new Pair("scenario", "1"), new Pair("aweme_type", String.valueOf(aweme.getAwemeType()))), new LinkedHashMap()), Collections.singletonList(new TUCActionData("rm_sign_up", null))), false));
        } else if (z3) {
            if (contentClassificationMaskInfo == null || (maskExtraModule = contentClassificationMaskInfo.birthdayEditModule) == null || (str2 = maskExtraModule.btnText) == null) {
                str2 = "";
            }
            arrayList.add(new TUCButtonData(str2, "content_classification_edit_age", "constSecondary", new TUCProcessData(new TUCEventData(null, "click_button_on_cc_mask", C2097608Jq.LJIIJ(new Pair("button_clicked", "update_bd"), new Pair("item_id", aweme.getAid()), new Pair("scenario", "4"), new Pair("aweme_type", String.valueOf(aweme.getAwemeType()))), new LinkedHashMap()), Collections.singletonList(new TUCActionData("rm_update_bd", null))), false));
        }
        TUCButtonData tUCButtonData = null;
        TUCIconData tUCIconData = new TUCIconData(3, null, null, "icon_large_protection", "ConstTextInverse5");
        if (contentClassificationMaskInfo == null || (string = contentClassificationMaskInfo.title) == null) {
            string = "";
        }
        if (string.length() == 0) {
            string = activity.getString(2131828416);
        }
        TUCLinkTextData tUCLinkTextData = new TUCLinkTextData(string, null);
        if (contentClassificationMaskInfo == null || (string2 = contentClassificationMaskInfo.content) == null) {
            string2 = "";
        }
        if (string2.length() == 0) {
            string2 = activity.getString(2131828417);
        }
        TUCLinkTextData tUCLinkTextData2 = new TUCLinkTextData(string2, null);
        if (z) {
            String str6 = (contentClassificationMaskInfo == null || (maskExtraModule3 = contentClassificationMaskInfo.policyModule) == null) ? null : maskExtraModule3.btnText;
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Pair[] pairArr = new Pair[3];
            VideoMaskInfo contentClassificationMaskInfo2 = aweme.getContentClassificationMaskInfo();
            if (contentClassificationMaskInfo2 == null || (maskExtraModule2 = contentClassificationMaskInfo2.policyModule) == null || (str3 = maskExtraModule2.url) == null) {
                str3 = "";
            }
            pairArr[0] = new Pair("url", str3);
            pairArr[1] = new Pair("hide_nav_bar", "1");
            pairArr[2] = new Pair("hide_status_bar", "1");
            SchemaModel schemaModel = new SchemaModel("//webview", C2097608Jq.LJIIJ(pairArr));
            c1227904rF.getClass();
            tUCButtonData = new TUCButtonData(str6, "content_classification_policy_link", null, new TUCProcessData(null, Collections.singletonList(new TUCActionData("navigation", C1227904rF.LJI(schemaModel)))), false);
        }
        C101M c101m = new C101M(activity, str, new TUCMaskData(null, tUCIconData, tUCLinkTextData, tUCLinkTextData2, tUCButtonData, arrayList, new TUCBackgroundData(2, null, "BGCreation"), zLJI ? new MaskExtraTipData(new TUCIconData(3, null, null, "icon_chevron_up_double_fill", "ConstTextInverse4"), activity.getString(2131828415)) : null));
        c101m.LIZLLL.LIZJ = interfaceC1239610iMZ;
        return c101m;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C101Y>> LIZIZ() {
        return C101Z.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C101Z(this.LIZ, (C101Y) c07xh, this);
    }

    public final void LJFF(int i, String str) {
        String str2;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("button_clicked", str);
        C1219200hpe c1219200hpe = this.LIZJ;
        if (c1219200hpe == null || (str2 = c1219200hpe.LIZ) == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("enter_from", str2);
        pairArr[2] = new Pair("item_id", this.LIZIZ.getAid());
        pairArr[3] = new Pair("scenario", String.valueOf(i));
        pairArr[4] = new Pair("aweme_type", String.valueOf(this.LIZIZ.getAwemeType()));
        C20684815ws.LJIILLIIL("click_button_on_cc_mask", C2097608Jq.LJIIIIZZ(pairArr));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.101U] */
    public C101N(Activity activity, Aweme aweme, C1219200hpe c1219200hpe, AwS590S0100000_11 awS590S0100000_11) {
        this.LIZ = activity;
        this.LIZIZ = aweme;
        this.LIZJ = c1219200hpe;
        this.LIZLLL = awS590S0100000_11;
    }
}
