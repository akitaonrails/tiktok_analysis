package X;

import com.ss.android.ugc.aweme.app.api.Api;

/* JADX INFO: renamed from: X.0Svq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737160Svq {
    public static final String LIZ;
    public static final String LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = Api.LIZ;
        sbLIZ.append(str);
        sbLIZ.append("/tiktok/user/top_item/create/v1/");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("/tiktok/user/top_item/delete/v1/");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
    }
}
