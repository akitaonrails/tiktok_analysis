package X;

/* JADX INFO: renamed from: X.0xzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840320xzS {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryWidgetBean(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", storyId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timeAgoInMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1840320xzS(String str, String str2, String str3, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = j;
    }
}
