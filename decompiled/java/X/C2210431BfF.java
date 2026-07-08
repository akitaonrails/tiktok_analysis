package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210431BfF implements InterfaceC2211051BgF {
    public final CopyOnWriteArraySet<InterfaceC2211051BgF> LIZ = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC2211051BgF
    public final void LIZIZ(long j, String str) {
        Iterator<InterfaceC2211051BgF> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(j, str);
        }
    }

    @Override // X.InterfaceC2211051BgF
    public final void LIZ(String str, long j, JSONObject jSONObject) {
        Iterator<InterfaceC2211051BgF> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str, j, jSONObject);
        }
    }

    @Override // X.InterfaceC2211051BgF
    public final void LIZJ(String str, long j, JSONObject jSONObject) {
        Iterator<InterfaceC2211051BgF> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(str, j, jSONObject);
        }
    }
}
