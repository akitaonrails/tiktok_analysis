package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS403S0200000_2;

/* JADX INFO: renamed from: X.053P, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053P extends C09AY implements Function0<C053U<? extends Object>> {
    public final /* synthetic */ C053V LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C053P(C053V c053v) {
        super(0);
        this.LL = c053v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C053U<? extends Object> invoke() {
        if (C053V.LJ(this.LL.LIZIZ)) {
            return new C053J<Unit>() { // from class: X.0537
                public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(785));
                public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(786));

                @Override // X.C053U
                public final boolean LIZIZ(long j, String str) {
                    return false;
                }

                @Override // X.C053U
                public final void LJ(long j, long j2, String str) {
                }

                @Override // X.C053U
                public final C053I<Unit> LIZLLL() {
                    return (C053I) LIZJ.getValue();
                }
            };
        }
        C053W c053w = this.LL.LIZ;
        final AnonymousClass0531 anonymousClass0531 = new AnonymousClass0531(c053w.LIZ, c053w.LIZJ.getTag(), c053w.LIZLLL.getTag(), c053w.LIZIZ, EnumC12933054h.EXIT_RULE);
        InterfaceC12901053b interfaceC12901053b = c053w.LIZLLL;
        if (interfaceC12901053b instanceof C12913053n) {
            final C12913053n c12913053n = (C12913053n) interfaceC12901053b;
            return new C053J<Long>(c12913053n, anonymousClass0531) { // from class: X.053R
                public final C12913053n LIZ;
                public final C01GW LIZIZ;

                @Override // X.C053U
                public final C053I<Long> LIZLLL() {
                    return (C053I) this.LIZIZ.getValue();
                }

                {
                    this.LIZ = c12913053n;
                    this.LIZIZ = C452501pT.LIZIZ(new AwS403S0200000_2(anonymousClass0531, (C053I) null, 45));
                }

                @Override // X.C053U
                public final boolean LIZIZ(long j, String str) {
                    long jLIZIZ;
                    Pair<Boolean, Long> data = LIZLLL().getData(str);
                    boolean zBooleanValue = data.getFirst().booleanValue();
                    long jLongValue = data.getSecond().longValue();
                    if (!zBooleanValue) {
                        return false;
                    }
                    long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    long j3 = j / j2;
                    long j4 = 60;
                    long j5 = (j3 / j4) / j4;
                    C12924053y c12924053y = C12924053y.LIZ;
                    long jLIZIZ2 = C12924053y.LIZIZ(c12924053y, j3, j5);
                    C12913053n c12913053n2 = this.LIZ;
                    if (jLIZIZ2 < c12913053n2.LIZ || jLIZIZ2 > c12913053n2.LIZIZ) {
                        return false;
                    }
                    long j6 = jLongValue / j2;
                    C01GW c01gw = C12924053y.LIZIZ;
                    Long l = (Long) ((ConcurrentHashMap) c01gw.getValue()).get(new Pair(Long.valueOf(j6), Long.valueOf(j5)));
                    if (l != null) {
                        jLIZIZ = l.longValue();
                    } else {
                        jLIZIZ = C12924053y.LIZIZ(c12924053y, j6, j5);
                    }
                    ((ConcurrentHashMap) c01gw.getValue()).put(new Pair(Long.valueOf(j6), Long.valueOf(j5)), Long.valueOf(jLIZIZ));
                    C12913053n c12913053n3 = this.LIZ;
                    if (jLIZIZ < c12913053n3.LIZ || jLIZIZ > c12913053n3.LIZIZ) {
                        return false;
                    }
                    return true;
                }

                @Override // X.C053U
                public final void LJ(long j, long j2, String str) {
                    C12924053y c12924053y = C12924053y.LIZ;
                    long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                    long j4 = j2 / j3;
                    long j5 = 60;
                    long jLIZIZ = C12924053y.LIZIZ(c12924053y, j / j3, (j4 / j5) / j5);
                    C12913053n c12913053n2 = this.LIZ;
                    long j6 = c12913053n2.LIZ;
                    if (jLIZIZ < j6 || jLIZIZ > c12913053n2.LIZIZ) {
                        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
                        calendar.setTimeInMillis(j4 * j3);
                        long j7 = (j6 / j5) / j5;
                        long j8 = j6 - ((j7 * j5) * j5);
                        long j9 = j8 / j5;
                        calendar.set(11, (int) j7);
                        calendar.set(12, (int) j9);
                        calendar.set(13, (int) (j8 - (j5 * j9)));
                        calendar.set(14, 0);
                        j = calendar.getTimeInMillis();
                    }
                    LIZLLL().LJFF(Long.valueOf(j), str);
                }
            };
        }
        if (interfaceC12901053b instanceof C12915053p) {
            return new C053J<Long>(anonymousClass0531) { // from class: X.0538
                public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(820));
                public final C01GW LIZIZ;

                @Override // X.C053U
                public final C053I<Long> LIZLLL() {
                    return (C053I) this.LIZIZ.getValue();
                }

                {
                    this.LIZIZ = C452501pT.LIZIZ(new AwS403S0200000_2(anonymousClass0531, (C053I) null, 47));
                }

                @Override // X.C053U
                public final boolean LIZIZ(long j, String str) {
                    return LIZLLL().getData(str).getFirst().booleanValue();
                }

                @Override // X.C053U
                public final void LJ(long j, long j2, String str) {
                    LIZLLL().LJFF(Long.valueOf(j), str);
                }
            };
        }
        if (interfaceC12901053b instanceof C12914053o) {
            final C12914053o c12914053o = (C12914053o) interfaceC12901053b;
            return new C053J<Long>(c12914053o, anonymousClass0531) { // from class: X.0539
                public final C12914053o LIZ;
                public final C01GW LIZIZ;

                @Override // X.C053U
                public final C053I<Long> LIZLLL() {
                    return (C053I) this.LIZIZ.getValue();
                }

                {
                    this.LIZ = c12914053o;
                    this.LIZIZ = C452501pT.LIZIZ(new AwS403S0200000_2(anonymousClass0531, (C053I) null, 46));
                }

                @Override // X.C053U
                public final boolean LIZIZ(long j, String str) {
                    Pair<Boolean, Long> data = LIZLLL().getData(str);
                    boolean zBooleanValue = data.getFirst().booleanValue();
                    long jLongValue = data.getSecond().longValue();
                    if (!zBooleanValue) {
                        return false;
                    }
                    long j2 = j - jLongValue;
                    C12914053o c12914053o2 = this.LIZ;
                    if (j2 > c12914053o2.LIZIZ.getTimeInMs(c12914053o2.LIZ)) {
                        return false;
                    }
                    return true;
                }

                @Override // X.C053U
                public final void LJ(long j, long j2, String str) {
                    LIZLLL().LJFF(Long.valueOf(j), str);
                }
            };
        }
        if (interfaceC12901053b instanceof C12916053q) {
            return new C053J<Unit>() { // from class: X.0537
                public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(785));
                public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(786));

                @Override // X.C053U
                public final boolean LIZIZ(long j, String str) {
                    return false;
                }

                @Override // X.C053U
                public final void LJ(long j, long j2, String str) {
                }

                @Override // X.C053U
                public final C053I<Unit> LIZLLL() {
                    return (C053I) LIZJ.getValue();
                }
            };
        }
        throw new C1954807lC();
    }
}
