package Y;

import X.C098200Yq;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C726930SfL;
import X.C796490VMh;
import X.C825970Wah;
import X.InterfaceC796340VLs;
import android.util.Log;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public class ACallableS69S1200000_13 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS69S1200000_13 aCallableS69S1200000_13) {
        Object c098200Yq;
        String string;
        String strCertToken;
        String string2;
        String string3;
        C1C7U.LIZ("TTPSystemAPIInit@6a08.reportBizError$1");
        String str = aCallableS69S1200000_13.s0;
        C825970Wah c825970Wah = (C825970Wah) aCallableS69S1200000_13.l1;
        Throwable th = (Throwable) aCallableS69S1200000_13.l2;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("error_type", str);
            Integer num = c825970Wah.LIZ;
            String str2 = "";
            if (num == null || (string = num.toString()) == null) {
                string = "";
            }
            linkedHashMap.put("dataflow_id", string);
            String str3 = c825970Wah.LIZIZ;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("class_identifier", str3);
            String str4 = c825970Wah.LIZJ;
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap.put("method_signature", str4);
            Cert cert = c825970Wah.LJ.LIZ;
            if (cert == null || (strCertToken = cert.certToken()) == null) {
                strCertToken = "";
            }
            linkedHashMap.put("bpea_cert_token", strCertToken);
            String str5 = c825970Wah.LJ.LIZIZ;
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("bpea_entry_token", str5);
            Integer num2 = c825970Wah.LJ.LIZLLL;
            if (num2 == null || (string2 = num2.toString()) == null) {
                string2 = "";
            }
            linkedHashMap.put("bpea_entry_category", string2);
            String[] strArr = c825970Wah.LJ.LIZJ;
            if (strArr != null && (string3 = Arrays.toString(strArr)) != null) {
                str2 = string3;
            }
            linkedHashMap.put("bpea_entry_data_type", str2);
            Npth.reportBizException("sandbox_validation_params_error", th, str, linkedHashMap, linkedHashMap, true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sandbox_validation_params_error[");
            sbLIZ.append(str);
            sbLIZ.append("] >> ");
            sbLIZ.append(linkedHashMap);
            c098200Yq = Integer.valueOf(Log.d("BPEA_SANDBOX_ERROR", C2188811AlT.LIZIZ(sbLIZ), th));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("TTPSystemAPIInit@6a08.reportBizError$1");
        return c189200o6M1boximpl;
    }

    public static final Object call$1(ACallableS69S1200000_13 aCallableS69S1200000_13) {
        C1C7U.LIZ("SkylightStoryCollectionDao_Impl@3eab.updateUserStory$1");
        InterfaceC796340VLs interfaceC796340VLsAcquire = ((C796490VMh) aCallableS69S1200000_13.l2).LJ.acquire();
        C726930SfL c726930SfL = ((C796490VMh) aCallableS69S1200000_13.l2).LIZLLL;
        UserStory userStory = (UserStory) aCallableS69S1200000_13.l1;
        c726930SfL.getClass();
        String strLIZIZ = C726930SfL.LIZIZ(userStory);
        if (strLIZIZ == null) {
            interfaceC796340VLsAcquire.LLD(1);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(1, strLIZIZ);
        }
        String str = aCallableS69S1200000_13.s0;
        if (str == null) {
            interfaceC796340VLsAcquire.LLD(2);
        } else {
            interfaceC796340VLsAcquire.LJIILIIL(2, str);
        }
        ((C796490VMh) aCallableS69S1200000_13.l2).LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            ((C796490VMh) aCallableS69S1200000_13.l2).LIZ.setTransactionSuccessful();
            Unit unit = Unit.LIZ;
            ((C796490VMh) aCallableS69S1200000_13.l2).LIZ.endTransaction();
            ((C796490VMh) aCallableS69S1200000_13.l2).LJ.release(interfaceC796340VLsAcquire);
            C1C7U.LIZIZ("SkylightStoryCollectionDao_Impl@3eab.updateUserStory$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C796490VMh) aCallableS69S1200000_13.l2).LIZ.endTransaction();
            ((C796490VMh) aCallableS69S1200000_13.l2).LJ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public ACallableS69S1200000_13(String str, Object obj, Object obj2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
