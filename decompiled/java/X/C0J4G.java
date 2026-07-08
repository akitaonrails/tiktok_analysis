package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0J4G, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J4G implements LayoutInflater.Factory2 {
    public static final ConcurrentHashMap<String, Object> LLILLL = new ConcurrentHashMap<>();
    public LayoutInflater.Factory LL;
    public LayoutInflater.Factory2 LLILLJJLI;

    public C0J4G() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NxFactory2(mFactory=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mFactory2=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(LayoutInflater.Factory factory) {
        LayoutInflater.Factory factory2 = this.LL;
        if (factory2 == null) {
            this.LL = factory;
        } else {
            if (Intrinsics.LJFF(factory2, factory)) {
                return;
            }
            this.LL = new C0J4H(factory, null, this.LL, this.LLILLJJLI);
        }
    }

    public final void LIZIZ(LayoutInflater.Factory2 factory2) {
        if (this.LL == null) {
            this.LLILLJJLI = factory2;
            this.LL = factory2;
        } else {
            if (Intrinsics.LJFF(this.LLILLJJLI, factory2)) {
                return;
            }
            C0J4H c0j4h = new C0J4H(factory2, factory2, this.LL, this.LLILLJJLI);
            this.LLILLJJLI = c0j4h;
            this.LL = c0j4h;
        }
    }

    public C0J4G(LayoutInflater.Factory factory, LayoutInflater.Factory2 factory2) {
        this.LL = factory;
        this.LLILLJJLI = factory2;
    }

    public static View LIZJ(Context context, String str, AttributeSet attributeSet) throws NoSuchMethodException {
        ConcurrentHashMap<String, Object> concurrentHashMap = LLILLL;
        Object constructor = concurrentHashMap.get(str);
        if (constructor == null) {
            constructor = Class.forName(str).getConstructor(Context.class, AttributeSet.class);
            concurrentHashMap.put(str, constructor);
            if (constructor == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Constructor<*>");
            }
        }
        return (View) ((Constructor) constructor).newInstance(context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewLIZJ = null;
        try {
            LayoutInflater.Factory factory = this.LL;
            if (factory != null) {
                factory.onCreateView(str, context, attributeSet);
            }
            if (a0.LJJIZ(str, '.', 0, false, 6) != -1) {
                viewLIZJ = LIZJ(context, str, attributeSet);
            }
            if (viewLIZJ != null && (viewLIZJ instanceof TextView)) {
                NxResourceUtils.setTextViewText(context, attributeSet, str, (TextView) viewLIZJ);
                return viewLIZJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Intrinsics.LJIIJJI(th, "NxFactory layout error: ");
        }
        return viewLIZJ;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewLIZJ = null;
        try {
            LayoutInflater.Factory2 factory2 = this.LLILLJJLI;
            if (factory2 != null) {
                viewLIZJ = factory2.onCreateView(view, str, context, attributeSet);
            }
            if (viewLIZJ == null && a0.LJJIZ(str, '.', 0, false, 6) != -1) {
                viewLIZJ = LIZJ(context, str, attributeSet);
            }
            if (viewLIZJ != null && (viewLIZJ instanceof TextView)) {
                NxResourceUtils.setTextViewText(context, attributeSet, str, (TextView) viewLIZJ);
                return viewLIZJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NxReword/NxFactory2 NxFactory layout error: ");
            sbLIZ.append(th);
            sbLIZ.append(", context : ");
            sbLIZ.append(context);
            sbLIZ.append("  name : ");
            sbLIZ.append(str);
            sbLIZ.append("error: ");
            sbLIZ.append(th);
            sbLIZ.append("stack");
            sbLIZ.append(Log.getStackTraceString(th));
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("NxFactory layout error: ");
            sbLIZ2.append(th);
            sbLIZ2.append(", name: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", stack: ");
            sbLIZ2.append(Log.getStackTraceString(th));
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return viewLIZJ;
    }
}
