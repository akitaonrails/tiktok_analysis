package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.06oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1722406oo implements Serializable {
    public final EnumC461080I6g activityType;
    public final long awemeId;
    public final long creatorUserId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1722406oo)) {
            return false;
        }
        C1722406oo c1722406oo = (C1722406oo) obj;
        return this.activityType == c1722406oo.activityType && this.creatorUserId == c1722406oo.creatorUserId && this.awemeId == c1722406oo.awemeId;
    }

    public int hashCode() {
        return (((this.activityType.hashCode() * 31) + C786410Ut5.Y2(this.creatorUserId)) * 31) + C786410Ut5.Y2(this.awemeId);
    }

    public C1722406oo(EnumC461080I6g enumC461080I6g, long j, long j2) {
        this.activityType = enumC461080I6g;
        this.creatorUserId = j;
        this.awemeId = j2;
    }
}
