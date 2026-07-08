package X;

/* JADX INFO: renamed from: X.0hM6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200880hM6 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AbstractC1200800hLy LIZ(String str) {
        switch (str.hashCode()) {
            case -1323941903:
                if (str.equals("upload_image_page")) {
                    return new C1200820hM0(0);
                }
                break;
            case -848063302:
                if (str.equals("poi_basic_info_page")) {
                    return new C1200840hM2(0);
                }
                break;
            case 338742576:
                if (str.equals("category_page")) {
                    return new C1200850hM3(0);
                }
                break;
            case 527431131:
                if (str.equals("poi_list_page")) {
                    return new C1200830hM1(0);
                }
                break;
            case 921798445:
                if (str.equals("store_page")) {
                    return new C1200870hM5(0);
                }
                break;
        }
        return new C1200860hM4(0);
    }
}
