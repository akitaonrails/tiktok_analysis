package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.service.proactive.IProactiveTriggersService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376170lup extends AbstractC1376190lur implements InterfaceC1370310llN {
    public static final /* synthetic */ int LLJI = 0;
    public final Activity LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Integer LLILZLL;
    public SharePackage LLIZ;
    public final C1376230luv LLIZLLLIL;
    public final IProactiveTriggersService LLJ;

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_arrow_down_to_line;
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
        return "save";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.AbstractC1376190lur
    public final boolean LJFF() {
        return Build.VERSION.SDK_INT < 33 && C838410Wul.LIZ(this.LL, "android.permission.WRITE_EXTERNAL_STORAGE") != 0;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        Integer num = this.LLILZLL;
        return num != null ? num.intValue() : R.raw.icon_arrow_down_to_line_bold;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = this.LLILLJJLI.awemeACLShareInfo;
        return (awemeACLShare == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2 || !C2222691Bz1.LJIIIZ() || C1238740iLA.LIZJ("user_growth").LIZ(-1, "japan_share_download_dot") == 1) ? false : true;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = this.LLILLJJLI.awemeACLShareInfo;
        return (awemeACLShare == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2 || !AwemeExtKt.isSharedStoryVisible(this.LLILLJJLI) || this.LLILLJJLI.getIsCommentPostVideo()) ? false : true;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        if (C1376270luz.LIZIZ()) {
            C1376270luz.LIZ.getClass();
            if (C1376270luz.LIZ()) {
                return C294850Bh5.LIZ() ? 2131825059 : 2131834558;
            }
        }
        return C591970NJr.LIZIZ().LIZIZ(this.LLILLJJLI) ? !C294850Bh5.LIZ() ? 2131838416 : 2131825051 : C710930Rud.LJII(this.LLILLJJLI) ? !C294850Bh5.LIZ() ? 2131858252 : 2131825051 : !C294850Bh5.LIZ() ? 2131846803 : 2131825051;
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
        Aweme aweme = this.LLILLJJLI;
        LJJIIZ(aweme, this.LL, c1376210lut.LIZLLL, this.LLILLL, C1387490mD5.LIZLLL(aweme), this.LLIZ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        SharePackage sharePackage = (SharePackage) baseSharePackage;
        this.LLIZ = sharePackage;
        if (C726220SeC.LIZIZ.LIZ(this.LL)) {
            C0TBO.LIZ(new AwS422S0200000_21(baseSharePackage, this, 90));
        } else {
            LIZ(this.LL, context, this.LLILLJJLI, sharePackage, this.LLILZ, this.LLILLL, this.LLIZLLLIL, false);
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

    public C1376170lup(Activity activity, Aweme aweme, String str, String str2, String str3, int i) {
        str = (i & 4) != 0 ? "" : str;
        str2 = (i & 8) != 0 ? "" : str2;
        str3 = (i & 16) != 0 ? "" : str3;
        this.LL = activity;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = null;
        this.LLIZLLLIL = new C1376230luv(this);
        this.LLJ = (IProactiveTriggersService) ServiceManager.get().getService(IProactiveTriggersService.class);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.0m57, X.17sn] */
    public final void LJJIIZ(final Aweme aweme, final Context context, int i, String str, final boolean z, SharePackage sharePackage) {
        boolean z2;
        String strLJJIFFI;
        Intent intent;
        Intent intent2;
        Intent intent3;
        String strCarryMetaSongId;
        String string;
        String string2;
        String string3;
        String takoSessionId;
        Bundle bundle;
        String string4;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        String str2 = str;
        C1376270luz.LIZ.getClass();
        C1376270luz.LJIIJJI = str2;
        C1376270luz.LJIIL = i;
        C1376270luz.LJIILIIL = sharePackage;
        C1379220lzk.LIZJ(aweme, str2);
        C1376230luv c1376230luv = this.LLIZLLLIL;
        if (c1376230luv != null) {
            str2 = c1376230luv.LL.LLILLL;
        }
        int iLJJIII = C0SXF.LJJIII(context, aweme);
        boolean zLIZ = false;
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().enableSaveOwnVideoWithoutWatermask() && Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
            z2 = true;
        } else {
            z2 = false;
        }
        String string5 = UUID.randomUUID().toString();
        if (C0SXF.LJIL(context)) {
            strLJJIFFI = C0SXF.LJJIFFI(context, Boolean.FALSE, str2);
        } else {
            strLJJIFFI = str2;
        }
        String takoVideoSessionId = null;
        String str3 = "";
        if (Intrinsics.LJFF(str2, "single_song") || Intrinsics.LJFF(str2, "prop_page")) {
            MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
            Activity activity = this.LL;
            if (activity != null) {
                intent = activity.getIntent();
            } else {
                intent = null;
            }
            String strCurSquareActionPositionOnInnerFeed = musicDetailCommonModel.curSquareActionPositionOnInnerFeed(aweme, intent);
            Activity activity2 = this.LL;
            if (activity2 != null) {
                intent2 = activity2.getIntent();
            } else {
                intent2 = null;
            }
            String strValueOf = String.valueOf(musicDetailCommonModel.isFromFollowupSquareOriginalVideoInnerFeed(aweme, intent2, false));
            Activity activity3 = this.LL;
            if (activity3 != null) {
                intent3 = activity3.getIntent();
            } else {
                intent3 = null;
            }
            String strSquareRecTypeInnerFeed = musicDetailCommonModel.squareRecTypeInnerFeed(aweme, intent3);
            String strSquareRecReasonInnerFeed = musicDetailCommonModel.squareRecReasonInnerFeed(aweme, this.LL);
            Music music = aweme.getMusic();
            if (music == null) {
                strCarryMetaSongId = "";
            } else {
                strCarryMetaSongId = music.carryMetaSongId();
            }
            C1554960qZC.LIZ(GScope.LL, new C1380770m2F(strCurSquareActionPositionOnInnerFeed, strValueOf, strSquareRecTypeInnerFeed, strSquareRecReasonInnerFeed, strCarryMetaSongId, string5, 1), C1380770m2F.class, "Download");
        }
        GScope gScope = GScope.LL;
        if (sharePackage == null || (bundle5 = sharePackage.extras) == null || (string = bundle5.getString("download_method")) == null) {
            string = "";
        }
        if (sharePackage == null || (bundle4 = sharePackage.extras) == null || (string2 = bundle4.getString("external_sharer_uid")) == null) {
            string2 = "";
        }
        if (sharePackage == null || (bundle3 = sharePackage.extras) == null || (string3 = bundle3.getString("_oid")) == null) {
            string3 = "";
        }
        C1554960qZC.LIZ(gScope, new C1380780m2G(aweme, strLJJIFFI, string, iLJJIII, string5, string2, string3, 17), C1380780m2G.class, "Download");
        C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context);
        String processId = c2189821An6LIZ.getProcessId();
        DetailNavArgModel navArgModel = c2189821An6LIZ.getNavArgModel();
        if (navArgModel != null) {
            takoSessionId = navArgModel.getTakoSessionId();
        } else {
            takoSessionId = null;
        }
        DetailNavArgModel navArgModel2 = c2189821An6LIZ.getNavArgModel();
        if (navArgModel2 != null) {
            takoVideoSessionId = navArgModel2.getTakoVideoSessionId();
        }
        C1554960qZC.LIZ(gScope, new C1380790m2H(processId, takoSessionId, takoVideoSessionId, 1), C1380790m2H.class, "Download");
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            zLIZ = C726220SeC.LIZIZ.LIZ(activityLIZ);
        }
        C1554960qZC.LIZ(gScope, new C1380150m1F(aweme, str2, zLIZ, C726220SeC.LIZIZ.LJ(context, aweme)), C1380150m1F.class, "Download");
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            bundle2.getString("explore_from_group_id");
        }
        C1554960qZC.LIZ(gScope, new InterfaceC2753014t() { // from class: X.0lux
        }, C1376250lux.class, "Download");
        if (sharePackage != null && (bundle = sharePackage.extras) != null && (string4 = bundle.getString("explore_from_group_id")) != null) {
            str3 = string4;
        }
        C1554960qZC.LIZ(gScope, new C1381000m2c(aweme, strLJJIFFI, str3), C1381000m2c.class, "Download");
        final C259800zU c259800zU = new C259800zU();
        final String str4 = str2;
        InterfaceC21168717sj interfaceC21168717sj = new InterfaceC21168717sj() { // from class: X.0lu0
            @Override // X.InterfaceC21168717sj
            public final void onCancel() {
            }

            @Override // X.InterfaceC21168717sj
            public final void onProgress(int i2) {
            }

            @Override // X.InterfaceC21168717sj
            public final void onFailed() {
                ShareDependService.LIZ.getClass();
                ShareDependServiceImpl.LJJJJI().LJI(false);
            }

            @Override // X.InterfaceC21168717sj
            public final void onStart() {
                C1379810m0h c1379810m0h;
                ShareDependService.LIZ.getClass();
                ShareDependServiceImpl.LJJJJI().LJI(true);
                C1376270luz.LIZ.getClass();
                C1376270luz.LJIIIIZZ = "download";
                if (C297600BlW.LIZ()) {
                    Video video = aweme.getVideo();
                    ACLCommonShare aCLCommonShare = null;
                    if (video == null || video.getDownloadNoWatermarkAddr() == null) {
                        AbstractC21169117sn abstractC21169117sn = c259800zU.element;
                        if ((abstractC21169117sn instanceof C1379810m0h) && (c1379810m0h = (C1379810m0h) abstractC21169117sn) != null) {
                            aCLCommonShare = c1379810m0h.LJIILIIL;
                        }
                        C1374940lsq c1374940lsq = C1374940lsq.LIZ;
                        Aweme aweme2 = aweme;
                        int showType = aCLCommonShare != null ? aCLCommonShare.getShowType() : 0;
                        String str5 = this.LLILZ;
                        String str6 = str4;
                        int transcode = aCLCommonShare != null ? aCLCommonShare.getTranscode() : -1;
                        c1374940lsq.getClass();
                        C1374940lsq.LIZ(showType, transcode, aweme2, "download", str5, str6);
                    }
                }
            }

            @Override // X.InterfaceC21168717sj
            public final void onSuccess(String str5) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2398309aX(z, str5, context, aweme, this, str4, null), 3);
            }
        };
        C1379870m0n c1379870m0n = C1379870m0n.LIZ;
        String str5 = this.LLILZ;
        String str6 = this.LLILZIL;
        c1379870m0n.getClass();
        ?? LIZ = C1379870m0n.LIZ(context, interfaceC21168717sj, aweme, str2, str5, false, "download_action", i, "download", str6, iLJJIII, z2);
        c259800zU.element = LIZ;
        C21169617ss.LIZ.getClass();
        C21169617ss.LIZIZ(LIZ);
    }
}
