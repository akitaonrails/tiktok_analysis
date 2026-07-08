package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC683800Qry {
    public static final C683790Qrx Companion;
    public static final EnumC683800Qry DATA_BIO_FBV;
    public static final EnumC683800Qry DATA_POST_SYNC_TO_LEMON8;
    public static final EnumC683800Qry DEVICE_CONSENT;
    public static final EnumC683800Qry EMAIL_CONSENT;
    public static final /* synthetic */ EnumC683800Qry[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC683800Qry PIPO_SHARE_CONSENT;
    public static final EnumC683800Qry TTS_EDM_CONSENT;
    public static final EnumC683800Qry TT_DMA_CONSENT;
    public static final EnumC683800Qry TT_DSA_RECOMMENDATION_CONSENT;
    public static final EnumC683800Qry TT_DSA_SEARCH_CONSENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC683800Qry> getEntries() {
        return LLILLL;
    }

    static {
        EnumC683800Qry enumC683800Qry = new EnumC683800Qry("DEVICE_CONSENT", 0, "conditions-policy-device-consent");
        DEVICE_CONSENT = enumC683800Qry;
        EnumC683800Qry enumC683800Qry2 = new EnumC683800Qry("EMAIL_CONSENT", 1, "email_consent");
        EMAIL_CONSENT = enumC683800Qry2;
        EnumC683800Qry enumC683800Qry3 = new EnumC683800Qry("TT_DSA_SEARCH_CONSENT", 2, "permissions-dsa-search");
        TT_DSA_SEARCH_CONSENT = enumC683800Qry3;
        EnumC683800Qry enumC683800Qry4 = new EnumC683800Qry("TT_DSA_RECOMMENDATION_CONSENT", 3, "permissions-dsa-recommendation");
        TT_DSA_RECOMMENDATION_CONSENT = enumC683800Qry4;
        EnumC683800Qry enumC683800Qry5 = new EnumC683800Qry("TT_DMA_CONSENT", 4, "permissions-dma-general");
        TT_DMA_CONSENT = enumC683800Qry5;
        EnumC683800Qry enumC683800Qry6 = new EnumC683800Qry("TTS_EDM_CONSENT", 5, "permissions-email-direct-marketing-tts");
        TTS_EDM_CONSENT = enumC683800Qry6;
        EnumC683800Qry enumC683800Qry7 = new EnumC683800Qry("PIPO_SHARE_CONSENT", 6, "permissions-phone-pipo-sharing");
        PIPO_SHARE_CONSENT = enumC683800Qry7;
        EnumC683800Qry enumC683800Qry8 = new EnumC683800Qry("DATA_POST_SYNC_TO_LEMON8", 7, "data-post-sync-to-lemon8");
        DATA_POST_SYNC_TO_LEMON8 = enumC683800Qry8;
        EnumC683800Qry enumC683800Qry9 = new EnumC683800Qry("DATA_BIO_FBV", 8, "data-bio-fbv");
        DATA_BIO_FBV = enumC683800Qry9;
        EnumC683800Qry[] enumC683800QryArr = {enumC683800Qry, enumC683800Qry2, enumC683800Qry3, enumC683800Qry4, enumC683800Qry5, enumC683800Qry6, enumC683800Qry7, enumC683800Qry8, enumC683800Qry9};
        LLILLJJLI = enumC683800QryArr;
        LLILLL = new C2254308sP(enumC683800QryArr);
        Companion = new C683790Qrx();
    }

    public static EnumC683800Qry[] values() {
        return (EnumC683800Qry[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC683800Qry valueOf(String str) {
        return (EnumC683800Qry) C08FF.LIZ(EnumC683800Qry.class, str);
    }

    public EnumC683800Qry(String str, int i, String str2) {
        this.LL = str2;
    }
}
