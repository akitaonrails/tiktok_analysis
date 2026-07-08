package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MaskExtraModule;
import com.ss.android.ugc.aweme.feed.model.MaskPopText;
import com.ss.android.ugc.aweme.feed.model.MaskPopWindow;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.feed.model.tuc.TUCMaskData;
import com.ss.android.ugc.tiktok.tuc.model.TUCActionData;
import com.ss.android.ugc.tiktok.tuc.model.TUCButtonData;
import com.ss.android.ugc.tiktok.tuc.model.TUCEventData;
import com.ss.android.ugc.tiktok.tuc.model.TUCIconData;
import com.ss.android.ugc.tiktok.tuc.model.TUCLinkTextData;
import com.ss.android.ugc.tiktok.tuc.model.TUCProcessData;
import com.ss.android.ugc.tiktok.tuc.platform.handler.MaskPopupWindowData;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.101K, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101K implements InterfaceC722440SVm<C101Y> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final Fragment LIZJ;
    public final String LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public final C1913240zt4 LJII = new C0SVZ() { // from class: X.0zt4
        @Override // X.C0SVZ
        public final void LIZ() {
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("scenario", "general");
            String aid = this.LIZ.LIZIZ.getAid();
            if (aid == null) {
                aid = "";
            }
            pairArr[1] = new Pair("group_id", aid);
            C20684815ws.LJIILLIIL("tns_show_mask_layer", C2097608Jq.LJIIIIZZ(pairArr));
            this.LIZ.LJ.invoke();
        }

        @Override // X.C0SVZ
        public final void LIZIZ() {
        }
    };

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        Pair[] pairArr = new Pair[2];
        String aid = this.LIZIZ.getAid();
        if (aid == null) {
            aid = "";
        }
        pairArr[0] = new Pair("item_id", aid);
        String str = this.LIZLLL;
        pairArr[1] = new Pair("enter_from", str != null ? str : "");
        return new C722360SVe("mask", "general", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C101Y> LJ() {
        int i;
        MaskExtraModule maskExtraModule;
        String str;
        List<MaskPopText> list;
        if (!C306830C0z.LIZ()) {
            return new InterfaceC722470SVp<C101Y>() { // from class: X.101L
                @Override // X.InterfaceC722470SVp
                public final C07XH LIZ() {
                    String str2;
                    String str3;
                    MaskExtraModule maskExtraModule2;
                    String str4;
                    C191784101e c191784101e = null;
                    C722300SUy c722300SUy = new C722300SUy(null, 0, R.drawable.ffw, 13);
                    VideoMaskInfo generalMaskInfo = this.LIZ.LIZIZ.getGeneralMaskInfo();
                    String str5 = "";
                    if (generalMaskInfo == null || (str2 = generalMaskInfo.title) == null) {
                        str2 = "";
                    }
                    C191791101l c191791101l = new C191791101l(str2, 2);
                    VideoMaskInfo generalMaskInfo2 = this.LIZ.LIZIZ.getGeneralMaskInfo();
                    if (generalMaskInfo2 == null || (str3 = generalMaskInfo2.content) == null) {
                        str3 = "";
                    }
                    C191791101l c191791101l2 = new C191791101l(str3, 2);
                    VideoMaskInfo generalMaskInfo3 = this.LIZ.LIZIZ.getGeneralMaskInfo();
                    if (generalMaskInfo3 != null && generalMaskInfo3.popWindow != null) {
                        VideoMaskInfo generalMaskInfo4 = this.LIZ.LIZIZ.getGeneralMaskInfo();
                        if (generalMaskInfo4 != null && (maskExtraModule2 = generalMaskInfo4.popWindow) != null && (str4 = maskExtraModule2.btnText) != null) {
                            str5 = str4;
                        }
                        c191784101e = new C191784101e(str5, "general_mask_link", EnumC191783101d.PRIMARY, new C1912760zsI(this.LIZ), null, null, null, true);
                    }
                    return new C101Y(c722300SUy, c191791101l, c191791101l2, c191784101e, C1697810uHb.LJIIJJI(new C191784101e(this.LIZ.LIZ.getString(2131837045), "skip_video", EnumC191783101d.PRIMARY, new C1912770zsJ(this.LIZ), null, null, null, false), new C191784101e(this.LIZ.LIZ.getString(2131837046), "watch_video", EnumC191783101d.CONST_SECONDARY, new C1912780zsK(this.LIZ), null, null, null, false)), 80);
                }
            };
        }
        Context context = this.LIZ;
        String str2 = this.LIZLLL;
        Aweme aweme = this.LIZIZ;
        TUCButtonData tUCButtonData = null;
        TUCIconData tUCIconData = new TUCIconData(1, "tuc_ic_not_suit_content", null, null, null);
        VideoMaskInfo generalMaskInfo = aweme.getGeneralMaskInfo();
        TUCLinkTextData tUCLinkTextData = new TUCLinkTextData(generalMaskInfo != null ? generalMaskInfo.title : null, null);
        VideoMaskInfo generalMaskInfo2 = aweme.getGeneralMaskInfo();
        TUCLinkTextData tUCLinkTextData2 = new TUCLinkTextData(generalMaskInfo2 != null ? generalMaskInfo2.content : null, null);
        VideoMaskInfo generalMaskInfo3 = aweme.getGeneralMaskInfo();
        if (generalMaskInfo3 == null || (maskExtraModule = generalMaskInfo3.popWindow) == null) {
            i = 2;
        } else {
            String str3 = maskExtraModule.btnText;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("scenario", "general");
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            pairArr[1] = new Pair("group_id", aid);
            TUCEventData tUCEventData = new TUCEventData(null, "tns_mask_layer_click_learnmore", C2097608Jq.LJIIJ(pairArr), new LinkedHashMap());
            C1227904rF c1227904rF = C1227904rF.LIZ;
            MaskPopWindow maskPopWindow = maskExtraModule.popWindow;
            if (maskPopWindow != null) {
                str = maskPopWindow.title;
                list = maskPopWindow.content;
            } else {
                str = null;
                list = null;
            }
            Pair[] pairArr2 = new Pair[2];
            pairArr2[0] = new Pair("scenario", "general");
            String aid2 = aweme.getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            pairArr2[1] = new Pair("group_id", aid2);
            MaskPopupWindowData maskPopupWindowData = new MaskPopupWindowData(str, list, "tns_show_mask_layer_popup", C2097608Jq.LJIIJ(pairArr2));
            c1227904rF.getClass();
            tUCButtonData = new TUCButtonData(str3, "general_mask_link", null, new TUCProcessData(tUCEventData, Collections.singletonList(new TUCActionData("popup", C1227904rF.LJI(maskPopupWindowData)))), true);
            i = 2;
        }
        TUCButtonData[] tUCButtonDataArr = new TUCButtonData[i];
        String string = context.getString(2131837045);
        Pair[] pairArr3 = new Pair[i];
        pairArr3[0] = new Pair("scenario", "general");
        String aid3 = aweme.getAid();
        if (aid3 == null) {
            aid3 = "";
        }
        pairArr3[1] = new Pair("group_id", aid3);
        tUCButtonDataArr[0] = new TUCButtonData(string, "skip_video", "primary", new TUCProcessData(new TUCEventData(null, "tns_mask_layer_click_skip", C2097608Jq.LJIIJ(pairArr3), new LinkedHashMap()), Collections.singletonList(new TUCActionData("skip", null))), false);
        String string2 = context.getString(2131837046);
        Pair[] pairArr4 = new Pair[2];
        pairArr4[0] = new Pair("scenario", "general");
        String aid4 = aweme.getAid();
        pairArr4[1] = new Pair("group_id", aid4 != null ? aid4 : "");
        tUCButtonDataArr[1] = new TUCButtonData(string2, "watch_video", "constSecondary", new TUCProcessData(new TUCEventData(null, "tns_mask_layer_click_watch", C2097608Jq.LJIIJ(pairArr4), new LinkedHashMap()), Collections.singletonList(new TUCActionData("watch", null))), false);
        C101M c101m = new C101M(context, str2, new TUCMaskData(null, tUCIconData, tUCLinkTextData, tUCLinkTextData2, tUCButtonData, C1697810uHb.LJIIJJI(tUCButtonDataArr), null, null));
        c101m.LIZLLL.LIZJ = new InterfaceC1239610iMZ() { // from class: X.101J
            @Override // X.InterfaceC1239610iMZ
            public final void LIZ(Context context2, TUCActionData tUCActionData, C101B c101b) {
                if (Intrinsics.LJFF(tUCActionData.actionName, "skip")) {
                    this.LIZ.LJI.invoke();
                    c101b.invoke(Boolean.TRUE, null);
                } else if (Intrinsics.LJFF(tUCActionData.actionName, "watch")) {
                    this.LIZ.LJFF.invoke();
                    c101b.invoke(Boolean.TRUE, null);
                } else {
                    c101b.invoke(Boolean.FALSE, null);
                }
            }
        };
        return c101m;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C101Y>> LIZIZ() {
        return C101Z.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C101Z(this.LIZ, (C101Y) c07xh, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0zt4] */
    public C101K(Context context, Aweme aweme, Fragment fragment, String str, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112, AwS555S0100000_11 awS555S0100000_113) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = fragment;
        this.LIZLLL = str;
        this.LJ = awS555S0100000_11;
        this.LJFF = awS555S0100000_112;
        this.LJI = awS555S0100000_113;
    }
}
