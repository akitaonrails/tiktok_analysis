package X;

/* JADX INFO: renamed from: X.149g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC202186149g implements Runnable {
    public String LL = "init";
    public int LLILLJJLI = 0;
    public String LLILLL = "";

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v14 ??, still in use, count: 6, list:
          (r4v14 ?? I:X.14A4) from 0x02e0: IGET (r15v1 ?? I:X.14A3) = (r4v14 ?? I:X.14A4) (LINE:736) X.14A4.LIZIZ X.14A3
          (r4v14 ?? I:X.14A4) from 0x02e8: IGET (r1v39 ?? I:java.lang.String) = (r4v14 ?? I:X.14A4) (LINE:744) X.14A4.LIZLLL java.lang.String
          (r4v14 ?? I:X.14A4) from 0x02ea: IGET (r0v83 ?? I:int) = (r4v14 ?? I:X.14A4) (LINE:746) X.14A4.LJ int
          (r4v14 ?? I:X.14A4) from 0x0300: IGET (r2v6 ?? I:X.14A3) = (r4v14 ?? I:X.14A4) (LINE:768) X.14A4.LIZIZ X.14A3
          (r4v14 ?? I:X.14A4) from 0x0307: IGET (r1v40 ?? I:java.lang.String) = (r4v14 ?? I:X.14A4) (LINE:775) X.14A4.LIZLLL java.lang.String
          (r4v14 ?? I:X.14A4) from 0x0309: IGET (r0v86 ?? I:int) = (r4v14 ?? I:X.14A4) (LINE:777) X.14A4.LJ int
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC202186149g.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SettingsManager$taskRunable@84a6.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SettingsManager$taskRunable@84a6.run");
    }
}
