package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00BE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BE implements Serializable {
    public int LL;
    public float LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public Map<String, C1910307e1> LLILZIL = new LinkedHashMap();

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectBitrateRecord(index_offset=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cal_bandwidth_usage_factor=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", internet_speed=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selected_bitrate=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", playlist=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final float getCal_bandwidth_usage_factor() {
        return this.LLILLJJLI;
    }

    public final int getIndex_offset() {
        return this.LL;
    }

    public final int getInternet_speed() {
        return this.LLILLL;
    }

    public final Map<String, C1910307e1> getPlaylist() {
        return this.LLILZIL;
    }

    public final int getSelected_bitrate() {
        return this.LLILZ;
    }

    public final void setCal_bandwidth_usage_factor(float f) {
        this.LLILLJJLI = f;
    }

    public final void setIndex_offset(int i) {
        this.LL = i;
    }

    public final void setInternet_speed(int i) {
        this.LLILLL = i;
    }

    public final void setPlaylist(Map<String, C1910307e1> map) {
        this.LLILZIL = map;
    }

    public final void setSelected_bitrate(int i) {
        this.LLILZ = i;
    }

    public C00BE(int i, float f, int i2) {
        this.LL = i;
        this.LLILLJJLI = f;
        this.LLILLL = i2;
    }
}
