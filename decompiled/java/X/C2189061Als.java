package X;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Als, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2189061Als implements C08JP {
    public final /* synthetic */ InterfaceC2189151Am1 LIZ;

    public C2189061Als(InterfaceC2189151Am1 interfaceC2189151Am1) {
        this.LIZ = interfaceC2189151Am1;
    }

    public final void LIZ(String str, String str2, JSONObject jSONObject) {
        InterfaceC2189151Am1 interfaceC2189151Am1 = this.LIZ;
        if (interfaceC2189151Am1 != null) {
            C2189101Alw c2189101Alw = (C2189101Alw) interfaceC2189151Am1;
            WeakReference<InterfaceC2188801AlS> weakReference = c2189101Alw.LIZ.mVEApplogListener;
            if (weakReference != null && weakReference.get() != null) {
                c2189101Alw.LIZ.mVEApplogListener.get().LIZ(str, jSONObject);
            }
        }
    }
}
