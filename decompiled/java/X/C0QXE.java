package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QXE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXE implements Serializable {
    public final C650950Pg5 contextSource;
    public final String ecSearchSessionId;
    public final Long endToEndSessionId;
    public final String mallExtraInfo;
    public final String routeUri;
    public final SearchResultParam searchResultParam;
    public final String trafficSourceList;

    public C0QXE() {
        this(null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QXE)) {
            return false;
        }
        C0QXE c0qxe = (C0QXE) obj;
        return Intrinsics.LJFF(this.searchResultParam, c0qxe.searchResultParam) && Intrinsics.LJFF(this.ecSearchSessionId, c0qxe.ecSearchSessionId) && Intrinsics.LJFF(this.trafficSourceList, c0qxe.trafficSourceList) && Intrinsics.LJFF(this.contextSource, c0qxe.contextSource) && Intrinsics.LJFF(this.endToEndSessionId, c0qxe.endToEndSessionId) && Intrinsics.LJFF(this.routeUri, c0qxe.routeUri) && Intrinsics.LJFF(this.mallExtraInfo, c0qxe.mallExtraInfo);
    }

    public C0QXE(SearchResultParam searchResultParam, String str, String str2, C650950Pg5 c650950Pg5, Long l, String str3, String str4) {
        this.searchResultParam = searchResultParam;
        this.ecSearchSessionId = str;
        this.trafficSourceList = str2;
        this.contextSource = c650950Pg5;
        this.endToEndSessionId = l;
        this.routeUri = str3;
        this.mallExtraInfo = str4;
    }
}
