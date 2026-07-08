package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03dU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C887803dU extends C09AY implements Function2<C03XW, JSONObject, Unit> {
    public final /* synthetic */ CCDCAddCardAssem LL;
    public final /* synthetic */ C948003nC<String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C887803dU(CCDCAddCardAssem cCDCAddCardAssem, C948003nC<String> c948003nC, String str) {
        super(2);
        this.LL = cCDCAddCardAssem;
        this.LLILLJJLI = c948003nC;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03XW c03xw, JSONObject jSONObject) {
        Object obj;
        int iIntValue;
        String strOptString;
        CCDCAddCardHalfFragment cCDCAddCardHalfFragmentOo;
        String str;
        HashMap<String, Object> map;
        EnterParams enterParams = this.LL.So().LLILLJJLI;
        Integer num = null;
        if (enterParams != null && (map = enterParams.trackParams) != null) {
            obj = map.get("sea_one_step_type");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        try {
            C948003nC<String> c948003nC = this.LLILLJJLI;
            if (c948003nC == null || (str = c948003nC.LIZ) == null) {
                str = "{}";
            }
            strOptString = new JSONObject(str).optString("oe_code");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            strOptString = "";
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        String str2 = "ErrorCode actionOE: " + strOptString + " errMsg: " + this.LLILLL;
        c2341109Fh.getClass();
        C2341109Fh.LIZ(str2);
        if (strOptString == null || strOptString.length() == 0) {
            strOptString = this.LLILLL;
        }
        if (C123100dR.LIZ(strOptString) && iIntValue <= 0) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ccdc_bind_error_settings", true) && !C890303dt.LIZ().containsKey(strOptString) && (cCDCAddCardHalfFragmentOo = this.LL.Oo()) != null) {
                cCDCAddCardHalfFragmentOo.cS();
            }
        }
        return Unit.LIZ;
    }
}
