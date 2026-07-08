package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210481BfK implements InterfaceC2211041BgE {
    public final CopyOnWriteArraySet<InterfaceC2211041BgE> LIZ = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC2211041BgE
    public final void LIZJ(JSONObject jSONObject, boolean z) {
        Iterator<InterfaceC2211041BgE> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(jSONObject, z);
        }
    }

    @Override // X.InterfaceC2211041BgE
    public final void LIZIZ(String str, String str2, String str3) {
        Iterator<InterfaceC2211041BgE> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(str, str2, str3);
        }
    }

    @Override // X.InterfaceC2211041BgE
    public final void LIZ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        Iterator<InterfaceC2211041BgE> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str, str2, str3, str4, z, str5, str6);
        }
    }
}
