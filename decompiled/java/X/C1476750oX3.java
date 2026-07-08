package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;

/* JADX INFO: renamed from: X.0oX3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476750oX3 extends SimUrlModel {
    public String LL;
    public Integer LLILLJJLI;
    public String LLILLL;
    public Float LLILZ;
    public Float LLILZIL;
    public Integer LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public Long LLJIJIL;
    public long LLJILJIL;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimAudio{languageCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", infoId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", bitrate=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loudness=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", peak=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", fileKey=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", format=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getBitRate() {
        return this.LLILLJJLI;
    }

    public final Long getCdnUrlExpired() {
        return this.LLJIJIL;
    }

    public final long getCreateTime() {
        return this.LLJILJIL;
    }

    public final String getFileKey() {
        return this.LLIZ;
    }

    public final String getFormat() {
        return this.LLJ;
    }

    public final Integer getInfoId() {
        return this.LLILZLL;
    }

    public final String getLanguageCode() {
        return this.LLILLL;
    }

    public final Float getLoudness() {
        return this.LLILZ;
    }

    public final Float getPeak() {
        return this.LLILZIL;
    }

    public final String getSubInfo() {
        return this.LLJI;
    }

    public final String getVoiceType() {
        return this.LL;
    }

    public final String getVolumeInfo() {
        return this.LLIZLLLIL;
    }

    public final void setBitRate(Integer num) {
        this.LLILLJJLI = num;
    }

    public final void setCdnUrlExpired(Long l) {
        this.LLJIJIL = l;
    }

    public final void setCreateTime(long j) {
        this.LLJILJIL = j;
    }

    public final void setFileKey(String str) {
        this.LLIZ = str;
    }

    public final void setFormat(String str) {
        this.LLJ = str;
    }

    public final void setInfoId(Integer num) {
        this.LLILZLL = num;
    }

    public final void setLanguageCode(String str) {
        this.LLILLL = str;
    }

    public final void setLoudness(Float f) {
        this.LLILZ = f;
    }

    public final void setPeak(Float f) {
        this.LLILZIL = f;
    }

    public final void setSubInfo(String str) {
        this.LLJI = str;
    }

    public final void setVoiceType(String str) {
        this.LL = str;
    }

    public final void setVolumeInfo(String str) {
        this.LLIZLLLIL = str;
    }
}
