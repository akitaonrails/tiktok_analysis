package X;

import Y.AkS482S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.AclType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0lqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373550lqb {
    public static final C1373550lqb LIZ = new C1373550lqb();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(7));

    public static void LIZIZ(Activity activity, AlertDialogC1377870lxZ alertDialogC1377870lxZ) {
        if (!activity.isFinishing() && !activity.isDestroyed() && alertDialogC1377870lxZ.isShowing()) {
            alertDialogC1377870lxZ.dismiss();
            C785410UrT.LIZ(alertDialogC1377870lxZ);
        }
    }

    public static UrlModel LIZJ(Aweme aweme, boolean z) {
        if (C729980SkG.LJIIIIZZ(aweme)) {
            if (z) {
                if (C444960Hcc.LIZIZ()) {
                    NowPostInfo nowPostInfo = aweme.nowPostInfo;
                    if (nowPostInfo != null) {
                        return nowPostInfo.watermarkImageRTL;
                    }
                    return null;
                }
                NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                if (nowPostInfo2 != null) {
                    return nowPostInfo2.watermarkImageLTR;
                }
                return null;
            }
            if (C444960Hcc.LIZIZ()) {
                NowPostInfo nowPostInfo3 = aweme.nowPostInfo;
                if (nowPostInfo3 != null) {
                    return nowPostInfo3.fuzzyImageRtlWithWatermark;
                }
                return null;
            }
            NowPostInfo nowPostInfo4 = aweme.nowPostInfo;
            if (nowPostInfo4 != null) {
                return nowPostInfo4.fuzzyImageWithWatermark;
            }
            return null;
        }
        if (C444960Hcc.LIZIZ()) {
            NowPostInfo nowPostInfo5 = aweme.nowPostInfo;
            if (nowPostInfo5 != null) {
                return nowPostInfo5.fuzzyImageRtlWithWatermark;
            }
            return null;
        }
        NowPostInfo nowPostInfo6 = aweme.nowPostInfo;
        if (nowPostInfo6 != null) {
            return nowPostInfo6.fuzzyImageWithWatermark;
        }
        return null;
    }

    public static ACLCommonShare LIZLLL(Aweme aweme, String str) {
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null) {
            ACLCommonShare shareThirdPlatform = awemeACLShare.getShareThirdPlatform();
            if (shareThirdPlatform != null) {
                shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
                return shareThirdPlatform;
            }
            List<ACLCommonShare> platformList = awemeACLShare.getPlatformList();
            if (platformList != null) {
                for (ACLCommonShare aCLCommonShare : platformList) {
                    if (TextUtils.equals(str, aCLCommonShare.getPlatformId())) {
                        aCLCommonShare.setAwemeAclType(AclType.PLATFORM_LIST);
                        return aCLCommonShare;
                    }
                }
            }
            ACLCommonShare shareGeneral = awemeACLShare.getShareGeneral();
            if (shareGeneral != null) {
                shareGeneral.setAwemeAclType(AclType.SHARE_GENERAL);
            }
            return awemeACLShare.getShareGeneral();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.0lto, X.0ltq] */
    public static void LJ(final InterfaceC1369790lkX interfaceC1369790lkX, String str, Context context, SharePackage sharePackage, int i) {
        boolean z;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        C259800zU c259800zU = new C259800zU();
        if (z) {
            if (str != null) {
                ?? c1375540lto = new C1375540lto(C2203008k8.LIZ(context, new C0VSJ(str)), "", sharePackage.title, null, null, false, 232);
                c259800zU.element = c1375540lto;
                String str2 = c1375540lto.LJ;
                if (str2 == null) {
                    str2 = "";
                }
                c1375540lto.LIZIZ("content_url", str2);
                ((AbstractC1375560ltq) c259800zU.element).LIZIZ("media_type", "image/png");
                C786410Ut5.LJJJI("share_form", "photo_form", sharePackage.extras);
                interfaceC1369790lkX.LJJIIJ((AbstractC1375550ltp) c259800zU.element, context, new C0M7Y() { // from class: X.0lqv
                    @Override // X.C0M7Y
                    public final InterfaceC1362720lZ8 LIZ() {
                        return null;
                    }

                    @Override // X.C0M7Y
                    public final View LIZIZ() {
                        return null;
                    }
                });
                return;
            }
            return;
        }
        if (str == null) {
            return;
        }
        sharePackage.LJIJ(interfaceC1369790lkX, new C1373570lqd(interfaceC1369790lkX, sharePackage, c259800zU, context, str));
    }

    public static void LIZ(BaseSharePackage baseSharePackage, final Context context, final View view, String str, final String str2, final Function0 function0) {
        final DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.LJJLJ(R.string.txr);
        if (C1366550lfJ.LIZ(str)) {
            C1391850mK7.LIZIZ(dialogC1389620mGW, "short_link_to_long_loading_dialog");
            C571830Mbl.LIZIZ(dialogC1389620mGW);
        }
        C2089008Gi c2089008Gi = new C2089008Gi(baseSharePackage.url);
        c2089008Gi.LIZIZ(1, "link_attached");
        String strLJ = c2089008Gi.LJ();
        if (strLJ == null) {
            strLJ = "";
        }
        C1374720lsU.LJ(strLJ, baseSharePackage.itemType, str, baseSharePackage, 4).LJIIJ(new AkS482S0100000_21(baseSharePackage, 1)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIILLIIL(new C09JN() { // from class: X.0lo6
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ShareHelper@8fdf.copyLinkForDisableItem$2");
                new C1377850lxX(null, false, 3).LIZ((String) obj, context, CertProviderManagerKt.findCert("bpea-download_permission_turn_off_fallback_copy", 1476399134), null);
                C571830Mbl.LIZ(dialogC1389620mGW);
                if (C304410BwV.LIZ() && C1336205Ku.LIZ(false).getAutoMessageTooltipHelper().LIZ()) {
                    C1373550lqb c1373550lqb = C1373550lqb.LIZ;
                    View view2 = view;
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    c1373550lqb.getClass();
                    C304420BwW.LIZ();
                    if (view2 != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(view2);
                        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                        c1389890mGx.LJII(R.attr.a0i);
                        c1389890mGx.LJIIIZ(2131830949);
                        c1389890mGx.LJIIJJI();
                    } else if (activityLIZ != null || (activityLIZ = C2214201BlK.LJFF()) != null) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                        c1389890mGx2.LJFF(R.raw.icon_tick_fill_small);
                        c1389890mGx2.LJII(R.attr.a0i);
                        c1389890mGx2.LJIIIZ(2131830949);
                        c1389890mGx2.LJIIJJI();
                    }
                } else {
                    C1373550lqb c1373550lqb2 = C1373550lqb.LIZ;
                    String str3 = str2;
                    View view3 = view;
                    Activity activityLIZ2 = C1388190mED.LIZ(context);
                    c1373550lqb2.getClass();
                    if (view3 != null) {
                        C1389890mGx c1389890mGx3 = new C1389890mGx(view3);
                        c1389890mGx3.LJIIJ(str3);
                        c1389890mGx3.LJIIJJI();
                    } else if (activityLIZ2 != null || (activityLIZ2 = C2214201BlK.LJFF()) != null) {
                        C1389890mGx c1389890mGx4 = new C1389890mGx(activityLIZ2);
                        c1389890mGx4.LJIIJ(str3);
                        c1389890mGx4.LJIIJJI();
                    }
                }
                function0.invoke();
                C1C7U.LIZIZ("ShareHelper@8fdf.copyLinkForDisableItem$2");
            }
        });
    }

    public static void LJFF(Aweme aweme, InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, SharePackage sharePackage, Function1 function1, boolean z, int i) {
        if (z) {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            String string = sharePackage.extras.getString("download_share_path");
            if (string == null) {
                string = "";
            }
            AwS387S0200000_21 awS387S0200000_21 = new AwS387S0200000_21(context, interfaceC1369790lkX, 0);
            c1373540lqa.getClass();
            C1373540lqa.LIZIZ(aweme, interfaceC1369790lkX, sharePackage, string, i, null, awS387S0200000_21);
            return;
        }
        if (aweme == null) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C064W(interfaceC1369790lkX, sharePackage, i, context, aweme, function1, view, null), 3);
    }
}
