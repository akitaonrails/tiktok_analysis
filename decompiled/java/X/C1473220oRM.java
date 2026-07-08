package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0oRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473220oRM implements Serializable {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VolumeInfo{loudnessRange=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loudnessRangeStart=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loudnessRangeEnd=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", maximumMomentaryLoudness=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", maximumShortTermLoudness=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", volumeInfoJson=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", volumeChangeInfoJson=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", disableInPhotoMode=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public float getLoudnessRange() {
        return this.LL;
    }

    public float getLoudnessRangeEnd() {
        return this.LLILLL;
    }

    public float getLoudnessRangeStart() {
        return this.LLILLJJLI;
    }

    public float getMaximumMomentaryLoudness() {
        return this.LLILZ;
    }

    public float getMaximumShortTermLoudness() {
        return this.LLILZIL;
    }

    public int getVersion() {
        return this.LLJ;
    }

    public String getVolumeChangeInfoJson() {
        return this.LLIZ;
    }

    public String getVolumeInfoJson() {
        return this.LLILZLL;
    }

    public boolean isDisableInPhotoMode() {
        return this.LLIZLLLIL;
    }

    public void setDisableInPhotoMode(boolean z) {
        this.LLIZLLLIL = z;
    }

    public void setLoudnessRange(float f) {
        this.LL = f;
    }

    public void setLoudnessRangeEnd(float f) {
        this.LLILLL = f;
    }

    public void setLoudnessRangeStart(float f) {
        this.LLILLJJLI = f;
    }

    public void setMaximumMomentaryLoudness(float f) {
        this.LLILZ = f;
    }

    public void setMaximumShortTermLoudness(float f) {
        this.LLILZIL = f;
    }

    public void setVersion(int i) {
        this.LLJ = i;
    }

    public void setVolumeChangeInfoJson(String str) {
        this.LLIZ = str;
    }

    public void setVolumeInfoJson(String str) {
        this.LLILZLL = str;
    }
}
