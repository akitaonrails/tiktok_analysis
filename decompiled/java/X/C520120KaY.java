package X;

import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: renamed from: X.0KaY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520120KaY {
    public static final boolean LIZ(AbstractC1387200mCc abstractC1387200mCc) {
        if (abstractC1387200mCc instanceof C1397950mTx) {
            C1397950mTx c1397950mTx = (C1397950mTx) abstractC1387200mCc;
            if (!c1397950mTx.LIZLLL.isFinishing() && !c1397950mTx.LIZLLL.isDestroyed()) {
                return false;
            }
        } else if (abstractC1387200mCc instanceof C1844400y62) {
            InterfaceC214902198i interfaceC214902198i = ((C1844400y62) abstractC1387200mCc).LIZLLL;
            if (!SAFExtensionKt.LJIIZILJ(interfaceC214902198i) && !interfaceC214902198i.SL()) {
                return false;
            }
        } else {
            if (abstractC1387200mCc instanceof C198S) {
                return ((C198S) abstractC1387200mCc).LIZLLL.mViewDestroyed;
            }
            throw new C1954807lC();
        }
        return true;
    }
}
