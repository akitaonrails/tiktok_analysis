package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.053O, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053O extends C09AY implements Function0<C053S<? extends Object>> {
    public final /* synthetic */ C053V LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C053O(C053V c053v) {
        super(0);
        this.LL = c053v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C053S<? extends Object> invoke() {
        if (C053V.LJ(this.LL.LIZIZ)) {
            return C053A.LIZLLL;
        }
        C053W c053w = this.LL.LIZ;
        final AnonymousClass0531 anonymousClass0531 = new AnonymousClass0531(c053w.LIZ, c053w.LIZJ.getTag(), c053w.LIZLLL.getTag(), c053w.LIZIZ, EnumC12933054h.FREQUENCY_RULE);
        C053Z c053z = c053w.LIZJ;
        if (c053z instanceof C12900053a) {
            final C12900053a c12900053a = (C12900053a) c053z;
            return new C053H<C12900053a, InterfaceC12901053b, Long>(c12900053a, anonymousClass0531) { // from class: X.053M
                public final C01GW LIZLLL;

                @Override // X.C053S
                public final C053I<Long> LJ() {
                    return (C053I) this.LIZLLL.getValue();
                }

                @Override // X.C053S
                public final void LJFF(String str) {
                    String strLJIIIZ = LJIIIZ(str);
                    Pair<Boolean, Long> pairLJII = LJII(str);
                    boolean zBooleanValue = pairLJII.getFirst().booleanValue();
                    long jLongValue = pairLJII.getSecond().longValue();
                    if (!zBooleanValue) {
                        return;
                    }
                    LJIIIIZZ().LJFF(String.valueOf(jLongValue), strLJIIIZ);
                }

                {
                    this.LIZLLL = C452501pT.LIZIZ(new AwS546S0100000_2(anonymousClass0531, 986));
                }

                @Override // X.C053H, X.C053S
                public final boolean LJI(long j, String str) {
                    Pair<Boolean, Long> pairLJII = LJII(str);
                    boolean zBooleanValue = pairLJII.getFirst().booleanValue();
                    pairLJII.getSecond().longValue();
                    if (!zBooleanValue) {
                        return false;
                    }
                    this.LIZ.getClass();
                    this.LIZ.getClass();
                    throw null;
                }

                @Override // X.C053S
                public final void LIZIZ(long j, long j2, String str) {
                    if (LJII(str).getFirst().booleanValue()) {
                        return;
                    }
                    LJ().LJFF(Long.valueOf(j), str);
                }
            };
        }
        if (c053z instanceof C12912053m) {
            return new C053F((C12912053m) c053z, anonymousClass0531);
        }
        if (c053z instanceof C12909053j) {
            return new C053N((C12909053j) c053z, anonymousClass0531);
        }
        if (c053z instanceof C12908053i) {
            return new C053L((C12908053i) c053z, anonymousClass0531);
        }
        if (c053z instanceof C12910053k) {
            return new C053D((C12910053k) c053z, anonymousClass0531);
        }
        if (c053z instanceof C12907053h) {
            return C053A.LIZLLL;
        }
        if (c053z instanceof C12911053l) {
            return C053A.LIZLLL;
        }
        throw new C1954807lC();
    }
}
