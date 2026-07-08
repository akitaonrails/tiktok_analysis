package X;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: X.0Wnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833990Wnd {
    public static final Feature LIZ;
    public static final Feature LIZIZ;
    public static final Feature LIZJ;
    public static final Feature LIZLLL;
    public static final Feature[] LJ;

    static {
        Feature feature = new Feature("auth_blockstore", 3L);
        Feature feature2 = new Feature("blockstore_data_transfer", 1L);
        Feature feature3 = new Feature("blockstore_notify_app_restore", 1L);
        Feature feature4 = new Feature("blockstore_store_bytes_with_options", 2L);
        LIZ = feature4;
        Feature feature5 = new Feature("blockstore_is_end_to_end_encryption_available", 1L);
        LIZIZ = feature5;
        Feature feature6 = new Feature("blockstore_enable_cloud_backup", 1L);
        LIZJ = feature6;
        Feature feature7 = new Feature("blockstore_delete_bytes", 2L);
        Feature feature8 = new Feature("blockstore_retrieve_bytes_with_options", 3L);
        LIZLLL = feature8;
        LJ = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
