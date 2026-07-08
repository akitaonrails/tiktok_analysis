package X;

/* JADX INFO: renamed from: X.0jLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1277330jLP {
    All,
    OnlyVideo,
    OnlyAudio;

    public static final C1277340jLQ Companion = new Object() { // from class: X.0jLQ
    };

    public static EnumC1277330jLP valueOf(String str) {
        return (EnumC1277330jLP) C08FF.LIZ(EnumC1277330jLP.class, str);
    }

    public final EnumC1282300jTQ into() {
        int i = C1277320jLO.LIZ[ordinal()];
        if (i == 1) {
            return EnumC1282300jTQ.VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ALL;
        }
        if (i == 2) {
            return EnumC1282300jTQ.VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ONLY_VIDEO;
        }
        if (i == 3) {
            return EnumC1282300jTQ.VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ONLY_AUDIO;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1277320jLO.LIZ[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw new C1954807lC();
    }
}
