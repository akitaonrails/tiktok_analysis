package X;

import android.content.ComponentName;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.newmedia.redbadge.impl.SonyHomeBadger;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0VFK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFK {
    public static final List<Class<? extends C0VFN>> LIZJ;
    public static volatile C0VFK LIZLLL;
    public volatile C0VFN LIZ;
    public ComponentName LIZIZ;

    static {
        LinkedList linkedList = new LinkedList();
        LIZJ = linkedList;
        linkedList.add(C0VF6.class);
        linkedList.add(C0VF7.class);
        linkedList.add(C0VF8.class);
        linkedList.add(C0VEC.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(C0VF5.class);
        linkedList.add(C0VFB.class);
        linkedList.add(C0VFH.class);
        linkedList.add(C0VFE.class);
        linkedList.add(C0VFO.class);
        linkedList.add(C0VFG.class);
        linkedList.add(C0VFF.class);
        linkedList.add(C0VF9.class);
        linkedList.add(C0VED.class);
        linkedList.add(C0VFD.class);
        linkedList.add(C0VFJ.class);
        linkedList.add(C0VFM.class);
        linkedList.add(C0VFL.class);
        linkedList.add(C0VFI.class);
    }

    public static synchronized C0VFK LIZJ() {
        if (LIZLLL == null) {
            synchronized (C0VFK.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C0VFK();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final boolean LIZ(int i, Context context) {
        try {
            LIZIZ(i, context);
            return true;
        } catch (C0VFP e) {
            TryCatchGuardChecker.doCheck(e);
            if (C809190Voj.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unable to execute badge");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
    
        if (r4 != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137 A[PHI: r4
      0x0137: PHI (r4v1 boolean) = (r4v0 boolean), (r4v2 boolean) binds: [B:61:0x0134, B:30:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r6, android.content.Context r7) throws X.C0VFP {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VFK.LIZIZ(int, android.content.Context):void");
    }
}
