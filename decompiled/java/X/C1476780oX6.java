package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0oX6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476780oX6 implements Serializable {
    public C1476790oX7 LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public String LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public Float LLJJJ;
    public Float LLJJJIL;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimAudioBitrateMeta{urlList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", encodedType='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", mediaType='");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('\'');
        sbLIZ.append(", logoType='");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('\'');
        sbLIZ.append(", definition='");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('\'');
        sbLIZ.append(", quality='");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append('\'');
        sbLIZ.append(", qualityDesc='");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", format='");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append('\'');
        sbLIZ.append(", width=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", Height=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", codecType='");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append('\'');
        sbLIZ.append(", size=");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(", fileId='");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append('\'');
        sbLIZ.append(", fileHash='");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append('\'');
        sbLIZ.append(", subInfo='");
        sbLIZ.append(this.LLJJIII);
        sbLIZ.append('\'');
        sbLIZ.append(", languageCode='");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append('\'');
        sbLIZ.append(", isDubbedAudio=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(", loudness=");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(", peak=");
        sbLIZ.append(this.LLJJJIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long getBitrate() {
        return this.LLJIJIL;
    }

    public String getCodecType() {
        return this.LLJILJIL;
    }

    public String getDefinition() {
        return this.LLILZIL;
    }

    public String getEncodedType() {
        return this.LLILLJJLI;
    }

    public String getFidProfileLabels() {
        return this.LLJJIJI;
    }

    public String getFileHash() {
        return this.LLJJI;
    }

    public String getFileId() {
        return this.LLJJ;
    }

    public String getFormat() {
        return this.LLIZLLLIL;
    }

    public long getFps() {
        return this.LLJILLL;
    }

    public long getHeight() {
        return this.LLJI;
    }

    public boolean getIsDubbedAudio() {
        return this.LLJJIJIL;
    }

    public String getLanguageCode() {
        return this.LLJJIJIIJIL;
    }

    public String getLogoType() {
        return this.LLILZ;
    }

    public Float getLoudness() {
        return this.LLJJJ;
    }

    public String getMediaType() {
        return this.LLILLL;
    }

    public Float getPeak() {
        return this.LLJJJIL;
    }

    public String getQuality() {
        return this.LLILZLL;
    }

    public String getQualityDesc() {
        return this.LLIZ;
    }

    public long getSize() {
        return this.LLJILJILJ;
    }

    public String getSubInfo() {
        return this.LLJJIII;
    }

    public C1476790oX7 getUrlList() {
        return this.LL;
    }

    public long getWidth() {
        return this.LLJ;
    }

    public void setBitrate(long j) {
        this.LLJIJIL = j;
    }

    public void setCodecType(String str) {
        this.LLJILJIL = str;
    }

    public void setDefinition(String str) {
        this.LLILZIL = str;
    }

    public void setEncodedType(String str) {
        this.LLILLJJLI = str;
    }

    public void setFidProfileLabels(String str) {
        this.LLJJIJI = str;
    }

    public void setFileHash(String str) {
        this.LLJJI = str;
    }

    public void setFileId(String str) {
        this.LLJJ = str;
    }

    public void setFormat(String str) {
        this.LLIZLLLIL = str;
    }

    public void setFps(long j) {
        this.LLJILLL = j;
    }

    public void setHeight(long j) {
        this.LLJI = j;
    }

    public void setIsDubbedAudio(boolean z) {
        this.LLJJIJIL = z;
    }

    public void setLanguageCode(String str) {
        this.LLJJIJIIJIL = str;
    }

    public void setLogoType(String str) {
        this.LLILZ = str;
    }

    public void setLoudness(Float f) {
        this.LLJJJ = f;
    }

    public void setMediaType(String str) {
        this.LLILLL = str;
    }

    public void setPeak(Float f) {
        this.LLJJJIL = f;
    }

    public void setQuality(String str) {
        this.LLILZLL = str;
    }

    public void setQualityDesc(String str) {
        this.LLIZ = str;
    }

    public void setSize(long j) {
        this.LLJILJILJ = j;
    }

    public void setSubInfo(String str) {
        this.LLJJIII = str;
    }

    public void setUrlList(C1476790oX7 c1476790oX7) {
        this.LL = c1476790oX7;
    }

    public void setWidth(long j) {
        this.LLJ = j;
    }
}
