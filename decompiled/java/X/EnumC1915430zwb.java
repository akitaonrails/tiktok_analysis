package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1915430zwb {
    public static final C1915440zwc Companion;
    public static final EnumC1915430zwb DATA_POST_SYNC_TO_LEMON8;
    public static final EnumC1915430zwb DSA_CONSENT_BOX;
    public static final EnumC1915430zwb DSA_CONSENT_BOX_UNIVERSAL_POPUP;
    public static final /* synthetic */ EnumC1915430zwb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1915430zwb PIPO_SHARE_CONSENT;
    public static final EnumC1915430zwb TTS_EDM_CONSENT_BOX;
    public static final EnumC1915430zwb TT_DMA_CONSENT_BOX;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1915430zwb> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0zwc] */
    static {
        EnumC1915430zwb enumC1915430zwb = new EnumC1915430zwb("DSA_CONSENT_BOX", 0, "dsa_consent_box");
        DSA_CONSENT_BOX = enumC1915430zwb;
        EnumC1915430zwb enumC1915430zwb2 = new EnumC1915430zwb("DSA_CONSENT_BOX_UNIVERSAL_POPUP", 1, "dsa_consent_box_universal_popup");
        DSA_CONSENT_BOX_UNIVERSAL_POPUP = enumC1915430zwb2;
        EnumC1915430zwb enumC1915430zwb3 = new EnumC1915430zwb("TT_DMA_CONSENT_BOX", 2, "tt_dma_consent_box");
        TT_DMA_CONSENT_BOX = enumC1915430zwb3;
        EnumC1915430zwb enumC1915430zwb4 = new EnumC1915430zwb("TTS_EDM_CONSENT_BOX", 3, "tts_edm_consent_box");
        TTS_EDM_CONSENT_BOX = enumC1915430zwb4;
        EnumC1915430zwb enumC1915430zwb5 = new EnumC1915430zwb("PIPO_SHARE_CONSENT", 4, "tts_pipo_consent");
        PIPO_SHARE_CONSENT = enumC1915430zwb5;
        EnumC1915430zwb enumC1915430zwb6 = new EnumC1915430zwb("DATA_POST_SYNC_TO_LEMON8", 5, "data-post-sync-to-lemon8");
        DATA_POST_SYNC_TO_LEMON8 = enumC1915430zwb6;
        EnumC1915430zwb[] enumC1915430zwbArr = {enumC1915430zwb, enumC1915430zwb2, enumC1915430zwb3, enumC1915430zwb4, enumC1915430zwb5, enumC1915430zwb6};
        LLILLJJLI = enumC1915430zwbArr;
        LLILLL = new C2254308sP(enumC1915430zwbArr);
        Companion = new Object() { // from class: X.0zwc
        };
    }

    public static EnumC1915430zwb[] values() {
        return (EnumC1915430zwb[]) LLILLJJLI.clone();
    }

    public final String getS() {
        return this.LL;
    }

    public static EnumC1915430zwb valueOf(String str) {
        return (EnumC1915430zwb) C08FF.LIZ(EnumC1915430zwb.class, str);
    }

    public EnumC1915430zwb(String str, int i, String str2) {
        this.LL = str2;
    }
}
