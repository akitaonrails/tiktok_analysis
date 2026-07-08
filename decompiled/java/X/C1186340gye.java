package X;

import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;

/* JADX INFO: renamed from: X.0gye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186340gye {
    public static final C1186340gye LIZ = new C1186340gye();

    public static String LIZ(BaseComponentData baseComponentData, PoiDetailSlashFragment poiDetailSlashFragment) {
        String str;
        if (baseComponentData != null) {
            str = baseComponentData.instanceId;
        } else {
            str = null;
        }
        int iHi = poiDetailSlashFragment.hi(str);
        int iLg = poiDetailSlashFragment.Lg();
        if (iHi <= 0 && iLg <= 0) {
            return "first";
        }
        return "act";
    }
}
