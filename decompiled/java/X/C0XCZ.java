package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0XCZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCZ implements C0XD4 {
    public final CopyOnWriteArraySet<C0XD4> LIZ = new CopyOnWriteArraySet<>();

    @Override // X.C0XD4
    public final void LIZIZ(String str, String str2, String str3) {
        Iterator<C0XD4> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(str, str2, str3);
        }
    }

    @Override // X.C0XD4
    public final void LIZ(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        Iterator<C0XD4> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str, str2, str3, str4, z, str5, str6);
        }
    }
}
