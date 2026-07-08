package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Q1P, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q1P {
    public static final List<C03IT> LIZ(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        List<String> urlList;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        ArrayList arrayList = null;
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(imageList, 10));
            Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
            while (it2.hasNext()) {
                UrlModel urlModel = it2.next().displayImageNoWatermark;
                if (urlModel != null) {
                    urlList = urlModel.getUrlList();
                } else {
                    urlList = null;
                }
                arrayList2.add(urlList);
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C03IT((List) it3.next()));
            }
        }
        return arrayList;
    }

    public static final boolean LIZIZ(EnumC658790Psj enumC658790Psj) {
        if (enumC658790Psj != EnumC658790Psj.MIXED_CREATIVE_SUB_CARD && enumC658790Psj != EnumC658790Psj.MIXED_CREATIVE_SUB_SINGLE_CARD) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(EnumC658790Psj enumC658790Psj) {
        if (enumC658790Psj == EnumC658790Psj.OLE_PAC_SUB_CARD) {
            return true;
        }
        return false;
    }
}
