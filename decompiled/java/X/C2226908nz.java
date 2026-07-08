package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2226908nz {
    public final List<Float> LIZ = new ArrayList();
    public final List<Float> LIZIZ = new ArrayList();
    public final C2252321DDq LIZJ;
    public final C2252321DDq LIZLLL;
    public volatile InterfaceC2227008o0 LJ;

    public final void LIZJ() {
        synchronized (this.LIZ) {
            try {
                ((ArrayList) this.LIZ).clear();
                ((ArrayList) this.LIZIZ).clear();
                this.LIZJ.setValue(C13BV.INSTANCE);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C2226908nz() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = c2252321DDqLIZ;
    }

    public static List LIZ(List list) {
        float size = list.size() / 10;
        int iLJ = 30;
        if (size < 60.0f) {
            iLJ = C13LZ.LJ(C814420VxA.LIZ((((double) 30) * Math.log(((double) size) + 1.0d)) / Math.log(61.0d)), 5, 30);
        }
        if (list.size() <= iLJ) {
            return list;
        }
        float[] fArr = new float[iLJ];
        for (int i = 0; i < iLJ; i++) {
            long j = i;
            long j2 = iLJ;
            int size2 = (int) (((j + 1) * ((long) list.size())) / j2);
            float fFloatValue = 0.0f;
            for (int size3 = (int) ((((long) list.size()) * j) / j2); size3 < size2; size3++) {
                if (((Number) ListProtector.get(list, size3)).floatValue() > fFloatValue) {
                    fFloatValue = ((Number) ListProtector.get(list, size3)).floatValue();
                }
            }
            fArr[i] = fFloatValue;
        }
        return C13LQ.LJJLIL(fArr);
    }

    public final void LIZIZ(float f) {
        Float fValueOf;
        float fFloatValue;
        float f2 = f * 2.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        synchronized (this.LIZ) {
            try {
                ((ArrayList) this.LIZIZ).add(Float.valueOf(f2));
                if (((ArrayList) this.LIZIZ).size() >= 5) {
                    Float fLJJLIIJ = C13LP.LJJLIIJ(this.LIZIZ);
                    if (fLJJLIIJ != null) {
                        fFloatValue = fLJJLIIJ.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    ((ArrayList) this.LIZ).add(Float.valueOf(fFloatValue));
                    ((ArrayList) this.LIZIZ).clear();
                    this.LIZJ.setValue(C13LP.LLIIII(this.LIZ));
                    fValueOf = Float.valueOf(fFloatValue);
                } else {
                    fValueOf = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (fValueOf != null) {
            float fFloatValue2 = fValueOf.floatValue();
            InterfaceC2227008o0 interfaceC2227008o0 = this.LJ;
            if (interfaceC2227008o0 != null) {
                interfaceC2227008o0.LIZ(fFloatValue2, System.currentTimeMillis());
            }
        }
    }
}
