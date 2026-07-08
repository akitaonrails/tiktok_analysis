package Y;

import X.C1C7U;
import X.C2093608Ic;
import X.C2241008qG;
import X.C793770VBv;
import X.C794240VDq;
import X.C794430VEj;
import X.C806990VlB;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.agilelogger.ALog;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS0S2100200_13 implements Runnable {
    public final int $t;
    public long j3;
    public long j4;
    public Object l2;
    public String s0;
    public String s1;

    public final void LIZ$0() {
        String[] strArr = new String[1];
        C2093608Ic.LJ(strArr[0]);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = !TextUtils.isEmpty(this.s0) ? UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(this.s0), "retry_type") : null;
        if (!((C794430VEj) this.l2).LIZ && !TextUtils.isEmpty(this.s0) && this.s0.contains("aweme/v1/feed/?type=0")) {
            ((C794430VEj) this.l2).LIZ = true;
        }
        long j = this.j3;
        long j2 = this.j4;
        String str = this.s0;
        String str2 = strArr[0];
        String str3 = this.s1;
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("retry_type", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        c2241008qG.LIZ.put("First_Request", String.valueOf(((C794430VEj) this.l2).LIZ));
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIIIZZ(j, j2, str, str2, str3, 200, jSONObjectLJ);
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
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S2100200_13 aRunnableS0S2100200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ALog$LogInstance@e31.d$1");
        try {
            int iLevel2AlogCoreLevel = ALog.level2AlogCoreLevel(3);
            ((C806990VlB) aRunnableS0S2100200_13.l2).LIZ.LJIILLIIL(iLevel2AlogCoreLevel, aRunnableS0S2100200_13.j3, aRunnableS0S2100200_13.j4, aRunnableS0S2100200_13.s0, aRunnableS0S2100200_13.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog$LogInstance@e31.d$1");
    }

    public static final void run$1(ARunnableS0S2100200_13 aRunnableS0S2100200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ALog$LogInstance@e31.i$1");
        try {
            int iLevel2AlogCoreLevel = ALog.level2AlogCoreLevel(4);
            ((C806990VlB) aRunnableS0S2100200_13.l2).LIZ.LJIILLIIL(iLevel2AlogCoreLevel, aRunnableS0S2100200_13.j3, aRunnableS0S2100200_13.j4, aRunnableS0S2100200_13.s0, aRunnableS0S2100200_13.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog$LogInstance@e31.i$1");
    }

    public static final void run$2(ARunnableS0S2100200_13 aRunnableS0S2100200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ALog$LogInstance@e31.w$1");
        try {
            int iLevel2AlogCoreLevel = ALog.level2AlogCoreLevel(5);
            ((C806990VlB) aRunnableS0S2100200_13.l2).LIZ.LJIILLIIL(iLevel2AlogCoreLevel, aRunnableS0S2100200_13.j3, aRunnableS0S2100200_13.j4, aRunnableS0S2100200_13.s0, aRunnableS0S2100200_13.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog$LogInstance@e31.w$1");
    }

    public static final void run$3(ARunnableS0S2100200_13 aRunnableS0S2100200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ALog$LogInstance@e31.e$1");
        try {
            int iLevel2AlogCoreLevel = ALog.level2AlogCoreLevel(6);
            ((C806990VlB) aRunnableS0S2100200_13.l2).LIZ.LJIILLIIL(iLevel2AlogCoreLevel, aRunnableS0S2100200_13.j3, aRunnableS0S2100200_13.j4, aRunnableS0S2100200_13.s0, aRunnableS0S2100200_13.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog$LogInstance@e31.e$1");
    }

    public static final void run$4(ARunnableS0S2100200_13 aRunnableS0S2100200_13) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeMonitor@5d09.<field>$1$monitorApiOk$1");
        try {
            aRunnableS0S2100200_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeMonitor@5d09.<field>$1$monitorApiOk$1");
    }

    public ARunnableS0S2100200_13(Object obj, String str, String str2, long j, long j2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.j3 = j;
        this.j4 = j2;
    }
}
