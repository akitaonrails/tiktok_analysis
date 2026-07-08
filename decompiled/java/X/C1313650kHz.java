package X;

import com.bytedance.sdui.render.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313650kHz {
    public final int LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final int LJI;

    public final boolean LIZIZ() {
        return this.LIZJ == 1;
    }

    public static boolean LIZ(List<C1313650kHz> list) {
        if (list != null) {
            ArrayList<C1313650kHz> arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                for (C1313650kHz c1313650kHz : arrayList) {
                    if (c1313650kHz.LIZIZ() || c1313650kHz.LJ == 1 || c1313650kHz.LJI == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static List<C1313650kHz> LIZJ(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array.size() >= 7) {
                int i2 = array.getInt(0);
                float f = (float) array.getDouble(1);
                int i3 = array.getInt(2);
                float f2 = (float) array.getDouble(3);
                arrayList.add(new C1313650kHz(i2, i3, array.getInt(4), array.getInt(6), f, f2, (float) array.getDouble(5)));
            } else {
                C1314420kJE.LIZIZ(new IllegalArgumentException("transform params is error."));
                throw null;
            }
        }
        return arrayList;
    }

    public C1313650kHz(int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = i2;
        this.LIZLLL = f2;
        this.LJ = i3;
        this.LJFF = f3;
        this.LJI = i4;
    }
}
