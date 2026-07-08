package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0s47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612570s47 implements Serializable {
    public final String entranceLogExtra;
    public final String isFromForcedInsertion;
    public final String seriesCardType;
    public final String sourceAuthorId;
    public final String sourceFeedType;
    public final String sourceGroupId;
    public final String sourceSeriesCardId;
    public final String sourceVideoId;
    public final String sourceVideoType;

    public final String isFromForcedInsertion() {
        return this.isFromForcedInsertion;
    }

    public C1612570s47(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.sourceVideoId = str;
        this.sourceGroupId = str2;
        this.sourceAuthorId = str3;
        this.sourceVideoType = str4;
        this.entranceLogExtra = str5;
        this.seriesCardType = str6;
        this.sourceSeriesCardId = str7;
        this.sourceFeedType = str8;
        this.isFromForcedInsertion = str9;
    }
}
