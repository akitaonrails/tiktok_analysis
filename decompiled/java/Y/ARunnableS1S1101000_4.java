package Y;

import X.C141Q;
import X.C1C7U;
import X.C310480CFa;
import X.C786410Ut5;
import X.C790600Uzq;
import X.C793770VBv;
import com.bytedance.common.jato.exception.ExceptionManager;
import com.ss.android.ugc.aweme.legoImp.task.DeoptMethod;
import com.ss.android.ugc.aweme.legoImp.task.ExceptionRuleConfig;
import com.ss.android.ugc.aweme.legoImp.task.TryCatchConfig;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS1S1101000_4 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str;
        ExceptionRuleConfig[] exceptionRuleConfigArr = ((TryCatchConfig) this.l1).exceptionRules;
        int i = this.i2;
        String str2 = this.s0;
        ArrayList arrayList = new ArrayList();
        for (ExceptionRuleConfig exceptionRuleConfig : exceptionRuleConfigArr) {
            int i2 = exceptionRuleConfig.appId;
            if ((i2 <= 0 || i2 == i) && ((str = exceptionRuleConfig.versionName) == null || str.length() == 0 || Intrinsics.LJFF(exceptionRuleConfig.versionName, str2))) {
                C310480CFa c310480CFa = new C310480CFa();
                String str3 = exceptionRuleConfig.className;
                String str4 = exceptionRuleConfig.methodName;
                String str5 = exceptionRuleConfig.methodSignature;
                c310480CFa.LIZ = str3;
                c310480CFa.LIZIZ = str4;
                c310480CFa.LIZJ = str5;
                String str6 = exceptionRuleConfig.exceptionClassName;
                String str7 = exceptionRuleConfig.exceptionMessage;
                c310480CFa.LIZLLL = str6;
                c310480CFa.LJ = str7;
                c310480CFa.LJI = exceptionRuleConfig.mode;
                c310480CFa.LJFF = exceptionRuleConfig.jumpDexPc;
                DeoptMethod[] deoptMethodArr = exceptionRuleConfig.deoptMethods;
                if (deoptMethodArr != null) {
                    for (DeoptMethod deoptMethod : deoptMethodArr) {
                        String str8 = deoptMethod.className;
                        String str9 = deoptMethod.methodName;
                        String str10 = deoptMethod.methodSignature;
                        if (!str8.isEmpty() && !str9.isEmpty() && !str10.isEmpty()) {
                            if (c310480CFa.LJII == null) {
                                c310480CFa.LJII = new ArrayList();
                                c310480CFa.LJIIIIZZ = new ArrayList();
                                c310480CFa.LJIIIZ = new ArrayList();
                            }
                            ((ArrayList) c310480CFa.LJII).add(str8);
                            ((ArrayList) c310480CFa.LJIIIIZZ).add(str9);
                            ((ArrayList) c310480CFa.LJIIIZ).add(str10);
                        }
                    }
                }
                ExceptionManager.ExceptionRule exceptionRule = new ExceptionManager.ExceptionRule(c310480CFa);
                if (exceptionRule.isValid()) {
                    arrayList.add(exceptionRule);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ExceptionManager.LIZ((ExceptionManager.ExceptionRule[]) arrayList.toArray(new ExceptionManager.ExceptionRule[0]));
        }
    }

    public static final void run$0(ARunnableS1S1101000_4 aRunnableS1S1101000_4) {
        boolean zLIZ;
        C1C7U.LIZ("DynamicTryCatchToolKt@f070.startTryCatchProtection$runnable$1");
        try {
            aRunnableS1S1101000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DynamicTryCatchToolKt@f070.startTryCatchProtection$runnable$1");
    }

    public static final void run$1(ARunnableS1S1101000_4 aRunnableS1S1101000_4) {
        boolean zLIZ;
        C1C7U.LIZ("VEUtilsWrapper@b772.asyncGetMusicDuration$1$1");
        try {
            ((Function1) aRunnableS1S1101000_4.l1).invoke(Integer.valueOf(aRunnableS1S1101000_4.i2));
            C141Q c141q = C141Q.LIZ;
            String str = aRunnableS1S1101000_4.s0;
            int i = aRunnableS1S1101000_4.i2;
            c141q.getClass();
            C141Q.LIZIZ.put(str, Integer.valueOf(i));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEUtilsWrapper@b772.asyncGetMusicDuration$1$1");
    }

    public static final void run$2(ARunnableS1S1101000_4 aRunnableS1S1101000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorStatusRate$1");
        try {
            JSONObject jSONObjectLIZ = new C790600Uzq(aRunnableS1S1101000_4.s0, aRunnableS1S1101000_4.i2, null, null, null, (JSONObject) aRunnableS1S1101000_4.l1).LIZ();
            if (jSONObjectLIZ != null) {
                C793770VBv.LJIIZILJ("monitorStatusRate", C786410Ut5.J3(jSONObjectLIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorStatusRate$1");
    }

    public ARunnableS1S1101000_4(int i, String str, Object obj, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.s0 = str;
    }
}
