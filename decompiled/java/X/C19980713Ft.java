package X;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19980713Ft implements C0N88 {
    public final C0N23 LJ;
    public final Set<String> LJFF = new LinkedHashSet();
    public boolean LJI;
    public int LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;

    @Override // X.C0N86
    public final void LIZ(String str, String str2) {
    }

    @Override // X.C0N86
    public final void LIZIZ(String str, String str2) {
    }

    @Override // X.C0N86
    public final void LIZLLL(C0N23 c0n23, String str, Map map) {
    }

    public final Map<String, Object> LJ() {
        return C2097608Jq.LJIIIIZZ(new Pair("expose_status", Boolean.valueOf(this.LJI)), new Pair("expose_count", Integer.valueOf(this.LJII)), new Pair("expose_recent_at", Long.valueOf(this.LJIIIIZZ)), new Pair("disappear_status", Boolean.valueOf(this.LJIIIZ)), new Pair("disappear_count", Integer.valueOf(this.LJIIJ)), new Pair("disappear_recent_at", Long.valueOf(this.LJIIJJI)), new Pair("relative_page", this.LJFF));
    }

    @Override // X.C0N87
    public final void LJI(C0N23 c0n23, String str, Map map) {
    }

    @Override // X.C0N87
    public final void LJII(C0N23 c0n23, String str, Map map) {
    }

    @Override // X.C0N86
    public final void LJIIIIZZ(String str, String str2) {
    }

    @Override // X.C0N86
    public final void LJIILIIL(C0N23 c0n23, String str, Map map) {
    }

    @Override // X.C0N86
    public final void LJIILL(C0N23 c0n23, String str, Map map) {
    }

    public C19980713Ft(C0N23 c0n23) {
        this.LJ = c0n23;
    }

    public final void LIZJ(C19980813Fu c19980813Fu) {
        String str = c19980813Fu.LIZIZ;
        if (Intrinsics.LJFF(str, "show")) {
            if (!this.LJI && this.LJIIJ == 0) {
                c19980813Fu.LIZLLL.put("first_show", 1);
            }
            if (!this.LJI && this.LJIIIZ) {
                c19980813Fu.LIZLLL.put("first_show_in_period", 1);
            }
            if (this.LJIIJ > 0) {
                c19980813Fu.LIZLLL.put("is_reshow", 1);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "play")) {
            if (!this.LJI || this.LJIIIZ) {
                c19980813Fu.LJ.put("not_in_exposing", 1);
            }
            if (this.LJIIJ <= 0) {
                return;
            }
            c19980813Fu.LIZLLL.put("is_reshow", 1);
            return;
        }
        if (Intrinsics.LJFF(str, "over")) {
            if (!this.LJI || this.LJIIIZ) {
                c19980813Fu.LJ.put("not_in_exposing", 1);
            }
            if (this.LJIIJ <= 0) {
                return;
            }
            c19980813Fu.LIZLLL.put("is_reshow", 1);
            return;
        }
        if (Intrinsics.LJFF(str, "break")) {
            if (!this.LJI && this.LJIIIZ) {
                c19980813Fu.LJ.put("is_dup_disappear", 1);
            }
            if (!this.LJI || this.LJIIIZ) {
                c19980813Fu.LJ.put("not_in_exposing", 1);
            }
            if (this.LJIIJ <= 0) {
                return;
            }
            c19980813Fu.LIZLLL.put("is_reshow", 1);
            return;
        }
        if (C13LQ.LJJIJIIJI(str, C1046960dLq.LIZ) < 0 || this.LJIIJ <= 0) {
            return;
        }
        c19980813Fu.LIZLLL.put("is_reshow", 1);
    }

    @Override // X.C0N87
    public final void LJFF(C0N23 c0n23, String str, Map map) {
        this.LJFF.add(str);
        if (Intrinsics.LJFF(this.LJ, c0n23)) {
            this.LJI = true;
            this.LJII++;
            this.LJIIIIZZ = System.currentTimeMillis();
            this.LJIIIZ = false;
        }
    }

    @Override // X.C0N87
    public final void LJIIZILJ(C0N23 c0n23, String str, Map map) {
        this.LJFF.add(str);
        if (Intrinsics.LJFF(this.LJ, c0n23)) {
            this.LJIIIZ = true;
            this.LJIIJ++;
            this.LJIIJJI = System.currentTimeMillis();
            this.LJI = false;
        }
    }
}
