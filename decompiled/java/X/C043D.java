package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.UserVirtualInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecipientInfo;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.043D, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043D {
    public RecipientInfo LIZ;

    public final UserVirtualInfo LIZ() {
        String recipientData;
        RecipientInfo recipientInfo = this.LIZ;
        if (recipientInfo == null || (recipientData = recipientInfo.getRecipientData()) == null) {
            return null;
        }
        return new UserVirtualInfo(null, recipientData);
    }

    public final boolean LIZJ() {
        Boolean boolIsValid;
        RecipientInfo recipientInfo = this.LIZ;
        if (recipientInfo == null || (boolIsValid = recipientInfo.isValid()) == null) {
            return false;
        }
        return boolIsValid.booleanValue();
    }

    public final boolean LIZLLL() {
        return this.LIZ != null;
    }

    public final void LIZIZ(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_recipient_data_update")) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                LJ(jSONObject.optString("data", ""), jSONObject.optBoolean("validated", false));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_JSON_PARSE, e, null);
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parase EC_RECIPIENT_DATA_UPDATE event params error: ");
                sbLIZ.append(e.getStackTrace());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZJ(strLIZIZ);
            }
        }
    }

    public final void LJ(String str, boolean z) {
        RecipientInfo recipientInfoCopy;
        RecipientInfo recipientInfo = this.LIZ;
        if (recipientInfo != null) {
            recipientInfoCopy = recipientInfo.copy(recipientInfo.schema, str, Boolean.valueOf(z), recipientInfo.nodeId);
        } else {
            recipientInfoCopy = null;
        }
        this.LIZ = recipientInfoCopy;
    }
}
