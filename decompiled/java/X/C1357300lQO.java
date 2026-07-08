package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lQO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357300lQO {
    public static String LIZLLL(UrlModel urlModel) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        if (urlModel != null && urlModel.getUrlList() != null) {
            Iterator<String> it2 = urlModel.getUrlList().iterator();
            while (it2.hasNext()) {
                Uri uri = UriProtector.parse(it2.next());
                if (!uri.isOpaque()) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "logo_name");
                    if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                        break;
                    }
                }
            }
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(final Aweme aweme, final String str, String str2, final String str3, final String str4, final int i, final int i2) {
        final String aid = aweme.getAid();
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = str2;
        if (Intrinsics.LJFF("download", str2)) {
            c259800zU.element = "download";
            c259800zU2.element = null;
        } else {
            c259800zU.element = "share";
        }
        C15O7.LIZJ(new Callable() { // from class: X.0lQN
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<PhotoModeImageUrlModel> imageList;
                C1C7U.LIZ("ShareDownloadSuccessMonitor$Companion@c53e.monitorWaterMarkStatus$1");
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("group_id", aid);
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("action_type", c259800zU.element);
                c2344009Gk.LJIIIIZZ("platform", c259800zU2.element);
                c2344009Gk.LJIIIIZZ("is_long", str3);
                c2344009Gk.LJIIIIZZ("logo_name", str4);
                c2344009Gk.LIZJ(i, "watermark_type");
                Aweme aweme2 = aweme;
                int i3 = i2;
                C1373850lr5.LIZ.getClass();
                if (aweme2.getAwemeType() == 150) {
                    c2344009Gk.LIZJ(aweme2.getAwemeType(), "aweme_type");
                    PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
                    c2344009Gk.LJ((photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) ? null : Integer.valueOf(imageList.size()), "pic_cnt");
                    c2344009Gk.LIZJ(i3, "download_pic_cnt");
                }
                C20684815ws.LJIILLIIL("watermark_share_download", c2344009Gk.LIZ);
                C1C7U.LIZIZ("ShareDownloadSuccessMonitor$Companion@c53e.monitorWaterMarkStatus$1");
                return null;
            }
        });
    }

    public static void LIZ(final long j, final UrlModel urlModel, final Boolean bool, final Integer num, final Long l, final String str, final String str2, final String str3, final boolean z, final boolean z2) {
        C15O7.LIZJ(new Callable() { // from class: X.0m5H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<String> urlList;
                List<String> urlList2;
                C1C7U.LIZ("ShareDownloadSuccessMonitor$Companion@c53e.monitorDownloadStatus$1");
                String str4 = str;
                if (str4 != null) {
                    C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                    boolean zEquals = TextUtils.equals(c2137908Zd.LJIIIIZZ(str4), "20");
                    C2241008qG c2241008qG = new C2241008qG();
                    Long l2 = l;
                    long jLongValue = 0;
                    if (l2 != null && l2.longValue() != 0) {
                        jLongValue = j / l.longValue();
                    }
                    c2241008qG.LIZ.put("download_rate", Long.valueOf(jLongValue));
                    c2241008qG.LIZ.put("download_duration", l);
                    c2241008qG.LIZ.put("file_size", Long.valueOf(j));
                    c2241008qG.LIZ.put("errorDesc", "null");
                    c2241008qG.LIZ.put("errorCode", "null");
                    c2241008qG.LIZ.put("url", str2);
                    Boolean bool2 = Boolean.FALSE;
                    c2241008qG.LIZ.put("needWaterMark", bool2);
                    c2241008qG.LIZ.put("muteAudio", bool);
                    c2241008qG.LIZ.put("fileMagic", c2137908Zd.LJIIIIZZ(str));
                    c2241008qG.LIZ.put("isMp4", Boolean.valueOf(zEquals));
                    UrlModel urlModel2 = urlModel;
                    c2241008qG.LIZ.put("urlNums", (urlModel2 == null || (urlList2 = urlModel2.getUrlList()) == null) ? null : Integer.valueOf(urlList2.size()));
                    c2241008qG.LIZ.put("isPrivateAweme", Boolean.valueOf(z2));
                    if (!zEquals) {
                        ShareFlavorService.LIZ.getClass();
                        C04UB.LIZ().LIZIZ(str, j, c2241008qG);
                    }
                    C844470XAv.LIZ.getClass();
                    C2427309fD c2427309fDLIZ = C2427309fD.LIZ(C844470XAv.LIZ());
                    if (c2427309fDLIZ != null) {
                        c2241008qG.LIZ(Boolean.TRUE, "has_remove_sd");
                        c2241008qG.LIZ(Boolean.valueOf(c2427309fDLIZ.LIZJ()), "sd_state");
                        c2241008qG.LIZJ(Long.valueOf(c2427309fDLIZ.LIZIZ), "sd_available_size");
                        c2241008qG.LIZLLL("share_dir", C2427709fH.LJIILL(C844470XAv.LIZ()));
                    } else {
                        c2241008qG.LIZ(bool2, "has_remove_sd");
                    }
                    JSONObject jSONObjectLJ = c2241008qG.LJ();
                    CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                    C793770VBv.LJIIJJI("save_video_success_rate", 0, jSONObjectLJ);
                } else {
                    C2241008qG c2241008qG2 = new C2241008qG();
                    c2241008qG2.LIZ.put("download_rate", 0);
                    c2241008qG2.LIZ.put("download_duration", l);
                    c2241008qG2.LIZ.put("file_size", -1);
                    c2241008qG2.LIZ.put("errorDesc", str3);
                    c2241008qG2.LIZ.put("errorCode", num);
                    c2241008qG2.LIZ.put("url", str2);
                    c2241008qG2.LIZ.put("needWaterMark", Boolean.valueOf(z));
                    c2241008qG2.LIZ.put("fileMagic", "download_error");
                    c2241008qG2.LIZ.put("muteAudio", bool);
                    c2241008qG2.LIZ.put("strategy_enabled", Boolean.valueOf(C2427009fA.LJIIL()));
                    c2241008qG2.LIZ.put("isMp4", "notSure");
                    UrlModel urlModel3 = urlModel;
                    c2241008qG2.LIZ.put("urlNums", (urlModel3 == null || (urlList = urlModel3.getUrlList()) == null) ? null : Integer.valueOf(urlList.size()));
                    c2241008qG2.LIZ.put("isPrivateAweme", Boolean.valueOf(z2));
                    C844470XAv.LIZ.getClass();
                    C2427309fD c2427309fDLIZ2 = C2427309fD.LIZ(C844470XAv.LIZ());
                    if (c2427309fDLIZ2 != null) {
                        c2241008qG2.LIZ(Boolean.TRUE, "has_remove_sd");
                        c2241008qG2.LIZ(Boolean.valueOf(c2427309fDLIZ2.LIZJ()), "sd_state");
                        c2241008qG2.LIZJ(Long.valueOf(c2427309fDLIZ2.LIZIZ), "sd_available_size");
                        c2241008qG2.LIZLLL("share_dir", C2427709fH.LJIILL(C844470XAv.LIZ()));
                    } else {
                        c2241008qG2.LIZ(Boolean.FALSE, "has_remove_sd");
                    }
                    JSONObject jSONObjectLJ2 = c2241008qG2.LJ();
                    CopyOnWriteArrayList<Runnable> copyOnWriteArrayList2 = C794240VDq.LIZ;
                    C793770VBv.LJIIJJI("save_video_success_rate", 1, jSONObjectLJ2);
                }
                C1C7U.LIZIZ("ShareDownloadSuccessMonitor$Companion@c53e.monitorDownloadStatus$1");
                return null;
            }
        });
    }
}
