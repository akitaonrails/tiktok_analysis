package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.activestatus.api.network.Result;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: X.0Oz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637230Oz3 {
    public static final /* synthetic */ int LIZ = 0;

    public static C595220NWe LIZ(long j, List list, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error! uuid ");
        sbLIZ.append(UUID.randomUUID());
        C2188811AlT.LIZIZ(sbLIZ);
        System.currentTimeMillis();
        return new C595220NWe(i, i, list);
    }

    public static C595220NWe LIZIZ(Result result, long j, List list) {
        BaseResponse.ServerTimeExtra serverTimeExtra = result.extra;
        int i = result.status_code;
        int i2 = result.error_code;
        System.currentTimeMillis();
        e eVar = new e();
        eVar.LJIILIIL = true;
        GsonProtectorUtils.toJson(eVar.LIZ(), result.activityStatuses);
        return new C595220NWe(i, i2, list);
    }
}
