package X;

import java.time.Instant;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: X.13Jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19990813Jq extends C19897712tD {
    public static final AbstractC19994813Le LIZIZ() {
        Integer num = C19897912tF.LIZIZ;
        return (num == null || num.intValue() >= 34) ? new C13KK() { // from class: X.13Jw
            @Override // X.C13KK
            public final Random LIZ() {
                return ThreadLocalRandom.current();
            }

            @Override // X.AbstractC19994813Le
            public final double nextDouble(double d) {
                return ThreadLocalRandom.current().nextDouble(d);
            }

            @Override // X.AbstractC19994813Le
            public final long nextLong(long j) {
                return ThreadLocalRandom.current().nextLong(j);
            }

            @Override // X.AbstractC19994813Le
            public final int nextInt(int i, int i2) {
                return ThreadLocalRandom.current().nextInt(i, i2);
            }

            @Override // X.AbstractC19994813Le
            public final long nextLong(long j, long j2) {
                return ThreadLocalRandom.current().nextLong(j, j2);
            }
        } : new C13KK() { // from class: X.13Jv
            public final C19991213Ju LL = new ThreadLocal<Random>() { // from class: X.13Ju
                @Override // java.lang.ThreadLocal
                public final Random initialValue() {
                    return new Random();
                }
            };

            @Override // X.C13KK
            public final Random LIZ() {
                return get();
            }
        };
    }

    public static final InterfaceC19267710Zn LIZJ() {
        Integer num = C19897912tF.LIZIZ;
        return (num == null || num.intValue() >= 26) ? new InterfaceC19267710Zn() { // from class: X.13Jr
            @Override // X.InterfaceC19267710Zn
            public final C19990513Jn now() {
                Instant instantNow = Instant.now();
                C19991013Js c19991013Js = C19990513Jn.Companion;
                long epochSecond = instantNow.getEpochSecond();
                int nano = instantNow.getNano();
                c19991013Js.getClass();
                return C19991013Js.LIZ(nano, epochSecond);
            }
        } : new InterfaceC19267710Zn() { // from class: X.13Jp
            @Override // X.InterfaceC19267710Zn
            public final C19990513Jn now() {
                C19991013Js c19991013Js = C19990513Jn.Companion;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c19991013Js.getClass();
                long j = jCurrentTimeMillis / 1000;
                if ((jCurrentTimeMillis ^ 1000) < 0 && j * 1000 != jCurrentTimeMillis) {
                    j--;
                }
                long j2 = jCurrentTimeMillis % 1000;
                return j < -31557014167219200L ? C19990513Jn.MIN : j > 31556889864403199L ? C19990513Jn.MAX : C19991013Js.LIZ((int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * ((long) 1000000)), j);
            }
        };
    }
}
