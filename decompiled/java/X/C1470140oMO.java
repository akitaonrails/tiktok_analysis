package X;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0oMO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470140oMO implements Serializable {
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    public boolean isValid() {
        return (TextUtils.isEmpty(this.LLILLL) || TextUtils.isEmpty(this.LL)) ? false : true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BarrageMaskInfo{fileId='");
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(", fileHash='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", barrageMaskUrl='");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('\'');
        sbLIZ.append(", version='");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('\'');
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", headLen=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getBarrageMaskUrl() {
        return this.LLILLL;
    }

    public int getBitrate() {
        return this.LLIZ;
    }

    public String getFileHash() {
        return this.LLILLJJLI;
    }

    public String getFileId() {
        return this.LL;
    }

    public int getFileSize() {
        return this.LLILZIL;
    }

    public int getHeadLen() {
        return this.LLILZLL;
    }

    public String getVersion() {
        return this.LLILZ;
    }

    public void setBarrageMaskUrl(String str) {
        this.LLILLL = str;
    }

    public void setBitrate(int i) {
        this.LLIZ = i;
    }

    public void setFileHash(String str) {
        this.LLILLJJLI = str;
    }

    public void setFileId(String str) {
        this.LL = str;
    }

    public void setFileSize(int i) {
        this.LLILZIL = i;
    }

    public void setHeadLen(int i) {
        this.LLILZLL = i;
    }

    public void setVersion(String str) {
        this.LLILZ = str;
    }

    public C1470140oMO(String str, String str2, int i) {
        this.LL = str;
        this.LLILLL = str2;
        this.LLILZLL = i;
    }
}
