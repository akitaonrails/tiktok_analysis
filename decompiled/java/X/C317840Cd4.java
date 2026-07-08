package X;

import android.content.Context;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Cd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317840Cd4 {
    public static final C317840Cd4 LIZ = new C317840Cd4();
    public static final C1321600kUo LIZIZ = new C1321600kUo();

    public static void LIZ(Context context, Aweme aweme, String str, String str2) {
        ArrayList arrayList;
        List<PhotoModeImageUrlModel> imageList;
        Object objLJJJLZIJ;
        List<String> urlList;
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.LJJLJ(2131858117);
        dialogC1389620mGW.LJJLIIJ(false);
        dialogC1389620mGW.LJJLL(false);
        C0FNV.LIZJ(dialogC1389620mGW);
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
            Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
            while (it2.hasNext()) {
                UrlModel urlModel = it2.next().displayImageNoWatermark;
                if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urlList)) == null) {
                    objLJJJLZIJ = "";
                }
                arrayList.add(objLJJJLZIJ);
            }
        } else {
            arrayList = null;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C317820Cd2(dialogC1389620mGW, context, aweme, str, str2, arrayList, null), 3);
    }
}
