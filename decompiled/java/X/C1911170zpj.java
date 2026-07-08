package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911170zpj implements C0WNJ {
    @Override // X.C0WNJ
    public final void LIZ(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(UriProtector.parse(str));
            intent.putExtra("pns.sandbox.dataflow_id", 1207969291);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyUc8nCTCgu6tyLzFKCahlgTz7MHV9OcoPs86MiY2dv8Y/Wl+5fD1kJjarhRM7D42OZp2Teq6jHDcZUkMQN", null));
        } catch (ActivityNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0WNJ
    public final void LIZIZ(Context context, int i, String str) {
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = str;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(i);
        C1554300qY8.LIZIZ(context, sparkThirdContext);
    }

    @Override // X.C0WNJ
    public final void LIZJ(Context context, final int i, String str, final boolean z) {
        new C828330WeV(new ThirdPartyBizCert(i)).LIZIZ(context, str, new InterfaceC828360WeY() { // from class: X.0zpk
            @Override // X.InterfaceC828360WeY
            public final void LIZ(Context context2, String str2) {
                if (!z) {
                    SparkThirdContext sparkThirdContext = new SparkThirdContext();
                    sparkThirdContext.url = str2;
                    sparkThirdContext.bizCert = new ThirdPartyBizCert(i);
                    C1554300qY8.LIZIZ(context2, sparkThirdContext);
                    return;
                }
                this.LIZ(context2, str2);
            }
        }, null);
    }

    @Override // X.C0WNJ
    public final void LIZLLL(Context context, String str, int i, String str2) {
        C1545480qJu c1545480qJu = C1545480qJu.LIZ;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        c1545480qJu.getClass();
        SparkPopupSchemaParam sparkPopupSchemaParamLIZ = C1545480qJu.LIZ(str2, null, null, strValueOf);
        try {
            SparkThirdContext sparkThirdContext = new SparkThirdContext();
            sparkThirdContext.url = str;
            sparkThirdContext.popupSchemaParam = sparkPopupSchemaParamLIZ;
            sparkThirdContext.bizCert = new ThirdPartyBizCert(i);
            C1554300qY8.LIZJ((C19EG) context, sparkThirdContext);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
