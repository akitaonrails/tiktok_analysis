package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566880MLe {
    public static final C566880MLe LIZ = new C566880MLe();

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZ(List list, int i, String str) {
        List<PhotoModeImageUrlModel> imageList;
        Object objLJJJLL;
        PhotoModeImageInfo photoModeImageInfo;
        if (list != null && !list.isEmpty()) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (Object obj : list) {
                Aweme aweme = (Aweme) obj;
                if (aweme.getVideo() != null && aweme.getAuthor() != null && !aweme.isUseAwemeCache()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Aweme aweme2 : arrayList) {
                C201973141b c201973141b = C201973141b.LIZ;
                Boolean bool = Boolean.FALSE;
                c201973141b.getClass();
                ForwardMedia forwardMediaLIZLLL = C201973141b.LIZLLL("", "", "", aweme2, bool);
                Pair<String, String> materialLocalPath = ((ICelebrationCreateService) ServiceManager.get().getService(ICelebrationCreateService.class)).getMaterialLocalPath(forwardMediaLIZLLL, i, str);
                String first = materialLocalPath.getFirst();
                String second = materialLocalPath.getSecond();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(first);
                sbLIZ.append(second);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                forwardMediaLIZLLL.setLocalDir(first);
                forwardMediaLIZLLL.setLocalFile(second);
                forwardMediaLIZLLL.setLocalPath(strLIZIZ);
                PhotoModeImageInfo photoModeImageInfo2 = forwardMediaLIZLLL.photoModeImageInfo;
                if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null && (objLJJJLL = C13LP.LJJJLL(imageList)) != null && (photoModeImageInfo = forwardMediaLIZLLL.photoModeImageInfo) != null) {
                    photoModeImageInfo.setImageList(C1697810uHb.LJIILJJIL(objLJJJLL));
                }
                arrayList2.add(forwardMediaLIZLLL);
            }
            return arrayList2;
        }
        return null;
    }
}
