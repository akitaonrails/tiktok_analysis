package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q7Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537820q7Y {
    public static void LJII() {
        C1538340q8O c1538340q8O = C1538340q8O.LIZ;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZ()) {
            C1538340q8O.LIZIZ();
        } else {
            synchronized (c1538340q8O) {
                C1538340q8O.LIZ(null);
            }
        }
    }

    public static void LJIIIIZZ() {
        synchronized (C1537410q6t.LJIIJJI) {
            try {
                LJII();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZ()) {
            LJIIIIZZ();
        } else {
            synchronized (this) {
                LJII();
            }
        }
    }

    public static Activity LIZLLL() {
        return C01CR.LIZ();
    }

    public static void LJFF(C1537480q70 c1537480q70) {
        synchronized (C1537410q6t.LJIIJJI) {
            try {
                C1536660q5g.LIZ.LIZLLL(c1537480q70);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(C1537480q70 c1537480q70) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZ()) {
            LJFF(c1537480q70);
        } else {
            synchronized (this) {
                C1536660q5g.LIZ.LIZLLL(c1537480q70);
            }
        }
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        C1536660q5g.LIZ.getClass();
        C1529870puj.LIZ.getClass();
        Iterator it2 = ((LinkedHashMap) C1529870puj.LIZJ()).entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) ((Reference) ((Map.Entry) it2.next()).getValue()).get();
            if (interfaceC1541990qEH != null) {
                interfaceC1541990qEH.LIZ(str, jSONObject);
            }
        }
    }

    public static void LJIIIZ(C1529370ptv c1529370ptv, Application application) {
        C1529360ptu.LIZIZ = c1529370ptv;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1537410q6t c1537410q6tLIZIZ = C1161970gLL.LIZIZ();
        c1537410q6tLIZIZ.LIZLLL = c1529370ptv.LIZ;
        c1537410q6tLIZIZ.LJ = c1529370ptv.LIZJ;
        c1537410q6tLIZIZ.LJFF = c1529370ptv.LJ;
        c1537410q6tLIZIZ.LIZIZ = application;
        c1537410q6tLIZIZ.LJII = c1529370ptv.LIZIZ;
        c1537410q6tLIZIZ.LJFF = c1529370ptv.LJ;
        c1537410q6tLIZIZ.LIZ = c1529370ptv.LIZ.isDebug();
        C587540N2q.LIZLLL = C1161970gLL.LIZIZ().LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1541990qEH LIZIZ(HybridSchemaParam hybridSchemaParam, final C1537480q70 c1537480q70, final Context context, AbstractC1537870q7d abstractC1537870q7d) {
        EnumC1067640dtC type;
        String strName;
        HybridSchemaParam hybridSchemaParamLIZJ;
        Function1<? super C1537480q70, Unit> function1;
        C1537810q7X c1537810q7XLIZLLL = C1537540q76.LIZLLL(c1537480q70);
        String lowerCase = null;
        long jLIZJ = C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PLUGIN_EXECUTE_START, EnumC1537220q6a.START, EnumC1537220q6a.OPEN_TIME}, null);
        c1537810q7XLIZLLL.LIZ = Long.valueOf(jLIZJ);
        c1537810q7XLIZLLL.LJIIJJI = Long.valueOf(jLIZJ);
        C1536660q5g.LIZ.LIZ();
        if (!c1537480q70.hasTraversePlugin && (function1 = C1538260q8G.LIZLLL) != null) {
            function1.invoke(c1537480q70);
        }
        c1537810q7XLIZLLL.LJIIL = Long.valueOf(C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PLUGIN_EXECUTE_END}, null));
        C086F c086f = C086F.LIZ;
        Runnable runnable = new Runnable() { // from class: X.0R1V
            public final void LIZ() {
                InterfaceC497601wk interfaceC497601wkLIZ = C1064790dob.LIZ(context, c1537480q70);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(interfaceC497601wkLIZ, c1dfh, null, new C0R1T(c1537480q70, null), 2);
                C23250099c.LIZLLL(C1064790dob.LIZ(context, c1537480q70), c1dfh, null, new C0R1U(c1537480q70, null), 2);
                C23250099c.LIZLLL(C1064790dob.LIZ(context, c1537480q70), c1dfh, null, new C1075400e5i(c1537480q70, null), 2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("HybridKit$Companion@c399.createLiteKitView$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("HybridKit$Companion@c399.createLiteKitView$1");
            }
        };
        c086f.getClass();
        C086F.LJII(runnable);
        c1537480q70.LJJ(AbstractC1539010q9T.class, new C1538560q8k());
        InterfaceC1057870ddR interfaceC1057870ddR = (InterfaceC1057870ddR) c1537480q70.LJFF(InterfaceC1057870ddR.class);
        AbstractC1539010q9T abstractC1539010q9T = (AbstractC1539010q9T) c1537480q70.LJFF(AbstractC1539010q9T.class);
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if (interfaceC1531560pxS != null) {
            if (interfaceC1057870ddR != null) {
                interfaceC1057870ddR.LJJJLL(interfaceC1531560pxS);
            }
            if (abstractC1539010q9T != null) {
                do {
                    abstractC1539010q9T.LJJJLL(interfaceC1531560pxS);
                    T t = abstractC1539010q9T.LL;
                    if (t == 0 || !(t instanceof AbstractC1539010q9T)) {
                        break;
                    }
                    abstractC1539010q9T = (AbstractC1539010q9T) t;
                } while (abstractC1539010q9T != null);
            }
        }
        C1536660q5g.LIZ.getClass();
        C1537730q7P c1537730q7P = C1536660q5g.LIZJ;
        InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
        if (interfaceC1531560pxS2 != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS2.LIZJ()) != null) {
            hybridSchemaParam = hybridSchemaParamLIZJ;
        }
        InterfaceC1541990qEH interfaceC1541990qEHLIZ = c1537730q7P.LIZ(hybridSchemaParam, c1537480q70, context, abstractC1537870q7d);
        View view = (View) interfaceC1541990qEHLIZ;
        C1514810pWR c1514810pWRLJIIIZ = c1537480q70.LJIIIZ();
        if (view == null) {
            view = null;
        }
        InterfaceC1531560pxS interfaceC1531560pxS3 = c1537480q70.hybridParams;
        if (interfaceC1531560pxS3 != null && (type = interfaceC1531560pxS3.getType()) != null && (strName = type.name()) != null) {
            lowerCase = strName.toLowerCase(Locale.ROOT);
        }
        c1514810pWRLJIIIZ.LIZIZ(view, lowerCase);
        c1537480q70.lifecycleState = Lifecycle.State.CREATED;
        return interfaceC1541990qEHLIZ;
    }

    public static C1540540qBw LIZJ(SparkSchemaParam sparkSchemaParam, SparkContext sparkContext, Context context, C678360QjC c678360QjC) {
        C1538260q8G.LIZJ.getClass();
        C1529790pub c1529790pub = c678360QjC.LIZIZ;
        C1537830q7Z c1537830q7Z = new C1537830q7Z(UriProtector.parse(sparkSchemaParam.getScriptUrl()), sparkContext);
        c1537830q7Z.LJJIIJ = sparkSchemaParam;
        sparkContext.hybridParams = c1537830q7Z;
        return new C1540540qBw(sparkContext, context, c1529790pub, c678360QjC.LIZJ);
    }
}
