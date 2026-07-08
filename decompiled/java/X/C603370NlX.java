package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603370NlX implements InterfaceC591550NIb {
    public final Function2<String, String, Boolean> LIZ;
    public final List<InterfaceC603390NlZ> LIZIZ;

    public C603370NlX(C600080NgE c600080NgE) {
        this.LIZ = c600080NgE;
        final C603350NlV c603350NlV = new C603350NlV(this);
        final C603360NlW c603360NlW = new C603360NlW(this);
        this.LIZIZ = C1697810uHb.LJIIJJI(new InterfaceC603390NlZ(c603350NlV) { // from class: X.0NlY
            public final Function2<String, String, Unit> LIZ;
            public int LIZIZ = -1;
            public long LIZJ;
            public int LIZLLL;

            @Override // X.InterfaceC603390NlZ
            public final void LIZ(C603460Nlg c603460Nlg) {
            }

            @Override // X.InterfaceC603390NlZ
            public final void reset() {
                this.LIZLLL = 0;
                this.LIZJ = 0L;
            }

            {
                this.LIZ = c603350NlV;
            }

            @Override // X.InterfaceC603390NlZ
            public final void LIZIZ(int i, String str) {
                if (i <= 1) {
                    reset();
                }
                if (this.LIZIZ > i) {
                    reset();
                    this.LIZIZ = i;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.LIZJ;
                if (j > 0 && jCurrentTimeMillis - j <= 2000) {
                    int i2 = this.LIZLLL + 1;
                    this.LIZLLL = i2;
                    if (i2 >= 3) {
                        this.LIZ.invoke("FastSkip", str);
                    }
                } else {
                    this.LIZLLL = 0;
                }
                this.LIZJ = jCurrentTimeMillis;
            }
        }, new InterfaceC603390NlZ(c603360NlW) { // from class: X.0Nlh
            public final Function2<String, String, Unit> LIZ;
            public final C823170WQx<String> LIZIZ = new C823170WQx<>();

            @Override // X.InterfaceC603390NlZ
            public final void LIZIZ(int i, String str) {
            }

            @Override // X.InterfaceC603390NlZ
            public final void reset() {
                this.LIZIZ.clear();
            }

            {
                this.LIZ = c603360NlW;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
            @Override // X.InterfaceC603390NlZ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C603460Nlg r5) {
                /*
                    Method dump skipped, instruction units count: 216
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C603470Nlh.LIZ(X.0Nlg):void");
            }
        });
    }

    @Override // X.InterfaceC591550NIb
    public final void LIZ(InterfaceC582850MtX interfaceC582850MtX) {
        String value;
        if (!(interfaceC582850MtX instanceof C603460Nlg)) {
            return;
        }
        C603460Nlg c603460Nlg = (C603460Nlg) interfaceC582850MtX;
        if (c603460Nlg.LIZIZ.LIZIZ()) {
            value = c603460Nlg.LIZIZ.getValue("enter_from");
        } else {
            value = c603460Nlg.LIZIZ.getValue("enter_from_merge");
        }
        if (!Intrinsics.LJFF(value, "homepage_hot")) {
            return;
        }
        Iterator<InterfaceC603390NlZ> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c603460Nlg);
        }
    }
}
