package Y;

import X.C118300cf;
import X.C1C7U;
import X.C214827195l;
import X.EnumC21158817r8;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS0S2413100_32 implements Runnable {
    public final int $t;
    public int i7;
    public int i8;
    public int i9;
    public long j10;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public boolean z6;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S2413100_32 aRunnableS0S2413100_32) {
        boolean zLIZ;
        C1C7U.LIZ("LayoutGeometryComponent@b6ef.schedulePositionCommit$runCommit$1");
        try {
            C214827195l.LIZJ(aRunnableS0S2413100_32.i7, (C214827195l) aRunnableS0S2413100_32.l2, (Function1) aRunnableS0S2413100_32.l3, (ViewGroup) aRunnableS0S2413100_32.l4, (C118300cf) aRunnableS0S2413100_32.l5, aRunnableS0S2413100_32.j10, aRunnableS0S2413100_32.s0, aRunnableS0S2413100_32.s1, aRunnableS0S2413100_32.z6, aRunnableS0S2413100_32.i8, aRunnableS0S2413100_32.i9);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutGeometryComponent@b6ef.schedulePositionCommit$runCommit$1");
    }

    public static final void run$1(ARunnableS0S2413100_32 aRunnableS0S2413100_32) {
        boolean zLIZ;
        C1C7U.LIZ("LayoutGeometryComponent@b6ef.schedulePositionCommit$1");
        try {
            C214827195l.LIZJ(aRunnableS0S2413100_32.i7, (C214827195l) aRunnableS0S2413100_32.l2, (Function1) aRunnableS0S2413100_32.l3, (ViewGroup) aRunnableS0S2413100_32.l4, (C118300cf) aRunnableS0S2413100_32.l5, aRunnableS0S2413100_32.j10, aRunnableS0S2413100_32.s0, aRunnableS0S2413100_32.s1, aRunnableS0S2413100_32.z6, aRunnableS0S2413100_32.i8, aRunnableS0S2413100_32.i9);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutGeometryComponent@b6ef.schedulePositionCommit$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000f: IPUT (r9 I:java.lang.String), (r0 I:Y.ARunnableS0S2413100_32) (LINE:201326607) Y.ARunnableS0S2413100_32.s0 java.lang.String, block:B:2:0x0000 */
    public ARunnableS0S2413100_32(int i, int i2, C214827195l c214827195l, Function1<? super EnumC21158817r8, Unit> function1, ViewGroup viewGroup, C118300cf c118300cf, long j, String str, String str2, boolean z, int i3, int i4) {
        String str3;
        this.$t = i4;
        this.i7 = i;
        this.l2 = i2;
        this.l3 = c214827195l;
        this.l4 = function1;
        this.l5 = viewGroup;
        this.j10 = c118300cf;
        this.s0 = str3;
        this.s1 = str;
        this.z6 = str2;
        this.i8 = z ? 1 : 0;
        this.i9 = i3;
    }
}
