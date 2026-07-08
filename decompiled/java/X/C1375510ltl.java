package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ltl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375510ltl extends AbstractC1376190lur implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLIZ = 0;
    public final Activity LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ = "click_download_icon";
    public final C1375520ltm LLILZIL = new InterfaceC752010Teh() { // from class: X.0ltm
        @Override // X.InterfaceC752010Teh
        public final String C7(boolean z) {
            return this.LL.LLILLL;
        }
    };
    public SharePackage LLILZLL;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_arrow_down_to_line_bold;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_arrow_to_bottom;
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
        return 2131838416;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "now_save";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = this.LLILLJJLI.awemeACLShareInfo;
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

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.AbstractC1376190lur
    public final void LJ(Context context, C1376210lut c1376210lut) {
        ACLCommonShare downloadGeneral;
        String string;
        String strLIZIZ;
        String string2;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        C1374050lrP c1374050lrP = new C1374050lrP(0);
        c1374050lrP.LIZIZ = false;
        AwemeACLShare awemeACLShare = this.LLILLJJLI.awemeACLShareInfo;
        String string3 = null;
        if (awemeACLShare != null) {
            downloadGeneral = awemeACLShare.getDownloadGeneral();
        } else {
            downloadGeneral = null;
        }
        c1374050lrP.LIZ = downloadGeneral;
        C1374320lrq c1374320lrqLIZ = c1374050lrP.LIZ();
        Bundle bundle5 = new Bundle();
        SharePackage sharePackage = this.LLILZLL;
        if (sharePackage != null && (bundle4 = sharePackage.extras) != null) {
            string3 = bundle4.getString("now_type");
        }
        if (string3 == null) {
            string3 = "";
        }
        C786410Ut5.LJJJI("now_type", string3, bundle5);
        SharePackage sharePackage2 = this.LLILZLL;
        if (sharePackage2 == null || (bundle3 = sharePackage2.extras) == null || (string = bundle3.getString("download_method")) == null) {
            string = "";
        }
        C786410Ut5.LJJJI("download_method", string, bundle5);
        C1376010luZ c1376010luZ = C1376010luZ.LIZ;
        c1376010luZ.getClass();
        C1376010luZ.LJJIFFI = bundle5;
        C1376270luz c1376270luz = C1376270luz.LIZ;
        SharePackage sharePackage3 = this.LLILZLL;
        if (sharePackage3 != null && (bundle2 = sharePackage3.extras) != null) {
            bundle2.getString("download_method");
        }
        c1376270luz.getClass();
        String strLIZ = C1373660lqm.LIZ(this.LLILLJJLI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08HM.LIZJ(strLIZ));
        sbLIZ.append(".png");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        String strLJIJ = C2427709fH.LJIJ(context);
        strLJIJ.toString();
        if (u.LJIIZILJ(strLJIJ, "/", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJIJ);
            sbLIZ2.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLJIJ);
            sbLIZ3.append('/');
            sbLIZ3.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        Aweme aweme = this.LLILLJJLI;
        SharePackage sharePackage4 = this.LLILZLL;
        if (sharePackage4 == null || (bundle = sharePackage4.extras) == null || (string2 = bundle.getString("enter_from")) == null) {
            string2 = "";
        }
        C1376320lv4.LIZJ(aweme, string2, this.LLILZ, C0SUC.LIZ(context).getFromGroupId(), C0SUC.LIZ(context).getNewsId(), bundle5);
        if (C2354709Kn.LIZIZ(strLIZIZ)) {
            Aweme aweme2 = this.LLILLJJLI;
            C1376270luz.LJI = aweme2;
            C1376010luZ.LJI = aweme2;
            C1376010luZ.LJIIZILJ(c1376010luZ, strLIZIZ, false, 24);
            return;
        }
        final WeakReference weakReference = new WeakReference(this.LL);
        final Integer numValueOf = Integer.valueOf(c1376210lut.LIZLLL);
        C1376010luZ.LJIIJJI(c1376010luZ, this.LLILLL, this.LLILZ, new C1376330lv5(weakReference, numValueOf) { // from class: X.0lrm
            public static final /* synthetic */ int LJFF = 0;

            @Override // X.C1376330lv5
            public final void LIZ(String str, AbstractC1375080lt4 abstractC1375080lt4, C1374320lrq c1374320lrq, boolean z) {
                super.LIZ(str, new AbstractC1375080lt4() { // from class: X.0lrn
                    @Override // X.AbstractC1375080lt4
                    public final void LIZLLL() {
                        C1376010luZ.LIZ.getClass();
                        C1376010luZ.LJIILLIIL(null);
                    }

                    @Override // X.AbstractC1375080lt4
                    public final void LIZ(String str2) {
                        C1376010luZ.LIZ.LIZ(null);
                    }

                    @Override // X.AbstractC1375080lt4
                    public final void LIZIZ(int i) {
                        C1376010luZ.LIZ.getClass();
                        C1376010luZ.LJIILJJIL(i);
                    }

                    @Override // X.AbstractC1375080lt4
                    public final void LIZJ(String str2) {
                        C1376010luZ.LIZ.getClass();
                        C1376010luZ.LJIILL();
                    }

                    @Override // X.AbstractC1375080lt4
                    public final void LJ(DownloadInfo downloadInfo) {
                        C1376010luZ.LIZ.getClass();
                        C1376010luZ.LJIILLIIL(downloadInfo);
                    }

                    @Override // X.AbstractC1375080lt4
                    public final void LJFF(String str2, String str3, boolean z2) {
                        C1376010luZ.LJIIZILJ(C1376010luZ.LIZ, str2, z2, 8);
                    }
                }, c1374320lrq, z);
            }

            @Override // X.C1376330lv5
            public final String LIZIZ(Aweme aweme3, int i, C1374320lrq c1374320lrq, boolean z) {
                return C1373660lqm.LIZ(aweme3);
            }
        }, this.LLILLJJLI, C093Y.LJ(0), c1374320lrqLIZ, false, null, 384);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        SharePackage sharePackage = (SharePackage) baseSharePackage;
        this.LLILZLL = sharePackage;
        LIZ(this.LL, context, this.LLILLJJLI, sharePackage, this.LLILZ, this.LLILLL, this.LLILZIL, false);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ltm] */
    public C1375510ltl(Activity activity, String str, Aweme aweme) {
        this.LL = activity;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
    }
}
