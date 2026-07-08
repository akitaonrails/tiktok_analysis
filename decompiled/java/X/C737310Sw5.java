package X;

import Y.ACallableS16S2100000_2;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.dislike.FilteredKeywords;
import com.ss.android.ugc.aweme.share.dislike.Keyword;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737310Sw5 implements InterfaceC1370310llN, InterfaceC737340Sw8 {
    public static final /* synthetic */ int LLILZIL = 0;
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "dislike";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return C737330Sw7.LIZ ? R.raw.icon_thumbs_down_fill : R.raw.icon_heart_broken_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return C737330Sw7.LIZ ? R.raw.icon_thumbs_down_fill : R.raw.icon_2pt_broken_heart;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return C737330Sw7.LIZIZ ? 2131828428 : 2131838157;
    }

    @Override // X.InterfaceC737340Sw8
    public final void CB2() {
        Context contextLIZ;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        if (C2214201BlK.LJFF() != null) {
            contextLIZ = C2214201BlK.LJFF();
        } else {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        boolean z = true;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || AwemeExtKt.isAdTraffic(this.LL) || C1110604Wa.LIZ() == 0 || !(contextLIZ instanceof C19GS)) {
            LIZIZ(contextLIZ);
            if (!TextUtils.equals(this.LLILLJJLI, "homepage_hot") && !TextUtils.equals(this.LLILLJJLI, "homepage_playmode_top") && !TextUtils.equals(this.LLILLJJLI, "homepage_playmode_new") && !TextUtils.equals(this.LLILLJJLI, "homepage_playmode_moodboost")) {
                z = false;
            }
            if (!AwemeExtKt.isAdTraffic(this.LL) && z && !C0SXF.LJIL(contextLIZ) && !LIZ(this.LL)) {
                if (contextLIZ != null) {
                    int i = C621810OaB.LIZ;
                    if (C621810OaB.LIZ(this.LL)) {
                        IFilterVideoService iFilterVideoService = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null);
                        if (iFilterVideoService != null) {
                            iFilterVideoService.LJII(contextLIZ, this.LL, this.LLILLJJLI, this.LLILLL, null);
                            return;
                        }
                        return;
                    }
                    IFilterVideoService iFilterVideoService2 = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null);
                    if (iFilterVideoService2 != null) {
                        iFilterVideoService2.LIZLLL(contextLIZ, this.LL, this.LLILLJJLI, this.LLILLL);
                        return;
                    }
                    return;
                }
                return;
            }
            if (LIZ(this.LL)) {
                return;
            }
            if (SharePrefCache.inst().getHasLongPressDislike().LIZ().booleanValue() || Intrinsics.LJFF(this.LLILLJJLI, "long_video_detail_page") || Intrinsics.LJFF(this.LLILLJJLI, "homepage_long_video")) {
                if (C707230Rof.LJ(this.LL)) {
                    C1233040iBy c1233040iBy = new C1233040iBy(contextLIZ);
                    c1233040iBy.LIZIZ(2131847191);
                    c1233040iBy.LIZLLL();
                    return;
                } else {
                    int i2 = AwemeExtKt.isPhotoMode(this.LL) ? 2131830707 : 2131857752;
                    C1233040iBy c1233040iBy2 = new C1233040iBy(contextLIZ);
                    c1233040iBy2.LIZIZ(i2);
                    c1233040iBy2.LIZLLL();
                    return;
                }
            }
            if (C0SXF.LJIL(contextLIZ)) {
                C1233040iBy c1233040iBy3 = new C1233040iBy(contextLIZ);
                c1233040iBy3.LIZIZ(2131834980);
                c1233040iBy3.LIZLLL();
                return;
            } else {
                if (AwemeExtKt.isPhotoMode(this.LL)) {
                    new C1233040iBy(contextLIZ).LIZIZ(2131830707);
                    return;
                }
                C1233040iBy c1233040iBy4 = new C1233040iBy(contextLIZ);
                c1233040iBy4.LIZIZ(2131836888);
                c1233040iBy4.LIZLLL();
                return;
            }
        }
        final C19GS c19gs = (C19GS) contextLIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1382);
        if (this.LL.getTextExtra() != null && this.LL.getTextExtra().size() > 0) {
            Map<String, String> map = C0NB4.LIZ;
            ((InterfaceC596400NaI) C0NB4.LJIIIIZZ.getValue()).LIZIZ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0NB0
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ChooseReasonAPI@c47a.queryFilterWords$disable$1");
                    FilteredKeywords filteredKeywords = (FilteredKeywords) obj;
                    Function2<? super List<Keyword>, ? super Integer, Unit> function2 = C0NB4.LIZJ;
                    if (function2 != null) {
                        function2.invoke(filteredKeywords.getList(), Integer.valueOf(filteredKeywords.getCounts()));
                    }
                    C0NB4.LJII = filteredKeywords;
                    C1C7U.LIZIZ("ChooseReasonAPI@c47a.queryFilterWords$disable$1");
                }
            }, new C09JN() { // from class: X.0NB1
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ChooseReasonAPI@c47a.queryFilterWords$disable$2");
                    Function2<? super List<Keyword>, ? super Integer, Unit> function2 = C0NB4.LIZJ;
                    if (function2 != null) {
                        function2.invoke(new ArrayList(), 0);
                    }
                    C0NB4.LJII = null;
                    C1C7U.LIZIZ("ChooseReasonAPI@c47a.queryFilterWords$disable$2");
                }
            });
        }
        if (C1110604Wa.LIZ() == 1) {
            Aweme aweme = this.LL;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            C20623915n3 c20623915n3 = new C20623915n3(c19gs, aweme, str, str2);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(0);
            View view = c20623915n3.LJII;
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIII = view;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC738780SyS(awS555S0100000_11, c20623915n3, 3);
            C20623915n3.LJIIZILJ = tuxSheet;
            c20623915n3.LJIILJJIL.LIZ();
            TuxTextView tuxTextView = c20623915n3.LJ;
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(c19gs.getString(2131838241));
            c20623915n3.LJIIJJI.LIZIZ(c20623915n3.LJIILLIIL);
            c20623915n3.LIZIZ();
            c20623915n3.LJIIL.LIZJ();
            C20624115n5 c20624115n5 = c20623915n3.LJIIL;
            c20624115n5.LJI = new AwS412S0200000_11(tuxSheet, awS555S0100000_11, 90);
            c20624115n5.LJFF = new AwS275S0300000_31(c20623915n3, tuxSheet, awS555S0100000_11, 39);
            c20623915n3.LIZ();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19gs);
            if (c19egLIZIZ != null && (supportFragmentManager2 = c19egLIZIZ.getSupportFragmentManager()) != null) {
                tuxSheet.show(supportFragmentManager2, "");
                new C0ZDN(c19gs).LIZ(0);
                C1563806Ai.LIZIZ(aweme, str, str2);
                c20623915n3.LJIIIZ.LIZ();
            }
        } else if (C1110604Wa.LIZ() == 2 || C1110604Wa.LIZ() == 4) {
            awS555S0100000_11.invoke();
            final Aweme aweme2 = this.LL;
            final String str3 = this.LLILLJJLI;
            final String str4 = this.LLILLL;
            final View decorView = c19gs.getWindow().getDecorView();
            C786410Ut5.LJLIIL(100L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0iwX
                public final void LIZ() {
                    C436200H8o c436200H8o = new C436200H8o(c19gs, aweme2, str3, str4);
                    c436200H8o.showAtLocation(decorView, 80, 0, 0);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJI(c436200H8o);
                    C787990Uvd.LIZ.getClass();
                    C994003uc.LIZ();
                    new C0ZDN(c19gs).LIZ(0);
                    C15O7.LIZIZ(new ACallableS16S2100000_2(aweme2, str3, str4, 1), C20684815ws.LJFF(), null);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ChooseReasonPopupWindow$Companion@33b4.show$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ChooseReasonPopupWindow$Companion@33b4.show$1");
                }
            });
        } else if (C1110604Wa.LIZ() == 3) {
            Aweme aweme3 = this.LL;
            String str5 = this.LLILLJJLI;
            String str6 = this.LLILLL;
            C20623915n3 c20623915n32 = new C20623915n3(c19gs, aweme3, str5, str6);
            C1390920mIc c1390920mIc2 = new C1390920mIc(false, 0);
            c1390920mIc2.LJIIIIZZ(0);
            View view2 = c20623915n32.LJII;
            TuxSheet tuxSheet2 = c1390920mIc2.LIZ;
            tuxSheet2.LLJJIII = view2;
            tuxSheet2.LLJLILLLLZIIL = false;
            tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC738780SyS(awS555S0100000_11, c20623915n32, 2);
            C20623915n3.LJIIZILJ = tuxSheet2;
            c20623915n32.LJIILJJIL.LIZ();
            TuxTextView tuxTextView2 = c20623915n32.LJ;
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            tuxTextView2.setText(c19gs.getString(2131838241));
            c20623915n32.LJIIJJI.LIZIZ(c20623915n32.LJIILLIIL);
            c20623915n32.LIZJ();
            c20623915n32.LJIIL.LIZJ();
            C20624115n5 c20624115n52 = c20623915n32.LJIIL;
            c20624115n52.LJI = new AwS412S0200000_11(tuxSheet2, awS555S0100000_11, 89);
            c20624115n52.LJFF = new AwS275S0300000_31(c20623915n32, tuxSheet2, awS555S0100000_11, 38);
            c20623915n32.LIZ();
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c19gs);
            if (c19egLIZIZ2 != null && (supportFragmentManager = c19egLIZIZ2.getSupportFragmentManager()) != null) {
                tuxSheet2.show(supportFragmentManager, "");
                new C0ZDN(c19gs).LIZ(0);
                C1563806Ai.LIZIZ(aweme3, str5, str6);
                c20623915n32.LJIIIZ.LIZ();
            }
        }
        Aweme aweme4 = this.LL;
        String str7 = this.LLILLJJLI;
        String str8 = this.LLILLL;
        C13BV c13bv = C13BV.INSTANCE;
        C1563806Ai.LIZ(1, aweme4, str7, str8, "", "dislike", c13bv, c13bv);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    public final boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdDislikeInfo dislikeInfo;
        if ((!AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.enable != 1) && !this.LLILZ) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(Context context) {
        if (!Intrinsics.LJFF(this.LLILLJJLI, "long_video_detail_page") && !Intrinsics.LJFF(this.LLILLJJLI, "homepage_long_video") && !LIZ(this.LL)) {
            LJFF(context);
        }
    }

    public final void LJFF(Context context) {
        if (!C621810OaB.LIZ(this.LL) || Intrinsics.LJFF(this.LLILLJJLI, "homepage_nearby") || Intrinsics.LJFF(this.LLILLJJLI, "homepage_explore") || (context != null && C0SXF.LJIL(context))) {
            C1440005kM.LIZ(new C1210880hcE(this.LLILLJJLI, "FUNCTION_FROM_NOT_INTERESTED", "not_interested", this.LL));
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.InterfaceC737340Sw8
    public final void SF0(Exception exc) {
        boolean z;
        Context contextLIZ;
        String message;
        if (C1110604Wa.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            if (C2214201BlK.LJFF() != null) {
                contextLIZ = C2214201BlK.LJFF();
            } else {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            if (!Intrinsics.LJFF(this.LLILLJJLI, "long_video_detail_page") && !Intrinsics.LJFF(this.LLILLJJLI, "homepage_long_video")) {
                LJFF(null);
            }
            C1233040iBy c1233040iBy = new C1233040iBy(contextLIZ);
            c1233040iBy.LIZIZ(2131838246);
            c1233040iBy.LIZLLL();
            Aweme aweme = this.LL;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            C13BV c13bv = C13BV.INSTANCE;
            if (exc == null || (message = exc.getMessage()) == null) {
                message = "";
            }
            C1563806Ai.LIZ(0, aweme, str, str2, message, "dislike", c13bv, c13bv);
            return;
        }
        LIZIZ(null);
    }

    public C737310Sw5(Aweme aweme, String str) {
        this(aweme, str, "click_share_button");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01d4 A[PHI: r6
      0x01d4: PHI (r6v20 java.lang.String) = (r6v3 java.lang.String), (r6v21 java.lang.String) binds: [B:35:0x01d2, B:33:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01da A[PHI: r6
      0x01da: PHI (r6v19 java.lang.String) = (r6v3 java.lang.String), (r6v20 java.lang.String) binds: [B:35:0x01d2, B:37:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0229 A[PHI: r6
      0x0229: PHI (r6v22 java.lang.String) = (r6v1 java.lang.String), (r6v23 java.lang.String) binds: [B:28:0x01c3, B:26:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1370310llN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(android.content.Context r19, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r20) {
        /*
            Method dump skipped, instruction units count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C737310Sw5.LJIILIIL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    public C737310Sw5(Aweme aweme, String str, String str2) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
