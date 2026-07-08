package X;

import Y.AfS156S0200000_21;
import Y.AkS468S0100000_3;
import Y.AkS482S0100000_21;
import android.content.Context;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376300lv2 {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static Aweme LJ;
    public static String LJFF;
    public static final C1376300lv2 LIZ = new C1376300lv2();
    public static final C11NJ LIZLLL = new C11NJ();
    public static String LJI = "";
    public static String LJII = "";
    public static String LJIIIIZZ = "";
    public static String LJIIIZ = "";
    public static String LJIIJ = "";
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(new C1376310lv3());
    public static final C01GW LJIIL = C452501pT.LIZIZ(new C2492709pl());
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(new C2492809pm());
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(new C2492509pj());
    public static final C01GW LJIILL = C452501pT.LIZIZ(new C2492409pi());

    public static Context LIZ() {
        return (Context) LJIIJJI.getValue();
    }

    public static void LIZIZ(int i, Aweme aweme) {
        C707370Rot.LIZ.LIZIZ("video_download_status").postValue(C0SU5.LIZIZ(2, aweme, i, 8));
    }

    public static void LIZJ(final Aweme aweme, String str, Function1 function1) {
        String str2;
        String uri;
        VideoUrlModel playAddrH264;
        boolean zLJI = MethodIDManager.LJI(196717);
        if (C721220SQu.LJFF(0, aweme)) {
            str2 = "photo_mode_save_live_photo_as_video";
        } else {
            str2 = "photo_mode_save_image_as_video";
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(LIZ(), str2, true)) {
            C1376270luz.LIZ.getClass();
            C1376270luz.LJI = aweme;
            C1376270luz.LJII = str;
            LJ = aweme;
            LJFF = str;
            LIZIZ = false;
            LIZJ = true;
            C707370Rot.LIZ.LIZIZ("video_download_status").postValue(C0SU5.LIZIZ(1, aweme, 0, 12));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Video video = aweme.getVideo();
            if (video != null && (playAddrH264 = video.getPlayAddrH264()) != null) {
                uri = playAddrH264.getUri();
            } else {
                uri = null;
            }
            sbLIZ.append(uri);
            sbLIZ.append(C10EU.LIZJ(aweme.getAuthor()));
            LJI = C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((String) LJIIL.getValue());
            sbLIZ2.append(LJI);
            sbLIZ2.append(".mp4");
            LJII = C2188811AlT.LIZIZ(sbLIZ2);
            LIZLLL.LIZ(AbstractC19484711Kz.LJJJ(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0lv6
                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                    String str3;
                    List<String> urlList;
                    List<PhotoModeImageUrlModel> imageList;
                    PhotoModeImageUrlModel photoModeImageUrlModel;
                    UrlModel urlModel;
                    List<PhotoModeImageUrlModel> imageList2;
                    PhotoModeImageUrlModel photoModeImageUrlModel2;
                    UrlModel urlModel2;
                    List list;
                    String strLJJLIIIJ;
                    List<String> listSubList;
                    List<PhotoModeImageUrlModel> imageList3;
                    PhotoModeImageUrlModel photoModeImageUrlModel3;
                    LivePhotoStruct livePhotoStruct;
                    Video video2;
                    UrlModel downloadNoWatermarkAddr;
                    List<PhotoModeImageUrlModel> imageList4;
                    PhotoModeImageUrlModel photoModeImageUrlModel4;
                    LivePhotoStruct livePhotoStruct2;
                    Video video3;
                    UrlModel downloadAddr;
                    if (C721220SQu.LJFF(0, aweme)) {
                        str3 = ".mp4";
                        if (((Boolean) C263310ATp.LIZ.getValue()).booleanValue()) {
                            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                            if (photoModeImageInfo == null || (imageList4 = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel4 = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList4)) == null || (livePhotoStruct2 = photoModeImageUrlModel4.livePhotoStruct) == null || (video3 = livePhotoStruct2.videoModel) == null || (downloadAddr = video3.getDownloadAddr()) == null || (urlList = downloadAddr.getUrlList()) == null) {
                                urlList = C13BV.INSTANCE;
                            }
                        } else {
                            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
                            if (photoModeImageInfo2 == null || (imageList3 = photoModeImageInfo2.getImageList()) == null || (photoModeImageUrlModel3 = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList3)) == null || (livePhotoStruct = photoModeImageUrlModel3.livePhotoStruct) == null || (video2 = livePhotoStruct.videoModel) == null || (downloadNoWatermarkAddr = video2.getDownloadNoWatermarkAddr()) == null || (urlList = downloadNoWatermarkAddr.getUrlList()) == null) {
                                urlList = C13BV.INSTANCE;
                            }
                        }
                    } else {
                        str3 = ".png";
                        if (((Boolean) C263310ATp.LIZ.getValue()).booleanValue()) {
                            PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
                            if (photoModeImageInfo3 == null || (imageList2 = photoModeImageInfo3.getImageList()) == null || (photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList2)) == null || (urlModel2 = photoModeImageUrlModel2.userWatermarkImage) == null || (urlList = urlModel2.getUrlList()) == null) {
                                urlList = C13BV.INSTANCE;
                            }
                        } else {
                            PhotoModeImageInfo photoModeImageInfo4 = aweme.getPhotoModeImageInfo();
                            if (photoModeImageInfo4 == null || (imageList = photoModeImageInfo4.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLL(imageList)) == null || (urlModel = photoModeImageUrlModel.displayImageNoWatermark) == null || (urlList = urlModel.getUrlList()) == null) {
                                urlList = C13BV.INSTANCE;
                            }
                        }
                    }
                    C1376300lv2.LIZ.getClass();
                    if (urlList == null) {
                        list = C13BV.INSTANCE;
                    } else {
                        list = urlList;
                    }
                    if (((Boolean) C263310ATp.LIZ.getValue()).booleanValue() || ((Boolean) C277390Au1.LIZ.getValue()).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (!a0.LJJIIZI((String) obj, "vvic", false)) {
                                arrayList.add(obj);
                            }
                        }
                        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                        if (urlList != null) {
                            strLJJLIIIJ = C13LP.LJJLIIIJ(urlList, ",", null, null, 0, null, null, 62);
                        } else {
                            strLJJLIIIJ = null;
                        }
                        c2276411E8h.LIZJ("download_image", 4, "vvic", strLJJLIIIJ);
                        list = arrayList;
                    }
                    if (((Boolean) C277390Au1.LIZ.getValue()).booleanValue()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (!a0.LJJIIZI((String) obj2, "heic", false)) {
                                arrayList2.add(obj2);
                            }
                        }
                        list = arrayList2;
                    }
                    String str4 = (String) C13LP.LJJJLL(list);
                    if (str4 == null) {
                        str4 = (String) C13LP.LJJJLL(urlList);
                    }
                    if (list.size() > 1) {
                        listSubList = list.subList(1, list.size());
                    } else {
                        listSubList = C13BV.INSTANCE;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(C08HM.LIZJ(str4));
                    sbLIZ3.append(str3);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    C1376300lv2.LIZ.getClass();
                    C01GW c01gw = C1376300lv2.LJIILJJIL;
                    C2354709Kn.LJFF((String) c01gw.getValue(), false);
                    AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str4);
                    abstractC2199801B7qWith.LIZJ = strLIZIZ;
                    abstractC2199801B7qWith.LJ = (String) c01gw.getValue();
                    abstractC2199801B7qWith.LJIIIIZZ = listSubList;
                    abstractC2199801B7qWith.LJIIL = new C2499809qu((C11KT) interfaceC2329309At, 1);
                    abstractC2199801B7qWith.LIZJ();
                }
            }), AbstractC19484711Kz.LJII(new C2501009r6(aweme, 0)), new InterfaceC500500Jk0() { // from class: X.0Jk5
                @Override // X.InterfaceC500500Jk0
                public final Object apply(Object obj, Object obj2) {
                    return new Pair(obj, obj2);
                }
            }).LJJIJIIJI(C11S5.LIZ()).LJIIZILJ(new AkS482S0100000_21(aweme, 5)).LJIIZILJ(new AkS482S0100000_21(aweme, 6)).LJIIZILJ(new AkS468S0100000_3(aweme, 1)).LJIL(new InterfaceC1487280oo2() { // from class: X.09Kp
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    String str3 = (String) obj;
                    return new Pair(Boolean.valueOf(C2354709Kn.LIZIZ(str3)), str3);
                }
            }).LJJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new AfS156S0200000_21(function1, aweme, 0)));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        function1.invoke("");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
