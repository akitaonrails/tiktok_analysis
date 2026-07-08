package X;

import com.ss.android.ugc.aweme.filter.FilterBean;

/* JADX INFO: renamed from: X.0DxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355910DxN {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(FilterBean filterBean, boolean z, String str) {
        String id;
        if (filterBean == null) {
            return null;
        }
        if (z) {
            id = filterBean.getResId();
        } else {
            id = filterBean.getId();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(id);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
