package Y;

import X.C1271090jBL;
import X.C1271150jBR;
import X.C1271170jBT;
import X.C1271190jBV;
import X.C1C7U;
import X.InterfaceC1272490jDb;
import java.util.LinkedList;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0513200_20 implements Runnable {
    public final int $t;
    public int i6;
    public int i7;
    public int i8;
    public long j10;
    public long j9;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1271170jBT c1271170jBT;
        LinkedList<C1271170jBT> linkedList = ((C1271150jBR) this.l4).LIZJ;
        if (linkedList == null) {
            ((InterfaceC1272490jDb) this.l0).release();
            return;
        }
        int size = linkedList.size();
        C1271150jBR c1271150jBR = (C1271150jBR) this.l4;
        if (size >= c1271150jBR.LJII) {
            C1271170jBT c1271170jBTRemove = c1271150jBR.LIZJ.remove();
            c1271170jBTRemove.LIZLLL.release();
            C1271190jBV c1271190jBV = ((C1271150jBR) this.l4).LIZIZ;
            if (c1271190jBV.LIZ.size() < 5) {
                c1271190jBV.LIZ.add(c1271170jBTRemove);
            }
        }
        C1271150jBR c1271150jBR2 = (C1271150jBR) this.l4;
        LinkedList<C1271170jBT> linkedList2 = c1271150jBR2.LIZJ;
        C1271190jBV c1271190jBV2 = c1271150jBR2.LIZIZ;
        EGLContext eGLContext = (EGLContext) this.l1;
        int i = this.i6;
        boolean z = this.z5;
        InterfaceC1272490jDb interfaceC1272490jDb = (InterfaceC1272490jDb) this.l0;
        int i2 = this.i7;
        int i3 = this.i8;
        long j = this.j9;
        float[] fArr = (float[]) this.l2;
        long j2 = this.j10;
        Object[] objArr = (Object[]) this.l3;
        if (c1271190jBV2.LIZ.size() > 0) {
            c1271170jBT = c1271190jBV2.LIZ.remove();
            c1271170jBT.LIZ = eGLContext;
            c1271170jBT.LIZIZ = i;
            c1271170jBT.LIZJ = z;
            c1271170jBT.LIZLLL = interfaceC1272490jDb;
            c1271170jBT.LJ = i2;
            c1271170jBT.LJFF = i3;
            c1271170jBT.LJI = j;
            c1271170jBT.LJII = fArr;
            c1271170jBT.LJIIIIZZ = j2;
            c1271170jBT.LJIIIZ = objArr;
        } else {
            c1271170jBT = new C1271170jBT(eGLContext, i, z, interfaceC1272490jDb, i2, i3, j, fArr, j2, objArr);
        }
        linkedList2.add(c1271170jBT);
    }

    public static final void run$0(ARunnableS0S0513200_20 aRunnableS0S0513200_20) {
        boolean zLIZ;
        C1C7U.LIZ("FrameDeliverScheduler@355e.schedule$1");
        try {
            aRunnableS0S0513200_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrameDeliverScheduler@355e.schedule$1");
    }

    public static final void run$1(ARunnableS0S0513200_20 aRunnableS0S0513200_20) {
        C1271090jBL c1271090jBL = (C1271090jBL) aRunnableS0S0513200_20.l0;
        EGLContext eGLContext = (EGLContext) aRunnableS0S0513200_20.l1;
        int i = aRunnableS0S0513200_20.i6;
        boolean z = aRunnableS0S0513200_20.z5;
        InterfaceC1272490jDb interfaceC1272490jDb = (InterfaceC1272490jDb) aRunnableS0S0513200_20.l2;
        int i2 = aRunnableS0S0513200_20.i7;
        int i3 = aRunnableS0S0513200_20.i8;
        long j = aRunnableS0S0513200_20.j9;
        float[] fArr = (float[]) aRunnableS0S0513200_20.l3;
        long j2 = aRunnableS0S0513200_20.j10;
        Object[] objArr = (Object[]) aRunnableS0S0513200_20.l4;
        c1271090jBL.getClass();
        C1C7U.LIZ("MediaEngine@e3a5.processFrameSmoothly$1L");
        c1271090jBL.LIZJ(eGLContext, i, z, interfaceC1272490jDb, i2, i3, j, fArr, j2, objArr);
        C1C7U.LIZIZ("MediaEngine@e3a5.processFrameSmoothly$1L");
    }

    public ARunnableS0S0513200_20(Object obj, Object obj2, Object obj3, int i, boolean z, int i2, int i3, long j, Object obj4, long j2, Object obj5, int i4) {
        this.$t = i4;
        this.l4 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.i6 = i;
        this.z5 = z;
        this.i7 = i2;
        this.i8 = i3;
        this.j9 = j;
        this.l2 = obj4;
        this.j10 = j2;
        this.l3 = obj5;
    }
}
