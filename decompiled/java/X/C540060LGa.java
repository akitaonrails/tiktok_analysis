package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540060LGa {
    public static final C540060LGa LIZ = new C540060LGa();

    public static String LJ() {
        C0LGY c0lgy = C0LGY.LIZ;
        C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
        c0lgy.getClass();
        return C0LGY.LIZIZ(c0l91) ? C0LGY.LJI() ? "select_photos" : "access_to_all_photo" : "not_allowed";
    }

    public static final String LIZJ(Context context) {
        if (C0BRZ.LIZ()) {
            if (C298250BmZ.LIZ()) {
                return context.getResources().getString(2131829756);
            }
            return context.getResources().getString(2131829755);
        }
        return context.getResources().getString(2131826395);
    }

    public static C0L91 LJI(int i) {
        boolean z;
        boolean z2 = true;
        if ((i & 1) == 0 && (i & 2) == 0) {
            z = false;
        } else {
            z = true;
        }
        if ((i & 4) == 0) {
            z2 = false;
        }
        if (z) {
            if (z2) {
                return C0L91.IMAGE_AND_VIDEO;
            }
            return C0L91.IMAGE;
        }
        return C0L91.VIDEO;
    }

    public static void LIZ(List list, Function0 function0) {
        C540070LGb c540070LGbLJIIIIZZ;
        boolean z;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaModel mediaModel = (MediaModel) it2.next();
            if (mediaModel.LJIIJ()) {
                c540070LGbLJIIIIZZ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILLIIL(mediaModel.LJFF());
            } else {
                if (mediaModel.LJIILJJIL()) {
                    c540070LGbLJIIIIZZ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIIIZZ(mediaModel.LJFF());
                }
                z = false;
                ((IPoiVideoPublishService) ServiceManager.get().getService(IPoiService.class)).trackReadMetaDataSuccessRate(z);
            }
            if (c540070LGbLJIIIIZZ != null) {
                mediaModel.encryptLatitude = c540070LGbLJIIIIZZ.LIZ;
                mediaModel.encryptLongitude = c540070LGbLJIIIIZZ.LIZIZ;
                mediaModel.createTimestamp = c540070LGbLJIIIIZZ.LIZJ;
                z = true;
            } else {
                z = false;
            }
            ((IPoiVideoPublishService) ServiceManager.get().getService(IPoiService.class)).trackReadMetaDataSuccessRate(z);
        }
        function0.invoke();
    }

    public static String LIZLLL(int i, Function0 function0) {
        if (i != 2) {
            if (i != 14) {
                if (i != 24 && i != 36 && i != 40) {
                    if (((Boolean) function0.invoke()).booleanValue()) {
                        return "fyp";
                    }
                    return "shoot_page";
                }
                return "template_page";
            }
            return "edit_page";
        }
        return "template_page";
    }

    public static String LJFF(ShortVideoContext shortVideoContext, String str) {
        String str2;
        if (shortVideoContext != null && (str2 = shortVideoContext.shootWay) != null) {
            return str2;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void LIZIZ(List list, WeakReference weakReference, Function0 function0) {
        if (Build.VERSION.SDK_INT < 29) {
            LIZ(list, function0);
            return;
        }
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        c19741112Lp.getClass();
        if (C19741112Lp.LIZLLL(contextLIZ, "android.permission.ACCESS_MEDIA_LOCATION")) {
            LIZ(list, function0);
            return;
        }
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-poi_read_media_metadata_location")).LIZIZ("android.permission.ACCESS_MEDIA_LOCATION").LIZJ(new C581130Mql(function0, list, 3));
        } else {
            function0.invoke();
        }
    }
}
