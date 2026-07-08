package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.gamora.layout.LayoutNLETrackStub;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0L9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538360L9m {
    public final NLEModel LIZ;
    public final List<C538350L9l> LIZIZ = new ArrayList();
    public int LIZJ;
    public int LIZLLL;
    public C538370L9n LJ;
    public float LJFF;
    public float LJI;

    public final void LIZIZ() {
        int i;
        int i2;
        float f;
        boolean z;
        float f2;
        C538370L9n c538370L9n = this.LJ;
        ((ArrayList) this.LIZIZ).clear();
        if (c538370L9n == null || (i = this.LIZJ) <= 0 || (i2 = this.LIZLLL) <= 0) {
            return;
        }
        this.LJFF = i / c538370L9n.LIZIZ;
        this.LJI = i2 / c538370L9n.LIZ;
        int size = c538370L9n.LIZJ.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            List<C538350L9l> list = this.LIZIZ;
            int i5 = this.LIZJ;
            int i6 = this.LIZLLL;
            C538350L9l c538350L9l = new C538350L9l(i3);
            int i7 = c538370L9n.LIZ;
            int i8 = c538370L9n.LIZIZ;
            C538380L9o c538380L9o = (C538380L9o) C13LP.LJJJLZIJ(i4, c538370L9n.LIZJ);
            if (c538380L9o != null) {
                int i9 = c538380L9o.LIZ;
                float f3 = this.LJFF;
                float f4 = i9 * f3;
                int i10 = c538380L9o.LIZIZ;
                float f5 = this.LJI;
                float f6 = i10 * f5;
                int i11 = c538380L9o.LIZJ;
                if (i9 + i11 == i8) {
                    f = i5 - f4;
                    c538350L9l.LJ = true;
                    z = false;
                } else {
                    f = i11 * f3;
                    z = false;
                    c538350L9l.LJ = false;
                }
                int i12 = c538380L9o.LIZLLL;
                if (i10 + i12 == i7) {
                    f2 = i6 - f6;
                    c538350L9l.LJFF = true;
                } else {
                    f2 = f5 * i12;
                    c538350L9l.LJFF = z;
                }
                c538350L9l.LIZJ = f;
                c538350L9l.LIZLLL = f2;
                c538350L9l.LIZ = f4;
                c538350L9l.LIZIZ = f6;
            }
            ((ArrayList) list).add(c538350L9l);
            i4++;
            i3 = 0;
        }
    }

    public C538360L9m(NLEModel nLEModel) {
        this.LIZ = nLEModel;
    }

    public final void LIZJ(int i, int i2, C538370L9n c538370L9n) {
        if (this.LIZJ != i || this.LIZLLL != i2) {
            this.LIZJ = i;
            this.LIZLLL = i2;
            LIZIZ();
        }
        if (this.LJ != c538370L9n) {
            this.LJ = c538370L9n;
            LIZIZ();
        }
    }

    public static LayoutNLETrackStub LIZ(C538360L9m c538360L9m, String str, C0L9K c0l9k, C0LDD c0ldd, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            C0LDD.LIZ.getClass();
            c0ldd = C0LDC.LIZIZ.getValue();
        }
        Long lValueOf = null;
        if (c538360L9m.LIZ == null || str == null || str.length() == 0) {
            return null;
        }
        LayoutNLETrackStub layoutNLETrackStub = new LayoutNLETrackStub(c538360L9m.LIZ, c0ldd);
        NLETrack mainTrack = c538360L9m.LIZ.getMainTrack();
        if (mainTrack != null) {
            lValueOf = Long.valueOf(mainTrack.getDuration());
        }
        layoutNLETrackStub.LIZ(str, c0l9k, lValueOf, z);
        return layoutNLETrackStub;
    }
}
