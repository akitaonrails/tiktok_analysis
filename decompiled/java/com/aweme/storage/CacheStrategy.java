package com.aweme.storage;

import X.C09CT;
import X.C2188811AlT;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class CacheStrategy {

    @C09CT("dir_limit")
    public int dirLimit;

    @C09CT("file_limit")
    public int fileLimit;

    @C09CT("force")
    public String[] forceList;

    @C09CT("interval")
    public int interval;

    @C09CT("non_active_count")
    public int nonActiveCount;

    @C09CT("non_active_duration")
    public int nonActiveDuration;

    @C09CT("non_active_limit")
    public int nonActiveLimit;

    @C09CT("non_active_times")
    public int nonActiveTimes;

    @C09CT("too_large_limit")
    public int tooLargeLimit;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheStrategy{interval=");
        sbLIZ.append(this.interval);
        sbLIZ.append(", forceList=");
        sbLIZ.append(Arrays.toString(this.forceList));
        sbLIZ.append(", fileLimit=");
        sbLIZ.append(this.fileLimit);
        sbLIZ.append(", dirLimit=");
        sbLIZ.append(this.dirLimit);
        sbLIZ.append(", nonActiveDuration=");
        sbLIZ.append(this.nonActiveDuration);
        sbLIZ.append(", nonActiveLimit=");
        sbLIZ.append(this.nonActiveLimit);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CacheStrategy(int i, String[] strArr, int i2, int i3, int i4, int i5, int i6) {
        this.interval = i;
        this.forceList = strArr;
        this.fileLimit = i2;
        this.dirLimit = i3;
        this.nonActiveDuration = i4;
        this.tooLargeLimit = i5;
        this.nonActiveLimit = i6;
    }
}
