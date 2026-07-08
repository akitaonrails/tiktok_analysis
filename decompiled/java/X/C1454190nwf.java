package X;

import android.graphics.RectF;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0nwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454190nwf {
    public final Size LIZ;
    public List<RectF> LIZIZ = new ArrayList();
    public List<C1454420nx2> LIZJ = new ArrayList();

    public C1454190nwf(Size size) {
        this.LIZ = size;
    }

    public final C1454420nx2 LIZIZ(int i) {
        return (C1454420nx2) C13LP.LJJJLZIJ(i, this.LIZJ);
    }

    public final void LIZJ(int i, CollageInnerImageInfo collageInnerImageInfo) {
        C1454420nx2 c1454420nx2 = (C1454420nx2) C13LP.LJJJLZIJ(i, this.LIZJ);
        if (c1454420nx2 != null) {
            c1454420nx2.LIZ = collageInnerImageInfo;
        }
    }

    public final void LIZ(C1454380nwy c1454380nwy, List<? extends NLETrack> list, List<CollageInnerImageInfo> list2) {
        int size = c1454380nwy.LIZIZ.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(null);
        }
        this.LIZIZ = arrayList;
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(null);
        }
        this.LIZJ = arrayList2;
        for (C1454180nwe c1454180nwe : c1454380nwy.LIZIZ) {
            int i4 = i + 1;
            if (i >= 0) {
                C1454180nwe c1454180nwe2 = c1454180nwe;
                List<RectF> list3 = this.LIZIZ;
                float f = c1454180nwe2.LIZ;
                Size size2 = this.LIZ;
                float f2 = size2.width;
                float f3 = f * f2;
                float f4 = c1454180nwe2.LIZIZ;
                float f5 = size2.height;
                float f6 = f4 * f5;
                ListProtector.set(list3, i, new RectF(f3, f6, (c1454180nwe2.LIZJ * f2) + f3, (c1454180nwe2.LIZLLL * f5) + f6));
                NLETrack nLETrack = (NLETrack) C13LP.LJJJLZIJ(i, list);
                CollageInnerImageInfo collageInnerImageInfo = (CollageInnerImageInfo) ListProtector.get(list2, i % list2.size());
                if (nLETrack != null) {
                    ListProtector.set(this.LIZJ, i, new C1454420nx2(collageInnerImageInfo, nLETrack));
                }
                i = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
