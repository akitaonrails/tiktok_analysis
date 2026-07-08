package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.internal.measurement.zzdl;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.12eD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19804712eD implements InterfaceC19811312fH {
    public static volatile C19804712eD LJJIJIIJIL;
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final C19812512fT LJFF;
    public final C19791812c8 LJI;
    public final C19804812eE LJII;
    public final C19806212eS LJIIIIZZ;
    public final C19837112jR LJIIIZ;
    public final C19809512ez LJIIJ;
    public final C19803112dx LJIIJJI;
    public final C19781112aP LJIIL;
    public final C833180WmK LJIILIIL;
    public final C19805012eG LJIILJJIL;
    public final C19804412eA LJIILL;
    public final C19806012eQ LJIILLIIL;
    public final C19810012f4 LJIIZILJ;
    public final String LJIJ;
    public C19805312eJ LJIJI;
    public C19804512eB LJIJJ;
    public C19807812ei LJIJJLI;
    public C19804912eF LJIL;
    public boolean LJJ;
    public Boolean LJJI;
    public long LJJIFFI;
    public volatile Boolean LJJII;
    public final Boolean LJJIII;
    public final Boolean LJJIIJ;
    public volatile boolean LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public final AtomicInteger LJJIJ = new AtomicInteger(0);
    public final long LJJIJIIJI;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19804712eD.LJI():boolean");
    }

    public final C19806012eQ LJIIIIZZ() {
        C19806012eQ c19806012eQ = this.LJIILLIIL;
        if (c19806012eQ != null) {
            return c19806012eQ;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C19807812ei LJIIIZ() {
        LJ(this.LJIJJLI);
        return this.LJIJJLI;
    }

    public final C19804912eF LJIIJ() {
        LIZJ(this.LJIL);
        return this.LJIL;
    }

    public final C19804812eE LJIIJJI() {
        C19804812eE c19804812eE = this.LJII;
        if (c19804812eE != null) {
            return c19804812eE;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // X.InterfaceC19811312fH
    public final C19837112jR LJIIL() {
        LJ(this.LJIIIZ);
        return this.LJIIIZ;
    }

    public final C19804412eA LJIILIIL() {
        LIZJ(this.LJIILL);
        return this.LJIILL;
    }

    @Override // X.InterfaceC19811312fH
    public final C19806212eS LJIILJJIL() {
        LJ(this.LJIIIIZZ);
        return this.LJIIIIZZ;
    }

    public final C19804512eB LJIILL() {
        LIZJ(this.LJIJJ);
        return this.LJIJJ;
    }

    public final C19803112dx LJIILLIIL() {
        C19803112dx c19803112dx = this.LJIIJJI;
        if (c19803112dx != null) {
            return c19803112dx;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean LJFF() {
        return LJII() == 0;
    }

    public final int LJII() {
        LJIIL().LJ();
        if (this.LJI.LJJ()) {
            return 1;
        }
        Boolean bool = this.LJJIIJ;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        LJIIL().LJ();
        if (!this.LJJIIJZLJL) {
            return 8;
        }
        Boolean boolLJIL = LJIIJJI().LJIL();
        if (boolLJIL != null) {
            return boolLJIL.booleanValue() ? 0 : 3;
        }
        Boolean boolLJIIZILJ = this.LJI.LJIIZILJ("firebase_analytics_collection_enabled");
        if (boolLJIIZILJ != null) {
            return boolLJIIZILJ.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.LJJIII;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.LJJII == null || this.LJJII.booleanValue()) ? 0 : 7;
    }

    @Override // X.InterfaceC19811312fH
    public final InterfaceC19786612bI LIZ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC19811312fH
    public final C19812512fT LIZLLL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC19811312fH
    public final Context zza() {
        return this.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6 A[Catch: all -> 0x00c0, Merged into TryCatch #1 {all -> 0x00c8, all -> 0x00c0, blocks: (B:30:0x0078, B:32:0x007c, B:55:0x00c5, B:56:0x00c6, B:33:0x007d, B:37:0x0088, B:39:0x008c, B:50:0x00be, B:40:0x0095, B:42:0x009e, B:44:0x00a2, B:46:0x00a6, B:47:0x00ac, B:49:0x00b2), top: B:85:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac A[Catch: all -> 0x00c0, Merged into TryCatch #1 {all -> 0x00c8, all -> 0x00c0, blocks: (B:30:0x0078, B:32:0x007c, B:55:0x00c5, B:56:0x00c6, B:33:0x007d, B:37:0x0088, B:39:0x008c, B:50:0x00be, B:40:0x0095, B:42:0x009e, B:44:0x00a2, B:46:0x00a6, B:47:0x00ac, B:49:0x00b2), top: B:85:0x0078 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19804712eD(final X.C0WH7 r9) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19804712eD.<init>(X.0WH7):void");
    }

    public static void LIZJ(AbstractC19810512f9 abstractC19810512f9) {
        if (abstractC19810512f9 != null) {
            if (abstractC19810512f9.LIZIZ) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC19810512f9.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static void LJ(AbstractC19810712fB abstractC19810712fB) {
        if (abstractC19810712fB != null) {
            if (abstractC19810712fB.LIZIZ) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC19810712fB.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static C19804712eD LIZIZ(Context context, zzdl zzdlVar, Long l) {
        Bundle bundle;
        if (zzdlVar != null && (zzdlVar.zze == null || zzdlVar.zzf == null)) {
            zzdlVar = new zzdl(zzdlVar.zza, zzdlVar.zzb, zzdlVar.zzc, zzdlVar.zzd, null, null, zzdlVar.zzg, null);
        }
        C0W3J.LJIIIIZZ(context);
        C0W3J.LJIIIIZZ(C786410Ut5.N3(context));
        if (LJJIJIIJIL == null) {
            synchronized (C19804712eD.class) {
                try {
                    if (LJJIJIIJIL == null) {
                        LJJIJIIJIL = new C19804712eD(new C0WH7(context, zzdlVar, l));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else if (zzdlVar != null && (bundle = zzdlVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C0W3J.LJIIIIZZ(LJJIJIIJIL);
            LJJIJIIJIL.LJJII = Boolean.valueOf(zzdlVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        C0W3J.LJIIIIZZ(LJJIJIIJIL);
        return LJJIJIIJIL;
    }
}
