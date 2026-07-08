package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0KiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525090KiZ {
    public final ChoosePhotoPreviewPageConfig LIZ;
    public final ChooseMediaViewModel LIZIZ;

    public final boolean LIZJ() {
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LIZ;
        return choosePhotoPreviewPageConfig.isFromAutoCutAgent || choosePhotoPreviewPageConfig.isFromAutoPickAddMedia;
    }

    public static String LIZ(List list) {
        String str;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((MediaModel) it2.next()).id);
        }
        if (arrayList.size() > 8) {
            str = ",...";
        } else {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count=");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(", ids=[");
        sbLIZ.append(C13LP.LJJLIIIJ(C13LP.LL(arrayList, 8), null, null, null, 0, null, null, 63));
        sbLIZ.append(str);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(List list) {
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(list, 5), null, null, null, 0, null, AFwS239S0000000_8.get$arr$(333), 31);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count=");
        sbLIZ.append(list.size());
        sbLIZ.append(", sample=[");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C525090KiZ(ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig, ChooseMediaViewModel chooseMediaViewModel) {
        this.LIZ = choosePhotoPreviewPageConfig;
        this.LIZIZ = chooseMediaViewModel;
    }

    public static void LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewRootScene.");
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(str2);
        C201955140j.LIZIZ("AIDebug", C2188811AlT.LIZIZ(sbLIZ));
    }
}
