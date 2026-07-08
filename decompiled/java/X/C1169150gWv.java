package X;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169150gWv implements Serializable {
    public final transient Bundle bundle;
    public int flowStartPositionInGeneralSearch;
    public Integer isFromVideo;
    public String searchId;
    public final String searchResultId;
    public String searchType;

    public C1169150gWv() {
        this("", -1, "", 0, "", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1169150gWv)) {
            return false;
        }
        C1169150gWv c1169150gWv = (C1169150gWv) obj;
        return Intrinsics.LJFF(this.searchId, c1169150gWv.searchId) && Intrinsics.LJFF(this.isFromVideo, c1169150gWv.isFromVideo) && Intrinsics.LJFF(this.searchType, c1169150gWv.searchType) && this.flowStartPositionInGeneralSearch == c1169150gWv.flowStartPositionInGeneralSearch && Intrinsics.LJFF(this.searchResultId, c1169150gWv.searchResultId) && Intrinsics.LJFF(this.bundle, c1169150gWv.bundle);
    }

    public final Integer isFromVideo() {
        return this.isFromVideo;
    }

    public final void setFlowStartPositionInGeneralSearch(int i) {
        this.flowStartPositionInGeneralSearch = i;
    }

    public final void setFromVideo(Integer num) {
        this.isFromVideo = num;
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }

    public final void setSearchType(String str) {
        this.searchType = str;
    }

    public C1169150gWv(String str, Integer num, String str2, int i, String str3, Bundle bundle) {
        this.searchId = str;
        this.isFromVideo = num;
        this.searchType = str2;
        this.flowStartPositionInGeneralSearch = i;
        this.searchResultId = str3;
        this.bundle = bundle;
    }
}
