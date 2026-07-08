package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19Nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21530019Nq extends C19OA implements C19MY {
    public C19OA[] LIZ = new C19OA[4];
    public int LIZIZ;

    @Override // X.C19MY
    public final void LIZ() {
        this.LIZIZ = 0;
        Arrays.fill(this.LIZ, (Object) null);
    }

    @Override // X.C19MY
    public void LIZIZ() {
    }

    @Override // X.C19MY
    public final void LIZJ(C19OA c19oa) {
        if (c19oa != this && c19oa != null) {
            int i = this.LIZIZ + 1;
            C19OA[] c19oaArr = this.LIZ;
            if (i > c19oaArr.length) {
                this.LIZ = (C19OA[]) Arrays.copyOf(c19oaArr, c19oaArr.length * 2);
            }
            C19OA[] c19oaArr2 = this.LIZ;
            int i2 = this.LIZIZ;
            c19oaArr2[i2] = c19oa;
            this.LIZIZ = i2 + 1;
        }
    }

    @Override // X.C19OA
    public void copy(C19OA c19oa, HashMap<C19OA, C19OA> map) {
        super.copy(c19oa, map);
        C21530019Nq c21530019Nq = (C21530019Nq) c19oa;
        this.LIZIZ = 0;
        int i = c21530019Nq.LIZIZ;
        for (int i2 = 0; i2 < i; i2++) {
            LIZJ(map.get(c21530019Nq.LIZ[i2]));
        }
    }

    public final void LIZLLL(int i, C19OK c19ok, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.LIZIZ; i2++) {
            c19ok.LIZ(this.LIZ[i2]);
        }
        for (int i3 = 0; i3 < this.LIZIZ; i3++) {
            C19ON.LIZ(this.LIZ[i3], i, arrayList, c19ok);
        }
    }
}
