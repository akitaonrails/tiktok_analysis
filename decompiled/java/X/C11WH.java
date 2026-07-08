package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11WH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11WH extends C11WF {
    public final C00F5 LJIIIZ;
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public String LJIIL = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11WH) && this.LJIIIZ == ((C11WH) obj).LJIIIZ;
    }

    public final int hashCode() {
        return this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorCreateData(type=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C11WH(C00F5 c00f5) {
        this.LJIIIZ = c00f5;
    }

    @Override // X.C11WF
    public final void LIZ(Intent intent) {
        String stringExtra;
        String stringExtra2;
        super.LIZ(intent);
        String stringExtra3 = null;
        try {
            stringExtra = intent.getStringExtra("anchor_keyword");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        this.LJIIJJI = stringExtra;
        try {
            stringExtra2 = intent.getStringExtra("anchor_consume_url");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        this.LJIIJ = stringExtra2;
        try {
            stringExtra3 = intent.getStringExtra("anchor_content");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        this.LJIIL = stringExtra3;
    }
}
