package X;

import Y.ARunnableS110S0100000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644620PQe implements InterfaceC791210V1z {
    public final /* synthetic */ C664570Q4x LL;

    public C644620PQe(C664570Q4x c664570Q4x) {
        this.LL = c664570Q4x;
    }

    @Override // X.InterfaceC791210V1z
    public final void LIZLLL(JSONObject jSONObject) {
        if (jSONObject != null) {
            C736480Suk c736480Suk = new C736480Suk();
            if (this.LL.LJ.size() > 0) {
                for (String str : this.LL.LJ.keySet()) {
                    c736480Suk.LIZ(str, this.LL.LJ.get(str));
                }
            }
            C823050WQl.LIZIZ().execute(new ARunnableS110S0100000_10(jSONObject, 4));
        }
    }
}
