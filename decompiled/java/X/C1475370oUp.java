package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;

/* JADX INFO: renamed from: X.0oUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475370oUp extends SimUrlModel {
    public int LL;
    public String[] LLILLJJLI;
    public long LLILLL;
    public String LLILZ;

    public String getLanguageCode() {
        return this.LLILZ;
    }

    public long getPreloadSize() {
        return this.LLILLL;
    }

    public int getSubtitleId() {
        return this.LL;
    }

    public String[] getUrls() {
        return this.LLILLJJLI;
    }

    public void setLanguageCode(String str) {
        this.LLILZ = str;
    }

    public void setPreloadSize(long j) {
        this.LLILLL = j;
    }

    public void setSubtitleId(int i) {
        this.LL = i;
    }

    public void setUrls(String[] strArr) {
        this.LLILLJJLI = strArr;
    }

    public C1475370oUp(int i, String[] strArr, long j, String str) {
        this.LL = i;
        this.LLILLJJLI = strArr;
        this.LLILLL = j;
        this.LLILZ = str;
    }
}
