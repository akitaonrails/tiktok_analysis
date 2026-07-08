package X;

import android.renderscript.Matrix4f;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0kHO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313280kHO {
    public final int LIZ;
    public final float LIZIZ;
    public final C1313840kII LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final C1313840kII LJFF;
    public final int LJI;
    public final C1313840kII LJII;
    public final int LJIIIIZZ;
    public final float[] LJIIIZ;

    public static boolean LIZ(List<C1313280kHO> list) {
        if (list != null && !list.isEmpty()) {
            for (C1313280kHO c1313280kHO : list) {
                if (c1313280kHO.LIZLLL == 1 || c1313280kHO.LJI == 1 || c1313280kHO.LJIIIIZZ == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static float LIZIZ(List<C1313280kHO> list) {
        float fLIZ = 0.0f;
        if (list != null && !list.isEmpty()) {
            for (C1313280kHO c1313280kHO : list) {
                int i = c1313280kHO.LIZ;
                if (i == 1 || i == 2 || i == 16) {
                    fLIZ = c1313280kHO.LIZJ.LIZ();
                }
            }
        }
        return fLIZ;
    }

    public static float LIZJ(List<C1313280kHO> list) {
        float fLIZ = 0.0f;
        if (list != null && !list.isEmpty()) {
            for (C1313280kHO c1313280kHO : list) {
                int i = c1313280kHO.LIZ;
                if (i != 1) {
                    if (i != 4) {
                        if (i != 16) {
                        }
                    } else {
                        fLIZ = c1313280kHO.LIZJ.LIZ();
                    }
                }
                fLIZ = c1313280kHO.LJFF.LIZ();
            }
        }
        return fLIZ;
    }

    public static List<C1313280kHO> LIZLLL(ReadableArray readableArray) {
        int i;
        if (readableArray != null && readableArray.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                ReadableArray array = readableArray.getArray(i2);
                if (array.size() < 7) {
                    LynxLog.DTHROW(new IllegalArgumentException("transform params is error."));
                } else {
                    int i3 = array.getInt(0);
                    if (i3 != 32768 && i3 != 65536) {
                        int i4 = array.getInt(2);
                        int i5 = array.getInt(4);
                        int i6 = array.getInt(6);
                        if (i3 != 1 && i3 != 2 && i3 != 4 && i3 != 8 && i3 != 16) {
                            float f = (float) array.getDouble(1);
                            float f2 = (float) array.getDouble(3);
                            array.getDouble(5);
                            arrayList.add(new C1313280kHO(i3, i4, i5, i6, f, f2));
                        } else {
                            arrayList.add(new C1313280kHO(i3, new C1313840kII(array.getDynamic(1), i4), i4, new C1313840kII(array.getDynamic(3), i5), i5, new C1313840kII(array.getDynamic(5), i6), i6));
                        }
                    } else {
                        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f};
                        int i7 = 0;
                        do {
                            i = i7 + 1;
                            fArr[i7] = (float) array.getDouble(i);
                            i7 = i;
                        } while (i < 16);
                        arrayList.add(new C1313280kHO(i3, fArr));
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public C1313280kHO(int i, float[] fArr) {
        this.LIZ = i;
        this.LIZJ = new C1313840kII(0.0f);
        this.LIZIZ = 0.0f;
        this.LIZLLL = 0;
        this.LJFF = new C1313840kII(0.0f);
        this.LJ = 0.0f;
        this.LJI = 0;
        this.LJII = new C1313840kII(0.0f);
        this.LJIIIIZZ = 0;
        this.LJIIIZ = fArr;
    }

    public C1313280kHO(int i, int i2, int i3, int i4, float f, float f2) {
        this.LIZ = i;
        this.LIZJ = new C1313840kII(0.0f);
        this.LIZIZ = f;
        this.LIZLLL = i2;
        this.LJFF = new C1313840kII(0.0f);
        this.LJ = f2;
        this.LJI = i3;
        this.LJII = new C1313840kII(0.0f);
        this.LJIIIIZZ = i4;
        this.LJIIIZ = new Matrix4f().getArray();
    }

    public C1313280kHO(int i, C1313840kII c1313840kII, int i2, C1313840kII c1313840kII2, int i3, C1313840kII c1313840kII3, int i4) {
        this.LIZ = i;
        this.LIZJ = c1313840kII;
        this.LIZLLL = i2;
        this.LJFF = c1313840kII2;
        this.LJI = i3;
        this.LJII = c1313840kII3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = new Matrix4f().getArray();
    }
}
