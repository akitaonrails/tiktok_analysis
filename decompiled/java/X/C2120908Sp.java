package X;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import jv6.a;

/* JADX INFO: renamed from: X.08Sp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2120908Sp implements InterfaceC2424509el {
    public final Context LIZ;
    public final C08PR LIZIZ;
    public final C2133108Xh LIZJ;
    public final Executor LIZLLL;

    public C2120908Sp(Context context, Executor executor, C2133108Xh c2133108Xh, C08PR c08pr) {
        this.LIZ = context;
        this.LIZIZ = c08pr;
        this.LIZJ = c2133108Xh;
        this.LIZLLL = executor;
    }

    public static void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" : ");
        sbLIZ.append(str2);
        C1AF0.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), C1BL9.LIZ());
    }

    public static void LIZJ(String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SplitCompat");
        sbLIZ.append(" : ");
        sbLIZ.append(str);
        C1AF0.LJI(th, C2188811AlT.LIZIZ(sbLIZ), C1BL9.LIZ());
    }

    @Override // X.InterfaceC2424509el
    public final void LIZ(final List list, final InterfaceC2121108Sr interfaceC2121108Sr) {
        if (a.LJ.get() != null) {
            this.LIZLLL.execute(new Runnable() { // from class: X.08So
                /* JADX WARN: Removed duplicated region for block: B:89:0x01a9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 770
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2120808So.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzaj@545b.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzaj@545b.run");
                }
            });
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
