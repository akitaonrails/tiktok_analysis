package Y;

import X.C1245340iVo;
import X.C1720106oR;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C299980BpM;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS0S3110000_19 implements Runnable {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;
    public boolean z4;

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
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileInfoCollectHelper", "actionAfterLeavePlatformProfile start");
        C1245340iVo c1245340iVo = C1245340iVo.LIZ;
        boolean z = this.z4;
        String str = this.s0;
        String str2 = this.s1;
        String str3 = this.s2;
        User user = (User) this.l3;
        c1245340iVo.getClass();
        C1245340iVo.LJFF(user, str, str2, str3, z);
        if (this.z4) {
            C1245340iVo.LIZIZ = true;
        }
        if (C299980BpM.LIZ()) {
            return;
        }
        C1245340iVo.LJII(this.s0, this.z4);
    }

    public final void LIZ$1() {
        if (this.z4) {
            C1245340iVo c1245340iVo = C1245340iVo.LIZ;
            c1245340iVo.getClass();
            ConcurrentHashMap<String, SparseArray<String>> concurrentHashMap = C1245340iVo.LJIILL;
            SparseArray<String> sparseArray = concurrentHashMap.get(this.s1);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                c1245340iVo.getClass();
                concurrentHashMap.put(this.s1, sparseArray);
            }
            try {
                sparseArray.put(((Integer) this.l3).intValue(), this.s2);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error ");
                sbLIZ.append(e.getMessage());
                C1720106oR.LIZ("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        String str = this.s0;
        if (str == null || str.length() == 0) {
            return;
        }
        C1245340iVo c1245340iVo2 = C1245340iVo.LIZ;
        c1245340iVo2.getClass();
        ConcurrentHashMap<String, ConcurrentHashMap<String, SparseArray<String>>> concurrentHashMap2 = C1245340iVo.LJIILLIIL;
        ConcurrentHashMap<String, SparseArray<String>> concurrentHashMap3 = concurrentHashMap2.get(this.s0);
        if (concurrentHashMap3 == null) {
            concurrentHashMap3 = new ConcurrentHashMap<>();
        }
        SparseArray<String> sparseArray2 = concurrentHashMap3.get(this.s1);
        if (sparseArray2 == null) {
            sparseArray2 = new SparseArray<>();
            concurrentHashMap3.put(this.s1, sparseArray2);
        }
        c1245340iVo2.getClass();
        concurrentHashMap2.put(this.s0, concurrentHashMap3);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateComponentShowList addAll: ");
        sbLIZ2.append(this.s1);
        sbLIZ2.append(", value: ");
        sbLIZ2.append(this.s2);
        sbLIZ2.append(", uid: ");
        sbLIZ2.append(this.s0);
        C1720106oR.LJI("ProfileInfoCollectHelper", C2188811AlT.LIZIZ(sbLIZ2));
        sparseArray2.put(((Integer) this.l3).intValue(), this.s2);
    }

    public static final void run$0(ARunnableS0S3110000_19 aRunnableS0S3110000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoCollectHelper@dae2.actionAfterLeavePlatformProfile$1");
        try {
            aRunnableS0S3110000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.actionAfterLeavePlatformProfile$1");
    }

    public static final void run$1(ARunnableS0S3110000_19 aRunnableS0S3110000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoCollectHelper@dae2.updateTopComponentList$1");
        try {
            aRunnableS0S3110000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.updateTopComponentList$1");
    }

    public ARunnableS0S3110000_19(Object obj, String str, String str2, String str3, boolean z, int i) {
        this.$t = i;
        this.z4 = z;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = obj;
    }
}
