package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS623S0100000_9;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600230NgT {
    public static void LIZ(JSONObject jSONObject, Function1 function1) {
        String strOptString;
        String strOptString2;
        if (jSONObject == null) {
            strOptString = null;
            strOptString2 = null;
        } else {
            try {
                strOptString = jSONObject.optString("ay_topic_id", "");
                strOptString2 = jSONObject.optString("ay_topic_text", "");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                function1.invoke(null);
                return;
            }
        }
        if (C123100dR.LIZ(strOptString)) {
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
            if (iUnKnownOwnershipBusinessOuterService != null) {
                iUnKnownOwnershipBusinessOuterService.LJJI(CastLongProtector.parseLong(strOptString), new AwS623S0100000_9(function1, (Function1<? super AddYourRecordParam, Unit>) 15));
                return;
            }
            return;
        }
        if (C123100dR.LIZ(strOptString2)) {
            function1.invoke(new AddYourRecordParam(new AddYoursStickerStruct(null, null, strOptString2, 0, null, null, null, null, null, System.currentTimeMillis(), 14.0f, Boolean.FALSE, null, 0), false, false, null, null, null, null, true, false, null, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, true, false));
        } else {
            function1.invoke(null);
        }
    }
}
