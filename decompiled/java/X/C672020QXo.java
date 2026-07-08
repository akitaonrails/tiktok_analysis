package X;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.0QXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672020QXo implements InterfaceC2753014t {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public C0QYA LL;

    public final void LIZ() {
        for (C0QYA c0qya = this.LL; c0qya != null; c0qya = c0qya.LIZ) {
            C0QYA c0qya2 = c0qya.LIZ;
            if (c0qya2 != null && c0qya2.LIZIZ) {
                if ((c0qya2 != null ? c0qya2.LJ : null) == C0QUV.RESULT) {
                    c0qya.LIZ = null;
                }
            }
        }
    }

    public final String LIZIZ() {
        C0QYA c0qya = this.LL;
        String str = "";
        boolean z = false;
        for (int i = 0; c0qya != null && i < 70; i++) {
            C0QUV c0quv = c0qya.LJ;
            if (c0quv == C0QUV.SUGGEST || c0quv == C0QUV.SUG) {
                z = true;
            } else {
                if (!z) {
                    continue;
                }
                c0qya = c0qya.LIZ;
            }
            if (c0qya.LIZJ) {
                String str2 = c0qya.LJFF;
                if (C123100dR.LIZ(str2) && str2 != null) {
                    str = str2;
                }
            }
            if (c0qya.LJ == C0QUV.RESULT) {
                break;
            }
            c0qya = c0qya.LIZ;
        }
        return str;
    }

    public C672020QXo() {
        UUID.randomUUID().toString();
    }

    public final void LIZJ(String str) {
        C0QYA c0qya = new C0QYA(false, true, false, null, str, null, null, 200);
        C0QYA c0qya2 = this.LL;
        if (c0qya2 == null) {
            this.LL = c0qya;
        } else {
            c0qya.LIZ = c0qya2;
            this.LL = c0qya;
        }
    }

    public final void LJFF(C0QUV c0quv) {
        C0QYA c0qya = new C0QYA(true, false, false, c0quv, null, null, null, 200);
        C0QYA c0qya2 = this.LL;
        if (c0qya2 == null) {
            this.LL = c0qya;
        } else {
            c0qya.LIZ = c0qya2;
            this.LL = c0qya;
        }
    }

    public final void LJ(C0QUV c0quv, Map<String, String> map) {
        C0QYA c0qya = new C0QYA(false, false, true, null, null, c0quv, map, 55);
        C0QYA c0qya2 = this.LL;
        if (c0qya2 == null) {
            this.LL = c0qya;
        } else {
            c0qya.LIZ = c0qya2;
            this.LL = c0qya;
        }
    }
}
