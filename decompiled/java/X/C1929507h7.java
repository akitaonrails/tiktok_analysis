package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.07h7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1929507h7 extends AbstractC1929607h8 {
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    @Override // X.AbstractC1929607h8
    public final boolean LIZ() {
        if (Boolean.parseBoolean(this.LIZ.LJIILLIIL(this.LJFF))) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long rawOffset = TimeZone.getDefault().getRawOffset();
        long j = jCurrentTimeMillis - ((jCurrentTimeMillis + rawOffset) % 86400000);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LIZ.LJIILLIIL(this.LJI));
        if (lLJIILIIL != null && lLJIILIIL.longValue() - ((lLJIILIIL.longValue() + rawOffset) % 86400000) == j) {
            return false;
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(this.LIZ.LJIILLIIL(this.LJ));
        return (numLJIIJJI != null ? numLJIIJJI.intValue() : 0) < this.LIZJ;
    }

    @Override // X.AbstractC1929607h8
    public final void LIZLLL() {
        this.LIZ.LJJJJ(this.LJ, CardStruct.IStatusCode.DEFAULT);
        this.LIZ.LJJJJ(this.LJFF, "false");
        this.LIZ.LJJJJ(this.LJI, "");
    }

    @Override // X.AbstractC1929607h8
    public final boolean LJ() {
        if (Boolean.parseBoolean(this.LIZ.LJIILLIIL(this.LJFF))) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long rawOffset = TimeZone.getDefault().getRawOffset();
        long j = jCurrentTimeMillis - ((jCurrentTimeMillis + rawOffset) % 86400000);
        Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LIZ.LJIILLIIL(this.LJI));
        if (lLJIILIIL != null && lLJIILIIL.longValue() - ((lLJIILIIL.longValue() + rawOffset) % 86400000) == j) {
            return false;
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(this.LIZ.LJIILLIIL(this.LJ));
        int iIntValue = numLJIIJJI != null ? numLJIIJJI.intValue() : 0;
        if (iIntValue >= this.LIZJ) {
            return false;
        }
        this.LIZ.LJJJJ(this.LJ, String.valueOf(iIntValue + 1));
        this.LIZ.LJJJJ(this.LJI, String.valueOf(jCurrentTimeMillis));
        return true;
    }

    @Override // X.AbstractC1929607h8
    public final String LIZJ() {
        return this.LIZLLL;
    }

    public C1929507h7(InterfaceC1444620nhE interfaceC1444620nhE, String str, int i) {
        super(interfaceC1444620nhE, str);
        this.LIZJ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("one_shot_toast_version_");
        sbLIZ.append("record_low_light_detected_hint");
        sbLIZ.append('_');
        sbLIZ.append(str);
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("one_shot_toast_display_count_");
        sbLIZ2.append("record_low_light_detected_hint");
        this.LJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("one_shot_toast_completed_");
        sbLIZ3.append("record_low_light_detected_hint");
        this.LJFF = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("one_shot_toast_last_show_time_");
        sbLIZ4.append("record_low_light_detected_hint");
        this.LJI = C2188811AlT.LIZIZ(sbLIZ4);
        LIZIZ();
    }
}
