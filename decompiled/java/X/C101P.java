package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.feed.model.tuc.TUCMaskData;
import com.ss.android.ugc.tiktok.tuc.mask.report.CancelReportMaskApi;
import com.ss.android.ugc.tiktok.tuc.model.TUCActionData;
import com.ss.android.ugc.tiktok.tuc.model.TUCButtonData;
import com.ss.android.ugc.tiktok.tuc.model.TUCEventData;
import com.ss.android.ugc.tiktok.tuc.model.TUCIconData;
import com.ss.android.ugc.tiktok.tuc.model.TUCLinkTextData;
import com.ss.android.ugc.tiktok.tuc.model.TUCProcessData;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.101P, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101P implements InterfaceC722440SVm<C101Y> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final C191792101m LJI = new C0SVZ() { // from class: X.101m
        @Override // X.C0SVZ
        public final void LIZIZ() {
        }

        @Override // X.C0SVZ
        public final void LIZ() {
            this.LIZ.LJI("reportlayer_show");
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
        return new C722360SVe("mask", "report", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C101Y> LJ() {
        String string;
        String string2;
        String string3;
        if (!C306830C0z.LIZ()) {
            return new InterfaceC722470SVp<C101Y>() { // from class: X.101V
                @Override // X.InterfaceC722470SVp
                public final C07XH LIZ() {
                    String string4;
                    String string5;
                    String str;
                    C722300SUy c722300SUy = new C722300SUy(null, 0, R.drawable.ffu, 13);
                    VideoMaskInfo reportMaskInfo = this.LIZ.LIZIZ.getReportMaskInfo();
                    String string6 = "";
                    if (reportMaskInfo == null || (string4 = reportMaskInfo.title) == null) {
                        string4 = "";
                    }
                    C101P c101p = this.LIZ;
                    if (string4.length() == 0) {
                        string4 = c101p.LIZ.getString(2131846337);
                    }
                    C191791101l c191791101l = new C191791101l(string4, 2);
                    VideoMaskInfo reportMaskInfo2 = this.LIZ.LIZIZ.getReportMaskInfo();
                    if (reportMaskInfo2 == null || (string5 = reportMaskInfo2.content) == null) {
                        string5 = "";
                    }
                    C101P c101p2 = this.LIZ;
                    if (string5.length() == 0) {
                        string5 = c101p2.LIZ.getString(2131846335);
                    }
                    C191791101l c191791101l2 = new C191791101l(string5, 2);
                    VideoMaskInfo reportMaskInfo3 = this.LIZ.LIZIZ.getReportMaskInfo();
                    if (reportMaskInfo3 != null && (str = reportMaskInfo3.cancelMaskLabel) != null) {
                        string6 = str;
                    }
                    C101P c101p3 = this.LIZ;
                    if (string6.length() == 0) {
                        string6 = c101p3.LIZ.getString(2131846336);
                    }
                    return new C101Y(c722300SUy, c191791101l, c191791101l2, null, Collections.singletonList(new C191784101e(string6, "show_video", EnumC191783101d.CONST_SECONDARY, new C191786101g(this.LIZ), null, null, null, true)), 88);
                }
            };
        }
        Context context = this.LIZ;
        String str = this.LIZJ;
        Aweme aweme = this.LIZIZ;
        TUCIconData tUCIconData = new TUCIconData(1, "tuc_biz_ic_report_success", null, null, null);
        VideoMaskInfo reportMaskInfo = aweme.getReportMaskInfo();
        if (reportMaskInfo == null || (string = reportMaskInfo.title) == null) {
            string = "";
        }
        if (string.length() == 0) {
            string = context.getString(2131846337);
        }
        TUCLinkTextData tUCLinkTextData = new TUCLinkTextData(string, null);
        VideoMaskInfo reportMaskInfo2 = aweme.getReportMaskInfo();
        if (reportMaskInfo2 == null || (string2 = reportMaskInfo2.content) == null) {
            string2 = "";
        }
        if (string2.length() == 0) {
            string2 = context.getString(2131846335);
        }
        TUCLinkTextData tUCLinkTextData2 = new TUCLinkTextData(string2, null);
        VideoMaskInfo reportMaskInfo3 = aweme.getReportMaskInfo();
        if (reportMaskInfo3 == null || (string3 = reportMaskInfo3.cancelMaskLabel) == null) {
            string3 = "";
        }
        if (string3.length() == 0) {
            string3 = context.getString(2131846336);
        }
        Pair[] pairArr = new Pair[2];
        String aid = aweme.getAid();
        pairArr[0] = new Pair("group_id", aid != null ? aid : "");
        pairArr[1] = new Pair("author_id", AwemeExtKt.getAuthorUid(aweme));
        C101M c101m = new C101M(context, str, new TUCMaskData(null, tUCIconData, tUCLinkTextData, tUCLinkTextData2, null, Collections.singletonList(new TUCButtonData(string3, "show_video", "constSecondary", new TUCProcessData(new TUCEventData(null, "showpost_click", C2097608Jq.LJIIJ(pairArr), new LinkedHashMap()), C1697810uHb.LJIIJJI(new TUCActionData("report_network", null), new TUCActionData("watch", null))), true)), null, null));
        c101m.LIZLLL.LIZJ = new InterfaceC1239610iMZ() { // from class: X.101c
            @Override // X.InterfaceC1239610iMZ
            public final void LIZ(Context context2, TUCActionData tUCActionData, C101B c101b) {
                if (Intrinsics.LJFF(tUCActionData.actionName, "watch")) {
                    this.LIZ.LJ.invoke();
                    c101b.invoke(Boolean.TRUE, null);
                } else if (Intrinsics.LJFF(tUCActionData.actionName, "report_network")) {
                    this.LIZ.LJFF(new AwS563S0100000_19(c101b, 2769));
                    this.LIZ.LJFF.invoke();
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
        return this.LJI;
    }

    public final void LJFF(Function0<Unit> function0) {
        if (this.LIZIZ.getReportMaskInfo() == null) {
            return;
        }
        CancelReportMaskApi cancelReportMaskApi = CancelReportMaskApi.LIZ;
        String aid = this.LIZIZ.getAid();
        Integer num = this.LIZIZ.getReportMaskInfo().maskType;
        Integer num2 = this.LIZIZ.getReportMaskInfo().status;
        cancelReportMaskApi.getClass();
        ComplianceServiceProvider.LJIIZILJ().LJ(CancelReportMaskApi.LIZIZ.cancelReportMask(aid, num, num2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(function0, 155), new AfS181S0100000_12(this, 156));
    }

    public final void LJI(String str) {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", this.LIZJ);
        String aid = this.LIZIZ.getAid();
        if (aid == null) {
            aid = "";
        }
        pairArr[1] = new Pair("group_id", aid);
        pairArr[2] = new Pair("author_id", AwemeExtKt.getAuthorUid(this.LIZIZ));
        C20684815ws.LJIILLIIL(str, C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C101Z(this.LIZ, (C101Y) c07xh, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.101m] */
    public C101P(Context context, Aweme aweme, String str, AwS412S0200000_11 awS412S0200000_11, AwS555S0100000_11 awS555S0100000_11, AwS412S0200000_11 awS412S0200000_112) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = awS412S0200000_11;
        this.LJ = awS555S0100000_11;
        this.LJFF = awS412S0200000_112;
    }
}
