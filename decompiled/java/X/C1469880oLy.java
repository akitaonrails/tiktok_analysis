package X;

import com.ss.mediakit.net.AVMDLNetClient;
import com.ss.mediakit.net.Error;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469880oLy implements InterfaceC1469850oLv {
    public final /* synthetic */ AVMDLNetClient.CompletionListener LIZ;

    public C1469880oLy(AVMDLNetClient.CompletionListener completionListener) {
        this.LIZ = completionListener;
    }

    @Override // X.InterfaceC1469850oLv
    public final void LIZ(JSONObject jSONObject, C1472240oPm c1472240oPm) {
        if (c1472240oPm != null) {
            this.LIZ.onCompletion(null, new Error(c1472240oPm.code, "", c1472240oPm.toString()));
        } else {
            this.LIZ.onCompletion(jSONObject, null);
        }
    }
}
