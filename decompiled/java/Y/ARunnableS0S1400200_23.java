package Y;

import X.C1494630ozt;
import X.C1494640ozu;
import X.C1494850p0F;
import X.C1494910p0L;
import X.C1498560p6E;
import X.C1C7U;
import X.C2093608Ic;
import X.C2222891BzL;
import X.C794240VDq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS0S1400200_23 implements Runnable {
    public final int $t;
    public long j5;
    public long j6;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    public final void LIZ$0() {
        C794240VDq.LIZIZ("aweme_image_api", "", C1494630ozt.LIZLLL(false, this.j5, this.j6, this.s0, (C1494850p0F) this.l1, (Throwable) this.l2));
        try {
            String[] strArr = new String[1];
            C1498560p6E.LIZIZ((Throwable) this.l2, strArr);
            if (C2093608Ic.LJ(strArr[0])) {
            }
            JSONObject jSONObject = (JSONObject) this.l3;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C1494630ozt.LJ((C1494850p0F) this.l1, jSONObject);
            C1494910p0L.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

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

    public static final void run$0(ARunnableS0S1400200_23 aRunnableS0S1400200_23) {
        boolean zLIZ;
        C1C7U.LIZ("FrescoMIOImageCallBack@c0d4.onImageErrorCallBack$1");
        try {
            aRunnableS0S1400200_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrescoMIOImageCallBack@c0d4.onImageErrorCallBack$1");
    }

    public static final void run$1(ARunnableS0S1400200_23 aRunnableS0S1400200_23) {
        C1494640ozu c1494640ozu = (C1494640ozu) aRunnableS0S1400200_23.l1;
        long j = aRunnableS0S1400200_23.j5;
        long j2 = aRunnableS0S1400200_23.j6;
        String str = aRunnableS0S1400200_23.s0;
        C1494850p0F c1494850p0F = (C1494850p0F) aRunnableS0S1400200_23.l2;
        Throwable th = (Throwable) aRunnableS0S1400200_23.l3;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1400200_23.l4;
        c1494640ozu.getClass();
        C1C7U.LIZ("FrescoTTNetImageCallBack@73e0.onImageErrorCallBack$1L");
        C2222891BzL.LIZ.LIZ(C1494640ozu.LIZLLL(false, j, j2, str, c1494850p0F, th));
        try {
            String[] strArr = new String[1];
            C1498560p6E.LIZIZ(th, strArr);
            C2093608Ic.LJ(strArr[0]);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C1494640ozu.LJ(c1494850p0F, jSONObject);
            C1494910p0L.LIZ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C1C7U.LIZIZ("FrescoTTNetImageCallBack@73e0.onImageErrorCallBack$1L");
    }

    public ARunnableS0S1400200_23(Object obj, long j, long j2, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l4 = obj;
        this.j5 = j;
        this.j6 = j2;
        this.s0 = str;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
