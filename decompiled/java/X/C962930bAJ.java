package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962930bAJ implements InterfaceC975870bVB {
    public List<Playbook> LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final Map<String, String> LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public Function0<Unit> LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public Function0<Unit> LJIIL;
    public boolean LJIILIIL;

    @Override // X.InterfaceC975870bVB
    public final void LIZJ() {
    }

    @Override // X.InterfaceC975870bVB
    public final void LJJI() {
        this.LJIIJ = true;
    }

    @Override // X.InterfaceC975870bVB
    public final void LIZ() {
        if (this.LJIIJ) {
            this.LJIIJ = false;
        } else {
            this.LJIIIZ = "unknown";
        }
    }

    public C962930bAJ() {
        C20441214yg.LIZIZ("LiveMatchDataHolder", "Initialising");
        this.LIZ = C13BV.INSTANCE;
        this.LIZLLL = new LinkedHashMap();
        this.LJI = true;
        this.LJIIIIZZ = AFwS203S0000000_15.get$arr$(240);
        this.LJIIIZ = "unknown";
        this.LJIIL = AFwS203S0000000_15.get$arr$(241);
    }

    @Override // X.InterfaceC975870bVB
    public final boolean LIZLLL() {
        return this.LJII;
    }

    @Override // X.InterfaceC975870bVB
    public final List<Playbook> LJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC975870bVB
    public final String LJIIJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC975870bVB
    public final Map<String, String> LJIIJJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC975870bVB
    public final boolean LJIIL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC975870bVB
    public final boolean LJIILIIL() {
        return this.LJI;
    }

    @Override // X.InterfaceC975870bVB
    public final Function0<Unit> LJIILL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC975870bVB
    public final boolean LJIJ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC975870bVB
    public final boolean LJIJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC975870bVB
    public final String LJIJJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC975870bVB
    public final boolean LJJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC975870bVB
    public final Function0<Unit> LJJII() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC975870bVB
    public final String LJJIII() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC975870bVB
    public final void LIZIZ(boolean z) {
        this.LJFF = z;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJFF(boolean z) {
        this.LJIIJJI = z;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJI(boolean z) {
        this.LJII = z;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJII(boolean z) {
        this.LJ = z;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJIIIIZZ(List<Playbook> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJIIIZ(String str) {
        this.LJIIIZ = str;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJIILJJIL(boolean z) {
        this.LJI = z;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJIILLIIL(boolean z) {
        this.LJIILIIL = z;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJIIZILJ(String str) {
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJIJJLI(Function0<Unit> function0) {
        this.LJIIL = function0;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJIL(String str) {
        this.LIZJ = str;
    }

    @Override // X.InterfaceC975870bVB
    public final void LJJIFFI(Function0<Unit> function0) {
        this.LJIIIIZZ = function0;
    }
}
