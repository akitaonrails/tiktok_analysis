package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.bdturing.verify.RiskControlService;
import com.bytedance.bdturing.verify.TwiceVerifyService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202178148y {
    public static EnumC1494380ozU LJFF;
    public AnonymousClass1490 LIZ;
    public boolean LIZIZ;
    public RiskControlService LIZJ;
    public final HashMap<String, AnonymousClass1493> LIZLLL = new HashMap<>();
    public long LJ = 0;

    public final void LIZLLL() {
        RiskControlService riskControlService = new RiskControlService();
        this.LIZJ = riskControlService;
        LIZ(riskControlService);
        LIZ(new TwiceVerifyService());
        try {
            LIZ((AnonymousClass1493) Class.forName("com.bytedance.bdturing.verify.IdentityService").newInstance());
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20221514Aj.LIZIZ();
        } catch (InstantiationException e3) {
            TryCatchGuardChecker.doCheck(e3);
            C20221514Aj.LIZIZ();
        }
    }

    public static void LIZIZ(AnonymousClass1490 anonymousClass1490) {
        if (anonymousClass1490 != null && anonymousClass1490.LJIIJJI != null) {
            if (anonymousClass1490.LJIIZILJ == null) {
                try {
                    anonymousClass1490.LJIIZILJ = (InterfaceC2202808k6) Class.forName("com.bytedance.bdturing.ttnet.TTNetHttpClient").getConstructor(Context.class).newInstance(anonymousClass1490.LJIIJJI);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (anonymousClass1490.LJIIZILJ != null && anonymousClass1490.LJIILLIIL != null) {
                return;
            } else {
                throw new RuntimeException("httpClient or eventClient is null");
            }
        }
        throw new RuntimeException("config or applicationContext is null");
    }

    public final void LIZ(AnonymousClass1493 anonymousClass1493) {
        if (this.LIZLLL.containsKey(anonymousClass1493.getClass().getName())) {
            return;
        }
        this.LIZLLL.put(anonymousClass1493.getClass().getName(), anonymousClass1493);
    }

    public final boolean LIZJ(Activity activity, InterfaceC202160148g interfaceC202160148g) {
        boolean z;
        if (this.LIZIZ && activity != null) {
            if (System.currentTimeMillis() - this.LJ < 500) {
                z = true;
            } else {
                z = false;
            }
            this.LJ = System.currentTimeMillis();
            if (!z) {
                return true;
            }
            interfaceC202160148g.onFail(LSPassThroughRecordSizeConfig.DEFAULT);
            return false;
        }
        interfaceC202160148g.onFail(2);
        return false;
    }

    public final void LJ(Activity activity, C149E c149e, InterfaceC202160148g interfaceC202160148g) {
        c149e.getType();
        if (!LIZJ(activity, interfaceC202160148g)) {
            return;
        }
        c149e.getType();
        if (LJFF == null) {
            LJFF = EnumC1494380ozU.POPCAPTCHA_V2;
        }
        LJFF(activity, c149e, interfaceC202160148g);
    }

    public final void LJFF(Activity activity, AbstractC202165148l abstractC202165148l, InterfaceC202160148g interfaceC202160148g) {
        int value = -1;
        if (abstractC202165148l instanceof C149E) {
            try {
                String riskInfo = ((C149E) abstractC202165148l).getRiskInfo();
                C202179148z.LIZIZ = "";
                JSONObject jSONObject = new JSONObject(riskInfo);
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("log_id");
                jSONObject2.put("log_id", strOptString);
                jSONObject2.put("detail", jSONObject.optString("detail"));
                C202179148z.LIZJ = strOptString;
                C202179148z.LIZLLL = jSONObject.optString("detail");
                String strJ3 = C786410Ut5.J3(jSONObject2);
                EnumC1494380ozU enumC1494380ozU = LJFF;
                if (enumC1494380ozU != null) {
                    value = enumC1494380ozU.getValue();
                }
                C202179148z.LIZLLL(value, strJ3);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C20221514Aj.LIZIZ();
            }
        } else {
            EnumC1494380ozU enumC1494380ozU2 = LJFF;
            if (enumC1494380ozU2 != null) {
                value = enumC1494380ozU2.getValue();
            }
            C202179148z.LIZLLL(value, null);
        }
        abstractC202165148l.setActivity(activity);
        for (AnonymousClass1493 anonymousClass1493 : this.LIZLLL.values()) {
            if (anonymousClass1493.isProcess(abstractC202165148l.getType())) {
                anonymousClass1493.execute(abstractC202165148l, interfaceC202160148g);
                return;
            }
        }
        interfaceC202160148g.onFail(996);
    }
}
