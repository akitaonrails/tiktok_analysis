package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photodownload.PhotoModeDownloadFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: X.0lts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375580lts extends AbstractC1376190lur implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLJ = 0;
    public final Activity LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final C1375650ltz LLIZLLLIL = new InterfaceC752010Teh() { // from class: X.0ltz
        @Override // X.InterfaceC752010Teh
        public final String C7(boolean z) {
            return this.LL.LLILLL;
        }
    };

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
        return R.raw.icon_arrow_down_to_line;
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
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "save_photo";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.AbstractC1376190lur
    public final boolean LJFF() {
        return (Build.VERSION.SDK_INT < 33 && C838410Wul.LIZ(this.LL, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) || (LJJIJL() && LJJIIZ()) || !LJJIJL();
    }

    public final boolean LJJIJL() {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = this.LLILLJJLI.getPhotoModeImageInfo();
        return (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() != 1) ? false : true;
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

    public final boolean LJJIIZ() {
        VideoUrlModel playAddr;
        List<String> urlList;
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).photoModeService().enableSaveSingleImageAsVideo()) {
            if (this.LLILLJJLI.getMusic() != null) {
                return true;
            }
            Video video = this.LLILLJJLI.getVideo();
            if (video != null && (playAddr = video.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        if (C1376270luz.LIZIZ()) {
            C1376270luz.LIZ.getClass();
            if (C1376270luz.LIZ()) {
                return C294850Bh5.LIZ() ? 2131825059 : 2131834558;
            }
        }
        if (!LJJIJL() || !LJJIIZ()) {
            return C294850Bh5.LIZ() ? 2131825051 : 2131858252;
        }
        if (C294850Bh5.LIZ()) {
            return 2131825051;
        }
        return R.string.sg8;
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
        String string;
        String aid;
        Integer numValueOf;
        int size;
        int i;
        int i2;
        User author;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        Bundle bundle;
        SharePackage sharePackage = c1376210lut.LIZJ;
        if (sharePackage == null || (bundle = sharePackage.extras) == null || (string = bundle.getString("panel_source")) == null) {
            string = "share_panel";
        }
        C1371600lnS c1371600lnS = new C1371600lnS();
        c1371600lnS.LJJIIJ = c1376210lut.LIZJ;
        c1371600lnS.LIZ(C621180OYa.LIZIZ.LJJLJ(string));
        c1371600lnS.LJIJI = C621180OYa.LIZIZ.LJIIIIZZ();
        c1371600lnS.LJJIL = new C1355090lMp() { // from class: X.0ltx
            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LJI(Context context2, BaseSharePackage baseSharePackage) {
            }
        };
        C1375590ltt.LIZ(c1376210lut.LIZJ);
        C1376330lv5 c1376330lv5 = new C1376330lv5(new WeakReference(this.LL), Integer.valueOf(c1376210lut.LIZLLL));
        Activity activity = this.LL;
        if ((activity instanceof C19EG) && !C1209960hak.LIZ(activity)) {
            if (LJJIJL()) {
                if (LJJIIZ()) {
                    final C1374300lro c1374300lro = new C1374300lro();
                    C19EG c19eg = (C19EG) this.LL;
                    final Aweme aweme = this.LLILLJJLI;
                    final String str = this.LLILZ;
                    String str2 = this.LLILLL;
                    String str3 = this.LLILZIL;
                    SharePackage sharePackage2 = c1376210lut.LIZJ;
                    int i3 = this.LLIZ;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    String region = null;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    c2344009Gk.LJIIIIZZ("group_id", aid);
                    if (aweme != null) {
                        numValueOf = Integer.valueOf(aweme.getAwemeType());
                    } else {
                        numValueOf = null;
                    }
                    c2344009Gk.LJ(numValueOf, "aweme_type");
                    if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                        size = imageList.size();
                    } else {
                        size = 0;
                    }
                    c2344009Gk.LIZJ(size, "pic_cnt");
                    c2344009Gk.LJIIIIZZ("download_method", str);
                    if (aweme != null && (author = aweme.getAuthor()) != null) {
                        region = author.getRegion();
                    }
                    c2344009Gk.LJIIIIZZ("country_name", region);
                    C20684815ws.LJIILLIIL("download_popup_show", c2344009Gk.LIZ);
                    if (C294850Bh5.LIZ()) {
                        i = 2131825055;
                    } else {
                        i = 2131836348;
                    }
                    if (C294850Bh5.LIZ()) {
                        i2 = 2131825056;
                    } else {
                        i2 = 2131845926;
                    }
                    C1390850mIV c1390850mIV = new C1390850mIV();
                    C1247510iZJ c1247510iZJ = new C1247510iZJ();
                    c1247510iZJ.LIZIZ(i);
                    c1247510iZJ.LIZ(new C1375600ltu(c1374300lro, aweme, str, c1376330lv5, str2, str3, sharePackage2, i3, c19eg));
                    C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                    c1247510iZJ2.LIZIZ(i2);
                    c1247510iZJ2.LIZ(new C1375620ltw(c1374300lro, aweme, str, c1376330lv5, str2, str3, sharePackage2, i3));
                    c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
                    DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: X.0lty
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            C1374300lro c1374300lro2 = c1374300lro;
                            Aweme aweme2 = aweme;
                            String str4 = str;
                            c1374300lro2.getClass();
                            C1374300lro.LIZJ(aweme2, str4, "cancel");
                        }
                    };
                    TuxActionSheet tuxActionSheet = c1390850mIV.LIZ;
                    tuxActionSheet.LL = onCancelListener;
                    tuxActionSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0lXu
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            C1440005kM.LIZ(new C453940Hr6(false, false, 6));
                        }
                    };
                    c1390850mIV.LIZJ().show(SAFExtensionKt.LJJI(c19eg), "single_image_mode_download");
                    return;
                }
                C1374300lro.LIZ(new C1374300lro(), c1376330lv5, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, c1376210lut.LIZJ, this.LLIZ, false, 0, 384);
                return;
            }
            C19EG c19eg2 = (C19EG) this.LL;
            PhotoModeDownloadFragment photoModeDownloadFragment = new PhotoModeDownloadFragment(this.LLILLJJLI, new C1371590lnR(c1371600lnS), this.LLILLL, this.LLILZ, c1376330lv5, this.LLILZIL, this.LLILZLL, this.LLIZ);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = photoModeDownloadFragment;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0OFP
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C1440005kM.LIZ(new C453940Hr6(false, false, 6));
                    FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
                    if (fypAutoScrollService != null) {
                        fypAutoScrollService.LJIJI(false);
                    }
                }
            };
            tuxSheet.show(SAFExtensionKt.LJJI(c19eg2), "PhotoModeDownloadFragment");
            FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
            if (fypAutoScrollService == null) {
                return;
            }
            fypAutoScrollService.LJIJI(true);
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        LIZ(this.LL, context, this.LLILLJJLI, (SharePackage) baseSharePackage, this.LLILZ, this.LLILLL, this.LLIZLLLIL, false);
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ltz] */
    public C1375580lts(Activity activity, Aweme aweme, String str, String str2, String str3, String str4, int i) {
        this.LL = activity;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = i;
    }

    @Override // X.AbstractC1376190lur
    public final void LIZ(Activity activity, Context context, Aweme aweme, SharePackage sharePackage, String str, String str2, InterfaceC752010Teh interfaceC752010Teh, boolean z) {
        C1376010luZ.LIZ.getClass();
        C1376010luZ.LJJI = false;
        super.LIZ(activity, context, aweme, sharePackage, str, str2, interfaceC752010Teh, false);
    }
}
