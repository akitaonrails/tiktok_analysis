package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0lxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377730lxL implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLILZIL = 0;
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_gif;
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
        return true;
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
    public final int LJJLIIIJJIZ() {
        return 2131847858;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "gif";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        Integer num = this.LLILZ;
        return num != null ? num.intValue() : R.raw.icon_gif_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = this.LL.awemeACLShareInfo;
        return (awemeACLShare == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) ? false : true;
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

    public final void LIZ(Context context) {
        final Activity activityLJII = C1375500ltk.LJII(context);
        if (activityLJII != null) {
            C1377830lxV c1377830lxV = C1377830lxV.LIZ;
            final Aweme aweme = this.LL;
            final String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            final String strLIZIZ = C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme));
            c1377830lxV.getClass();
            C736480Suk c736480Suk = new C736480Suk();
            c736480Suk.LIZ("group_id", aweme.getAid());
            c736480Suk.LIZ("author_id", AwemeExtKt.getAuthorUid(aweme));
            c736480Suk.LIZ("enter_from", str);
            c736480Suk.LIZ("panel_source", str2);
            c736480Suk.LIZ("log_pb", strLIZIZ);
            C20684815ws.LJIJ("save_as_gif", c736480Suk.LIZIZ());
            ShareDependService.LIZ.getClass();
            final InterfaceC1377740lxM interfaceC1377740lxMLJIILIIL = ShareDependServiceImpl.LJJJJI().LJIILIIL();
            if (Build.VERSION.SDK_INT >= 33) {
                if (interfaceC1377740lxMLJIILIIL != null) {
                    interfaceC1377740lxMLJIILIIL.LIZIZ(activityLJII, str, aweme, strLIZIZ);
                }
            } else {
                if (!(activityLJII instanceof C19EG) && interfaceC1377740lxMLJIILIIL != null) {
                    interfaceC1377740lxMLJIILIIL.LIZ();
                }
                C19514711Wn c19514711WnLIZIZ = C19514711Wn.LIZIZ.LIZIZ(activityLJII, TokenCert.Companion.with("bpea-gif_share_page_request_permission"));
                c19514711WnLIZIZ.LIZIZ("android.permission.WRITE_EXTERNAL_STORAGE");
                c19514711WnLIZIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.0lxd
                    @Override // X.InterfaceC19515111Wr
                    public final void onCanceled() {
                    }

                    @Override // X.InterfaceC19515111Wr
                    public final void LIZ(C0HWO... c0hwoArr) {
                        for (C0HWO c0hwo : c0hwoArr) {
                            if (c0hwo.LIZIZ != EnumC442280HVy.GRANTED) {
                                InterfaceC1377740lxM interfaceC1377740lxM = interfaceC1377740lxMLJIILIIL;
                                if (interfaceC1377740lxM != null) {
                                    interfaceC1377740lxM.LIZ();
                                    return;
                                }
                                return;
                            }
                        }
                        InterfaceC1377740lxM interfaceC1377740lxM2 = interfaceC1377740lxMLJIILIIL;
                        if (interfaceC1377740lxM2 == null) {
                            return;
                        }
                        interfaceC1377740lxM2.LIZIZ(activityLJII, str, aweme, strLIZIZ);
                    }
                });
            }
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

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        String toastMsg;
        ACLCommonShare downloadGeneral;
        int i;
        InteractionPermission allowCreateSticker;
        ACLCommonShare downloadGeneral2;
        AwemeACLShare awemeACLShare = this.LL.awemeACLShareInfo;
        if (awemeACLShare != null && (downloadGeneral2 = awemeACLShare.getDownloadGeneral()) != null) {
            toastMsg = downloadGeneral2.getToastMsg();
        } else {
            toastMsg = null;
        }
        if (toastMsg != null && toastMsg.length() > 0) {
            C1233040iBy c1233040iBy = new C1233040iBy(context);
            c1233040iBy.LIZJ(toastMsg);
            c1233040iBy.LIZLLL();
        }
        AwemeACLShare awemeACLShare2 = this.LL.awemeACLShareInfo;
        if (awemeACLShare2 != null && (downloadGeneral = awemeACLShare2.getDownloadGeneral()) != null && downloadGeneral.getCode() == 0) {
            InteractPermission interactPermission = this.LL.getInteractPermission();
            if (interactPermission != null && (allowCreateSticker = interactPermission.getAllowCreateSticker()) != null) {
                i = allowCreateSticker.status;
            } else {
                i = 2;
            }
            if (!IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJIIZILJ(context, i, EnumC035400Am.EDUCATION_SHEET_CREATE_AND_NOT_NOW.getValue(), this.LLILLJJLI, new AwS387S0200000_21(this, context, 59))) {
                LIZ(context);
            }
        }
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

    public C1377730lxL(Aweme aweme, Integer num, String str, String str2) {
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = num;
    }

    public final void LIZIZ(String str, Long l, Long l2, Long l3, Integer num, String str2) {
        IMStickerApi.LIZ.LIZIZ().getImStickerAnalytics().LJ(num, l, l2, l3, this.LL.getAid(), this.LLILLJJLI, "share as gif", str, str2);
    }
}
