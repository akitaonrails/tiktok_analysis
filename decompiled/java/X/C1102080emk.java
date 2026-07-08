package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0emk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102080emk implements InterfaceC1102110emn {
    public final InterfaceC1102120emo LIZ;
    public final EnumC1100250ejn LIZIZ;
    public final EnumC1107830ew1 LIZJ;
    public final C1097740efk LIZLLL;
    public final long LJ;
    public long LJFF;
    public boolean LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public C1102140emq LJIL;
    public AnonymousClass0956 LJJ;
    public AnonymousClass0956 LJJI;
    public List<String> LJJIII;
    public String LJJIIJZLJL;
    public Integer LJJIIZ;
    public final Map<String, String> LJJIFFI = new LinkedHashMap();
    public C0KAJ LJJII = C0KAJ.NON_RESUMABLE;
    public final C01GW LJJIIJ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(99));

    @Override // X.InterfaceC1102110emn
    public final /* bridge */ /* synthetic */ String LJII() {
        return null;
    }

    @Override // X.InterfaceC1102110emn
    public final String LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC1102110emn
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC1102110emn
    public final EnumC245600xC LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC1102110emn
    public final long LJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // X.InterfaceC1102110emn
    public final String LJIIL() {
        return this.LIZJ.getKey();
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIILLIIL() {
        return this.LJII - this.LJFF;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJJ() {
        return this.LJFF - this.LIZ.LJIIJ();
    }

    public final void LJJI() {
        if (this.LJIILJJIL != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LJIILJJIL;
            this.LJIJ = jUptimeMillis;
            this.LJIJI += jUptimeMillis;
            this.LJIILJJIL = 0L;
        }
    }

    public final List<String> LJJIFFI() {
        return (List) this.LJJIIJ.getValue();
    }

    public final boolean LJJII() {
        return this.LJIILJJIL != 0;
    }

    public final boolean LJJIII() {
        return this.LJIIL != 0;
    }

    @Override // X.InterfaceC1102110emn
    public final String LJJJ() {
        return this.LIZ.LJJJ();
    }

    @Override // X.InterfaceC1102110emn
    public final String Xc() {
        return this.LIZIZ.getKey();
    }

    @Override // X.InterfaceC1102110emn
    public final String getBusinessName() {
        return this.LIZ.getBusinessName();
    }

    @Override // X.InterfaceC1102110emn
    public final Map<String, String> getExtras() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> extras = this.LIZ.getExtras();
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        linkedHashMap.putAll(this.LJJIFFI);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102080emk.toString():java.lang.String");
    }

    @Override // X.InterfaceC1102110emn
    public final String LJIIIIZZ() {
        return C13LP.LJJLIIIJ(LJJIFFI(), ",", null, null, 0, null, null, 62);
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIIJJI() {
        return C963140bAe.LIZIZ() - this.LIZ.LJIIJ();
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIIZILJ() {
        return SystemClock.uptimeMillis() - this.LJ;
    }

    public final void LJJIIJ() {
        LJJI();
        if (this.LJIIL == 0) {
            this.LJIIJ++;
            this.LJIIL = SystemClock.uptimeMillis();
        }
        this.LJIILLIIL = false;
    }

    @Override // X.InterfaceC1102110emn
    public final int LIZ() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJFF() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1102110emn
    public final boolean LJI() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1102110emn
    public final Integer LJIIIZ() {
        return this.LJJIIZ;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIIJ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1102110emn
    public final String LJIILIIL() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIILJJIL() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1102110emn
    public final int LJIJ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1102110emn
    public final long LJIJJ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1102110emn
    public final int LJIJJLI() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1102110emn
    public final int LJIL() {
        return this.LJIJJLI;
    }

    public C1102080emk(InterfaceC1102120emo interfaceC1102120emo, EnumC1100250ejn enumC1100250ejn, EnumC1107830ew1 enumC1107830ew1, C1097740efk c1097740efk) {
        this.LIZ = interfaceC1102120emo;
        this.LIZIZ = enumC1100250ejn;
        this.LIZJ = enumC1107830ew1;
        this.LIZLLL = c1097740efk;
        this.LJ = c1097740efk.LJI;
    }
}
