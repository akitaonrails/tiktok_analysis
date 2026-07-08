package X;

import Y.AComparatorS511S0100000_12;
import android.graphics.Rect;
import com.bytedance.android.live.effect.sticker.list.SpannedGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: X.19tZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21683519tZ {
    public final SpannedGridLayoutManager LIZ;
    public final EnumC769180UFg LIZIZ;
    public final AComparatorS511S0100000_12 LIZJ = new AComparatorS511S0100000_12(this, 0);
    public final Map<Integer, Set<Integer>> LIZLLL = new LinkedHashMap();
    public final Map<Integer, Rect> LJ = new LinkedHashMap();
    public final List<Rect> LJFF;

    public final int LIZIZ() {
        int height;
        int paddingBottom;
        if (this.LIZIZ == EnumC769180UFg.VERTICAL) {
            height = this.LIZ.getWidth() - this.LIZ.getPaddingLeft();
            paddingBottom = this.LIZ.getPaddingRight();
        } else {
            height = this.LIZ.getHeight() - this.LIZ.getPaddingTop();
            paddingBottom = this.LIZ.getPaddingBottom();
        }
        return (height - paddingBottom) / this.LIZ.LLILLJJLI;
    }

    public C21683519tZ(SpannedGridLayoutManager spannedGridLayoutManager, EnumC769180UFg enumC769180UFg) {
        Rect rect;
        this.LIZ = spannedGridLayoutManager;
        this.LIZIZ = enumC769180UFg;
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        if (enumC769180UFg == EnumC769180UFg.VERTICAL) {
            rect = new Rect(0, 0, spannedGridLayoutManager.LLILLJJLI, Integer.MAX_VALUE);
        } else {
            rect = new Rect(0, 0, Integer.MAX_VALUE, spannedGridLayoutManager.LLILLJJLI);
        }
        arrayList.add(rect);
    }

    public final Rect LIZ(int i, C21683719tb c21683719tb) {
        Rect rect = (Rect) ((LinkedHashMap) this.LJ).get(Integer.valueOf(i));
        if (rect == null) {
            for (Rect rect2 : (ArrayList) this.LJFF) {
                int i2 = rect2.left;
                int i3 = rect2.top;
                if (rect2.contains(new Rect(i2, i3, c21683719tb.LIZ + i2, c21683719tb.LIZIZ + i3))) {
                    int i4 = rect2.left;
                    int i5 = rect2.top;
                    return new Rect(i4, i5, c21683719tb.LIZ + i4, c21683719tb.LIZIZ + i5);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return rect;
    }
}
