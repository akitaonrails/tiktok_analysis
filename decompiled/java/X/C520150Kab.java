package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: renamed from: X.0Kab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520150Kab {
    public static final AbstractC1387200mCc LIZLLL() {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        AbstractC1387200mCc abstractC1387200mCc3 = null;
        if (abstractC1387200mCcLJ != null && abstractC1387200mCcLJ.LIZ != null) {
            Object obj = abstractC1387200mCcLJ.LIZ;
            if (((obj instanceof Activity) && !(obj instanceof InterfaceC214897198d)) || ((obj instanceof InterfaceC214902198i) && (obj instanceof InterfaceC20596815ig))) {
                return abstractC1387200mCcLJ;
            }
            if (C294740Bgu.LIZ() && (obj instanceof InterfaceC20622815ms)) {
                InterfaceC20622815ms interfaceC20622815ms = (InterfaceC20622815ms) obj;
                if (C20629915o1.LIZJ(interfaceC20622815ms) instanceof InterfaceC20596815ig) {
                    Object objLIZJ = C20629915o1.LIZJ(interfaceC20622815ms);
                    if (objLIZJ != null) {
                        if (!(objLIZJ instanceof Fragment)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(objLIZJ);
                            sbLIZ.append(" is not a Fragment!");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            strLIZIZ.toString();
                            throw new IllegalStateException(strLIZIZ);
                        }
                        C1844400y62 c1844400y62 = new C1844400y62((Fragment) objLIZJ);
                        C520050KaR c520050KaR = new C520050KaR(c1844400y62);
                        C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                        C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                        if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                            synchronized (c830530Wi3) {
                                try {
                                    C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                                    if (c520050KaR3 != null && (abstractC1387200mCc2 = c520050KaR3.get()) != null) {
                                        return abstractC1387200mCc2;
                                    }
                                    c830530Wi3.put(c520050KaR, c520050KaR);
                                    return c1844400y62;
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                        return abstractC1387200mCc;
                    }
                    return abstractC1387200mCc3;
                }
            }
            if ((obj instanceof InterfaceC214897198d) && ((InterfaceC214897198d) obj).getEnableSAF()) {
                InterfaceC20622815ms interfaceC20622815ms2 = (InterfaceC20622815ms) obj;
                if (C20629915o1.LIZJ(interfaceC20622815ms2) instanceof InterfaceC20596815ig) {
                    Object objLIZJ2 = C20629915o1.LIZJ(interfaceC20622815ms2);
                    if (objLIZJ2 != null) {
                        if (!(objLIZJ2 instanceof Fragment)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(objLIZJ2);
                            sbLIZ2.append(" is not a Fragment!");
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            strLIZIZ2.toString();
                            throw new IllegalStateException(strLIZIZ2);
                        }
                        C1844400y62 c1844400y622 = new C1844400y62((Fragment) objLIZJ2);
                        C520050KaR c520050KaR4 = new C520050KaR(c1844400y622);
                        C830530Wi3<C520050KaR, C520050KaR> c830530Wi32 = C2214211BlL.LIZ;
                        C520050KaR c520050KaR5 = c830530Wi32.get(c520050KaR4);
                        if (c520050KaR5 == null || (abstractC1387200mCc = c520050KaR5.get()) == null) {
                            synchronized (c830530Wi32) {
                                try {
                                    C520050KaR c520050KaR6 = c830530Wi32.get(c520050KaR4);
                                    if (c520050KaR6 == null || (abstractC1387200mCc3 = c520050KaR6.get()) == null) {
                                        c830530Wi32.put(c520050KaR4, c520050KaR4);
                                        return c1844400y622;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return abstractC1387200mCc;
                    }
                    return abstractC1387200mCc3;
                }
            }
        }
        return abstractC1387200mCcLJ;
    }

    @InterfaceC1294060jmO
    public static final AbstractC1387200mCc LJ() {
        Object objLIZJ;
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        AbstractC1387200mCc abstractC1387200mCc3 = null;
        if (abstractC1387200mCcLJ == null) {
            return null;
        }
        Object obj = abstractC1387200mCcLJ.LIZ;
        if ((obj instanceof InterfaceC214902198i) && (obj instanceof InterfaceC20596815ig)) {
            return abstractC1387200mCcLJ;
        }
        if ((obj instanceof InterfaceC214897198d) && ((InterfaceC214897198d) obj).getEnableSAF()) {
            InterfaceC20622815ms interfaceC20622815ms = (InterfaceC20622815ms) obj;
            if (C20629915o1.LIZJ(interfaceC20622815ms) instanceof InterfaceC20596815ig) {
                Object objLIZJ2 = C20629915o1.LIZJ(interfaceC20622815ms);
                if (objLIZJ2 != null) {
                    if (!(objLIZJ2 instanceof Fragment)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(objLIZJ2);
                        sbLIZ.append(" is not a Fragment!");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalStateException(strLIZIZ);
                    }
                    C1844400y62 c1844400y62 = new C1844400y62((Fragment) objLIZJ2);
                    C520050KaR c520050KaR = new C520050KaR(c1844400y62);
                    C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                    C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                    if (c520050KaR2 == null || (abstractC1387200mCc = c520050KaR2.get()) == null) {
                        synchronized (c830530Wi3) {
                            try {
                                C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                                if (c520050KaR3 != null && (abstractC1387200mCc2 = c520050KaR3.get()) != null) {
                                    return abstractC1387200mCc2;
                                }
                                c830530Wi3.put(c520050KaR, c520050KaR);
                                return c1844400y62;
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                    return abstractC1387200mCc;
                }
                return abstractC1387200mCc3;
            }
        }
        if (C294740Bgu.LIZ() && (obj instanceof InterfaceC20622815ms)) {
            InterfaceC20622815ms interfaceC20622815ms2 = (InterfaceC20622815ms) obj;
            if ((C20629915o1.LIZJ(interfaceC20622815ms2) instanceof InterfaceC20596815ig) && (objLIZJ = C20629915o1.LIZJ(interfaceC20622815ms2)) != null) {
                if (!(objLIZJ instanceof Fragment)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(objLIZJ);
                    sbLIZ2.append(" is not a Fragment!");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    strLIZIZ2.toString();
                    throw new IllegalStateException(strLIZIZ2);
                }
                C1844400y62 c1844400y622 = new C1844400y62((Fragment) objLIZJ);
                C520050KaR c520050KaR4 = new C520050KaR(c1844400y622);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi32 = C2214211BlL.LIZ;
                C520050KaR c520050KaR5 = c830530Wi32.get(c520050KaR4);
                if (c520050KaR5 == null || (abstractC1387200mCc = c520050KaR5.get()) == null) {
                    synchronized (c830530Wi32) {
                        try {
                            C520050KaR c520050KaR6 = c830530Wi32.get(c520050KaR4);
                            if (c520050KaR6 == null || (abstractC1387200mCc3 = c520050KaR6.get()) == null) {
                                c830530Wi32.put(c520050KaR4, c520050KaR4);
                                return c1844400y622;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return abstractC1387200mCc;
            }
        }
        return abstractC1387200mCc3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public static final AbstractC1387200mCc LIZ(Context context) {
        Activity activityLIZ;
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        AbstractC1387200mCc abstractC1387200mCc3;
        AbstractC1387200mCc abstractC1387200mCc4;
        AbstractC1387200mCc abstractC1387200mCc5;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == 0) {
            return null;
        }
        if (!C294780Bgy.LIZ() ? !(activityLIZ instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activityLIZ).getEnableSAF() : !(activityLIZ instanceof InterfaceC214897198d)) {
            if (!C294780Bgy.LIZ() ? !(!(activityLIZ instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activityLIZ).getEnableSAF()) : (activityLIZ instanceof InterfaceC214897198d)) {
                if (((InterfaceC214897198d) activityLIZ).getUseRootFragmentForPageCallbacks()) {
                    return new C1397950mTx(activityLIZ);
                }
            }
            C1397950mTx c1397950mTx = new C1397950mTx(activityLIZ);
            C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
            C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
            C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
            if (c520050KaR2 != null && (abstractC1387200mCc5 = c520050KaR2.get()) != null) {
                return abstractC1387200mCc5;
            }
            synchronized (c830530Wi3) {
                try {
                    C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                    if (c520050KaR3 != null && (abstractC1387200mCc4 = c520050KaR3.get()) != null) {
                        return abstractC1387200mCc4;
                    }
                    c830530Wi3.put(c520050KaR, c520050KaR);
                    return c1397950mTx;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Object objLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        if (objLJIIIIZZ != null) {
            if (objLJIIIIZZ instanceof Fragment) {
                C1844400y62 c1844400y62 = new C1844400y62((Fragment) objLJIIIIZZ);
                C520050KaR c520050KaR4 = new C520050KaR(c1844400y62);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi32 = C2214211BlL.LIZ;
                C520050KaR c520050KaR5 = c830530Wi32.get(c520050KaR4);
                if (c520050KaR5 != null && (abstractC1387200mCc3 = c520050KaR5.get()) != null) {
                    return abstractC1387200mCc3;
                }
                synchronized (c830530Wi32) {
                    try {
                        C520050KaR c520050KaR6 = c830530Wi32.get(c520050KaR4);
                        if (c520050KaR6 == null || (abstractC1387200mCc2 = c520050KaR6.get()) == null) {
                            c830530Wi32.put(c520050KaR4, c520050KaR4);
                            return c1844400y62;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(objLJIIIIZZ);
                sbLIZ.append(" is not a Fragment!");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
        } else {
            AbstractC1387200mCc abstractC1387200mCcLJ = LJ();
            if (abstractC1387200mCcLJ == null) {
                if (!C294780Bgy.LIZ() ? !(!(activityLIZ instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activityLIZ).getEnableSAF()) : (activityLIZ instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activityLIZ).getUseRootFragmentForPageCallbacks()) {
                        return new C1397950mTx(activityLIZ);
                    }
                }
                C1397950mTx c1397950mTx2 = new C1397950mTx(activityLIZ);
                C520050KaR c520050KaR7 = new C520050KaR(c1397950mTx2);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi33 = C2214211BlL.LIZ;
                C520050KaR c520050KaR8 = c830530Wi33.get(c520050KaR7);
                if (c520050KaR8 == null || (abstractC1387200mCc2 = c520050KaR8.get()) == null) {
                    synchronized (c830530Wi33) {
                        try {
                            C520050KaR c520050KaR9 = c830530Wi33.get(c520050KaR7);
                            if (c520050KaR9 != null && (abstractC1387200mCc = c520050KaR9.get()) != null) {
                                return abstractC1387200mCc;
                            }
                            c830530Wi33.put(c520050KaR7, c520050KaR7);
                            return c1397950mTx2;
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            throw th3;
                        }
                    }
                }
            } else {
                return abstractC1387200mCcLJ;
            }
        }
        return abstractC1387200mCc2;
    }

    public static final boolean LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
        InterfaceC214902198i interfaceC214902198iLIZJ;
        InterfaceC20622815ms interfaceC20622815ms;
        InterfaceC20622815ms interfaceC20622815ms2;
        if (abstractC1387200mCc == null) {
            return false;
        }
        Object obj = abstractC1387200mCc.LIZ;
        InterfaceC214902198i interfaceC214902198iLIZJ2 = null;
        if ((obj instanceof InterfaceC214897198d) && (interfaceC20622815ms2 = (InterfaceC20622815ms) obj) != null) {
            interfaceC214902198iLIZJ = C20629915o1.LIZJ(interfaceC20622815ms2);
        } else {
            interfaceC214902198iLIZJ = null;
        }
        if (((Boolean) C0BOJ.LIZ.getValue()).booleanValue() && interfaceC214902198iLIZJ == null) {
            Object obj2 = abstractC1387200mCc.LIZ;
            if ((obj2 instanceof InterfaceC20622815ms) && (interfaceC20622815ms = (InterfaceC20622815ms) obj2) != null) {
                interfaceC214902198iLIZJ2 = C20629915o1.LIZJ(interfaceC20622815ms);
            }
            interfaceC214902198iLIZJ = interfaceC214902198iLIZJ2;
        }
        return interfaceC214902198iLIZJ instanceof InterfaceC20596815ig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0158, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0159, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x015b, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x015f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0160, code lost:
    
        r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIIIZZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0164, code lost:
    
        if (r2 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0168, code lost:
    
        if ((r2 instanceof androidx.fragment.app.Fragment) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x016a, code lost:
    
        r3 = new X.C1844400y62((androidx.fragment.app.Fragment) r2);
        r2 = new X.C520050KaR(r3);
        r1 = X.C2214211BlL.LIZ;
        r0 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x017e, code lost:
    
        if (r0 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0180, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0186, code lost:
    
        if (r0 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0188, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0189, code lost:
    
        r0 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018f, code lost:
    
        if (r0 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0191, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0197, code lost:
    
        if (r0 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0199, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x019a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x019b, code lost:
    
        r0 = r1.put(r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01a1, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01a2, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a4, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01a9, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r2);
        r1.append(" is not a Fragment!");
        r1 = X.C2188811AlT.LIZIZ(r1);
        r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c1, code lost:
    
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
    
        if (((java.lang.Boolean) X.C1837207Hm.LIZ.getValue()).booleanValue() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIIIZZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if ((r2 instanceof androidx.fragment.app.Fragment) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        r3 = new X.C1844400y62((androidx.fragment.app.Fragment) r2);
        r2 = new X.C520050KaR(r3);
        r1 = X.C2214211BlL.LIZ;
        r0 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b4, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ba, code lost:
    
        if (r0 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bd, code lost:
    
        r0 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c5, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cb, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cf, code lost:
    
        r0 = r1.put(r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00dc, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r2);
        r1.append(" is not a Fragment!");
        r1 = X.C2188811AlT.LIZIZ(r1);
        r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
    
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f6, code lost:
    
        r0 = LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fa, code lost:
    
        if (r0 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0100, code lost:
    
        if (X.C294780Bgy.LIZ() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0104, code lost:
    
        if ((r4 instanceof X.InterfaceC214897198d) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010d, code lost:
    
        if (((X.InterfaceC214897198d) r4).getUseRootFragmentForPageCallbacks() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0114, code lost:
    
        return new X.C1397950mTx(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0117, code lost:
    
        if ((r4 instanceof X.InterfaceC214897198d) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0120, code lost:
    
        if (((X.InterfaceC214897198d) r4).getEnableSAF() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0123, code lost:
    
        r3 = new X.C1397950mTx(r4);
        r2 = new X.C520050KaR(r3);
        r1 = X.C2214211BlL.LIZ;
        r0 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0135, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0137, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013d, code lost:
    
        if (r0 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013f, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0140, code lost:
    
        r0 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0146, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0148, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014e, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0150, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0151, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0152, code lost:
    
        r0 = r1.put(r2, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC1387200mCc LIZJ(android.content.Context r5) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520150Kab.LIZJ(android.content.Context):X.0mCc");
    }
}
