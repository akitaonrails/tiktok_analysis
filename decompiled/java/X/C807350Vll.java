package X;

import com.ss.android.ugc.aweme.trace.IPageTraceApi;
import com.ss.android.ugc.aweme.trace.PageTraceApiImpl;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807350Vll implements IPageTraceApi {
    public static final C807350Vll LIZIZ = new C807350Vll();
    public final /* synthetic */ IPageTraceApi LIZ;

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final String LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LIZJ(C807320Vli c807320Vli, JSONObject jSONObject) {
        this.LIZ.LIZJ(c807320Vli, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LIZLLL(C807320Vli c807320Vli, JSONObject jSONObject) {
        this.LIZ.LIZLLL(c807320Vli, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final Pair<String, String> LJ(String str) {
        return this.LIZ.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJFF(C807320Vli c807320Vli, JSONObject jSONObject) {
        this.LIZ.LJFF(c807320Vli, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IPageTraceApi
    public final void LJI(C807320Vli c807320Vli, JSONObject jSONObject) {
        this.LIZ.LJI(c807320Vli, jSONObject);
    }

    public C807350Vll() {
        IPageTraceApi iPageTraceApi;
        Object objLIZ = C04TD.LIZ(IPageTraceApi.class, false);
        if (objLIZ != null) {
            iPageTraceApi = (IPageTraceApi) objLIZ;
        } else {
            if (C04TD.O5 == null) {
                synchronized (IPageTraceApi.class) {
                    if (C04TD.O5 == null) {
                        C04TD.O5 = new PageTraceApiImpl();
                    }
                }
            }
            iPageTraceApi = C04TD.O5;
        }
        this.LIZ = iPageTraceApi;
    }
}
