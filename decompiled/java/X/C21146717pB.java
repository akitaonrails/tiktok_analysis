package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.17pB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21146717pB {
    public static final C21146717pB LIZJ = new C21146717pB();
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C21145117ov());

    public static final void LJII(List<String> list) {
        int iIntValue;
        InterfaceC21138317np interfaceC21138317npLIZIZ;
        LIZJ.getClass();
        if (LIZ.get()) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                C21147117pF.LJ.getClass();
                Integer numLIZJ = C740760T3y.LIZJ(str);
                if (numLIZJ != null && (interfaceC21138317npLIZIZ = C740760T3y.LIZIZ((iIntValue = numLIZJ.intValue()))) != null) {
                    arrayList.add(new C21147117pF(iIntValue, str, new C21138517nr(interfaceC21138317npLIZIZ)));
                }
            }
            if (!arrayList.isEmpty()) {
                C21146317p7.LIZIZ(null, null, arrayList);
            }
        }
    }

    public static final void LIZJ(Context context, int i) {
        InterfaceC21138317np interfaceC21138317npLIZIZ;
        if (LIZ.get()) {
            C21147117pF.LJ.getClass();
            String strLIZLLL = C740760T3y.LIZLLL(i);
            if (strLIZLLL != null && (interfaceC21138317npLIZIZ = C740760T3y.LIZIZ(i)) != null) {
                C21145617p0.LIZ.LIZJ.execute(C21146317p7.LIZ(context, new C21147117pF(i, strLIZLLL, new C21138517nr(interfaceC21138317npLIZIZ))));
            }
        }
    }

    public static final void LIZLLL(Context context, String str) {
        int iIntValue;
        InterfaceC21138317np interfaceC21138317npLIZIZ;
        if (LIZ.get()) {
            C21147117pF.LJ.getClass();
            Integer numLIZJ = C740760T3y.LIZJ(str);
            if (numLIZJ != null && (interfaceC21138317npLIZIZ = C740760T3y.LIZIZ((iIntValue = numLIZJ.intValue()))) != null) {
                C21145617p0.LIZ.LIZJ.execute(C21146317p7.LIZ(context, new C21147117pF(iIntValue, str, new C21138517nr(interfaceC21138317npLIZIZ))));
            }
        }
    }

    public static final void LJI(Context context, List<Integer> list) {
        LIZJ.getClass();
        LJ(null, context, list);
    }

    public static final View LIZ(Context context, int i, ViewGroup viewGroup) {
        boolean z;
        if (viewGroup != null) {
            z = true;
        } else {
            z = false;
        }
        return LIZIZ(context, i, viewGroup, z);
    }

    public static void LJ(String str, Context context, List list) {
        InterfaceC21138317np interfaceC21138317npLIZIZ;
        if (LIZ.get()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                C21147117pF.LJ.getClass();
                String strLIZLLL = C740760T3y.LIZLLL(iIntValue);
                if (strLIZLLL != null && (interfaceC21138317npLIZIZ = C740760T3y.LIZIZ(iIntValue)) != null) {
                    arrayList.add(new C21147117pF(iIntValue, strLIZLLL, new C21138517nr(interfaceC21138317npLIZIZ)));
                }
            }
            if (!arrayList.isEmpty()) {
                C21146317p7.LIZIZ(context, str, arrayList);
            }
        }
    }

    public static final void LJFF(Context context, String str, List list) {
        LIZJ.getClass();
        LJ(str, context, list);
    }

    public static final View LIZIZ(Context context, int i, ViewGroup viewGroup, boolean z) {
        int i2;
        Object c098200Yq;
        InterfaceC21146617pA interfaceC21146617pA;
        Configuration configuration;
        LIZJ.getClass();
        if (C21145417oy.LIZ(context) != null) {
            Resources resources = context.getResources();
            if (resources != null && (configuration = resources.getConfiguration()) != null) {
                i2 = configuration.orientation;
            } else {
                i2 = 1;
            }
            C21143517of c21143517of = new C21143517of();
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid orientation ");
                    sbLIZ.append(i2);
                    sbLIZ.append(", orientation must be ");
                    sbLIZ.append("ORIENTATION_UNDEFINED, ORIENTATION_PORTRAIT ");
                    sbLIZ.append("or ORIENTATION_LANDSCAPE.");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                c21143517of.LIZ = Integer.valueOf(i2);
            } else {
                c21143517of.LIZ = 1;
            }
            C21143417oe c21143417oe = new C21143417oe(c21143517of.LIZ);
            if (LIZ.get()) {
                for (AbstractC21144217om abstractC21144217om : (List) LIZIZ.getValue()) {
                    InterfaceC21138617ns interfaceC21138617nsLIZIZ = abstractC21144217om.LIZIZ(context, i, c21143417oe);
                    View view = null;
                    Object obj = null;
                    if (interfaceC21138617nsLIZIZ != null) {
                        String strLIZ = C740760T3y.LIZ(i);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            InterfaceC21146617pA interfaceC21146617pA2 = C21145617p0.LIZ.LIZLLL;
                            if (interfaceC21146617pA2 != null) {
                                abstractC21144217om.LIZ();
                                interfaceC21146617pA2.LJFF();
                            }
                            interfaceC21138617nsLIZIZ.LIZIZ(context);
                            c098200Yq = interfaceC21138617nsLIZIZ.LIZJ(context, viewGroup, z);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            InterfaceC21146617pA interfaceC21146617pA3 = C21145617p0.LIZ.LIZLLL;
                            if (interfaceC21146617pA3 != null) {
                                interfaceC21146617pA3.LJIILIIL(i, strLIZ, abstractC21144217om.LIZ(), jCurrentTimeMillis2);
                            }
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null && (interfaceC21146617pA = C21145617p0.LIZ.LIZLLL) != null) {
                            interfaceC21146617pA.LJIIJ(i, strLIZ, abstractC21144217om.LIZ(), thM5exceptionOrNullimpl);
                        }
                        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                            obj = c098200Yq;
                        }
                        view = (View) obj;
                    }
                    if (view != null) {
                        return view;
                    }
                }
            }
            return C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, z);
        }
        throw new IllegalArgumentException("context must be an Activity, or a ContextWrapper which holds an Activity, or an ActivityProvider which holds an Activity.");
    }
}
