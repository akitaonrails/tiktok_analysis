package X;

import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0JKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490290JKp {
    public static final C490290JKp LIZ = new C490290JKp();

    public static GetSubInfoResponse LIZ(n nVar) {
        return (GetSubInfoResponse) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, nVar.toString(), GetSubInfoResponse.class);
    }
}
