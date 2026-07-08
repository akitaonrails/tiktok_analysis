package X;

/* JADX INFO: renamed from: X.0jzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302080jzK implements InterfaceC1302090jzL {
    public final long LL;

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        long j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ValueTimeMark(reading=");
        sbLIZ.append(j);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1302080jzK(long j) {
        this.LL = j;
    }

    public static long LIZJ(long j) {
        C1302060jzI.LIZ.getClass();
        long jNanoTime = System.nanoTime() - C1302060jzI.LIZIZ;
        EnumC19990213Jk enumC19990213Jk = EnumC19990213Jk.NANOSECONDS;
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return C19990113Jj.LJIJJLI(C19990413Jm.LIZ(j));
        }
        return C19990413Jm.LIZJ(jNanoTime, j, enumC19990213Jk);
    }

    public final long LJI(InterfaceC1302090jzL interfaceC1302090jzL) {
        long j = this.LL;
        if (interfaceC1302090jzL instanceof C1302080jzK) {
            return LJFF(j, ((C1302080jzK) interfaceC1302090jzL).LL);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Subtracting or comparing time marks from different time sources is not possible: ");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ValueTimeMark(reading=");
        sbLIZ2.append(j);
        sbLIZ2.append(')');
        sbLIZ.append((Object) C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(" and ");
        sbLIZ.append(interfaceC1302090jzL);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC1302090jzL interfaceC1302090jzL) {
        long jLJI = LJI(interfaceC1302090jzL);
        C19990113Jj.LLILLJJLI.getClass();
        return C19990113Jj.LJI(jLJI, 0L);
    }

    public final boolean equals(Object obj) {
        long j = this.LL;
        if (!(obj instanceof C1302080jzK) || j != ((C1302080jzK) obj).LL) {
            return false;
        }
        return true;
    }

    public static final long LJFF(long j, long j2) {
        C1302060jzI.LIZ.getClass();
        EnumC19990213Jk enumC19990213Jk = EnumC19990213Jk.NANOSECONDS;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                C19990113Jj.LLILLJJLI.getClass();
                return 0L;
            }
            return C19990113Jj.LJIJJLI(C19990413Jm.LIZ(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return C19990413Jm.LIZ(j);
        }
        return C19990413Jm.LIZJ(j, j2, enumC19990213Jk);
    }
}
