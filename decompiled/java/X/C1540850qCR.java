package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.bytedance.hybrid.spark.SparkContext;
import com.google.gson.k;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS308S0000000_23;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qCR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540850qCR {
    public static final ConcurrentHashMap<String, C1540920qCY> LIZ = new ConcurrentHashMap<>();
    public static final AFwS308S0000000_23 LIZIZ = AFwS308S0000000_23.get$arr$(0);
    public static final C1541070qCn<C1540870qCT, C1540900qCW> LIZJ = new C1541070qCn<>("spark_pre_view", true, Long.MAX_VALUE, Long.MAX_VALUE, EnumC1533170q03.REMOVE_ON_CONSUME, true, -1, 35, (InterfaceC1541110qCr) new InterfaceC1541110qCr<C1540870qCT, C1540900qCW>() { // from class: X.0qCU
        @Override // X.InterfaceC1541110qCr
        public final /* bridge */ /* synthetic */ C1540870qCT LIZJ(k kVar, C08AB c08ab, Map map) {
            return null;
        }

        @Override // X.InterfaceC1541110qCr
        public final boolean LIZLLL(InterfaceC1541060qCm interfaceC1541060qCm, InterfaceC1541060qCm interfaceC1541060qCm2) {
            return true;
        }

        @Override // X.InterfaceC1541110qCr
        public final boolean LJI(C1541080qCo<C1540900qCW> c1541080qCo) {
            return true;
        }

        @Override // X.InterfaceC1541110qCr
        public final void LJII(InterfaceC1541060qCm interfaceC1541060qCm, C1541080qCo<C1540900qCW> c1541080qCo) {
        }

        @Override // X.InterfaceC1541110qCr
        public final void LIZ(C1541080qCo<C1540900qCW> c1541080qCo, String str) {
            C1540870qCT c1540870qCT;
            C1537070q6L c1537070q6L;
            InterfaceC1541060qCm interfaceC1541060qCm = c1541080qCo.LIZ.LIZLLL;
            if ((interfaceC1541060qCm instanceof C1540870qCT) && (c1540870qCT = (C1540870qCT) interfaceC1541060qCm) != null && (c1537070q6L = c1540870qCT.LJII) != null) {
                c1537070q6L.LIZJ(c1540870qCT.LIZLLL.LJIJI(), c1540870qCT.LIZ, new C1537080q6M(str));
            }
        }

        @Override // X.InterfaceC1541110qCr
        public final InterfaceC1541060qCm LJ(Object obj, boolean z) {
            C1540870qCT c1540870qCT = (C1540870qCT) obj;
            if (c1540870qCT.LJFF == null && c1540870qCT.LIZIZ() == null) {
                C1534380q20 c1534380q20 = C1541270qD7.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("rejected: no usable cache key in url=");
                sbLIZ.append(c1540870qCT.LIZLLL.LJIJI());
                c1534380q20.LIZIZ("SparkPreViewService", "generateIdentifier", C2188811AlT.LIZIZ(sbLIZ));
                C1537070q6L c1537070q6L = c1540870qCT.LJII;
                if (c1537070q6L != null) {
                    c1537070q6L.LIZJ(c1540870qCT.LIZLLL.LJIJI(), c1540870qCT.LIZ, new C1537080q6M("cannot get identifier for this"));
                }
                return null;
            }
            return c1540870qCT;
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0177 A[PHI: r1
          0x0177: PHI (r1v21 int) = (r1v20 int), (r1v35 int) binds: [B:54:0x00ee, B:58:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // X.InterfaceC1541110qCr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(X.InterfaceC1541060qCm r11, X.AbstractC1541140qCu<X.C1540900qCW> r12, X.EnumC1541150qCv r13) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 486
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1540880qCU.LIZIZ(X.0qCm, X.0qCu, X.0qCv):void");
        }

        @Override // X.InterfaceC1541110qCr
        public final AbstractC1541130qCt<?> LJIIIZ(InterfaceC1541060qCm interfaceC1541060qCm, C1541080qCo<C1540900qCW> c1541080qCo, AbstractC1541130qCt<?> abstractC1541130qCt) {
            return new C1540890qCV(c1541080qCo);
        }

        @Override // X.InterfaceC1541110qCr
        public final C1535940q4W LJFF(C1540870qCT c1540870qCT, InterfaceC1541060qCm interfaceC1541060qCm, C1535940q4W c1535940q4W) {
            return c1535940q4W;
        }

        @Override // X.InterfaceC1541110qCr
        public final /* bridge */ /* synthetic */ void LJIIIIZZ(InterfaceC1541240qD4 interfaceC1541240qD4, C08AB c08ab, C1541080qCo c1541080qCo) {
        }
    });

    public static String LIZLLL(String str) {
        if (str.length() == 0) {
            return "default_biz";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1540940qCa LJ(SparkContext sparkContext, String str, Context context, String str2, boolean z, Function2 function2) {
        C1535940q4W c1535940q4WLJ;
        C1540870qCT c1540870qCTLIZ = LIZ(str, str2, context, "preload", EnumC1540990qCf.FETCH_TRY, sparkContext, function2);
        C259800zU c259800zU = new C259800zU();
        C1541070qCn<C1540870qCT, C1540900qCW> c1541070qCn = LIZJ;
        if (z) {
            c1535940q4WLJ = c1541070qCn.LJ();
            c1535940q4WLJ.LIZJ = 0L;
            c1535940q4WLJ.LJ = EnumC1533170q03.KEEP_ALIVE;
        } else {
            c1535940q4WLJ = null;
        }
        C1541080qCo c1541080qCoLIZIZ = C1541070qCn.LIZIZ(c1541070qCn, c1540870qCTLIZ, "preload", c1535940q4WLJ, new AwS602S0100000_23(c259800zU, (C259800zU<C1540900qCW>) 15), 4);
        if (c1541080qCoLIZIZ != null) {
            c1541080qCoLIZIZ.execute();
        }
        C1540900qCW c1540900qCW = (C1540900qCW) c259800zU.element;
        if (c1540900qCW == null) {
            return null;
        }
        return c1540900qCW.LIZ;
    }

    public static C1540870qCT LIZ(String str, String str2, Context context, String str3, EnumC1540990qCf enumC1540990qCf, SparkContext sparkContext, Function2 function2) {
        Function2 function22 = function2;
        Context contextLIZ = context;
        String strLIZLLL = LIZLLL(str);
        C1540920qCY c1540920qCY = LIZ.get(strLIZLLL);
        if (contextLIZ == null && (contextLIZ = C01CR.LIZ()) == null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            contextLIZ = C1161970gLL.LIZIZ().LIZJ();
        }
        if (function22 == null) {
            if (c1540920qCY != null) {
                function22 = c1540920qCY.LJI;
            } else {
                function22 = null;
            }
        }
        C1540870qCT c1540870qCT = new C1540870qCT(strLIZLLL, contextLIZ, enumC1540990qCf, sparkContext, false, str2, false, null, null, function22);
        if (Intrinsics.LJFF(str3, "preload")) {
            c1540870qCT.LJIIJ = true;
        }
        return c1540870qCT;
    }

    public static void LIZIZ(SparkContext sparkContext, String str, Context context, String str2, Boolean bool, Long l, Boolean bool2, Integer num, Boolean bool3, C1537070q6L c1537070q6L, InterfaceC1631620sYq interfaceC1631620sYq, Function2 function2, Function1 function1) {
        boolean zBooleanValue;
        Boolean boolValueOf;
        boolean zBooleanValue2;
        Boolean boolValueOf2;
        boolean z;
        long jLongValue;
        Long lValueOf;
        int iIntValue;
        Integer numValueOf;
        AwS602S0100000_23 awS602S0100000_23;
        InterfaceC1631620sYq interfaceC1631620sYq2 = interfaceC1631620sYq;
        Boolean boolValueOf3 = bool;
        Function2 function22 = function2;
        Context mutableContextWrapper = context;
        String strLIZLLL = LIZLLL(str);
        C1540920qCY c1540920qCY = LIZ.get(strLIZLLL);
        InterfaceC1532860pzY.LIZ.getClass();
        InterfaceC1532860pzY interfaceC1532860pzY = C1532910pzd.LIZJ;
        if (interfaceC1532860pzY != null && interfaceC1532860pzY.LJIIIIZZ()) {
            sparkContext.LJJJLZIJ(EnumC665490Q8l.MOST_ON_TASM.id(), "thread_strategy");
        }
        if (mutableContextWrapper == null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            mutableContextWrapper = new MutableContextWrapper(C1161970gLL.LIZIZ().LIZJ());
        }
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else if (c1540920qCY != null && (boolValueOf = Boolean.valueOf(c1540920qCY.LIZJ)) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (bool3 != null) {
            zBooleanValue2 = bool3.booleanValue();
        } else if (c1540920qCY != null && (boolValueOf2 = Boolean.valueOf(c1540920qCY.LIZLLL)) != null) {
            zBooleanValue2 = boolValueOf2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        boolean zLJFF = Intrinsics.LJFF("preload", "preload");
        EnumC1540990qCf enumC1540990qCf = EnumC1540990qCf.PRE_LAYOUT;
        if (!zBooleanValue2 && !zLJFF) {
            z = false;
        } else {
            z = true;
        }
        if (interfaceC1631620sYq2 == null) {
            if (c1540920qCY != null) {
                interfaceC1631620sYq2 = c1540920qCY.LJII;
            } else {
                interfaceC1631620sYq2 = null;
            }
        }
        if (function22 == null) {
            if (c1540920qCY != null) {
                function22 = c1540920qCY.LJI;
            } else {
                function22 = null;
            }
        }
        C1540870qCT c1540870qCT = new C1540870qCT(strLIZLLL, mutableContextWrapper, enumC1540990qCf, sparkContext, zBooleanValue, str2, z, c1537070q6L, interfaceC1631620sYq2, function22);
        c1540870qCT.LJIIJ = zLJFF;
        C1541070qCn<C1540870qCT, C1540900qCW> c1541070qCn = LIZJ;
        C1535940q4W c1535940q4WLJ = c1541070qCn.LJ();
        if (l != null) {
            jLongValue = l.longValue();
        } else if (c1540920qCY != null && (lValueOf = Long.valueOf(c1540920qCY.LJ)) != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = Long.MAX_VALUE;
        }
        c1535940q4WLJ.LIZJ = jLongValue;
        if (boolValueOf3 == null) {
            if (c1540920qCY != null) {
                boolValueOf3 = Boolean.valueOf(c1540920qCY.LIZIZ);
            } else {
                boolValueOf3 = null;
            }
        }
        if (Intrinsics.LJFF(boolValueOf3, Boolean.TRUE)) {
            c1535940q4WLJ.LJ = EnumC1533170q03.KEEP_ALIVE;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else if (c1540920qCY != null && (numValueOf = Integer.valueOf(c1540920qCY.LJFF)) != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 5;
        }
        c1535940q4WLJ.LJFF = iIntValue;
        if (function1 != null) {
            awS602S0100000_23 = new AwS602S0100000_23(function1, (Function1<? super InterfaceC1540940qCa, Unit>) 17);
        } else {
            awS602S0100000_23 = null;
        }
        c1541070qCn.LJFF(c1540870qCT, "preload", c1535940q4WLJ, awS602S0100000_23);
    }
}
