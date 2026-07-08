package X;

import java.util.Set;

/* JADX INFO: renamed from: X.1ClI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239661ClI extends C1862240yYo {
    public static final Set<String> LJIILL = C13LQ.LJLIIL(new String[]{"client_first_asr_packet_cost", "client_last_asr_packet_cost", "client_asr_render_cost"});
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public Long LJIIIZ;
    public Long LJIIJ;
    public Long LJIIJJI;
    public Long LJIIL;
    public Long LJIILIIL;
    public Long LJIILJJIL;

    public static long LIZLLL(long j, long j2) {
        long j3 = j2 - j;
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public final void LIZIZ() {
        long j = this.LIZJ;
        if (j > 0 && this.LJIIJ == null) {
            long j2 = this.LJ;
            if (j2 > 0) {
                Long lValueOf = Long.valueOf(LIZLLL(j, j2));
                LIZ(Long.valueOf(lValueOf.longValue()), "client_last_llm_packet_cost");
                this.LJIIJ = lValueOf;
            }
        }
    }

    public final void LIZJ() {
        if (this.LJIIL == null) {
            long j = this.LJI;
            if (j > 0) {
                long j2 = this.LIZIZ;
                if (j2 > 0) {
                    Long lValueOf = Long.valueOf(LIZLLL(j2, j));
                    LIZ(Long.valueOf(lValueOf.longValue()), "client_first_asr_packet_cost");
                    this.LJIIL = lValueOf;
                }
            }
        }
        long j3 = this.LIZJ;
        if (j3 <= 0) {
            return;
        }
        if (this.LJIIIZ == null) {
            long j4 = this.LIZLLL;
            if (j4 > 0) {
                Long lValueOf2 = Long.valueOf(LIZLLL(j3, j4));
                LIZ(Long.valueOf(lValueOf2.longValue()), "client_first_llm_packet_cost");
                this.LJIIIZ = lValueOf2;
            }
        }
        if (this.LJIIJJI == null) {
            long j5 = this.LJFF;
            if (j5 > 0) {
                Long lValueOf3 = Long.valueOf(LIZLLL(this.LIZJ, j5));
                LIZ(Long.valueOf(lValueOf3.longValue()), "client_llm_render_cost");
                this.LJIIJJI = lValueOf3;
            }
        }
        if (this.LJIILIIL == null) {
            long j6 = this.LJII;
            if (j6 > 0) {
                Long lValueOf4 = Long.valueOf(LIZLLL(this.LIZJ, j6));
                LIZ(Long.valueOf(lValueOf4.longValue()), "client_last_asr_packet_cost");
                this.LJIILIIL = lValueOf4;
            }
        }
        if (this.LJIILJJIL == null) {
            long j7 = this.LJIIIIZZ;
            if (j7 > 0) {
                Long lValueOf5 = Long.valueOf(LIZLLL(this.LIZJ, j7));
                LIZ(Long.valueOf(lValueOf5.longValue()), "client_asr_render_cost");
                this.LJIILJJIL = lValueOf5;
            }
        }
    }
}
