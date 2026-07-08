package X;

import java.util.List;
import webcast.api.sub.SMBOptInQualificationInfo;

/* JADX INFO: renamed from: X.0xTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820590xTd {
    public final int LIZ;
    public final List<SMBOptInQualificationInfo> LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public C1820590xTd(int i, List<SMBOptInQualificationInfo> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
