package X;

import X.C161R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1634, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1634<DATA extends C161R> extends AnonymousClass1635<C207107162n<DATA>, DATA> implements InterfaceC585880MyQ {
    public final Function1<DATA, Unit> LJIIJ;

    @Override // X.InterfaceC585880MyQ
    public final void LIZ(String str) {
    }

    @Override // X.AnonymousClass1637
    public final C164G LIZJ() {
        return this.LIZIZ.LIZLLL();
    }

    @Override // X.AnonymousClass1635
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
        if (!this.LIZIZ.LIZIZ()) {
            this.LIZIZ.LIZ();
        }
    }

    public AnonymousClass1634(EnumC207101162h enumC207101162h, C207107162n c207107162n, C161Q c161q, C0S5Z c0s5z) {
        super(c207107162n, c161q);
        this.LJIIJ = c0s5z;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AnonymousClass1637
    public final C164G LIZIZ(C0S5Q c0s5q, C0S5Q c0s5q2, Aweme aweme, EnumC715680S5m enumC715680S5m) {
        C0S5P c0s5p = (C0S5P) c0s5q;
        C0S5P c0s5p2 = (C0S5P) c0s5q2;
        Aweme aweme2 = aweme;
        C0SKK c0skk = null;
        if (aweme2 != null) {
            int i = C0SBB.LIZ[c0s5p.LIZ.ordinal()];
            boolean z = true;
            if (i != 1 && i != 2) {
                if (i != 3 && i == 4) {
                    aweme2.getAid();
                    AnonymousClass1644 anonymousClass1644 = new AnonymousClass1644(true);
                    ((C207107162n) this.LIZ).LJIIL(aweme2, anonymousClass1644);
                    C161R c161r = anonymousClass1644.LIZIZ;
                    if (c161r != null) {
                        this.LJIIJ.invoke((DATA) c161r);
                        return c161r;
                    }
                }
            } else {
                if (c0s5p2 != null) {
                    c0skk = c0s5p2.LIZ;
                }
                if (c0skk == C0SKK.TRANSLATED || !this.LIZIZ.LIZIZ()) {
                    z = false;
                }
                aweme2.getAid();
                AnonymousClass1644 anonymousClass16442 = new AnonymousClass1644(z);
                ((C207107162n) this.LIZ).LJIIL(aweme2, anonymousClass16442);
                return anonymousClass16442.LIZIZ;
            }
        }
        return null;
    }
}
