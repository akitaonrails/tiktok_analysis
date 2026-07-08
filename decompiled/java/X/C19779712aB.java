package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12aB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19779712aB extends AbstractC19899612tW<C19779712aB, C19783812aq> implements InterfaceC19900412te {
    public static final /* synthetic */ int LL = 0;
    public static final C19779712aB zzc;
    public static volatile InterfaceC19816612g8<C19779712aB> zzd;
    public int zze;
    public long zzf;
    public String zzg = "";
    public int zzh;
    public InterfaceC19875012pY<C19780312aH> zzi;
    public InterfaceC19875012pY<C19780112aF> zzj;
    public InterfaceC19875012pY<C19779912aD> zzk;
    public String zzl;
    public boolean zzm;
    public InterfaceC19875012pY<C19792112cB> zzn;
    public InterfaceC19875012pY<C19787112bN> zzo;
    public String zzp;
    public String zzq;
    public C19779812aC zzr;
    public C19790112br zzs;
    public C19780212aG zzt;
    public C19787412bQ zzu;

    static {
        C19779712aB c19779712aB = new C19779712aB();
        zzc = c19779712aB;
        AbstractC19899612tW.LJIIZILJ(C19779712aB.class, c19779712aB);
    }

    public static C19783812aq LJJIIJ() {
        return zzc.LJIJI();
    }

    public final int LJJII() {
        return this.zzj.size();
    }

    public final C19779812aC LJJIII() {
        C19779812aC c19779812aC = this.zzr;
        return c19779812aC == null ? C19779812aC.LJJIFFI() : c19779812aC;
    }

    public final C19780212aG LJJIIZI() {
        C19780212aG c19780212aG = this.zzt;
        return c19780212aG == null ? C19780212aG.LJJII() : c19780212aG;
    }

    public final boolean LJJIJ() {
        return (this.zze & 128) != 0;
    }

    public final boolean LJJIJIIJI() {
        return (this.zze & 2) != 0;
    }

    public final boolean LJJIJIIJIL() {
        return (this.zze & 512) != 0;
    }

    public final boolean LJJIJIL() {
        return (this.zze & 1) != 0;
    }

    public C19779712aB() {
        C19886312rN<Object> c19886312rN = C19886312rN.LLILZ;
        this.zzi = c19886312rN;
        this.zzj = c19886312rN;
        this.zzk = c19886312rN;
        this.zzl = "";
        this.zzn = c19886312rN;
        this.zzo = c19886312rN;
        this.zzp = "";
        this.zzq = "";
    }

    public static C19779712aB LJJIIZ() {
        return zzc;
    }

    @Override // X.AbstractC19899612tW
    public final Object LJIILL(int i) {
        InterfaceC19816612g8 c19834512j1;
        switch (C19815612fy.LIZ[i - 1]) {
            case 1:
                return new C19779712aB();
            case 2:
                return new AbstractC19899712tX<C19779712aB, C19783812aq>() { // from class: X.12aq
                    {
                        C19779712aB c19779712aB = C19779712aB.zzc;
                    }
                };
            case 3:
                return new C19902812u2(zzc, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C19780312aH.class, "zzj", C19780112aF.class, "zzk", C19779912aD.class, "zzl", "zzm", "zzn", C19792112cB.class, "zzo", C19787112bN.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case 5:
                InterfaceC19816612g8<C19779712aB> interfaceC19816612g8 = zzd;
                if (interfaceC19816612g8 == null) {
                    synchronized (C19779712aB.class) {
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

    public final C19780112aF LJJI(int i) {
        return this.zzj.get(i);
    }

    public static void LJJIFFI(C19779712aB c19779712aB, int i, C19780112aF c19780112aF) {
        c19779712aB.getClass();
        InterfaceC19875012pY<C19780112aF> interfaceC19875012pY = c19779712aB.zzj;
        if (!interfaceC19875012pY.LIZIZ()) {
            c19779712aB.zzj = AbstractC19899612tW.LJIILIIL(interfaceC19875012pY);
        }
        c19779712aB.zzj.set(i, c19780112aF);
    }
}
