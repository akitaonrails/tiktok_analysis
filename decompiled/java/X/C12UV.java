package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12UV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UV {
    public final HashMap<String, Float> LIZ = new HashMap<>();
    public final HashMap<String, Float> LIZIZ = new HashMap<>();
    public long LIZJ;
    public long LIZLLL;
    public float LJ;
    public long LJFF;
    public float LJI;
    public long LJII;
    public long LJIIIIZZ;
    public final float LJIIIZ;
    public boolean LJIIJ;

    public C12UV(List<VideoSegment> list, float f) {
        this.LJIIIZ = f;
        for (VideoSegment videoSegment : list) {
            this.LIZ.put(videoSegment.LJFF(true), Float.valueOf(videoSegment.LJI()));
        }
    }

    public final void LIZIZ(List<VideoSegment> list, float f) {
        long j;
        int size;
        if (C2401009ay.LIZ(list)) {
            C2219091BtD.LIZLLL().w("videoSegmentList is empty");
            j = 0;
        } else {
            float fLIZLLL = 0.0f;
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.isDeleted) {
                    fLIZLLL += (videoSegment.LIZLLL() - videoSegment.LJII()) / (videoSegment.LJI() * f);
                }
            }
            j = (long) fLIZLLL;
        }
        this.LIZJ = j;
        this.LJFF = C12UY.LIZJ(j);
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("videoMultiDur: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" maxCutDuration is ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" videoSize is ");
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        sbLIZ.append(size);
        interfaceC1463990oCTLIZLLL.w(C2188811AlT.LIZIZ(sbLIZ));
        long j2 = this.LJII;
        if (j2 > 0) {
            if (this.LJIIJ) {
                this.LJFF = j2;
            } else {
                this.LJFF = Math.min(this.LIZJ, j2);
            }
        }
        float f2 = this.LJFF / this.LJIIIZ;
        this.LJ = f2;
        this.LJI = (C12VA.LIZ().LJI * 1.0f) / f2;
        long j3 = this.LJIIIIZZ;
        if (j3 > 0) {
            this.LJI = j3 / this.LJ;
        }
        for (Map.Entry<String, Float> entry : this.LIZ.entrySet()) {
            this.LIZIZ.put(entry.getKey(), Float.valueOf(this.LJ * entry.getValue().floatValue() * f));
        }
    }

    public static long LIZ(List list, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!((VideoSegment) ListProtector.get(list, i2)).isDeleted) {
                arrayList.add(ListProtector.get(list, i2));
            }
        }
        long jLJII = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            long jLIZLLL = (long) ((r9.LIZLLL() - r9.LJII()) / (((VideoSegment) ListProtector.get(arrayList, i3)).LJI() * f2));
            float f3 = jLIZLLL;
            if (f <= f3) {
                i = i3;
                break;
            }
            jLJII += jLIZLLL;
            f -= f3;
            i3++;
        }
        if (i3 == arrayList.size()) {
            return jLJII;
        }
        if (i != 0 || ((VideoSegment) ListProtector.get(arrayList, i)).LJI() == 0.0f) {
            jLJII += ((VideoSegment) ListProtector.get(arrayList, i)).LJII();
        }
        return (long) (jLJII + f);
    }

    public final void LIZJ(int i, long j, float f, String str) {
        long j2 = (long) (j / f);
        this.LIZLLL = j2;
        this.LJFF = C12UY.LIZJ(j2);
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("path: ");
        sbLIZ.append(str);
        sbLIZ.append(" maxCutDuration is ");
        sbLIZ.append(this.LJFF);
        interfaceC1463990oCTLIZLLL.w(C2188811AlT.LIZIZ(sbLIZ));
        long j3 = this.LJII;
        if (j3 > 0) {
            if (this.LJIIJ) {
                this.LJFF = j3;
            } else {
                this.LJFF = Math.min(this.LIZLLL, j3);
            }
        }
        float f2 = this.LJFF / this.LJIIIZ;
        this.LJ = f2;
        if (i == 0) {
            this.LJI = (C12VA.LIZ().LJI * 1.0f) / f2;
        } else {
            this.LJI = 500.0f / f2;
        }
        long j4 = this.LJIIIIZZ;
        if (j4 > 0) {
            this.LJI = j4 / this.LJ;
        }
        this.LIZIZ.put(str, Float.valueOf(this.LJ * f));
    }
}
