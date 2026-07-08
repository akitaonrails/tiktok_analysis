package X;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: X.0HBA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HBA implements Serializable {
    public static final int $stable = 8;
    public final Map<String, String> extraParams;
    public final int groupPosition;
    public final String imprId;
    public String searchPosition;
    public final String searchType;

    public int hashCode() {
        return (((((((this.groupPosition * 31) + this.searchType.hashCode()) * 31) + this.searchPosition.hashCode()) * 31) + this.imprId.hashCode()) * 31) + this.extraParams.hashCode();
    }

    public C0HBA() {
        this(-1, "", "", "", C2097608Jq.LJ());
    }

    public final void setSearchPosition(String str) {
        this.searchPosition = str;
    }

    public C0HBA(int i, String str, String str2, String str3, Map<String, String> map) {
        this.groupPosition = i;
        this.searchType = str;
        this.searchPosition = str2;
        this.imprId = str3;
        this.extraParams = map;
    }
}
