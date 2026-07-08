package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vlj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807330Vlj implements IAwemeTraceLogAdapter {
    public static final C807330Vlj LIZIZ = new C807330Vlj();
    public final /* synthetic */ IAwemeTraceLogAdapter LIZ = (IAwemeTraceLogAdapter) ServiceManager.get().getService(IAwemeTraceLogAdapter.class);

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZIZ(JSONObject jSONObject, String str, boolean z) {
        this.LIZ.LIZIZ(jSONObject, str, z);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZJ(int i, String str, String str2, long j, String str3) {
        this.LIZ.LIZJ(i, str, str2, j, str3);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZLLL(String str, JSONObject jSONObject) {
        this.LIZ.LIZLLL(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LJFF(String str) {
        return this.LIZ.LJFF(str);
    }
}
