package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0J43, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J43 {
    public static final Field LIZ;

    static {
        try {
            Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
            LIZ = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
        }
    }

    public static void LIZIZ(LayoutInflater layoutInflater) {
        if (layoutInflater instanceof C0J4J) {
            return;
        }
        int i = 0;
        do {
            try {
                LayoutInflater.Factory2 factory2 = layoutInflater.getFactory2();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("layoutInflateLancet setNxFactory  factory2: ");
                sbLIZ.append(factory2);
                sbLIZ.append("layoutInflate:");
                sbLIZ.append(layoutInflater);
                C2188811AlT.LIZIZ(sbLIZ);
                if (factory2 == null) {
                    layoutInflater.setFactory2(new C0J4G());
                    return;
                }
                if (!(factory2 instanceof C0J4G)) {
                    C0J4G c0j4g = new C0J4G();
                    c0j4g.LIZIZ(factory2);
                    Field field = LIZ;
                    if (field != null) {
                        field.set(layoutInflater, c0j4g);
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("layoutInflateLancet setNxFactory  basefactory2: ");
                sbLIZ2.append(((C0J4G) factory2).LLILLJJLI);
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                PrintStream printStream = System.err;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("NxReword/inflateLancet");
                sbLIZ3.append(" layoutInflateLancet set factory2 failed");
                sbLIZ3.append(th.toString());
                printStream.println(C2188811AlT.LIZIZ(sbLIZ3));
                i++;
            }
        } while (i < 2);
    }

    public static LayoutInflater.Factory LIZ(LayoutInflater layoutInflater, boolean z) {
        LayoutInflater.Factory factory;
        if (z) {
            factory = layoutInflater.getFactory2();
        } else {
            factory = layoutInflater.getFactory();
        }
        if (factory == null) {
            return null;
        }
        try {
            if (factory instanceof C0J4G) {
                if (z) {
                    return ((C0J4G) factory).LLILLJJLI;
                }
                return ((C0J4G) factory).LL;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("nxReword layout inflate getBaseFactor : ");
            sbLIZ.append(layoutInflater);
            sbLIZ.append("  factory: ");
            sbLIZ.append(factory);
            C2188811AlT.LIZIZ(sbLIZ);
            return factory;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("NxReword/inflateLancet");
            sbLIZ2.append(th.toString());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
            th.toString();
            return factory;
        }
    }

    public static void LIZJ(View view, String str, Context context, AttributeSet attributeSet) {
        if (NxRewordManager.LJIILIIL && (view instanceof TextView)) {
            NxResourceUtils.setTextViewText(context, attributeSet, str, (TextView) view);
        }
    }
}
