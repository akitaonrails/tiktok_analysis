package X;

import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hWX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207350hWX {
    public static final PopupSceneV2 LIZ(String str, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PopupSceneV2 popupSceneV2 = (PopupSceneV2) it2.next();
            if (Intrinsics.LJFF(popupSceneV2.scene, str)) {
                return popupSceneV2;
            }
        }
        return null;
    }
}
