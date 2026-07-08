package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12a2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19778812a2 extends AbstractC19899612tW<C19778812a2, C19782612ae> implements InterfaceC19900412te {
    public static final C19778812a2 zzc;
    public static volatile InterfaceC19816612g8<C19778812a2> zzd;
    public int zze;
    public int zzf;
    public long zzg;

    static {
        C19778812a2 c19778812a2 = new C19778812a2();
        zzc = c19778812a2;
        AbstractC19899612tW.LJIIZILJ(C19778812a2.class, c19778812a2);
    }

    public static C19782612ae LJJIII() {
        return zzc.LJIJI();
    }

    public final boolean LJJIIJZLJL() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJIIZ() {
        return (this.zze & 1) != 0;
    }

    public final int LJJI() {
        return this.zzf;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815412fw.LIZ[i - 1]) {
            case 1:
                return new C19778812a2();
            case 2:
                return new AbstractC19899712tX<C19778812a2, C19782612ae>() { // from class: X.12ae
                    {
                        C19778812a2 c19778812a2 = C19778812a2.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19778812a2> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19778812a2.class) {
                        try {
                            c19834512j1 = zzd;
                            if (c19834512j1 == null) {
                                c19834512j1 = new C19834512j1();
                                zzd = c19834512j1;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                        break;
                    }
                    return c19834512j1;
                }
                return interfaceC19816612g8;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static void LJJIFFI(C19778812a2 c19778812a2, int i) {
        c19778812a2.zze |= 1;
        c19778812a2.zzf = i;
    }

    public static void LJJII(C19778812a2 c19778812a2, long j) {
        c19778812a2.zze |= 2;
        c19778812a2.zzg = j;
    }
}
