package X;

import Y.ARunnableS0S3101200_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VC7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VC7 {
    public static boolean LIZ;
    public static final Queue<C0VCQ> LIZIZ = new LinkedBlockingDeque();
    public static final Queue<C0VCQ> LIZJ = new LinkedBlockingDeque();
    public static final Queue<C0VCQ> LIZLLL = new LinkedBlockingDeque();
    public static final Queue<C0VCQ> LJ = new LinkedBlockingDeque();

    public static void LIZ() {
        C0VEP.LIZ.getClass();
        if (!((Boolean) C0VEP.LIZLLL.getValue()).booleanValue()) {
            return;
        }
        LIZ = false;
        while (true) {
            Queue<C0VCQ> queue = LIZIZ;
            if (queue.isEmpty()) {
                break;
            }
            C0VCQ c0vcq = (C0VCQ) ((LinkedBlockingDeque) queue).poll();
            C793770VBv.LJIIIIZZ(c0vcq.LIZ, c0vcq.LIZIZ, c0vcq.LIZJ, c0vcq.LIZLLL, c0vcq.LJ, c0vcq.LJFF, c0vcq.LJI);
        }
        while (true) {
            Queue<C0VCQ> queue2 = LIZJ;
            if (queue2.isEmpty()) {
                break;
            }
            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) queue2;
            C0VCQ c0vcq2 = (C0VCQ) linkedBlockingDeque.poll();
            long j = c0vcq2.LIZ;
            long j2 = c0vcq2.LIZIZ;
            String str = c0vcq2.LIZJ;
            String str2 = c0vcq2.LIZLLL;
            String str3 = c0vcq2.LJ;
            int i = c0vcq2.LJFF;
            JSONObject jSONObject = c0vcq2.LJI;
            C1494850p0F c1494850p0F = c0vcq2.LJII;
            if (LIZ) {
                linkedBlockingDeque.add(new C0VCQ(j, j2, str, str2, str3, i, jSONObject, c1494850p0F, null));
            } else {
                JSONObject jSONObjectLJIILJJIL = C793770VBv.LJIILJJIL(jSONObject);
                if (jSONObjectLJIILJJIL != null && c1494850p0F != null) {
                    try {
                        jSONObjectLJIILJJIL.put("requestHeader", c1494850p0F.LJJIIZI);
                        jSONObjectLJIILJJIL.put("responseHeader", c1494850p0F.LJJIJ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                C787900UvU.LIZ.LIZJ(new ARunnableS0S3101200_13(j, j2, str, str2, str3, i, jSONObjectLJIILJJIL, 3));
                if (C792400V6o.LIZJ) {
                    C0VD9.LIZ().LIZIZ(new ARunnableS0S3101200_13(j, j2, str, str2, str3, i, jSONObjectLJIILJJIL, 4));
                }
            }
        }
        while (true) {
            Queue<C0VCQ> queue3 = LIZLLL;
            if (queue3.isEmpty()) {
                break;
            }
            C0VCQ c0vcq3 = (C0VCQ) ((LinkedBlockingDeque) queue3).poll();
            C793770VBv.LIZLLL(c0vcq3.LIZ, c0vcq3.LIZIZ, c0vcq3.LIZJ, c0vcq3.LIZLLL, c0vcq3.LJ, c0vcq3.LJFF, c0vcq3.LJI);
        }
        while (true) {
            Queue<C0VCQ> queue4 = LJ;
            if (queue4.isEmpty()) {
                return;
            }
            LinkedBlockingDeque linkedBlockingDeque2 = (LinkedBlockingDeque) queue4;
            C0VCQ c0vcq4 = (C0VCQ) linkedBlockingDeque2.poll();
            long j3 = c0vcq4.LIZ;
            long j4 = c0vcq4.LIZIZ;
            String str4 = c0vcq4.LIZJ;
            String str5 = c0vcq4.LIZLLL;
            String str6 = c0vcq4.LJ;
            int i2 = c0vcq4.LJFF;
            JSONObject jSONObject2 = c0vcq4.LJI;
            C1494850p0F c1494850p0F2 = c0vcq4.LJII;
            Throwable th2 = c0vcq4.LJIIIIZZ;
            if (LIZ) {
                linkedBlockingDeque2.add(new C0VCQ(j3, j4, str4, str5, str6, i2, jSONObject2, c1494850p0F2, th2));
            } else {
                JSONObject jSONObjectLJIILJJIL2 = C793770VBv.LJIILJJIL(jSONObject2);
                if (jSONObjectLJIILJJIL2 != null) {
                    if (th2 != null) {
                        try {
                            jSONObjectLJIILJJIL2.put("substatus", C1498570p6F.LIZ(th2));
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }
                    if (c1494850p0F2 != null) {
                        try {
                            jSONObjectLJIILJJIL2.put("requestHeader", c1494850p0F2.LJJIIZI);
                            try {
                                jSONObjectLJIILJJIL2.put("responseHeader", c1494850p0F2.LJJIJ);
                            } catch (Throwable th4) {
                                th = th4;
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
                C787900UvU.LIZ.LIZJ(new ARunnableS0S3101200_13(j3, j4, str4, str5, str6, i2, jSONObjectLJIILJJIL2, 5));
                if (C792400V6o.LIZJ) {
                    C0VD9.LIZ().LIZIZ(new ARunnableS0S3101200_13(j3, j4, str4, str5, str6, i2, jSONObjectLJIILJJIL2, 6));
                }
            }
        }
    }
}
