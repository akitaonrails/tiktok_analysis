package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1BUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205621BUa implements InterfaceC21612219i4 {
    public static final C2205621BUa LJII = new C2205621BUa();
    public static final BPEAHandler LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
    public static BPEAHandler LJIIIZ = null;
    public static final C1BUZ LJIIJ = new Runnable() { // from class: X.1BUZ
        /* JADX WARN: Removed duplicated region for block: B:126:0x0089 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0085 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x003c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void LIZ() {
            /*
                Method dump skipped, instruction units count: 766
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1BUZ.LIZ():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("TreeWalker@5ef9.<field>$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("TreeWalker@5ef9.<field>$1");
        }
    };
    public static final RunnableC19379410ro LJIIJJI = new Runnable() { // from class: X.10ro
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("TreeWalker@5ef9.<field>$2");
            try {
                BPEAHandler bPEAHandler = C2205621BUa.LJIIIZ;
                if (bPEAHandler != null) {
                    C786410Ut5.LJJZZIII(bPEAHandler, C2205621BUa.LJIIJ);
                    C786410Ut5.LJLIIL(200L, C2205621BUa.LJIIIZ, C2205621BUa.LJIIJJI);
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("TreeWalker@5ef9.<field>$2");
        }
    };
    public int LIZIZ;
    public long LJI;
    public final List<InterfaceC2205751BUn> LIZ = new ArrayList();
    public final List<C21689919ub> LIZJ = new ArrayList();
    public final C2205641BUc LJ = new C2205641BUc();
    public final C21689719uZ LIZLLL = new C21689719uZ();
    public final C2205721BUk LJFF = new C2205721BUk(new C2205681BUg());

    public static void LIZIZ() {
        if (LJIIIZ == null) {
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            LJIIIZ = bPEAHandler;
            C786410Ut5.LJJZZIII(bPEAHandler, LJIIJ);
            C786410Ut5.LJLIIL(200L, LJIIIZ, LJIIJJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r12, X.InterfaceC21612319i5 r13, org.json.JSONObject r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2205621BUa.LIZ(android.view.View, X.19i5, org.json.JSONObject, boolean):void");
    }
}
