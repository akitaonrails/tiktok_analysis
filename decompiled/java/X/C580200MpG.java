package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0MpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580200MpG {
    public static final String LIZ = C580200MpG.class.getSimpleName();

    public static String LIZ(ShortVideoContext shortVideoContext) {
        List<EmbaddedWindowInfo> list;
        String path = shortVideoContext.cameraComponentModel.mWorkspace.LIZIZ().getPath();
        Integer numValueOf = Integer.valueOf((int) shortVideoContext.cameraComponentModel.mTotalRecordingTime);
        Integer numValueOf2 = Integer.valueOf(shortVideoContext.cameraComponentModel.mVideoWidth);
        Integer numValueOf3 = Integer.valueOf(shortVideoContext.cameraComponentModel.mVideoHeight);
        if (shortVideoContext.LJJLL()) {
            list = shortVideoContext.cameraComponentModel.duetContext.windowInfoList;
        } else {
            list = null;
        }
        return LIZIZ(path, numValueOf, numValueOf2, numValueOf3, list);
    }

    public static String LIZIZ(String str, Integer num, Integer num2, Integer num3, List list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(str);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add(num);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(num2);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add(num3);
        if (list != null) {
            arrayList = new ArrayList();
            arrayList.add(list);
        } else {
            arrayList = null;
        }
        return LIZJ(true, false, arrayList2, arrayList3, arrayList4, arrayList5, null, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5 A[Catch: Exception -> 0x0182, TRY_ENTER, TryCatch #2 {Exception -> 0x0182, blocks: (B:35:0x0089, B:39:0x00a5, B:41:0x00ae, B:44:0x00c2, B:53:0x0101, B:54:0x0104, B:58:0x013c, B:61:0x0144, B:67:0x0162, B:69:0x0168, B:70:0x017e, B:66:0x015b, B:52:0x00f6, B:51:0x00f2, B:40:0x00a9), top: B:80:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[Catch: Exception -> 0x0182, TryCatch #2 {Exception -> 0x0182, blocks: (B:35:0x0089, B:39:0x00a5, B:41:0x00ae, B:44:0x00c2, B:53:0x0101, B:54:0x0104, B:58:0x013c, B:61:0x0144, B:67:0x0162, B:69:0x0168, B:70:0x017e, B:66:0x015b, B:52:0x00f6, B:51:0x00f2, B:40:0x00a9), top: B:80:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2 A[Catch: Exception -> 0x0182, TRY_ENTER, TryCatch #2 {Exception -> 0x0182, blocks: (B:35:0x0089, B:39:0x00a5, B:41:0x00ae, B:44:0x00c2, B:53:0x0101, B:54:0x0104, B:58:0x013c, B:61:0x0144, B:67:0x0162, B:69:0x0168, B:70:0x017e, B:66:0x015b, B:52:0x00f6, B:51:0x00f2, B:40:0x00a9), top: B:80:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b A[Catch: Exception -> 0x0182, TryCatch #2 {Exception -> 0x0182, blocks: (B:35:0x0089, B:39:0x00a5, B:41:0x00ae, B:44:0x00c2, B:53:0x0101, B:54:0x0104, B:58:0x013c, B:61:0x0144, B:67:0x0162, B:69:0x0168, B:70:0x017e, B:66:0x015b, B:52:0x00f6, B:51:0x00f2, B:40:0x00a9), top: B:80:0x0089 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(boolean r12, boolean r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, java.util.List r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580200MpG.LIZJ(boolean, boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):java.lang.String");
    }
}
