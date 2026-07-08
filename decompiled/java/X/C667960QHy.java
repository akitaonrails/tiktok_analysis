package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667960QHy extends C09AY implements Function2<C667970QHz, C0Q3J, C667970QHz> {
    public C667960QHy() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C667970QHz invoke(C667970QHz c667970QHz, C0Q3J c0q3j) {
        C667970QHz c667970QHz2 = c667970QHz;
        String str = c0q3j.LIZ;
        long j = c667970QHz2.LIZIZ;
        if (j != 0) {
            C667870QHp c667870QHp = C667870QHp.LIZJ;
            long j2 = c667970QHz2.LIZJ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (str == null) {
                str = "";
            }
            C667970QHz c667970QHzLIZ = C667970QHz.LIZ(c667970QHz2, false, j, j2, jCurrentTimeMillis, str, 1);
            c667870QHp.getClass();
            C650460PfI<C0QI7> c650460PfI = new C650460PfI<C0QI7>() { // from class: X.0QI7
            };
            c650460PfI.LJIIZILJ("start_time", String.valueOf(c667970QHzLIZ.LIZIZ));
            c650460PfI.LJIIZILJ("refresh_blankpage_time", String.valueOf(c667970QHzLIZ.LIZJ));
            c650460PfI.LJIIZILJ("end_blankpage_time", String.valueOf(c667970QHzLIZ.LIZLLL));
            c650460PfI.LJIIZILJ("refresh_blankpage_cost", String.valueOf(c667970QHzLIZ.LIZJ - c667970QHzLIZ.LIZIZ));
            c650460PfI.LJIIZILJ("decision_blankpage_cost", String.valueOf(c667970QHzLIZ.LIZLLL - c667970QHzLIZ.LIZJ));
            c650460PfI.LJIIZILJ("end_blankpage_cost", String.valueOf(c667970QHzLIZ.LIZLLL - c667970QHzLIZ.LIZIZ));
            c650460PfI.LJIIZILJ("end_blankpage_method", c667970QHzLIZ.LJ);
            c650460PfI.LJIILJJIL();
            C0QI3.LJII.getClass();
            return new C667970QHz(0);
        }
        return c667970QHz2;
    }
}
