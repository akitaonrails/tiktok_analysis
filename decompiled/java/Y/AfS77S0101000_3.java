package Y;

import X.C09JN;
import X.C1632470saD;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C23055091p;
import kotlin.Pair;
import wuk.f;

/* JADX INFO: loaded from: classes4.dex */
public class AfS77S0101000_3 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS77S0101000_3 afS77S0101000_3, Object obj) {
        C1C7U.LIZ("DefaultStickerRepository@bad7.legacyFetchHorizontalEffectsData$5");
        C1632470saD c1632470saD = C1632470saD.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchHorizontalEffectsData: scene = ");
        sbLIZ.append(afS77S0101000_3.i1);
        sbLIZ.append(", dataStatus = ");
        sbLIZ.append(obj);
        C201955140j.LIZLLL(c1632470saD, "effect_request_chine_tag", C2188811AlT.LIZIZ(sbLIZ));
        ((f) afS77S0101000_3.l0).LJJIFFI.onNext(obj);
        C1C7U.LIZIZ("DefaultStickerRepository@bad7.legacyFetchHorizontalEffectsData$5");
    }

    public static final void accept$1(AfS77S0101000_3 afS77S0101000_3, Object obj) {
        C1C7U.LIZ("DefaultStickerRepository@bad7.legacyFetchPanelInfo$1");
        ((f) afS77S0101000_3.l0).LJJI.onNext(new Pair<>(Integer.valueOf(afS77S0101000_3.i1), new C23055091p(0)));
        C1C7U.LIZIZ("DefaultStickerRepository@bad7.legacyFetchPanelInfo$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS77S0101000_3(int r2, wuk.f r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.l0 = r3
            r0.i1 = r2
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.i1 = r2
            r0.l0 = r3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS77S0101000_3.<init>(int, wuk.f, int):void");
    }
}
