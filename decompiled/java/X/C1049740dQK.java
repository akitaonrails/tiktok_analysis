package X;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0dQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049740dQK extends AbstractC1049690dQF {
    @Override // X.AbstractC1049690dQF
    public final void LIZIZ() {
        InterfaceC1049750dQL interfaceC1049750dQLLIZ;
        Map<String, Object> map = this.LIZLLL;
        if (map == null || map.size() <= 0) {
            return;
        }
        String strValueOf = String.valueOf(this.LIZLLL.get("name"));
        C1049840dQU c1049840dQU = this.LIZIZ.LLLLZLLLI;
        if (c1049840dQU == null || (interfaceC1049750dQLLIZ = c1049840dQU.LIZ(strValueOf)) == null) {
            return;
        }
        interfaceC1049750dQLLIZ.LIZIZ(strValueOf);
    }

    public C1049740dQK(C19JH c19jh, String str, C1050000dQk c1050000dQk) {
        super(c19jh, str, c1050000dQk);
        new CopyOnWriteArrayList();
    }
}
