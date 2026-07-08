package X;

/* JADX INFO: renamed from: X.0b6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960850b6x {
    public static final C13E8<C960840b6w> LIZ = new C13E8<>();

    public static void LIZ(C0N67 c0n67) {
        C13E8<C960840b6w> c13e8 = LIZ;
        if ((!c13e8.isEmpty()) && c0n67 == c13e8.first().LIZ) {
            c13e8.removeFirst();
            if (!c13e8.isEmpty()) {
                c13e8.first().LIZJ.invoke();
            }
        }
    }

    public static void LIZIZ(C960840b6w c960840b6w) {
        C0N67 c0n67 = c960840b6w.LIZ;
        C13E8<C960840b6w> c13e8 = LIZ;
        if ((!c13e8.isEmpty()) && c0n67 == c13e8.first().LIZ) {
            return;
        }
        if (c13e8.isEmpty()) {
            c960840b6w.LIZJ.invoke();
        } else if (C500260Jjc.LJJIFFI(c960840b6w.LIZIZ)) {
            return;
        }
        c13e8.addLast(c960840b6w);
    }
}
