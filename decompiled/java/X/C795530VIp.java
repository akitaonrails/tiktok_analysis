package X;

import Y.ACallableS245S0200000_13;
import Y.ACallableS96S0101000_13;
import android.os.CancellationSignal;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795530VIp implements InterfaceC611450NyZ {
    public final AbstractC796540VMm LIZ;
    public final C0P49 LIZIZ;
    public final C795540VIq LIZJ = new Object() { // from class: X.0VIq
    };
    public final C854550Xfh LIZLLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VIq] */
    public C795530VIp(AbstractC796540VMm abstractC796540VMm) {
        this.LIZ = abstractC796540VMm;
        this.LIZIZ = new C0P49(this, abstractC796540VMm, 4);
        this.LIZLLL = new C854550Xfh(abstractC796540VMm, 75);
    }

    @Override // X.InterfaceC611450NyZ
    public final Object LIZ(C611460Nya c611460Nya) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT COUNT(*) FROM ai_quick_reply");
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 52), c611460Nya);
    }

    @Override // X.InterfaceC611450NyZ
    public final Object LIZLLL(C611460Nya c611460Nya) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS96S0101000_13(this, 1), c611460Nya);
    }

    @Override // X.InterfaceC611450NyZ
    public final Object LIZIZ(String str, InterfaceC1364105Vn<? super List<C611470Nyb>> interfaceC1364105Vn) {
        C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM ai_quick_reply WHERE uid = ?");
        if (str == null) {
            c0vn5LIZLLL.LLD(1);
        } else {
            c0vn5LIZLLL.LJIILIIL(1, str);
        }
        return C824670WWr.LIZIZ(this.LIZ, new CancellationSignal(), new ACallableS245S0200000_13(this, c0vn5LIZLLL, 51), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC611450NyZ
    public final Object LIZJ(C611470Nyb c611470Nyb, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C824670WWr.LIZJ(this.LIZ, new ACallableS245S0200000_13(this, c611470Nyb, 50), interfaceC1364105Vn);
    }
}
