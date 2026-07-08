package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966250bFf {
    public static Object LIZ(byte[] bArr, Class cls) {
        boolean z;
        Object c098200Yq;
        if (bArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            C1516680pZS c1516680pZS = new C1516680pZS();
            c1516680pZS.LJIIL(new C1506330pIl(bArr));
            C1515210pX5.LIZLLL().getClass();
            C0IMD c0imdLJI = C1515210pX5.LJI(cls);
            if (c0imdLJI != null) {
                c098200Yq = c0imdLJI.LIZJ(c1516680pZS);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on rust network callback decode failed for ");
            sbLIZ.append(cls);
            sbLIZ.append(" \t error: ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C1304630k3R.LJII(7, C2188811AlT.LIZIZ(sbLIZ), null);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static C501470JlZ LIZIZ(C967640bHu c967640bHu, final String str) {
        C966980bGq c966980bGq = c967640bHu.LIZIZ;
        final int i = (int) c966980bGq.LIZ;
        final String str2 = c967640bHu.LIZ;
        C477520Io2 c477520Io2 = new C477520Io2(i, str, str2) { // from class: X.0Jlj
        };
        c477520Io2.setErrorMsg(c966980bGq.LIZIZ);
        c477520Io2.setPrompt(c966980bGq.LIZJ);
        c477520Io2.setAlert(c966980bGq.LIZLLL);
        c477520Io2.setExtra(c966980bGq.LJ);
        return c477520Io2;
    }
}
