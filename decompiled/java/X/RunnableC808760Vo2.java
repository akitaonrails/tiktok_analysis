package X;

import android.util.Pair;
import com.bytedance.push.PushBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Vo2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC808760Vo2 implements Runnable {
    public final PushBody LL;
    public final int LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("UploadFilterEventTask@c5a.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UploadFilterEventTask@c5a.run");
    }

    public final void LIZ() {
        String secUid;
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        InterfaceC809060VoW interfaceC809060VoW = c809030VoT.LIZIZ.LJIJJ;
        String str = this.LL.targetSecUid;
        C808830Vo9 c808830Vo9LIZIZ = C808840VoA.LIZIZ(this.LLILLJJLI, C809360Vp0.LIZ);
        String str2 = "";
        String str3 = c808830Vo9LIZIZ != null ? c808830Vo9LIZIZ.LIZLLL : "";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("token info = ");
        sbLIZ.append(c808830Vo9LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC809060VoW != null && (secUid = interfaceC809060VoW.getSecUid()) != null) {
            str2 = secUid;
        }
        String strLIZ = C1128604bE.LIZ("/cloudpush/user_push_replace/");
        C0V4R.LIZIZ(strLIZ, c809030VoT.LJI());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("ttpush_sec_target_uid", str));
        arrayList.add(new Pair("local_sec_uid", str2));
        arrayList.add(new Pair("send_sdk", String.valueOf(this.LLILLJJLI)));
        arrayList.add(new Pair("token", str3));
        arrayList.add(new Pair("rid64", String.valueOf(this.LL.rid64)));
        try {
            String strLIZJ = AbstractC808800Vo6.LIZ.LIZJ(strLIZ, arrayList);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("upload filter event. result = ");
            sbLIZ2.append(strLIZJ);
            C2188811AlT.LIZIZ(sbLIZ2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("upload filter event. result = ");
            sbLIZ3.append(th);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
    }

    public RunnableC808760Vo2(int i, PushBody pushBody) {
        this.LLILLJJLI = i;
        this.LL = pushBody;
    }
}
