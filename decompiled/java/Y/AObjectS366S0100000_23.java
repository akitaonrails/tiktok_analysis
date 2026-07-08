package Y;

import X.AbstractRunnableC1551740qU0;
import X.C1494620ozs;
import X.C1524510pm5;
import X.C1524560pmA;
import X.C1524570pmB;
import X.C1524660pmK;
import X.C1551570qTj;
import X.C1551760qU2;
import X.C1551810qU7;
import X.C538540LAe;
import X.CallableC1488820oqW;
import X.EnumC1551610qTn;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AObjectS366S0100000_23 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public AObjectS366S0100000_23(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AObjectS366S0100000_23 aObjectS366S0100000_23, Object obj) {
        if (((Boolean) obj).booleanValue() && ((C1551570qTj) aObjectS366S0100000_23.l0).LJIIJ == EnumC1551610qTn.DOWNLOADING) {
            ((C1551570qTj) aObjectS366S0100000_23.l0).LJIIJ = EnumC1551610qTn.PAUSED;
            C1551570qTj c1551570qTj = (C1551570qTj) aObjectS366S0100000_23.l0;
            c1551570qTj.LJ(c1551570qTj.LJ, (UpdatePackage) ((Pair) c1551570qTj.LIZIZ).second);
            ((C1551570qTj) aObjectS366S0100000_23.l0).LJIIIZ.LIZLLL(aObjectS366S0100000_23);
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS366S0100000_23 aObjectS366S0100000_23, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            Iterator<AbstractRunnableC1551740qU0> it2 = ((C1551760qU2) aObjectS366S0100000_23.l0).LJIIIZ.iterator();
            while (it2.hasNext()) {
                UpdatePackage updatePackage = it2.next().LLILLJJLI.LJ;
                C1551810qU7 statisticModel = updatePackage.getStatisticModel();
                if (statisticModel == null) {
                    updatePackage.onResume();
                } else {
                    statisticModel.LJJ += System.currentTimeMillis() - statisticModel.LJJI;
                }
                ((C1551760qU2) aObjectS366S0100000_23.l0).LJII.getListener().LJIILJJIL(updatePackage);
            }
            ((C1551760qU2) aObjectS366S0100000_23.l0).LIZLLL();
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AObjectS366S0100000_23 aObjectS366S0100000_23, Object obj) {
        CallableC1488820oqW callableC1488820oqW = (CallableC1488820oqW) aObjectS366S0100000_23.l0;
        ((ReentrantLock) callableC1488820oqW.LL).lock();
        try {
            callableC1488820oqW.LLILLL.set(obj);
            callableC1488820oqW.LLILLJJLI.signalAll();
            ((ReentrantLock) callableC1488820oqW.LL).unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) callableC1488820oqW.LL).unlock();
            throw th;
        }
    }

    public static final Object invoke$3(AObjectS366S0100000_23 aObjectS366S0100000_23, Object obj) {
        CallableC1488820oqW callableC1488820oqW = (CallableC1488820oqW) aObjectS366S0100000_23.l0;
        ((ReentrantLock) callableC1488820oqW.LL).lock();
        try {
            callableC1488820oqW.LLILZ.set(obj);
            callableC1488820oqW.LLILLJJLI.signalAll();
            ((ReentrantLock) callableC1488820oqW.LL).unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) callableC1488820oqW.LL).unlock();
            throw th;
        }
    }

    public static final Object invoke$4(AObjectS366S0100000_23 aObjectS366S0100000_23, Object obj) throws JSONException {
        int iIntValue;
        C1524660pmK c1524660pmK = (C1524660pmK) aObjectS366S0100000_23.l0;
        C1524560pmA c1524560pmA = (C1524560pmA) obj;
        if (c1524560pmA.LIZ) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", "success");
            jSONObject.put("downloadTaskId", c1524560pmA.LIZIZ);
            String str = c1524560pmA.LIZLLL;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    String str3 = C1524510pm5.LIZIZ;
                    String str4 = null;
                    if (str3 == null) {
                        str3 = null;
                    }
                    if (u.LJJIIJZLJL(str, str3, false)) {
                        String str5 = C1524510pm5.LIZIZ;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        str = "ttfile://temp/" + str.substring(str4.length());
                    } else {
                        String str6 = C1524510pm5.LIZ;
                        if (str6 == null) {
                            str6 = null;
                        }
                        if (u.LJJIIJZLJL(str, str6, false)) {
                            String str7 = C1524510pm5.LIZ;
                            if (str7 != null) {
                                str4 = str7;
                            }
                            str = "ttfile://user/" + str.substring(str4.length());
                        }
                    }
                    str2 = str;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                th.getMessage();
            }
            jSONObject.put("tempFilePath", str2);
            jSONObject.put("statusCode", c1524560pmA.LIZJ);
            c1524660pmK.LIZIZ.emitJSAPIEvent("innerDownloadTaskStateChange", jSONObject);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("state", "fail");
            jSONObject2.put("downloadTaskId", c1524560pmA.LIZIZ);
            jSONObject2.put("statusCode", c1524560pmA.LIZJ);
            Integer num = c1524560pmA.LJFF;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = C538540LAe.LLJJJIL;
            }
            jSONObject2.put("errorCode", iIntValue);
            String str8 = c1524560pmA.LJ;
            if (str8 == null) {
                str8 = "unknown error";
            }
            jSONObject2.put("errorMsg", str8);
            c1524660pmK.LIZIZ.emitJSAPIEvent("innerDownloadTaskStateChange", jSONObject2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS366S0100000_23 aObjectS366S0100000_23, Object obj) throws JSONException {
        C1524660pmK c1524660pmK = (C1524660pmK) aObjectS366S0100000_23.l0;
        C1524570pmB c1524570pmB = (C1524570pmB) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", "progressUpdate");
        jSONObject.put("downloadTaskId", c1524570pmB.LIZ);
        jSONObject.put("progress", Float.valueOf(c1524570pmB.LIZIZ));
        jSONObject.put("totalBytesWritten", c1524570pmB.LIZJ);
        jSONObject.put("totalBytesExpectedWrite", c1524570pmB.LIZLLL);
        c1524660pmK.LIZIZ.emitJSAPIEvent("innerDownloadTaskStateChange", jSONObject);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS366S0100000_23 aObjectS366S0100000_23, Object obj) {
        ((C1494620ozs) aObjectS366S0100000_23.l0).LIZ = (String) obj;
        return Unit.LIZ;
    }
}
