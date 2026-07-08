package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.tuc.TUCMaskData;
import com.ss.android.ugc.tiktok.tuc.mask.photosensitive.SetSettingParamModel;
import com.ss.android.ugc.tiktok.tuc.model.TUCActionData;
import com.ss.android.ugc.tiktok.tuc.model.TUCButtonData;
import com.ss.android.ugc.tiktok.tuc.model.TUCEventData;
import com.ss.android.ugc.tiktok.tuc.model.TUCIconData;
import com.ss.android.ugc.tiktok.tuc.model.TUCLinkTextData;
import com.ss.android.ugc.tiktok.tuc.model.TUCProcessData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.101O, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101O implements InterfaceC722440SVm<C101Y> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final C191781101b LJI = new C0SVZ() { // from class: X.101b
        @Override // X.C0SVZ
        public final void LIZIZ() {
        }

        @Override // X.C0SVZ
        public final void LIZ() {
            if (ComplianceServiceProvider.LJI().LJIJ() == 1) {
                String aid = this.LIZ.LIZIZ.getAid();
                C20684815ws.LJIILLIIL("tns_show_photosensitive_removed", C2097908Jt.LIZJ(new Pair("group_id", aid != null ? aid : "")));
            } else {
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("scenario", "photosensitive");
                String aid2 = this.LIZ.LIZIZ.getAid();
                pairArr[1] = new Pair("group_id", aid2 != null ? aid2 : "");
                C20684815ws.LJIILLIIL("tns_show_mask_layer", C2097608Jq.LJIIIIZZ(pairArr));
            }
            this.LIZ.LIZLLL.invoke();
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
        String str = this.LIZJ;
        pairArr[1] = new Pair("enter_from", str != null ? str : "");
        return new C722360SVe("mask", "photosensitive", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C101Y> LJ() {
        int i;
        int i2;
        int i3;
        int i4;
        TUCMaskData tUCMaskData;
        int i5;
        int i6;
        int i7;
        if (!C306830C0z.LIZ()) {
            return new InterfaceC722470SVp<C101Y>() { // from class: X.101S
                @Override // X.InterfaceC722470SVp
                public final C07XH LIZ() {
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    if (ComplianceServiceProvider.LJI().LJIJ() == 1) {
                        if (C0BOG.LIZ()) {
                            i12 = 2131839867;
                            i13 = 2131839865;
                            i14 = 2131839866;
                        } else {
                            i12 = 2131839872;
                            i13 = 2131839873;
                            i14 = 2131839874;
                        }
                        String string = this.LIZ.LIZ.getString(i12);
                        String string2 = this.LIZ.LIZ.getString(i13);
                        String string3 = this.LIZ.LIZ.getString(i14);
                        C722300SUy c722300SUy = new C722300SUy(null, 0, R.drawable.ffu, 13);
                        C191791101l c191791101l = new C191791101l(string, 2);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(string2);
                        sbLIZ.append("<br />\n<br />\n");
                        sbLIZ.append(string3);
                        return new C101Y(c722300SUy, c191791101l, new C191791101l(C2188811AlT.LIZIZ(sbLIZ), 2), null, null, 120);
                    }
                    if (C0BOG.LIZ()) {
                        i8 = 2131839861;
                        i9 = 2131839862;
                        i10 = 2131839863;
                        i11 = 2131839864;
                    } else {
                        i8 = 2131839870;
                        i9 = 2131839871;
                        i10 = 2131839877;
                        i11 = 2131839875;
                    }
                    String string4 = this.LIZ.LIZ.getString(i8);
                    String string5 = this.LIZ.LIZ.getString(i9);
                    String string6 = this.LIZ.LIZ.getString(i10);
                    String string7 = this.LIZ.LIZ.getString(i11);
                    C722300SUy c722300SUy2 = new C722300SUy(null, 0, R.drawable.fft, 13);
                    C191791101l c191791101l2 = new C191791101l(this.LIZ.LIZ.getString(2131839876), 2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(string4);
                    sbLIZ2.append("<br />\n<br />\n");
                    sbLIZ2.append(string5);
                    return new C101Y(c722300SUy2, c191791101l2, new C191791101l(C2188811AlT.LIZIZ(sbLIZ2), 2), null, C1697810uHb.LJIIJJI(new C191784101e(string6, "watch_video", EnumC191783101d.PRIMARY, new C101W(this.LIZ), null, null, null, false), new C191784101e(string7, "skip_all", EnumC191783101d.CONST_SECONDARY, new C101X(this.LIZ), null, null, null, false)), 88);
                }
            };
        }
        InterfaceC1239610iMZ interfaceC1239610iMZ = new InterfaceC1239610iMZ() { // from class: X.101T
            @Override // X.InterfaceC1239610iMZ
            public final void LIZ(Context context, TUCActionData tUCActionData, C101B c101b) {
                Object c098200Yq;
                Integer num;
                String str = tUCActionData.actionName;
                int iHashCode = str.hashCode();
                if (iHashCode != 3532159) {
                    if (iHashCode != 112903375) {
                        if (iHashCode == 1005843167 && str.equals("ps_settings")) {
                            try {
                                C1227904rF c1227904rF = C1227904rF.LIZ;
                                String str2 = tUCActionData.extra;
                                c1227904rF.getClass();
                                c098200Yq = (SetSettingParamModel) C1227904rF.LIZIZ(str2, SetSettingParamModel.class);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            SetSettingParamModel setSettingParamModel = (SetSettingParamModel) c098200Yq;
                            if (setSettingParamModel != null && (num = setSettingParamModel.value) != null) {
                                ComplianceServiceProvider.LJI().LJIILLIIL(num.intValue(), null);
                            }
                            c101b.invoke(Boolean.TRUE, null);
                            return;
                        }
                    } else if (str.equals("watch")) {
                        this.LIZ.LJ.invoke();
                        c101b.invoke(Boolean.TRUE, null);
                        return;
                    }
                } else if (str.equals("skip")) {
                    this.LIZ.LJFF.invoke();
                    c101b.invoke(Boolean.TRUE, null);
                    return;
                }
                c101b.invoke(Boolean.FALSE, null);
            }
        };
        Context context = this.LIZ;
        String str = this.LIZJ;
        Aweme aweme = this.LIZIZ;
        if (ComplianceServiceProvider.LJI().LJIJ() == 1) {
            if (C0BOG.LIZ()) {
                i5 = 2131839867;
                i6 = 2131839865;
                i7 = 2131839866;
            } else {
                i5 = 2131839872;
                i6 = 2131839873;
                i7 = 2131839874;
            }
            String string = context.getString(i5);
            String string2 = context.getString(i6);
            String string3 = context.getString(i7);
            TUCIconData tUCIconData = new TUCIconData(1, "tuc_biz_ic_report_success", null, null, null);
            TUCLinkTextData tUCLinkTextData = new TUCLinkTextData(string, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string2);
            sbLIZ.append("<br />\n<br />\n");
            sbLIZ.append(string3);
            tUCMaskData = new TUCMaskData(null, tUCIconData, tUCLinkTextData, new TUCLinkTextData(C2188811AlT.LIZIZ(sbLIZ), null), null, null, null, null);
        } else {
            if (C0BOG.LIZ()) {
                i = 2131839861;
                i2 = 2131839862;
                i3 = 2131839863;
                i4 = 2131839864;
            } else {
                i = 2131839870;
                i2 = 2131839871;
                i3 = 2131839877;
                i4 = 2131839875;
            }
            String string4 = context.getString(i);
            String string5 = context.getString(i2);
            String string6 = context.getString(i3);
            String string7 = context.getString(i4);
            TUCIconData tUCIconData2 = new TUCIconData(1, "tuc_biz_ic_photosensitive_content", null, null, null);
            TUCLinkTextData tUCLinkTextData2 = new TUCLinkTextData(context.getString(2131839876), null);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(string4);
            sbLIZ2.append("<br />\n<br />\n");
            sbLIZ2.append(string5);
            TUCLinkTextData tUCLinkTextData3 = new TUCLinkTextData(C2188811AlT.LIZIZ(sbLIZ2), null);
            TUCButtonData[] tUCButtonDataArr = new TUCButtonData[2];
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("scenario", "photosensitive");
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            pairArr[1] = new Pair("group_id", aid);
            TUCEventData tUCEventData = new TUCEventData(null, "tns_mask_layer_click_watch", C2097608Jq.LJIIJ(pairArr), new LinkedHashMap());
            C1227904rF c1227904rF = C1227904rF.LIZ;
            SetSettingParamModel setSettingParamModel = new SetSettingParamModel("photosensitive_videos_setting", 2);
            c1227904rF.getClass();
            tUCButtonDataArr[0] = new TUCButtonData(string6, "watch_video", "primary", new TUCProcessData(tUCEventData, C1697810uHb.LJIIJJI(new TUCActionData("ps_settings", C1227904rF.LJI(setSettingParamModel)), new TUCActionData("watch", null))), false);
            Pair[] pairArr2 = new Pair[2];
            pairArr2[0] = new Pair("scenario", "photosensitive");
            String aid2 = aweme.getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            pairArr2[1] = new Pair("group_id", aid2);
            tUCButtonDataArr[1] = new TUCButtonData(string7, "skip_all", "constSecondary", new TUCProcessData(new TUCEventData(null, "tns_mask_layer_click_skip", C2097608Jq.LJIIJ(pairArr2), new LinkedHashMap()), C1697810uHb.LJIIJJI(new TUCActionData("ps_settings", C1227904rF.LJI(new SetSettingParamModel("photosensitive_videos_setting", 1))), new TUCActionData("skip", null))), false);
            tUCMaskData = new TUCMaskData(null, tUCIconData2, tUCLinkTextData2, tUCLinkTextData3, null, C1697810uHb.LJIIJJI(tUCButtonDataArr), null, null);
        }
        C101M c101m = new C101M(context, str, tUCMaskData);
        c101m.LIZLLL.LIZJ = interfaceC1239610iMZ;
        return c101m;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C101Y>> LIZIZ() {
        return C101Z.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C101Z(this.LIZ, (C101Y) c07xh, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.101b] */
    public C101O(Context context, Aweme aweme, String str, AFwS198S0000000_11 aFwS198S0000000_11, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = aFwS198S0000000_11;
        this.LJ = awS555S0100000_11;
        this.LJFF = awS555S0100000_112;
    }
}
