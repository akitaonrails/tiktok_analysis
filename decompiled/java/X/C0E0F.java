package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0E0F, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0F {
    public static final String LIZ(ResourceItem resourceItem) {
        boolean z;
        ArrayList<String> arrayList = resourceItem.magicResourceTypeList;
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        if (arrayList.size() == 1 && arrayList.contains("photo")) {
            return "only_photo";
        }
        if (arrayList.size() == 1 && arrayList.contains("video")) {
            return "only_video";
        }
        if (arrayList.size() <= 1 || !arrayList.contains("photo") || !arrayList.contains("video")) {
            return "";
        }
        return "video_and_photo";
    }

    public static final String LIZJ(NLEResType nLEResType) {
        int i = C348710Dll.LIZ[nLEResType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "null";
            }
            return "video";
        }
        return "photo";
    }

    public static final boolean LIZIZ(ResourceItem resourceItem, NLEResType nLEResType) {
        String strLIZJ = LIZJ(nLEResType);
        ArrayList<String> arrayList = resourceItem.magicResourceTypeList;
        if (arrayList != null) {
            return arrayList.contains(strLIZJ);
        }
        return false;
    }
}
