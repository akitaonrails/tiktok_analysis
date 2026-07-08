package X;

import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: X.0Wni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834040Wni {
    public static final Feature LIZ;
    public static final Feature LIZIZ;
    public static final Feature LIZJ;
    public static final Feature LIZLLL;
    public static final Feature LJ;
    public static final Feature[] LJFF;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 8L);
        LIZ = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        LIZIZ = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        LIZJ = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6L);
        LIZLLL = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 3L);
        Feature feature8 = new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L);
        LJ = feature8;
        LJFF = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
