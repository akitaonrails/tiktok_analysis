package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0gxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185670gxZ {
    public static final InterfaceC665370Q7z LIZ(AbstractC1387200mCc abstractC1387200mCc) {
        C19EG c19eg;
        if (abstractC1387200mCc instanceof C1397950mTx) {
            Activity activity = ((C1397950mTx) abstractC1387200mCc).LIZLLL;
            if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null) {
                return null;
            }
            return C1558360qeg.LJI(c19eg, null);
        }
        if (abstractC1387200mCc instanceof C1844400y62) {
            return C1558360qeg.LJFF(((C1844400y62) abstractC1387200mCc).LIZLLL, null);
        }
        if (abstractC1387200mCc instanceof C198S) {
            return null;
        }
        throw new C1954807lC();
    }
}
